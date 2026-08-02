package defpackage;

import com.yandex.go.taxi.order.detailed_price.data.api.response.DetailedPriceItem$DetailedPrice;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class b3j {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.DividerType.values().length];
        try {
            iArr[DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.DividerType.LINE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DetailedPriceItem$DetailedPrice.DetailedPriceContent.DetailedPriceItem.DividerType.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
