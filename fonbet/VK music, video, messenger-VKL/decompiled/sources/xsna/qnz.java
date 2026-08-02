package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.media.player.video.view.SimpleVideoView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qnz implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qnz(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        long j = this.c;
        Object obj = this.d;
        switch (i) {
            case 0:
                ((nnz) obj).b.B0(j);
                break;
            case 1:
                SimpleVideoView.i((SimpleVideoView) obj, j);
                break;
            default:
                tnp0 tnp0Var = (tnp0) obj;
                View view = tnp0Var.a;
                boolean[] zArr = tnp0Var.j;
                if (tnp0Var.h) {
                    tnp0Var.h = false;
                    int length = zArr.length;
                    ViewParent parent = view.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    for (int i2 = 0; viewGroup != null && i2 < length; i2++) {
                        zArr[i2] = viewGroup.getClipChildren();
                        s3q0 s3q0Var = s3q0.a;
                        ViewParent parent2 = viewGroup.getParent();
                        viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                    }
                    tnp0Var.k = true;
                    View view2 = tnp0Var.a;
                    int length2 = zArr.length;
                    ViewParent parent3 = view2.getParent();
                    ViewGroup viewGroup2 = parent3 instanceof ViewGroup ? (ViewGroup) parent3 : null;
                    for (int i3 = 0; viewGroup2 != null && i3 < length2; i3++) {
                        viewGroup2.setClipChildren(true);
                        s3q0 s3q0Var2 = s3q0.a;
                        ViewParent parent4 = viewGroup2.getParent();
                        viewGroup2 = parent4 instanceof ViewGroup ? (ViewGroup) parent4 : null;
                    }
                    tnp0Var.a();
                    ViewPropertyAnimator viewPropertyAnimator = tnp0Var.i;
                    if (viewPropertyAnimator != null) {
                        j = 0;
                    }
                    float translationY = viewPropertyAnimator != null ? view.getTranslationY() : -view.getMeasuredHeight();
                    view.setVisibility(0);
                    view.setTranslationY(translationY);
                    ViewPropertyAnimator translationY2 = view.animate().setStartDelay(j).setInterpolator(tnp0Var.b).setDuration(tnp0Var.d).withEndAction(new sc4(tnp0Var, 15)).translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    translationY2.start();
                    tnp0Var.g = translationY2;
                    break;
                }
                break;
        }
    }
}
