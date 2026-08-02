package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$State;

/* loaded from: classes4.dex */
public final class kpm implements zls {
    public final /* synthetic */ kk2 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ DsButton$State w;
    public final /* synthetic */ long x;
    public final /* synthetic */ long y;
    public final /* synthetic */ DsButton$Size z;

    public kpm(float f, x3 x3Var, float f2, DsButton$State dsButton$State, long j, long j2, DsButton$Size dsButton$Size, kk2 kk2Var, String str, long j3) {
        this.a = f;
        this.b = x3Var;
        this.c = f2;
        this.w = dsButton$State;
        this.x = j;
        this.y = j2;
        this.z = dsButton$Size;
        this.A = kk2Var;
        this.B = str;
        this.C = j3;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ety0 d;
        dj6 dj6Var = (dj6) obj;
        fid fidVar = (fid) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= ((bts) fidVar).k(dj6Var) ? 4 : 2;
        }
        if ((intValue & 19) == 18) {
            bts btsVar = (bts) fidVar;
            if (btsVar.E()) {
                btsVar.Y();
                return zy11.a;
            }
        }
        float d2 = dj6Var.d();
        bts btsVar2 = (bts) fidVar;
        btsVar2.e0(-1224400529);
        boolean b = btsVar2.b(d2);
        float f = this.a;
        boolean b2 = b | btsVar2.b(f);
        x3 x3Var = this.b;
        boolean k = b2 | btsVar2.k(x3Var);
        float f2 = this.c;
        boolean b3 = k | btsVar2.b(f2);
        Object Q = btsVar2.Q();
        if (b3 || Q == did.a) {
            float d3 = dj6Var.d() - f;
            if (x3Var == null) {
                f2 = 0.0f;
            }
            Q = ly3.h(d3 - f2, btsVar2);
        }
        float f3 = ((y7m) Q).a;
        btsVar2.t(false);
        sic a = qic.a(lr20.e, x4c.H, btsVar2, 54);
        int hashCode = Long.hashCode(btsVar2.T);
        r1b0 o = btsVar2.o();
        c530 c530Var = c530.a;
        f530 d4 = b.d(btsVar2, c530Var);
        ohd.G1.getClass();
        sls slsVar = d.b;
        if (btsVar2.a == null) {
            cma1.b0();
            throw null;
        }
        btsVar2.i0();
        if (btsVar2.S) {
            btsVar2.n(slsVar);
        } else {
            btsVar2.r0();
        }
        qje.W(btsVar2, d.f, a);
        qje.W(btsVar2, d.e, o);
        wls wlsVar = d.g;
        if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
            b64.z(hashCode, btsVar2, hashCode, wlsVar);
        }
        qje.W(btsVar2, d.d, d4);
        f530 s = ljs0.s(c530Var, 0.0f, f3, 1);
        DsButton$State dsButton$State = DsButton$State.Disabled;
        DsButton$State dsButton$State2 = this.w;
        long j = this.x;
        long j2 = dsButton$State2 == dsButton$State ? j : this.y;
        int i = jpm.a[this.z.ordinal()];
        if (i == 1) {
            btsVar2.e0(-1861714808);
            qnm qnmVar = qnm.a;
            d = ltm.b(btsVar2).d(btsVar2);
            btsVar2.t(false);
        } else if (i == 2) {
            btsVar2.e0(-1861712376);
            qnm qnmVar2 = qnm.a;
            d = ltm.b(btsVar2).f(btsVar2);
            btsVar2.t(false);
        } else {
            if (i != 3) {
                throw unr0.y(-1861716866, btsVar2, false);
            }
            btsVar2.e0(-1861709944);
            qnm qnmVar3 = qnm.a;
            d = ltm.b(btsVar2).f(btsVar2);
            btsVar2.t(false);
        }
        vqy0.d(this.A, s, j2, 0L, 0L, new sjy0(3), 0L, 0, false, 0, 0, null, null, d, btsVar2, 0, 0, 261112);
        bts btsVar3 = btsVar2;
        btsVar3.e0(-1861704993);
        String str = this.B;
        if (str != null) {
            vqy0.c(str, ljs0.s(c530Var, 0.0f, f3, 1), dsButton$State2 == dsButton$State ? j : this.C, 0L, null, 0L, new sjy0(3), 0L, 0, false, 0, 0, ltm.b(btsVar3).i(btsVar3), btsVar3, 0, 0, 130040);
            btsVar3 = btsVar3;
        }
        btsVar3.t(false);
        btsVar3.t(true);
        return zy11.a;
    }
}
