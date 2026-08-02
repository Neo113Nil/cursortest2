package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.information.presentation.a;
import com.yandex.go.settings.presentation.c;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public final /* synthetic */ class cx2 implements zls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a;
    public final /* synthetic */ oip0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float w;
    public final /* synthetic */ tls x;
    public final /* synthetic */ yx40 y;
    public final /* synthetic */ m3u0 z;

    public /* synthetic */ cx2(oip0 oip0Var, float f, float f2, tls tlsVar, yx40 yx40Var, m3u0 m3u0Var, mx2 mx2Var) {
        this.a = 1;
        this.b = oip0Var;
        this.c = f;
        this.w = f2;
        this.x = tlsVar;
        this.y = yx40Var;
        this.z = m3u0Var;
        this.A = mx2Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        tls tlsVar = this.x;
        m3u0 m3u0Var = this.z;
        yx40 yx40Var = this.y;
        oip0 oip0Var = this.b;
        zy11 zy11Var = zy11.a;
        Object obj4 = did.a;
        Object obj5 = this.A;
        switch (i) {
            case 0:
                mx2 mx2Var = (mx2) obj5;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    f530 o = an91.o(pw91.u(ljs0.c, oip0Var, 14), 0.0f, this.c, 0.0f, this.w, 5);
                    sic a = qic.a(g43Var, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d = b.d(btsVar, o);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o2);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    btsVar.e0(39431926);
                    Iterator it = mx2Var.b.iterator();
                    while (it.hasNext()) {
                        oab1.f((List) it.next(), tlsVar, btsVar, 0);
                    }
                    btsVar.t(false);
                    btsVar.t(true);
                    boolean k = btsVar.k(yx40Var);
                    Object Q = btsVar.Q();
                    if (k || Q == obj4) {
                        Q = new dx2(yx40Var, 0);
                        btsVar.o0(Q);
                    }
                    f530 b = xm91.b(c530Var, (tls) Q);
                    s2d.a.getClass();
                    lob1.a(b, s2d.b, null, s2d.c, null, null, null, 1.0f - ((Number) m3u0Var.getValue()).floatValue(), btsVar, 3120);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                mx2 mx2Var2 = (mx2) obj5;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    tls tlsVar2 = this.x;
                    boolean k2 = btsVar2.k(tlsVar2);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == obj4) {
                        Q2 = new a0(8, tlsVar2);
                        btsVar2.o0(Q2);
                    }
                    tls tlsVar3 = (tls) Q2;
                    oip0 oip0Var2 = this.b;
                    float f = this.c;
                    float f2 = this.w;
                    c.a(oip0Var2, f, f2, tlsVar3, wwg.S(-232663, true, new cx2(oip0Var2, f, f2, this.y, this.z, mx2Var2, tlsVar2, 0), btsVar2), btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            default:
                vuv vuvVar = (vuv) obj5;
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    f530 o3 = an91.o(pw91.u(ljs0.c, oip0Var, 14), 0.0f, this.c, 0.0f, this.w, 5);
                    sic a2 = qic.a(g43Var, x4c.G, btsVar3, 0);
                    int hashCode2 = Long.hashCode(btsVar3.T);
                    r1b0 o4 = btsVar3.o();
                    f530 d2 = b.d(btsVar3, o3);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar2);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a2);
                    qje.W(btsVar3, d.e, o4);
                    qje.W(btsVar3, d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar3, d.h);
                    qje.W(btsVar3, d.d, d2);
                    j6 j6Var = vuvVar.b;
                    jxq0 jxq0Var = vuvVar.d;
                    boolean z = vuvVar.a;
                    int i2 = 6;
                    a.a(j6Var, tlsVar, btsVar3, 6);
                    a.d(z, jxq0Var != null ? jxq0Var.f : null, wwg.S(2087594430, true, new o91(i2, tlsVar), btsVar3), btsVar3, 384);
                    a.e(vuvVar, btsVar3, 6);
                    a.d(z, vuvVar.e, wwg.S(87085845, true, new o91(7, tlsVar), btsVar3), btsVar3, 384);
                    a.b(jxq0Var, tlsVar, btsVar3, 6);
                    btsVar3.t(true);
                    boolean k3 = btsVar3.k(yx40Var);
                    Object Q3 = btsVar3.Q();
                    if (k3 || Q3 == obj4) {
                        Q3 = new dx2(yx40Var, 7);
                        btsVar3.o0(Q3);
                    }
                    f530 b2 = xm91.b(c530Var, (tls) Q3);
                    x7d.a.getClass();
                    lob1.a(b2, x7d.b, null, x7d.c, null, null, null, 1.0f - ((Number) m3u0Var.getValue()).floatValue(), btsVar3, 3120);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ cx2(oip0 oip0Var, float f, float f2, yx40 yx40Var, m3u0 m3u0Var, Object obj, tls tlsVar, int i) {
        this.a = i;
        this.b = oip0Var;
        this.c = f;
        this.w = f2;
        this.y = yx40Var;
        this.z = m3u0Var;
        this.A = obj;
        this.x = tlsVar;
    }
}
