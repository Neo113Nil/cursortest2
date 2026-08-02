package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoAdsType;
import com.vk.dto.common.VideoAdsType;

/* compiled from: VideoAdsTypeAdapter.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class p0s0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[VideoAdsType.values().length];
        try {
            iArr[VideoAdsType.VK_SHORT_VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VideoAdsType.MAIL_SHORT_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VideoAdsType.MAIL_PROMOTED_SHORT_VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VideoAdsType.MY_TARGET_VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[VideoAdsType.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[SdkVideoAdsType.values().length];
        try {
            iArr2[SdkVideoAdsType.VK_SHORT_VIDEO.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[SdkVideoAdsType.MAIL_SHORT_VIDEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SdkVideoAdsType.MAIL_SHORT_VIDEO_KNOWN_OWNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SdkVideoAdsType.MAIL_PROMOTED_SHORT_VIDEO.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SdkVideoAdsType.MY_TARGET_VIDEO.ordinal()] = 5;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[SdkVideoAdsType.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused12) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
