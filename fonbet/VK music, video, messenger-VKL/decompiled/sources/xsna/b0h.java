package xsna;

import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;

/* compiled from: CommunityCreationOnboardingItemModel.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class b0h {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[GroupCreationOnboardingBlock.Step.values().length];
        try {
            iArr[GroupCreationOnboardingBlock.Step.DESIGN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GroupCreationOnboardingBlock.Step.SUBSCRIBERS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GroupCreationOnboardingBlock.Step.MARKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GroupCreationOnboardingBlock.Step.POSTING.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GroupCreationOnboardingBlock.Step.REGULAR_POSTING.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[GroupCreationOnboardingBlock.Option.Status.values().length];
        try {
            iArr2[GroupCreationOnboardingBlock.Option.Status.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[GroupCreationOnboardingBlock.Option.Status.DONE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[GroupCreationOnboardingBlock.Option.Status.NOT_COMPLETED.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[GroupCreationOnboardingBlock.Option.Status.DISABLED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
