package defpackage;

import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class mi91 {
    public static final void a(q1a0 q1a0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1541944984);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(q1a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new xvq(14);
                btsVar.o0(Q);
            }
            w2o o = k.o(1, (tls) Q, null);
            so5 so5Var = x4c.G;
            int i4 = 3;
            w2o a = o.a(k.a(null, so5Var, 13)).a(k.e(null, 3));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new xvq(15);
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            ttb1.a(q1a0Var, c530Var, a, k.t(1, (tls) Q2, null).a(k.i(null, so5Var, 13)).a(k.f(null, 3)), "AnimatedPaymentInfoButton", wwg.S(-704120938, true, new o91(i4, tlsVar), btsVar), btsVar, (i3 & 14) | 224640 | (i3 & 112), 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0s(q1a0Var, f530Var2, tlsVar, i, 1);
        }
    }

    public static final void b(phx0 phx0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2020443380);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(phx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            Object Q = btsVar.Q();
            int i5 = 29;
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(i5);
                btsVar.o0(Q);
            }
            w2o o = k.o(1, (tls) Q, null);
            so5 so5Var = x4c.I;
            w2o a = o.a(k.a(null, so5Var, 13)).a(k.e(null, 3));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(i5);
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            ttb1.a(phx0Var, c530Var, a, k.t(1, (tls) Q2, null).a(k.i(null, so5Var, 13)).a(k.f(null, 3)), "AnimatedTariffOptionsButton", wwg.S(-1917212092, true, new o91(i3, tlsVar), btsVar), btsVar, (i4 & 14) | 224640 | (i4 & 112), 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e0s(phx0Var, f530Var2, tlsVar, i, 1);
        }
    }

    public static final void c(qzr qzrVar, f530 f530Var, tls tlsVar, tls tlsVar2, yur yurVar, fid fidVar, int i) {
        f530 f530Var2;
        tls tlsVar3 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(118998962);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(qzrVar) ? 4 : 2) | 48 | (btsVar.e(tlsVar3) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024) | (btsVar.k(yurVar) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar4 = d.h;
            qje.M(btsVar, tlsVar4);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            uo5 uo5Var = x4c.b;
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar4);
            qje.W(btsVar, wlsVar4, d3);
            oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
            int i3 = i2 & 896;
            a(qzrVar.a, null, tlsVar3, btsVar, i3);
            btsVar.t(true);
            e(qzrVar.b, hi91.d(gi91.b(new x2y(1.0f, true), yurVar), false, null, 3), tlsVar3, tlsVar2, btsVar, i2 & 8064);
            tlsVar3 = tlsVar3;
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar4);
            qje.W(btsVar, wlsVar4, d5);
            oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
            b(qzrVar.c, null, tlsVar3, btsVar, i3);
            btsVar.t(true);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0((Object) qzrVar, f530Var2, tlsVar3, (cms) tlsVar2, (Object) yurVar, i, 17);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(w0s w0sVar, f530 f530Var, tls tlsVar, tls tlsVar2, qor qorVar, yur yurVar, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        tls tlsVar3;
        int i5;
        qor qorVar2;
        int i6;
        yur yurVar2;
        int i7;
        f530 f530Var3;
        tls tlsVar4;
        qor qorVar3;
        yur yurVar3;
        aii0 v;
        float f;
        qor qorVar4;
        yur yurVar4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-311348728);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(w0sVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.e(tlsVar) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                tlsVar3 = tlsVar2;
                i3 |= btsVar.e(tlsVar3) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
                } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    qorVar2 = qorVar;
                    i3 |= btsVar.k(qorVar2) ? 16384 : 8192;
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= ImageMetadata.EDGE_MODE;
                    } else if ((196608 & i) == 0) {
                        yurVar2 = yurVar;
                        i3 |= btsVar.k(yurVar2) ? 131072 : 65536;
                        i7 = i3;
                        if (btsVar.V(i7 & 1, (74899 & i7) != 74898)) {
                            f530 f530Var4 = i8 != 0 ? c530.a : f530Var2;
                            Object obj = did.a;
                            if (i4 != 0) {
                                Object Q = btsVar.Q();
                                if (Q == obj) {
                                    Q = new xvq(12);
                                    btsVar.o0(Q);
                                }
                                tlsVar4 = (tls) Q;
                            } else {
                                tlsVar4 = tlsVar3;
                            }
                            if (i5 != 0) {
                                Object Q2 = btsVar.Q();
                                if (Q2 == obj) {
                                    Q2 = f.f(1.0f);
                                    btsVar.o0(Q2);
                                }
                                tx40 tx40Var = (tx40) Q2;
                                f = 1.0f;
                                qorVar4 = tx40Var;
                            } else {
                                f = 1.0f;
                                qorVar4 = qorVar2;
                            }
                            if (i6 != 0) {
                                Object Q3 = btsVar.Q();
                                if (Q3 == obj) {
                                    Q3 = vfc.g(btsVar);
                                }
                                yurVar4 = (yur) Q3;
                            } else {
                                yurVar4 = yurVar2;
                            }
                            f530 f530Var5 = f530Var4;
                            dta1.a(f530Var5, false, jeb1.g(androidx.compose.animation.core.b.b(w0sVar.a ? f : 0.0f, null, null, null, btsVar, 0, 30)), false, false, wwg.S(505174532, true, new vg0(w0sVar, qorVar4, tlsVar, tlsVar4, yurVar4), btsVar), btsVar, ((i7 >> 3) & 14) | 221184, 10);
                            btsVar = btsVar;
                            yurVar3 = yurVar4;
                            qorVar3 = qorVar4;
                            f530Var3 = f530Var5;
                        } else {
                            btsVar.Y();
                            f530Var3 = f530Var2;
                            tlsVar4 = tlsVar3;
                            qorVar3 = qorVar2;
                            yurVar3 = yurVar2;
                        }
                        v = btsVar.v();
                        if (v != null) {
                            v.d = new tq0(w0sVar, f530Var3, tlsVar, tlsVar4, qorVar3, yurVar3, i, i2);
                            return;
                        }
                        return;
                    }
                    yurVar2 = yurVar;
                    i7 = i3;
                    if (btsVar.V(i7 & 1, (74899 & i7) != 74898)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                qorVar2 = qorVar;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                yurVar2 = yurVar;
                i7 = i3;
                if (btsVar.V(i7 & 1, (74899 & i7) != 74898)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            tlsVar3 = tlsVar2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            qorVar2 = qorVar;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            yurVar2 = yurVar;
            i7 = i3;
            if (btsVar.V(i7 & 1, (74899 & i7) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        if ((i & 384) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        tlsVar3 = tlsVar2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        qorVar2 = qorVar;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        yurVar2 = yurVar;
        i7 = i3;
        if (btsVar.V(i7 & 1, (74899 & i7) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final void e(dj70 dj70Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-798513804);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(dj70Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            dj70Var.getClass();
            wp2 wp2Var = dj70Var.c;
            wp2 wp2Var2 = dj70Var.d;
            boolean k = btsVar.k(wp2Var2) | btsVar.k(wp2Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (k || Q == o430Var) {
                Q = new gz6(wp2Var2, wp2Var);
                btsVar.o0(Q);
            }
            gz6 gz6Var = (gz6) Q;
            kh91.b(dj70Var.f, tlsVar2, btsVar, (i2 >> 6) & 112);
            boolean z = (i2 & 14) == 4;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new s1r(11, dj70Var);
                btsVar.o0(Q2);
            }
            f530 b = fnq0.b(f530Var, false, (tls) Q2);
            boolean z2 = dj70Var.e;
            ButtonSize buttonSize = ButtonSize.L;
            ButtonForm buttonForm = ButtonForm.Squircle;
            boolean k2 = ((i2 & 896) == 256) | btsVar.k(l0s.a);
            Object Q3 = btsVar.Q();
            if (k2 || Q3 == o430Var) {
                Q3 = new azd(24, tlsVar);
                btsVar.o0(Q3);
            }
            d17.a(b, null, z2, buttonSize, gz6Var, buttonForm, (sls) Q3, wwg.S(1938279371, true, new zzr(dj70Var, i3), btsVar), btsVar, 12782592);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new g0((Object) dj70Var, tlsVar, (Object) f530Var, (Object) tlsVar2, i, 27);
        }
    }

    public static final void f(final q1a0 q1a0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1652704811);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(q1a0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        final int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            q1a0Var.getClass();
            awk0 awk0Var = new awk0(0);
            boolean a = ((i2 & 896) == 256) | btsVar.a(true) | btsVar.k(m0s.a);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (a || Q == o430Var) {
                Q = new azd(25, tlsVar);
                btsVar.o0(Q);
            }
            f530 a2 = vmb1.a(f530Var, true, awk0Var, (sls) Q, 14);
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new tls() { // from class: a0s
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i5 = r2;
                        zy11 zy11Var = zy11.a;
                        q1a0 q1a0Var2 = q1a0Var;
                        switch (i5) {
                            case 0:
                                androidx.compose.ui.semantics.f.l((mnq0) obj, q1a0Var2.c);
                                break;
                            default:
                                CompositePaymentIconsView.update$default((CompositePaymentIconsView) obj, q1a0Var2.a, q1a0Var2.b, false, null, 8, null);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q2);
            }
            f530 a3 = fnq0.a(a2, (tls) Q2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a3);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            k3r k3rVar = ljs0.c;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = new xvq(13);
                btsVar.o0(Q3);
            }
            tls tlsVar2 = (tls) Q3;
            r5 = i4 == 4 ? 1 : 0;
            Object Q4 = btsVar.Q();
            if (r5 != 0 || Q4 == o430Var) {
                Q4 = new tls() { // from class: a0s
                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        int i5 = i3;
                        zy11 zy11Var = zy11.a;
                        q1a0 q1a0Var2 = q1a0Var;
                        switch (i5) {
                            case 0:
                                androidx.compose.ui.semantics.f.l((mnq0) obj, q1a0Var2.c);
                                break;
                            default:
                                CompositePaymentIconsView.update$default((CompositePaymentIconsView) obj, q1a0Var2.a, q1a0Var2.b, false, null, 8, null);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar.o0(Q4);
            }
            androidx.compose.ui.viewinterop.b.a(tlsVar2, k3rVar, (tls) Q4, btsVar, 54, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0s(q1a0Var, f530Var, tlsVar, i, 0);
        }
    }

    public static final void g(final phx0 phx0Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(805967817);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(phx0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        final int i4 = 0;
        final int i5 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            t0s t0sVar = phx0Var.b;
            btsVar.e0(1720352402);
            int i6 = i2 & 896;
            boolean e = (i6 == 256) | btsVar.e(t0sVar);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new c0s(tlsVar, t0sVar, 0);
                btsVar.o0(Q);
            }
            f530 a = vmb1.a(f530Var, false, null, (sls) Q, 31);
            boolean e2 = ((i2 & 14) == 4) | (i6 == 256) | btsVar.e(t0sVar);
            Object Q2 = btsVar.Q();
            if (e2 || Q2 == o430Var) {
                Q2 = new ynn(phx0Var, tlsVar, t0sVar, i3);
                btsVar.o0(Q2);
            }
            f530 a2 = fnq0.a(a, (tls) Q2);
            btsVar.t(false);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a2);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            f4b1.a(wwg.S(1174641787, true, new zls() { // from class: d0s
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i4;
                    zy11 zy11Var = zy11.a;
                    phx0 phx0Var2 = phx0Var;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i7) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                mi91.h(phx0Var2.c, null, btsVar2, 0);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                sya1.a(phx0Var2.a, ljs0.m(an91.m(c530.a, 0.0f, 8.0f, 1), 24.0f), null, null, btsVar3, 48, 12);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, 0.0f, 0.0f, wwg.S(-267197057, true, new zls() { // from class: d0s
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i5;
                    zy11 zy11Var = zy11.a;
                    phx0 phx0Var2 = phx0Var;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i7) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                mi91.h(phx0Var2.c, null, btsVar2, 0);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                sya1.a(phx0Var2.a, ljs0.m(an91.m(c530.a, 0.0f, 8.0f, 1), 24.0f), null, null, btsVar3, 48, 12);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 24582, 14);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e0s(phx0Var, f530Var, tlsVar, i, 0);
        }
    }

    public static final void h(ohx0 ohx0Var, f530 f530Var, fid fidVar, int i) {
        ohx0 ohx0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-456788514);
        int i2 = (btsVar.k(ohx0Var) ? 4 : 2) | i | 48;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            n7d.a.getClass();
            c530 c530Var = c530.a;
            ohx0Var2 = ohx0Var;
            ttb1.a(ohx0Var2, c530Var, null, null, "TariffOptionsButtonBadge", n7d.b, btsVar, (i2 & 14) | 221232, 12);
            f530Var = c530Var;
        } else {
            ohx0Var2 = ohx0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(ohx0Var2, f530Var, i, 16);
        }
    }

    public static final ArrayList i(List list, ke31 ke31Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ur31 ur31Var = (ur31) it.next();
            ArrayList<ur31> i = i(ur31Var.e, ke31Var);
            ArrayList arrayList2 = new ArrayList();
            for (ur31 ur31Var2 : i) {
                ycc.r(ur31Var2.d == null ? ur31Var2.e : Collections.singletonList(ur31Var2), arrayList2);
            }
            ycc.r(Boolean.TRUE.booleanValue() ? Collections.singletonList(new ur31(ur31Var.a, ur31Var.b, ur31Var.c, ur31Var.d, arrayList2, ur31Var.f, ur31Var.g)) : Collections.singletonList(new ur31("<root>", -1, f6w.e, null, arrayList2, null, null)), arrayList);
        }
        return arrayList;
    }

    public static final String j(List list, int i, ke31 ke31Var) {
        String u = cvu0.u(i, Extension.DOT_CHAR);
        StringBuilder sb = new StringBuilder();
        for (ur31 ur31Var : a.x0(i(list, ke31Var), uvc.a(new ke31(18), new ke31(19), new ke31(20)))) {
            if (ur31Var.d != null) {
                sb.append(u + '|' + ur31Var.a + ':' + ur31Var.b);
                sb.append('\n');
            } else {
                sb.append(u + "|<root>");
                sb.append('\n');
            }
            String obj = evu0.k0(j(ur31Var.e, i + 1, ke31Var)).toString();
            if (obj.length() > 0) {
                sb.append(obj);
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    public static rbv k(ThemedImageUrlEntity themedImageUrlEntity) {
        return job1.f(themedImageUrlEntity, new i4b0(2, null));
    }
}
