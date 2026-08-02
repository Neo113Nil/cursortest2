package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.base.js.bridge.VkUiView;
import com.vk.superapp.bridges.advertisement.AdRequestEvent;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: MappingExt.kt */
/* loaded from: classes6.dex */
public final class in00 {

    /* compiled from: MappingExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[BannerAdUiData.LayoutType.values().length];
            try {
                iArr[BannerAdUiData.LayoutType.RESIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BannerAdUiData.LayoutType.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BannerAdUiData.BannerLocation.values().length];
            try {
                iArr2[BannerAdUiData.BannerLocation.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BannerAdUiData.BannerLocation.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BannerAdUiData.HeightType.values().length];
            try {
                iArr3[BannerAdUiData.HeightType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[BannerAdUiData.HeightType.UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BannerAdUiData.HeightType.COMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BannerAdUiData.Orientation.values().length];
            try {
                iArr4[BannerAdUiData.Orientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[BannerAdUiData.Orientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[BannerAdUiData.Orientation.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[BannerAdUiData.BannerAlign.values().length];
            try {
                iArr5[BannerAdUiData.BannerAlign.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[BannerAdUiData.BannerAlign.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[BannerAdUiData.BannerAlign.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[BannerAdUiData.BannerAlign.UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[AdvertisementType.values().length];
            try {
                iArr6[AdvertisementType.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[AdvertisementType.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[AdvertisementType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public static final AdRequestEvent.AdFormat a(AdvertisementType advertisementType) {
        int i = a.$EnumSwitchMapping$5[advertisementType.ordinal()];
        if (i == 1) {
            return AdRequestEvent.AdFormat.REWARD;
        }
        if (i == 2) {
            return AdRequestEvent.AdFormat.MULTI_INTERSTITIAL;
        }
        if (i == 3) {
            return AdRequestEvent.AdFormat.INTERSTITIAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final VkUiView.BannerAd.UiData.BannerAlign b(BannerAdUiData.BannerAlign bannerAlign) {
        int i = a.$EnumSwitchMapping$4[bannerAlign.ordinal()];
        if (i == 1) {
            return VkUiView.BannerAd.UiData.BannerAlign.LEFT;
        }
        if (i == 2) {
            return VkUiView.BannerAd.UiData.BannerAlign.RIGHT;
        }
        if (i == 3) {
            return VkUiView.BannerAd.UiData.BannerAlign.CENTER;
        }
        if (i == 4) {
            return VkUiView.BannerAd.UiData.BannerAlign.UNSPECIFIED;
        }
        throw new NoWhenBranchMatchedException();
    }
}
