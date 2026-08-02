package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public final class e0q0 implements wu {
    public final av a;
    public final /* synthetic */ f0q0 b;

    public e0q0(f0q0 f0q0Var, av avVar) {
        this.b = f0q0Var;
        this.a = avVar;
    }

    @Override // defpackage.wu
    public final void b(kr krVar, pxl pxlVar, Map map) {
        f0q0 f0q0Var = this.b;
        if (!f0q0Var.c) {
            this.a.b(krVar, pxlVar, map);
            return;
        }
        h5z0.a.d(f0q0Var.getClass() + " is disposed, can't dispatch " + krVar, new Object[0]);
    }
}
