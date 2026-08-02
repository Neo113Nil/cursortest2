package xsna;

import com.vk.media.filters.model.FilterType;

/* compiled from: FilterAssetsPathSupplierCommonImpl.kt */
/* loaded from: classes12.dex */
public final class gcr {

    /* compiled from: FilterAssetsPathSupplierCommonImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FilterType.values().length];
            try {
                iArr[FilterType.VINTAGE_02.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FilterType.LUT_01.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FilterType.LUT_02.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FilterType.LUT_03.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FilterType.LUT_04.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FilterType.LUT_05.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String a(FilterType filterType) {
        switch (a.$EnumSwitchMapping$0[filterType.ordinal()]) {
            case 1:
                return "filters/vintage_2.jpg";
            case 2:
                return "filters/lookup_1.png";
            case 3:
                return "filters/lookup_2.png";
            case 4:
                return "filters/lookup_3.png";
            case 5:
                return "filters/lookup_4.png";
            case 6:
                return "filters/lookup_5.png";
            default:
                throw new IllegalArgumentException("No assets for filterType: " + filterType);
        }
    }
}
