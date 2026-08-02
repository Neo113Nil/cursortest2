package xsna;

import com.vk.clips.sdk.models.ads.SdkAdsFlags;
import com.vk.dto.common.clips.ClipsAdsFeaturesParams;

/* compiled from: SdkClipsAdsFeaturesParamsAdapter.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class vih0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ClipsAdsFeaturesParams.AdsFlags.values().length];
        try {
            iArr[ClipsAdsFeaturesParams.AdsFlags.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClipsAdsFeaturesParams.AdsFlags.HIDE_FULLSCREEN_AD_BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClipsAdsFeaturesParams.AdsFlags.HIDE_CLOSING_AD_BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[SdkAdsFlags.values().length];
        try {
            iArr2[SdkAdsFlags.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SdkAdsFlags.HIDE_FULLSCREEN_AD_BANNER.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SdkAdsFlags.HIDE_CLOSING_AD_BANNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
