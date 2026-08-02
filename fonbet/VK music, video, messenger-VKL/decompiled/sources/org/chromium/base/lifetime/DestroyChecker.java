package org.chromium.base.lifetime;

/* loaded from: classes8.dex */
public class DestroyChecker implements Destroyable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private boolean mIsDestroyed;

    @Override // org.chromium.base.lifetime.Destroyable
    public void destroy() {
        checkNotDestroyed();
        this.mIsDestroyed = true;
    }

    public boolean isDestroyed() {
        return this.mIsDestroyed;
    }

    public void checkNotDestroyed() {
    }
}
