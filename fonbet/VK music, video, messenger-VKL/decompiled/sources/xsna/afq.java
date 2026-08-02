package xsna;

import com.vk.clips.external.nps.api.condition.ExternalNpsCondition;
import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ExternalNpsConditionAdapter.kt */
/* loaded from: classes17.dex */
public final class afq {

    /* compiled from: ExternalNpsConditionAdapter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ExternalNpsCondition.values().length];
            try {
                iArr[ExternalNpsCondition.CLIP_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExternalNpsCondition.CLIP_LIKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExternalNpsCondition.CLIP_SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ExternalNpsCondition.CLIP_COMMENTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ExternalNpsCondition.CLIP_DOWNLOADED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ExternalNpsCondition.CLIP_CREATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ExternalNpsCondition.CLIP_CREATE_AUDIO_ATTACHMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SdkExternalNpsCondition.values().length];
            try {
                iArr2[SdkExternalNpsCondition.CLIP_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[SdkExternalNpsCondition.CLIP_LIKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[SdkExternalNpsCondition.CLIP_SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[SdkExternalNpsCondition.CLIP_COMMENTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[SdkExternalNpsCondition.CLIP_DOWNLOADED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[SdkExternalNpsCondition.CLIP_CREATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[SdkExternalNpsCondition.CLIP_CREATE_AUDIO_ATTACHMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ExternalNpsCondition a(SdkExternalNpsCondition sdkExternalNpsCondition) {
        switch (a.$EnumSwitchMapping$1[sdkExternalNpsCondition.ordinal()]) {
            case 1:
                return ExternalNpsCondition.CLIP_STARTED;
            case 2:
                return ExternalNpsCondition.CLIP_LIKED;
            case 3:
                return ExternalNpsCondition.CLIP_SHARED;
            case 4:
                return ExternalNpsCondition.CLIP_COMMENTED;
            case 5:
                return ExternalNpsCondition.CLIP_DOWNLOADED;
            case 6:
                return ExternalNpsCondition.CLIP_CREATE;
            case 7:
                return ExternalNpsCondition.CLIP_CREATE_AUDIO_ATTACHMENT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final SdkExternalNpsCondition b(ExternalNpsCondition externalNpsCondition) {
        switch (a.$EnumSwitchMapping$0[externalNpsCondition.ordinal()]) {
            case 1:
                return SdkExternalNpsCondition.CLIP_STARTED;
            case 2:
                return SdkExternalNpsCondition.CLIP_LIKED;
            case 3:
                return SdkExternalNpsCondition.CLIP_SHARED;
            case 4:
                return SdkExternalNpsCondition.CLIP_COMMENTED;
            case 5:
                return SdkExternalNpsCondition.CLIP_DOWNLOADED;
            case 6:
                return SdkExternalNpsCondition.CLIP_CREATE;
            case 7:
                return SdkExternalNpsCondition.CLIP_CREATE_AUDIO_ATTACHMENT;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
