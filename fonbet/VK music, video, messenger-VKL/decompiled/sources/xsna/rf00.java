package xsna;

import android.view.View;

/* compiled from: MainOverlayRedesignAnimationHelper.kt */
/* loaded from: classes17.dex */
public final class rf00 {
    public final g1d a;
    public final mk5 b;

    public rf00(g1d g1dVar) {
        this.a = g1dVar;
        mk5 mk5Var = new mk5();
        mk5Var.excludeTarget(g1dVar.c, true);
        mk5Var.excludeTarget((View) g1dVar.o, true);
        this.b = mk5Var;
    }
}
