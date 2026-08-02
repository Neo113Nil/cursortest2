package xsna;

import one.video.transform.TransformController;
import xsna.bu;

/* compiled from: ActionHandler.kt */
/* loaded from: classes8.dex */
public final class l10 implements TransformController.a {
    public final /* synthetic */ i10 a;

    public l10(i10 i10Var) {
        this.a = i10Var;
    }

    @Override // one.video.transform.TransformController.a
    public final void a(float f, float f2, float f3, float f4) {
        i10 i10Var = this.a;
        i10Var.a.m.getImage().setScaleX(f);
        i10Var.a.m.getImage().setScaleY(f2);
        i10Var.a.m.getImage().setTranslationX(f3);
        i10Var.a.m.getImage().setTranslationY(f4);
    }

    @Override // one.video.transform.TransformController.a
    public final void b(TransformController.ScaleType scaleType) {
        this.a.c(bu.d.a);
    }
}
