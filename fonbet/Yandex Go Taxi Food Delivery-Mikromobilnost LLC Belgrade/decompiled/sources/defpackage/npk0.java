package defpackage;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class npk0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.values().length];
        try {
            iArr[TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
