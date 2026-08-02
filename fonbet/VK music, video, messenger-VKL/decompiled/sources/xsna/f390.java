package xsna;

import android.content.Context;

/* compiled from: OverlayViewControllerFactoryImpl.kt */
/* loaded from: classes18.dex */
public final class f390 implements e390 {
    public final s530 a;
    public final o0r0 b;

    public f390(s530 s530Var, o0r0 o0r0Var) {
        this.a = s530Var;
        this.b = o0r0Var;
    }

    @Override // xsna.e390
    public final d390 a(Context context, f5z f5zVar) {
        return new g390(context, this.a.b(context, f5zVar, false), this.b);
    }

    @Override // xsna.e390
    public final dtd0 b(Context context) {
        return c(context, null);
    }

    @Override // xsna.e390
    public final dtd0 c(Context context, q530 q530Var) {
        return new ctd0(bwt0.v(context), q530Var);
    }
}
