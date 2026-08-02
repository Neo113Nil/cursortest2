package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class e5v {
    public static final hdu a = new hdu(AppColor$Palette.Text, AppColor$Palette.Background);
    public static final hdu b = new hdu(AppColor$Palette.ControlMinor, AppColor$Palette.TextOnControlMinor);
    public static final float c = 0.5f;

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, hdu hduVar, wp2 wp2Var, IconSpotSize iconSpotSize, zls zlsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        wp2 wp2Var2;
        int i4;
        IconSpotSize iconSpotSize2;
        f530 f530Var3;
        aii0 v;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2065306086);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            f530Var2 = f530Var;
        } else if ((i & 6) == 0) {
            f530Var2 = f530Var;
            i3 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        } else {
            f530Var2 = f530Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(hduVar) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            wp2Var2 = wp2Var;
            i3 |= btsVar.k(wp2Var2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= HProv.ALG_TYPE_SECURECHANNEL;
            } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.c(iconSpotSize == null ? -1 : iconSpotSize.ordinal()) ? 2048 : 1024;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar.e(zlsVar) ? 16384 : 8192;
            }
            if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                btsVar.Y();
                iconSpotSize2 = iconSpotSize;
                f530Var3 = f530Var2;
            } else {
                f530Var3 = i5 != 0 ? c530.a : f530Var2;
                if (i6 != 0) {
                    wp2Var2 = null;
                }
                IconSpotSize iconSpotSize3 = i4 != 0 ? IconSpotSize.M : iconSpotSize;
                if (hduVar != null) {
                    btsVar.e0(-2126852233);
                    k2z.a((wp2) hduVar.a, (wp2) hduVar.b, wwg.S(-1402237777, true, new wzr(f530Var3, iconSpotSize3, wp2Var2, zlsVar), btsVar), btsVar, 384);
                    btsVar.t(false);
                } else {
                    btsVar.e0(-2126453852);
                    f530 a2 = ljs0.a(f530Var3, iconSpotSize3.getSize(), iconSpotSize3.getSize());
                    if (wp2Var2 != null) {
                        a2 = b.a(a2, m.a(), new ctq(12, wp2Var2));
                    }
                    int i7 = ((i3 >> 3) & 7168) | 48;
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
                    ly3.x(((i7 >> 6) & 112) | 6, zlsVar, cj6.a, btsVar, true);
                    btsVar.t(false);
                }
                iconSpotSize2 = iconSpotSize3;
            }
            wp2 wp2Var3 = wp2Var2;
            v = btsVar.v();
            if (v == null) {
                v.d = new xg0(f530Var3, hduVar, wp2Var3, iconSpotSize2, zlsVar, i, i2, 10);
                return;
            }
            return;
        }
        wp2Var2 = wp2Var;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        wp2 wp2Var32 = wp2Var2;
        v = btsVar.v();
        if (v == null) {
        }
    }
}
