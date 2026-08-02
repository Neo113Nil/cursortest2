package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.multimodal_route.ui.detailed_card.h;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class nr40 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zr40 b;
    public final /* synthetic */ z0a0 c;
    public final /* synthetic */ tls w;
    public final /* synthetic */ lz6 x;
    public final /* synthetic */ v3y0 y;

    public /* synthetic */ nr40(zr40 zr40Var, z0a0 z0a0Var, tls tlsVar, lz6 lz6Var, v3y0 v3y0Var) {
        this.b = zr40Var;
        this.c = z0a0Var;
        this.w = tlsVar;
        this.x = lz6Var;
        this.y = v3y0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pqb1.a(c530.a, this.y, this.b, this.c, this.x, this.w, (fid) obj, vng.O(577));
                return zy11Var;
            default:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, c530.a);
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
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    zr40 zr40Var = this.b;
                    z0a0 z0a0Var = this.c;
                    tls tlsVar = this.w;
                    h.a(zr40Var, z0a0Var, tlsVar, btsVar, 8);
                    x2y x2yVar = new x2y(1.0f, true);
                    boolean k = btsVar.k(tlsVar);
                    Object obj3 = this.x;
                    boolean e = k | btsVar.e(obj3);
                    Object obj4 = this.y;
                    boolean e2 = e | btsVar.e(obj4);
                    Object Q = btsVar.Q();
                    if (e2 || Q == did.a) {
                        Q = new b700(10, tlsVar, obj3, obj4);
                        btsVar.o0(Q);
                    }
                    ohb1.b(x2yVar, false, null, (sls) Q, wwg.S(-1756161088, true, new wg30(17, obj3), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 6);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ nr40(v3y0 v3y0Var, zr40 zr40Var, z0a0 z0a0Var, lz6 lz6Var, tls tlsVar, int i) {
        this.y = v3y0Var;
        this.b = zr40Var;
        this.c = z0a0Var;
        this.x = lz6Var;
        this.w = tlsVar;
    }
}
