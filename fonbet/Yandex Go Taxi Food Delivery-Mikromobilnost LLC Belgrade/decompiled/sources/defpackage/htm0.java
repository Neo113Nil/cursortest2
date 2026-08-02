package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes13.dex */
public final /* synthetic */ class htm0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ fum0 b;

    public /* synthetic */ htm0(fum0 fum0Var, int i) {
        this.a = i;
        this.b = fum0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        fum0 fum0Var = this.b;
        switch (i) {
            case 0:
                boolean z = true;
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= ((bts) fidVar).k(ebp0Var) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    z = false;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, z)) {
                    m9b1.b(ebp0Var, fum0Var.e.a, null, null, xya1.e(btsVar).f.c, 0, 0, fum0Var.e.b, null, null, 0, 0, null, btsVar, intValue & 14, 0, 32630);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                boolean z2 = true;
                ebp0 ebp0Var2 = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var2) ? 4 : 2;
                }
                if ((intValue2 & 19) == 18) {
                    z2 = false;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, z2)) {
                    m9b1.b(ebp0Var2, fum0Var.c.a, null, null, xya1.d(btsVar2).e.d, 0, 0, fum0Var.c.b, null, null, 0, 0, null, btsVar2, intValue2 & 14, 0, 32630);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                boolean z3 = true;
                ebp0 ebp0Var3 = (ebp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((bts) fidVar3).k(ebp0Var3) ? 4 : 2;
                }
                if ((intValue3 & 19) == 18) {
                    z3 = false;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, z3)) {
                    cum0 cum0Var = fum0Var.c;
                    m9b1.b(ebp0Var3, cum0Var.a, null, null, null, 0, 0, cum0Var.b, null, null, 0, 0, null, btsVar3, intValue3 & 14, 0, 32638);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    sic a = qic.a(lr20.c, x4c.H, btsVar4, 48);
                    int hashCode = Long.hashCode(btsVar4.T);
                    r1b0 o = btsVar4.o();
                    f530 d = b.d(btsVar4, c530.a);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a);
                    qje.W(btsVar4, d.e, o);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d);
                    utm0 utm0Var = fum0Var.g;
                    CharSequence charSequence = utm0Var.a;
                    CharSequence charSequence2 = utm0Var.b;
                    qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar4, 0, 0, 16382);
                    if (charSequence2.length() > 0) {
                        btsVar4.e0(-848642470);
                        qgy.b(charSequence2, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar4, 0, 0, 16382);
                        btsVar4.t(false);
                    } else {
                        btsVar4.e0(-848585771);
                        btsVar4.t(false);
                    }
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }
}
