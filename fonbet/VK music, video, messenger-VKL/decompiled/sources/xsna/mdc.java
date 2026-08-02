package xsna;

import android.animation.ValueAnimator;
import xsna.odc;

/* compiled from: CircularProgressDrawable.java */
/* loaded from: classes12.dex */
public final class mdc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ odc.a b;
    public final /* synthetic */ odc c;

    public mdc(odc odcVar, odc.a aVar) {
        this.c = odcVar;
        this.b = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        odc.a aVar = this.b;
        odc.i(floatValue, aVar);
        odc odcVar = this.c;
        odcVar.a(floatValue, aVar, false);
        odcVar.invalidateSelf();
    }
}
