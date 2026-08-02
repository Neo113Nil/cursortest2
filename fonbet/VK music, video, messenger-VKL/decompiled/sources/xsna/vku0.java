package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.Map;
import xsna.q630;

/* compiled from: VkClickableText.kt */
/* loaded from: classes17.dex */
public final class vku0 {
    /* JADX WARN: Removed duplicated region for block: B:129:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final us2 us2Var, q630 q630Var, final long j, long j2, long j3, obo0 obo0Var, long j4, t7z t7zVar, int i, boolean z, int i2, izs izsVar, Map map, final izs izsVar2, izs izsVar3, final frv0 frv0Var, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        q630 q630Var2;
        int i7;
        int i8;
        long j5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        long j6;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.a aVar2;
        final t7z t7zVar2;
        final int i21;
        final int i22;
        final izs izsVar4;
        final Map map2;
        final izs izsVar5;
        final long j7;
        final q630 q630Var3;
        final obo0 obo0Var2;
        final boolean z2;
        final long j8;
        final long j9;
        androidx.compose.runtime.f s;
        int i23;
        izs izsVar6;
        izs izsVar7;
        int i24;
        Object obj;
        Map map3;
        t7z t7zVar3;
        long j10;
        boolean z3;
        izs izsVar8;
        long j11;
        int i25;
        int i26;
        izs izsVar9;
        obo0 obo0Var3;
        androidx.compose.runtime.a M = aVar.M(649554675);
        if ((i3 & 6) == 0) {
            i6 = (M.J(us2Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i27 = i5 & 2;
        if (i27 != 0) {
            i6 |= 48;
        } else if ((i3 & 48) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 32 : 16;
            if ((i3 & 384) == 0) {
                i6 |= M.p(j) ? 256 : 128;
            }
            i7 = i5 & 8;
            if (i7 == 0) {
                i8 = i6 | 3072;
                j5 = j2;
            } else {
                i8 = i6;
                j5 = j2;
                if ((i3 & 3072) == 0) {
                    i8 |= M.p(j5) ? 2048 : 1024;
                }
            }
            int i28 = i8 | 1794048;
            i9 = i5 & 128;
            if (i9 == 0) {
                i28 = i8 | 14376960;
            } else if ((i3 & 12582912) == 0) {
                i10 = i9;
                i28 |= M.p(j3) ? 8388608 : 4194304;
                i11 = i28 | 905969664;
                i12 = i5 & 1024;
                if (i12 != 0) {
                    i13 = i4 | 6;
                } else {
                    i13 = i4 | (M.J(obo0Var) ? 4 : 2);
                }
                i14 = i5 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                    j6 = j4;
                } else {
                    j6 = j4;
                    if ((i4 & 48) == 0) {
                        i13 |= M.p(j6) ? 32 : 16;
                    }
                }
                int i29 = i13;
                int i30 = i29 | 128;
                i15 = i5 & 8192;
                if (i15 != 0) {
                    i16 = i29 | 3200;
                } else if ((i4 & 3072) == 0) {
                    i16 = i30 | (M.o(i) ? 2048 : 1024);
                } else {
                    i16 = i30;
                }
                int i31 = i16 | 24576;
                i17 = i5 & 32768;
                if (i17 != 0) {
                    i18 = i16 | 221184;
                } else {
                    i18 = i31 | (M.o(i2) ? 131072 : 65536);
                }
                i19 = i5 & 65536;
                if (i19 != 0) {
                    i18 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    i18 |= M.y(izsVar) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i20 = i18 | 12582912 | (M.y(izsVar2) ? 67108864 : 33554432) | 805306368;
                if (M.t(i11 & 1, ((i11 & 306783379) != 306783378 && (i20 & 306783379) == 306783378 && ((M.J(frv0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
                    M.V();
                    int i32 = i3 & 1;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (i32 == 0 || M.i()) {
                        if (i27 != 0) {
                            q630Var2 = q630.a.a;
                        }
                        if (i7 != 0) {
                            j5 = fno0.c;
                        }
                        long j12 = i10 != 0 ? fno0.c : j3;
                        obo0 obo0Var4 = i12 != 0 ? null : obo0Var;
                        if (i14 != 0) {
                            j6 = fno0.c;
                        }
                        t7z t7zVar4 = t7z.d;
                        int i33 = i20 & (-897);
                        int i34 = i15 != 0 ? 1 : i;
                        int i35 = i17 != 0 ? Integer.MAX_VALUE : i2;
                        obo0 obo0Var5 = obo0Var4;
                        if (i19 != 0) {
                            Object x = M.x();
                            if (x == c0012a) {
                                i23 = i33;
                                x = new ltl0(12);
                                M.R(x);
                            } else {
                                i23 = i33;
                            }
                            izsVar6 = (izs) x;
                        } else {
                            i23 = i33;
                            izsVar6 = izsVar;
                        }
                        Object x2 = M.x();
                        if (x2 == c0012a) {
                            izsVar7 = izsVar6;
                            x2 = new jyq0(7);
                            M.R(x2);
                        } else {
                            izsVar7 = izsVar6;
                        }
                        izs izsVar10 = (izs) x2;
                        i24 = i35;
                        obj = null;
                        map3 = jgp.b;
                        t7zVar3 = t7zVar4;
                        j10 = j12;
                        z3 = true;
                        izsVar8 = izsVar7;
                        j11 = j5;
                        i25 = i23;
                        i26 = i34;
                        izsVar9 = izsVar10;
                        q630Var3 = q630Var2;
                        obo0Var3 = obo0Var5;
                    } else {
                        M.h();
                        int i36 = i20 & (-897);
                        j10 = j3;
                        t7zVar3 = t7zVar;
                        i26 = i;
                        z3 = z;
                        izsVar8 = izsVar;
                        map3 = map;
                        izsVar9 = izsVar3;
                        j11 = j5;
                        obj = null;
                        i24 = i2;
                        i25 = i36;
                        q630Var3 = q630Var2;
                        obo0Var3 = obo0Var;
                    }
                    M.S();
                    long j13 = j6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(649554675, i11, i25, "com.vk.core.compose.component.VkClickableText (VkClickableText.kt:64)");
                    }
                    Object x3 = M.x();
                    if (x3 == c0012a) {
                        x3 = androidx.compose.runtime.k.b(obj);
                        M.R(x3);
                    }
                    wh50 wh50Var = (wh50) x3;
                    int i37 = i25;
                    boolean z4 = (234881024 & i25) == 67108864;
                    Object x4 = M.x();
                    if (z4 || x4 == c0012a) {
                        x4 = new uku0(wh50Var, izsVar9, izsVar2);
                        M.R(x4);
                    }
                    plb0 plb0Var = skn0.a;
                    izs izsVar11 = izsVar9;
                    okn0 okn0Var = new okn0(izsVar2, izsVar11, null, (PointerInputEventHandler) x4, 4);
                    us2 d = frv0Var.b ? zs2.d(us2Var) : us2Var;
                    q630 g = q630Var3.g(okn0Var);
                    nmo0 a = nmo0.a(frv0Var.a, 0L, 0L, null, null, 0L, 0L, null, t7zVar3, 15720447);
                    boolean z5 = (i37 & 3670016) == 1048576;
                    Object x5 = M.x();
                    int i38 = 6;
                    if (z5 || x5 == c0012a) {
                        x5 = new lyb0(i38, wh50Var, izsVar8);
                        M.R(x5);
                    }
                    int i39 = i37 >> 6;
                    aVar2 = M;
                    djo0.c(d, g, j, j11, j10, obo0Var3, j13, i26, z3, i24, 0, map3, (izs) x5, a, aVar2, (268435328 & i11) | ((i37 << 27) & 1879048192), ((i37 >> 3) & 14) | (i39 & 112) | 384 | (i39 & 7168) | 196608, 16384);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    j7 = j11;
                    j9 = j10;
                    obo0Var2 = obo0Var3;
                    j8 = j13;
                    i21 = i26;
                    z2 = z3;
                    i22 = i24;
                    map2 = map3;
                    t7zVar2 = t7zVar3;
                    izsVar5 = izsVar11;
                    izsVar4 = izsVar8;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    t7zVar2 = t7zVar;
                    i21 = i;
                    i22 = i2;
                    izsVar4 = izsVar;
                    map2 = map;
                    izsVar5 = izsVar3;
                    j7 = j5;
                    q630Var3 = q630Var2;
                    obo0Var2 = obo0Var;
                    z2 = z;
                    j8 = j6;
                    j9 = j3;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.sku0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int I = ne7.I(i3 | 1);
                            int I2 = ne7.I(i4);
                            vku0.a(us2.this, q630Var3, j, j7, j9, obo0Var2, j8, t7zVar2, i21, z2, i22, izsVar4, map2, izsVar2, izsVar5, frv0Var, (androidx.compose.runtime.a) obj2, I, I2, i5);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i10 = i9;
            i11 = i28 | 905969664;
            i12 = i5 & 1024;
            if (i12 != 0) {
            }
            i14 = i5 & 2048;
            if (i14 != 0) {
            }
            int i292 = i13;
            int i302 = i292 | 128;
            i15 = i5 & 8192;
            if (i15 != 0) {
            }
            int i312 = i16 | 24576;
            i17 = i5 & 32768;
            if (i17 != 0) {
            }
            i19 = i5 & 65536;
            if (i19 != 0) {
            }
            i20 = i18 | 12582912 | (M.y(izsVar2) ? 67108864 : 33554432) | 805306368;
            if (M.t(i11 & 1, ((i11 & 306783379) != 306783378 && (i20 & 306783379) == 306783378 && ((M.J(frv0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        if ((i3 & 384) == 0) {
        }
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        int i282 = i8 | 1794048;
        i9 = i5 & 128;
        if (i9 == 0) {
        }
        i10 = i9;
        i11 = i282 | 905969664;
        i12 = i5 & 1024;
        if (i12 != 0) {
        }
        i14 = i5 & 2048;
        if (i14 != 0) {
        }
        int i2922 = i13;
        int i3022 = i2922 | 128;
        i15 = i5 & 8192;
        if (i15 != 0) {
        }
        int i3122 = i16 | 24576;
        i17 = i5 & 32768;
        if (i17 != 0) {
        }
        i19 = i5 & 65536;
        if (i19 != 0) {
        }
        i20 = i18 | 12582912 | (M.y(izsVar2) ? 67108864 : 33554432) | 805306368;
        if (M.t(i11 & 1, ((i11 & 306783379) != 306783378 && (i20 & 306783379) == 306783378 && ((M.J(frv0Var) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    @ozl
    public static final void b(final us2 us2Var, final q630 q630Var, long j, long j2, long j3, long j4, t7z t7zVar, int i, boolean z, int i2, izs izsVar, Map map, final izs izsVar2, final frv0 frv0Var, androidx.compose.runtime.a aVar, final int i3) {
        int i4;
        androidx.compose.runtime.a aVar2;
        final long j5;
        final long j6;
        final long j7;
        final long j8;
        final t7z t7zVar2;
        final int i5;
        final boolean z2;
        final int i6;
        final izs izsVar3;
        final Map map2;
        long j9;
        long j10;
        t7z t7zVar3;
        int i7;
        izs izsVar4;
        int i8;
        boolean z3;
        long j11;
        long j12;
        Map map3;
        boolean z4;
        wh50 wh50Var;
        izs izsVar5;
        androidx.compose.runtime.a M = aVar.M(644400352);
        if ((i3 & 6) == 0) {
            i4 = i3 | (M.J(us2Var) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.J(q630Var) ? 32 : 16;
        }
        int i9 = i4 | 920350080;
        int i10 = (M.y(izsVar2) ? 67108864 : 33554432) | 14380214 | (M.J(frv0Var) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        int i11 = 1;
        if (M.t(i9 & 1, ((i9 & 306783379) == 306783378 && (306783379 & i10) == 306783378) ? false : true)) {
            M.V();
            int i12 = i3 & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i12 == 0 || M.i()) {
                j9 = l5g.k;
                j10 = fno0.c;
                t7zVar3 = t7z.d;
                int i13 = i10 & (-897);
                Object x = M.x();
                if (x == c0012a) {
                    x = new mcl0(16);
                    M.R(x);
                }
                i7 = i13;
                izsVar4 = (izs) x;
                i8 = Integer.MAX_VALUE;
                z3 = true;
                j11 = j10;
                j12 = j11;
                map3 = jgp.b;
                z4 = true;
            } else {
                M.h();
                j9 = j;
                j10 = j3;
                j12 = j4;
                t7zVar3 = t7zVar;
                z4 = z;
                i8 = i2;
                izsVar4 = izsVar;
                map3 = map;
                i7 = i10 & (-897);
                z3 = true;
                j11 = j2;
                i11 = i;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(644400352, i9, i7, "com.vk.core.compose.component.VkClickableText (VkClickableText.kt:144)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.k.b(null);
                M.R(x2);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.k.b(null);
                M.R(x3);
            }
            wh50 wh50Var3 = (wh50) x3;
            boolean z5 = (i9 & 14) == 4 ? z3 : false;
            if ((234881024 & i7) != 67108864) {
                z3 = false;
            }
            boolean z6 = z5 | z3;
            Object x4 = M.x();
            if (z6 || x4 == c0012a) {
                x4 = new brf(wh50Var2, us2Var, izsVar2, wh50Var3, 5);
                wh50Var = wh50Var2;
                M.R(x4);
            } else {
                wh50Var = wh50Var2;
            }
            q630 R = x19.R(q630.a.a, (izs) x4);
            us2 d = frv0Var.b ? zs2.d(us2Var) : us2Var;
            q630 g = q630Var.g(R);
            t7z t7zVar4 = t7zVar3;
            nmo0 a = nmo0.a(frv0Var.a, 0L, 0L, null, null, 0L, 0L, null, t7zVar4, 15720447);
            Object x5 = M.x();
            if (x5 == c0012a) {
                izsVar5 = izsVar4;
                x5 = new wze0(7, wh50Var, izsVar5);
                M.R(x5);
            } else {
                izsVar5 = izsVar4;
            }
            Map map4 = map3;
            aVar2 = M;
            us2 us2Var2 = d;
            long j13 = j9;
            boolean z7 = z4;
            int i14 = i8;
            long j14 = j10;
            djo0.c(us2Var2, g, j13, j11, j14, null, j12, i11, z7, i14, 0, map4, (izs) x5, a, aVar2, (268435328 & i9) | 805306368, 200118, 16384);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j5 = j13;
            j6 = j11;
            j7 = j14;
            j8 = j12;
            i5 = i11;
            z2 = z7;
            i6 = i14;
            map2 = map4;
            t7zVar2 = t7zVar4;
            izsVar3 = izsVar5;
        } else {
            aVar2 = M;
            aVar2.h();
            j5 = j;
            j6 = j2;
            j7 = j3;
            j8 = j4;
            t7zVar2 = t7zVar;
            i5 = i;
            z2 = z;
            i6 = i2;
            izsVar3 = izsVar;
            map2 = map;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.tku0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i3 | 1);
                    vku0.b(us2.this, q630Var, j5, j6, j7, j8, t7zVar2, i5, z2, i6, izsVar3, map2, izsVar2, frv0Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
