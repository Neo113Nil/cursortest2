package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.core.compose.component.defaults.CellButton$Appearance;
import com.vk.core.compose.component.defaults.CellButton$IconAlign;
import com.vk.core.compose.component.defaults.CellButton$IconBackgroundStyle;
import com.vk.core.compose.component.defaults.CellButton$IconSize;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.q630;

/* compiled from: VkCellButton.kt */
/* loaded from: classes17.dex */
public final class qiu0 {
    /* JADX WARN: Removed duplicated region for block: B:105:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final gzs gzsVar, q630 q630Var, lg90 lg90Var, l5g l5gVar, String str2, int i, CellButton$Appearance cellButton$Appearance, CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle, CellButton$IconSize cellButton$IconSize, CellButton$IconAlign cellButton$IconAlign, boolean z, androidx.compose.runtime.a aVar, final int i2, final int i3) {
        int i4;
        gzs gzsVar2;
        q630 q630Var2;
        int i5;
        int i6;
        l5g l5gVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        androidx.compose.runtime.a aVar2;
        final lg90 lg90Var2;
        final String str3;
        final int i16;
        final CellButton$Appearance cellButton$Appearance2;
        final CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle2;
        final CellButton$IconAlign cellButton$IconAlign2;
        final boolean z2;
        final q630 q630Var3;
        final l5g l5gVar3;
        final CellButton$IconSize cellButton$IconSize2;
        androidx.compose.runtime.f s;
        int i17;
        q630 q630Var4;
        androidx.compose.runtime.a M = aVar.M(-1564958123);
        if ((i2 & 6) == 0) {
            i4 = (M.J(str) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            gzsVar2 = gzsVar;
            i4 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        int i18 = i3 & 4;
        if (i18 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i4 |= (i2 & 4096) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                l5gVar2 = l5gVar;
                i4 |= M.J(l5gVar2) ? 16384 : 8192;
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                } else if ((i2 & 196608) == 0) {
                    i4 |= M.J(str2) ? 131072 : 65536;
                }
                int i19 = i4 | 1572864;
                i8 = i3 & 128;
                if (i8 != 0) {
                    i19 = i4 | 14155776;
                } else if ((12582912 & i2) == 0) {
                    i19 |= M.o(cellButton$Appearance == null ? -1 : cellButton$Appearance.ordinal()) ? 8388608 : 4194304;
                }
                i9 = i3 & 256;
                if (i9 != 0) {
                    i19 |= 100663296;
                } else if ((i2 & 100663296) == 0) {
                    i19 |= M.o(cellButton$IconBackgroundStyle == null ? -1 : cellButton$IconBackgroundStyle.ordinal()) ? 67108864 : 33554432;
                }
                i10 = i3 & 512;
                if (i10 != 0) {
                    i19 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i19 |= M.o(cellButton$IconSize != null ? cellButton$IconSize.ordinal() : -1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                }
                i11 = i19;
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i14 = 54;
                    i13 = i12;
                } else {
                    i13 = i12;
                    i14 = 6 | (M.l(z) ? 32 : 16);
                }
                i15 = i14 | 384;
                if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i15 & 147) != 146)) {
                    if (i18 != 0) {
                        q630Var4 = q630.a.a;
                        i17 = 6;
                    } else {
                        i17 = 6;
                        q630Var4 = q630Var2;
                    }
                    lg90 lg90Var3 = i5 != 0 ? null : lg90Var;
                    int i20 = i13;
                    l5g l5gVar4 = i6 != 0 ? null : l5gVar2;
                    String str4 = i7 == 0 ? str2 : null;
                    CellButton$Appearance cellButton$Appearance3 = i8 != 0 ? CellButton$Appearance.Accent : cellButton$Appearance;
                    CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle3 = i9 != 0 ? CellButton$IconBackgroundStyle.None : cellButton$IconBackgroundStyle;
                    CellButton$IconSize cellButton$IconSize3 = i10 != 0 ? CellButton$IconSize.Small : cellButton$IconSize;
                    CellButton$IconAlign cellButton$IconAlign3 = CellButton$IconAlign.Center;
                    boolean z3 = i20 != 0 ? true : z;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1564958123, i11, i15, "com.vk.core.compose.component.cell.button.VkCellButton (VkCellButton.kt:105)");
                    }
                    M.K(203752017);
                    int i21 = i17 | (i11 & 112) | (i11 & 896) | 32768;
                    int i22 = i11 << 3;
                    int i23 = i11 >> 3;
                    aVar2 = M;
                    CellButton$Appearance cellButton$Appearance4 = cellButton$Appearance3;
                    b(kai.c(-1460170341, new g8k(cellButton$Appearance3, str, str4, 6), M), gzsVar2, q630Var4, lg90Var3, l5gVar4, cellButton$Appearance4, cellButton$IconBackgroundStyle3, cellButton$IconSize3, cellButton$IconAlign3, z3, aVar2, (i23 & 234881024) | i21 | (57344 & i22) | (i22 & 458752) | (3670016 & i23) | (29360128 & i23) | 805306368, (i15 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    aVar2.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    str3 = str4;
                    q630Var3 = q630Var4;
                    lg90Var2 = lg90Var3;
                    l5gVar3 = l5gVar4;
                    cellButton$Appearance2 = cellButton$Appearance4;
                    cellButton$IconBackgroundStyle2 = cellButton$IconBackgroundStyle3;
                    cellButton$IconSize2 = cellButton$IconSize3;
                    cellButton$IconAlign2 = cellButton$IconAlign3;
                    z2 = z3;
                    i16 = 2;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    lg90Var2 = lg90Var;
                    str3 = str2;
                    i16 = i;
                    cellButton$Appearance2 = cellButton$Appearance;
                    cellButton$IconBackgroundStyle2 = cellButton$IconBackgroundStyle;
                    cellButton$IconAlign2 = cellButton$IconAlign;
                    z2 = z;
                    q630Var3 = q630Var2;
                    l5gVar3 = l5gVar2;
                    cellButton$IconSize2 = cellButton$IconSize;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.piu0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i2 | 1);
                            qiu0.a(str, gzsVar, q630Var3, lg90Var2, l5gVar3, str3, i16, cellButton$Appearance2, cellButton$IconBackgroundStyle2, cellButton$IconSize2, cellButton$IconAlign2, z2, (androidx.compose.runtime.a) obj, I, i3);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            l5gVar2 = l5gVar;
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            int i192 = i4 | 1572864;
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            i9 = i3 & 256;
            if (i9 != 0) {
            }
            i10 = i3 & 512;
            if (i10 != 0) {
            }
            i11 = i192;
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            i15 = i14 | 384;
            if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i15 & 147) != 146)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        l5gVar2 = l5gVar;
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        int i1922 = i4 | 1572864;
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        i9 = i3 & 256;
        if (i9 != 0) {
        }
        i10 = i3 & 512;
        if (i10 != 0) {
        }
        i11 = i1922;
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        i15 = i14 | 384;
        if (M.t(i11 & 1, (i11 & 306783379) == 306783378 || (i15 & 147) != 146)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void b(final jai jaiVar, final gzs gzsVar, final q630 q630Var, final lg90 lg90Var, final l5g l5gVar, final CellButton$Appearance cellButton$Appearance, final CellButton$IconBackgroundStyle cellButton$IconBackgroundStyle, final CellButton$IconSize cellButton$IconSize, final CellButton$IconAlign cellButton$IconAlign, final boolean z, androidx.compose.runtime.a aVar, final int i, final int i2) {
        jai jaiVar2;
        int i3;
        gzs gzsVar2;
        q630 q630Var2;
        l5g l5gVar2;
        boolean z2;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-973691509);
        if ((i & 6) == 0) {
            jaiVar2 = jaiVar;
            i3 = (M.y(jaiVar2) ? 4 : 2) | i;
        } else {
            jaiVar2 = jaiVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 32 : 16;
        } else {
            gzsVar2 = gzsVar;
        }
        if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i3 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        int i5 = i3 | 3072;
        if ((i & 24576) == 0) {
            i5 |= (i & 32768) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            l5gVar2 = l5gVar;
            i5 |= M.J(l5gVar2) ? 131072 : 65536;
        } else {
            l5gVar2 = l5gVar;
        }
        if ((1572864 & i) == 0) {
            i5 |= M.o(cellButton$Appearance == null ? -1 : cellButton$Appearance.ordinal()) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i) == 0) {
            i5 |= M.o(cellButton$IconBackgroundStyle == null ? -1 : cellButton$IconBackgroundStyle.ordinal()) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i5 |= M.o(cellButton$IconSize == null ? -1 : cellButton$IconSize.ordinal()) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i5 |= M.o(cellButton$IconAlign != null ? cellButton$IconAlign.ordinal() : -1) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i2 & 6) == 0) {
            z2 = z;
            i4 = i2 | (M.l(z2) ? 4 : 2);
        } else {
            z2 = z;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= M.J(null) ? 32 : 16;
        }
        if (M.t(i5 & 1, ((306783379 & i5) == 306783378 && (i4 & 19) == 18) ? false : true)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-973691509, i5, i4, "com.vk.core.compose.component.cell.button.VkCellButton (VkCellButton.kt:50)");
            }
            M.K(966751788);
            uiu0.a(jaiVar2, gzsVar2, q630Var2, lg90Var, l5gVar2, cellButton$Appearance, cellButton$IconBackgroundStyle, cellButton$IconSize, cellButton$IconAlign, z2, M, (i5 & 8190) | 32768 | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (234881024 & i5) | (1879048192 & i5), i4 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.oiu0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qiu0.b(jai.this, gzsVar, q630Var, lg90Var, l5gVar, cellButton$Appearance, cellButton$IconBackgroundStyle, cellButton$IconSize, cellButton$IconAlign, z, (androidx.compose.runtime.a) obj, ne7.I(i | 1), ne7.I(i2));
                    return s3q0.a;
                }
            };
        }
    }
}
