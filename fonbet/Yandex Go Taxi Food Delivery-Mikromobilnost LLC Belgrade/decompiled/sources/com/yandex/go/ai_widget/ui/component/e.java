package com.yandex.go.ai_widget.ui.component;

import androidx.compose.runtime.f;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.j;
import com.yandex.go.ai_widget.ui.component.e;
import defpackage.aii0;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.do1;
import defpackage.eo1;
import defpackage.exw0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.gi91;
import defpackage.hi91;
import defpackage.ip1;
import defpackage.j01;
import defpackage.m0;
import defpackage.m3u0;
import defpackage.nnm;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.scc;
import defpackage.sls;
import defpackage.t0;
import defpackage.teb;
import defpackage.tls;
import defpackage.vfc;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.yur;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zls;
import defpackage.zpn;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class e {
    public static final void a(b bVar, androidx.compose.runtime.internal.a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(726925538);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new j01(19);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(c530.a, false, (tls) Q);
            boolean z = (i2 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new eo1(2, bVar);
                btsVar.o0(Q2);
            }
            f530 a = androidx.compose.ui.graphics.d.a(b, (tls) Q2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, a);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            nnm.p((i2 >> 3) & 14, aVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(bVar, aVar, i, 16);
        }
    }

    public static final void b(final int i, final boolean z, b bVar, final int i2, androidx.compose.runtime.internal.a aVar, fid fidVar, final int i3) {
        int i4;
        b bVar2;
        yur yurVar;
        boolean z2;
        f530 b;
        final androidx.compose.runtime.internal.a aVar2 = aVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(526911816);
        if ((i3 & 6) == 0) {
            i4 = (btsVar.c(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar.k(bVar) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar.c(i2) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar.e(aVar2) ? 16384 : 8192;
        }
        if (btsVar.V(i4 & 1, (i4 & 9363) != 9362)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = vfc.g(btsVar);
            }
            yur yurVar2 = (yur) Q;
            float floatValue = z ? ((Number) bVar.c.e()).floatValue() : 0.0f;
            float floatValue2 = z ? ((Number) bVar.d.e()).floatValue() : 0.0f;
            float b2 = z ? bVar.b() : 0.0f;
            float f = i != 0 ? i % 2 == 0 ? 6.0f : -6.0f : 0.0f;
            float w0 = fwiVar.w0(i * 16);
            final float f2 = floatValue;
            final float f3 = floatValue2;
            final float f4 = b2;
            final m3u0 b3 = androidx.compose.animation.core.b.b(f, sb2.K(300, 0, null, 6), null, null, btsVar, 48, 28);
            final m3u0 b4 = androidx.compose.animation.core.b.b(1.0f - (i * 0.02f), sb2.K(300, 0, null, 6), null, null, btsVar, 48, 28);
            final m3u0 b5 = androidx.compose.animation.core.b.b(w0, sb2.K(300, 0, null, 6), null, null, btsVar, 48, 28);
            Integer valueOf = Integer.valueOf(i2);
            boolean z3 = ((i4 & 7168) == 2048) | ((i4 & 112) == 32);
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                yurVar = yurVar2;
                Q2 = new AiWidgetEvaluationSwipeableCardKt$AiWidgetEvaluationSwipeableCard$1$1(z, i2, yurVar, null);
                btsVar.o0(Q2);
            } else {
                yurVar = yurVar2;
            }
            zpn.e(btsVar, (wls) Q2, valueOf);
            boolean b6 = btsVar.b(f2) | btsVar.k(b5) | btsVar.b(f3) | btsVar.k(b3) | btsVar.b(f4) | btsVar.k(b4);
            Object Q3 = btsVar.Q();
            if (b6 || Q3 == o430Var) {
                Q3 = new tls() { // from class: gp1
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        m2k0 m2k0Var = (m2k0) obj;
                        m2k0Var.D(f2);
                        m2k0Var.G(((Number) b5.getValue()).floatValue() + f3);
                        m2k0Var.q(((Number) b3.getValue()).floatValue() + f4);
                        m3u0 m3u0Var = b4;
                        m2k0Var.u(((Number) m3u0Var.getValue()).floatValue());
                        m2k0Var.v(((Number) m3u0Var.getValue()).floatValue());
                        return zy11.a;
                    }
                };
                btsVar.o0(Q3);
            }
            c530 c530Var = c530.a;
            f530 a = androidx.compose.ui.graphics.d.a(c530Var, (tls) Q3);
            if (z) {
                btsVar.e0(-874117619);
                Object Q4 = btsVar.Q();
                if (Q4 == o430Var) {
                    Q4 = new teb(20);
                    btsVar.o0(Q4);
                }
                z2 = true;
                f530 d = hi91.d(gi91.b(fnq0.b(c530Var, true, (tls) Q4), yurVar), false, null, 3);
                boolean z4 = (i4 & 896) == 256;
                Object Q5 = btsVar.Q();
                if (z4 || Q5 == o430Var) {
                    bVar2 = bVar;
                    Q5 = new ip1(0, bVar2);
                    btsVar.o0(Q5);
                } else {
                    bVar2 = bVar;
                }
                b = exw0.a(d, bVar2, (PointerInputEventHandler) Q5);
                btsVar.t(false);
            } else {
                bVar2 = bVar;
                z2 = true;
                btsVar.e0(-873666538);
                Object Q6 = btsVar.Q();
                if (Q6 == o430Var) {
                    Q6 = new j01(18);
                    btsVar.o0(Q6);
                }
                b = fnq0.b(c530Var, false, (tls) Q6);
                btsVar.t(false);
            }
            f530 k = a.k(b);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d2);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d3);
            aVar2 = aVar;
            nnm.p((i4 >> 12) & 14, aVar2, btsVar, z2);
        } else {
            bVar2 = bVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            final b bVar3 = bVar2;
            v.d = new wls() { // from class: hp1
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    e.b(i, z, bVar3, i2, aVar2, (fid) obj, vng.O(i3 | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void c(List list, b bVar, f530 f530Var, zls zlsVar, sls slsVar, final zls zlsVar2, fid fidVar, int i) {
        bts btsVar;
        List list2;
        yx40 yx40Var;
        oz40 oz40Var;
        boolean z;
        boolean z2;
        int i2;
        boolean z3;
        b bVar2 = bVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(359419711);
        int i3 = i | (btsVar2.k(list) ? 4 : 2) | (btsVar2.k(bVar2) ? 32 : 16) | (btsVar2.e(zlsVar) ? 2048 : 1024) | (btsVar2.e(slsVar) ? 16384 : 8192);
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            int i4 = i3 & 14;
            boolean z4 = i4 == 4;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (z4 || Q == o430Var) {
                Q = f.g(0);
                btsVar2.o0(Q);
            }
            yx40 yx40Var2 = (yx40) Q;
            Object Q2 = btsVar2.Q();
            if (Q2 == o430Var) {
                Q2 = f.j(null);
                btsVar2.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            boolean z5 = true;
            oz40 n = f.n(zlsVar, btsVar2);
            oz40 n2 = f.n(slsVar, btsVar2);
            do1 do1Var = (do1) kotlin.collections.a.S(yx40Var2.getIntValue(), list);
            int i5 = i3 & 112;
            boolean e = (i5 == 32) | btsVar2.e(do1Var);
            Object Q3 = btsVar2.Q();
            if (e || Q3 == o430Var) {
                Q3 = new AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$2$1(bVar2, do1Var, null);
                btsVar2.o0(Q3);
            }
            zpn.e(btsVar2, (wls) Q3, do1Var);
            boolean k = (i4 == 4) | (i5 == 32) | btsVar2.k(yx40Var2) | btsVar2.k(n) | btsVar2.k(n2);
            Object Q4 = btsVar2.Q();
            if (k || Q4 == o430Var) {
                AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1 aiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1 = new AiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1(bVar2, list, yx40Var2, oz40Var2, n, n2, null);
                list2 = list;
                yx40Var = yx40Var2;
                oz40Var = oz40Var2;
                bVar2 = bVar2;
                btsVar2.o0(aiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1);
                Q4 = aiWidgetEvaluationSwipeableStackKt$AiWidgetSwipeableStack$3$1;
            } else {
                list2 = list;
                oz40Var = oz40Var2;
                yx40Var = yx40Var2;
            }
            int i6 = (i3 >> 3) & 14;
            int i7 = i3 << 3;
            zpn.f(bVar2, list2, (wls) Q4, btsVar2);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (btsVar2.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, androidx.compose.ui.node.d.h);
            qje.W(btsVar2, androidx.compose.ui.node.d.d, d2);
            int intValue = yx40Var.getIntValue() + 1;
            int f = scc.f(list2);
            if (intValue > f) {
                intValue = f;
            }
            btsVar2.e0(1718135841);
            int intValue2 = yx40Var.getIntValue();
            if (intValue2 <= intValue) {
                while (true) {
                    final do1 do1Var2 = (do1) list2.get(intValue);
                    if (intValue == yx40Var.getIntValue()) {
                        i2 = intValue2;
                        z3 = z5;
                    } else {
                        i2 = intValue2;
                        z3 = false;
                    }
                    int i8 = intValue;
                    btsVar2.c0(1718139865, do1Var2.b());
                    int intValue3 = i8 - yx40Var.getIntValue();
                    int intValue4 = z3 ? yx40Var.getIntValue() : 0;
                    final int i9 = 0;
                    wls wlsVar = new wls() { // from class: jp1
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i10 = i9;
                            zy11 zy11Var = zy11.a;
                            do1 do1Var3 = do1Var2;
                            zls zlsVar3 = zlsVar2;
                            fid fidVar2 = (fid) obj;
                            int intValue5 = ((Integer) obj2).intValue();
                            switch (i10) {
                                case 0:
                                    bts btsVar3 = (bts) fidVar2;
                                    if (!btsVar3.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        zlsVar3.invoke(do1Var3, btsVar3, 0);
                                        break;
                                    }
                                default:
                                    bts btsVar4 = (bts) fidVar2;
                                    if (!btsVar4.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        zlsVar3.invoke(do1Var3, btsVar4, 0);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    };
                    int i10 = i2;
                    btsVar = btsVar2;
                    b(intValue3, z3, bVar2, intValue4, wwg.S(-1643866735, z5, wlsVar, btsVar2), btsVar, (i7 & 896) | HProv.ALG_CLASS_DATA_ENCRYPT);
                    z = false;
                    btsVar.t(false);
                    if (i8 == i10) {
                        break;
                    }
                    intValue = i8 - 1;
                    btsVar2 = btsVar;
                    intValue2 = i10;
                    z5 = true;
                    list2 = list;
                }
            } else {
                btsVar = btsVar2;
                z = false;
            }
            btsVar.t(z);
            final do1 do1Var3 = (do1) oz40Var.getValue();
            if (do1Var3 == null) {
                btsVar.e0(1723035009);
                btsVar.t(z);
                z2 = true;
            } else {
                btsVar.e0(1723035010);
                btsVar.c0(209719581, "exiting_" + do1Var3.b());
                z2 = true;
                final char c = 1 == true ? 1 : 0;
                a(bVar2, wwg.S(338542755, true, new wls() { // from class: jp1
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        int i102 = c;
                        zy11 zy11Var = zy11.a;
                        do1 do1Var32 = do1Var3;
                        zls zlsVar3 = zlsVar2;
                        fid fidVar2 = (fid) obj;
                        int intValue5 = ((Integer) obj2).intValue();
                        switch (i102) {
                            case 0:
                                bts btsVar3 = (bts) fidVar2;
                                if (!btsVar3.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    zlsVar3.invoke(do1Var32, btsVar3, 0);
                                    break;
                                }
                            default:
                                bts btsVar4 = (bts) fidVar2;
                                if (!btsVar4.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    zlsVar3.invoke(do1Var32, btsVar4, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), btsVar, i6 | 48);
                btsVar.t(false);
                btsVar.t(false);
            }
            btsVar.t(z2);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t0(list, bVar2, f530Var, zlsVar, slsVar, zlsVar2, i);
        }
    }
}
