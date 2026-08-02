package defpackage;

import com.google.ar.core.ImageMetadata;
import java.util.Map;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class jeb1 {
    public static final void a(final String str, final f530 f530Var, final long j, final long j2, long j3, final sjy0 sjy0Var, long j4, int i, boolean z, int i2, int i3, ety0 ety0Var, fid fidVar, final int i4) {
        bts btsVar;
        final long j5;
        final long j6;
        final int i5;
        final boolean z2;
        final int i6;
        final int i7;
        final ety0 ety0Var2;
        int i8;
        long j7;
        long j8;
        boolean z3;
        int i9;
        ety0 ety0Var3;
        long j9;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1324377405);
        int i10 = i4 | (btsVar2.k(str) ? 4 : 2) | (btsVar2.k(f530Var) ? 32 : 16) | 1794048 | (btsVar2.k(sjy0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | 905969664;
        int i11 = 1;
        if (btsVar2.V(i10 & 1, (306783379 & i10) != 306783378)) {
            btsVar2.a0();
            if ((i4 & 1) == 0 || btsVar2.C()) {
                i8 = Integer.MAX_VALUE;
                j7 = sty0.c;
                j8 = j7;
                z3 = true;
                i9 = 1;
                ety0Var3 = xya1.e(btsVar2).g.a;
            } else {
                btsVar2.Y();
                j7 = j3;
                j8 = j4;
                i11 = i;
                z3 = z;
                i8 = i2;
                i9 = i3;
                ety0Var3 = ety0Var;
            }
            btsVar2.u();
            btsVar2.e0(1416386128);
            if (j != 16) {
                j9 = j;
            } else {
                btsVar2.e0(1416387023);
                long b = ety0Var3.b();
                if (b == 16) {
                    b = ((ldc) btsVar2.m(k2z.a)).a;
                }
                btsVar2.t(false);
                j9 = b;
            }
            btsVar2.t(false);
            ety0 e = ety0.e(ety0Var3, j9, j2, null, null, null, j7, null, sjy0Var != null ? sjy0Var.a : 0, j8, 16609140);
            ety0 ety0Var4 = ety0Var3;
            long j10 = j7;
            btsVar = btsVar2;
            boolean z4 = z3;
            int i12 = i9;
            int i13 = i11;
            int i14 = i8;
            m5b1.b(str, f530Var, e, null, i13, z4, i14, i12, null, null, btsVar, (i10 & HProv.PP_DELETE_SAVED_PASSWD) | 14380032, 768);
            i5 = i13;
            z2 = z4;
            i6 = i14;
            i7 = i12;
            j6 = j8;
            ety0Var2 = ety0Var4;
            j5 = j10;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            j5 = j3;
            j6 = j4;
            i5 = i;
            z2 = z;
            i6 = i2;
            i7 = i3;
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls(str, f530Var, j, j2, j5, sjy0Var, j6, i5, z2, i6, i7, ety0Var2, i4) { // from class: thy
                public final /* synthetic */ int A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ int C;
                public final /* synthetic */ int D;
                public final /* synthetic */ ety0 E;
                public final /* synthetic */ String a;
                public final /* synthetic */ f530 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long w;
                public final /* synthetic */ long x;
                public final /* synthetic */ sjy0 y;
                public final /* synthetic */ long z;

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(3457);
                    jeb1.a(this.a, this.b, this.c, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(kk2 kk2Var, f530 f530Var, long j, long j2, long j3, sjy0 sjy0Var, long j4, int i, boolean z, int i2, int i3, Map map, tls tlsVar, ety0 ety0Var, fid fidVar, int i4) {
        bts btsVar;
        long j5;
        long j6;
        long j7;
        int i5;
        boolean z2;
        int i6;
        Map map2;
        tls tlsVar2;
        ety0 ety0Var2;
        long j8;
        long j9;
        Map map3;
        tls tlsVar3;
        ety0 ety0Var3;
        boolean z3;
        int i7;
        long j10;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-971447173);
        int i8 = i4 | (btsVar2.k(kk2Var) ? 4 : 2) | 1794432 | (btsVar2.k(sjy0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC) | 905969664;
        int i9 = 1;
        if (btsVar2.V(i8 & 1, (306783379 & i8) != 306783378)) {
            btsVar2.a0();
            if ((i4 & 1) == 0 || btsVar2.C()) {
                j5 = ldc.m;
                long j11 = sty0.c;
                Map f = b.f();
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = new wk6(6);
                    btsVar2.o0(Q);
                }
                j8 = j11;
                j9 = j8;
                map3 = f;
                tlsVar3 = (tls) Q;
                ety0Var3 = xya1.e(btsVar2).g.a;
                z3 = true;
                i7 = 1;
            } else {
                btsVar2.Y();
                j5 = j;
                j8 = j3;
                j9 = j4;
                i9 = i;
                z3 = z;
                i7 = i3;
                map3 = map;
                tlsVar3 = tlsVar;
                ety0Var3 = ety0Var;
            }
            btsVar2.u();
            btsVar2.e0(-1552808466);
            if (j5 != 16) {
                j10 = j5;
            } else {
                btsVar2.e0(-1552807571);
                long b = ety0Var3.b();
                if (b == 16) {
                    b = ((ldc) btsVar2.m(k2z.a)).a;
                }
                btsVar2.t(false);
                j10 = b;
            }
            btsVar2.t(false);
            ety0 e = ety0.e(ety0Var3, j10, j2, null, null, null, j8, null, sjy0Var != null ? sjy0Var.a : 0, j9, 16609140);
            ety0 ety0Var4 = ety0Var3;
            long j12 = j8;
            btsVar = btsVar2;
            int i10 = i9;
            boolean z4 = z3;
            int i11 = i7;
            Map map4 = map3;
            tls tlsVar4 = tlsVar3;
            m5b1.a(kk2Var, f530Var, e, tlsVar4, i10, z4, i2, i11, map4, null, btsVar, (i8 & HProv.PP_DELETE_SAVED_PASSWD) | 115043328, 0, HProv.ALG_TYPE_BLOCK);
            tlsVar2 = tlsVar4;
            z2 = z4;
            i6 = i11;
            i5 = i10;
            map2 = map4;
            j6 = j12;
            j7 = j9;
            ety0Var2 = ety0Var4;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            j5 = j;
            j6 = j3;
            j7 = j4;
            i5 = i;
            z2 = z;
            i6 = i3;
            map2 = map;
            tlsVar2 = tlsVar;
            ety0Var2 = ety0Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ipm(kk2Var, f530Var, j5, j2, j6, sjy0Var, j7, i5, z2, i2, i6, map2, tlsVar2, ety0Var2, i4);
        }
    }

    public static final void c(fv7 fv7Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1953047286);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(fv7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            cx20.a(null, null, null, null, null, false, false, wwg.S(2076799328, true, new xu7(tlsVar, fv7Var), btsVar), wwg.S(-76778200, true, new xu7(fv7Var, tlsVar), btsVar), btsVar, 113246208, HProv.PP_VERSION_TIMESTAMP);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mj5(fv7Var, tlsVar, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x029f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(kk2 kk2Var, f530 f530Var, wp2 wp2Var, long j, long j2, sjy0 sjy0Var, long j3, int i, boolean z, int i2, int i3, Map map, tls tlsVar, ety0 ety0Var, fid fidVar, int i4, int i5, int i6) {
        int i7;
        f530 f530Var2;
        int i8;
        wp2 wp2Var2;
        int i9;
        long j4;
        int i10;
        sjy0 sjy0Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        bts btsVar;
        sjy0 sjy0Var3;
        long j5;
        long j6;
        boolean z2;
        int i20;
        int i21;
        tls tlsVar2;
        ety0 ety0Var2;
        f530 f530Var3;
        wp2 wp2Var3;
        int i22;
        long j7;
        Map map2;
        aii0 v;
        f530 f530Var4;
        long j8;
        long j9;
        int i23;
        tls tlsVar3;
        ety0 ety0Var3;
        tls tlsVar4;
        Map map3;
        int i24;
        long j10;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1154034381);
        if ((i4 & 6) == 0) {
            i7 = (btsVar2.k(kk2Var) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i25 = i6 & 2;
        if (i25 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            f530Var2 = f530Var;
            i7 |= btsVar2.k(f530Var2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                wp2Var2 = wp2Var;
                i7 |= btsVar2.k(wp2Var2) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= HProv.ALG_TYPE_SECURECHANNEL;
                    j4 = j;
                } else {
                    j4 = j;
                    if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                        i7 |= btsVar2.d(j4) ? 2048 : 1024;
                    }
                }
                int i26 = i7 | 1794048;
                i10 = i6 & 128;
                if (i10 != 0) {
                    i26 = i7 | 14376960;
                } else if ((12582912 & i4) == 0) {
                    sjy0Var2 = sjy0Var;
                    i26 |= btsVar2.k(sjy0Var2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    i11 = i26 | 100663296;
                    i12 = i6 & 512;
                    if (i12 == 0) {
                        i11 = i26 | 905969664;
                        i13 = i;
                    } else {
                        i13 = i;
                        if ((i4 & 805306368) == 0) {
                            i11 |= btsVar2.c(i13) ? 536870912 : SelfTester_JCP.IMITA;
                        }
                    }
                    int i27 = i5 | 6;
                    i14 = i6 & 2048;
                    if (i14 == 0) {
                        i27 = i5 | 54;
                        i15 = i14;
                    } else if ((i5 & 48) == 0) {
                        i15 = i14;
                        i27 |= btsVar2.c(i2) ? 32 : 16;
                    } else {
                        i15 = i14;
                    }
                    int i28 = i27;
                    int i29 = i28 | 384;
                    i16 = i6 & 8192;
                    if (i16 == 0) {
                        i17 = i28 | 3456;
                    } else {
                        if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                            i29 |= btsVar2.k(map) ? 2048 : 1024;
                        }
                        i17 = i29;
                    }
                    i18 = i6 & 16384;
                    if (i18 == 0) {
                        i19 = i17 | HProv.ALG_CLASS_DATA_ENCRYPT;
                    } else {
                        i19 = i17;
                        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                            i19 |= btsVar2.e(tlsVar) ? 16384 : 8192;
                            if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
                                i19 |= ((i6 & 32768) == 0 && btsVar2.k(ety0Var)) ? 131072 : 65536;
                            }
                            boolean z3 = true;
                            if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
                                btsVar2.a0();
                                if ((i4 & 1) == 0 || btsVar2.C()) {
                                    f530Var4 = i25 != 0 ? c530.a : f530Var2;
                                    if (i8 != 0) {
                                        wp2Var2 = tp2.a;
                                    }
                                    j8 = i9 != 0 ? sty0.c : j4;
                                    j9 = sty0.c;
                                    if (i10 != 0) {
                                        sjy0Var2 = null;
                                    }
                                    if (i12 != 0) {
                                        i13 = 1;
                                    }
                                    i23 = i15 != 0 ? Integer.MAX_VALUE : i2;
                                    Map f = i16 != 0 ? b.f() : map;
                                    if (i18 != 0) {
                                        Object Q = btsVar2.Q();
                                        if (Q == did.a) {
                                            Q = new wk6(6);
                                            btsVar2.o0(Q);
                                        }
                                        tlsVar3 = (tls) Q;
                                    } else {
                                        tlsVar3 = tlsVar;
                                    }
                                    if ((i6 & 32768) != 0) {
                                        i19 &= -458753;
                                        tlsVar4 = tlsVar3;
                                        map3 = f;
                                        ety0Var3 = xya1.e(btsVar2).g.a;
                                    } else {
                                        ety0Var3 = ety0Var;
                                        tlsVar4 = tlsVar3;
                                        map3 = f;
                                    }
                                    i24 = 1;
                                    j10 = j9;
                                } else {
                                    btsVar2.Y();
                                    if ((i6 & 32768) != 0) {
                                        i19 &= -458753;
                                    }
                                    j10 = j3;
                                    z3 = z;
                                    i23 = i2;
                                    i24 = i3;
                                    map3 = map;
                                    tlsVar4 = tlsVar;
                                    ety0Var3 = ety0Var;
                                    j8 = j4;
                                    f530Var4 = f530Var2;
                                    j9 = j2;
                                }
                                btsVar2.u();
                                f530 f530Var5 = f530Var4;
                                long j11 = j10;
                                ety0 ety0Var4 = ety0Var3;
                                int i30 = i19 << 15;
                                int i31 = i24;
                                Map map4 = map3;
                                tls tlsVar5 = tlsVar4;
                                m5b1.a(kk2Var, f530Var5, ety0.e(ety0Var4, tje.n(wp2Var2, btsVar2), j8, null, null, null, j9, null, sjy0Var2 != null ? sjy0Var2.a : 0, j11, 16609140), tlsVar5, i13, z3, i23, i31, map4, null, btsVar2, ((i19 >> 3) & 7168) | (i11 & HProv.PP_DELETE_SAVED_PASSWD) | ((i11 >> 15) & HProv.ALG_CLASS_ALL) | (i30 & ImageMetadata.JPEG_GPS_COORDINATES) | (i30 & 3670016) | (i30 & 29360128) | (i30 & 234881024), 0, HProv.ALG_TYPE_BLOCK);
                                f530Var3 = f530Var5;
                                btsVar = btsVar2;
                                i21 = i31;
                                tlsVar2 = tlsVar5;
                                wp2Var3 = wp2Var2;
                                ety0Var2 = ety0Var4;
                                i22 = i13;
                                i20 = i23;
                                map2 = map4;
                                z2 = z3;
                                long j12 = j9;
                                sjy0Var3 = sjy0Var2;
                                j5 = j8;
                                j6 = j12;
                                j7 = j11;
                            } else {
                                btsVar = btsVar2;
                                btsVar.Y();
                                sjy0Var3 = sjy0Var2;
                                j5 = j4;
                                j6 = j2;
                                z2 = z;
                                i20 = i2;
                                i21 = i3;
                                tlsVar2 = tlsVar;
                                ety0Var2 = ety0Var;
                                f530Var3 = f530Var2;
                                wp2Var3 = wp2Var2;
                                i22 = i13;
                                j7 = j3;
                                map2 = map;
                            }
                            v = btsVar.v();
                            if (v != null) {
                                v.d = new shy(kk2Var, f530Var3, wp2Var3, j5, j6, sjy0Var3, j7, i22, z2, i20, i21, map2, tlsVar2, ety0Var2, i4, i5, i6);
                                return;
                            }
                            return;
                        }
                    }
                    if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
                    }
                    boolean z32 = true;
                    if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
                    }
                    v = btsVar.v();
                    if (v != null) {
                    }
                }
                sjy0Var2 = sjy0Var;
                i11 = i26 | 100663296;
                i12 = i6 & 512;
                if (i12 == 0) {
                }
                int i272 = i5 | 6;
                i14 = i6 & 2048;
                if (i14 == 0) {
                }
                int i282 = i272;
                int i292 = i282 | 384;
                i16 = i6 & 8192;
                if (i16 == 0) {
                }
                i18 = i6 & 16384;
                if (i18 == 0) {
                }
                if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
                }
                boolean z322 = true;
                if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
                }
                v = btsVar.v();
                if (v != null) {
                }
            }
            wp2Var2 = wp2Var;
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            int i262 = i7 | 1794048;
            i10 = i6 & 128;
            if (i10 != 0) {
            }
            sjy0Var2 = sjy0Var;
            i11 = i262 | 100663296;
            i12 = i6 & 512;
            if (i12 == 0) {
            }
            int i2722 = i5 | 6;
            i14 = i6 & 2048;
            if (i14 == 0) {
            }
            int i2822 = i2722;
            int i2922 = i2822 | 384;
            i16 = i6 & 8192;
            if (i16 == 0) {
            }
            i18 = i6 & 16384;
            if (i18 == 0) {
            }
            if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
            }
            boolean z3222 = true;
            if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
            }
            v = btsVar.v();
            if (v != null) {
            }
        }
        f530Var2 = f530Var;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        wp2Var2 = wp2Var;
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        int i2622 = i7 | 1794048;
        i10 = i6 & 128;
        if (i10 != 0) {
        }
        sjy0Var2 = sjy0Var;
        i11 = i2622 | 100663296;
        i12 = i6 & 512;
        if (i12 == 0) {
        }
        int i27222 = i5 | 6;
        i14 = i6 & 2048;
        if (i14 == 0) {
        }
        int i28222 = i27222;
        int i29222 = i28222 | 384;
        i16 = i6 & 8192;
        if (i16 == 0) {
        }
        i18 = i6 & 16384;
        if (i18 == 0) {
        }
        if ((i5 & ImageMetadata.EDGE_MODE) == 0) {
        }
        boolean z32222 = true;
        if (btsVar2.V(i11 & 1, (i11 & 306783379) == 306783378 || (i19 & 74899) != 74898)) {
        }
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(final String str, final xfc xfcVar, final f530 f530Var, long j, long j2, sjy0 sjy0Var, long j3, int i, boolean z, int i2, int i3, final ety0 ety0Var, fid fidVar, final int i4, final int i5) {
        String str2;
        int i6;
        sjy0 sjy0Var2;
        int i7;
        final long j4;
        final long j5;
        final int i8;
        final boolean z2;
        final int i9;
        final int i10;
        final sjy0 sjy0Var3;
        bts btsVar;
        final long j6;
        aii0 v;
        int i11;
        long j7;
        long j8;
        long j9;
        int i12;
        int i13;
        int i14;
        boolean z3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2028746126);
        if ((i4 & 6) == 0) {
            str2 = str;
            i6 = (btsVar2.k(str2) ? 4 : 2) | i4;
        } else {
            str2 = str;
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= (i4 & 64) == 0 ? btsVar2.k(xfcVar) : btsVar2.e(xfcVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= btsVar2.k(f530Var) ? 256 : 128;
        }
        int i15 = 1797120 | i6;
        int i16 = i5 & 128;
        if (i16 != 0) {
            i15 = 14380032 | i6;
        } else if ((12582912 & i4) == 0) {
            sjy0Var2 = sjy0Var;
            i15 |= btsVar2.k(sjy0Var2) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
            i7 = i15 | 905969664;
            if (btsVar2.V(i7 & 1, (306783379 & i7) == 306783378 || (((!btsVar2.k(ety0Var) ? (char) 16384 : (char) 8192) | 3510) & 9363) != 9362)) {
                btsVar2.Y();
                j4 = j;
                j5 = j2;
                i8 = i;
                z2 = z;
                i9 = i2;
                i10 = i3;
                sjy0Var3 = sjy0Var2;
                btsVar = btsVar2;
                j6 = j3;
            } else {
                btsVar2.a0();
                if ((i4 & 1) == 0 || btsVar2.C()) {
                    long j10 = sty0.c;
                    if (i16 != 0) {
                        sjy0Var2 = null;
                    }
                    i11 = i7;
                    j7 = j10;
                    j8 = j7;
                    j9 = j8;
                    i12 = 1;
                    i13 = 1;
                    i14 = Integer.MAX_VALUE;
                    z3 = true;
                } else {
                    btsVar2.Y();
                    j7 = j;
                    j8 = j2;
                    j9 = j3;
                    z3 = z;
                    i14 = i2;
                    i13 = i3;
                    i11 = i7;
                    i12 = i;
                }
                btsVar2.u();
                m5b1.b(str2, f530Var, ety0.e(ety0Var, 0L, j7, null, null, null, j8, null, sjy0Var2 != null ? sjy0Var2.a : 0, j9, 16609141), null, i12, z3, i14, i13, xfcVar, null, btsVar2, (i11 & 14) | ((i11 >> 3) & 112) | HProv.ALG_TYPE_SECURECHANNEL | ((i11 >> 15) & HProv.ALG_CLASS_ALL) | 14352384 | ((i11 << 21) & 234881024), 512);
                i8 = i12;
                z2 = z3;
                i9 = i14;
                i10 = i13;
                btsVar = btsVar2;
                sjy0Var3 = sjy0Var2;
                j4 = j7;
                j5 = j8;
                j6 = j9;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new wls() { // from class: uhy
                    @Override // defpackage.wls
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int O = vng.O(i4 | 1);
                        jeb1.e(str, xfcVar, f530Var, j4, j5, sjy0Var3, j6, i8, z2, i9, i10, ety0Var, (fid) obj, O, i5);
                        return zy11.a;
                    }
                };
                return;
            }
            return;
        }
        sjy0Var2 = sjy0Var;
        i7 = i15 | 905969664;
        if (btsVar2.V(i7 & 1, (306783379 & i7) == 306783378 || (((!btsVar2.k(ety0Var) ? (char) 16384 : (char) 8192) | 3510) & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(String str, f530 f530Var, wp2 wp2Var, long j, long j2, rly0 rly0Var, sjy0 sjy0Var, long j3, int i, boolean z, int i2, int i3, tls tlsVar, ety0 ety0Var, fid fidVar, int i4, int i5, int i6) {
        int i7;
        f530 f530Var2;
        int i8;
        wp2 wp2Var2;
        int i9;
        long j4;
        int i10;
        int i11;
        long j5;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        bts btsVar;
        int i22;
        boolean z2;
        tls tlsVar2;
        ety0 ety0Var2;
        long j6;
        f530 f530Var3;
        wp2 wp2Var3;
        long j7;
        rly0 rly0Var2;
        sjy0 sjy0Var2;
        long j8;
        int i23;
        int i24;
        aii0 v;
        f530 f530Var4;
        long j9;
        rly0 rly0Var3;
        sjy0 sjy0Var3;
        long j10;
        int i25;
        tls tlsVar3;
        ety0 ety0Var3;
        int i26;
        int i27;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-150517425);
        if ((i4 & 6) == 0) {
            i7 = (btsVar2.k(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i28 = i6 & 2;
        if (i28 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            f530Var2 = f530Var;
            i7 |= btsVar2.k(f530Var2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i7 |= 384;
            } else if ((i4 & 384) == 0) {
                wp2Var2 = wp2Var;
                i7 |= btsVar2.k(wp2Var2) ? 256 : 128;
                i9 = i6 & 8;
                if (i9 != 0) {
                    i7 |= HProv.ALG_TYPE_SECURECHANNEL;
                    j4 = j;
                } else {
                    j4 = j;
                    if ((i4 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                        i7 |= btsVar2.d(j4) ? 2048 : 1024;
                    }
                }
                i10 = i7 | HProv.ALG_CLASS_DATA_ENCRYPT;
                i11 = i6 & 32;
                if (i11 != 0) {
                    i10 = 221184 | i7;
                    j5 = j2;
                } else {
                    j5 = j2;
                    if ((196608 & i4) == 0) {
                        i10 |= btsVar2.d(j5) ? 131072 : 65536;
                    }
                }
                i12 = i6 & 64;
                if (i12 != 0) {
                    i10 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i10 |= btsVar2.k(rly0Var) ? 1048576 : 524288;
                }
                i13 = i6 & 128;
                if (i13 != 0) {
                    i10 |= 12582912;
                } else if ((i4 & 12582912) == 0) {
                    i14 = i13;
                    i10 |= btsVar2.k(sjy0Var) ? SelfTester_JCP.ENCRYPT_CNT : SelfTester_JCP.ENCRYPT_CBC;
                    i15 = i6 & 256;
                    if (i15 == 0) {
                        i10 |= 100663296;
                    } else if ((i4 & 100663296) == 0) {
                        i10 |= btsVar2.d(j3) ? SelfTester_JCP.DECRYPT_CBC : SelfTester_JCP.DECRYPT_CFB;
                    }
                    i16 = i6 & 512;
                    if (i16 == 0) {
                        i10 |= 805306368;
                    } else if ((i4 & 805306368) == 0) {
                        i17 = i16;
                        i10 |= btsVar2.c(i) ? 536870912 : SelfTester_JCP.IMITA;
                        int i29 = i5 | 6;
                        i18 = i6 & 2048;
                        if (i18 != 0) {
                            i29 = i5 | 54;
                            i19 = i18;
                        } else if ((i5 & 48) == 0) {
                            i19 = i18;
                            i29 |= btsVar2.c(i2) ? 32 : 16;
                        } else {
                            i19 = i18;
                        }
                        int i30 = i29;
                        i20 = i30 | 384;
                        i21 = i6 & 8192;
                        if (i21 != 0) {
                            i20 = i30 | 3456;
                        } else if ((i5 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
                            i20 |= btsVar2.e(tlsVar) ? 2048 : 1024;
                            if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                                if ((i6 & 16384) == 0 && btsVar2.k(ety0Var)) {
                                    i27 = 16384;
                                    i20 |= i27;
                                }
                                i27 = 8192;
                                i20 |= i27;
                            }
                            boolean z3 = true;
                            if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 9363) != 9362)) {
                                btsVar = btsVar2;
                                btsVar.Y();
                                i22 = i;
                                z2 = z;
                                tlsVar2 = tlsVar;
                                ety0Var2 = ety0Var;
                                j6 = j4;
                                f530Var3 = f530Var2;
                                wp2Var3 = wp2Var2;
                                j7 = j5;
                                rly0Var2 = rly0Var;
                                sjy0Var2 = sjy0Var;
                                j8 = j3;
                                i23 = i2;
                                i24 = i3;
                            } else {
                                btsVar2.a0();
                                if ((i4 & 1) == 0 || btsVar2.C()) {
                                    f530Var4 = i28 != 0 ? c530.a : f530Var2;
                                    if (i8 != 0) {
                                        wp2Var2 = tp2.a;
                                    }
                                    j9 = i9 != 0 ? sty0.c : j4;
                                    if (i11 != 0) {
                                        j5 = sty0.c;
                                    }
                                    rly0Var3 = i12 != 0 ? null : rly0Var;
                                    sjy0Var3 = i14 != 0 ? null : sjy0Var;
                                    j10 = i15 != 0 ? sty0.c : j3;
                                    i22 = i17 != 0 ? 1 : i;
                                    i25 = i19 != 0 ? Integer.MAX_VALUE : i2;
                                    tlsVar3 = i21 == 0 ? tlsVar : null;
                                    if ((i6 & 16384) != 0) {
                                        ety0Var3 = xya1.e(btsVar2).g.a;
                                        i20 &= -57345;
                                    } else {
                                        ety0Var3 = ety0Var;
                                    }
                                    i26 = 1;
                                } else {
                                    btsVar2.Y();
                                    if ((i6 & 16384) != 0) {
                                        i20 &= -57345;
                                    }
                                    sjy0Var3 = sjy0Var;
                                    j10 = j3;
                                    i22 = i;
                                    z3 = z;
                                    i25 = i2;
                                    i26 = i3;
                                    ety0Var3 = ety0Var;
                                    j9 = j4;
                                    f530Var4 = f530Var2;
                                    rly0Var3 = rly0Var;
                                    tlsVar3 = tlsVar;
                                }
                                btsVar2.u();
                                f530 f530Var5 = f530Var4;
                                ety0 e = ety0.e(ety0Var3, tje.n(wp2Var2, btsVar2), j9, null, null, null, j5, rly0Var3, sjy0Var3 != null ? sjy0Var3.a : 0, j10, 16609140);
                                int i31 = (i10 & HProv.PP_DELETE_SAVED_PASSWD) | (i20 & 7168) | ((i10 >> 15) & HProv.ALG_CLASS_ALL);
                                int i32 = i20 << 15;
                                int i33 = i26;
                                m5b1.b(str, f530Var5, e, tlsVar3, i22, z3, i25, i33, null, null, btsVar2, i31 | (458752 & i32) | (3670016 & i32) | (i32 & 29360128), 768);
                                f530Var3 = f530Var5;
                                btsVar = btsVar2;
                                int i34 = i25;
                                ety0Var2 = ety0Var3;
                                j6 = j9;
                                j7 = j5;
                                i23 = i34;
                                i24 = i33;
                                tlsVar2 = tlsVar3;
                                rly0Var2 = rly0Var3;
                                sjy0Var2 = sjy0Var3;
                                wp2Var3 = wp2Var2;
                                z2 = z3;
                                j8 = j10;
                            }
                            v = btsVar.v();
                            if (v == null) {
                                v.d = new shy(str, f530Var3, wp2Var3, j6, j7, rly0Var2, sjy0Var2, j8, i22, z2, i23, i24, tlsVar2, ety0Var2, i4, i5, i6);
                                return;
                            }
                            return;
                        }
                        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                        }
                        boolean z32 = true;
                        if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 9363) != 9362)) {
                        }
                        v = btsVar.v();
                        if (v == null) {
                        }
                    }
                    i17 = i16;
                    int i292 = i5 | 6;
                    i18 = i6 & 2048;
                    if (i18 != 0) {
                    }
                    int i302 = i292;
                    i20 = i302 | 384;
                    i21 = i6 & 8192;
                    if (i21 != 0) {
                    }
                    if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                    }
                    boolean z322 = true;
                    if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 9363) != 9362)) {
                    }
                    v = btsVar.v();
                    if (v == null) {
                    }
                }
                i14 = i13;
                i15 = i6 & 256;
                if (i15 == 0) {
                }
                i16 = i6 & 512;
                if (i16 == 0) {
                }
                i17 = i16;
                int i2922 = i5 | 6;
                i18 = i6 & 2048;
                if (i18 != 0) {
                }
                int i3022 = i2922;
                i20 = i3022 | 384;
                i21 = i6 & 8192;
                if (i21 != 0) {
                }
                if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                }
                boolean z3222 = true;
                if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 9363) != 9362)) {
                }
                v = btsVar.v();
                if (v == null) {
                }
            }
            wp2Var2 = wp2Var;
            i9 = i6 & 8;
            if (i9 != 0) {
            }
            i10 = i7 | HProv.ALG_CLASS_DATA_ENCRYPT;
            i11 = i6 & 32;
            if (i11 != 0) {
            }
            i12 = i6 & 64;
            if (i12 != 0) {
            }
            i13 = i6 & 128;
            if (i13 != 0) {
            }
            i14 = i13;
            i15 = i6 & 256;
            if (i15 == 0) {
            }
            i16 = i6 & 512;
            if (i16 == 0) {
            }
            i17 = i16;
            int i29222 = i5 | 6;
            i18 = i6 & 2048;
            if (i18 != 0) {
            }
            int i30222 = i29222;
            i20 = i30222 | 384;
            i21 = i6 & 8192;
            if (i21 != 0) {
            }
            if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            }
            boolean z32222 = true;
            if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 9363) != 9362)) {
            }
            v = btsVar.v();
            if (v == null) {
            }
        }
        f530Var2 = f530Var;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        wp2Var2 = wp2Var;
        i9 = i6 & 8;
        if (i9 != 0) {
        }
        i10 = i7 | HProv.ALG_CLASS_DATA_ENCRYPT;
        i11 = i6 & 32;
        if (i11 != 0) {
        }
        i12 = i6 & 64;
        if (i12 != 0) {
        }
        i13 = i6 & 128;
        if (i13 != 0) {
        }
        i14 = i13;
        i15 = i6 & 256;
        if (i15 == 0) {
        }
        i16 = i6 & 512;
        if (i16 == 0) {
        }
        i17 = i16;
        int i292222 = i5 | 6;
        i18 = i6 & 2048;
        if (i18 != 0) {
        }
        int i302222 = i292222;
        i20 = i302222 | 384;
        i21 = i6 & 8192;
        if (i21 != 0) {
        }
        if ((i5 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        boolean z322222 = true;
        if (btsVar2.V(i10 & 1, (i10 & 306783379) == 306783378 || (i20 & 9363) != 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final qor g(m3u0 m3u0Var) {
        return m3u0Var instanceof qor ? (qor) m3u0Var : new kx11(m3u0Var);
    }
}
