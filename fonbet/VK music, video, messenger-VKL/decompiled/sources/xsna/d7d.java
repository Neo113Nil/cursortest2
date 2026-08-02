package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFileModeration;
import com.vk.dto.common.clips.ClipLinkModerationStatus;

/* compiled from: ClipLinkModerationStatusAdapter.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class d7d {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ClipLinkModerationStatus.values().length];
        try {
            iArr[ClipLinkModerationStatus.UNDEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClipLinkModerationStatus.NOT_MODERATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClipLinkModerationStatus.PENDING_MODERATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClipLinkModerationStatus.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ClipLinkModerationStatus.APPROVED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[SdkVideoFileModeration.values().length];
        try {
            iArr2[SdkVideoFileModeration.UNDEFINED.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SdkVideoFileModeration.NOT_MODERATED.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SdkVideoFileModeration.PENDING_MODERATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SdkVideoFileModeration.REJECTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SdkVideoFileModeration.APPROVED.ordinal()] = 5;
        } catch (NoSuchFieldError unused10) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
