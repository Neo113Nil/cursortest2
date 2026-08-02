package defpackage;

import androidx.compose.animation.a;
import androidx.compose.ui.node.d;
import com.adjust.sdk.Constants;
import java.util.Calendar;
import ru.yandex.taxi.communications.ticket.ui.component.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class a3z0 implements zls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ oz40 c;
    public final /* synthetic */ oz40 w;
    public final /* synthetic */ oz40 x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ a3z0(float f, oz40 oz40Var, tx40 tx40Var, oz40 oz40Var2, tls tlsVar, o341 o341Var) {
        this.b = f;
        this.c = oz40Var;
        this.x = tx40Var;
        this.w = oz40Var2;
        this.y = tlsVar;
        this.z = o341Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.z;
        Object obj5 = this.y;
        oz40 oz40Var = this.c;
        switch (i) {
            case 0:
                final f4z0 f4z0Var = (f4z0) obj5;
                final Calendar calendar = (Calendar) obj4;
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    Boolean bool = (Boolean) oz40Var.getValue();
                    bool.getClass();
                    ck11 K = sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6);
                    final float f = this.b;
                    final oz40 oz40Var2 = this.w;
                    final oz40 oz40Var3 = this.x;
                    a.d(bool, null, K, null, wwg.S(617625051, true, new zls() { // from class: c3z0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            boolean booleanValue = ((Boolean) obj6).booleanValue();
                            fid fidVar2 = (fid) obj7;
                            int intValue2 = ((Integer) obj8).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= fidVar2.a(booleanValue) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                c530 c530Var = c530.a;
                                f4z0 f4z0Var2 = f4z0.this;
                                oz40 oz40Var4 = oz40Var2;
                                if (booleanValue) {
                                    btsVar2.e0(28034394);
                                    b.d(ljs0.e(c530Var, ((y7m) oz40Var4.getValue()).a), f4z0Var2.e, btsVar2, 0);
                                    btsVar2.t(false);
                                } else {
                                    btsVar2.e0(28182636);
                                    float f2 = f;
                                    boolean b = btsVar2.b(f2);
                                    Object Q = btsVar2.Q();
                                    if (b || Q == did.a) {
                                        Q = new n0(f2, oz40Var4, 2);
                                        btsVar2.o0(Q);
                                    }
                                    b.i(xm91.b(c530Var, (tls) Q), (Calendar) oz40Var3.getValue(), calendar, f4z0Var2, btsVar2, 0);
                                    btsVar2.t(false);
                                }
                            } else {
                                btsVar2.Y();
                            }
                            return zy11.a;
                        }
                    }, btsVar), btsVar, 24960, 10);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                tx40 tx40Var = (tx40) this.x;
                tls tlsVar = (tls) obj5;
                o341 o341Var = (o341) obj4;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    float f2 = this.b;
                    boolean b = btsVar2.b(f2);
                    Object Q = btsVar2.Q();
                    if (b || Q == did.a) {
                        Q = new l62(f2, oz40Var, tx40Var, this.w);
                        btsVar2.o0(Q);
                    }
                    f530 y = eja1.y(c530.a, (tls) Q);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar2, y);
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
                    qje.W(btsVar2, d.f, d);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d2);
                    rab1.b(null, wwg.S(1038905521, true, new rhi0(11, tlsVar), btsVar2), null, null, null, wwg.S(996692661, true, new hex0(29, o341Var, tlsVar), btsVar2), null, btsVar2, 196656, 93);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ a3z0(oz40 oz40Var, f4z0 f4z0Var, float f, Calendar calendar, oz40 oz40Var2, oz40 oz40Var3) {
        this.c = oz40Var;
        this.y = f4z0Var;
        this.b = f;
        this.z = calendar;
        this.w = oz40Var2;
        this.x = oz40Var3;
    }
}
