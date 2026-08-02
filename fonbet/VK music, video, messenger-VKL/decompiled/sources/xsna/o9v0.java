package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.vk.core.tool.compose.onboarding.tooltip.Position$Horizontal;
import com.vk.core.tool.compose.onboarding.tooltip.Position$Vertical;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import io.requery.android.database.sqlite.SQLiteDatabase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.btv0;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkOnboardingTooltipWrapper.kt */
/* loaded from: classes17.dex */
public final class o9v0 {

    /* compiled from: VkOnboardingTooltipWrapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[VkTooltip$BalloonPosition.values().length];
            try {
                iArr[VkTooltip$BalloonPosition.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.TopLeft.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.BottomLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.TopRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[VkTooltip$BalloonPosition.BottomRight.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Position$Vertical.values().length];
            try {
                iArr2[Position$Vertical.Top.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Position$Vertical.Bottom.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Position$Horizontal.values().length];
            try {
                iArr3[Position$Horizontal.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Position$Horizontal.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Position$Horizontal.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0291  */
    @ozl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final String str, final etv0 etv0Var, q630 q630Var, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, VkOnboarding$TintColor vkOnboarding$TintColor, VkTooltip$BalloonPosition vkTooltip$BalloonPosition, VkTooltip$BalloonTilt vkTooltip$BalloonTilt, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, gzs gzsVar4, gzs gzsVar5, boolean z, VkOnboardingStat$Delegate vkOnboardingStat$Delegate, boolean z2, float f, boolean z3, boolean z4, final jai jaiVar, androidx.compose.runtime.a aVar, final int i, final int i2, final int i3) {
        int i4;
        q630 q630Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        gzs gzsVar6;
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
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        androidx.compose.runtime.a aVar2;
        final VkTooltip$MarkerStyle vkTooltip$MarkerStyle2;
        final VkOnboarding$TintColor vkOnboarding$TintColor2;
        final VkTooltip$BalloonPosition vkTooltip$BalloonPosition2;
        final gzs gzsVar7;
        final gzs gzsVar8;
        final gzs gzsVar9;
        final gzs gzsVar10;
        final boolean z5;
        final VkOnboardingStat$Delegate vkOnboardingStat$Delegate2;
        final boolean z6;
        final float f2;
        final boolean z7;
        final boolean z8;
        final gzs gzsVar11;
        final q630 q630Var3;
        final VkTooltip$MarkerSize vkTooltip$MarkerSize2;
        final VkTooltip$BalloonTilt vkTooltip$BalloonTilt2;
        androidx.compose.runtime.f s;
        VkTooltip$MarkerSize vkTooltip$MarkerSize3;
        androidx.compose.runtime.a M = aVar.M(84445924);
        if ((i & 6) == 0) {
            i4 = (M.J(str) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? M.J(etv0Var) : M.y(etv0Var) ? 32 : 16;
        }
        int i31 = i3 & 4;
        if (i31 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            q630Var2 = q630Var;
            i4 |= M.J(q630Var2) ? 256 : 128;
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                i4 |= M.o(vkTooltip$MarkerStyle == null ? -1 : vkTooltip$MarkerStyle.ordinal()) ? 2048 : 1024;
            }
            i6 = i3 & 16;
            if (i6 == 0) {
                i4 |= 24576;
            } else if ((i & 24576) == 0) {
                i4 |= M.o(vkTooltip$MarkerSize == null ? -1 : vkTooltip$MarkerSize.ordinal()) ? 16384 : 8192;
            }
            i7 = i3 & 32;
            if (i7 == 0) {
                i4 |= 196608;
            } else if ((i & 196608) == 0) {
                i4 |= M.o(vkOnboarding$TintColor == null ? -1 : vkOnboarding$TintColor.ordinal()) ? 131072 : 65536;
            }
            i8 = i3 & 64;
            if (i8 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= M.o(vkTooltip$BalloonPosition == null ? -1 : vkTooltip$BalloonPosition.ordinal()) ? 1048576 : 524288;
            }
            i9 = i3 & 128;
            if (i9 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= M.o(vkTooltip$BalloonTilt != null ? vkTooltip$BalloonTilt.ordinal() : -1) ? 8388608 : 4194304;
            }
            i10 = i3 & 256;
            if (i10 == 0) {
                i4 |= 100663296;
                gzsVar6 = gzsVar;
            } else {
                gzsVar6 = gzsVar;
                if ((i & 100663296) == 0) {
                    i4 |= M.y(gzsVar6) ? 67108864 : 33554432;
                }
            }
            i11 = i3 & 512;
            if (i11 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i12 = i11;
                i4 |= M.y(gzsVar2) ? 536870912 : 268435456;
                i13 = i3 & 1024;
                if (i13 != 0) {
                    i15 = i2 | 6;
                    i14 = i13;
                } else {
                    i14 = i13;
                    i15 = i2 | (M.y(gzsVar3) ? 4 : 2);
                }
                i16 = i3 & 2048;
                if (i16 != 0) {
                    i18 = i15 | 48;
                    i17 = i16;
                } else {
                    i17 = i16;
                    i18 = i15 | (M.y(gzsVar4) ? 32 : 16);
                }
                int i32 = i18;
                i19 = i3 & 4096;
                if (i19 != 0) {
                    i20 = i32 | 384;
                } else {
                    i20 = i32 | (M.y(gzsVar5) ? 256 : 128);
                }
                i21 = i3 & 8192;
                if (i21 != 0) {
                    i22 = i20 | 3072;
                } else {
                    int i33 = i20;
                    if ((i2 & 3072) == 0) {
                        i22 = i33 | (M.l(z) ? 2048 : 1024);
                    } else {
                        i22 = i33;
                    }
                }
                i23 = i3 & 16384;
                if (i23 != 0) {
                    i24 = i22 | 24576;
                } else {
                    i24 = i22;
                    if ((i2 & 24576) == 0) {
                        i24 |= M.J(vkOnboardingStat$Delegate) ? 16384 : 8192;
                        i25 = i3 & 32768;
                        if (i25 == 0) {
                            i24 |= 196608;
                        } else if ((i2 & 196608) == 0) {
                            i24 |= M.l(z2) ? 131072 : 65536;
                        }
                        i26 = i3 & 65536;
                        if (i26 == 0) {
                            i24 |= 1572864;
                        } else if ((i2 & 1572864) == 0) {
                            i24 |= M.n(f) ? 1048576 : 524288;
                        }
                        i27 = i3 & 131072;
                        if (i27 == 0) {
                            i28 = i24 | 12582912;
                        } else {
                            i28 = i24 | (M.l(z3) ? 8388608 : 4194304);
                        }
                        i29 = i3 & SQLiteDatabase.OPEN_PRIVATECACHE;
                        if (i29 == 0) {
                            i28 |= 100663296;
                        } else if ((i2 & 100663296) == 0) {
                            i28 |= M.l(z4) ? 67108864 : 33554432;
                        }
                        if ((i2 & 805306368) == 0) {
                            i28 |= M.y(jaiVar) ? 536870912 : 268435456;
                        }
                        i30 = i28;
                        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i30 & 306783379) != 306783378)) {
                            aVar2 = M;
                            aVar2.h();
                            vkTooltip$MarkerStyle2 = vkTooltip$MarkerStyle;
                            vkOnboarding$TintColor2 = vkOnboarding$TintColor;
                            vkTooltip$BalloonPosition2 = vkTooltip$BalloonPosition;
                            gzsVar7 = gzsVar2;
                            gzsVar8 = gzsVar3;
                            gzsVar9 = gzsVar4;
                            gzsVar10 = gzsVar5;
                            z5 = z;
                            vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate;
                            z6 = z2;
                            f2 = f;
                            z7 = z3;
                            z8 = z4;
                            gzsVar11 = gzsVar6;
                            q630Var3 = q630Var2;
                            vkTooltip$MarkerSize2 = vkTooltip$MarkerSize;
                            vkTooltip$BalloonTilt2 = vkTooltip$BalloonTilt;
                        } else {
                            if (i31 != 0) {
                                q630Var2 = q630.a.a;
                            }
                            VkTooltip$MarkerStyle vkTooltip$MarkerStyle3 = i5 != 0 ? VkTooltip$MarkerStyle.Style1 : vkTooltip$MarkerStyle;
                            VkTooltip$MarkerSize vkTooltip$MarkerSize4 = i6 != 0 ? VkTooltip$MarkerSize.Size48 : vkTooltip$MarkerSize;
                            VkOnboarding$TintColor vkOnboarding$TintColor3 = i7 != 0 ? VkOnboarding$TintColor.Lime : vkOnboarding$TintColor;
                            VkTooltip$BalloonPosition vkTooltip$BalloonPosition3 = i8 != 0 ? VkTooltip$BalloonPosition.TopRight : vkTooltip$BalloonPosition;
                            VkTooltip$BalloonTilt vkTooltip$BalloonTilt3 = i9 != 0 ? VkTooltip$BalloonTilt.Left : vkTooltip$BalloonTilt;
                            gzs gzsVar12 = i10 != 0 ? null : gzsVar6;
                            gzs gzsVar13 = i12 != 0 ? null : gzsVar2;
                            gzs gzsVar14 = i14 != 0 ? null : gzsVar3;
                            gzs gzsVar15 = i17 != 0 ? null : gzsVar4;
                            gzs gzsVar16 = i19 != 0 ? null : gzsVar5;
                            boolean z9 = i21 != 0 ? true : z;
                            VkOnboardingStat$Delegate vkOnboardingStat$Delegate3 = i23 != 0 ? null : vkOnboardingStat$Delegate;
                            boolean z10 = i25 != 0 ? false : z2;
                            float f3 = i26 != 0 ? atv0.b : f;
                            q630 q630Var4 = q630Var2;
                            boolean z11 = i27 != 0 ? true : z3;
                            boolean z12 = i29 != 0 ? true : z4;
                            VkTooltip$BalloonPosition vkTooltip$BalloonPosition4 = vkTooltip$BalloonPosition3;
                            if (androidx.compose.runtime.b.d()) {
                                vkTooltip$MarkerSize3 = vkTooltip$MarkerSize4;
                                androidx.compose.runtime.b.f(84445924, i4, i30, "com.vk.core.tool.compose.onboarding.tooltip.VkOnboardingTooltipWrapper (VkOnboardingTooltipWrapper.kt:250)");
                            } else {
                                vkTooltip$MarkerSize3 = vkTooltip$MarkerSize4;
                            }
                            boolean z13 = z9;
                            VkTooltip$MarkerSize vkTooltip$MarkerSize5 = vkTooltip$MarkerSize3;
                            aVar2 = M;
                            c(qri.a(q630Var4, a5x.a, new j9v0(vkTooltip$BalloonPosition4, vkTooltip$MarkerSize5, vkTooltip$MarkerStyle3, z10, etv0Var, false, z13, z11, z12, str, vkOnboarding$TintColor3, vkTooltip$BalloonTilt3, gzsVar12, gzsVar13, gzsVar14, gzsVar15, gzsVar16, vkOnboardingStat$Delegate3, f3)), jaiVar, aVar2, (i30 >> 24) & 112);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            boolean z14 = z10;
                            vkTooltip$MarkerStyle2 = vkTooltip$MarkerStyle3;
                            q630Var3 = q630Var4;
                            vkOnboarding$TintColor2 = vkOnboarding$TintColor3;
                            gzsVar8 = gzsVar14;
                            vkOnboardingStat$Delegate2 = vkOnboardingStat$Delegate3;
                            z7 = z11;
                            vkTooltip$BalloonTilt2 = vkTooltip$BalloonTilt3;
                            gzsVar9 = gzsVar15;
                            z6 = z14;
                            float f4 = f3;
                            z8 = z12;
                            gzsVar11 = gzsVar12;
                            gzsVar10 = gzsVar16;
                            f2 = f4;
                            vkTooltip$MarkerSize2 = vkTooltip$MarkerSize5;
                            gzsVar7 = gzsVar13;
                            z5 = z13;
                            vkTooltip$BalloonPosition2 = vkTooltip$BalloonPosition4;
                        }
                        s = aVar2.s();
                        if (s == null) {
                            s.d = new wzs() { // from class: xsna.h9v0
                                @Override // xsna.wzs
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int I = ne7.I(i | 1);
                                    int I2 = ne7.I(i2);
                                    o9v0.a(str, etv0Var, q630Var3, vkTooltip$MarkerStyle2, vkTooltip$MarkerSize2, vkOnboarding$TintColor2, vkTooltip$BalloonPosition2, vkTooltip$BalloonTilt2, gzsVar11, gzsVar7, gzsVar8, gzsVar9, gzsVar10, z5, vkOnboardingStat$Delegate2, z6, f2, z7, z8, jaiVar, (androidx.compose.runtime.a) obj, I, I2, i3);
                                    return s3q0.a;
                                }
                            };
                            return;
                        }
                        return;
                    }
                }
                i25 = i3 & 32768;
                if (i25 == 0) {
                }
                i26 = i3 & 65536;
                if (i26 == 0) {
                }
                i27 = i3 & 131072;
                if (i27 == 0) {
                }
                i29 = i3 & SQLiteDatabase.OPEN_PRIVATECACHE;
                if (i29 == 0) {
                }
                if ((i2 & 805306368) == 0) {
                }
                i30 = i28;
                if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i30 & 306783379) != 306783378)) {
                }
                s = aVar2.s();
                if (s == null) {
                }
            }
            i12 = i11;
            i13 = i3 & 1024;
            if (i13 != 0) {
            }
            i16 = i3 & 2048;
            if (i16 != 0) {
            }
            int i322 = i18;
            i19 = i3 & 4096;
            if (i19 != 0) {
            }
            i21 = i3 & 8192;
            if (i21 != 0) {
            }
            i23 = i3 & 16384;
            if (i23 != 0) {
            }
            i25 = i3 & 32768;
            if (i25 == 0) {
            }
            i26 = i3 & 65536;
            if (i26 == 0) {
            }
            i27 = i3 & 131072;
            if (i27 == 0) {
            }
            i29 = i3 & SQLiteDatabase.OPEN_PRIVATECACHE;
            if (i29 == 0) {
            }
            if ((i2 & 805306368) == 0) {
            }
            i30 = i28;
            if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i30 & 306783379) != 306783378)) {
            }
            s = aVar2.s();
            if (s == null) {
            }
        }
        q630Var2 = q630Var;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i11;
        i13 = i3 & 1024;
        if (i13 != 0) {
        }
        i16 = i3 & 2048;
        if (i16 != 0) {
        }
        int i3222 = i18;
        i19 = i3 & 4096;
        if (i19 != 0) {
        }
        i21 = i3 & 8192;
        if (i21 != 0) {
        }
        i23 = i3 & 16384;
        if (i23 != 0) {
        }
        i25 = i3 & 32768;
        if (i25 == 0) {
        }
        i26 = i3 & 65536;
        if (i26 == 0) {
        }
        i27 = i3 & 131072;
        if (i27 == 0) {
        }
        i29 = i3 & SQLiteDatabase.OPEN_PRIVATECACHE;
        if (i29 == 0) {
        }
        if ((i2 & 805306368) == 0) {
        }
        i30 = i28;
        if (M.t(i4 & 1, (i4 & 306783379) == 306783378 || (i30 & 306783379) != 306783378)) {
        }
        s = aVar2.s();
        if (s == null) {
        }
    }

    public static final void b(fxb0 fxb0Var, final etv0 etv0Var, final yvj yvjVar, final boolean z, final boolean z2, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        fxb0 fxb0Var2;
        androidx.compose.runtime.a M = aVar.M(-358025192);
        int i2 = (M.J(fxb0Var) ? 4 : 2) | i | (M.J(etv0Var) ? 32 : 16) | (M.y(yvjVar) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192) | 196608;
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-358025192, i2, -1, "com.vk.core.tool.compose.onboarding.tooltip.VkTooltipPopup (VkOnboardingTooltipWrapper.kt:293)");
            }
            boolean y = M.y(yvjVar) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new com.vk.movika.sdk.base.logic.processor.actions.e(27, etv0Var, yvjVar);
                M.R(x);
            }
            fxb0Var2 = fxb0Var;
            nb2.a(fxb0Var2, (gzs) x, new gxb0(z, z2, 19), kai.c(1518187706, new lk1(jaiVar, 13), M), M, (i2 & 14) | 3072, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            fxb0Var2 = fxb0Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final fxb0 fxb0Var3 = fxb0Var2;
            s.d = new wzs(etv0Var, yvjVar, z, z2, jaiVar, i) { // from class: xsna.m9v0
                public final /* synthetic */ etv0 c;
                public final /* synthetic */ yvj d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ jai g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1572865);
                    o9v0.b(fxb0.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(q630 q630Var, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1618899243);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1618899243, i2, -1, "com.vk.core.tool.compose.onboarding.tooltip.WrappedAnchor (VkOnboardingTooltipWrapper.kt:317)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (er.f((i2 >> 3) & 14, M, jaiVar)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tbo(q630Var, jaiVar, i);
        }
    }

    public static final Pair<Position$Horizontal, Position$Vertical> d(VkTooltip$BalloonPosition vkTooltip$BalloonPosition) {
        Position$Horizontal position$Horizontal;
        Position$Vertical position$Vertical;
        int[] iArr = a.$EnumSwitchMapping$0;
        switch (iArr[vkTooltip$BalloonPosition.ordinal()]) {
            case 1:
            case 2:
                position$Horizontal = Position$Horizontal.Center;
                break;
            case 3:
            case 4:
                position$Horizontal = Position$Horizontal.Left;
                break;
            case 5:
            case 6:
                position$Horizontal = Position$Horizontal.Right;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[vkTooltip$BalloonPosition.ordinal()]) {
            case 1:
            case 3:
            case 5:
                position$Vertical = Position$Vertical.Top;
                break;
            case 2:
            case 4:
            case 6:
                position$Vertical = Position$Vertical.Bottom;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new Pair<>(position$Horizontal, position$Vertical);
    }

    public static final wh50<ylu0> e(ylu0 ylu0Var) {
        ylu0 n;
        n = ylu0Var.n(ylu0Var.q(), ylu0Var.h(), ylu0Var.i(), cw5.a(ylu0Var.getBackground(), ylu0Var.getBackground().s), ylu0Var.o(), ylu0Var.r(), ylu0Var.getHeader(), ylu0Var.getIcon(), ylu0Var.getImage(), ylu0Var.e(), ylu0Var.j(), ylu0Var.f(), ylu0Var.k(), ylu0Var.a(), ylu0Var.p(), ylu0Var.c(), ylu0Var.m(), ylu0Var.g(), ylu0Var.getText(), ylu0Var.b(), ylu0Var.d(), ylu0Var.l(), ylu0Var.getWrite(), ylu0Var.s());
        return androidx.compose.runtime.k.b(n);
    }

    public static final btv0 f(zhf0 zhf0Var, VkTooltip$BalloonPosition vkTooltip$BalloonPosition, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, float f, izs<? super z4p0, s3q0> izsVar) {
        switch (a.$EnumSwitchMapping$0[vkTooltip$BalloonPosition.ordinal()]) {
            case 1:
                return new btv0.d(zhf0Var, f, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, izsVar);
            case 2:
                return new btv0.a(zhf0Var, f, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, izsVar);
            case 3:
                return new btv0.e(zhf0Var, f, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, izsVar);
            case 4:
                return new btv0.b(zhf0Var, f, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, izsVar);
            case 5:
                return new btv0.f(zhf0Var, f, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, izsVar);
            case 6:
                return new btv0.c(zhf0Var, f, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, izsVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static q630 g(String str, buv0 buv0Var, VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize, VkOnboarding$TintColor vkOnboarding$TintColor, VkTooltip$BalloonPosition vkTooltip$BalloonPosition, VkTooltip$BalloonTilt vkTooltip$BalloonTilt, gzs gzsVar, gzs gzsVar2, boolean z, int i) {
        return qri.a(q630.a.a, a5x.a, new j9v0(vkTooltip$BalloonPosition, vkTooltip$MarkerSize, vkTooltip$MarkerStyle, (i & 16384) == 0, buv0Var, true, (i & 4096) != 0, true, z, str, vkOnboarding$TintColor, (i & 64) != 0 ? VkTooltip$BalloonTilt.Left : vkTooltip$BalloonTilt, (i & 128) != 0 ? null : gzsVar, (i & 256) != 0 ? null : gzsVar2, null, null, null, null, atv0.b));
    }

    public static final Position$Horizontal h(c5p0 c5p0Var, l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
        int b = (int) (new btv0.d(c5p0Var.a, c5p0Var.b, c5p0Var.c, c5p0Var.d, new t810(28)).b(l9xVar, j, layoutDirection, j2) >> 32);
        int i = ((int) (j2 >> 32)) + b;
        if (b < 0 || i > ((int) (j >> 32))) {
            return null;
        }
        return Position$Horizontal.Center;
    }
}
