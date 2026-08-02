package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.NoWhenBranchMatchedException;
import xsna.op8;

/* compiled from: MilkshakeButtonDefaults.kt */
/* loaded from: classes17.dex */
public final class bn20 extends op8 {
    public static final bn20 a = new bn20();

    /* compiled from: MilkshakeButtonDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ButtonSize.values().length];
            try {
                iArr[ButtonSize.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonSize.Large.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonStyle.values().length];
            try {
                iArr2[ButtonStyle.Link.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonStyle.Outline.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ButtonAppearance.values().length];
            try {
                iArr3[ButtonAppearance.Accent.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[ButtonAppearance.Positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[ButtonAppearance.Negative.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[ButtonAppearance.Neutral.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ButtonAppearance.Overlay.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // xsna.op8
    public final wh50 d(ButtonSize buttonSize, ButtonStyle buttonStyle, androidx.compose.runtime.a aVar, int i) {
        u890 u890Var;
        u890 m;
        aVar.K(-1918592960);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1918592960, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.defaultContentPaddings (MilkshakeButtonDefaults.kt:67)");
        }
        int i2 = i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1558114148, i2, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.regularContentPadding (MilkshakeButtonDefaults.kt:78)");
        }
        boolean z = ((((i & 112) ^ 48) > 32 && aVar.o(buttonStyle.ordinal())) || (i & 48) == 32) | ((((i & 14) ^ 6) > 4 && aVar.o(buttonSize.ordinal())) || (i & 6) == 4);
        Object x = aVar.x();
        if (z || x == a.C0011a.a) {
            int i3 = a.$EnumSwitchMapping$0[buttonSize.ordinal()];
            bn20 bn20Var = a;
            if (i3 == 1) {
                bn20Var.getClass();
                if (a.$EnumSwitchMapping$1[buttonStyle.ordinal()] == 1) {
                    m = s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, 1);
                    x = m;
                    aVar.R(x);
                } else {
                    float f = kqu0.s;
                    float f2 = kqu0.v;
                    u890Var = new u890(f2, f, f2, f);
                    m = u890Var;
                    x = m;
                    aVar.R(x);
                }
            } else if (i3 == 2) {
                bn20Var.getClass();
                if (a.$EnumSwitchMapping$1[buttonStyle.ordinal()] == 1) {
                    m = s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.s, 1);
                    x = m;
                    aVar.R(x);
                } else {
                    float f3 = kqu0.s;
                    float f4 = kqu0.v;
                    u890Var = new u890(f4, f3, f4, f3);
                    m = u890Var;
                    x = m;
                    aVar.R(x);
                }
            } else {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                bn20Var.getClass();
                if (a.$EnumSwitchMapping$1[buttonStyle.ordinal()] == 1) {
                    m = s200.m(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.u, 1);
                    x = m;
                    aVar.R(x);
                } else {
                    float f5 = kqu0.u;
                    float f6 = kqu0.w;
                    u890Var = new u890(f6, f5, f6, f5);
                    m = u890Var;
                    x = m;
                    aVar.R(x);
                }
            }
        }
        s890 s890Var = (s890) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        wh50 c = androidx.compose.runtime.k.c(s890Var, aVar, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return c;
    }

    @Override // xsna.op8
    public final s890 e(int i, androidx.compose.runtime.a aVar) {
        aVar.K(2038987584);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2038987584, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.defaultTextCompensationPadding (MilkshakeButtonDefaults.kt:47)");
        }
        Object x = aVar.x();
        if (x == a.C0011a.a) {
            x = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 0.5d, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (float) 1.5d, 5);
            aVar.R(x);
        }
        s890 s890Var = (s890) x;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return s890Var;
    }

    @Override // xsna.op8
    public final wh50 g(ButtonSize buttonSize, ButtonStyle buttonStyle, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1835777056);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1835777056, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.iconOnlyContentPaddings (MilkshakeButtonDefaults.kt:263)");
        }
        wh50 d = d(buttonSize, buttonStyle, aVar, i & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return d;
    }

    @Override // xsna.op8
    public final mgu0 i(long j, long j2, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-1319297106);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1319297106, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.inverseAccentButtonColors (MilkshakeButtonDefaults.kt:166)");
        }
        long j3 = wlb0.h(aVar).getIcon().b;
        long c = l5g.c(14, wlb0.h(aVar).getIcon().b, 0.64f);
        mgu0 a2 = op8.a(j, j2, wlb0.h(aVar).getText().c, l5g.c(14, wlb0.h(aVar).getText().c, 0.64f), j3, c, wlb0.h(aVar).getText().e, l5g.c(14, wlb0.h(aVar).getText().e, 0.64f), wlb0.h(aVar).getBackground().d, l5g.c(14, wlb0.h(aVar).getBackground().d, 0.64f), aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (i >> 6) & 14, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    @Override // xsna.op8
    public final mgu0 k(long j, long j2, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-144903001);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-144903001, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.inverseNeutralButtonColors (MilkshakeButtonDefaults.kt:186)");
        }
        long j3 = wlb0.h(aVar).getIcon().j;
        long c = l5g.c(14, wlb0.h(aVar).getIcon().j, 0.64f);
        mgu0 a2 = op8.a(j, j2, wlb0.h(aVar).getText().m, l5g.c(14, wlb0.h(aVar).getText().m, 0.64f), j3, c, wlb0.h(aVar).getText().d, l5g.c(14, wlb0.h(aVar).getText().d, 0.64f), wlb0.h(aVar).getIcon().l, l5g.c(14, wlb0.h(aVar).getIcon().l, 0.64f), aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (i >> 6) & 14, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    @Override // xsna.op8
    public final mgu0 l(long j, long j2, androidx.compose.runtime.a aVar, int i) {
        aVar.K(-328990224);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-328990224, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.inverseOverlayButtonColors (MilkshakeButtonDefaults.kt:204)");
        }
        long j3 = wlb0.h(aVar).getIcon().c;
        long c = l5g.c(14, wlb0.h(aVar).getIcon().c, 0.64f);
        mgu0 a2 = op8.a(j, j2, wlb0.h(aVar).getText().d, l5g.c(14, wlb0.h(aVar).getText().d, 0.64f), j3, c, wlb0.h(aVar).getText().o, l5g.c(14, wlb0.h(aVar).getText().o, 0.64f), wlb0.h(aVar).getBackground().j, l5g.c(14, wlb0.h(aVar).getBackground().j, 0.64f), aVar, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, (i >> 6) & 14, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    @Override // xsna.op8
    public final mgu0 n(int i, androidx.compose.runtime.a aVar) {
        aVar.K(634321590);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(634321590, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.primaryAccentButtonColors (MilkshakeButtonDefaults.kt:118)");
        }
        long j = wlb0.h(aVar).getBackground().d;
        long c = l5g.c(14, wlb0.h(aVar).getBackground().d, 0.64f);
        long j2 = wlb0.h(aVar).getIcon().e;
        long c2 = l5g.c(14, wlb0.h(aVar).getIcon().e, 0.64f);
        mgu0 a2 = op8.a(j, c, wlb0.h(aVar).getText().e, l5g.c(14, wlb0.h(aVar).getText().e, 0.64f), j2, c2, wlb0.h(aVar).getText().c, l5g.c(14, wlb0.h(aVar).getText().c, 0.64f), wlb0.h(aVar).getBackground().g, l5g.c(14, wlb0.h(aVar).getBackground().g, 0.64f), aVar, 0, i & 14, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    @Override // xsna.op8
    public final mgu0 o(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-1254192063);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1254192063, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.primaryNeutralButtonColors (MilkshakeButtonDefaults.kt:133)");
        }
        long j = wlb0.h(aVar).getBackground().i;
        long c = l5g.c(14, wlb0.h(aVar).getBackground().i, 0.64f);
        long j2 = wlb0.h(aVar).getIcon().e;
        long c2 = l5g.c(14, wlb0.h(aVar).getIcon().e, 0.64f);
        mgu0 a2 = op8.a(j, c, wlb0.h(aVar).getText().e, l5g.c(14, wlb0.h(aVar).getText().e, 0.64f), j2, c2, wlb0.h(aVar).getText().m, l5g.c(14, wlb0.h(aVar).getText().m, 0.64f), wlb0.h(aVar).getBackground().g, l5g.c(14, wlb0.h(aVar).getBackground().g, 0.64f), aVar, 0, i & 14, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    @Override // xsna.op8
    public final mgu0 p(int i, androidx.compose.runtime.a aVar) {
        aVar.K(1476063896);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1476063896, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.primaryOverlayButtonColors (MilkshakeButtonDefaults.kt:148)");
        }
        long j = wlb0.h(aVar).getBackground().j;
        long c = l5g.c(14, wlb0.h(aVar).getBackground().j, 0.64f);
        long j2 = wlb0.h(aVar).getIcon().k;
        long c2 = l5g.c(14, wlb0.h(aVar).getIcon().k, 0.64f);
        mgu0 a2 = op8.a(j, c, wlb0.h(aVar).getText().o, l5g.c(14, wlb0.h(aVar).getText().o, 0.64f), j2, c2, wlb0.h(aVar).getText().d, l5g.c(14, wlb0.h(aVar).getText().d, 0.64f), wlb0.h(aVar).getBackground().l, l5g.c(14, wlb0.h(aVar).getBackground().l, 0.64f), aVar, 0, i & 14, 0);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return a2;
    }

    @Override // xsna.op8
    public final long q(int i, androidx.compose.runtime.a aVar) {
        aVar.K(445700123);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(445700123, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.secondaryBackgroundColor (MilkshakeButtonDefaults.kt:219)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.getBackground().z;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    @Override // xsna.op8
    public final long r(int i, androidx.compose.runtime.a aVar) {
        aVar.K(110290057);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(110290057, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.secondaryOverlayBackgroundColor (MilkshakeButtonDefaults.kt:223)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long j = ylu0Var.j().a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return j;
    }

    public final y18 t(ButtonStyle buttonStyle, ButtonAppearance buttonAppearance, boolean z, androidx.compose.runtime.a aVar, int i) {
        l5g l5gVar;
        long j;
        aVar.K(-1923309650);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1923309650, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.border (MilkshakeButtonDefaults.kt:235)");
        }
        y18 y18Var = null;
        boolean z2 = true;
        if (a.$EnumSwitchMapping$1[buttonStyle.ordinal()] == 2) {
            aVar.K(1841183418);
            int i2 = a.$EnumSwitchMapping$2[buttonAppearance.ordinal()];
            if (i2 == 1) {
                aVar.K(-1464624512);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var.m().b;
                aVar.j();
            } else if (i2 == 2) {
                aVar.K(-1464621636);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var2.m().f;
                aVar.j();
            } else if (i2 == 3) {
                aVar.K(-1464618884);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var3 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var3.m().e;
                aVar.j();
            } else if (i2 == 4) {
                aVar.K(-1464616194);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var4 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var4.r().b;
                aVar.j();
            } else {
                if (i2 != 5) {
                    throw alb0.c(-1464627096, aVar);
                }
                aVar.K(-1464613412);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var5 = (ylu0) aVar.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                j = ylu0Var5.m().c;
                aVar.j();
            }
            l5gVar = com.vk.movika.sdk.android.defaultplayer.interactive.c.c(j, aVar);
        } else {
            aVar.K(1841691631);
            aVar.j();
            l5gVar = null;
        }
        float f = 1;
        int i3 = i << 3;
        int i4 = (i3 & 57344) | (i3 & 896) | 6 | (i3 & 7168);
        aVar.K(1020825103);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1020825103, i4, -1, "com.vk.core.compose.component.defaults.ButtonDefaults.defaultBorderStroke (VkButtonDefaults.kt:272)");
        }
        if (l5gVar != null) {
            long j2 = l5gVar.a;
            long c = op8.a.$EnumSwitchMapping$1[buttonAppearance.ordinal()] == 4 ? l5g.c(14, j2, l5g.e(j2) * 0.64f) : l5g.c(14, j2, 0.64f);
            boolean J = aVar.J(l5gVar) | aVar.p(c);
            if ((((i4 & 7168) ^ 3072) <= 2048 || !aVar.l(z)) && (i4 & 3072) != 2048) {
                z2 = false;
            }
            boolean z3 = J | z2;
            Object x = aVar.x();
            if (z3 || x == a.C0011a.a) {
                if (!z) {
                    j2 = c;
                }
                x = aqw.a(f, j2);
                aVar.R(x);
            }
            y18Var = (y18) x;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        } else {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return y18Var;
    }

    public final CounterSize u(ButtonSize buttonSize) {
        int i = a.$EnumSwitchMapping$0[buttonSize.ordinal()];
        if (i == 1) {
            return CounterSize.Small;
        }
        if (i == 2) {
            return CounterSize.Medium;
        }
        if (i == 3) {
            return CounterSize.Medium;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final float v(ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        int i2;
        aVar.K(2102849964);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(2102849964, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.iconSize (MilkshakeButtonDefaults.kt:38)");
        }
        int i3 = a.$EnumSwitchMapping$0[buttonSize.ordinal()];
        if (i3 == 1) {
            i2 = 16;
        } else {
            if (i3 != 2 && i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 24;
        }
        float f = i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public final float w(ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        int i2;
        aVar.K(-1532208279);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-1532208279, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.minHeight (MilkshakeButtonDefaults.kt:29)");
        }
        int i3 = a.$EnumSwitchMapping$0[buttonSize.ordinal()];
        if (i3 == 1) {
            i2 = 30;
        } else if (i3 == 2) {
            i2 = 36;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 44;
        }
        float f = i2;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return f;
    }

    public final r5j0 x(int i, androidx.compose.runtime.a aVar) {
        aVar.K(-918947890);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-918947890, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.shape (MilkshakeButtonDefaults.kt:51)");
        }
        uog0 uog0Var = wpu0.a;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return uog0Var;
    }

    public final frv0 y(ButtonSize buttonSize, androidx.compose.runtime.a aVar, int i) {
        frv0 frv0Var;
        aVar.K(1383318211);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1383318211, i, -1, "com.vk.core.compose.component.defaults.milkshake.MilkshakeButtonDefaults.textStyle (MilkshakeButtonDefaults.kt:56)");
        }
        int i2 = a.$EnumSwitchMapping$0[buttonSize.ordinal()];
        if (i2 == 1) {
            aVar.K(-2071055568);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var.h0;
            aVar.j();
        } else if (i2 == 2) {
            aVar.K(-2071053454);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var2 = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var2.P;
            aVar.j();
        } else {
            if (i2 != 3) {
                throw alb0.c(-2071057624, aVar);
            }
            aVar.K(-2071051310);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var3 = (wuv0) aVar.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0Var = wuv0Var3.M;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        aVar.j();
        return frv0Var;
    }
}
