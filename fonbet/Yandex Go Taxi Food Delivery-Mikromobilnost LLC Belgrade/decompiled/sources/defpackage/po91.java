package defpackage;

import android.net.Uri;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yx360.design.compose.atoms.DsButton$Size;
import com.yx360.design.compose.atoms.DsButton$State;
import com.yx360.design.compose.atoms.DsButton$Style;
import java.io.ByteArrayInputStream;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes4.dex */
public abstract class po91 {
    public static final int[] a = {1, 5, 9, 13, 17, 25, 33, 41, 49, 65, 81, 97, 113, 145, 177, 209, 241, 305, 369, 497, 753, 1265, 2289, 4337, 8433, 16625};
    public static final int[] b = {2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 24};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, 10, 14, 18, 26, 34, 50, 66, 98, 130, 194, 322, 578, 1090, 2114, 6210, 22594};
    public static final int[] d = {0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 12, 14, 24};
    public static final int[] e = {2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 14, 18, 22, 30, 38, 54, 70, 102, HProv.PP_CONTAINER_EXTENSION_DEL, 198, 326, 582, 1094, 2118};
    public static final int[] f = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10, 24};
    public static final int[] g = {0, 0, 8, 8, 0, 16, 8, 16, 16};
    public static final int[] h = {0, 8, 0, 8, 16, 0, 16, 8, 16};

    public static final void a(kk2 kk2Var, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, boolean z, DsButton$Size dsButton$Size, x3 x3Var, x3 x3Var2, String str, boolean z2, String str2, boolean z3, fid fidVar, int i, int i2) {
        int i3;
        x3 x3Var3;
        int i4;
        long b2;
        int i5;
        long j;
        long j2;
        long j3;
        float f2;
        float f3;
        boolean z4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-663434319);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(kk2Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.c(dsButton$Style.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(f530Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.a(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar.c(dsButton$Size == null ? -1 : dsButton$Size.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            x3Var3 = x3Var;
            i3 |= btsVar.e(x3Var3) ? 1048576 : 524288;
        } else {
            x3Var3 = x3Var;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar.e(x3Var2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((i & 100663296) == 0) {
            i3 |= btsVar.k(str) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        }
        if ((i & 805306368) == 0) {
            i3 |= btsVar.a(z2) ? 536870912 : SelfTester_JCP.IMITA;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (btsVar.k(str2) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= btsVar.a(z3) ? 32 : 16;
        }
        int i6 = i4;
        if ((i3 & 306783379) == 306783378 && (i6 & 19) == 18 && btsVar.E()) {
            btsVar.Y();
        } else {
            qnm qnmVar = qnm.a;
            long a0 = qnm.c(btsVar).a0();
            btsVar.e0(1849434622);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            btsVar.t(false);
            qxi a2 = ycb1.a(zx40Var, btsVar);
            boolean z5 = ((r17) a2.getValue()).a;
            btsVar.e0(-1633490746);
            boolean a3 = btsVar.a(z5) | ((i3 & HProv.ALG_CLASS_ALL) == 16384);
            Object Q2 = btsVar.Q();
            if (a3 || Q2 == o430Var) {
                Q2 = !z ? DsButton$State.Disabled : ((r17) a2.getValue()).a ? DsButton$State.Pressed : DsButton$State.Default;
                btsVar.o0(Q2);
            }
            DsButton$State dsButton$State = (DsButton$State) Q2;
            btsVar.t(false);
            switch (npm.a[dsButton$Style.ordinal()]) {
                case 1:
                    btsVar.e0(1068807673);
                    b2 = ldc.b(qnm.c(btsVar).g0(), 0.12f, 0.0f, 0.0f, 0.0f, 14);
                    i5 = i3;
                    j = qnm.b(btsVar).i;
                    j2 = qnm.b(btsVar).i;
                    long j4 = qnm.b(btsVar).i;
                    btsVar.t(false);
                    j3 = j4;
                    break;
                case 2:
                    btsVar.e0(1069089308);
                    b2 = ldc.b(qnm.c(btsVar).g0(), 0.12f, 0.0f, 0.0f, 0.0f, 14);
                    j = qnm.c(btsVar).h0();
                    j2 = qnm.c(btsVar).h0();
                    j3 = qnm.c(btsVar).h0();
                    btsVar.t(false);
                    i5 = i3;
                    break;
                case 3:
                    btsVar.e0(1069368866);
                    b2 = ldc.b(qnm.c(btsVar).g0(), 0.12f, 0.0f, 0.0f, 0.0f, 14);
                    j = qnm.c(btsVar).g0();
                    j2 = qnm.c(btsVar).g0();
                    j3 = qnm.c(btsVar).g0();
                    btsVar.t(false);
                    i5 = i3;
                    break;
                case 4:
                    btsVar.e0(1069646006);
                    b2 = ldc.b(qnm.c(btsVar).g0(), 0.12f, 0.0f, 0.0f, 0.0f, 14);
                    j = qnm.c(btsVar).j0();
                    j2 = qnm.c(btsVar).j0();
                    j3 = qnm.c(btsVar).j0();
                    btsVar.t(false);
                    i5 = i3;
                    break;
                case 5:
                    btsVar.e0(1069929997);
                    b2 = ldc.b(qnm.c(btsVar).g0(), 0.12f, 0.0f, 0.0f, 0.0f, 14);
                    j = qnm.c(btsVar).b0();
                    j2 = qnm.c(btsVar).b0();
                    j3 = qnm.c(btsVar).b0();
                    btsVar.t(false);
                    i5 = i3;
                    break;
                case 6:
                    btsVar.e0(1070223722);
                    b2 = ldc.b(qnm.c(btsVar).g0(), 0.12f, 0.0f, 0.0f, 0.0f, 14);
                    j = qnm.c(btsVar).d0();
                    j2 = qnm.c(btsVar).d0();
                    j3 = qnm.c(btsVar).d0();
                    btsVar.t(false);
                    i5 = i3;
                    break;
                case 7:
                    btsVar.e0(1070520330);
                    b2 = ldc.b(qnm.c(btsVar).g0(), 0.12f, 0.0f, 0.0f, 0.0f, 14);
                    j = qnm.c(btsVar).e0();
                    j2 = qnm.c(btsVar).e0();
                    j3 = qnm.c(btsVar).e0();
                    btsVar.t(false);
                    i5 = i3;
                    break;
                case 8:
                    btsVar.e0(1070813683);
                    b2 = ldc.b(qnm.c(btsVar).g0(), 0.12f, 0.0f, 0.0f, 0.0f, 14);
                    j = qnm.c(btsVar).c0();
                    j2 = qnm.c(btsVar).c0();
                    j3 = qnm.c(btsVar).c0();
                    btsVar.t(false);
                    i5 = i3;
                    break;
                default:
                    throw unr0.y(-1905184468, btsVar, false);
            }
            long j5 = b2;
            float f4 = ((r17) a2.getValue()).b;
            f530 b3 = gza1.b(f530Var, f4, f4);
            int[] iArr = npm.b;
            int i7 = i5;
            int i8 = iArr[dsButton$Size.ordinal()];
            if (i8 == 1) {
                qnm.c.getClass();
                f2 = 56.0f;
            } else if (i8 == 2) {
                qnm.c.getClass();
                f2 = 40.0f;
            } else if (i8 != 3) {
                w511.b();
                return;
            } else {
                qnm.c.getClass();
                f2 = 32.0f;
            }
            f530 g2 = ljs0.g(b3, f2, 0.0f, 2);
            int i9 = iArr[dsButton$Size.ordinal()];
            if (i9 == 1) {
                qnm.e.getClass();
                f3 = 16.0f;
            } else if (i9 == 2) {
                qnm.e.getClass();
                f3 = 12.0f;
            } else if (i9 != 3) {
                w511.b();
                return;
            } else {
                qnm.e.getClass();
                f3 = 10.0f;
            }
            f530 b4 = ycb1.b(q791.b(ymb1.l(g2, cyk0.c(f3)), zx40Var, null, (dsButton$State == DsButton$State.Disabled || z2) ? false : true, null, new awk0(0), slsVar, 8), z2, str2);
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, b4);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d2);
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d3);
            int i10 = i7 >> 9;
            mo91.a(kk2Var, dsButton$State, dsButton$Size, x3Var3, x3Var2, str, a0, j, j2, j3, z3, btsVar, (i7 & 14) | (i10 & 896) | (i10 & 7168) | (i10 & HProv.ALG_CLASS_ALL) | (i10 & ImageMetadata.JPEG_GPS_COORDINATES), (i6 >> 3) & 14, 0);
            btsVar.e0(-18520204);
            if (z2) {
                z4 = false;
                mo91.b(0, j5, btsVar, cj6.a.b(c530.a));
            } else {
                z4 = false;
            }
            btsVar.t(z4);
            btsVar.t(true);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mpm(kk2Var, slsVar, dsButton$Style, f530Var, z, dsButton$Size, x3Var, x3Var2, str, z2, str2, z3, i, i2, 1);
        }
    }

    public static final void b(kk2 kk2Var, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, boolean z, DsButton$Size dsButton$Size, pa90 pa90Var, pa90 pa90Var2, String str, boolean z2, String str2, boolean z3, fid fidVar, int i, int i2) {
        kk2 kk2Var2;
        int i3;
        f530 f530Var2;
        boolean z4;
        String str3;
        boolean z5;
        String str4;
        int i4;
        boolean z6;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(142184495);
        if ((i & 6) == 0) {
            kk2Var2 = kk2Var;
            i3 = (btsVar2.k(kk2Var2) ? 4 : 2) | i;
        } else {
            kk2Var2 = kk2Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar2.e(slsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar2.c(dsButton$Style.ordinal()) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i3 |= btsVar2.k(f530Var2) ? 2048 : 1024;
        } else {
            f530Var2 = f530Var;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            z4 = z;
            i3 |= btsVar2.a(z4) ? 16384 : 8192;
        } else {
            z4 = z;
        }
        if ((196608 & i) == 0) {
            i3 |= btsVar2.c(dsButton$Size == null ? -1 : dsButton$Size.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= btsVar2.e(pa90Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= btsVar2.e(pa90Var2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
        }
        if ((100663296 & i) == 0) {
            str3 = str;
            i3 |= btsVar2.k(str3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
        } else {
            str3 = str;
        }
        if ((805306368 & i) == 0) {
            z5 = z2;
            i3 |= btsVar2.a(z5) ? 536870912 : SelfTester_JCP.IMITA;
        } else {
            z5 = z2;
        }
        if ((i2 & 6) == 0) {
            str4 = str2;
            i4 = i2 | (btsVar2.k(str4) ? 4 : 2);
        } else {
            str4 = str2;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            z6 = z3;
            i4 |= btsVar2.a(z6) ? 32 : 16;
        } else {
            z6 = z3;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && btsVar2.E()) {
            btsVar2.Y();
            btsVar = btsVar2;
        } else {
            int i5 = 7;
            btsVar = btsVar2;
            a(kk2Var2, slsVar, dsButton$Style, f530Var2, z4, dsButton$Size, pa90Var != null ? new zom(i5, pa90Var) : null, pa90Var2 != null ? new zom(i5, pa90Var2) : null, str3, z5, str4, z6, btsVar, i3 & 2114453502, i4 & HProv.PP_DELETE_SAVED_PASSWD);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mpm(kk2Var, slsVar, dsButton$Style, f530Var, z, dsButton$Size, pa90Var, pa90Var2, str, z2, str2, z3, i, i2, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(String str, sls slsVar, DsButton$Style dsButton$Style, f530 f530Var, boolean z, DsButton$Size dsButton$Size, boolean z2, fid fidVar, int i, int i2, int i3) {
        f530 f530Var2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z4;
        bts btsVar;
        f530 f530Var3;
        boolean z5;
        DsButton$Size dsButton$Size2;
        boolean z6;
        aii0 v;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(139450017);
        int i10 = (btsVar2.k(str) ? 4 : 2) | i | (btsVar2.e(slsVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i10 |= btsVar2.c(dsButton$Style.ordinal()) ? 256 : 128;
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i10 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            f530Var2 = f530Var;
            i10 |= btsVar2.k(f530Var2) ? 2048 : 1024;
            i4 = i3 & 16;
            if (i4 == 0) {
                i5 = i10 | HProv.ALG_CLASS_DATA_ENCRYPT;
                z3 = z;
            } else {
                z3 = z;
                i5 = i10 | (btsVar2.a(z3) ? 16384 : 8192);
            }
            i6 = i3 & 32;
            int i12 = ImageMetadata.EDGE_MODE;
            if (i6 == 0) {
                if ((196608 & i) == 0) {
                    i12 = btsVar2.c(dsButton$Size == null ? -1 : dsButton$Size.ordinal()) ? 131072 : 65536;
                }
                i7 = i5 | ((i3 & 64) != 0 ? 1572864 : btsVar2.e(null) ? 1048576 : 524288) | ((i3 & 128) != 0 ? 12582912 : btsVar2.e(null) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | ((i3 & 256) != 0 ? 100663296 : btsVar2.k(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | ((i3 & 512) != 0 ? 805306368 : btsVar2.a(false) ? 536870912 : SelfTester_JCP.IMITA);
                if ((i3 & 1024) != 0) {
                    i8 = i2 | 6;
                } else {
                    i8 = i2 | (btsVar2.k(null) ? 4 : 2);
                }
                i9 = i3 & 2048;
                if (i9 != 0) {
                    i8 |= 48;
                    z4 = z2;
                } else {
                    z4 = z2;
                    if ((i2 & 48) == 0) {
                        i8 |= btsVar2.a(z4) ? 32 : 16;
                    }
                }
                if ((306783379 & i7) != 306783378 && (i8 & 19) == 18 && btsVar2.E()) {
                    btsVar2.Y();
                    dsButton$Size2 = dsButton$Size;
                    btsVar = btsVar2;
                    z6 = z4;
                    f530Var3 = f530Var2;
                    z5 = z3;
                } else {
                    f530 f530Var4 = i11 != 0 ? c530.a : f530Var2;
                    boolean z7 = i4 != 0 ? true : z3;
                    DsButton$Size dsButton$Size3 = i6 != 0 ? DsButton$Size.Md : dsButton$Size;
                    boolean z8 = i9 != 0 ? false : z4;
                    btsVar = btsVar2;
                    f530 f530Var5 = f530Var4;
                    boolean z9 = z7;
                    b(new kk2(str), slsVar, dsButton$Style, f530Var5, z9, dsButton$Size3, null, null, null, false, null, z8, btsVar, i7 & 2147483632, i8 & HProv.PP_DELETE_SAVED_PASSWD);
                    f530Var3 = f530Var5;
                    z5 = z9;
                    dsButton$Size2 = dsButton$Size3;
                    z6 = z8;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new gj9(str, slsVar, dsButton$Style, f530Var3, z5, dsButton$Size2, z6, i, i2, i3);
                    return;
                }
                return;
            }
            i5 |= i12;
            i7 = i5 | ((i3 & 64) != 0 ? 1572864 : btsVar2.e(null) ? 1048576 : 524288) | ((i3 & 128) != 0 ? 12582912 : btsVar2.e(null) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | ((i3 & 256) != 0 ? 100663296 : btsVar2.k(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | ((i3 & 512) != 0 ? 805306368 : btsVar2.a(false) ? 536870912 : SelfTester_JCP.IMITA);
            if ((i3 & 1024) != 0) {
            }
            i9 = i3 & 2048;
            if (i9 != 0) {
            }
            if ((306783379 & i7) != 306783378) {
            }
            if (i11 != 0) {
            }
            if (i4 != 0) {
            }
            if (i6 != 0) {
            }
            if (i9 != 0) {
            }
            btsVar = btsVar2;
            f530 f530Var52 = f530Var4;
            boolean z92 = z7;
            b(new kk2(str), slsVar, dsButton$Style, f530Var52, z92, dsButton$Size3, null, null, null, false, null, z8, btsVar, i7 & 2147483632, i8 & HProv.PP_DELETE_SAVED_PASSWD);
            f530Var3 = f530Var52;
            z5 = z92;
            dsButton$Size2 = dsButton$Size3;
            z6 = z8;
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i4 = i3 & 16;
        if (i4 == 0) {
        }
        i6 = i3 & 32;
        int i122 = ImageMetadata.EDGE_MODE;
        if (i6 == 0) {
        }
        i5 |= i122;
        i7 = i5 | ((i3 & 64) != 0 ? 1572864 : btsVar2.e(null) ? 1048576 : 524288) | ((i3 & 128) != 0 ? 12582912 : btsVar2.e(null) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | ((i3 & 256) != 0 ? 100663296 : btsVar2.k(null) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB) | ((i3 & 512) != 0 ? 805306368 : btsVar2.a(false) ? 536870912 : SelfTester_JCP.IMITA);
        if ((i3 & 1024) != 0) {
        }
        i9 = i3 & 2048;
        if (i9 != 0) {
        }
        if ((306783379 & i7) != 306783378) {
        }
        if (i11 != 0) {
        }
        if (i4 != 0) {
        }
        if (i6 != 0) {
        }
        if (i9 != 0) {
        }
        btsVar = btsVar2;
        f530 f530Var522 = f530Var4;
        boolean z922 = z7;
        b(new kk2(str), slsVar, dsButton$Style, f530Var522, z922, dsButton$Size3, null, null, null, false, null, z8, btsVar, i7 & 2147483632, i8 & HProv.PP_DELETE_SAVED_PASSWD);
        f530Var3 = f530Var522;
        z5 = z922;
        dsButton$Size2 = dsButton$Size3;
        z6 = z8;
        v = btsVar.v();
        if (v != null) {
        }
    }

    public static final List d(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(ayo.I.a);
        if (extensionValue == null) {
            return Collections.EMPTY_LIST;
        }
        j97 n = j97.n(new j2(new ByteArrayInputStream(((dqf) new j2(new ByteArrayInputStream(extensionValue)).n()).a)).n());
        ArrayList arrayList = new ArrayList();
        g2k[] m = n.m();
        int i = 0;
        while (i < m.length) {
            int i2 = i + 1;
            try {
                h2k h2kVar = m[i].a;
                if (h2kVar != null && h2kVar.b == 0) {
                    for (fxs fxsVar : gxs.m(h2kVar.a).n()) {
                        if (fxsVar.b == 6) {
                            arrayList.add(quu0.a(xpf.u(fxsVar.a).a));
                        }
                    }
                }
                i = i2;
            } catch (ArrayIndexOutOfBoundsException e2) {
                w511.i(e2.getMessage());
                return null;
            }
        }
        return arrayList;
    }

    public static final boolean e(Uri uri) {
        return "buyplus".equalsIgnoreCase(uri.getAuthority()) || "plus-home-sdk".equalsIgnoreCase(uri.getAuthority()) || "upgradeplus".equalsIgnoreCase(uri.getAuthority()) || "compositepayment".equalsIgnoreCase(uri.getAuthority()) || "cashback".equalsIgnoreCase(uri.getAuthority()) || "plusburns".equalsIgnoreCase(uri.getAuthority());
    }
}
