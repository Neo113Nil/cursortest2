package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.crop.CropImageView;
import com.vk.libvideo.design.view.duration.DurationView;

/* compiled from: CropImageView.java */
/* loaded from: classes17.dex */
public final class ohk extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ ViewGroup c;

    public /* synthetic */ ohk(ViewGroup viewGroup, int i) {
        this.b = i;
        this.c = viewGroup;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.b) {
            case 0:
                onAnimationEnd(animator);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        FrameLayout frameLayout;
        switch (this.b) {
            case 0:
                CropImageView cropImageView = (CropImageView) this.c;
                cropImageView.e.d(true);
                cropImageView.c(true, true, true);
                break;
            case 1:
                DurationView durationView = (DurationView) this.c;
                if (!durationView.getStateShowIconWrap() && (frameLayout = durationView.d) != null) {
                    frameLayout.setVisibility(8);
                }
                durationView.setAnimationResize(null);
                break;
            default:
                q8u0 q8u0Var = (q8u0) this.c;
                q8u0Var.e.setColor(ro.c(q8u0Var.f, null));
                break;
        }
    }
}
