package defpackage;

import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.plus.text.PlusNewType;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class o6d0 {
    public static final mm4 a;
    public static final mm4 b;

    static {
        AppColor$Palette appColor$Palette = AppColor$Palette.Background;
        AppColor$Palette appColor$Palette2 = AppColor$Palette.Text;
        a = new mm4(appColor$Palette, appColor$Palette2, bm4.a);
        b = new mm4(appColor$Palette, appColor$Palette2, cm4.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(String str, f530 f530Var, BadgeSize badgeSize, mm4 mm4Var, PlusNewType plusNewType, boolean z, fid fidVar, int i, int i2) {
        int i3;
        f530 f530Var2;
        int i4;
        boolean z2;
        f530 f530Var3;
        boolean z3;
        aii0 v;
        f530 f530Var4;
        boolean z4;
        int i5;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1480337863);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar.k(f530Var2) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= btsVar.c(badgeSize == null ? -1 : badgeSize.ordinal()) ? 256 : 128;
            }
            if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                i3 |= btsVar.k(mm4Var) ? 2048 : 1024;
            }
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar.c(plusNewType != null ? plusNewType.ordinal() : -1) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= ImageMetadata.EDGE_MODE;
            } else if ((i & ImageMetadata.EDGE_MODE) == 0) {
                z2 = z;
                i3 |= btsVar.a(z2) ? 131072 : 65536;
                int i7 = 1;
                if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
                    btsVar.a0();
                    if ((i & 1) == 0 || btsVar.C()) {
                        f530Var4 = i6 != 0 ? c530.a : f530Var2;
                        if (i4 != 0) {
                            z4 = false;
                            btsVar.u();
                            i5 = n6d0.a[badgeSize.ordinal()];
                            if (i5 != 1) {
                                f = 6.0f;
                            } else if (i5 == 2) {
                                f = 4.0f;
                            } else {
                                if (i5 != 3) {
                                    w511.b();
                                    return;
                                }
                                f = 3.0f;
                            }
                            int i8 = i3 >> 6;
                            wk4.a(badgeSize, mm4Var, an91.d(6.5f, 0.0f, f, 0.0f, 10), f530Var4, wwg.S(-1528203658, true, new qtb(str, z4, i7, plusNewType), btsVar), btsVar, (i8 & 112) | (i8 & 14) | ImageMetadata.EDGE_MODE | ((i3 << 6) & 7168));
                            z3 = z4;
                            f530Var3 = f530Var4;
                        }
                    } else {
                        btsVar.Y();
                        f530Var4 = f530Var2;
                    }
                    z4 = z2;
                    btsVar.u();
                    i5 = n6d0.a[badgeSize.ordinal()];
                    if (i5 != 1) {
                    }
                    int i82 = i3 >> 6;
                    wk4.a(badgeSize, mm4Var, an91.d(6.5f, 0.0f, f, 0.0f, 10), f530Var4, wwg.S(-1528203658, true, new qtb(str, z4, i7, plusNewType), btsVar), btsVar, (i82 & 112) | (i82 & 14) | ImageMetadata.EDGE_MODE | ((i3 << 6) & 7168));
                    z3 = z4;
                    f530Var3 = f530Var4;
                } else {
                    btsVar.Y();
                    f530Var3 = f530Var2;
                    z3 = z2;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new rpm(str, f530Var3, badgeSize, mm4Var, plusNewType, z3, i, i2);
                    return;
                }
                return;
            }
            z2 = z;
            int i72 = 1;
            if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        if ((i & 384) == 0) {
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        int i722 = 1;
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }
}
