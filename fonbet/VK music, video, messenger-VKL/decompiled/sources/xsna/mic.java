package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Activity;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes13.dex */
public final class mic extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mic(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                ((nic) this.c).b.h(false);
                break;
            case 1:
                ((ic3) this.c).run();
                break;
            default:
                com.vk.attachpicker.screen.p pVar = (com.vk.attachpicker.screen.p) this.c;
                pVar.w = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                Activity activity = pVar.k;
                if (activity != null) {
                    pVar.j.b(activity);
                    break;
                }
                break;
        }
    }
}
