package org.chromium.base.supplier;

import org.chromium.base.UnownedUserData;
import org.chromium.base.UnownedUserDataHost;
import org.chromium.base.UnownedUserDataKey;
import org.chromium.base.lifetime.DestroyChecker;
import org.chromium.base.lifetime.Destroyable;

/* loaded from: classes8.dex */
public abstract class UnownedUserDataSupplier<E> extends ObservableSupplierImpl<E> implements Destroyable, UnownedUserData {
    private final DestroyChecker mDestroyChecker = new DestroyChecker();
    private final UnownedUserDataKey<UnownedUserDataSupplier<E>> mUudKey;

    /* JADX WARN: Multi-variable type inference failed */
    public UnownedUserDataSupplier(UnownedUserDataKey<? extends UnownedUserDataSupplier<E>> unownedUserDataKey) {
        this.mUudKey = unownedUserDataKey;
    }

    public void attach(UnownedUserDataHost unownedUserDataHost) {
        this.mDestroyChecker.checkNotDestroyed();
        this.mUudKey.attachToHost(unownedUserDataHost, this);
    }

    @Override // org.chromium.base.lifetime.Destroyable
    public void destroy() {
        this.mDestroyChecker.destroy();
        this.mUudKey.detachFromAllHosts(this);
    }
}
