package defpackage;

import androidx.compose.material3.internal.h;
import androidx.compose.ui.b;
import androidx.compose.ui.graphics.d;

/* loaded from: classes11.dex */
public final /* synthetic */ class exm implements zls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ exm(long j, lzr lzrVar, String str, String str2) {
        this.c = str;
        this.b = j;
        this.x = lzrVar;
        this.w = str2;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                String str = (String) obj6;
                lzr lzrVar = (lzr) obj4;
                String str2 = (String) obj5;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(1 & intValue, (intValue & 17) != 16)) {
                    web1.e(null, null, x4c.H, str, null, this.b, lzrVar, null, null, 0, false, 0, null, str2, null, null, null, null, false, 0L, 0, false, 0, false, null, false, btsVar, 384, 0, 0, 268402483);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                m3u0 m3u0Var = (m3u0) obj6;
                ety0 ety0Var = (ety0) obj5;
                wls wlsVar = (wls) obj4;
                f530 f530Var = (f530) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(f530Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean k = btsVar2.k(m3u0Var);
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        Q = new xo1(m3u0Var, 26);
                        btsVar2.o0(Q);
                    }
                    f530 a = d.a(f530Var, (tls) Q);
                    z910 d = pi6.d(x4c.b, false);
                    int S = cma1.S(btsVar2);
                    r1b0 o = btsVar2.o();
                    f530 d2 = b.d(btsVar2, a);
                    ohd.G1.getClass();
                    sls slsVar = androidx.compose.ui.node.d.b;
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
                    qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
                    qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                    wls wlsVar2 = androidx.compose.ui.node.d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(S))) {
                        b64.z(S, btsVar2, S, wlsVar2);
                    }
                    qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
                    h.b(this.b, ety0Var, wlsVar, btsVar2, 0);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ exm(tx01 tx01Var, long j, ety0 ety0Var, wls wlsVar) {
        this.c = tx01Var;
        this.b = j;
        this.w = ety0Var;
        this.x = wlsVar;
    }
}
