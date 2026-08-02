package xsna;

import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: Text.kt */
/* loaded from: classes11.dex */
public final class cjo0 {
    public static final pqo a = new pqo(new nof0(4));

    public static final void a(nmo0 nmo0Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(15327438);
        int i2 = (M.J(nmo0Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(15327438, i2, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:459)");
            }
            pqo pqoVar = a;
            rvi.a(pqoVar.b(((nmo0) M.r(pqoVar)).d(nmo0Var)), jaiVar, M, (i2 & 112) | 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qz5(nmo0Var, jaiVar, i, 5);
        }
    }

    @ozl
    public static final void b(q630 q630Var, long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, nmo0 nmo0Var, androidx.compose.runtime.a aVar, final int i4) {
        androidx.compose.runtime.a aVar2;
        final q630 q630Var2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final int i5;
        final boolean z2;
        final int i6;
        final int i7;
        final nmo0 nmo0Var2;
        long j9;
        q630 q630Var3;
        int i8;
        boolean z3;
        int i9;
        nmo0 nmo0Var3;
        int i10;
        long j10;
        long j11;
        long j12;
        long j13;
        androidx.compose.runtime.a M = aVar.M(-2055108902);
        int i11 = i4 | 920350128;
        if (M.t(i11 & 1, (306783379 & i11) != 306783378)) {
            M.V();
            if ((i4 & 1) == 0 || M.i()) {
                j9 = l5g.k;
                long j14 = fno0.c;
                nmo0 nmo0Var4 = (nmo0) M.r(a);
                q630Var3 = q630.a.a;
                i8 = 1;
                z3 = true;
                i9 = 1;
                nmo0Var3 = nmo0Var4;
                i10 = Integer.MAX_VALUE;
                j10 = j14;
                j11 = j10;
                j12 = j11;
            } else {
                M.h();
                q630Var3 = q630Var;
                j9 = j;
                j11 = j2;
                j12 = j3;
                j10 = j4;
                i8 = i;
                z3 = z;
                i10 = i2;
                i9 = i3;
                nmo0Var3 = nmo0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                aVar2 = M;
                j13 = j9;
                androidx.compose.runtime.b.f(-2055108902, i11, 224694, "androidx.compose.material3.Text (Text.kt:283)");
            } else {
                aVar2 = M;
                j13 = j9;
            }
            q630 q630Var4 = q630Var3;
            long j15 = j13;
            c("Next", q630Var4, j15, j11, j12, null, j10, i8, z3, i10, i9, nmo0Var3, aVar2, 920350134, 1797558, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
            j5 = j15;
            j6 = j11;
            j7 = j12;
            j8 = j10;
            i5 = i8;
            z2 = z3;
            i6 = i10;
            i7 = i9;
            nmo0Var2 = nmo0Var3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            i5 = i;
            z2 = z;
            i6 = i2;
            i7 = i3;
            nmo0Var2 = nmo0Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs(j5, j6, j7, j8, i5, z2, i6, i7, nmo0Var2, i4) { // from class: xsna.wio0
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ int g;
                public final /* synthetic */ boolean h;
                public final /* synthetic */ int i;
                public final /* synthetic */ int j;
                public final /* synthetic */ nmo0 k;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(7);
                    cjo0.b(q630.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final String str, q630 q630Var, long j, long j2, long j3, obo0 obo0Var, long j4, int i, boolean z, int i2, int i3, nmo0 nmo0Var, androidx.compose.runtime.a aVar, final int i4, final int i5, final int i6) {
        int i7;
        q630 q630Var2;
        int i8;
        long j5;
        int i9;
        int i10;
        int i11;
        long j6;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j7;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        androidx.compose.runtime.a aVar2;
        final long j8;
        final long j9;
        final obo0 obo0Var2;
        final boolean z2;
        final int i25;
        final int i26;
        final nmo0 nmo0Var2;
        final long j10;
        final q630 q630Var3;
        final long j11;
        final int i27;
        androidx.compose.runtime.f s;
        long j12;
        long j13;
        boolean z3;
        int i28;
        int i29;
        nmo0 nmo0Var3;
        int i30;
        int i31;
        obo0 obo0Var3;
        int i32;
        long b;
        androidx.compose.runtime.a M = aVar.M(1809465675);
        if ((i4 & 6) == 0) {
            i7 = (M.J(str) ? 4 : 2) | i4;
        } else {
            i7 = i4;
        }
        int i33 = i6 & 2;
        if (i33 != 0) {
            i7 |= 48;
        } else if ((i4 & 48) == 0) {
            q630Var2 = q630Var;
            i7 |= M.J(q630Var2) ? 32 : 16;
            i8 = i6 & 4;
            if (i8 == 0) {
                i9 = i7 | 384;
                j5 = j;
            } else {
                int i34 = i7;
                j5 = j;
                if ((i4 & 384) == 0) {
                    i34 |= M.p(j5) ? 256 : 128;
                }
                i9 = i34;
            }
            if ((i6 & 8) == 0) {
                i9 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i9 |= M.y(null) ? 2048 : 1024;
            }
            i10 = i6 & 16;
            if (i10 == 0) {
                i9 |= 24576;
                i11 = i10;
                j6 = j2;
            } else {
                i11 = i10;
                j6 = j2;
                if ((i4 & 24576) == 0) {
                    i9 |= M.p(j6) ? 16384 : 8192;
                }
            }
            if ((i6 & 32) == 0) {
                i9 |= 196608;
            } else if ((i4 & 196608) == 0) {
                i9 |= M.J(null) ? 131072 : 65536;
            }
            if ((i6 & 64) == 0) {
                i9 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                i9 |= M.J(null) ? 1048576 : 524288;
            }
            int i35 = 4194304;
            if ((i6 & 128) == 0) {
                i9 |= 12582912;
            } else if ((i4 & 12582912) == 0) {
                i9 |= M.J(null) ? 8388608 : 4194304;
            }
            i12 = i6 & 256;
            if (i12 == 0) {
                i9 |= 100663296;
            } else if ((i4 & 100663296) == 0) {
                i13 = i9 | (M.p(j3) ? 67108864 : 33554432);
                if ((i6 & 512) != 0) {
                    i13 |= 805306368;
                } else if ((i4 & 805306368) == 0) {
                    i13 |= M.J(null) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                i14 = i13;
                i15 = i6 & 1024;
                if (i15 != 0) {
                    i16 = i5 | 6;
                } else if ((i5 & 6) == 0) {
                    i16 = i5 | (M.J(obo0Var) ? 4 : 2);
                } else {
                    i16 = i5;
                }
                i17 = i6 & 2048;
                if (i17 != 0) {
                    i16 |= 48;
                    j7 = j4;
                } else {
                    j7 = j4;
                    if ((i5 & 48) == 0) {
                        i16 |= M.p(j7) ? 32 : 16;
                    }
                }
                int i36 = i16;
                i18 = i6 & 4096;
                if (i18 != 0) {
                    i19 = i36 | 384;
                } else {
                    int i37 = i36;
                    if ((i5 & 384) == 0) {
                        i37 |= M.o(i) ? 256 : 128;
                    }
                    i19 = i37;
                }
                i20 = i6 & 8192;
                if (i20 != 0) {
                    i21 = i19 | 3072;
                } else {
                    int i38 = i19;
                    if ((i5 & 3072) == 0) {
                        i21 = i38 | (M.l(z) ? 2048 : 1024);
                    } else {
                        i21 = i38;
                    }
                }
                i22 = i6 & 16384;
                if (i22 != 0) {
                    i23 = i21 | 24576;
                } else {
                    i23 = i21;
                    if ((i5 & 24576) == 0) {
                        i23 |= M.o(i2) ? 16384 : 8192;
                        i24 = i6 & 32768;
                        if (i24 == 0) {
                            i23 |= 196608;
                        } else if ((i5 & 196608) == 0) {
                            i23 |= M.o(i3) ? 131072 : 65536;
                        }
                        if ((i6 & 65536) == 0) {
                            i23 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            i23 |= M.y(null) ? 1048576 : 524288;
                        }
                        if ((i5 & 12582912) == 0) {
                            if ((i6 & 131072) == 0 && M.J(nmo0Var)) {
                                i35 = 8388608;
                            }
                            i23 |= i35;
                        }
                        if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
                            aVar2 = M;
                            aVar2.h();
                            long j14 = j6;
                            j8 = j7;
                            j9 = j14;
                            obo0Var2 = obo0Var;
                            z2 = z;
                            i25 = i2;
                            i26 = i3;
                            nmo0Var2 = nmo0Var;
                            j10 = j5;
                            q630Var3 = q630Var2;
                            j11 = j3;
                            i27 = i;
                        } else {
                            M.V();
                            if ((i4 & 1) == 0 || M.i()) {
                                if (i33 != 0) {
                                    q630Var2 = q630.a.a;
                                }
                                if (i8 != 0) {
                                    j5 = l5g.k;
                                }
                                j12 = i11 != 0 ? fno0.c : j6;
                                j13 = i12 != 0 ? fno0.c : j3;
                                obo0 obo0Var4 = i15 != 0 ? null : obo0Var;
                                if (i17 != 0) {
                                    j7 = fno0.c;
                                }
                                int i39 = i18 != 0 ? 1 : i;
                                z3 = i20 != 0 ? true : z;
                                i28 = i22 != 0 ? Integer.MAX_VALUE : i2;
                                i29 = i24 == 0 ? i3 : 1;
                                if ((i6 & 131072) != 0) {
                                    i23 &= -29360129;
                                    i30 = i39;
                                    nmo0Var3 = (nmo0) M.r(a);
                                } else {
                                    nmo0Var3 = nmo0Var;
                                    i30 = i39;
                                }
                                i31 = i23;
                                obo0Var3 = obo0Var4;
                            } else {
                                M.h();
                                if ((i6 & 131072) != 0) {
                                    i23 &= -29360129;
                                }
                                j13 = j3;
                                obo0Var3 = obo0Var;
                                i28 = i2;
                                i29 = i3;
                                nmo0Var3 = nmo0Var;
                                j12 = j6;
                                i31 = i23;
                                i30 = i;
                                z3 = z;
                            }
                            M.S();
                            if (androidx.compose.runtime.b.d()) {
                                i32 = i28;
                                androidx.compose.runtime.b.f(1809465675, i14, i31, "androidx.compose.material3.Text (Text.kt:120)");
                            } else {
                                i32 = i28;
                            }
                            M.K(-565217106);
                            if (j5 != 16) {
                                b = j5;
                            } else {
                                M.K(-565216333);
                                b = nmo0Var3.b();
                                if (b == 16) {
                                    b = ((l5g) M.r(zfj.a)).a;
                                }
                                M.j();
                            }
                            M.j();
                            int i40 = i31;
                            nmo0 nmo0Var4 = nmo0Var3;
                            obo0 obo0Var5 = obo0Var3;
                            int i41 = i40 << 6;
                            int i42 = i30;
                            int i43 = i32;
                            bu6.b(str, q630Var2, nmo0.e(nmo0Var4, b, j12, null, null, j13, null, obo0Var3 != null ? obo0Var3.a : 0, j7, 16609104), null, i42, z3, i43, i29, null, M, ((i40 >> 9) & 7168) | (i14 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i41 & 57344) | (i41 & 458752) | (i41 & 3670016) | (i41 & 29360128) | ((i14 << 18) & 1879048192), 256);
                            aVar2 = M;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            i25 = i43;
                            j10 = j5;
                            j11 = j13;
                            nmo0Var2 = nmo0Var4;
                            z2 = z3;
                            q630Var3 = q630Var2;
                            i26 = i29;
                            i27 = i42;
                            long j15 = j12;
                            obo0Var2 = obo0Var5;
                            j8 = j7;
                            j9 = j15;
                        }
                        s = aVar2.s();
                        if (s == null) {
                            s.d = new wzs() { // from class: xsna.yio0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int I = ne7.I(i4 | 1);
                                    int I2 = ne7.I(i5);
                                    cjo0.c(str, q630Var3, j10, j9, j11, obo0Var2, j8, i27, z2, i25, i26, nmo0Var2, (androidx.compose.runtime.a) obj, I, I2, i6);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                }
                i24 = i6 & 32768;
                if (i24 == 0) {
                }
                if ((i6 & 65536) == 0) {
                }
                if ((i5 & 12582912) == 0) {
                }
                if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            i13 = i9;
            if ((i6 & 512) != 0) {
            }
            i14 = i13;
            i15 = i6 & 1024;
            if (i15 != 0) {
            }
            i17 = i6 & 2048;
            if (i17 != 0) {
            }
            int i362 = i16;
            i18 = i6 & 4096;
            if (i18 != 0) {
            }
            i20 = i6 & 8192;
            if (i20 != 0) {
            }
            i22 = i6 & 16384;
            if (i22 != 0) {
            }
            i24 = i6 & 32768;
            if (i24 == 0) {
            }
            if ((i6 & 65536) == 0) {
            }
            if ((i5 & 12582912) == 0) {
            }
            if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i8 = i6 & 4;
        if (i8 == 0) {
        }
        if ((i6 & 8) == 0) {
        }
        i10 = i6 & 16;
        if (i10 == 0) {
        }
        if ((i6 & 32) == 0) {
        }
        if ((i6 & 64) == 0) {
        }
        int i352 = 4194304;
        if ((i6 & 128) == 0) {
        }
        i12 = i6 & 256;
        if (i12 == 0) {
        }
        i13 = i9;
        if ((i6 & 512) != 0) {
        }
        i14 = i13;
        i15 = i6 & 1024;
        if (i15 != 0) {
        }
        i17 = i6 & 2048;
        if (i17 != 0) {
        }
        int i3622 = i16;
        i18 = i6 & 4096;
        if (i18 != 0) {
        }
        i20 = i6 & 8192;
        if (i20 != 0) {
        }
        i22 = i6 & 16384;
        if (i22 != 0) {
        }
        i24 = i6 & 32768;
        if (i24 == 0) {
        }
        if ((i6 & 65536) == 0) {
        }
        if ((i5 & 12582912) == 0) {
        }
        if (M.t(i14 & 1, (i14 & 306783379) == 306783378 || (i23 & 4793491) != 4793490)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }
}
