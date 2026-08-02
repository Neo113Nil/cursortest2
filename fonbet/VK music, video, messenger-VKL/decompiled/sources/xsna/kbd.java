package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.clips.tool.view.component.video.ClipProgressIndicator;
import com.vk.stickers.views.particles.ParticleView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kbd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ kbd(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        View view = this.c;
        switch (i) {
            case 0:
                ClipProgressIndicator clipProgressIndicator = (ClipProgressIndicator) view;
                int i2 = ClipProgressIndicator.B;
                clipProgressIndicator.getClass();
                clipProgressIndicator.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                clipProgressIndicator.invalidate();
                break;
            default:
                ParticleView.a((ParticleView) view);
                break;
        }
    }
}
