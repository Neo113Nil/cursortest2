package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaFontWeight;

/* loaded from: classes5.dex */
public abstract class aib1 {
    public static final void a(List list, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-340226647);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 m = an91.m(pw91.l(c530.a, pw91.o(btsVar), 14), 16.0f, 0.0f, 2);
            lhl0 a = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            btsVar.e0(1365769366);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ehb1.a(null, (qo9) it.next(), tlsVar, btsVar, (i2 << 3) & 896);
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i7a(list, tlsVar, i, i3);
        }
    }

    public static final void b(f530 f530Var, cyu0 cyu0Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        bts btsVar;
        f530 f530Var3;
        lzr lzrVar;
        int i4;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2133330790);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = (btsVar2.k(f530Var2) ? 4 : 2) | i;
        }
        int i6 = i3 | (btsVar2.k(cyu0Var) ? 32 : 16);
        if (btsVar2.V(i6 & 1, (i6 & 19) != 18)) {
            f530Var3 = i5 != 0 ? c530.a : f530Var2;
            String str = cyu0Var.a;
            ety0 b = rx21.b(cyu0Var.b, btsVar2);
            YaFontWeight yaFontWeight = cyu0Var.c;
            if (yaFontWeight == null) {
                btsVar2.e0(1426722695);
                btsVar2.t(false);
                lzrVar = null;
            } else {
                btsVar2.e0(1431496634);
                int i7 = kx21.b[yaFontWeight.ordinal()];
                if (i7 == 1) {
                    lzrVar = lzr.C;
                } else if (i7 == 2) {
                    lzrVar = lzr.D;
                } else if (i7 == 3) {
                    lzrVar = lzr.E;
                } else if (i7 == 4) {
                    lzrVar = lzr.G;
                } else {
                    if (i7 != 5) {
                        w511.b();
                        return;
                    }
                    lzrVar = lzr.H;
                }
                btsVar2.t(false);
            }
            long j = cyu0Var.d;
            int i8 = cyu0Var.e;
            int i9 = kx21.c[cyu0Var.f.ordinal()];
            if (i9 == 1) {
                i4 = 1;
            } else {
                if (i9 != 2) {
                    w511.b();
                    return;
                }
                i4 = 2;
            }
            btsVar = btsVar2;
            wqy0.b(str, f530Var3, j, 0L, null, lzrVar, null, 0L, null, null, 0L, i4, false, i8, 0, null, b, btsVar, (i6 << 3) & 112, 0, 55256);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(f530Var3, cyu0Var, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(f530 f530Var, cyu0 cyu0Var, cyu0 cyu0Var2, it1 it1Var, fid fidVar, int i, int i2) {
        int i3;
        it1 it1Var2;
        it1 it1Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1435369625);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (btsVar.k(cyu0Var) ? 32 : 16) | (btsVar.k(cyu0Var2) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i5 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            it1Var2 = it1Var;
            i5 |= btsVar.k(it1Var2) ? 2048 : 1024;
            if (btsVar.V(i5 & 1, (i5 & 1171) == 1170)) {
                btsVar.Y();
                it1Var3 = it1Var2;
            } else {
                if (i4 != 0) {
                    f530Var = c530.a;
                }
                it1 it1Var4 = i6 != 0 ? x4c.G : it1Var2;
                sic a = qic.a(lr20.e, it1Var4, btsVar, (((((i5 >> 3) & 896) | ((i5 & 14) | 48)) >> 3) & 112) | 6);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, f530Var);
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
                qje.W(btsVar, d.d, d);
                if (cyu0Var == null) {
                    btsVar.e0(371134269);
                    btsVar.t(false);
                } else {
                    btsVar.e0(371134270);
                    b(null, cyu0Var, btsVar, 0, 1);
                    btsVar.t(false);
                }
                if (cyu0Var2 == null) {
                    btsVar.e0(371203709);
                    btsVar.t(false);
                } else {
                    btsVar.e0(371203710);
                    b(null, cyu0Var2, btsVar, 0, 1);
                    btsVar.t(false);
                }
                btsVar.t(true);
                it1Var3 = it1Var4;
            }
            f530 f530Var2 = f530Var;
            v = btsVar.v();
            if (v == null) {
                v.d = new p91(f530Var2, cyu0Var, cyu0Var2, it1Var3, i, i2, 13);
                return;
            }
            return;
        }
        it1Var2 = it1Var;
        if (btsVar.V(i5 & 1, (i5 & 1171) == 1170)) {
        }
        f530 f530Var22 = f530Var;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static OkHttpGlideModule d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (newInstance instanceof OkHttpGlideModule) {
                    return (OkHttpGlideModule) newInstance;
                }
                kbs.g(qv10.o("Expected instanceof GlideModule, but found: ", newInstance));
                return null;
            } catch (IllegalAccessException e) {
                e(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                e(cls, e2);
                throw null;
            } catch (NoSuchMethodException e3) {
                e(cls, e3);
                throw null;
            } catch (InvocationTargetException e4) {
                e(cls, e4);
                throw null;
            }
        } catch (ClassNotFoundException e5) {
            yci0.p("Unable to find GlideModule implementation", e5);
            return null;
        }
    }

    public static void e(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(qv10.l(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }
}
