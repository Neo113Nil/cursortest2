package xsna;

import com.vk.clips.sdk.shared.api.utils.ClipFeedTooltip$ClipFeedTooltipType;

/* compiled from: ClipsPrefOnboardingActionsHandler.kt */
/* loaded from: classes17.dex */
public final class iwe implements bd80 {
    public final jwe a;

    /* compiled from: ClipsPrefOnboardingActionsHandler.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipFeedTooltip$ClipFeedTooltipType.values().length];
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.SCROLL_ONBOARDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.DOUBLE_TAP_ONBOARDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.FAST_FORWARD_ONBOARDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipFeedTooltip$ClipFeedTooltipType.AUTHOR_SWIPE_ONBOARDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public iwe(jwe jweVar) {
        this.a = jweVar;
    }

    @Override // xsna.bd80
    public final void a(ClipFeedTooltip$ClipFeedTooltipType clipFeedTooltip$ClipFeedTooltipType) {
        int i = a.$EnumSwitchMapping$0[clipFeedTooltip$ClipFeedTooltipType.ordinal()];
        jwe jweVar = this.a;
        if (i == 1) {
            jweVar.f().i();
            return;
        }
        if (i == 2) {
            jweVar.f().g();
        } else if (i == 3) {
            jweVar.f().e();
        } else {
            if (i != 4) {
                return;
            }
            jweVar.f().h();
        }
    }
}
