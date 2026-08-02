package defpackage;

import androidx.compose.animation.a;
import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.f;
import androidx.compose.ui.input.pointer.g;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.routestops.v2.ui.c;
import defpackage.bts;
import defpackage.bz9;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.jl40;
import defpackage.o430;
import defpackage.q0a;
import defpackage.r0a;
import defpackage.s0a;
import defpackage.t0a;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.tx40;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class dhj0 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ dhj0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    private final Object b(Object obj, Object obj2, Object obj3, Object obj4) {
        f530 a;
        g140 g140Var = (g140) this.b;
        final b bVar = (b) this.w;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            c530 c530Var = c530.a;
            f530 j = an91.j(ljs0.c(c530Var, 1.0f), j690Var);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, j);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            f530 o2 = an91.o(c530Var, 0.0f, 8.0f, 0.0f, 8.0f, 5);
            boolean e = btsVar.e(g140Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new ft20(28, g140Var);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(o2, (tls) Q), null, wwg.S(-1712364789, true, new wg30(6, g140Var), btsVar), null, null, null, null, false, btsVar, 384, 250);
            boolean k = btsVar.k(tlsVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new adp(20, tlsVar);
                btsVar.o0(Q2);
            }
            final tls tlsVar2 = (tls) Q2;
            a = androidx.compose.ui.b.a(c530Var, m.a(), new zls() { // from class: ru.yandex.taxi.masstransit.design.a
                @Override // defpackage.zls
                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                    f530 f530Var = (f530) obj5;
                    ((Integer) obj7).getClass();
                    bts btsVar2 = (bts) ((fid) obj6);
                    btsVar2.e0(-1638919276);
                    Object Q3 = btsVar2.Q();
                    o430 o430Var2 = did.a;
                    if (Q3 == o430Var2) {
                        Q3 = f.f(0.0f);
                        btsVar2.o0(Q3);
                    }
                    tx40 tx40Var = (tx40) Q3;
                    Object Q4 = btsVar2.Q();
                    androidx.compose.foundation.lazy.b bVar2 = androidx.compose.foundation.lazy.b.this;
                    if (Q4 == o430Var2) {
                        Q4 = f.f((bVar2.i() / 10000.0f) + bVar2.h());
                        btsVar2.o0(Q4);
                    }
                    tx40 tx40Var2 = (tx40) Q4;
                    boolean k2 = btsVar2.k(bVar2);
                    Object Q5 = btsVar2.Q();
                    if (k2 || Q5 == o430Var2) {
                        Q5 = new ComposeScrollDirectionHandlerKt$onScrollDirection$1$1$1(bVar2, tx40Var2, tx40Var, null);
                        btsVar2.o0(Q5);
                    }
                    zpn.e(btsVar2, (wls) Q5, bVar2);
                    boolean k3 = btsVar2.k(bVar2);
                    tls tlsVar3 = tlsVar2;
                    boolean k4 = k3 | btsVar2.k(tlsVar3);
                    Object Q6 = btsVar2.Q();
                    if (k4 || Q6 == o430Var2) {
                        Q6 = new ComposeScrollDirectionHandlerKt$onScrollDirection$1$2$1(bVar2, tlsVar3, tx40Var, null);
                        btsVar2.o0(Q6);
                    }
                    zpn.e(btsVar2, (wls) Q6, bVar2);
                    btsVar2.t(false);
                    return f530Var;
                }
            });
            boolean e2 = btsVar.e(g140Var) | btsVar.k(tlsVar);
            Object Q3 = btsVar.Q();
            if (e2 || Q3 == o430Var) {
                Q3 = new t130(7, g140Var, tlsVar);
                btsVar.o0(Q3);
            }
            adb1.a(a, bVar, null, null, null, null, false, null, (tls) Q3, btsVar, 0, 508);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4) {
        czy0 czy0Var = (czy0) this.b;
        b bVar = (b) this.w;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
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
            f530 o2 = an91.o(c530Var, 0.0f, 8.0f, 0.0f, 8.0f, 5);
            boolean e = btsVar.e(czy0Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new x240(2, czy0Var);
                btsVar.o0(Q);
            }
            ydb1.a(fnq0.a(o2, (tls) Q), null, wwg.S(-369657860, true, new wg30(9, czy0Var), btsVar), null, null, null, null, false, btsVar, 384, 250);
            boolean e2 = btsVar.e(czy0Var) | btsVar.k(tlsVar);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new t130(11, czy0Var, tlsVar);
                btsVar.o0(Q2);
            }
            adb1.a(null, bVar, j690Var, null, null, null, false, null, (tls) Q2, btsVar, (intValue << 3) & 896, 505);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        oip0 oip0Var = (oip0) this.b;
        vv40 vv40Var = (vv40) this.w;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            f530 j = an91.j(pw91.u(c530.a, oip0Var, 14), j690Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, j);
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
            if (vv40Var instanceof sv40) {
                btsVar.e0(1415732825);
                yqb1.a((sv40) vv40Var, tlsVar, btsVar, 6);
                btsVar.t(false);
            } else {
                if (!(vv40Var instanceof uv40)) {
                    throw unr0.y(1415730583, btsVar, false);
                }
                btsVar.e0(1415735626);
                yqb1.b(btsVar, 6);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        b bVar = (b) this.b;
        j690 j690Var = (j690) this.w;
        tls tlsVar = (tls) this.c;
        bpl0 bpl0Var = (bpl0) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(bpl0Var) ? 32 : 16;
        }
        int i = 0;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            int i2 = intValue & 112;
            boolean z = i2 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new uzr(1, bpl0Var);
                btsVar.o0(Q);
            }
            f530 c = ljs0.c(fnq0.b(c530.a, false, (tls) Q), 1.0f);
            i43 i43Var = new i43(8.0f, true, new quz(11));
            boolean k = btsVar.k(tlsVar) | (i2 == 32);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new kej0(i, tlsVar, bpl0Var);
                btsVar.o0(Q2);
            }
            adb1.b(c, bVar, j690Var, i43Var, null, null, false, null, (tls) Q2, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 488);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        lx40 lx40Var = (lx40) this.b;
        zdl0 zdl0Var = (zdl0) this.w;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            f530 j = an91.j(c530.a, j690Var);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, j);
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
            c.e(lx40Var, zdl0Var, tlsVar, btsVar, 0);
            oeb1.c(btsVar, new x2y(1.0f, true));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4) {
        nmq0 nmq0Var = (nmq0) this.b;
        tls tlsVar = (tls) this.c;
        tls tlsVar2 = (tls) this.w;
        qe31 qe31Var = (qe31) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(qe31Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            tkb1.a((vnx0) nmq0Var.b.get(qe31Var.a), null, tlsVar, tlsVar2, btsVar, 0, 2);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4) {
        float f;
        float floatValue;
        float floatValue2;
        hwd0 hwd0Var = (hwd0) this.b;
        tx40 tx40Var = (tx40) this.c;
        oz40 oz40Var = (oz40) this.w;
        wu60 wu60Var = (wu60) obj2;
        float floatValue3 = ((Float) obj3).floatValue();
        ((Float) obj4).getClass();
        tx40Var.setFloatValue(y6i0.c(tx40Var.getFloatValue() * floatValue3, 0.5f, 15.0f));
        if (tx40Var.getFloatValue() >= 1.0f) {
            f = (int) (((g) hwd0Var).C >> 32);
            floatValue = tx40Var.getFloatValue() - 1.0f;
        } else {
            f = (int) (((g) hwd0Var).C >> 32);
            floatValue = 1.0f - tx40Var.getFloatValue();
        }
        float f2 = (floatValue * f) / 2.0f;
        if (tx40Var.getFloatValue() >= 1.0f) {
            floatValue2 = ((tx40Var.getFloatValue() - 1.0f) * ((int) (((g) hwd0Var).C & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f;
        } else {
            floatValue2 = ((1.0f - tx40Var.getFloatValue()) * ((int) (((g) hwd0Var).C & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) / 2.0f;
        }
        long f3 = wu60.f(((wu60) oz40Var.getValue()).a, wu60Var.a);
        float c = y6i0.c(Float.intBitsToFloat((int) (f3 >> 32)), -f2, f2);
        float c2 = y6i0.c(Float.intBitsToFloat((int) (f3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), -floatValue2, floatValue2);
        nzs.i((Float.floatToRawIntBits(c) << 32) | (Float.floatToRawIntBits(c2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), oz40Var);
        return zy11.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4) {
        qfx0 qfx0Var = (qfx0) this.b;
        oip0 oip0Var = (oip0) this.w;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            pkb1.c(qfx0Var, j690Var, oip0Var, tlsVar, btsVar, intValue & 112);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object l(Object obj, Object obj2, Object obj3, Object obj4) {
        ab11 ab11Var = (ab11) this.b;
        b bVar = (b) this.w;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        bts btsVar = (bts) fidVar;
        if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
            CharSequence charSequence = ab11Var.a;
            bpl0 bpl0Var = ab11Var.b;
            boolean k = btsVar.k(tlsVar);
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = new ec01(7, tlsVar);
                btsVar.o0(Q);
            }
            lub1.a(charSequence, bpl0Var, j690Var, bVar, (tls) Q, btsVar, (intValue << 3) & 896);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4) {
        List list;
        c530 c530Var;
        bts btsVar;
        c530 c530Var2;
        final o341 o341Var = (o341) this.b;
        wg6 wg6Var = (wg6) this.w;
        tls tlsVar = (tls) this.c;
        j690 j690Var = (j690) obj2;
        fid fidVar = (fid) obj3;
        int intValue = ((Integer) obj4).intValue();
        if ((intValue & 48) == 0) {
            intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
        }
        final int i = 1;
        final int i2 = 0;
        bts btsVar2 = (bts) fidVar;
        if (btsVar2.V(intValue & 1, (intValue & 145) != 144)) {
            c530 c530Var3 = c530.a;
            f530 j = an91.j(ljs0.u(ljs0.c(c530Var3, 1.0f), null, 3), j690Var);
            boolean z = o341Var.l;
            List list2 = o341Var.d;
            if (z) {
                btsVar2.e0(751297926);
                sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                int hashCode = Long.hashCode(btsVar2.T);
                r1b0 o = btsVar2.o();
                f530 d = androidx.compose.ui.b.d(btsVar2, j);
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
                qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar2, d.h);
                qje.W(btsVar2, d.d, d);
                boolean z2 = o341Var.m;
                o430 o430Var = did.a;
                if (z2) {
                    btsVar2.e0(1703484175);
                    f530 o2 = an91.o(c530Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    boolean e = btsVar2.e(o341Var);
                    Object Q = btsVar2.Q();
                    if (e || Q == o430Var) {
                        Q = new tls() { // from class: q241
                            @Override // defpackage.tls
                            public final Object invoke(Object obj5) {
                                int i3 = i2;
                                zy11 zy11Var = zy11.a;
                                o341 o341Var2 = o341Var;
                                mnq0 mnq0Var = (mnq0) obj5;
                                switch (i3) {
                                    case 0:
                                        androidx.compose.ui.semantics.f.l(mnq0Var, o341Var2.b);
                                        break;
                                    default:
                                        androidx.compose.ui.semantics.f.l(mnq0Var, o341Var2.b);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar2.o0(Q);
                    }
                    list = list2;
                    ydb1.a(fnq0.b(o2, false, (tls) Q), null, wwg.S(948643118, true, new zls() { // from class: r241
                        @Override // defpackage.zls
                        public final Object invoke(Object obj5, Object obj6, Object obj7) {
                            int i3 = i2;
                            zy11 zy11Var = zy11.a;
                            o341 o341Var2 = o341Var;
                            switch (i3) {
                                case 0:
                                    ebp0 ebp0Var = (ebp0) obj5;
                                    fid fidVar2 = (fid) obj6;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                    }
                                    bts btsVar3 = (bts) fidVar2;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        p9b1.c(ebp0Var, o341Var2.a, c530.a, tp2.a, xya1.e(btsVar3).f.c, 2, Integer.MAX_VALUE, o341Var2.c, AppColor$Palette.TextMinor, xya1.e(btsVar3).h.a, 2, Integer.MAX_VALUE, null, btsVar3, intValue2 & 14, 0, 0);
                                        break;
                                    }
                                default:
                                    fid fidVar3 = (fid) obj6;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    bts btsVar4 = (bts) fidVar3;
                                    if (!btsVar4.V(1 & intValue3, (intValue3 & 17) != 16)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        jeb1.f(o341Var2.e, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ((xy2) btsVar4.m(uy2.b)).b.g.b, btsVar4, 0, 0, 16382);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar2), null, null, null, null, false, btsVar2, 384, 250);
                    btsVar = btsVar2;
                    if (list.isEmpty()) {
                        c530Var2 = c530Var3;
                        btsVar.e0(1704470688);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(1703939255);
                        c530Var2 = c530Var3;
                        yrl.c(tra1.b(an91.o(c530Var2, 0.0f, 12.0f, 0.0f, 8.0f, 5), ((Number) androidx.compose.animation.core.b.b(((dtr0) wg6Var.g.getValue()).a == -2 ? 1.0f : 0.0f, sb2.K(200, 0, null, 6), "dividerAlpha", null, btsVar, 3120, 20).getValue()).floatValue()), null, btsVar, 0, 6);
                        btsVar.t(false);
                    }
                    btsVar.t(false);
                    c530Var = c530Var2;
                } else {
                    list = list2;
                    btsVar2.e0(1704513561);
                    f530 o3 = an91.o(c530Var3, 16.0f, 20.0f, 16.0f, 0.0f, 8);
                    c530Var = c530Var3;
                    boolean e2 = btsVar2.e(o341Var);
                    Object Q2 = btsVar2.Q();
                    if (e2 || Q2 == o430Var) {
                        Q2 = new tls() { // from class: q241
                            @Override // defpackage.tls
                            public final Object invoke(Object obj5) {
                                int i3 = i;
                                zy11 zy11Var = zy11.a;
                                o341 o341Var2 = o341Var;
                                mnq0 mnq0Var = (mnq0) obj5;
                                switch (i3) {
                                    case 0:
                                        androidx.compose.ui.semantics.f.l(mnq0Var, o341Var2.b);
                                        break;
                                    default:
                                        androidx.compose.ui.semantics.f.l(mnq0Var, o341Var2.b);
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar2.o0(Q2);
                    }
                    f530 b = fnq0.b(o3, false, (tls) Q2);
                    String str = o341Var.a;
                    qwd qwdVar = uy2.b;
                    jeb1.f(str, b, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ((xy2) btsVar2.m(qwdVar)).b.f.c, btsVar2, 384, 0, 16376);
                    jeb1.f(o341Var.c, an91.n(c530Var, 16.0f, 4.0f, 16.0f, 20.0f), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ((xy2) btsVar2.m(qwdVar)).b.g.b, btsVar2, 384, 0, 16376);
                    btsVar = btsVar2;
                    btsVar.t(false);
                }
                if (list.isEmpty()) {
                    btsVar.e0(1705551968);
                    btsVar.t(false);
                } else {
                    btsVar.e0(1705286732);
                    bts btsVar3 = btsVar;
                    gub1.b(o341Var.d, ljs0.u(ljs0.c(c530Var, 1.0f), null, 3), null, null, null, null, null, null, null, false, o341Var.m, null, false, btsVar3, 48, 0, 7164);
                    btsVar = btsVar3;
                    btsVar.t(false);
                }
                btsVar.e0(1705658112);
                btsVar.t(false);
                f530 k = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
                boolean k2 = btsVar.k(tlsVar);
                Object Q3 = btsVar.Q();
                if (k2 || Q3 == o430Var) {
                    Q3 = new fc01(15, tlsVar);
                    btsVar.o0(Q3);
                }
                final int i3 = 1;
                bts btsVar4 = btsVar;
                ohb1.b(k, false, null, (sls) Q3, wwg.S(1930481845, true, new zls() { // from class: r241
                    @Override // defpackage.zls
                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                        int i32 = i3;
                        zy11 zy11Var = zy11.a;
                        o341 o341Var2 = o341Var;
                        switch (i32) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj5;
                                fid fidVar2 = (fid) obj6;
                                int intValue2 = ((Integer) obj7).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar32 = (bts) fidVar2;
                                if (!btsVar32.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar32.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, o341Var2.a, c530.a, tp2.a, xya1.e(btsVar32).f.c, 2, Integer.MAX_VALUE, o341Var2.c, AppColor$Palette.TextMinor, xya1.e(btsVar32).h.a, 2, Integer.MAX_VALUE, null, btsVar32, intValue2 & 14, 0, 0);
                                    break;
                                }
                            default:
                                fid fidVar3 = (fid) obj6;
                                int intValue3 = ((Integer) obj7).intValue();
                                bts btsVar42 = (bts) fidVar3;
                                if (!btsVar42.V(1 & intValue3, (intValue3 & 17) != 16)) {
                                    btsVar42.Y();
                                    break;
                                } else {
                                    jeb1.f(o341Var2.e, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ((xy2) btsVar42.m(uy2.b)).b.g.b, btsVar42, 0, 0, 16382);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar4, 24582, 6);
                btsVar4.t(true);
                btsVar4.t(false);
            } else {
                btsVar2.e0(751138834);
                ik91.a(j, btsVar2, 0);
                btsVar2.t(false);
            }
        } else {
            btsVar2.Y();
        }
        return zy11.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ?? r11;
        bts btsVar;
        String str;
        float f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        zy11 zy11Var;
        tls tlsVar;
        int i = this.a;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        o430 o430Var = did.a;
        zy11 zy11Var2 = zy11.a;
        Object obj5 = this.w;
        Object obj6 = this.b;
        Object obj7 = this.c;
        final int i2 = 0;
        switch (i) {
            case 0:
                nhj0 nhj0Var = (nhj0) obj6;
                tls tlsVar2 = (tls) obj7;
                oz40 oz40Var = (oz40) obj5;
                j690 j690Var = (j690) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar;
                boolean V = btsVar2.V(intValue & 1, (intValue & 145) != 144);
                dmw0 dmw0Var = btsVar2.a;
                if (V) {
                    f530 j = an91.j(c530Var, j690Var);
                    k3r k3rVar = ljs0.c;
                    f530 k = j.k(k3rVar);
                    so5 so5Var = x4c.G;
                    sic a = qic.a(g43Var, so5Var, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = androidx.compose.ui.b.d(btsVar2, k);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar2, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar2, wlsVar2, o);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar2, wlsVar3, valueOf);
                    tls tlsVar3 = d.h;
                    qje.M(btsVar2, tlsVar3);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar2, wlsVar4, d);
                    f530 o2 = an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 16.0f, 0.0f, 8.0f, 5);
                    sic a2 = qic.a(g43Var, so5Var, btsVar2, 0);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o3 = btsVar2.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar2, o2);
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, wlsVar, a2);
                    qje.W(btsVar2, wlsVar2, o3);
                    vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar3);
                    qje.W(btsVar2, wlsVar4, d2);
                    jeb1.f(nhj0Var.a, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).e.d, btsVar2, 0, 0, 16382);
                    if (((Boolean) oz40Var.getValue()).booleanValue()) {
                        btsVar2.e0(-1960977289);
                        oeb1.c(btsVar2, an91.k(c530Var, 8.0f));
                        jeb1.f(nhj0Var.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).f.a, btsVar2, 0, 0, 16382);
                        r11 = 0;
                        btsVar2.t(false);
                    } else {
                        r11 = 0;
                        btsVar2.e0(-1960845632);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                    if (((Boolean) oz40Var.getValue()).booleanValue()) {
                        btsVar2.e0(-324916736);
                        yrl.c(null, null, btsVar2, r11, 7);
                        btsVar2.t(r11);
                    } else {
                        btsVar2.e0(-324876374);
                        btsVar2.t(r11);
                    }
                    boolean k2 = btsVar2.k(nhj0Var) | btsVar2.k(tlsVar2);
                    Object Q = btsVar2.Q();
                    Object obj8 = Q;
                    if (k2 || Q == o430Var) {
                        ugd0 ugd0Var = new ugd0(29, nhj0Var, tlsVar2);
                        btsVar2.o0(ugd0Var);
                        obj8 = ugd0Var;
                    }
                    adb1.a(k3rVar, null, null, null, null, null, false, null, (tls) obj8, btsVar2, 6, 510);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var2;
            case 1:
                ru.yandex.taxi.search.b bVar = (ru.yandex.taxi.search.b) obj6;
                jg jgVar = (jg) obj7;
                y4 y4Var = (y4) obj5;
                CharSequence charSequence = (CharSequence) obj;
                ((Integer) obj2).getClass();
                int intValue2 = ((Integer) obj3).intValue();
                ((Integer) obj4).getClass();
                String obj9 = charSequence != null ? charSequence.toString() : null;
                if (obj9 == null) {
                    obj9 = "";
                }
                bVar.c(obj9);
                if (intValue2 > 0 && (charSequence == null || charSequence.length() == 0)) {
                    jgVar.run();
                }
                y4Var.invoke(charSequence != null ? charSequence.toString() : null);
                return zy11Var2;
            case 2:
                tls tlsVar4 = (tls) obj7;
                sls slsVar2 = (sls) obj6;
                String str2 = (String) obj5;
                List list = (List) obj2;
                fid fidVar2 = (fid) obj3;
                ((Integer) obj4).getClass();
                List list2 = list;
                if (list2.isEmpty()) {
                    bts btsVar3 = (bts) fidVar2;
                    btsVar3.e0(-123592096);
                    btsVar3.t(false);
                } else {
                    bts btsVar4 = (bts) fidVar2;
                    btsVar4.e0(-124803917);
                    dmw0 dmw0Var2 = btsVar4.a;
                    sic a3 = qic.a(g43Var, x4c.G, btsVar4, 0);
                    int hashCode3 = Long.hashCode(btsVar4.T);
                    r1b0 o4 = btsVar4.o();
                    c530 c530Var2 = c530.a;
                    f530 d3 = androidx.compose.ui.b.d(btsVar4, c530Var2);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar3);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a3);
                    qje.W(btsVar4, d.e, o4);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d3);
                    oeb1.c(btsVar4, ljs0.e(c530Var2, 12.0f));
                    String e = ohb1.e(btsVar4, kyh0.mt_route_details_v2_ground_or_prefix);
                    btsVar4.e0(-428472178);
                    int size = list2.size();
                    int i3 = 0;
                    while (i3 < size) {
                        boolean z5 = i3 == scc.f(list);
                        c530 c530Var3 = c530Var2;
                        f530 o5 = an91.o(c530Var3, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                        lhl0 a4 = khl0.a(lr20.a, x4c.E, btsVar4, 48);
                        int hashCode4 = Long.hashCode(btsVar4.T);
                        r1b0 o6 = btsVar4.o();
                        f530 d4 = androidx.compose.ui.b.d(btsVar4, o5);
                        ohd.G1.getClass();
                        sls slsVar4 = d.b;
                        btsVar4.i0();
                        if (btsVar4.S) {
                            btsVar4.n(slsVar4);
                        } else {
                            btsVar4.r0();
                        }
                        qje.W(btsVar4, d.f, a4);
                        qje.W(btsVar4, d.e, o6);
                        qje.W(btsVar4, d.g, Integer.valueOf(hashCode4));
                        qje.M(btsVar4, d.h);
                        qje.W(btsVar4, d.d, d4);
                        if (i3 == 0) {
                            btsVar4.e0(-745661237);
                            f530 o7 = an91.o(c530Var3, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                            c530Var2 = c530Var3;
                            f = 4.0f;
                            Object Q2 = btsVar4.Q();
                            if (Q2 == o430Var) {
                                Q2 = new teb(20);
                                btsVar4.o0(Q2);
                            }
                            bts btsVar5 = btsVar4;
                            String str3 = e;
                            jeb1.f(str3, fnq0.a(o7, (tls) Q2), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar4).h.a, btsVar5, 384, 0, 16376);
                            str = str3;
                            btsVar = btsVar5;
                            btsVar.t(false);
                        } else {
                            String str4 = e;
                            btsVar = btsVar4;
                            str = str4;
                            c530Var2 = c530Var3;
                            f = 4.0f;
                            btsVar.e0(-745370519);
                            btsVar.t(false);
                        }
                        ib11 ib11Var = (ib11) list.get(i3);
                        boolean k3 = btsVar.k(tlsVar4) | btsVar.e(list) | btsVar.c(i3);
                        Object Q3 = btsVar.Q();
                        if (k3 || Q3 == o430Var) {
                            Q3 = new p61(tlsVar4, list, i3, 3);
                            btsVar.o0(Q3);
                        }
                        ptb1.b(ib11Var, false, null, (sls) Q3, true, null, null, null, null, i3 == 0 ? str : null, btsVar, 24624, 484);
                        if (!z5 || slsVar2 == null) {
                            btsVar.e0(-744893367);
                            btsVar.t(false);
                        } else {
                            btsVar.e0(-745022141);
                            oeb1.c(btsVar, ljs0.q(c530Var2, f));
                            q5b1.h(str2, slsVar2, btsVar, 0);
                            btsVar.t(false);
                        }
                        btsVar.t(true);
                        i3++;
                        bts btsVar6 = btsVar;
                        e = str;
                        btsVar4 = btsVar6;
                    }
                    tse0.t(btsVar4, false, true, false);
                }
                return zy11Var2;
            case 3:
                t0a t0aVar = (t0a) obj6;
                final tls tlsVar5 = (tls) obj7;
                final oip0 oip0Var = (oip0) obj5;
                j690 j690Var2 = (j690) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((bts) fidVar3).k(j690Var2) ? 32 : 16;
                }
                bts btsVar7 = (bts) fidVar3;
                if (btsVar7.V(intValue3 & 1, (intValue3 & 145) != 144)) {
                    f530 j2 = an91.j(c530Var, j690Var2);
                    Object Q4 = btsVar7.Q();
                    if (Q4 == o430Var) {
                        Q4 = new ew9(15);
                        btsVar7.o0(Q4);
                    }
                    a.b(t0aVar, j2, null, null, "feedback_state", (tls) Q4, wwg.S(-444185448, true, new bms() { // from class: com.yandex.go.chargers.feedback.ui.a
                        @Override // defpackage.bms
                        public final Object invoke(Object obj10, Object obj11, Object obj12, Object obj13) {
                            t0a t0aVar2 = (t0a) obj11;
                            fid fidVar4 = (fid) obj12;
                            int intValue4 = ((Integer) obj13).intValue();
                            if ((intValue4 & 48) == 0) {
                                intValue4 |= ((bts) fidVar4).k(t0aVar2) ? 32 : 16;
                            }
                            bts btsVar8 = (bts) fidVar4;
                            boolean V2 = btsVar8.V(intValue4 & 1, (intValue4 & 145) != 144);
                            zy11 zy11Var3 = zy11.a;
                            if (!V2) {
                                btsVar8.Y();
                                return zy11Var3;
                            }
                            if (jl40.l(t0aVar2, s0a.a)) {
                                btsVar8.e0(65637559);
                                bz9.d(btsVar8, 0);
                                btsVar8.t(false);
                                return zy11Var3;
                            }
                            boolean z6 = t0aVar2 instanceof q0a;
                            tls tlsVar6 = tls.this;
                            o430 o430Var2 = did.a;
                            if (z6) {
                                btsVar8.e0(65762582);
                                boolean k4 = btsVar8.k(tlsVar6) | ((intValue4 & 112) == 32);
                                Object Q5 = btsVar8.Q();
                                if (k4 || Q5 == o430Var2) {
                                    Q5 = new ChargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$1$1(tlsVar6, t0aVar2, null);
                                    btsVar8.o0(Q5);
                                }
                                zpn.e(btsVar8, (wls) Q5, zy11Var3);
                                q0a q0aVar = (q0a) t0aVar2;
                                b.d(q0aVar.a, q0aVar.b, q0aVar.c, q0aVar.d, q0aVar.e, tlsVar6, oip0Var, btsVar8, 8);
                                btsVar8.t(false);
                                return zy11Var3;
                            }
                            if (!(t0aVar2 instanceof r0a)) {
                                throw unr0.y(-1660451429, btsVar8, false);
                            }
                            btsVar8.e0(66632566);
                            boolean k5 = btsVar8.k(tlsVar6);
                            Object Q6 = btsVar8.Q();
                            if (k5 || Q6 == o430Var2) {
                                Q6 = new ChargersFeedbackScreenKt$ChargersFeedbackScreen$2$2$2$1(tlsVar6, null);
                                btsVar8.o0(Q6);
                            }
                            zpn.e(btsVar8, (wls) Q6, t0aVar2);
                            btsVar8.t(false);
                            return zy11Var3;
                        }
                    }, btsVar7), btsVar7, 1794048, 12);
                } else {
                    btsVar7.Y();
                }
                return zy11Var2;
            case 4:
                mex0 mex0Var = (mex0) obj6;
                tls tlsVar6 = (tls) obj7;
                tls tlsVar7 = (tls) obj5;
                mex0 mex0Var2 = (mex0) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((bts) fidVar4).k(mex0Var2) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar4;
                if (btsVar8.V(intValue4 & 1, (intValue4 & 145) != 144)) {
                    quz0 quz0Var = mex0Var != null ? mex0Var.i : null;
                    qm4 qm4Var = mex0Var2.h;
                    if (qm4Var instanceof qm4) {
                        qm4 qm4Var2 = mex0Var != null ? mex0Var.h : null;
                        if (!(qm4Var2 instanceof qm4)) {
                            qm4Var2 = null;
                        }
                        qm4Var = new qm4(qm4Var.a, qm4Var.b, qm4Var.c, qm4Var2 != null ? qm4Var2.d : null);
                    }
                    com.yandex.go.summary.ui.compose.common.tariffcell.a.g(mex0.a(mex0Var2, null, qm4Var, quz0Var, 3711), null, tlsVar6, tlsVar7, btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11Var2;
            case 5:
                final tse tseVar = (tse) obj6;
                final b bVar2 = (b) obj7;
                androidx.compose.runtime.internal.a aVar = (androidx.compose.runtime.internal.a) obj5;
                Integer num = (Integer) obj2;
                final int intValue5 = num.intValue();
                fid fidVar5 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= fidVar5.c(intValue5) ? 32 : 16;
                }
                if ((intValue6 & 145) == 144) {
                    bts btsVar9 = (bts) fidVar5;
                    if (btsVar9.E()) {
                        btsVar9.Y();
                        return zy11Var2;
                    }
                }
                f530 v = ljs0.v(c530Var, null, 3);
                bts btsVar10 = (bts) fidVar5;
                boolean e2 = fidVar5.e(tseVar) | btsVar10.k(bVar2) | ((intValue6 & 112) == 32);
                Object Q5 = btsVar10.Q();
                if (e2 || Q5 == o430Var) {
                    Q5 = new sls() { // from class: com.yandex.smartcamera.arscene.ui.b
                        @Override // defpackage.sls
                        public final Object invoke() {
                            tje.N(tse.this, null, null, new HorizontalCenteringSwitcherKt$HorizontalCenteringSwitcher$4$2$1$1$1$1$1(intValue5, bVar2, null), 3);
                            return zy11.a;
                        }
                    };
                    btsVar10.o0(Q5);
                }
                f530 c = q791.c(v, (sls) Q5);
                z910 d5 = pi6.d(x4c.b, false);
                int S = cma1.S(fidVar5);
                r1b0 o8 = btsVar10.o();
                f530 d6 = androidx.compose.ui.b.d(fidVar5, c);
                ohd.G1.getClass();
                sls slsVar5 = d.b;
                if (btsVar10.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar10.i0();
                if (btsVar10.S) {
                    btsVar10.n(slsVar5);
                } else {
                    btsVar10.r0();
                }
                qje.W(fidVar5, d.f, d5);
                qje.W(fidVar5, d.e, o8);
                wls wlsVar5 = d.g;
                if (btsVar10.S || !jl40.l(btsVar10.Q(), Integer.valueOf(S))) {
                    b64.z(S, btsVar10, S, wlsVar5);
                }
                qje.W(fidVar5, d.d, d6);
                aVar.invoke(num, fidVar5, Integer.valueOf((intValue6 >> 3) & 14));
                btsVar10.t(true);
                return zy11Var2;
            case 6:
                ArrayList arrayList = (ArrayList) obj6;
                final tls tlsVar8 = (tls) obj7;
                final tls tlsVar9 = (tls) obj5;
                int intValue7 = ((Integer) obj2).intValue();
                fid fidVar6 = (fid) obj3;
                ((Integer) obj4).getClass();
                if (intValue7 <= scc.f(arrayList)) {
                    final ox00 ox00Var = (ox00) arrayList.get(intValue7);
                    f530 o9 = an91.o(ljs0.e(c530Var, 82.0f), 0.0f, 0.0f, 8.0f, 0.0f, 11);
                    z910 d7 = pi6.d(x4c.b, false);
                    bts btsVar11 = (bts) fidVar6;
                    int hashCode5 = Long.hashCode(btsVar11.T);
                    r1b0 o10 = btsVar11.o();
                    f530 d8 = androidx.compose.ui.b.d(fidVar6, o9);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    bts btsVar12 = (bts) fidVar6;
                    if (btsVar12.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar12.i0();
                    if (btsVar12.S) {
                        btsVar12.n(slsVar6);
                    } else {
                        btsVar12.r0();
                    }
                    qje.W(fidVar6, d.f, d7);
                    qje.W(fidVar6, d.e, o10);
                    wls wlsVar6 = d.g;
                    if (btsVar12.S || !jl40.l(btsVar12.Q(), Integer.valueOf(hashCode5))) {
                        b64.z(hashCode5, btsVar12, hashCode5, wlsVar6);
                    }
                    qje.W(fidVar6, d.d, d8);
                    uo5 uo5Var = x4c.B;
                    cj6 cj6Var = cj6.a;
                    f530 a5 = cj6Var.a(c530Var, uo5Var);
                    nx00 nx00Var = ox00Var.b;
                    mx00 mx00Var = ox00Var.d;
                    byk0 d9 = cyk0.d(24.0f, 24.0f, mx00Var != null ? 8.0f : 24.0f, 24.0f);
                    boolean k4 = btsVar12.k(tlsVar8) | btsVar12.k(ox00Var);
                    Object Q6 = btsVar12.Q();
                    if (k4 || Q6 == o430Var) {
                        z = false;
                        final boolean z6 = false ? 1 : 0;
                        Q6 = new sls() { // from class: rx00
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i4 = z6;
                                zy11 zy11Var3 = zy11.a;
                                ox00 ox00Var2 = ox00Var;
                                tls tlsVar10 = tlsVar8;
                                switch (i4) {
                                    case 0:
                                        tlsVar10.invoke(ox00Var2.a);
                                        ox00Var2.e.invoke();
                                        break;
                                    default:
                                        tlsVar10.invoke(ox00Var2.a);
                                        break;
                                }
                                return zy11Var3;
                            }
                        };
                        btsVar12.o0(Q6);
                    } else {
                        z = false;
                    }
                    fid fidVar7 = fidVar6;
                    ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.f(a5, nx00Var, d9, (sls) Q6, fidVar7, 0);
                    v4v v4vVar = ox00Var.b.f;
                    if (v4vVar == null) {
                        btsVar12.e0(494848145);
                        btsVar12.t(z);
                    } else {
                        btsVar12.e0(494848146);
                        s3b1.f(v4vVar, cj6Var.a(ljs0.n(c530Var, 90.0f, 82.0f), x4c.z), null, fidVar7, 0, 4);
                        fidVar7 = fidVar7;
                        z = false;
                        btsVar12.t(false);
                    }
                    if (mx00Var == null) {
                        btsVar12.e0(495154735);
                        btsVar12.t(z);
                        z2 = true;
                    } else {
                        btsVar12.e0(495154736);
                        f530 a6 = cj6Var.a(c530Var, x4c.C);
                        boolean k5 = btsVar12.k(tlsVar9) | btsVar12.k(ox00Var);
                        Object Q7 = btsVar12.Q();
                        if (k5 || Q7 == o430Var) {
                            z2 = true;
                            final boolean z7 = true ? 1 : 0;
                            Q7 = new sls() { // from class: rx00
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i4 = z7;
                                    zy11 zy11Var3 = zy11.a;
                                    ox00 ox00Var2 = ox00Var;
                                    tls tlsVar10 = tlsVar9;
                                    switch (i4) {
                                        case 0:
                                            tlsVar10.invoke(ox00Var2.a);
                                            ox00Var2.e.invoke();
                                            break;
                                        default:
                                            tlsVar10.invoke(ox00Var2.a);
                                            break;
                                    }
                                    return zy11Var3;
                                }
                            };
                            btsVar12.o0(Q7);
                        } else {
                            z2 = true;
                        }
                        ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager.b.a(a6, mx00Var, (sls) Q7, fidVar7, 0);
                        btsVar12.t(false);
                    }
                    btsVar12.t(z2);
                }
                return zy11Var2;
            case 7:
                List list3 = (List) obj6;
                ll30 ll30Var = (ll30) obj5;
                tls tlsVar10 = (tls) obj7;
                int intValue8 = ((Integer) obj2).intValue();
                fid fidVar8 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                if ((intValue9 & 48) == 0) {
                    intValue9 |= fidVar8.c(intValue8) ? 32 : 16;
                }
                bts btsVar13 = (bts) fidVar8;
                if (btsVar13.V(intValue9 & 1, (intValue9 & 145) != 144)) {
                    gk30 gk30Var = (gk30) list3.get(intValue8);
                    if (gk30Var instanceof fd30) {
                        btsVar13.e0(734232488);
                        cl91.e((fd30) gk30Var, ll30Var, tlsVar10, btsVar13, 0);
                        btsVar13.t(false);
                    } else {
                        if (!(gk30Var instanceof pn30)) {
                            throw unr0.y(734230370, btsVar13, false);
                        }
                        btsVar13.e0(734234733);
                        cl91.l(btsVar13, 0);
                        btsVar13.t(false);
                    }
                } else {
                    btsVar13.Y();
                }
                return zy11Var2;
            case 8:
                gji0 gji0Var = qke.q;
                nl30 nl30Var = (nl30) obj6;
                tls tlsVar11 = (tls) obj7;
                ll30 ll30Var2 = (ll30) obj5;
                fid fidVar9 = (fid) obj3;
                int intValue10 = ((Integer) obj4).intValue();
                bts btsVar14 = (bts) fidVar9;
                if (btsVar14.V(intValue10 & 1, (intValue10 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    hk30 hk30Var = nl30Var.l;
                    if (hk30Var != null) {
                        btsVar14.e0(1454537709);
                        f530 u = ljs0.u(c530Var, null, 3);
                        WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
                        oob1.a(hk30Var, tlsVar11, bzk0.c(an91.o(u, 0.0f, 0.0f, 0.0f, w8a1.f(vuz.o(btsVar14).e, btsVar14).a(), 7), AppColor$Palette.CardDivider, gji0Var), btsVar14, 0);
                        btsVar14.t(false);
                    } else {
                        btsVar14.e0(1454905059);
                        f530 u2 = ljs0.u(c530Var, null, 3);
                        WeakHashMap weakHashMap2 = androidx.compose.foundation.layout.a.w;
                        f530 c2 = bzk0.c(an91.o(u2, 0.0f, 0.0f, 0.0f, w8a1.f(vuz.o(btsVar14).e, btsVar14).a(), 7), AppColor$Palette.CardDivider, gji0Var);
                        sic a7 = qic.a(g43Var, x4c.G, btsVar14, 0);
                        int hashCode6 = Long.hashCode(btsVar14.T);
                        r1b0 o11 = btsVar14.o();
                        f530 d10 = androidx.compose.ui.b.d(btsVar14, c2);
                        ohd.G1.getClass();
                        sls slsVar7 = d.b;
                        if (btsVar14.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar14.i0();
                        if (btsVar14.S) {
                            btsVar14.n(slsVar7);
                        } else {
                            btsVar14.r0();
                        }
                        qje.W(btsVar14, d.f, a7);
                        qje.W(btsVar14, d.e, o11);
                        qje.W(btsVar14, d.g, Integer.valueOf(hashCode6));
                        qje.M(btsVar14, d.h);
                        qje.W(btsVar14, d.d, d10);
                        cl91.s(nl30Var.a, nl30Var.d, nl30Var.f, nl30Var.e, ll30Var2, tlsVar11, nl30Var.b, btsVar14, 0);
                        if (nl30Var.c) {
                            tse0.s(btsVar14, 1816497330, c530Var, 2.0f, btsVar14);
                            btsVar14.t(false);
                        } else {
                            btsVar14.e0(1816560756);
                            btsVar14.t(false);
                        }
                        f530 c3 = ljs0.c(c530Var, 1.0f);
                        boolean z8 = nl30Var.g;
                        boolean z9 = nl30Var.b;
                        List list4 = nl30Var.j;
                        if (list4 == null) {
                            list4 = EmptyList.a;
                        }
                        cl91.p(c3, new y7m(329.0f), false, list4, nl30Var.h, nl30Var.i, nl30Var.k, tlsVar11, ll30Var2, z8, z9, btsVar14, 438);
                        btsVar14.t(true);
                        btsVar14.t(false);
                    }
                } else {
                    btsVar14.Y();
                }
                return zy11Var2;
            case 9:
                ku30 ku30Var = (ku30) obj6;
                tls tlsVar12 = (tls) obj7;
                sls slsVar8 = (sls) obj5;
                j690 j690Var3 = (j690) obj2;
                fid fidVar10 = (fid) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                if ((intValue11 & 48) == 0) {
                    intValue11 |= ((bts) fidVar10).k(j690Var3) ? 32 : 16;
                }
                bts btsVar15 = (bts) fidVar10;
                if (btsVar15.V(intValue11 & 1, (intValue11 & 145) != 144)) {
                    f530 o12 = an91.o(an91.j(ljs0.c(c530Var, 1.0f), j690Var3), 0.0f, 0.0f, 0.0f, ru.yandex.taxi.masstransit.geopayment.purchase.a.e, 7);
                    sic a8 = qic.a(g43Var, x4c.G, btsVar15, 0);
                    int hashCode7 = Long.hashCode(btsVar15.T);
                    r1b0 o13 = btsVar15.o();
                    f530 d11 = androidx.compose.ui.b.d(btsVar15, o12);
                    ohd.G1.getClass();
                    sls slsVar9 = d.b;
                    if (btsVar15.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar15.i0();
                    if (btsVar15.S) {
                        btsVar15.n(slsVar9);
                    } else {
                        btsVar15.r0();
                    }
                    qje.W(btsVar15, d.f, a8);
                    qje.W(btsVar15, d.e, o13);
                    qje.W(btsVar15, d.g, Integer.valueOf(hashCode7));
                    qje.M(btsVar15, d.h);
                    qje.W(btsVar15, d.d, d11);
                    if (ku30Var.a.length() > 0) {
                        btsVar15.e0(1573418992);
                        z3 = false;
                        ru.yandex.taxi.masstransit.geopayment.purchase.a.c(ku30Var.a, btsVar15, 0);
                        btsVar15.t(false);
                    } else {
                        z3 = false;
                        btsVar15.e0(1573474730);
                        btsVar15.t(false);
                    }
                    oeb1.c(btsVar15, ljs0.e(c530Var, 2.0f));
                    x2y x2yVar = new x2y(1.0f, z3);
                    boolean k6 = btsVar15.k(ku30Var) | btsVar15.k(tlsVar12) | btsVar15.k(slsVar8);
                    Object Q8 = btsVar15.Q();
                    if (k6 || Q8 == o430Var) {
                        Q8 = new ynn(ku30Var, tlsVar12, slsVar8, 28);
                        btsVar15.o0(Q8);
                    }
                    adb1.a(x2yVar, null, null, null, null, null, false, null, (tls) Q8, btsVar15, 0, 510);
                    btsVar15.t(true);
                } else {
                    btsVar15.Y();
                }
                return zy11Var2;
            case 10:
                return b(obj, obj2, obj3, obj4);
            case 11:
                return d(obj, obj2, obj3, obj4);
            case 12:
                List list5 = (List) obj6;
                ugh ughVar = (ugh) obj5;
                tls tlsVar13 = (tls) obj7;
                int intValue12 = ((Integer) obj2).intValue();
                fid fidVar11 = (fid) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                if ((intValue13 & 48) == 0) {
                    intValue13 |= fidVar11.c(intValue12) ? 32 : 16;
                }
                bts btsVar16 = (bts) fidVar11;
                if (btsVar16.V(intValue13 & 1, (intValue13 & 145) != 144)) {
                    u510 u510Var = (u510) kotlin.collections.a.S(intValue12, list5);
                    if (u510Var != null) {
                        com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.d.d(u510Var, ughVar.k() == intValue12, tlsVar13, btsVar16, 0);
                    }
                } else {
                    btsVar16.Y();
                }
                return zy11Var2;
            case 13:
                return e(obj, obj2, obj3, obj4);
            case 14:
                return f(obj, obj2, obj3, obj4);
            case 15:
                return g(obj, obj2, obj3, obj4);
            case 16:
                return i(obj, obj2, obj3, obj4);
            case 17:
                return j(obj, obj2, obj3, obj4);
            case 18:
                return k(obj, obj2, obj3, obj4);
            case 19:
                return l(obj, obj2, obj3, obj4);
            case 20:
                return m(obj, obj2, obj3, obj4);
            default:
                tls tlsVar14 = (tls) obj7;
                final e541 e541Var = (e541) obj6;
                tls tlsVar15 = (tls) obj5;
                j690 j690Var4 = (j690) obj2;
                fid fidVar12 = (fid) obj3;
                int intValue14 = ((Integer) obj4).intValue();
                if ((intValue14 & 48) == 0) {
                    z4 = true;
                    intValue14 |= ((bts) fidVar12).k(j690Var4) ? 32 : 16;
                } else {
                    z4 = true;
                }
                int i4 = intValue14;
                bts btsVar17 = (bts) fidVar12;
                boolean V2 = btsVar17.V(i4 & 1, (i4 & 145) != 144 ? z4 : false);
                dmw0 dmw0Var3 = btsVar17.a;
                if (!V2) {
                    btsVar17.Y();
                    return zy11Var2;
                }
                btsVar17.e0(-342380981);
                fwi fwiVar = (fwi) btsVar17.m(j.h);
                WeakHashMap weakHashMap3 = androidx.compose.foundation.layout.a.w;
                int f0 = fwiVar.f0(w8a1.f(vuz.o(btsVar17).e, btsVar17).a());
                btsVar17.t(false);
                f530 o14 = an91.o(an91.j(ljs0.u(ljs0.c(c530Var, 1.0f), null, 3), j690Var4), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                boolean k7 = btsVar17.k(tlsVar14) | btsVar17.c(f0);
                Object Q9 = btsVar17.Q();
                if (k7 || Q9 == o430Var) {
                    Q9 = new yj50(f0, 2, tlsVar14);
                    btsVar17.o0(Q9);
                }
                f530 y = eja1.y(o14, (tls) Q9);
                sic a9 = qic.a(g43Var, x4c.G, btsVar17, 0);
                int hashCode8 = Long.hashCode(btsVar17.T);
                r1b0 o15 = btsVar17.o();
                f530 d12 = androidx.compose.ui.b.d(btsVar17, y);
                ohd.G1.getClass();
                sls slsVar10 = d.b;
                if (dmw0Var3 == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar17.i0();
                if (btsVar17.S) {
                    btsVar17.n(slsVar10);
                } else {
                    btsVar17.r0();
                }
                wls wlsVar7 = d.f;
                qje.W(btsVar17, wlsVar7, a9);
                wls wlsVar8 = d.e;
                qje.W(btsVar17, wlsVar8, o15);
                Integer valueOf2 = Integer.valueOf(hashCode8);
                wls wlsVar9 = d.g;
                qje.W(btsVar17, wlsVar9, valueOf2);
                tls tlsVar16 = d.h;
                qje.M(btsVar17, tlsVar16);
                wls wlsVar10 = d.d;
                qje.W(btsVar17, wlsVar10, d12);
                boolean z10 = e541Var.d;
                t741 t741Var = e541Var.a;
                if (z10) {
                    btsVar17.e0(1179956489);
                    boolean e3 = btsVar17.e(e541Var);
                    Object Q10 = btsVar17.Q();
                    if (e3 || Q10 == o430Var) {
                        Q10 = new tls() { // from class: w441
                            @Override // defpackage.tls
                            public final Object invoke(Object obj10) {
                                int i5 = i2;
                                zy11 zy11Var3 = zy11.a;
                                e541 e541Var2 = e541Var;
                                mnq0 mnq0Var = (mnq0) obj10;
                                switch (i5) {
                                    case 0:
                                        androidx.compose.ui.semantics.f.l(mnq0Var, e541Var2.a.b);
                                        break;
                                    default:
                                        androidx.compose.ui.semantics.f.l(mnq0Var, e541Var2.a.b);
                                        break;
                                }
                                return zy11Var3;
                            }
                        };
                        btsVar17.o0(Q10);
                    }
                    f530 b = fnq0.b(c530Var, false, (tls) Q10);
                    boolean z11 = z4;
                    final int i5 = z11 ? 1 : 0;
                    ydb1.a(b, null, wwg.S(-1297559570, z11, new zls() { // from class: u441
                        @Override // defpackage.zls
                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                            int i6 = i5;
                            zy11 zy11Var3 = zy11.a;
                            e541 e541Var2 = e541Var;
                            switch (i6) {
                                case 0:
                                    fid fidVar13 = (fid) obj11;
                                    int intValue15 = ((Integer) obj12).intValue();
                                    bts btsVar18 = (bts) fidVar13;
                                    if (!btsVar18.V(1 & intValue15, (intValue15 & 17) != 16)) {
                                        btsVar18.Y();
                                        break;
                                    } else {
                                        jeb1.f(e541Var2.a.f, null, AppColor$Palette.TextOnControl, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar18).g.b, btsVar18, 384, 0, 16378);
                                        break;
                                    }
                                default:
                                    ebp0 ebp0Var = (ebp0) obj10;
                                    fid fidVar14 = (fid) obj11;
                                    int intValue16 = ((Integer) obj12).intValue();
                                    if ((intValue16 & 6) == 0) {
                                        intValue16 |= ((bts) fidVar14).k(ebp0Var) ? 4 : 2;
                                    }
                                    bts btsVar19 = (bts) fidVar14;
                                    if (!btsVar19.V(intValue16 & 1, (intValue16 & 19) != 18)) {
                                        btsVar19.Y();
                                        break;
                                    } else {
                                        p9b1.c(ebp0Var, e541Var2.a.a, c530.a, tp2.a, xya1.e(btsVar19).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar19).h.a, 2, Integer.MAX_VALUE, null, btsVar19, intValue16 & 14, 0, 0);
                                        break;
                                    }
                            }
                            return zy11Var3;
                        }
                    }, btsVar17), null, null, null, null, false, btsVar17, 384, 250);
                    yrl.c(an91.m(c530Var, 0.0f, 8.0f, z11 ? 1 : 0), null, btsVar17, 6, 6);
                    btsVar17.t(false);
                    tlsVar = tlsVar15;
                    zy11Var = zy11Var2;
                } else {
                    btsVar17.e0(1180370091);
                    zy11Var = zy11Var2;
                    f530 m = an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 6.5f, z4 ? 1 : 0);
                    z910 d13 = pi6.d(x4c.y, false);
                    tlsVar = tlsVar15;
                    int hashCode9 = Long.hashCode(btsVar17.T);
                    r1b0 o16 = btsVar17.o();
                    f530 d14 = androidx.compose.ui.b.d(btsVar17, m);
                    btsVar17.i0();
                    if (btsVar17.S) {
                        btsVar17.n(slsVar10);
                    } else {
                        btsVar17.r0();
                    }
                    qje.W(btsVar17, wlsVar7, d13);
                    qje.W(btsVar17, wlsVar8, o16);
                    vfc.v(hashCode9, btsVar17, wlsVar9, btsVar17, tlsVar16);
                    qje.W(btsVar17, wlsVar10, d14);
                    boolean e4 = btsVar17.e(e541Var);
                    Object Q11 = btsVar17.Q();
                    if (e4 || Q11 == o430Var) {
                        final int i6 = 1;
                        Q11 = new tls() { // from class: w441
                            @Override // defpackage.tls
                            public final Object invoke(Object obj10) {
                                int i52 = i6;
                                zy11 zy11Var3 = zy11.a;
                                e541 e541Var2 = e541Var;
                                mnq0 mnq0Var = (mnq0) obj10;
                                switch (i52) {
                                    case 0:
                                        androidx.compose.ui.semantics.f.l(mnq0Var, e541Var2.a.b);
                                        break;
                                    default:
                                        androidx.compose.ui.semantics.f.l(mnq0Var, e541Var2.a.b);
                                        break;
                                }
                                return zy11Var3;
                            }
                        };
                        btsVar17.o0(Q11);
                    }
                    jeb1.f(t741Var.a, fnq0.b(c530Var, false, (tls) Q11), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar17).g.a, btsVar17, 384, 0, 16376);
                    btsVar17.t(true);
                    btsVar17.t(false);
                }
                gub1.b(t741Var.e, ljs0.u(ljs0.c(c530Var, 1.0f), null, 3), null, null, null, null, null, null, null, false, e541Var.d, null, false, btsVar17, 48, 0, 7164);
                f530 c4 = ljs0.c(an91.k(c530Var, 8.0f), 1.0f);
                tls tlsVar17 = tlsVar;
                boolean k8 = btsVar17.k(tlsVar17);
                Object Q12 = btsVar17.Q();
                if (k8 || Q12 == o430Var) {
                    Q12 = new fc01(20, tlsVar17);
                    btsVar17.o0(Q12);
                }
                final int i7 = 0;
                ohb1.b(c4, false, null, (sls) Q12, wwg.S(-1790396747, true, new zls() { // from class: u441
                    @Override // defpackage.zls
                    public final Object invoke(Object obj10, Object obj11, Object obj12) {
                        int i62 = i7;
                        zy11 zy11Var3 = zy11.a;
                        e541 e541Var2 = e541Var;
                        switch (i62) {
                            case 0:
                                fid fidVar13 = (fid) obj11;
                                int intValue15 = ((Integer) obj12).intValue();
                                bts btsVar18 = (bts) fidVar13;
                                if (!btsVar18.V(1 & intValue15, (intValue15 & 17) != 16)) {
                                    btsVar18.Y();
                                    break;
                                } else {
                                    jeb1.f(e541Var2.a.f, null, AppColor$Palette.TextOnControl, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar18).g.b, btsVar18, 384, 0, 16378);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var = (ebp0) obj10;
                                fid fidVar14 = (fid) obj11;
                                int intValue16 = ((Integer) obj12).intValue();
                                if ((intValue16 & 6) == 0) {
                                    intValue16 |= ((bts) fidVar14).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar19 = (bts) fidVar14;
                                if (!btsVar19.V(intValue16 & 1, (intValue16 & 19) != 18)) {
                                    btsVar19.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, e541Var2.a.a, c530.a, tp2.a, xya1.e(btsVar19).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar19).h.a, 2, Integer.MAX_VALUE, null, btsVar19, intValue16 & 14, 0, 0);
                                    break;
                                }
                        }
                        return zy11Var3;
                    }
                }, btsVar17), btsVar17, 24582, 6);
                btsVar17.t(true);
                return zy11Var;
        }
    }

    public /* synthetic */ dhj0(tls tlsVar, Object obj, Object obj2, int i) {
        this.a = i;
        this.c = tlsVar;
        this.b = obj;
        this.w = obj2;
    }

    public /* synthetic */ dhj0(Object obj, Object obj2, tls tlsVar, int i) {
        this.a = i;
        this.b = obj;
        this.w = obj2;
        this.c = tlsVar;
    }
}
