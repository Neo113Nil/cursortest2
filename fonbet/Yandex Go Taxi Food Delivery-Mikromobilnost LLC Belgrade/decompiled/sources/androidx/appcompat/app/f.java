package androidx.appcompat.app;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes10.dex */
public final class f implements Runnable {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public f(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.a = appCompatDelegateImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppCompatDelegateImpl appCompatDelegateImpl = this.a;
        appCompatDelegateImpl.mActionModePopup.showAtLocation(appCompatDelegateImpl.mActionModeView, 55, 0, 0);
        appCompatDelegateImpl.endOnGoingFadeAnimation();
        boolean shouldAnimateActionModeView = appCompatDelegateImpl.shouldAnimateActionModeView();
        ActionBarContextView actionBarContextView = appCompatDelegateImpl.mActionModeView;
        if (!shouldAnimateActionModeView) {
            actionBarContextView.setAlpha(1.0f);
            appCompatDelegateImpl.mActionModeView.setVisibility(0);
            return;
        }
        actionBarContextView.setAlpha(0.0f);
        androidx.core.view.d c = androidx.core.view.b.c(appCompatDelegateImpl.mActionModeView);
        c.a(1.0f);
        appCompatDelegateImpl.mFadeAnim = c;
        c.d(new e(0, this));
    }
}
