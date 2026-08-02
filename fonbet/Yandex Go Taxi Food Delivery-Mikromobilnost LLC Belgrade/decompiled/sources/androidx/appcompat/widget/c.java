package androidx.appcompat.widget;

/* loaded from: classes10.dex */
public final class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.a = i;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        switch (i) {
            case 0:
                actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(0.0f).setListener(actionBarOverlayLayout.mTopAnimatorListener);
                break;
            default:
                actionBarOverlayLayout.haltActionBarHideOffsetAnimations();
                actionBarOverlayLayout.mCurrentActionBarTopAnimator = actionBarOverlayLayout.mActionBarTop.animate().translationY(-actionBarOverlayLayout.mActionBarTop.getHeight()).setListener(actionBarOverlayLayout.mTopAnimatorListener);
                break;
        }
    }
}
