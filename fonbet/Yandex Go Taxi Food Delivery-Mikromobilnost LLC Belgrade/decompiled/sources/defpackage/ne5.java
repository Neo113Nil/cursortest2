package defpackage;

import androidx.compose.foundation.text.c;
import androidx.compose.runtime.f;
import com.google.ar.core.ImageMetadata;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes10.dex */
public abstract class ne5 {
    public static final /* synthetic */ int a = 0;

    static {
        cl91.o(40.0f, 40.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(hoy0 hoy0Var, tls tlsVar, f530 f530Var, boolean z, boolean z2, ety0 ety0Var, lkx lkxVar, xjx xjxVar, boolean z3, int i, int i2, gy31 gy31Var, tls tlsVar2, zx40 zx40Var, a6t0 a6t0Var, zls zlsVar, fid fidVar, int i3, int i4, int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        xjx xjxVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z6;
        int i21;
        tls tlsVar3;
        zx40 zx40Var2;
        boolean z7;
        boolean z8;
        xjx xjxVar3;
        bts btsVar;
        int i22;
        gy31 gy31Var2;
        zls zlsVar2;
        aii0 v;
        int i23;
        int i24;
        gy31 gy31Var3;
        tls tlsVar4;
        zx40 zx40Var3;
        int i25;
        int i26;
        int i27;
        zls zlsVar3;
        tls tlsVar5;
        boolean z9;
        boolean z10;
        int i28;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-971111025);
        if ((i3 & 6) == 0) {
            i6 = (btsVar2.k(hoy0Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        int i29 = i5 & 8;
        if (i29 != 0) {
            i6 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z4 = z;
            i6 |= btsVar2.a(z4) ? 2048 : 1024;
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z5 = z2;
                i6 |= btsVar2.a(z5) ? 16384 : 8192;
                if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
                    i6 |= btsVar2.k(ety0Var) ? 131072 : 65536;
                }
                if ((i3 & 1572864) == 0) {
                    i6 |= btsVar2.k(lkxVar) ? 1048576 : 524288;
                }
                i8 = i5 & 128;
                if (i8 != 0) {
                    i6 |= 12582912;
                    xjxVar2 = xjxVar;
                } else {
                    xjxVar2 = xjxVar;
                    if ((i3 & 12582912) == 0) {
                        i6 |= btsVar2.k(xjxVar2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    }
                }
                i9 = i5 & 256;
                if (i9 != 0) {
                    i6 |= 100663296;
                } else if ((i3 & 100663296) == 0) {
                    i6 |= btsVar2.a(z3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                }
                if ((i3 & 805306368) == 0) {
                    if ((i5 & 512) == 0 && btsVar2.c(i)) {
                        i28 = 536870912;
                        i6 |= i28;
                    }
                    i28 = SelfTester_JCP.IMITA;
                    i6 |= i28;
                }
                i10 = i5 & 1024;
                if (i10 != 0) {
                    i12 = i4 | 6;
                    i11 = i10;
                } else if ((i4 & 6) == 0) {
                    i11 = i10;
                    i12 = i4 | (btsVar2.c(i2) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i4;
                }
                i13 = i5 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                    i14 = i13;
                } else if ((i4 & 48) == 0) {
                    i14 = i13;
                    i12 |= btsVar2.k(gy31Var) ? 32 : 16;
                } else {
                    i14 = i13;
                }
                int i30 = i12;
                i15 = i6;
                i16 = i5 & 4096;
                if (i16 != 0) {
                    i17 = i30 | 384;
                } else {
                    int i31 = i30;
                    if ((i4 & 384) == 0) {
                        i31 |= btsVar2.e(tlsVar2) ? 256 : 128;
                    }
                    i17 = i31;
                }
                i18 = i5 & 8192;
                if (i18 != 0) {
                    i19 = i17 | HProv.ALG_TYPE_SECURECHANNEL;
                } else {
                    int i32 = i17;
                    if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                        i19 = i32 | (btsVar2.k(zx40Var) ? 2048 : 1024);
                    } else {
                        i19 = i32;
                    }
                }
                if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    i19 |= btsVar2.k(a6t0Var) ? 16384 : 8192;
                }
                i20 = i5 & 32768;
                if (i20 != 0) {
                    i19 |= ImageMetadata.EDGE_MODE;
                } else if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                    i19 |= btsVar2.e(zlsVar) ? 131072 : 65536;
                }
                if (btsVar2.V(i15 & 1, (i15 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
                    btsVar2.a0();
                    int i33 = i3 & 1;
                    o430 o430Var = did.a;
                    if (i33 == 0 || btsVar2.C()) {
                        if (i29 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            z5 = false;
                        }
                        if (i8 != 0) {
                            xjxVar2 = xjx.g;
                        }
                        boolean z11 = i9 != 0 ? false : z3;
                        if ((i5 & 512) != 0) {
                            i23 = z11 ? 1 : Integer.MAX_VALUE;
                            i24 = i15 & (-1879048193);
                        } else {
                            i23 = i;
                            i24 = i15;
                        }
                        int i34 = i11 != 0 ? 1 : i2;
                        gy31Var3 = i14 != 0 ? zoy0.w : gy31Var;
                        boolean z12 = z11;
                        if (i16 != 0) {
                            Object Q = btsVar2.Q();
                            if (Q == o430Var) {
                                Q = new l75(8);
                                btsVar2.o0(Q);
                            }
                            tlsVar4 = (tls) Q;
                        } else {
                            tlsVar4 = tlsVar2;
                        }
                        zx40 zx40Var4 = i18 != 0 ? null : zx40Var;
                        if (i20 != 0) {
                            x2d.a.getClass();
                            i25 = i23;
                            i26 = i24;
                            i27 = i34;
                            zlsVar3 = x2d.c;
                            z9 = z5;
                            zx40Var3 = zx40Var4;
                            tlsVar5 = tlsVar4;
                        } else {
                            zx40Var3 = zx40Var4;
                            i25 = i23;
                            i26 = i24;
                            i27 = i34;
                            zlsVar3 = zlsVar;
                            tlsVar5 = tlsVar4;
                            z9 = z5;
                        }
                        z10 = z12;
                    } else {
                        btsVar2.Y();
                        if ((i5 & 512) != 0) {
                            z10 = z3;
                            i25 = i;
                            i27 = i2;
                            gy31Var3 = gy31Var;
                            tlsVar5 = tlsVar2;
                            zlsVar3 = zlsVar;
                            i26 = i15 & (-1879048193);
                            z9 = z5;
                            zx40Var3 = zx40Var;
                        } else {
                            z10 = z3;
                            i25 = i;
                            i27 = i2;
                            gy31Var3 = gy31Var;
                            tlsVar5 = tlsVar2;
                            zx40Var3 = zx40Var;
                            zlsVar3 = zlsVar;
                            i26 = i15;
                            z9 = z5;
                        }
                    }
                    btsVar2.u();
                    eiv b = lkxVar.b(z10);
                    boolean z13 = z4;
                    boolean z14 = !z10;
                    int i35 = z10 ? 1 : i27;
                    int i36 = z10 ? 1 : i25;
                    boolean z15 = z10;
                    boolean z16 = ((i26 & 14) == 4) | ((i26 & 112) == 32);
                    Object Q2 = btsVar2.Q();
                    if (z16 || Q2 == o430Var) {
                        Q2 = new w04(10, hoy0Var, tlsVar);
                        btsVar2.o0(Q2);
                    }
                    int i37 = i19 << 9;
                    zx40 zx40Var5 = zx40Var3;
                    gy31 gy31Var4 = gy31Var3;
                    c.a(hoy0Var, (tls) Q2, f530Var, ety0Var, gy31Var4, tlsVar5, zx40Var5, a6t0Var, z14, i36, i35, b, xjxVar2, z13, z9, zlsVar3, btsVar2, (i26 & 910) | ((i26 >> 6) & 7168) | (i37 & HProv.ALG_CLASS_ALL) | (i37 & ImageMetadata.JPEG_GPS_COORDINATES) | (i37 & 3670016) | (i37 & 29360128), (i26 & 7168) | ((i26 >> 15) & 896) | (i26 & HProv.ALG_CLASS_ALL) | (i19 & ImageMetadata.JPEG_GPS_COORDINATES));
                    xjxVar3 = xjxVar2;
                    btsVar = btsVar2;
                    i21 = i25;
                    i22 = i27;
                    z6 = z15;
                    gy31Var2 = gy31Var4;
                    z7 = z13;
                    zlsVar2 = zlsVar3;
                    tlsVar3 = tlsVar5;
                    z8 = z9;
                    zx40Var2 = zx40Var5;
                } else {
                    btsVar2.Y();
                    z6 = z3;
                    i21 = i;
                    tlsVar3 = tlsVar2;
                    zx40Var2 = zx40Var;
                    z7 = z4;
                    z8 = z5;
                    xjxVar3 = xjxVar2;
                    btsVar = btsVar2;
                    i22 = i2;
                    gy31Var2 = gy31Var;
                    zlsVar2 = zlsVar;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new ke5(hoy0Var, tlsVar, f530Var, z7, z8, ety0Var, lkxVar, xjxVar3, z6, i21, i22, gy31Var2, tlsVar3, zx40Var2, a6t0Var, zlsVar2, i3, i4, i5, 0);
                    return;
                }
                return;
            }
            z5 = z2;
            if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            i8 = i5 & 128;
            if (i8 != 0) {
            }
            i9 = i5 & 256;
            if (i9 != 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i10 = i5 & 1024;
            if (i10 != 0) {
            }
            i13 = i5 & 2048;
            if (i13 != 0) {
            }
            int i302 = i12;
            i15 = i6;
            i16 = i5 & 4096;
            if (i16 != 0) {
            }
            i18 = i5 & 8192;
            if (i18 != 0) {
            }
            if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            i20 = i5 & 32768;
            if (i20 != 0) {
            }
            if (btsVar2.V(i15 & 1, (i15 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z4 = z;
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        z5 = z2;
        if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        i8 = i5 & 128;
        if (i8 != 0) {
        }
        i9 = i5 & 256;
        if (i9 != 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i10 = i5 & 1024;
        if (i10 != 0) {
        }
        i13 = i5 & 2048;
        if (i13 != 0) {
        }
        int i3022 = i12;
        i15 = i6;
        i16 = i5 & 4096;
        if (i16 != 0) {
        }
        i18 = i5 & 8192;
        if (i18 != 0) {
        }
        if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        i20 = i5 & 32768;
        if (i20 != 0) {
        }
        if (btsVar2.V(i15 & 1, (i15 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(String str, tls tlsVar, f530 f530Var, boolean z, boolean z2, ety0 ety0Var, lkx lkxVar, xjx xjxVar, boolean z3, int i, int i2, gy31 gy31Var, tls tlsVar2, zx40 zx40Var, ml6 ml6Var, zls zlsVar, fid fidVar, int i3, int i4, int i5) {
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        ety0 ety0Var2;
        int i9;
        boolean z6;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        bts btsVar;
        int i21;
        gy31 gy31Var2;
        tls tlsVar3;
        ml6 ml6Var2;
        zls zlsVar2;
        boolean z7;
        boolean z8;
        ety0 ety0Var3;
        int i22;
        zx40 zx40Var2;
        aii0 v;
        int i23;
        int i24;
        int i25;
        boolean z9;
        boolean z10;
        ml6 ml6Var3;
        boolean z11;
        zls zlsVar3;
        int i26;
        int i27;
        gy31 gy31Var3;
        boolean z12;
        boolean z13;
        ety0 ety0Var4;
        int i28;
        gy31 gy31Var4;
        long j;
        int i29;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2026950908);
        if ((i3 & 6) == 0) {
            i6 = (btsVar2.k(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i6 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        int i30 = i5 & 8;
        if (i30 != 0) {
            i6 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            z4 = z;
            i6 |= btsVar2.a(z4) ? 2048 : 1024;
            i7 = i5 & 16;
            if (i7 == 0) {
                i6 |= HProv.ALG_CLASS_DATA_ENCRYPT;
            } else if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                z5 = z2;
                i6 |= btsVar2.a(z5) ? 16384 : 8192;
                i8 = i5 & 32;
                if (i8 != 0) {
                    i6 |= ImageMetadata.EDGE_MODE;
                    ety0Var2 = ety0Var;
                } else {
                    ety0Var2 = ety0Var;
                    if ((i3 & ImageMetadata.EDGE_MODE) == 0) {
                        i6 |= btsVar2.k(ety0Var2) ? 131072 : 65536;
                    }
                }
                if ((i3 & 1572864) == 0) {
                    i6 |= btsVar2.k(lkxVar) ? 1048576 : 524288;
                }
                if ((i3 & 12582912) == 0) {
                    i6 |= btsVar2.k(xjxVar) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                }
                i9 = i5 & 256;
                if (i9 != 0) {
                    i6 |= 100663296;
                    z6 = z3;
                } else {
                    z6 = z3;
                    if ((i3 & 100663296) == 0) {
                        i6 |= btsVar2.a(z6) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    }
                }
                if ((i3 & 805306368) == 0) {
                    if ((i5 & 512) == 0 && btsVar2.c(i)) {
                        i29 = 536870912;
                        i6 |= i29;
                    }
                    i29 = SelfTester_JCP.IMITA;
                    i6 |= i29;
                }
                i10 = i5 & 1024;
                if (i10 != 0) {
                    i12 = i4 | 6;
                    i11 = i10;
                } else if ((i4 & 6) == 0) {
                    i11 = i10;
                    i12 = i4 | (btsVar2.c(i2) ? 4 : 2);
                } else {
                    i11 = i10;
                    i12 = i4;
                }
                i13 = i5 & 2048;
                if (i13 != 0) {
                    i12 |= 48;
                    i14 = i13;
                } else if ((i4 & 48) == 0) {
                    i14 = i13;
                    i12 |= btsVar2.k(gy31Var) ? 32 : 16;
                } else {
                    i14 = i13;
                }
                int i31 = i12;
                i15 = i6;
                int i32 = i31 | 384;
                i16 = i5 & 8192;
                if (i16 != 0) {
                    i17 = i31 | 3456;
                } else {
                    if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                        i32 |= btsVar2.k(zx40Var) ? 2048 : 1024;
                    }
                    i17 = i32;
                }
                i18 = i5 & 16384;
                if (i18 != 0) {
                    i19 = i17 | HProv.ALG_CLASS_DATA_ENCRYPT;
                } else {
                    int i33 = i17;
                    if ((i4 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        i19 = i33 | (btsVar2.k(ml6Var) ? 16384 : 8192);
                    } else {
                        i19 = i33;
                    }
                }
                i20 = i5 & 32768;
                if (i20 != 0) {
                    i19 |= ImageMetadata.EDGE_MODE;
                } else if ((i4 & ImageMetadata.EDGE_MODE) == 0) {
                    i19 |= btsVar2.e(zlsVar) ? 131072 : 65536;
                }
                if (btsVar2.V(i15 & 1, (i15 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
                    btsVar2.a0();
                    int i34 = i3 & 1;
                    Object obj = did.a;
                    if (i34 == 0 || btsVar2.C()) {
                        if (i30 != 0) {
                            z4 = true;
                        }
                        if (i7 != 0) {
                            z5 = false;
                        }
                        if (i8 != 0) {
                            ety0Var2 = ety0.d;
                        }
                        if (i9 != 0) {
                            z6 = false;
                        }
                        if ((i5 & 512) != 0) {
                            i23 = z6 ? 1 : Integer.MAX_VALUE;
                            i24 = i15 & (-1879048193);
                        } else {
                            i23 = i;
                            i24 = i15;
                        }
                        int i35 = i11 != 0 ? 1 : i2;
                        gy31 gy31Var5 = i14 != 0 ? zoy0.w : gy31Var;
                        Object Q = btsVar2.Q();
                        if (Q == obj) {
                            i25 = i23;
                            Q = new l75(8);
                            btsVar2.o0(Q);
                        } else {
                            i25 = i23;
                        }
                        tls tlsVar4 = (tls) Q;
                        zx40 zx40Var3 = i16 != 0 ? null : zx40Var;
                        if (i18 != 0) {
                            z9 = z4;
                            z10 = z6;
                            ml6Var3 = new a6t0(ldc.b);
                        } else {
                            z9 = z4;
                            z10 = z6;
                            ml6Var3 = ml6Var;
                        }
                        if (i20 != 0) {
                            x2d.a.getClass();
                            z11 = z9;
                            ml6Var2 = ml6Var3;
                            zlsVar3 = x2d.b;
                        } else {
                            z11 = z9;
                            zlsVar3 = zlsVar;
                            ml6Var2 = ml6Var3;
                        }
                        i26 = i24;
                        i27 = i35;
                        gy31Var3 = gy31Var5;
                        tlsVar3 = tlsVar4;
                        z12 = z10;
                        z13 = z5;
                        ety0Var4 = ety0Var2;
                        zx40Var2 = zx40Var3;
                        i28 = i25;
                    } else {
                        btsVar2.Y();
                        if ((i5 & 512) != 0) {
                            i28 = i;
                            i27 = i2;
                            gy31Var3 = gy31Var;
                            tlsVar3 = tlsVar2;
                            ml6Var2 = ml6Var;
                            zlsVar3 = zlsVar;
                            z11 = z4;
                            i26 = i15 & (-1879048193);
                            z12 = z6;
                        } else {
                            i28 = i;
                            i27 = i2;
                            gy31Var3 = gy31Var;
                            tlsVar3 = tlsVar2;
                            ml6Var2 = ml6Var;
                            zlsVar3 = zlsVar;
                            z11 = z4;
                            z12 = z6;
                            i26 = i15;
                        }
                        z13 = z5;
                        ety0Var4 = ety0Var2;
                        zx40Var2 = zx40Var;
                    }
                    btsVar2.u();
                    Object Q2 = btsVar2.Q();
                    ety0 ety0Var5 = ety0Var4;
                    if (Q2 == obj) {
                        gy31Var4 = gy31Var3;
                        j = 0;
                        Q2 = f.j(new hoy0(str, 0L, 6));
                        btsVar2.o0(Q2);
                    } else {
                        gy31Var4 = gy31Var3;
                        j = 0;
                    }
                    oz40 oz40Var = (oz40) Q2;
                    hoy0 b = hoy0.b((hoy0) oz40Var.getValue(), str, j, 6);
                    boolean k = btsVar2.k(b);
                    Object Q3 = btsVar2.Q();
                    if (k || Q3 == obj) {
                        Q3 = new le5(b, oz40Var, 0);
                        btsVar2.o0(Q3);
                    }
                    zpn.i((sls) Q3, btsVar2);
                    boolean z14 = (i26 & 14) == 4;
                    Object Q4 = btsVar2.Q();
                    if (z14 || Q4 == obj) {
                        Q4 = f.j(str);
                        btsVar2.o0(Q4);
                    }
                    oz40 oz40Var2 = (oz40) Q4;
                    eiv b2 = lkxVar.b(z12);
                    boolean z15 = !z12;
                    int i36 = z12 ? 1 : i27;
                    int i37 = i19;
                    int i38 = z12 ? 1 : i28;
                    boolean z16 = z12;
                    boolean k2 = ((i26 & 112) == 32) | btsVar2.k(oz40Var2);
                    Object Q5 = btsVar2.Q();
                    if (k2 || Q5 == obj) {
                        Q5 = new me5(tlsVar, oz40Var, oz40Var2, 0);
                        btsVar2.o0(Q5);
                    }
                    int i39 = i37 << 9;
                    gy31Var2 = gy31Var4;
                    btsVar = btsVar2;
                    c.a(b, (tls) Q5, f530Var, ety0Var5, gy31Var2, tlsVar3, zx40Var2, ml6Var2, z15, i38, i36, b2, xjxVar, z11, z13, zlsVar3, btsVar, (i26 & 896) | ((i26 >> 6) & 7168) | (i39 & HProv.ALG_CLASS_ALL) | (i39 & ImageMetadata.JPEG_GPS_COORDINATES) | (3670016 & i39) | (i39 & 29360128), ((i26 >> 15) & 896) | (i26 & 7168) | (i26 & HProv.ALG_CLASS_ALL) | (i37 & ImageMetadata.JPEG_GPS_COORDINATES));
                    i21 = i28;
                    ety0Var3 = ety0Var5;
                    z7 = z11;
                    z8 = z13;
                    zlsVar2 = zlsVar3;
                    z6 = z16;
                    i22 = i27;
                } else {
                    btsVar = btsVar2;
                    btsVar.Y();
                    i21 = i;
                    gy31Var2 = gy31Var;
                    tlsVar3 = tlsVar2;
                    ml6Var2 = ml6Var;
                    zlsVar2 = zlsVar;
                    z7 = z4;
                    z8 = z5;
                    ety0Var3 = ety0Var2;
                    i22 = i2;
                    zx40Var2 = zx40Var;
                }
                v = btsVar.v();
                if (v != null) {
                    v.d = new ke5(str, tlsVar, f530Var, z7, z8, ety0Var3, lkxVar, xjxVar, z6, i21, i22, gy31Var2, tlsVar3, zx40Var2, ml6Var2, zlsVar2, i3, i4, i5, 1);
                    return;
                }
                return;
            }
            z5 = z2;
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            if ((i3 & 1572864) == 0) {
            }
            if ((i3 & 12582912) == 0) {
            }
            i9 = i5 & 256;
            if (i9 != 0) {
            }
            if ((i3 & 805306368) == 0) {
            }
            i10 = i5 & 1024;
            if (i10 != 0) {
            }
            i13 = i5 & 2048;
            if (i13 != 0) {
            }
            int i312 = i12;
            i15 = i6;
            int i322 = i312 | 384;
            i16 = i5 & 8192;
            if (i16 != 0) {
            }
            i18 = i5 & 16384;
            if (i18 != 0) {
            }
            i20 = i5 & 32768;
            if (i20 != 0) {
            }
            if (btsVar2.V(i15 & 1, (i15 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        z4 = z;
        i7 = i5 & 16;
        if (i7 == 0) {
        }
        z5 = z2;
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        if ((i3 & 1572864) == 0) {
        }
        if ((i3 & 12582912) == 0) {
        }
        i9 = i5 & 256;
        if (i9 != 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i10 = i5 & 1024;
        if (i10 != 0) {
        }
        i13 = i5 & 2048;
        if (i13 != 0) {
        }
        int i3122 = i12;
        i15 = i6;
        int i3222 = i3122 | 384;
        i16 = i5 & 8192;
        if (i16 != 0) {
        }
        i18 = i5 & 16384;
        if (i18 != 0) {
        }
        i20 = i5 & 32768;
        if (i20 != 0) {
        }
        if (btsVar2.V(i15 & 1, (i15 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }
}
