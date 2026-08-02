package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: VkButtonDefaults.kt */
/* loaded from: classes17.dex */
public abstract class op8 {

    /* compiled from: VkButtonDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonStyle.values().length];
            try {
                iArr[ButtonStyle.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonStyle.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonStyle.Tertiary.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonStyle.Outline.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ButtonStyle.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonAppearance.values().length];
            try {
                iArr2[ButtonAppearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonAppearance.Positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ButtonAppearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[ButtonAppearance.Neutral.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[ButtonAppearance.Overlay.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0217, code lost:
    
        if (r57.p(r13) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x018c, code lost:
    
        if (r57.p(r12) == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ab, code lost:
    
        if (r57.p(r14) == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cf, code lost:
    
        if (r57.p(r9) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f3, code lost:
    
        if (r57.p(r11) == false) goto L135;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mgu0 a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, androidx.compose.runtime.a aVar, int i, int i2, int i3) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        boolean z;
        long j19;
        boolean z2;
        long j20;
        boolean z3;
        long j21;
        boolean z4;
        long j22;
        boolean z5;
        boolean z6;
        Object x;
        if ((i3 & 1) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j11 = ylu0Var.getBackground().d;
        } else {
            j11 = j;
        }
        long c = (i3 & 2) != 0 ? l5g.c(14, j11, 0.64f) : j2;
        if ((i3 & 4) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j12 = ylu0Var2.getText().e;
        } else {
            j12 = j3;
        }
        long c2 = (i3 & 8) != 0 ? l5g.c(14, j12, 0.64f) : j4;
        if ((i3 & 16) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j13 = j11;
            j14 = ylu0Var3.getIcon().e;
        } else {
            j13 = j11;
            j14 = j5;
        }
        long c3 = (i3 & 32) != 0 ? l5g.c(14, j14, 0.64f) : j6;
        if ((i3 & 64) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j15 = j14;
            j16 = ylu0Var4.getIcon().b;
        } else {
            j15 = j14;
            j16 = j7;
        }
        long c4 = (i3 & 128) != 0 ? l5g.c(14, j16, 0.64f) : j8;
        if ((i3 & 256) != 0) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j17 = ylu0Var5.getBackground().j;
        } else {
            j17 = j9;
        }
        long c5 = (i3 & 512) != 0 ? l5g.c(14, j17, 0.64f) : j10;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1812659220, i, i2, "com.vk.core.compose.component.defaults.ButtonDefaults.buttonColors (VkButtonDefaults.kt:195)");
        }
        long j23 = c5;
        long j24 = j13;
        boolean z7 = ((((i & 896) ^ 384) > 256 && aVar.p(j12)) || (i & 384) == 256) | ((((i & 14) ^ 6) > 4 && aVar.p(j24)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && aVar.p(c)) || (i & 48) == 32);
        long j25 = c;
        if (((i & 7168) ^ 3072) > 2048) {
            j18 = c2;
        } else {
            j18 = c2;
        }
        if ((i & 3072) != 2048) {
            z = false;
            boolean z8 = z7 | z;
            if (((57344 & i) ^ 24576) <= 16384) {
                j19 = j15;
            } else {
                j19 = j15;
            }
            if ((i & 24576) != 16384) {
                z2 = false;
                boolean z9 = z2 | z8;
                long j26 = j16;
                if (((i & 458752) ^ 196608) > 131072) {
                    j20 = c3;
                } else {
                    j20 = c3;
                }
                if ((i & 196608) != 131072) {
                    z3 = false;
                    boolean z10 = z9 | z3;
                    long j27 = j18;
                    if (((i & 3670016) ^ 1572864) <= 1048576) {
                        j21 = j26;
                    } else {
                        j21 = j26;
                    }
                    if ((i & 1572864) != 1048576) {
                        z4 = false;
                        boolean z11 = z10 | z4;
                        long j28 = j19;
                        if (((i & 29360128) ^ 12582912) > 8388608) {
                            j22 = c4;
                        } else {
                            j22 = c4;
                        }
                        if ((i & 12582912) != 8388608) {
                            z5 = false;
                            z6 = z11 | z5 | ((((i & 234881024) ^ 100663296) <= 67108864 && aVar.p(j17)) || (i & 100663296) == 67108864) | ((((i & 1879048192) ^ 805306368) <= 536870912 && aVar.p(j23)) || (i & 805306368) == 536870912);
                            x = aVar.x();
                            if (!z6 || x == a.C0011a.a) {
                                long j29 = j22;
                                mgu0 mgu0Var = new mgu0(j24, j12, j25, j27, j28, j20, j21, j29, j17, j23);
                                aVar.R(mgu0Var);
                                x = mgu0Var;
                            }
                            mgu0 mgu0Var2 = (mgu0) x;
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            return mgu0Var2;
                        }
                        z5 = true;
                        z6 = z11 | z5 | ((((i & 234881024) ^ 100663296) <= 67108864 && aVar.p(j17)) || (i & 100663296) == 67108864) | ((((i & 1879048192) ^ 805306368) <= 536870912 && aVar.p(j23)) || (i & 805306368) == 536870912);
                        x = aVar.x();
                        if (!z6) {
                        }
                        long j292 = j22;
                        mgu0 mgu0Var3 = new mgu0(j24, j12, j25, j27, j28, j20, j21, j292, j17, j23);
                        aVar.R(mgu0Var3);
                        x = mgu0Var3;
                        mgu0 mgu0Var22 = (mgu0) x;
                        if (androidx.compose.runtime.b.d()) {
                        }
                        return mgu0Var22;
                    }
                    z4 = true;
                    boolean z112 = z10 | z4;
                    long j282 = j19;
                    if (((i & 29360128) ^ 12582912) > 8388608) {
                    }
                    if ((i & 12582912) != 8388608) {
                    }
                    z5 = true;
                    z6 = z112 | z5 | ((((i & 234881024) ^ 100663296) <= 67108864 && aVar.p(j17)) || (i & 100663296) == 67108864) | ((((i & 1879048192) ^ 805306368) <= 536870912 && aVar.p(j23)) || (i & 805306368) == 536870912);
                    x = aVar.x();
                    if (!z6) {
                    }
                    long j2922 = j22;
                    mgu0 mgu0Var32 = new mgu0(j24, j12, j25, j27, j282, j20, j21, j2922, j17, j23);
                    aVar.R(mgu0Var32);
                    x = mgu0Var32;
                    mgu0 mgu0Var222 = (mgu0) x;
                    if (androidx.compose.runtime.b.d()) {
                    }
                    return mgu0Var222;
                }
                z3 = true;
                boolean z102 = z9 | z3;
                long j272 = j18;
                if (((i & 3670016) ^ 1572864) <= 1048576) {
                }
                if ((i & 1572864) != 1048576) {
                }
                z4 = true;
                boolean z1122 = z102 | z4;
                long j2822 = j19;
                if (((i & 29360128) ^ 12582912) > 8388608) {
                }
                if ((i & 12582912) != 8388608) {
                }
                z5 = true;
                z6 = z1122 | z5 | ((((i & 234881024) ^ 100663296) <= 67108864 && aVar.p(j17)) || (i & 100663296) == 67108864) | ((((i & 1879048192) ^ 805306368) <= 536870912 && aVar.p(j23)) || (i & 805306368) == 536870912);
                x = aVar.x();
                if (!z6) {
                }
                long j29222 = j22;
                mgu0 mgu0Var322 = new mgu0(j24, j12, j25, j272, j2822, j20, j21, j29222, j17, j23);
                aVar.R(mgu0Var322);
                x = mgu0Var322;
                mgu0 mgu0Var2222 = (mgu0) x;
                if (androidx.compose.runtime.b.d()) {
                }
                return mgu0Var2222;
            }
            z2 = true;
            boolean z92 = z2 | z8;
            long j262 = j16;
            if (((i & 458752) ^ 196608) > 131072) {
            }
            if ((i & 196608) != 131072) {
            }
            z3 = true;
            boolean z1022 = z92 | z3;
            long j2722 = j18;
            if (((i & 3670016) ^ 1572864) <= 1048576) {
            }
            if ((i & 1572864) != 1048576) {
            }
            z4 = true;
            boolean z11222 = z1022 | z4;
            long j28222 = j19;
            if (((i & 29360128) ^ 12582912) > 8388608) {
            }
            if ((i & 12582912) != 8388608) {
            }
            z5 = true;
            z6 = z11222 | z5 | ((((i & 234881024) ^ 100663296) <= 67108864 && aVar.p(j17)) || (i & 100663296) == 67108864) | ((((i & 1879048192) ^ 805306368) <= 536870912 && aVar.p(j23)) || (i & 805306368) == 536870912);
            x = aVar.x();
            if (!z6) {
            }
            long j292222 = j22;
            mgu0 mgu0Var3222 = new mgu0(j24, j12, j25, j2722, j28222, j20, j21, j292222, j17, j23);
            aVar.R(mgu0Var3222);
            x = mgu0Var3222;
            mgu0 mgu0Var22222 = (mgu0) x;
            if (androidx.compose.runtime.b.d()) {
            }
            return mgu0Var22222;
        }
        z = true;
        boolean z82 = z7 | z;
        if (((57344 & i) ^ 24576) <= 16384) {
        }
        if ((i & 24576) != 16384) {
        }
        z2 = true;
        boolean z922 = z2 | z82;
        long j2622 = j16;
        if (((i & 458752) ^ 196608) > 131072) {
        }
        if ((i & 196608) != 131072) {
        }
        z3 = true;
        boolean z10222 = z922 | z3;
        long j27222 = j18;
        if (((i & 3670016) ^ 1572864) <= 1048576) {
        }
        if ((i & 1572864) != 1048576) {
        }
        z4 = true;
        boolean z112222 = z10222 | z4;
        long j282222 = j19;
        if (((i & 29360128) ^ 12582912) > 8388608) {
        }
        if ((i & 12582912) != 8388608) {
        }
        z5 = true;
        z6 = z112222 | z5 | ((((i & 234881024) ^ 100663296) <= 67108864 && aVar.p(j17)) || (i & 100663296) == 67108864) | ((((i & 1879048192) ^ 805306368) <= 536870912 && aVar.p(j23)) || (i & 805306368) == 536870912);
        x = aVar.x();
        if (!z6) {
        }
        long j2922222 = j22;
        mgu0 mgu0Var32222 = new mgu0(j24, j12, j25, j27222, j282222, j20, j21, j2922222, j17, j23);
        aVar.R(mgu0Var32222);
        x = mgu0Var32222;
        mgu0 mgu0Var222222 = (mgu0) x;
        if (androidx.compose.runtime.b.d()) {
        }
        return mgu0Var222222;
    }

    public static bcl f(ButtonStyle buttonStyle, androidx.compose.runtime.a aVar, int i) {
        bcl bclVar;
        float f = 0;
        float f2 = 0;
        float f3 = 0;
        float f4 = 0;
        float f5 = 0;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(320639230, i, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.elevation (VkButtonDefaults.kt:168)");
        }
        if (a.$EnumSwitchMapping$0[buttonStyle.ordinal()] == 1) {
            aVar.K(-1103330592);
            bclVar = pp8.a(f, f2, f3, f4, f5, aVar, (i >> 3) & 65534, 0);
            aVar.j();
        } else {
            aVar.K(156790655);
            aVar.j();
            bclVar = null;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return bclVar;
    }

    public static void h() {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(493962301, 0, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.innerItemSpacing (VkButtonDefaults.kt:47)");
        }
        float f = kqu0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
    }

    public static mgu0 j(long j, long j2, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1755782403, i, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.inverseNegativeButtonColors (VkButtonDefaults.kt:480)");
        }
        long j3 = wlb0.h(aVar).getIcon().h;
        long c = l5g.c(14, wlb0.h(aVar).getIcon().h, 0.64f);
        mgu0 a2 = a(j, j2, wlb0.h(aVar).getText().k, l5g.c(14, wlb0.h(aVar).getText().k, 0.64f), j3, c, wlb0.h(aVar).getText().d, l5g.c(14, wlb0.h(aVar).getText().d, 0.64f), wlb0.h(aVar).q().m, l5g.c(14, wlb0.h(aVar).q().m, 0.64f), aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (i >> 6) & 14, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }

    public static mgu0 m(long j, long j2, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1701064897, i, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.inversePositiveButtonColors (VkButtonDefaults.kt:463)");
        }
        long j3 = wlb0.h(aVar).getIcon().i;
        long c = l5g.c(14, wlb0.h(aVar).getIcon().i, 0.64f);
        mgu0 a2 = a(j, j2, wlb0.h(aVar).getText().l, l5g.c(14, wlb0.h(aVar).getText().l, 0.64f), j3, c, wlb0.h(aVar).getText().d, l5g.c(14, wlb0.h(aVar).getText().d, 0.64f), wlb0.h(aVar).q().e, l5g.c(14, wlb0.h(aVar).q().e, 0.64f), aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (i >> 6) & 14, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }

    public final lgu0 b(ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        mgu0 n;
        mgu0 mgu0Var;
        mgu0 o;
        androidx.compose.runtime.a aVar3;
        op8 op8Var;
        op8 op8Var2;
        mgu0 m;
        androidx.compose.runtime.a aVar4;
        androidx.compose.runtime.a aVar5;
        mgu0 m2;
        mgu0 m3;
        androidx.compose.runtime.a aVar6 = aVar;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1370366271, i, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.colors (VkButtonDefaults.kt:224)");
        }
        int i2 = a.$EnumSwitchMapping$0[buttonStyle.ordinal()];
        if (i2 == 1) {
            aVar6.K(917625005);
            int i3 = a.$EnumSwitchMapping$1[buttonAppearance.ordinal()];
            if (i3 == 1) {
                aVar2 = aVar6;
                aVar2.K(-1632965350);
                n = n((i >> 6) & 14, aVar2);
                aVar2.j();
            } else if (i3 == 2) {
                aVar6.K(-1632963012);
                int i4 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(276422731, i4, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.primaryPositiveButtonColors (VkButtonDefaults.kt:294)");
                }
                long j = wlb0.h(aVar6).getBackground().v;
                long c = l5g.c(14, wlb0.h(aVar6).getBackground().v, 0.64f);
                long j2 = wlb0.h(aVar6).getIcon().c;
                long c2 = l5g.c(14, wlb0.h(aVar6).getIcon().c, 0.64f);
                n = a(j, c, wlb0.h(aVar6).getText().d, l5g.c(14, wlb0.h(aVar6).getText().d, 0.64f), j2, c2, wlb0.h(aVar6).q().e, l5g.c(14, wlb0.h(aVar6).q().e, 0.64f), wlb0.h(aVar6).getBackground().j, l5g.c(14, wlb0.h(aVar6).getBackground().j, 0.64f), aVar, 0, i4, 0);
                aVar2 = aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
            } else if (i3 != 3) {
                if (i3 == 4) {
                    aVar6.K(-1632958245);
                    o = o((i >> 6) & 14, aVar6);
                    aVar6.j();
                } else {
                    if (i3 != 5) {
                        throw alb0.c(-1632967179, aVar6);
                    }
                    aVar6.K(-1632955909);
                    o = p((i >> 6) & 14, aVar6);
                    aVar6.j();
                }
                mgu0Var = o;
                aVar2 = aVar6;
                aVar2.j();
            } else {
                aVar6.K(-1632960612);
                int i5 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-721536113, i5, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.primaryNegativeButtonColors (VkButtonDefaults.kt:308)");
                }
                long j3 = wlb0.h(aVar6).getBackground().t;
                long c3 = l5g.c(14, wlb0.h(aVar6).getBackground().t, 0.64f);
                long j4 = wlb0.h(aVar6).getIcon().c;
                long c4 = l5g.c(14, wlb0.h(aVar6).getIcon().c, 0.64f);
                n = a(j3, c3, wlb0.h(aVar6).getText().d, l5g.c(14, wlb0.h(aVar6).getText().d, 0.64f), j4, c4, wlb0.h(aVar6).q().m, l5g.c(14, wlb0.h(aVar6).q().m, 0.64f), wlb0.h(aVar6).getBackground().j, l5g.c(14, wlb0.h(aVar6).getBackground().j, 0.64f), aVar, 0, i5, 0);
                aVar2 = aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar2.j();
            }
            mgu0Var = n;
            aVar2.j();
        } else if (i2 == 2) {
            aVar6.K(918066755);
            int i6 = a.$EnumSwitchMapping$1[buttonAppearance.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    op8Var2 = this;
                    aVar6.K(-1632948706);
                    int i7 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-508496231, i7, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.secondaryPositiveButtonColors (VkButtonDefaults.kt:324)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j5 = ylu0Var.getBackground().z;
                    m = m(j5, l5g.c(14, j5, l5g.e(j5) * 0.64f), aVar6, (i7 << 6) & 896);
                    aVar4 = aVar6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                } else if (i6 == 3) {
                    op8Var2 = this;
                    aVar6.K(-1632946242);
                    int i8 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1506455075, i8, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.secondaryNegativeButtonColors (VkButtonDefaults.kt:332)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j6 = ylu0Var2.getBackground().z;
                    m = j(j6, l5g.c(14, j6, l5g.e(j6) * 0.64f), aVar6, (i8 << 6) & 896);
                    aVar4 = aVar6;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                } else if (i6 == 4) {
                    aVar6.K(-1632943811);
                    int i9 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1457224279, i9, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.secondaryNeutralButtonColors (VkButtonDefaults.kt:348)");
                    }
                    long q = q(i9, aVar6);
                    aVar4 = aVar6;
                    mgu0Var = k(q, l5g.c(14, q, l5g.e(q) * 0.64f), aVar4, (i9 << 6) & 896);
                    op8Var2 = this;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar4.j();
                    aVar3 = aVar4;
                    op8Var = op8Var2;
                } else {
                    if (i6 != 5) {
                        throw alb0.c(-1632952929, aVar6);
                    }
                    aVar6.K(-1632941411);
                    int i10 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1440980846, i10, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.secondaryOverlayButtonColors (VkButtonDefaults.kt:356)");
                    }
                    long r = r(((i10 << 3) & 112) | 6, aVar6);
                    mgu0Var = l(r, l5g.c(14, r, l5g.e(r) * 0.64f), aVar6, (i10 << 6) & 896);
                    op8Var = this;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                    aVar3 = aVar6;
                }
                mgu0Var = m;
                aVar3 = aVar4;
                op8Var = op8Var2;
            } else {
                aVar6.K(-1632951108);
                int i11 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1880556824, i11, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.secondaryAccentButtonColors (VkButtonDefaults.kt:340)");
                }
                long q2 = q(i11, aVar6);
                mgu0Var = i(q2, l5g.c(14, q2, l5g.e(q2) * 0.64f), aVar6, (i11 << 6) & 896);
                aVar3 = aVar6;
                op8Var = this;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar3.j();
            }
            aVar3.j();
        } else if (i2 == 3) {
            aVar6.K(918516968);
            int i12 = a.$EnumSwitchMapping$1[buttonAppearance.ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    aVar6.K(-1632934211);
                    int i13 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1457298785, i13, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.tertiaryPositiveButtonColors (VkButtonDefaults.kt:366)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j7 = ylu0Var3.d().a;
                    m2 = m(j7, j7, aVar, (i13 << 6) & 896);
                    aVar6 = aVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        aVar6.K(-1632929380);
                        int i14 = (i >> 6) & 14;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1426617745, i14, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.tertiaryNeutralButtonColors (VkButtonDefaults.kt:384)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var4 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j8 = ylu0Var4.d().a;
                        mgu0Var = k(j8, j8, aVar6, (i14 << 6) & 896);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar6.j();
                    } else {
                        if (i12 != 5) {
                            throw alb0.c(-1632938406, aVar6);
                        }
                        aVar6.K(-1632927012);
                        int i15 = (i >> 6) & 14;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1410374312, i15, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.tertiaryOverlayButtonColors (VkButtonDefaults.kt:390)");
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var5 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j9 = ylu0Var5.d().a;
                        mgu0Var = l(j9, j9, aVar6, (i15 << 6) & 896);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar6.j();
                    }
                    aVar5 = aVar6;
                    op8Var = this;
                } else {
                    aVar6.K(-1632931779);
                    int i16 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1839709667, i16, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.tertiaryNegativeButtonColors (VkButtonDefaults.kt:372)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var6 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j10 = ylu0Var6.d().a;
                    m2 = j(j10, j10, aVar, (i16 << 6) & 896);
                    aVar6 = aVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                }
                mgu0Var = m2;
                aVar5 = aVar6;
                op8Var = this;
            } else {
                aVar6.K(-1632936581);
                int i17 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-218976146, i17, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.tertiaryAccentButtonColors (VkButtonDefaults.kt:378)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var7 = (ylu0) aVar6.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j11 = ylu0Var7.d().a;
                mgu0Var = i(j11, j11, aVar6, (i17 << 6) & 896);
                aVar5 = aVar6;
                op8Var = this;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar5.j();
            }
            aVar5.j();
        } else if (i2 == 4) {
            aVar6.K(918961229);
            int i18 = a.$EnumSwitchMapping$1[buttonAppearance.ordinal()];
            if (i18 != 1) {
                if (i18 == 2) {
                    aVar6.K(-1632919908);
                    int i19 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-113832437, i19, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.outlinePositiveButtonColors (VkButtonDefaults.kt:398)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var8 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j12 = ylu0Var8.d().a;
                    m3 = m(j12, j12, aVar, (i19 << 6) & 896);
                    aVar6 = aVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                } else if (i18 == 3) {
                    aVar6.K(-1632917508);
                    int i20 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1111791281, i20, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.outlineNegativeButtonColors (VkButtonDefaults.kt:404)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var9 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j13 = ylu0Var9.d().a;
                    m3 = j(j13, j13, aVar, (i20 << 6) & 896);
                    aVar6 = aVar;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                } else if (i18 == 4) {
                    aVar6.K(-1632915141);
                    int i21 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1331408037, i21, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.outlineNeutralButtonColors (VkButtonDefaults.kt:416)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var10 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j14 = ylu0Var10.d().a;
                    mgu0Var = k(j14, j14, aVar6, (i21 << 6) & 896);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                } else {
                    if (i18 != 5) {
                        throw alb0.c(-1632924075, aVar6);
                    }
                    aVar6.K(-1632912805);
                    int i22 = (i >> 6) & 14;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1315164604, i22, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.outlineOverlayButtonColors (VkButtonDefaults.kt:422)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var11 = (ylu0) aVar6.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j15 = ylu0Var11.d().a;
                    mgu0Var = l(j15, j15, aVar6, (i22 << 6) & 896);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar6.j();
                }
                mgu0Var = m3;
            } else {
                aVar6.K(-1632922246);
                int i23 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(747783898, i23, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.outlineAccentButtonColors (VkButtonDefaults.kt:410)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var12 = (ylu0) aVar6.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j16 = ylu0Var12.d().a;
                mgu0Var = i(j16, j16, aVar6, (i23 << 6) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
            }
            aVar6.j();
        } else {
            if (i2 != 5) {
                throw alb0.c(-1632967133, aVar6);
            }
            aVar6.K(919397244);
            int i24 = a.$EnumSwitchMapping$1[buttonAppearance.ordinal()];
            if (i24 == 1) {
                aVar6.K(-1632908169);
                int i25 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-624850746, i25, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.linkAccentButtonColors (VkButtonDefaults.kt:442)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var13 = (ylu0) aVar6.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j17 = ylu0Var13.d().a;
                mgu0Var = i(j17, j17, aVar6, (i25 << 6) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
            } else if (i24 == 2) {
                aVar6.K(-1632905927);
                int i26 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-660765449, i26, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.linkPositiveButtonColors (VkButtonDefaults.kt:430)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var14 = (ylu0) aVar6.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j18 = ylu0Var14.d().a;
                mgu0Var = m(j18, j18, aVar, (i26 << 6) & 896);
                aVar6 = aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
            } else if (i24 == 3) {
                aVar6.K(-1632903623);
                int i27 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1658724293, i27, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.linkNegativeButtonColors (VkButtonDefaults.kt:436)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var15 = (ylu0) aVar6.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j19 = ylu0Var15.d().a;
                mgu0Var = j(j19, j19, aVar, (i27 << 6) & 896);
                aVar6 = aVar;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
            } else if (i24 == 4) {
                aVar6.K(-1632901352);
                int i28 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1729407033, i28, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.linkNeutralButtonColors (VkButtonDefaults.kt:448)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var16 = (ylu0) aVar6.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j20 = ylu0Var16.d().a;
                mgu0Var = k(j20, j20, aVar6, (i28 << 6) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
            } else {
                if (i24 != 5) {
                    throw alb0.c(-1632910010, aVar6);
                }
                aVar6.K(-1632899112);
                int i29 = (i >> 6) & 14;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1713163600, i29, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.linkOverlayButtonColors (VkButtonDefaults.kt:454)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var17 = (ylu0) aVar6.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                long j21 = ylu0Var17.d().a;
                mgu0Var = l(j21, j21, aVar6, (i29 << 6) & 896);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
            }
            aVar6.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return mgu0Var;
    }

    public final mtk0<s890> c(ButtonSize buttonSize, ButtonStyle buttonStyle, boolean z, androidx.compose.runtime.a aVar, int i, int i2) {
        wh50 d;
        if ((i2 & 4) != 0) {
            z = false;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(602433709, i, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.contentPaddings (VkButtonDefaults.kt:134)");
        }
        if (z) {
            aVar.K(-1565511723);
            d = g(buttonSize, buttonStyle, aVar, (i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i >> 3) & 896));
            aVar.j();
        } else {
            aVar.K(-1565442314);
            d = d(buttonSize, buttonStyle, aVar, (i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i >> 3) & 896));
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return d;
    }

    public abstract wh50 d(ButtonSize buttonSize, ButtonStyle buttonStyle, androidx.compose.runtime.a aVar, int i);

    public abstract s890 e(int i, androidx.compose.runtime.a aVar);

    public abstract wh50 g(ButtonSize buttonSize, ButtonStyle buttonStyle, androidx.compose.runtime.a aVar, int i);

    public abstract mgu0 i(long j, long j2, androidx.compose.runtime.a aVar, int i);

    public abstract mgu0 k(long j, long j2, androidx.compose.runtime.a aVar, int i);

    public abstract mgu0 l(long j, long j2, androidx.compose.runtime.a aVar, int i);

    public abstract mgu0 n(int i, androidx.compose.runtime.a aVar);

    public abstract mgu0 o(int i, androidx.compose.runtime.a aVar);

    public abstract mgu0 p(int i, androidx.compose.runtime.a aVar);

    public abstract long q(int i, androidx.compose.runtime.a aVar);

    public abstract long r(int i, androidx.compose.runtime.a aVar);

    public final s890 s(ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2128198135, i, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.textCompensationPadding (VkButtonDefaults.kt:126)");
        }
        s890 e = e(i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return e;
    }
}
