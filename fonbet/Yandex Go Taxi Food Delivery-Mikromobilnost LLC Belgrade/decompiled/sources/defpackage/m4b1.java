package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.ContentAlignment;
import ru.yandex.taxi.banners.BannerType;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class m4b1 {
    public static final void a(qhv qhvVar, fid fidVar, int i) {
        int i2;
        int i3;
        f530 f530Var;
        int i4;
        int i5;
        int i6;
        ldc ldcVar = qhvVar.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(193743852);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(qhvVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i7 = 20;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(an91.j(ljs0.c(c530Var, 1.0f), qhvVar.i), qhvVar.d);
            if (ldcVar != null) {
                btsVar.e0(-612695822);
                f530Var = m4m0.b(ymb1.l(c530Var, ((YandexShapes) btsVar.m(qm51.a)).b()), ldcVar.a, qke.q);
                btsVar.t(false);
            } else {
                btsVar.e0(-612530778);
                btsVar.t(false);
                f530Var = c530Var;
            }
            f530 k = e.k(f530Var);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new teb(i7);
                btsVar.o0(Q);
            }
            f530 d = hi91.d(fnq0.a(k, (tls) Q), false, null, 2);
            so5 so5Var = x4c.G;
            sic a = qic.a(lr20.h, so5Var, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, d);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            x2y d3 = n.d(btsVar, d2, d.d, 1.0f, false);
            ContentAlignment contentAlignment = qhvVar.h;
            int[] iArr = iav.a;
            int i8 = iArr[contentAlignment.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    so5Var = x4c.H;
                } else {
                    if (i8 != 3) {
                        w511.b();
                        return;
                    }
                    so5Var = x4c.I;
                }
            }
            s3b1.f(qhvVar.g, d3.k(new ypu(so5Var)), null, btsVar, 0, 4);
            CharSequence charSequence = qhvVar.e;
            if (charSequence == null) {
                btsVar.e0(-243225433);
                btsVar.t(false);
                i6 = 20;
            } else {
                btsVar.e0(-243225432);
                f530 o2 = an91.o(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 16.0f, 16.0f, 2);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    i4 = 20;
                    Q2 = new teb(i4);
                    btsVar.o0(Q2);
                } else {
                    i4 = 20;
                }
                f530 d4 = hi91.d(fnq0.a(o2, (tls) Q2), false, null, 2);
                int i9 = iArr[qhvVar.f.ordinal()];
                if (i9 == 1) {
                    i5 = 8388611;
                } else if (i9 == 2) {
                    i5 = 17;
                } else {
                    if (i9 != 3) {
                        w511.b();
                        return;
                    }
                    i5 = 8388613;
                }
                i6 = i4;
                zgb1.a(charSequence, d4, i5 | 16, false, null, null, false, null, btsVar, 0, 248);
                btsVar = btsVar;
                btsVar.t(false);
            }
            btsVar.t(true);
            i3 = i6;
        } else {
            i3 = 20;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(qhvVar, i, i3);
        }
    }

    public static final i5p0 b(List list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof i5p0) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((i5p0) obj).c) {
                break;
            }
        }
        return (i5p0) obj;
    }

    public static final v770 c(BannerType bannerType) {
        int i = ft4.a[bannerType.ordinal()];
        if (i == 1) {
            return v770.f;
        }
        if (i == 2) {
            return v770.g;
        }
        if (i == 3) {
            return v770.i;
        }
        w511.b();
        return null;
    }
}
