package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.taxi.shared.pin.PinSize;
import java.util.WeakHashMap;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class jm91 {
    public static volatile boolean a = true;

    public static final void a(f530 f530Var, PinSize pinSize, q0c0 q0c0Var, a aVar, fid fidVar, int i) {
        int i2;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2101825854);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(pinSize == null ? -1 : pinSize.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(q0c0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(aVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) != 0 && !btsVar.C()) {
                btsVar.Y();
            }
            btsVar.u();
            boolean k = btsVar.k(ty2.a(btsVar));
            Object Q = btsVar.Q();
            if (k || Q == did.a) {
                Q = un91.a;
                btsVar.o0(Q);
            }
            vzb0 vzb0Var = (vzb0) Q;
            int i3 = bxb0.a[pinSize.ordinal()];
            if (i3 == 1) {
                vzb0Var.getClass();
                f = 14.0f;
            } else if (i3 == 2) {
                vzb0Var.getClass();
                f = 12.0f;
            } else if (i3 == 3) {
                vzb0Var.getClass();
                f = 8.0f;
            } else if (i3 != 4) {
                w511.b();
                return;
            } else {
                vzb0Var.getClass();
                f = 6.0f;
            }
            k2z.a(q0c0Var.a, q0c0Var.b, wwg.S(-1386155470, true, new zvc(f530Var, pinSize, f, aVar), btsVar), btsVar, 384);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new squ(f530Var, pinSize, q0c0Var, aVar, i);
        }
    }

    public static final void b(cu40 cu40Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-527598073);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(cu40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-307552405, true, new xt40(cu40Var, tlsVar), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(cu40Var, tlsVar, i, 25);
        }
    }

    public static final void c(cu40 cu40Var, tls tlsVar, fid fidVar, int i) {
        sls slsVar;
        c530 c530Var;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1006071479);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(cu40Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            oip0 o = pw91.o(btsVar);
            WeakHashMap weakHashMap = androidx.compose.foundation.layout.a.w;
            f530 o2 = an91.o(bzk0.c(pw91.u(ljs0.c, o, 14), AppColor$Palette.BgMinor, qke.q), 0.0f, w8a1.f(vuz.o(btsVar).f, btsVar).d(), 0.0f, 0.0f, 13);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d = b.d(btsVar, o2);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o3);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            d(tlsVar, btsVar, (i2 >> 3) & 14);
            c530 c530Var2 = c530.a;
            jeb1.f(cu40Var.a.toString(), an91.o(c530Var2, 30.0f, 32.0f, 30.0f, 0.0f, 8), null, uh6.E(46), 0L, null, null, uh6.E(45), 0, false, 0, 0, null, xya1.b(btsVar).e, btsVar, 100666368, 0, 16116);
            btsVar = btsVar;
            if (cu40Var.c != null) {
                btsVar.e0(-1971216418);
                slsVar = slsVar2;
                c530Var = c530Var2;
                qgy.b(cu40Var.c, null, an91.o(c530Var2, 30.0f, 16.0f, 30.0f, 0.0f, 8), null, uh6.E(16), 0L, null, 0L, 0, 0, 0, xya1.c(btsVar).g.a, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 12266);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                slsVar = slsVar2;
                c530Var = c530Var2;
                btsVar.e0(-1971021149);
                btsVar.t(false);
            }
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            oeb1.c(btsVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            if (cu40Var.d != null) {
                btsVar.e0(-1970946656);
                f530 e = ljs0.e(an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7), 408.0f);
                z910 d2 = pi6.d(x4c.c, false);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o4 = btsVar.o();
                f530 d3 = b.d(btsVar, e);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d2);
                qje.W(btsVar, wlsVar2, o4);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                qje.W(btsVar, wlsVar4, d3);
                f = 1.0f;
                v0b1.a(cu40Var.d, ljs0.c(c530Var, 1.0f), null, null, null, null, null, mhe.d, 0.0f, 0, btsVar, 12582960, 892);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                f = 1.0f;
                btsVar.e0(-1970605501);
                btsVar.t(false);
            }
            if (f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            oeb1.c(btsVar, new x2y(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, true));
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xt40(cu40Var, tlsVar, i);
        }
    }

    public static final void d(tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-645914127);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 22.0f, 24.0f, 0.0f, 9);
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 l = ymb1.l(ljs0.m(cj6.a.a(c530Var, x4c.z), 24.0f), cyk0.a);
            boolean z2 = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new s140(21, tlsVar);
                btsVar.o0(Q);
            }
            f530 d3 = q791.d(l, false, null, null, (sls) Q, 15);
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, d3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d5);
            au2 au2Var = ytb1.a;
            if (au2Var != null) {
                z = true;
            } else {
                lgv lgvVar = new lgv("CrossM", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                a6t0 a6t0Var = new a6t0(iq2.g);
                uq90 g = tse0.g(19.0f, 6.4f, 13.4f, 12.0f);
                g.i(5.6f, 5.59f);
                g.h(17.59f, 19.0f);
                g.h(12.0f, 13.4f);
                g.h(6.4f, 19.0f);
                g.h(5.0f, 17.59f);
                g.h(10.58f, 12.0f);
                g.h(5.0f, 6.4f);
                g.h(6.4f, 5.0f);
                g.i(5.6f, 5.58f);
                g.h(17.59f, 5.0f);
                g.c();
                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", g.a);
                z = true;
                au2Var = rya1.a(lgvVar.d(), true);
                ytb1.a = au2Var;
            }
            sya1.a(au2Var, null, ohb1.e(btsVar, xxh0.common_back), null, btsVar, 0, 10);
            btsVar.t(z);
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new yt40(i, 0, tlsVar);
        }
    }

    public static Drawable e(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return f(context2, i, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = wuj0.a;
        return resources.getDrawable(i, theme);
    }

    public static Drawable f(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, theme);
            contextThemeWrapper.applyOverrideConfiguration(theme.getResources().getConfiguration());
            context = contextThemeWrapper;
        }
        return vng.t(i, context);
    }
}
