package org.chromium.base;

import internal.org.jni_zero.CalledByNative;
import org.chromium.base.lifetime.LifetimeAssert;

/* loaded from: classes8.dex */
final class JniCallbackImpl<T> implements JniOnceCallback<T>, JniOnceRunnable, JniRepeatingCallback<T>, JniRepeatingRunnable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final boolean mIsRepeating;
    private final LifetimeAssert mLifetimeAssert = LifetimeAssert.create(this);
    private long mNativePointer;

    public interface Natives {
        void destroy(boolean z, long j);

        void onResult(boolean z, long j, Object obj);
    }

    @CalledByNative
    private JniCallbackImpl(boolean z, long j) {
        this.mIsRepeating = z;
        this.mNativePointer = j;
    }

    @Override // org.chromium.base.lifetime.Destroyable
    public void destroy() {
        if (this.mNativePointer != 0) {
            JniCallbackImplJni.get().destroy(this.mIsRepeating, this.mNativePointer);
            this.mNativePointer = 0L;
            LifetimeAssert.destroy(this.mLifetimeAssert);
        }
    }

    @Override // org.chromium.base.Callback
    /* renamed from: onResult */
    public void lambda$bind$0(T t) {
        JniCallbackImplJni.get().onResult(this.mIsRepeating, this.mNativePointer, t);
        if (this.mIsRepeating) {
            return;
        }
        this.mNativePointer = 0L;
        LifetimeAssert.destroy(this.mLifetimeAssert);
    }

    @Override // java.lang.Runnable
    public void run() {
        lambda$bind$0(null);
    }
}
