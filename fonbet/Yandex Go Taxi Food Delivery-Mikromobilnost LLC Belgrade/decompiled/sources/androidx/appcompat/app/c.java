package androidx.appcompat.app;

/* loaded from: classes.dex */
public final class c implements Runnable {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public c(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        if ((appCompatDelegateImpl.mInvalidatePanelMenuFeatures & 1) != 0) {
            appCompatDelegateImpl.doInvalidatePanelMenu(0);
        }
        if ((appCompatDelegateImpl.mInvalidatePanelMenuFeatures & 4096) != 0) {
            appCompatDelegateImpl.doInvalidatePanelMenu(108);
        }
        appCompatDelegateImpl.mInvalidatePanelMenuPosted = false;
        appCompatDelegateImpl.mInvalidatePanelMenuFeatures = 0;
    }
}
