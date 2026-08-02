package xsna;

import com.vk.community.design.compose.onboarding.CommunityCreationOnboardingBlock;

/* compiled from: CommunityCreationCountOnboardingDefaults.kt */
/* loaded from: classes17.dex */
public final class kzg {

    /* compiled from: CommunityCreationCountOnboardingDefaults.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommunityCreationOnboardingBlock.Item.Count.CountState.values().length];
            try {
                iArr[CommunityCreationOnboardingBlock.Item.Count.CountState.Default.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommunityCreationOnboardingBlock.Item.Count.CountState.Done.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static long a(CommunityCreationOnboardingBlock.Item.Count.CountState countState, androidx.compose.runtime.a aVar) {
        long j;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(1794389062, 48, -1, "com.vk.community.design.compose.onboarding.count.CommunityCreationCountOnboardingDefaults.contentColor (CommunityCreationCountOnboardingDefaults.kt:32)");
        }
        int i = a.$EnumSwitchMapping$0[countState.ordinal()];
        if (i == 1) {
            aVar.K(2126008242);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var.getText().d;
            aVar.j();
        } else {
            if (i != 2) {
                throw alb0.c(2126005848, aVar);
            }
            aVar.K(2126010643);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) aVar.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            j = ylu0Var2.getText().p;
            aVar.j();
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return j;
    }
}
