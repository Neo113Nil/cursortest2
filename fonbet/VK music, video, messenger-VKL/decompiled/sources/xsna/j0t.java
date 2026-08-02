package xsna;

import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* compiled from: functions.kt */
/* loaded from: classes17.dex */
public final class j0t {

    /* compiled from: functions.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VkOnboarding$TintColor.values().length];
            try {
                iArr[VkOnboarding$TintColor.Lime.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkOnboarding$TintColor.Cyan.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VkOnboarding$TintColor.Azure.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VkOnboarding$TintColor.Pink.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VkTooltip$MarkerStyle.values().length];
            try {
                iArr2[VkTooltip$MarkerStyle.Style6.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final long a(VkOnboarding$TintColor vkOnboarding$TintColor, androidx.compose.runtime.a aVar, int i) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1457608977, i, -1, "com.vk.core.tool.onboarding.getColorResourceByTint (functions.kt:10)");
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
        }
        ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        long a2 = s7g.a(b(vkOnboarding$TintColor, ylu0Var.s()), aVar);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a2;
    }

    public static final int b(VkOnboarding$TintColor vkOnboarding$TintColor, boolean z) {
        if (z) {
            int i = a.$EnumSwitchMapping$0[vkOnboarding$TintColor.ordinal()];
            if (i == 1) {
                return R.color.onboarding_component_colorAccentLime_light;
            }
            if (i == 2) {
                return R.color.onboarding_component_colorAccentCyan_light;
            }
            if (i == 3) {
                return R.color.onboarding_component_colorAccentAzure_light;
            }
            if (i == 4) {
                return R.color.onboarding_component_colorAccentPink_light;
            }
            throw new NoWhenBranchMatchedException();
        }
        int i2 = a.$EnumSwitchMapping$0[vkOnboarding$TintColor.ordinal()];
        if (i2 == 1) {
            return R.color.onboarding_component_colorAccentLime_dark;
        }
        if (i2 == 2) {
            return R.color.onboarding_component_colorAccentCyan_dark;
        }
        if (i2 == 3) {
            return R.color.onboarding_component_colorAccentAzure_dark;
        }
        if (i2 == 4) {
            return R.color.onboarding_component_colorAccentPink_dark;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Pair<pco, pco> c(VkTooltip$MarkerStyle vkTooltip$MarkerStyle, VkTooltip$MarkerSize vkTooltip$MarkerSize) {
        return a.$EnumSwitchMapping$1[vkTooltip$MarkerStyle.ordinal()] == 1 ? new Pair<>(new pco(vkTooltip$MarkerSize.h() * 1.75f), new pco(vkTooltip$MarkerSize.h())) : new Pair<>(new pco(vkTooltip$MarkerSize.h()), new pco(vkTooltip$MarkerSize.h()));
    }
}
