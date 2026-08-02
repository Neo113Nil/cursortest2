package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vkontakte.android.R;
import java.util.Iterator;
import xsna.irb;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class frb implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ frb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                irb.b bVar = (irb.b) this.c;
                if (bVar != null) {
                    bVar.c.setAlpha((int) ((1.0f - valueAnimator.getAnimatedFraction()) * 178.5f));
                    break;
                }
                break;
            case 1:
                com.vk.attachpicker.a aVar = (com.vk.attachpicker.a) this.c;
                aVar.k = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = aVar.j.iterator();
                while (it.hasNext()) {
                    ((izs) it.next()).invoke(Float.valueOf(aVar.k));
                }
                break;
            case 2:
                ((View) this.c).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                d0w0 d0w0Var = (d0w0) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                com.vk.libvideo.design.view.swipe.layout.a aVar2 = d0w0Var.d;
                View view = d0w0Var.b;
                awt0.x(aVar2, 0, 0, bwt0.y(R.dimen.video_right_promo_container_width, view) - ((int) floatValue), 0, 11);
                view.setTranslationX(floatValue);
                break;
        }
    }
}
