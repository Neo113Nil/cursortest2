package com.yandex.quark.utils.jni;

import defpackage.kds0;
import defpackage.yow;
import defpackage.zy11;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0002\u0014\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/yandex/quark/utils/jni/IoCleaner;", "", "<init>", "()V", "Lzy11;", "ensureWorking", "work", "obj", "Ljava/lang/Runnable;", "cleanAction", "Lcom/yandex/quark/utils/jni/Cleanable;", "add", "(Ljava/lang/Object;Ljava/lang/Runnable;)Lcom/yandex/quark/utils/jni/Cleanable;", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Companion", "CleanableImpl", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IoCleaner {
    public static final String TAG = "IOCleaner";
    private final ReferenceQueue<Object> referenceQueue = new ReferenceQueue<>();
    private final AtomicBoolean started = new AtomicBoolean(false);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final IoCleaner instance = new IoCleaner();

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B%\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/yandex/quark/utils/jni/IoCleaner$CleanableImpl;", "Ljava/lang/ref/PhantomReference;", "", "Lcom/yandex/quark/utils/jni/Cleanable;", "referent", "Ljava/lang/Runnable;", "cleanAction", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Ljava/lang/Object;Ljava/lang/Runnable;Ljava/lang/ref/ReferenceQueue;)V", "Lzy11;", "clean", "()V", "Ljava/lang/Runnable;", "", "executed", "Z", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CleanableImpl extends PhantomReference<Object> implements Cleanable {
        private final Runnable cleanAction;
        private boolean executed;

        public CleanableImpl(Object obj, Runnable runnable, ReferenceQueue<Object> referenceQueue) {
            super(obj, referenceQueue);
            this.cleanAction = runnable;
        }

        @Override // com.yandex.quark.utils.jni.Cleanable
        public void clean() {
            synchronized (this) {
                if (!this.executed) {
                    this.executed = true;
                    this.cleanAction.run();
                }
            }
        }
    }

    private final void ensureWorking() {
        if (this.started.compareAndSet(false, true)) {
            kds0 kds0Var = new kds0(2, new yow(5, this), false);
            kds0Var.setDaemon(true);
            kds0Var.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 ensureWorking$lambda$0(IoCleaner ioCleaner) {
        ioCleaner.work();
        return zy11.a;
    }

    public static final Cleanable register(Object obj, Runnable runnable) {
        return INSTANCE.register(obj, runnable);
    }

    private final void work() {
        while (true) {
            try {
                ((Cleanable) this.referenceQueue.remove()).clean();
            } catch (Throwable unused) {
            }
        }
    }

    public final Cleanable add(Object obj, Runnable cleanAction) {
        CleanableImpl cleanableImpl = new CleanableImpl(obj, cleanAction, this.referenceQueue);
        ensureWorking();
        return cleanableImpl;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/yandex/quark/utils/jni/IoCleaner$Companion;", "", "<init>", "()V", "instance", "Lcom/yandex/quark/utils/jni/IoCleaner;", "TAG", "", "register", "Lcom/yandex/quark/utils/jni/Cleanable;", "obj", "cleanAction", "Ljava/lang/Runnable;", "quark-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Cleanable register(Object obj, Runnable cleanAction) {
            return IoCleaner.instance.add(obj, cleanAction);
        }

        private Companion() {
        }
    }
}
