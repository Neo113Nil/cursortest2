package xsna;

import com.vk.editor.filters.correction.model.FilterType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoEffectsModificationView.kt */
/* loaded from: classes16.dex */
public final class ris0 {

    /* compiled from: VideoEffectsModificationView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterType.values().length];
            try {
                iArr[FilterType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterType.NATURAL_02.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterType.NATURAL_04.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterType.VINTAGE_NATURAL_06.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterType.NATURAL_05.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FilterType.VINTAGE_LMP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FilterType.LUT_02.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FilterType.LUT_01.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FilterType.LUT_03.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[FilterType.LUT_04.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[FilterType.LUT_05.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[FilterType.FREAKY_GF_01.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[FilterType.RGB_02.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[FilterType.RGB_03.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[FilterType.RGB_05.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[FilterType.RGB_01.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[FilterType.B_W_01.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[FilterType.VINTAGE_01.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[FilterType.VINTAGE_02.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final com.vk.media.filters.model.FilterType a(FilterType filterType) {
        switch (a.$EnumSwitchMapping$0[filterType.ordinal()]) {
            case 1:
                return com.vk.media.filters.model.FilterType.NONE;
            case 2:
                return com.vk.media.filters.model.FilterType.NATURAL_02;
            case 3:
                return com.vk.media.filters.model.FilterType.NATURAL_04;
            case 4:
                return com.vk.media.filters.model.FilterType.VINTAGE_NATURAL_06;
            case 5:
                return com.vk.media.filters.model.FilterType.NATURAL_05;
            case 6:
                return com.vk.media.filters.model.FilterType.VINTAGE_LMP;
            case 7:
                return com.vk.media.filters.model.FilterType.LUT_02;
            case 8:
                return com.vk.media.filters.model.FilterType.LUT_01;
            case 9:
                return com.vk.media.filters.model.FilterType.LUT_03;
            case 10:
                return com.vk.media.filters.model.FilterType.LUT_04;
            case 11:
                return com.vk.media.filters.model.FilterType.LUT_05;
            case 12:
                return com.vk.media.filters.model.FilterType.FREAKY_GF_01;
            case 13:
                return com.vk.media.filters.model.FilterType.RGB_02;
            case 14:
                return com.vk.media.filters.model.FilterType.RGB_03;
            case 15:
                return com.vk.media.filters.model.FilterType.RGB_05;
            case 16:
                return com.vk.media.filters.model.FilterType.RGB_01;
            case 17:
                return com.vk.media.filters.model.FilterType.B_W_01;
            case 18:
                return com.vk.media.filters.model.FilterType.VINTAGE_01;
            case 19:
                return com.vk.media.filters.model.FilterType.VINTAGE_02;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
