package xsna;

import com.vk.external.miniapp.net.ad.AdvertisementType;
import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.advertisement.api.dto.BannerSlotType;
import com.vk.superapp.advertisement.api.dto.FullscreenAdFormat;
import kotlin.NoWhenBranchMatchedException;
import xsna.gi0;

/* compiled from: MappingExt.kt */
/* loaded from: classes6.dex */
public final class jn00 {

    /* compiled from: MappingExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[AdvertisementType.values().length];
            try {
                iArr[AdvertisementType.REWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdvertisementType.MULTI_INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdvertisementType.INTERSTITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BannerAdUiData.LayoutType.values().length];
            try {
                iArr2[BannerAdUiData.LayoutType.RESIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BannerAdUiData.LayoutType.OVERLAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[BannerAdUiData.BannerLocation.values().length];
            try {
                iArr3[BannerAdUiData.BannerLocation.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[BannerAdUiData.BannerLocation.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[BannerAdUiData.HeightType.values().length];
            try {
                iArr4[BannerAdUiData.HeightType.REGULAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[BannerAdUiData.HeightType.COMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[BannerAdUiData.HeightType.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[BannerAdUiData.Orientation.values().length];
            try {
                iArr5[BannerAdUiData.Orientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[BannerAdUiData.Orientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[BannerAdUiData.Orientation.UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[BannerAdUiData.BannerAlign.values().length];
            try {
                iArr6[BannerAdUiData.BannerAlign.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr6[BannerAdUiData.BannerAlign.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[BannerAdUiData.BannerAlign.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[BannerAdUiData.BannerAlign.UNSPECIFIED.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    public static final di0 a(gi0.a aVar) {
        FullscreenAdFormat fullscreenAdFormat;
        int i = aVar.a;
        int i2 = a.$EnumSwitchMapping$0[aVar.c.ordinal()];
        if (i2 == 1) {
            fullscreenAdFormat = FullscreenAdFormat.REWARD;
        } else if (i2 == 2) {
            fullscreenAdFormat = FullscreenAdFormat.MULTI_INTERSTITIAL;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            fullscreenAdFormat = FullscreenAdFormat.INTERSTITIAL;
        }
        return new di0(i, fullscreenAdFormat, aVar.b);
    }

    public static gel0 b(hel0 hel0Var) {
        return new gel0(hel0Var.a, BannerSlotType.AD, hel0Var.b, hel0Var.c);
    }
}
