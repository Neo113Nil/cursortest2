package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.horizontal.HorizontalListItem$VisualContent;
import com.vk.core.compose.component.tile.Tile$BottomPaddingPreset;
import com.vk.core.compose.component.tile.Tile$VisualAndTextGap;
import com.vk.core.compose.component.tile.TileContentType;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import xsna.cto0;
import xsna.dt1;

/* compiled from: VkTile.kt */
/* loaded from: classes17.dex */
public final class asv0 {

    /* compiled from: VkTile.kt */
    public static final class a implements yzs<qa8, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ HorizontalListItem$VisualContent b;
        public final /* synthetic */ long c;
        public final /* synthetic */ boolean d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ yzs f;

        public a(HorizontalListItem$VisualContent horizontalListItem$VisualContent, long j, boolean z, boolean z2, yzs yzsVar) {
            this.b = horizontalListItem$VisualContent;
            this.c = j;
            this.d = z;
            this.e = z2;
            this.f = yzsVar;
        }

        @Override // xsna.yzs
        public final s3q0 invoke(qa8 qa8Var, androidx.compose.runtime.a aVar, Integer num) {
            qa8 qa8Var2 = qa8Var;
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if ((intValue & 6) == 0) {
                intValue |= aVar2.J(qa8Var2) ? 4 : 2;
            }
            if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1470655449, intValue, -1, "com.vk.core.compose.component.tile.VkTile.<anonymous> (VkTile.kt:107)");
                }
                boolean z = (intValue & 14) == 4;
                Object x = aVar2.x();
                if (z || x == a.C0011a.a) {
                    x = new eto0(qa8Var2);
                    aVar2.R(x);
                }
                eto0 eto0Var = (eto0) x;
                aVar2.K(1156396319);
                this.b.a(0, this.c, aVar2);
                aVar2.j();
                aVar2.K(-1155020955);
                asv0.a(eto0Var, this.d, this.e, aVar2, 0);
                this.f.invoke(eto0Var, aVar2, 0);
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public static final void a(eto0 eto0Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        final eto0 eto0Var2;
        androidx.compose.runtime.a M = aVar.M(1724323709);
        int i2 = (M.J(eto0Var) ? 4 : 2) | i | (M.l(z) ? 32 : 16) | (M.l(z2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1724323709, i2, -1, "com.vk.core.compose.component.tile.RemoveAndSelectedGvozdi (VkTile.kt:125)");
            }
            if (z) {
                M.K(1518913753);
                dt1.a.getClass();
                float f = -12;
                eto0Var2 = eto0Var;
                eto0Var2.a(dt1.a.b, null, 36, (Float.floatToRawIntBits(f) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), voi.c, M, ((i2 << 15) & 458752) | 28038, 2);
            } else {
                eto0Var2 = eto0Var;
                M.K(1514579333);
            }
            M.j();
            if (z2) {
                M.K(1519531366);
                b(eto0Var2, M, i2 & 14);
            } else {
                M.K(1514579333);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            eto0Var2 = eto0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(z, z2, i) { // from class: xsna.yrv0
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    asv0.a(eto0.this, this.c, this.d, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(eto0 eto0Var, androidx.compose.runtime.a aVar, int i) {
        eto0 eto0Var2;
        androidx.compose.runtime.a M = aVar.M(502480259);
        int i2 = (M.J(eto0Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(502480259, i2, -1, "com.vk.core.compose.component.tile.SelectedGvozd (VkTile.kt:149)");
            }
            M.K(1428859390);
            dt1.a.getClass();
            float f = 10;
            eto0Var2 = eto0Var;
            eto0Var2.a(dt1.a.j, null, 40, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L), voi.d, M, ((i2 << 15) & 458752) | 28038, 2);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            eto0Var2 = eto0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.v(eto0Var2, i, 19);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(TileContentType tileContentType, final HorizontalListItem$VisualContent horizontalListItem$VisualContent, final fsv0 fsv0Var, final q630 q630Var, final boolean z, final boolean z2, yzs yzsVar, Tile$VisualAndTextGap tile$VisualAndTextGap, Tile$BottomPaddingPreset tile$BottomPaddingPreset, androidx.compose.runtime.a aVar, final int i, final int i2) {
        yzs yzsVar2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        TileContentType tileContentType2;
        androidx.compose.runtime.a aVar2;
        final Tile$BottomPaddingPreset tile$BottomPaddingPreset2;
        final yzs yzsVar3;
        final Tile$VisualAndTextGap tile$VisualAndTextGap2;
        androidx.compose.runtime.f s;
        int i8;
        androidx.compose.runtime.a M = aVar.M(-437850345);
        int i9 = i | (M.o(tileContentType.ordinal()) ? 4 : 2) | (M.J(horizontalListItem$VisualContent) ? 32 : 16) | (M.J(fsv0Var) ? 256 : 128) | (M.J(q630Var) ? 2048 : 1024) | (M.l(z) ? 16384 : 8192) | (M.l(z2) ? 131072 : 65536);
        int i10 = i2 & 64;
        if (i10 != 0) {
            i9 |= 1572864;
        } else if ((i & 1572864) == 0) {
            yzsVar2 = yzsVar;
            i9 |= M.y(yzsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            i3 = i2 & 128;
            if (i3 == 0) {
                i4 = 12582912;
            } else {
                i4 = M.o(tile$VisualAndTextGap == null ? -1 : tile$VisualAndTextGap.ordinal()) ? 8388608 : 4194304;
            }
            int i11 = i9 | i4;
            i5 = i2 & 256;
            if (i5 == 0) {
                i6 = 100663296;
            } else {
                i6 = M.o(tile$BottomPaddingPreset == null ? -1 : tile$BottomPaddingPreset.ordinal()) ? 67108864 : 33554432;
            }
            i7 = i11 | i6;
            if (M.t(i7 & 1, (38347923 & i7) == 38347922)) {
                tileContentType2 = tileContentType;
                aVar2 = M;
                aVar2.h();
                tile$BottomPaddingPreset2 = tile$BottomPaddingPreset;
                yzsVar3 = yzsVar2;
                tile$VisualAndTextGap2 = tile$VisualAndTextGap;
            } else {
                yzsVar3 = i10 != 0 ? voi.b : yzsVar2;
                tile$VisualAndTextGap2 = i3 != 0 ? Tile$VisualAndTextGap.Default : tile$VisualAndTextGap;
                tile$BottomPaddingPreset2 = i5 != 0 ? Tile$BottomPaddingPreset.Default : tile$BottomPaddingPreset;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-437850345, i7, -1, "com.vk.core.compose.component.tile.VkTileFill (VkTile.kt:76)");
                }
                float f = 0;
                u890 u890Var = new u890(f, f, f, f);
                int i12 = i7 >> 21;
                int i13 = (i12 & 14) | 48;
                if (androidx.compose.runtime.b.d()) {
                    i8 = i12;
                    androidx.compose.runtime.b.f(927180528, i13, -1, "com.vk.core.compose.component.tile.TileDefaults.visualAndTextGap (TileDefaults.kt:52)");
                } else {
                    i8 = i12;
                }
                float f2 = kqu0.a;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                tileContentType2 = tileContentType;
                aVar2 = M;
                azu0.c(kai.c(1470655449, new zrv0(horizontalListItem$VisualContent, z, z2, yzsVar3), M), fsv0Var, u890Var, kqu0.s, s200.C(q630Var, cto0.d(tileContentType2, M, (i7 & 14) | 384 | (i8 & 112))), aVar2, (((((i7 << 3) & 7168) | 384) >> 6) & 112) | 390);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            }
            s = aVar2.s();
            if (s == null) {
                final TileContentType tileContentType3 = tileContentType2;
                s.d = new wzs() { // from class: xsna.wrv0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        asv0.c(TileContentType.this, horizontalListItem$VisualContent, fsv0Var, q630Var, z, z2, yzsVar3, tile$VisualAndTextGap2, tile$BottomPaddingPreset2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        yzsVar2 = yzsVar;
        i3 = i2 & 128;
        if (i3 == 0) {
        }
        int i112 = i9 | i4;
        i5 = i2 & 256;
        if (i5 == 0) {
        }
        i7 = i112 | i6;
        if (M.t(i7 & 1, (38347923 & i7) == 38347922)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void d(final TileContentType tileContentType, final HorizontalListItem$VisualContent horizontalListItem$VisualContent, final long j, final iev ievVar, final q630 q630Var, boolean z, boolean z2, yzs<? super eto0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar, Tile$VisualAndTextGap tile$VisualAndTextGap, Tile$BottomPaddingPreset tile$BottomPaddingPreset, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        int ordinal;
        int i8;
        androidx.compose.runtime.a aVar2;
        final Tile$VisualAndTextGap tile$VisualAndTextGap2;
        final boolean z5;
        final boolean z6;
        final yzs<? super eto0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar2;
        final Tile$BottomPaddingPreset tile$BottomPaddingPreset2;
        int i9;
        yzs<? super eto0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar3;
        int i10;
        u890 u890Var;
        Tile$BottomPaddingPreset tile$BottomPaddingPreset3;
        androidx.compose.runtime.a M = aVar.M(366910767);
        if ((i & 6) == 0) {
            i3 = (M.o(tileContentType.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i11 = i3 | (M.J(horizontalListItem$VisualContent) ? 32 : 16);
        if ((i & 384) == 0) {
            i11 |= M.p(j) ? 256 : 128;
        }
        int i12 = i11 | (M.J(ievVar) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192);
        int i13 = i2 & 32;
        if (i13 != 0) {
            i4 = i12 | 196608;
            z3 = z;
        } else {
            z3 = z;
            i4 = i12 | (M.l(z3) ? 131072 : 65536);
        }
        int i14 = i2 & 64;
        if (i14 != 0) {
            i5 = i4 | 1572864;
            z4 = z2;
        } else {
            z4 = z2;
            i5 = i4 | (M.l(z4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i15 = i2 & 128;
        if (i15 != 0) {
            i5 |= 12582912;
        } else if ((i & 12582912) == 0) {
            i5 |= M.y(yzsVar) ? 8388608 : 4194304;
        }
        int i16 = i2 & 256;
        if (i16 != 0) {
            i6 = i5 | 100663296;
        } else {
            i6 = i5 | (M.o(tile$VisualAndTextGap == null ? -1 : tile$VisualAndTextGap.ordinal()) ? 67108864 : 33554432);
        }
        int i17 = i2 & 512;
        if (i17 != 0) {
            i8 = i6 | 805306368;
            i7 = i17;
        } else {
            if (tile$BottomPaddingPreset == null) {
                i7 = i17;
                ordinal = -1;
            } else {
                i7 = i17;
                ordinal = tile$BottomPaddingPreset.ordinal();
            }
            i8 = i6 | (M.o(ordinal) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        }
        if (M.t(i8 & 1, (306783379 & i8) != 306783378)) {
            boolean z7 = i13 != 0 ? false : z3;
            if (i14 != 0) {
                z4 = false;
            }
            if (i15 != 0) {
                int i18 = i7;
                yzsVar3 = voi.a;
                i9 = i18;
            } else {
                i9 = i7;
                yzsVar3 = yzsVar;
            }
            Tile$VisualAndTextGap tile$VisualAndTextGap3 = i16 != 0 ? Tile$VisualAndTextGap.Default : tile$VisualAndTextGap;
            Tile$BottomPaddingPreset tile$BottomPaddingPreset4 = i9 != 0 ? Tile$BottomPaddingPreset.Default : tile$BottomPaddingPreset;
            if (androidx.compose.runtime.b.d()) {
                i10 = -1;
                androidx.compose.runtime.b.f(366910767, i8, -1, "com.vk.core.compose.component.tile.VkTileHug (VkTile.kt:45)");
            } else {
                i10 = -1;
            }
            int i19 = i8 & 14;
            int i20 = i19 | 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1663291858, i20, i10, "com.vk.core.compose.component.tile.TileDefaults.tileHugVisualContentPadding (TileDefaults.kt:62)");
            }
            int i21 = cto0.a.$EnumSwitchMapping$0[tileContentType.ordinal()];
            if (i21 == 1) {
                float f = 0;
                float f2 = kqu0.r;
                u890Var = new u890(f2, f, f2, f);
            } else {
                if (i21 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                float f3 = 0;
                u890Var = new u890(f3, f3, f3, f3);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i22 = i8 >> 24;
            int i23 = (i22 & 14) | 48;
            if (androidx.compose.runtime.b.d()) {
                tile$BottomPaddingPreset3 = tile$BottomPaddingPreset4;
                androidx.compose.runtime.b.f(927180528, i23, -1, "com.vk.core.compose.component.tile.TileDefaults.visualAndTextGap (TileDefaults.kt:52)");
            } else {
                tile$BottomPaddingPreset3 = tile$BottomPaddingPreset4;
            }
            float f4 = kqu0.a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z8 = z7;
            yzs<? super eto0, ? super androidx.compose.runtime.a, ? super Integer, s3q0> yzsVar4 = yzsVar3;
            aVar2 = M;
            azu0.c(kai.c(1470655449, new a(horizontalListItem$VisualContent, j, z7, z4, yzsVar3), M), ievVar, u890Var, kqu0.s, s200.C(q630Var, cto0.d(tileContentType, M, (i22 & 112) | i19 | 384)), aVar2, (((i8 & 7168) >> 6) & 112) | 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            z5 = z8;
            yzsVar2 = yzsVar4;
            z6 = z4;
            tile$BottomPaddingPreset2 = tile$BottomPaddingPreset3;
            tile$VisualAndTextGap2 = tile$VisualAndTextGap3;
        } else {
            aVar2 = M;
            aVar2.h();
            tile$VisualAndTextGap2 = tile$VisualAndTextGap;
            z5 = z3;
            z6 = z4;
            yzsVar2 = yzsVar;
            tile$BottomPaddingPreset2 = tile$BottomPaddingPreset;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.xrv0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    asv0.d(TileContentType.this, horizontalListItem$VisualContent, j, ievVar, q630Var, z5, z6, yzsVar2, tile$VisualAndTextGap2, tile$BottomPaddingPreset2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                    return s3q0.a;
                }
            };
        }
    }
}
