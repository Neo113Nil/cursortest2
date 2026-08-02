package xsna;

import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class bal0 implements izs {
    public final /* synthetic */ cal0 b;

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        oon0 oon0Var;
        n3a n3aVar;
        oon0 oon0Var2;
        cal0 cal0Var = this.b;
        a2w a2wVar = cal0Var.d;
        g4l0 g4l0Var = (g4l0) obj;
        if (g4l0Var instanceof v1l0) {
            n3aVar = new buz(12, a2wVar, new oac(cal0Var, ((v1l0) g4l0Var).a()));
        } else {
            if ((g4l0Var instanceof s1l0) || (g4l0Var instanceof t1l0)) {
                oon0Var = new oon0("stickers_packs_buy", null, false, false, 14);
            } else {
                if (g4l0Var instanceof q1l0) {
                    oon0Var2 = new oon0("stickers_packs_get_for_free", null, false, false, 14);
                } else {
                    oon0Var2 = null;
                    if (g4l0Var instanceof h5l0) {
                        ((h5l0) g4l0Var).getClass();
                        throw null;
                    }
                    if (g4l0Var instanceof u1l0) {
                        n3aVar = new buz(12, a2wVar, new bh5(((u1l0) g4l0Var).a(), 12));
                    } else if (g4l0Var instanceof r1l0) {
                        oon0Var = new oon0("stickers_packs_gift", null, false, false, 14);
                    } else if (g4l0Var instanceof p1l0) {
                        oon0Var = new oon0("stickers_packs_bonus_update", null, false, false, 14);
                    } else if (!(g4l0Var instanceof o690)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n3aVar = oon0Var2;
            }
            n3aVar = oon0Var;
        }
        if (n3aVar != null) {
            cal0Var.b.b(n3aVar, false);
        }
        return s3q0.a;
    }
}
