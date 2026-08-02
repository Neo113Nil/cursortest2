package org.chromium.base.lifetime;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.chromium.base.task.PostTask;

/* loaded from: classes8.dex */
public class LifetimeAssert {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static TestHook sTestHook;
    private final Object mTarget;
    final WrappedReference mWrapper;

    public static class CreationException extends RuntimeException {
        public CreationException() {
            super("vvv This is where object was created. vvv");
        }
    }

    public static class LifetimeAssertException extends RuntimeException {
        public LifetimeAssertException(String str, Throwable th) {
            super(str, th);
        }
    }

    public interface TestHook {
        void onCleaned(WrappedReference wrappedReference, String str);
    }

    public static class WrappedReference extends PhantomReference<Object> {
        final CreationException mCreationException;
        boolean mSafeToGc;
        final Class<?> mTargetClass;
        private static final ReferenceQueue<Object> sReferenceQueue = new ReferenceQueue<>();
        private static final Set<WrappedReference> sActiveWrappers = Collections.synchronizedSet(new HashSet());

        static {
            new Thread("GcStateAssertQueue") { // from class: org.chromium.base.lifetime.LifetimeAssert.WrappedReference.1
                {
                    setDaemon(true);
                    start();
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    while (true) {
                        try {
                            WrappedReference wrappedReference = (WrappedReference) WrappedReference.sReferenceQueue.remove();
                            if (WrappedReference.sActiveWrappers.remove(wrappedReference)) {
                                if (wrappedReference.mSafeToGc) {
                                    TestHook testHook = LifetimeAssert.sTestHook;
                                    if (testHook != null) {
                                        testHook.onCleaned(wrappedReference, null);
                                    }
                                } else {
                                    String str = "Object of type " + wrappedReference.mTargetClass.getName() + " was GC'ed without cleanup. Refer to \"Caused by\" for where object was created.";
                                    TestHook testHook2 = LifetimeAssert.sTestHook;
                                    if (testHook2 == null) {
                                        throw new LifetimeAssertException(str, wrappedReference.mCreationException);
                                    }
                                    testHook2.onCleaned(wrappedReference, str);
                                }
                            }
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            };
        }

        private WrappedReference(Object obj, CreationException creationException, boolean z) {
            super(obj, sReferenceQueue);
            this.mCreationException = (CreationException) PostTask.maybeAddTaskOrigin(creationException);
            this.mSafeToGc = z;
            this.mTargetClass = obj.getClass();
            sActiveWrappers.add(this);
        }
    }

    private LifetimeAssert(WrappedReference wrappedReference, Object obj) {
        this.mWrapper = wrappedReference;
        this.mTarget = obj;
    }

    public static LifetimeAssert create(Object obj) {
        return null;
    }

    public static void destroy(LifetimeAssert lifetimeAssert) {
        assertNotDestroyed(lifetimeAssert);
        setSafeToGc(lifetimeAssert, true);
    }

    public static LifetimeAssert create(Object obj, boolean z) {
        return null;
    }

    public static void assertAllInstancesDestroyedForTesting() {
    }

    public static void resetForTesting() {
    }

    public static void assertNotDestroyed(LifetimeAssert lifetimeAssert) {
    }

    public static void setSafeToGc(LifetimeAssert lifetimeAssert, boolean z) {
    }
}
