package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class ngb1 {
    public static Class a;
    public static Method b;
    public static Method c;
    public static Method d;

    public static final void a(y09 y09Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        c530 c530Var;
        wls wlsVar;
        boolean z;
        boolean z2;
        CharSequence charSequence = y09Var.f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1453880556);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(y09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar2) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            f530 c2 = ljs0.c(c530Var2, 1.0f);
            boolean z3 = y09Var.i != null;
            boolean z4 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar.Q();
            if (z4 || Q == did.a) {
                Q = new cs8(6, tlsVar, y09Var);
                btsVar.o0(Q);
            }
            f530 o = an91.o(rx21.c(c2, z3, (tls) Q), 8.0f, 0.0f, 0.0f, 0.0f, 14);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, o);
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
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, a2);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o2);
            wls wlsVar4 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar4);
            }
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d2);
            t09 t09Var = y09Var.d;
            if (t09Var == null) {
                btsVar.e0(-1006414614);
                btsVar.t(false);
            } else {
                btsVar.e0(-1006414613);
                b(t09Var, btsVar, 0);
                btsVar.t(false);
            }
            f530 k = an91.m(new x2y(1.0f, true), 0.0f, 16.0f, 1).k(new pa31(x4c.E));
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar2, a3);
            qje.W(btsVar, wlsVar3, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
            }
            qje.W(btsVar, wlsVar5, d3);
            int i3 = i2;
            zgb1.a(y09Var.e, null, 8388611, false, null, null, false, new jrn(2), btsVar, 12583296, 122);
            if (charSequence == null) {
                btsVar.e0(-1672346935);
                btsVar.t(false);
            } else {
                btsVar.e0(-1672346934);
                zgb1.a(charSequence, an91.o(c530Var2, 0.0f, 2.0f, 0.0f, 0.0f, 13), 8388611, false, null, null, false, null, btsVar, 432, 248);
                btsVar = btsVar;
                btsVar.t(false);
            }
            CharSequence charSequence2 = y09Var.g;
            if (charSequence2 == null) {
                btsVar.e0(-1672083652);
                btsVar.t(false);
                c530Var = c530Var2;
                wlsVar = wlsVar2;
                z = true;
            } else {
                btsVar.e0(-1672083651);
                float f = charSequence == null ? 2.0f : 8.0f;
                c530Var = c530Var2;
                wlsVar = wlsVar2;
                z = true;
                zgb1.a(charSequence2, an91.o(c530Var2, 0.0f, f, 0.0f, 0.0f, 13), 8388611, false, null, null, false, new jrn(1), btsVar, 12583296, 120);
                btsVar.t(false);
            }
            btsVar.t(z);
            jvs0 jvs0Var = y09Var.h;
            if (jvs0Var == null) {
                btsVar.e0(-1005332342);
                btsVar.t(false);
                z2 = true;
            } else {
                btsVar.e0(-1005332341);
                f530 e = ljs0.e(c530Var, 85.0f);
                z910 d4 = pi6.d(x4c.y, false);
                int hashCode3 = Long.hashCode(btsVar.T);
                r1b0 o4 = btsVar.o();
                f530 d5 = b.d(btsVar, e);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d4);
                qje.W(btsVar, wlsVar3, o4);
                if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                    b64.z(hashCode3, btsVar, hashCode3, wlsVar4);
                }
                qje.W(btsVar, wlsVar5, d5);
                a.a(jvs0Var, true, true, tlsVar2, tlsVar, btsVar, ((i3 << 3) & 7168) | 432 | ((i3 << 9) & HProv.ALG_CLASS_ALL), 0);
                z2 = true;
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) y09Var, (Object) tlsVar, (Object) tlsVar2, i, 0);
        }
    }

    public static final void b(t09 t09Var, fid fidVar, int i) {
        long j;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-635442143);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(t09Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            y7m y7mVar = t09Var.c;
            y7m y7mVar2 = y7mVar != null ? (y7m) y6i0.a(y7mVar, new y7m(0.0f)) : null;
            byk0 c2 = y7mVar2 != null ? cyk0.c(y7mVar2.a) : null;
            if (c2 == null) {
                btsVar.e0(-774537049);
                c2 = ((YandexShapes) btsVar.m(qm51.a)).b();
            } else {
                btsVar.e0(-774539808);
            }
            btsVar.t(false);
            ldc ldcVar = t09Var.b;
            if (ldcVar == null) {
                btsVar.e0(-774534776);
                j = ((el51) btsVar.m(gl51.a)).d();
                btsVar.t(false);
            } else {
                btsVar.e0(-774536109);
                btsVar.t(false);
                j = ldcVar.a;
            }
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d3 = b.d(btsVar, c530Var);
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
            qje.W(btsVar, wlsVar, d2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d3);
            f530 l = ymb1.l(m4m0.b(an91.k(ljs0.m(c530Var, 85.0f), 8.0f), j, c2), c2);
            z910 d4 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d5 = b.d(btsVar, l);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d5);
            s3b1.f(t09Var.a, null, null, btsVar, 0, 6);
            btsVar.t(true);
            qj4 qj4Var = t09Var.d;
            if (qj4Var == null) {
                btsVar.e0(1977886140);
                btsVar.t(false);
            } else {
                btsVar.e0(1977886141);
                y3b1.c(qj4Var.a, sm91.e(cj6.a.a(c530Var, x4c.w), -4.0f, 4.0f), qj4Var.b, qj4Var.c, btsVar, 0, 16);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hh8(t09Var, i, 7);
        }
    }

    public static final void c(int i, fid fidVar, f530 f530Var, List list) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-672035343);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.e(list) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 k = f530Var.k(an91.l(m4m0.b(c530.a, ldc.l, qke.q), 10.0f, 8.0f));
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            btsVar.e0(-1958752967);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                bfu0 bfu0Var = ((zeu0) it.next()).a;
                if (bfu0Var instanceof on1) {
                    btsVar.e0(-174302991);
                    ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets.a.a((on1) bfu0Var, btsVar, 0);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-174232404);
                    btsVar.t(false);
                }
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lga(f530Var, list, i);
        }
    }

    public static Object d(mcz mczVar, String str) {
        Class cls;
        Object invoke;
        long j = mczVar.b;
        Class cls2 = Integer.TYPE;
        try {
            if (a == null) {
                a = Class.forName("android.location.LocationRequest");
            }
            Method method = b;
            cls = Long.TYPE;
            if (method == null) {
                Method declaredMethod = a.getDeclaredMethod("createFromDeprecatedProvider", String.class, cls, Float.TYPE, Boolean.TYPE);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            invoke = b.invoke(null, str, Long.valueOf(j), Float.valueOf(mczVar.d), Boolean.FALSE);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        if (invoke == null) {
            return null;
        }
        if (c == null) {
            Method declaredMethod2 = a.getDeclaredMethod("setQuality", cls2);
            c = declaredMethod2;
            declaredMethod2.setAccessible(true);
        }
        c.invoke(invoke, Integer.valueOf(mczVar.a));
        if (d == null) {
            Method declaredMethod3 = a.getDeclaredMethod("setFastestInterval", cls);
            d = declaredMethod3;
            declaredMethod3.setAccessible(true);
        }
        Method method2 = d;
        long j2 = mczVar.c;
        if (j2 != -1) {
            j = j2;
        }
        method2.invoke(invoke, Long.valueOf(j));
        return invoke;
    }
}
