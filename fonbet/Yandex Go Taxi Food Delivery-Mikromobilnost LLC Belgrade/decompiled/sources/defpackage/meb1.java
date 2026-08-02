package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public abstract class meb1 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final f530 f530Var, final String str, wp2 wp2Var, wp2 wp2Var2, float f, wp2 wp2Var3, int i, int i2, final ety0 ety0Var, fid fidVar, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        float f2;
        final wp2 wp2Var4;
        final wp2 wp2Var5;
        final int i9;
        final int i10;
        final wp2 wp2Var6;
        aii0 v;
        wp2 wp2Var7;
        int i11;
        int i12;
        wp2 wp2Var8;
        wp2 wp2Var9;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1128142191);
        int i13 = i3 | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(str) ? 32 : 16);
        int i14 = 68992 | i13;
        int i15 = i4 & 64;
        if (i15 != 0) {
            i14 = 1641856 | i13;
        } else if ((i3 & 1572864) == 0) {
            i5 = i;
            i14 |= btsVar.c(i5) ? 1048576 : 524288;
            i6 = i4 & 128;
            if (i6 == 0) {
                i14 |= 12582912;
            } else if ((i3 & 12582912) == 0) {
                i7 = i2;
                i14 |= btsVar.c(i7) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                i8 = i14 | (btsVar.k(ety0Var) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
                if (btsVar.V(i8 & 1, (38347923 & i8) != 38347922)) {
                    btsVar.a0();
                    if ((i3 & 1) == 0 || btsVar.C()) {
                        wp2Var7 = AppColor$Palette.Text;
                        AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
                        vp2 vp2Var = new vp2(tje.n(appColor$Palette, btsVar), tje.n(appColor$Palette, btsVar));
                        int i16 = i8 & (-458753);
                        if (i15 != 0) {
                            i5 = Integer.MAX_VALUE;
                        }
                        i11 = i5;
                        if (i6 != 0) {
                            i12 = i16;
                            i7 = 1;
                        } else {
                            i12 = i16;
                        }
                        wp2Var8 = appColor$Palette;
                        wp2Var9 = vp2Var;
                    } else {
                        btsVar.Y();
                        wp2Var7 = wp2Var;
                        i11 = i5;
                        i12 = i8 & (-458753);
                        wp2Var8 = wp2Var2;
                        wp2Var9 = wp2Var3;
                    }
                    btsVar.u();
                    a7u0 a7u0Var = j.h;
                    f2 = f;
                    float w0 = ((fwi) btsVar.m(a7u0Var)).w0(f2);
                    float w02 = ((fwi) btsVar.m(a7u0Var)).w0(12.0f);
                    int i17 = i12 >> 15;
                    ety0 a = ety0.a(ety0Var, 0L, 0L, null, null, null, 0L, null, new bgr0(tje.n(wp2Var9, btsVar), 0L, w02), null, 0, 0L, null, null, 16769023);
                    z910 d = pi6.d(x4c.b, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d2 = b.d(btsVar, f530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    wp2 wp2Var10 = wp2Var9;
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
                    int i18 = i12 >> 3;
                    int i19 = (i12 << 6) & 1879048192;
                    int i20 = i17 & 112;
                    wp2 wp2Var11 = wp2Var8;
                    int i21 = i11;
                    int i22 = i7;
                    jeb1.f(str, null, wp2Var11, 0L, 0L, null, null, 0L, i22, false, i21, 0, null, ety0.a(a, tje.n(wp2Var8, btsVar), 0L, null, null, null, 0L, null, null, new jvu0(0, 0, 30, w0, 0.0f), 0, 0L, null, null, 16760830), btsVar, (i18 & 910) | i19, i20, 13818);
                    wp2 wp2Var12 = wp2Var7;
                    jeb1.f(str, null, wp2Var12, 0L, 0L, null, null, 0L, i22, false, i21, 0, null, ety0.a(a, tje.n(wp2Var7, btsVar), 0L, null, null, null, 0L, null, null, null, 0, 0L, null, null, 16777214), btsVar, (i18 & 14) | 384 | i19, i20, 13818);
                    btsVar.t(true);
                    wp2Var6 = wp2Var10;
                    wp2Var5 = wp2Var11;
                    wp2Var4 = wp2Var12;
                    i10 = i22;
                    i9 = i21;
                } else {
                    f2 = f;
                    btsVar.Y();
                    wp2Var4 = wp2Var;
                    wp2Var5 = wp2Var2;
                    i9 = i5;
                    i10 = i7;
                    wp2Var6 = wp2Var3;
                }
                v = btsVar.v();
                if (v != null) {
                    final float f3 = f2;
                    v.d = new wls() { // from class: hiy
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            meb1.a(f530.this, str, wp2Var4, wp2Var5, f3, wp2Var6, i9, i10, ety0Var, (fid) obj, vng.O(i3 | 1), i4);
                            return zy11.a;
                        }
                    };
                    return;
                }
                return;
            }
            i7 = i2;
            i8 = i14 | (btsVar.k(ety0Var) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
            if (btsVar.V(i8 & 1, (38347923 & i8) != 38347922)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        i5 = i;
        i6 = i4 & 128;
        if (i6 == 0) {
        }
        i7 = i2;
        i8 = i14 | (btsVar.k(ety0Var) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB);
        if (btsVar.V(i8 & 1, (38347923 & i8) != 38347922)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    public abstract Object c(sus0 sus0Var);
}
