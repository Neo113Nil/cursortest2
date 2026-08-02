package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.d;

/* loaded from: classes11.dex */
public final class iqm implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public iqm(uo5 uo5Var, ety0 ety0Var, String str, int i, int i2, oz40 oz40Var, oz40 oz40Var2) {
        this.w = uo5Var;
        this.x = ety0Var;
        this.y = str;
        this.b = i;
        this.c = oz40Var;
        this.z = oz40Var2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        fid fidVar;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        c530 c530Var = c530.a;
        Object obj7 = this.w;
        switch (i) {
            case 0:
                wls wlsVar = (wls) obj;
                fid fidVar2 = (fid) obj2;
                int intValue = ((Number) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= fidVar2.e(wlsVar) ? 4 : 2;
                }
                if ((intValue & 19) == 18) {
                    bts btsVar = (bts) fidVar2;
                    if (btsVar.E()) {
                        btsVar.Y();
                        return zy11Var;
                    }
                }
                f530 c = ljs0.c(c530Var, 1.0f);
                qnm qnmVar = qnm.a;
                qnm.d.getClass();
                f530 l = an91.l(c, 16.0f, 8.0f);
                ety0 ety0Var = (ety0) obj6;
                String str = (String) obj5;
                oz40 oz40Var = (oz40) obj4;
                z910 d = pi6.d((uo5) obj7, false);
                bts btsVar2 = (bts) fidVar2;
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d2 = b.d(fidVar2, l);
                ohd.G1.getClass();
                sls slsVar = d.b;
                bts btsVar3 = (bts) fidVar2;
                if (btsVar3.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar3.i0();
                if (btsVar3.S) {
                    btsVar3.n(slsVar);
                } else {
                    btsVar3.r0();
                }
                qje.W(fidVar2, d.f, d);
                qje.W(fidVar2, d.e, o);
                wls wlsVar2 = d.g;
                if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                    b64.z(hashCode, btsVar3, hashCode, wlsVar2);
                }
                qje.W(fidVar2, d.d, d2);
                btsVar3.e0(-1687911818);
                oz40 oz40Var2 = this.c;
                if (((hoy0) oz40Var2.getValue()).a.b.length() == 0) {
                    vqy0.c(str, ljs0.c(c530Var, 1.0f), 0L, 0L, null, 0L, null, 0L, 1, false, this.b, 0, ety0.a(ety0Var, qnm.c(fidVar2).k0(), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), fidVar2, 48, 0, 110588);
                    fidVar = fidVar2;
                } else {
                    fidVar = fidVar2;
                }
                btsVar3.t(false);
                ((Boolean) oz40Var.getValue()).booleanValue();
                btsVar3.e0(-784732369);
                long j = ((hoy0) oz40Var2.getValue()).b;
                int i2 = asy0.c;
                btsVar3.c0(-1687881149, Integer.valueOf((int) (j >> 32)));
                wlsVar.invoke(fidVar, Integer.valueOf(intValue & 14));
                btsVar3.t(false);
                btsVar3.t(false);
                btsVar3.t(true);
                return zy11Var;
            default:
                ibp0 ibp0Var = (ibp0) obj;
                fid fidVar3 = (fid) obj2;
                int intValue2 = ((Number) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                }
                bts btsVar4 = (bts) fidVar3;
                if (btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) obj7;
                    boolean k = btsVar4.k(bVar) | btsVar4.c(this.b);
                    androidx.compose.foundation.lazy.b bVar2 = (androidx.compose.foundation.lazy.b) obj7;
                    yx40 yx40Var = (yx40) obj6;
                    tx40 tx40Var = (tx40) obj5;
                    wls wlsVar3 = (wls) obj4;
                    Object Q = btsVar4.Q();
                    if (k || Q == did.a) {
                        Q = new nyx0(bVar2, this.b, this.c, yx40Var, tx40Var, wlsVar3);
                        btsVar4.o0(Q);
                    }
                    f530 a = exw0.a(c530Var, bVar, (PointerInputEventHandler) Q);
                    au2 au2Var = hm91.a;
                    if (au2Var == null) {
                        lgv lgvVar = new lgv("Drag", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                        a6t0 a6t0Var = new a6t0(iq2.g);
                        uq90 uq90Var = new uq90();
                        uq90Var.j(21.0f, 8.0f);
                        uq90Var.h(3.0f, 8.0f);
                        uq90Var.p(2.0f);
                        uq90Var.g(18.0f);
                        uq90Var.c();
                        uq90Var.j(21.0f, 13.0f);
                        uq90Var.h(3.0f, 13.0f);
                        uq90Var.p(2.0f);
                        uq90Var.g(18.0f);
                        uq90Var.c();
                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
                        au2Var = rya1.a(lgvVar.d(), true);
                        hm91.a = au2Var;
                    }
                    zrb1.a(ibp0Var, au2Var, a, null, btsVar4, intValue2 & 14, 12);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }

    public iqm(androidx.compose.foundation.lazy.b bVar, int i, oz40 oz40Var, yx40 yx40Var, tx40 tx40Var, wls wlsVar) {
        this.w = bVar;
        this.b = i;
        this.c = oz40Var;
        this.x = yx40Var;
        this.y = tx40Var;
        this.z = wlsVar;
    }
}
