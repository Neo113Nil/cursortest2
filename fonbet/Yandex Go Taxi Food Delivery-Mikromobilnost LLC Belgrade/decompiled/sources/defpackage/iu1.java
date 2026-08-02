package defpackage;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import flex.animation.generic.internal.ExtensionsKt$createOnEndAnimatorListener$1;
import flex.animation.player.interpolator.InterpolationType;

/* loaded from: classes4.dex */
public final class iu1 implements xh2 {
    public final myu0 a;
    public final iuw b;
    public ObjectAnimator c;

    public iu1(myu0 myu0Var) {
        iuw iuwVar = new iuw();
        this.a = myu0Var;
        this.b = iuwVar;
    }

    @Override // defpackage.xh2
    public final /* bridge */ /* synthetic */ void a(tg2 tg2Var, ryh ryhVar, o530 o530Var) {
        b((gu1) tg2Var, ryhVar);
    }

    public final void b(gu1 gu1Var, ryh ryhVar) {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        kyu0 a = this.a.a();
        View r = ryhVar.r();
        Property property = View.ALPHA;
        lu1 lu1Var = gu1Var.e;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(r, (Property<View, Float>) property, lu1Var.a, lu1Var.b);
        ofFloat.setStartDelay(gu1Var.c);
        ofFloat.setDuration(gu1Var.b);
        InterpolationType interpolationType = gu1Var.d;
        this.b.getClass();
        ofFloat.setInterpolator(iuw.a(interpolationType));
        ofFloat.addListener(new ExtensionsKt$createOnEndAnimatorListener$1(new hu1(a, 0)));
        this.c = ofFloat;
        ofFloat.start();
    }
}
