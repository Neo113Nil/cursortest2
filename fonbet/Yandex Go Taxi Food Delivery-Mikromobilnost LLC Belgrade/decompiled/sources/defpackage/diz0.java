package defpackage;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.objects.TipsType;

/* loaded from: classes14.dex */
public abstract class diz0 {
    public static final TaxiOrderSelectedTipsChoiceState a(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType, String str) {
        return new TaxiOrderSelectedTipsChoiceState(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.CUSTOM_CHOICE, taxiOrderTipsValueType, str);
    }

    public static final TaxiOrderSelectedTipsChoiceState b(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType, String str) {
        return new TaxiOrderSelectedTipsChoiceState(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.VALUE_CHOICE, taxiOrderTipsValueType, str);
    }

    public static final TaxiOrderSelectedTipsChoiceState c() {
        return new TaxiOrderSelectedTipsChoiceState(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.ZERO_CHOICE, TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT, "0");
    }

    public static final String d(TaxiOrderTipsState taxiOrderTipsState) {
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState;
        String str;
        return (!f(taxiOrderTipsState) || (taxiOrderSelectedTipsChoiceState = taxiOrderTipsState.d) == null || (str = taxiOrderSelectedTipsChoiceState.c) == null) ? taxiOrderTipsState.a : str;
    }

    public static final boolean e(TaxiOrderTipsState taxiOrderTipsState) {
        return taxiOrderTipsState.d != null;
    }

    public static final boolean f(TaxiOrderTipsState taxiOrderTipsState) {
        TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = taxiOrderTipsState.d;
        return taxiOrderSelectedTipsChoiceState != null && taxiOrderSelectedTipsChoiceState.a == TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.CUSTOM_CHOICE;
    }

    public static final TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType g(TipsType tipsType) {
        int i = ciz0.b[tipsType.ordinal()];
        if (i == 1) {
            return TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT;
        }
        if (i == 2) {
            return TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT;
        }
        w511.b();
        return null;
    }

    public static final TipsType h(TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType) {
        int i = ciz0.a[taxiOrderTipsValueType.ordinal()];
        if (i == 1) {
            return TipsType.FLAT;
        }
        if (i == 2) {
            return TipsType.PERCENT;
        }
        w511.b();
        return null;
    }
}
