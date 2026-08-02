package xsna;

import androidx.compose.runtime.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.vgc0;

/* compiled from: PostingStep2Cell.kt */
/* loaded from: classes18.dex */
public final class qoc0 {
    public static final void a(final lg90 lg90Var, final String str, final q630 q630Var, String str2, String str3, SemanticsConfiguration semanticsConfiguration, SemanticsConfiguration semanticsConfiguration2, SemanticsConfiguration semanticsConfiguration3, final gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, int i, int i2, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        q630 q630Var2;
        String str4;
        int i7;
        String str5;
        int i8;
        int i9;
        int i10;
        SemanticsConfiguration semanticsConfiguration4;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.runtime.a aVar2;
        final SemanticsConfiguration semanticsConfiguration5;
        final SemanticsConfiguration semanticsConfiguration6;
        final gzs<s3q0> gzsVar3;
        final int i17;
        final SemanticsConfiguration semanticsConfiguration7;
        final String str6;
        final String str7;
        final int i18;
        int i19;
        SemanticsConfiguration semanticsConfiguration8;
        androidx.compose.runtime.a M = aVar.M(-1108200490);
        if ((i3 & 6) == 0) {
            i6 = ((i3 & 8) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        int i20 = i6 | (M.J(str) ? 32 : 16);
        if ((i3 & 384) == 0) {
            q630Var2 = q630Var;
            i20 |= M.J(q630Var2) ? 256 : 128;
        } else {
            q630Var2 = q630Var;
        }
        int i21 = i5 & 8;
        if (i21 != 0) {
            i7 = i20 | 3072;
            str4 = str2;
        } else {
            str4 = str2;
            i7 = i20 | (M.J(str4) ? 2048 : 1024);
        }
        int i22 = i5 & 16;
        if (i22 != 0) {
            i8 = i7 | 24576;
            str5 = str3;
        } else {
            str5 = str3;
            i8 = i7 | (M.J(str5) ? 16384 : 8192);
        }
        int i23 = i5 & 32;
        if (i23 != 0) {
            i9 = i8 | 196608;
        } else {
            i9 = i8 | (M.J(semanticsConfiguration) ? 131072 : 65536);
        }
        int i24 = i5 & 64;
        if (i24 != 0) {
            i10 = i9 | 1572864;
        } else {
            i10 = i9 | (M.J(semanticsConfiguration2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i25 = i5 & 128;
        if (i25 != 0) {
            i11 = i10 | 12582912;
            semanticsConfiguration4 = semanticsConfiguration3;
        } else {
            semanticsConfiguration4 = semanticsConfiguration3;
            i11 = i10 | (M.J(semanticsConfiguration4) ? 8388608 : 4194304);
        }
        int i26 = i11 | (M.y(gzsVar) ? 67108864 : 33554432);
        int i27 = i5 & 512;
        if (i27 != 0) {
            i13 = i26 | 805306368;
            i12 = i27;
        } else {
            i12 = i27;
            i13 = i26 | (M.y(gzsVar2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456);
        }
        int i28 = i5 & 1024;
        if (i28 != 0) {
            i15 = i4 | 6;
            i14 = i28;
        } else if ((i4 & 6) == 0) {
            i14 = i28;
            i15 = i4 | (M.o(i) ? 4 : 2);
        } else {
            i14 = i28;
            i15 = i4;
        }
        int i29 = i5 & 2048;
        if (i29 != 0) {
            i15 |= 48;
            i16 = i29;
        } else if ((i4 & 48) == 0) {
            i16 = i29;
            i15 |= M.o(i2) ? 32 : 16;
        } else {
            i16 = i29;
        }
        int i30 = i15;
        if (M.t(i13 & 1, ((i13 & 306783379) == 306783378 && (i30 & 19) == 18) ? false : true)) {
            vgc0 vgc0Var = null;
            String str8 = i21 != 0 ? null : str4;
            String str9 = i22 != 0 ? null : str5;
            SemanticsConfiguration semanticsConfiguration9 = i23 != 0 ? null : semanticsConfiguration;
            int i31 = i12;
            SemanticsConfiguration semanticsConfiguration10 = i24 != 0 ? null : semanticsConfiguration2;
            if (i25 != 0) {
                i19 = i14;
                semanticsConfiguration8 = null;
            } else {
                i19 = i14;
                semanticsConfiguration8 = semanticsConfiguration4;
            }
            gzs<s3q0> gzsVar4 = i31 != 0 ? null : gzsVar2;
            int i32 = i19 != 0 ? Integer.MAX_VALUE : i;
            int i33 = i16 != 0 ? 1 : i2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1108200490, i13, i30, "com.vk.feed.tool.compose.posting.step2cell.PostingStep2Cell (PostingStep2Cell.kt:35)");
            }
            if (lg90Var == null) {
                M.K(1013444867);
            } else {
                M.K(1013444868);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                vgc0Var = vgc0.a.a(lg90Var, ylu0Var.getIcon().l, M);
            }
            M.j();
            int i34 = i13 << 3;
            int i35 = i30 << 3;
            aVar2 = M;
            b(str, q630Var2, vgc0Var, str8, str9, semanticsConfiguration9, semanticsConfiguration10, semanticsConfiguration8, gzsVar, gzsVar4, i32, i33, false, aVar2, ((i13 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (57344 & i34) | (458752 & i34) | (3670016 & i34) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i13 >> 27) & 14) | (i35 & 112) | (i35 & 896), 8196);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            str6 = str8;
            str7 = str9;
            semanticsConfiguration5 = semanticsConfiguration9;
            semanticsConfiguration6 = semanticsConfiguration10;
            semanticsConfiguration7 = semanticsConfiguration8;
            gzsVar3 = gzsVar4;
            i18 = i32;
            i17 = i33;
        } else {
            aVar2 = M;
            aVar2.h();
            semanticsConfiguration5 = semanticsConfiguration;
            semanticsConfiguration6 = semanticsConfiguration2;
            gzsVar3 = gzsVar2;
            i17 = i2;
            semanticsConfiguration7 = semanticsConfiguration4;
            str6 = str4;
            str7 = str5;
            i18 = i;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.poc0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i3 | 1);
                    int I2 = ne7.I(i4);
                    qoc0.a(lg90.this, str, q630Var, str6, str7, semanticsConfiguration5, semanticsConfiguration6, semanticsConfiguration7, gzsVar, gzsVar3, i18, i17, (androidx.compose.runtime.a) obj, I, I2, i5);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final String str, final q630 q630Var, final Cell$Left cell$Left, String str2, String str3, SemanticsConfiguration semanticsConfiguration, SemanticsConfiguration semanticsConfiguration2, SemanticsConfiguration semanticsConfiguration3, final gzs gzsVar, gzs gzsVar2, int i, int i2, boolean z, androidx.compose.runtime.a aVar, final int i3, final int i4, final int i5) {
        int i6;
        q630 q630Var2;
        Cell$Left cell$Left2;
        int i7;
        String str4;
        int i8;
        SemanticsConfiguration semanticsConfiguration4;
        int i9;
        SemanticsConfiguration semanticsConfiguration5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        androidx.compose.runtime.a aVar2;
        final String str5;
        final gzs gzsVar3;
        final int i19;
        final boolean z2;
        final String str6;
        final SemanticsConfiguration semanticsConfiguration6;
        final SemanticsConfiguration semanticsConfiguration7;
        final SemanticsConfiguration semanticsConfiguration8;
        final int i20;
        androidx.compose.runtime.f s;
        String str7;
        int i21;
        androidx.compose.runtime.a M = aVar.M(-789617144);
        if ((i3 & 6) == 0) {
            i6 = (M.J(str) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        int i22 = i6 | 384;
        if ((i3 & 3072) == 0) {
            cell$Left2 = cell$Left;
            i22 |= M.J(cell$Left2) ? 2048 : 1024;
        } else {
            cell$Left2 = cell$Left;
        }
        int i23 = i5 & 16;
        if (i23 != 0) {
            i22 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i22 |= M.J(str2) ? 16384 : 8192;
            i7 = i5 & 32;
            if (i7 == 0) {
                i22 |= 196608;
                str4 = str3;
            } else {
                str4 = str3;
                if ((i3 & 196608) == 0) {
                    i22 |= M.J(str4) ? 131072 : 65536;
                }
            }
            i8 = i5 & 64;
            if (i8 == 0) {
                i22 |= 1572864;
                semanticsConfiguration4 = semanticsConfiguration;
            } else {
                semanticsConfiguration4 = semanticsConfiguration;
                if ((i3 & 1572864) == 0) {
                    i22 |= M.J(semanticsConfiguration4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
            }
            i9 = i5 & 128;
            if (i9 == 0) {
                i22 |= 12582912;
                semanticsConfiguration5 = semanticsConfiguration2;
            } else {
                semanticsConfiguration5 = semanticsConfiguration2;
                if ((i3 & 12582912) == 0) {
                    i22 |= M.J(semanticsConfiguration5) ? 8388608 : 4194304;
                }
            }
            i10 = i5 & 256;
            if (i10 == 0) {
                i22 |= 100663296;
            } else if ((i3 & 100663296) == 0) {
                i22 |= M.J(semanticsConfiguration3) ? 67108864 : 33554432;
            }
            if ((i3 & 805306368) == 0) {
                i22 |= M.y(gzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
            }
            i11 = i5 & 1024;
            if (i11 == 0) {
                i13 = i4 | 6;
                i12 = i11;
            } else if ((i4 & 6) == 0) {
                i12 = i11;
                i13 = i4 | (M.y(gzsVar2) ? 4 : 2);
            } else {
                i12 = i11;
                i13 = i4;
            }
            i14 = i5 & 2048;
            if (i14 == 0) {
                i13 |= 48;
                i15 = i14;
            } else if ((i4 & 48) == 0) {
                i15 = i14;
                i13 |= M.o(i) ? 32 : 16;
            } else {
                i15 = i14;
            }
            int i24 = i13;
            i16 = i5 & 4096;
            if (i16 == 0) {
                i17 = i24 | 384;
            } else {
                int i25 = i24;
                if ((i4 & 384) == 0) {
                    i25 |= M.o(i2) ? 256 : 128;
                }
                i17 = i25;
            }
            i18 = i5 & 8192;
            if (i18 == 0) {
                i17 |= 3072;
            } else if ((i4 & 3072) == 0) {
                i17 |= M.l(z) ? 2048 : 1024;
                if (M.t(i22 & 1, (i22 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
                    String str8 = i23 != 0 ? null : str2;
                    if (i7 != 0) {
                        i21 = 1;
                        str7 = null;
                    } else {
                        str7 = str4;
                        i21 = 1;
                    }
                    SemanticsConfiguration semanticsConfiguration9 = i8 != 0 ? null : semanticsConfiguration4;
                    SemanticsConfiguration semanticsConfiguration10 = i9 != 0 ? null : semanticsConfiguration5;
                    int i26 = i12;
                    SemanticsConfiguration semanticsConfiguration11 = i10 != 0 ? null : semanticsConfiguration3;
                    gzs gzsVar4 = i26 != 0 ? null : gzsVar2;
                    int i27 = i15 != 0 ? Integer.MAX_VALUE : i;
                    int i28 = i16 != 0 ? i21 : i2;
                    boolean z3 = i18 != 0 ? false : z;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-789617144, i22, i17, "com.vk.feed.tool.compose.posting.step2cell.PostingStep2VkCell (PostingStep2Cell.kt:71)");
                    }
                    aVar2 = M;
                    c(new us2(str), q630Var2, null, cell$Left2, str8, str7, semanticsConfiguration9, semanticsConfiguration10, semanticsConfiguration11, gzsVar, gzsVar4, i27, i28, z3, aVar2, i22 & 2147483632, i17 & 8190, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    str5 = str8;
                    str6 = str7;
                    semanticsConfiguration6 = semanticsConfiguration9;
                    semanticsConfiguration7 = semanticsConfiguration10;
                    semanticsConfiguration8 = semanticsConfiguration11;
                    gzsVar3 = gzsVar4;
                    i20 = i27;
                    i19 = i28;
                    z2 = z3;
                } else {
                    aVar2 = M;
                    aVar2.h();
                    str5 = str2;
                    gzsVar3 = gzsVar2;
                    i19 = i2;
                    z2 = z;
                    str6 = str4;
                    semanticsConfiguration6 = semanticsConfiguration4;
                    semanticsConfiguration7 = semanticsConfiguration5;
                    semanticsConfiguration8 = semanticsConfiguration3;
                    i20 = i;
                }
                s = aVar2.s();
                if (s != null) {
                    s.d = new wzs() { // from class: xsna.noc0
                        @Override // xsna.wzs
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int I = ne7.I(i3 | 1);
                            int I2 = ne7.I(i4);
                            qoc0.b(str, q630Var, cell$Left, str5, str6, semanticsConfiguration6, semanticsConfiguration7, semanticsConfiguration8, gzsVar, gzsVar3, i20, i19, z2, (androidx.compose.runtime.a) obj, I, I2, i5);
                            return s3q0.a;
                        }
                    };
                    return;
                }
                return;
            }
            if (M.t(i22 & 1, (i22 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
            }
            s = aVar2.s();
            if (s != null) {
            }
        }
        i7 = i5 & 32;
        if (i7 == 0) {
        }
        i8 = i5 & 64;
        if (i8 == 0) {
        }
        i9 = i5 & 128;
        if (i9 == 0) {
        }
        i10 = i5 & 256;
        if (i10 == 0) {
        }
        if ((i3 & 805306368) == 0) {
        }
        i11 = i5 & 1024;
        if (i11 == 0) {
        }
        i14 = i5 & 2048;
        if (i14 == 0) {
        }
        int i242 = i13;
        i16 = i5 & 4096;
        if (i16 == 0) {
        }
        i18 = i5 & 8192;
        if (i18 == 0) {
        }
        if (M.t(i22 & 1, (i22 & 306783379) == 306783378 || (i17 & 1171) != 1170)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final us2 us2Var, final q630 q630Var, final Cell$Middle.d.a aVar, final Cell$Left cell$Left, final String str, final String str2, SemanticsConfiguration semanticsConfiguration, final SemanticsConfiguration semanticsConfiguration2, SemanticsConfiguration semanticsConfiguration3, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, final int i, int i2, boolean z, androidx.compose.runtime.a aVar2, final int i3, final int i4, final int i5) {
        int i6;
        q630 q630Var2;
        Cell$Middle.d.a aVar3;
        Cell$Left cell$Left2;
        String str3;
        SemanticsConfiguration semanticsConfiguration4;
        SemanticsConfiguration semanticsConfiguration5;
        int i7;
        int i8;
        androidx.compose.runtime.a aVar4;
        final int i9;
        final SemanticsConfiguration semanticsConfiguration6;
        final SemanticsConfiguration semanticsConfiguration7;
        final boolean z2;
        androidx.compose.runtime.f s;
        androidx.compose.runtime.a M = aVar2.M(736488046);
        if ((i3 & 6) == 0) {
            i6 = (M.J(us2Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            q630Var2 = q630Var;
            i6 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if ((i3 & 384) == 0) {
            aVar3 = aVar;
            i6 |= M.J(aVar3) ? 256 : 128;
        } else {
            aVar3 = aVar;
        }
        if ((i3 & 3072) == 0) {
            cell$Left2 = cell$Left;
            i6 |= M.J(cell$Left2) ? 2048 : 1024;
        } else {
            cell$Left2 = cell$Left;
        }
        if ((i3 & 24576) == 0) {
            i6 |= M.J(str) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            str3 = str2;
            i6 |= M.J(str3) ? 131072 : 65536;
        } else {
            str3 = str2;
        }
        int i10 = i5 & 64;
        if (i10 != 0) {
            i6 |= 1572864;
            semanticsConfiguration4 = semanticsConfiguration;
        } else {
            semanticsConfiguration4 = semanticsConfiguration;
            if ((i3 & 1572864) == 0) {
                i6 |= M.J(semanticsConfiguration4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
            }
        }
        if ((i3 & 12582912) == 0) {
            i6 |= M.J(semanticsConfiguration2) ? 8388608 : 4194304;
        }
        int i11 = i5 & 256;
        if (i11 != 0) {
            i6 |= 100663296;
            semanticsConfiguration5 = semanticsConfiguration3;
        } else {
            semanticsConfiguration5 = semanticsConfiguration3;
            if ((i3 & 100663296) == 0) {
                i6 |= M.J(semanticsConfiguration5) ? 67108864 : 33554432;
            }
        }
        if ((i3 & 805306368) == 0) {
            i6 |= M.y(gzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        if ((i4 & 6) == 0) {
            i7 = i4 | (M.y(gzsVar2) ? 4 : 2);
        } else {
            i7 = i4;
        }
        if ((i4 & 48) == 0) {
            i7 |= M.o(i) ? 32 : 16;
        }
        int i12 = i7;
        int i13 = i5 & 4096;
        if (i13 != 0) {
            i8 = i12 | 384;
        } else {
            int i14 = i12;
            if ((i4 & 384) == 0) {
                i14 |= M.o(i2) ? 256 : 128;
            }
            i8 = i14;
        }
        int i15 = i5 & 8192;
        if (i15 != 0) {
            i8 |= 3072;
        } else if ((i4 & 3072) == 0) {
            i8 |= M.l(z) ? 2048 : 1024;
            if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i8 & 1171) != 1170)) {
                aVar4 = M;
                aVar4.h();
                i9 = i2;
                semanticsConfiguration6 = semanticsConfiguration4;
                semanticsConfiguration7 = semanticsConfiguration5;
                z2 = z;
            } else {
                us2 us2Var2 = null;
                SemanticsConfiguration semanticsConfiguration8 = i10 != 0 ? null : semanticsConfiguration4;
                SemanticsConfiguration semanticsConfiguration9 = i11 != 0 ? null : semanticsConfiguration5;
                int i16 = i13 != 0 ? 1 : i2;
                boolean z3 = i15 != 0 ? false : z;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(736488046, i6, i8, "com.vk.feed.tool.compose.posting.step2cell.PostingStep2VkCell (PostingStep2Cell.kt:107)");
                }
                if (str == null) {
                    M.K(2023309176);
                } else {
                    M.K(-904563287);
                    us2Var2 = ws2.b(str, M, (i6 >> 12) & 14);
                }
                M.j();
                aVar4 = M;
                d(us2Var, q630Var2, aVar3, cell$Left2, us2Var2, str3, semanticsConfiguration8, semanticsConfiguration2, semanticsConfiguration9, gzsVar, gzsVar2, i, i16, z3, aVar4, i6 & 2147426302, i8 & 8190, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                semanticsConfiguration6 = semanticsConfiguration8;
                semanticsConfiguration7 = semanticsConfiguration9;
                i9 = i16;
                z2 = z3;
            }
            s = aVar4.s();
            if (s == null) {
                s.d = new wzs() { // from class: xsna.ooc0
                    @Override // xsna.wzs
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int I = ne7.I(i3 | 1);
                        int I2 = ne7.I(i4);
                        qoc0.c(us2.this, q630Var, aVar, cell$Left, str, str2, semanticsConfiguration6, semanticsConfiguration2, semanticsConfiguration7, gzsVar, gzsVar2, i, i9, z2, (androidx.compose.runtime.a) obj, I, I2, i5);
                        return s3q0.a;
                    }
                };
                return;
            }
            return;
        }
        if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i8 & 1171) != 1170)) {
        }
        s = aVar4.s();
        if (s == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final us2 us2Var, final q630 q630Var, Cell$Middle.d.a aVar, Cell$Left cell$Left, final us2 us2Var2, String str, SemanticsConfiguration semanticsConfiguration, SemanticsConfiguration semanticsConfiguration2, SemanticsConfiguration semanticsConfiguration3, final gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, int i, int i2, final boolean z, androidx.compose.runtime.a aVar2, final int i3, final int i4, final int i5) {
        int i6;
        final Cell$Middle.d.a aVar3;
        int i7;
        int i8;
        String str2;
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
        final Cell$Left cell$Left2;
        final SemanticsConfiguration semanticsConfiguration4;
        final gzs<s3q0> gzsVar3;
        final int i21;
        final int i22;
        androidx.compose.runtime.a aVar4;
        final String str3;
        final SemanticsConfiguration semanticsConfiguration5;
        final SemanticsConfiguration semanticsConfiguration6;
        androidx.compose.runtime.f s;
        float f;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        SemanticsConfiguration semanticsConfiguration7;
        com.vk.core.compose.component.cell.content.h1 h1Var;
        String str4;
        SemanticsConfiguration semanticsConfiguration8;
        gzs<s3q0> gzsVar4;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar2.M(-602750976);
        if ((i3 & 6) == 0) {
            i6 = (M.J(us2Var) ? 4 : 2) | i3;
        } else {
            i6 = i3;
        }
        if ((i3 & 48) == 0) {
            i6 |= M.J(q630Var) ? 32 : 16;
        }
        int i29 = i5 & 4;
        if (i29 != 0) {
            i6 |= 384;
        } else if ((i3 & 384) == 0) {
            aVar3 = aVar;
            i6 |= M.J(aVar3) ? 256 : 128;
            i7 = i5 & 8;
            if (i7 == 0) {
                i6 |= 3072;
            } else if ((i3 & 3072) == 0) {
                i6 |= M.J(cell$Left) ? 2048 : 1024;
                if ((i3 & 24576) == 0) {
                    i6 |= M.J(us2Var2) ? 16384 : 8192;
                }
                i8 = i5 & 32;
                if (i8 != 0) {
                    i6 |= 196608;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i3 & 196608) == 0) {
                        i6 |= M.J(str2) ? 131072 : 65536;
                    }
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i6 |= 1572864;
                } else if ((i3 & 1572864) == 0) {
                    i6 |= M.J(semanticsConfiguration) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                }
                i10 = i5 & 128;
                if (i10 != 0) {
                    i6 |= 12582912;
                } else if ((i3 & 12582912) == 0) {
                    i11 = i10;
                    i6 |= M.J(semanticsConfiguration2) ? 8388608 : 4194304;
                    i12 = i5 & 256;
                    if (i12 == 0) {
                        i6 |= 100663296;
                    } else if ((i3 & 100663296) == 0) {
                        i13 = i12;
                        i6 |= M.J(semanticsConfiguration3) ? 67108864 : 33554432;
                        if ((i3 & 805306368) == 0) {
                            i6 |= M.y(gzsVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                        }
                        i14 = i5 & 1024;
                        if (i14 != 0) {
                            i15 = i4 | 6;
                        } else if ((i4 & 6) == 0) {
                            i15 = i4 | (M.y(gzsVar2) ? 4 : 2);
                        } else {
                            i15 = i4;
                        }
                        i16 = i5 & 2048;
                        if (i16 != 0) {
                            i15 |= 48;
                            i17 = i16;
                        } else if ((i4 & 48) == 0) {
                            i17 = i16;
                            i15 |= M.o(i) ? 32 : 16;
                        } else {
                            i17 = i16;
                        }
                        int i30 = i15;
                        i18 = i5 & 4096;
                        if (i18 != 0) {
                            i19 = i30 | 384;
                        } else if ((i4 & 384) == 0) {
                            i19 = i30 | (M.o(i2) ? 256 : 128);
                        } else {
                            i19 = i30;
                        }
                        if ((i4 & 3072) == 0) {
                            i19 |= M.l(z) ? 2048 : 1024;
                        }
                        i20 = i19;
                        if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                            com.vk.core.compose.component.cell.content.o oVar = null;
                            Cell$Middle.d.a aVar5 = i29 != 0 ? null : aVar3;
                            Cell$Left cell$Left3 = i7 != 0 ? null : cell$Left;
                            String str5 = i8 != 0 ? null : str2;
                            SemanticsConfiguration semanticsConfiguration9 = i9 != 0 ? null : semanticsConfiguration;
                            SemanticsConfiguration semanticsConfiguration10 = i11 != 0 ? null : semanticsConfiguration2;
                            SemanticsConfiguration semanticsConfiguration11 = i13 != 0 ? null : semanticsConfiguration3;
                            gzs<s3q0> gzsVar5 = i14 != 0 ? null : gzsVar2;
                            int i31 = i17 != 0 ? Integer.MAX_VALUE : i;
                            int i32 = i18 != 0 ? 1 : i2;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-602750976, i6, i20, "com.vk.feed.tool.compose.posting.step2cell.PostingStep2VkCell (PostingStep2Cell.kt:143)");
                            }
                            float f2 = us2Var2 != null ? 58 : 48;
                            int i33 = i6 >> 3;
                            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.d.b.b(us2Var, null, null, aVar5, 1, 2, semanticsConfiguration10, null, null, M, (i6 & 14) | 12804096 | ((i6 << 3) & 7168) | (i33 & 3670016), 6, 774);
                            Cell$Middle.d.a aVar6 = aVar5;
                            SemanticsConfiguration semanticsConfiguration12 = semanticsConfiguration10;
                            if (us2Var2 == null) {
                                M.K(705177693);
                                M.j();
                                i26 = i20;
                                f = f2;
                                i27 = i31;
                                i28 = i32;
                                i24 = i6;
                                semanticsConfiguration7 = semanticsConfiguration11;
                                i23 = i33;
                                h1Var = null;
                                i25 = 0;
                            } else {
                                M.K(705177694);
                                int i34 = i20 << 3;
                                f = f2;
                                i23 = i33;
                                i24 = i6;
                                i25 = 0;
                                i26 = i20;
                                com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.c.b.a(us2Var2, null, i31, i32, null, null, semanticsConfiguration11, null, M, (i34 & 7168) | (i34 & 896) | 805306368 | ((i6 >> 6) & 3670016), 434);
                                i27 = i31;
                                i28 = i32;
                                semanticsConfiguration7 = semanticsConfiguration11;
                                M.j();
                                h1Var = a;
                            }
                            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(b, h1Var, null, null, M, 196608, 28);
                            androidx.compose.runtime.a aVar7 = M;
                            if (gzsVar5 != null) {
                                aVar7.K(705541417);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1243383292, i25, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                                }
                                lg90 b2 = or.b(aVar7, 1833859693, R.drawable.vk_icon_cancel_24, aVar7, i25);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.f(1040687336, i25, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                }
                                ylu0 ylu0Var = (ylu0) aVar7.r(rrv0.a);
                                if (androidx.compose.runtime.b.d()) {
                                    androidx.compose.runtime.b.e();
                                }
                                String str6 = str5;
                                SemanticsConfiguration semanticsConfiguration13 = semanticsConfiguration9;
                                gzs<s3q0> gzsVar6 = gzsVar5;
                                oVar = com.vk.core.compose.component.cell.content.p.a(b2, ylu0Var.getIcon().l, 0L, str6, gzsVar6, semanticsConfiguration13, aVar7, ((i24 >> 6) & 7168) | 1572872 | ((i26 << 12) & 57344) | (458752 & i23), 4);
                                str4 = str6;
                                gzsVar4 = gzsVar6;
                                semanticsConfiguration8 = semanticsConfiguration13;
                                aVar7.j();
                            } else {
                                str4 = str5;
                                semanticsConfiguration8 = semanticsConfiguration9;
                                gzsVar4 = gzsVar5;
                                if (gzsVar != null) {
                                    aVar7.K(705941038);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, i25, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var2 = (ylu0) aVar7.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    oVar = o.b.a.a(null, null, ylu0Var2.getIcon().n, false, aVar7, 221184, 7);
                                    aVar7 = aVar7;
                                    aVar7.j();
                                } else {
                                    aVar7.K(706134973);
                                    aVar7.j();
                                }
                            }
                            if (gzsVar != null) {
                                aVar7.K(576970519);
                                int i35 = (i24 & 1879048192) != 536870912 ? i25 : 1;
                                Object x = aVar7.x();
                                if (i35 != 0 || x == a.C0011a.a) {
                                    x = new ef4(4, gzsVar);
                                    aVar7.R(x);
                                }
                                q630Var2 = ojc.c(q630Var, false, null, null, (gzs) x, 15);
                                aVar7.j();
                            } else {
                                aVar7.K(576971912);
                                aVar7.j();
                                q630Var2 = q630Var;
                            }
                            Cell$Left cell$Left4 = cell$Left3;
                            wiu0.b(txj0.j(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, o19.a(q630Var2, !z ? 1.0f : 0.64f)), false, cell$Left4, a2, oVar, null, null, aVar7, i23 & 896, 98);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            semanticsConfiguration6 = semanticsConfiguration7;
                            aVar4 = aVar7;
                            i21 = i27;
                            cell$Left2 = cell$Left4;
                            str3 = str4;
                            aVar3 = aVar6;
                            semanticsConfiguration5 = semanticsConfiguration12;
                            i22 = i28;
                            semanticsConfiguration4 = semanticsConfiguration8;
                            gzsVar3 = gzsVar4;
                        } else {
                            M.h();
                            cell$Left2 = cell$Left;
                            semanticsConfiguration4 = semanticsConfiguration;
                            gzsVar3 = gzsVar2;
                            i21 = i;
                            i22 = i2;
                            aVar4 = M;
                            str3 = str2;
                            semanticsConfiguration5 = semanticsConfiguration2;
                            semanticsConfiguration6 = semanticsConfiguration3;
                        }
                        s = aVar4.s();
                        if (s != null) {
                            s.d = new wzs() { // from class: xsna.moc0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int I = ne7.I(i3 | 1);
                                    int I2 = ne7.I(i4);
                                    qoc0.d(us2.this, q630Var, aVar3, cell$Left2, us2Var2, str3, semanticsConfiguration4, semanticsConfiguration5, semanticsConfiguration6, gzsVar, gzsVar3, i21, i22, z, (androidx.compose.runtime.a) obj, I, I2, i5);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                    i13 = i12;
                    if ((i3 & 805306368) == 0) {
                    }
                    i14 = i5 & 1024;
                    if (i14 != 0) {
                    }
                    i16 = i5 & 2048;
                    if (i16 != 0) {
                    }
                    int i302 = i15;
                    i18 = i5 & 4096;
                    if (i18 != 0) {
                    }
                    if ((i4 & 3072) == 0) {
                    }
                    i20 = i19;
                    if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                    }
                    s = aVar4.s();
                    if (s != null) {
                    }
                }
                i11 = i10;
                i12 = i5 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                if ((i3 & 805306368) == 0) {
                }
                i14 = i5 & 1024;
                if (i14 != 0) {
                }
                i16 = i5 & 2048;
                if (i16 != 0) {
                }
                int i3022 = i15;
                i18 = i5 & 4096;
                if (i18 != 0) {
                }
                if ((i4 & 3072) == 0) {
                }
                i20 = i19;
                if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
                }
                s = aVar4.s();
                if (s != null) {
                }
            }
            if ((i3 & 24576) == 0) {
            }
            i8 = i5 & 32;
            if (i8 != 0) {
            }
            i9 = i5 & 64;
            if (i9 != 0) {
            }
            i10 = i5 & 128;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i5 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            if ((i3 & 805306368) == 0) {
            }
            i14 = i5 & 1024;
            if (i14 != 0) {
            }
            i16 = i5 & 2048;
            if (i16 != 0) {
            }
            int i30222 = i15;
            i18 = i5 & 4096;
            if (i18 != 0) {
            }
            if ((i4 & 3072) == 0) {
            }
            i20 = i19;
            if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
            }
            s = aVar4.s();
            if (s != null) {
            }
        }
        aVar3 = aVar;
        i7 = i5 & 8;
        if (i7 == 0) {
        }
        if ((i3 & 24576) == 0) {
        }
        i8 = i5 & 32;
        if (i8 != 0) {
        }
        i9 = i5 & 64;
        if (i9 != 0) {
        }
        i10 = i5 & 128;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i5 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i3 & 805306368) == 0) {
        }
        i14 = i5 & 1024;
        if (i14 != 0) {
        }
        i16 = i5 & 2048;
        if (i16 != 0) {
        }
        int i302222 = i15;
        i18 = i5 & 4096;
        if (i18 != 0) {
        }
        if ((i4 & 3072) == 0) {
        }
        i20 = i19;
        if (M.t(i6 & 1, (i6 & 306783379) == 306783378 || (i20 & 1171) != 1170)) {
        }
        s = aVar4.s();
        if (s != null) {
        }
    }
}
