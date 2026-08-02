package defpackage;

import com.yandex.go.chargers.tariff_item_info.api.data.model.ChargersTariffDetailItemDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class jya {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersTariffDetailItemDto.Type.values().length];
        try {
            iArr[ChargersTariffDetailItemDto.Type.TARIFF_DETAIL_WITH_TOP_DIVIDER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersTariffDetailItemDto.Type.TARIFF_DETAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
