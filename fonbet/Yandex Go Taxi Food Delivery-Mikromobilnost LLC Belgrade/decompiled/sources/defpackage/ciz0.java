package defpackage;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.objects.TipsType;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class ciz0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.values().length];
        try {
            iArr[TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TipsType.values().length];
        try {
            iArr2[TipsType.FLAT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TipsType.PERCENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
