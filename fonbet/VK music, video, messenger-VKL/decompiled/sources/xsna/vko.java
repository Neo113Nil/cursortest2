package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.models.videotracker.RewindType;
import com.vk.stories.design.view.viewer.LineProgress;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DrawableWithAnimatedVisibilityChange.java */
/* loaded from: classes13.dex */
public final class vko extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vko(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        LineProgress progressView;
        switch (this.b) {
            case 1:
                f0q0 f0q0Var = (f0q0) this.c;
                q7r q7rVar = f0q0Var.a;
                q7r q7rVar2 = f0q0Var.a;
                xjt0 xjt0Var = q7rVar.o;
                if (xjt0Var != null && q7rVar.v != null) {
                    q7rVar.i0.removeView(xjt0Var);
                    System.currentTimeMillis();
                    q7rVar2.getClass();
                    xjt0 xjt0Var2 = q7rVar2.o;
                    float selectedPercent = (xjt0Var2 == null || (progressView = xjt0Var2.getProgressView()) == null) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : progressView.getSelectedPercent();
                    if (q7rVar2.n != null) {
                        xaj0 xaj0Var = q7rVar2.v;
                        int currentPosition = (int) ((xaj0Var != null ? xaj0Var.getCurrentPosition() : 0L) / 1000);
                        rlt0 rlt0Var = q7rVar2.n;
                        if (rlt0Var != null) {
                            rlt0Var.l(currentPosition, (int) ((q7rVar2.v != null ? r6.getDuration() : 0L) * selectedPercent), RewindType.SLIDER);
                        }
                    }
                    f0q0Var.c.c();
                    xaj0 xaj0Var2 = q7rVar2.v;
                    if (xaj0Var2 != null) {
                        xaj0Var2.b((long) (selectedPercent * xaj0Var2.getDuration()));
                    }
                    q7rVar2.o = null;
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.b) {
            case 0:
                super.onAnimationStart(animator);
                xko xkoVar = (xko) this.c;
                ArrayList arrayList = xkoVar.g;
                if (arrayList != null && !xkoVar.h) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((lf2) it.next()).b(xkoVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
