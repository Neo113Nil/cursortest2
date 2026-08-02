package defpackage;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$ValueTipsChoiceDto;
import java.util.List;

/* loaded from: classes14.dex */
public final class opk0 {
    public final xdf a;
    public final zuj0 b;
    public final rck0 c;

    public opk0(xdf xdfVar, zuj0 zuj0Var, rck0 rck0Var) {
        this.a = xdfVar;
        this.b = zuj0Var;
        this.c = rck0Var;
    }

    public final bpk0 a(RideCardTipsChoiceDto$ValueTipsChoiceDto rideCardTipsChoiceDto$ValueTipsChoiceDto, TaxiOrderTipsState taxiOrderTipsState, fef fefVar, List list) {
        String e;
        Float j;
        String e2;
        TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType = rideCardTipsChoiceDto$ValueTipsChoiceDto.a;
        String str = rideCardTipsChoiceDto$ValueTipsChoiceDto.b;
        if (taxiOrderTipsValueType != null) {
            int i = npk0.a[taxiOrderTipsValueType.ordinal()];
            rck0 rck0Var = this.c;
            xdf xdfVar = this.a;
            if (i == 1) {
                if (str == null) {
                    e = null;
                } else {
                    xdfVar.getClass();
                    e = xdf.e(str);
                }
                if (e != null && (j = avu0.j(e)) != null) {
                    String i2 = ((avj0) this.b).i(kyh0.tip_percent_format, Integer.valueOf(m810.b(j.floatValue())));
                    TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType2 = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.PERCENT;
                    TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState = taxiOrderTipsState.d;
                    boolean z = taxiOrderSelectedTipsChoiceState != null && taxiOrderSelectedTipsChoiceState.a == TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.VALUE_CHOICE && taxiOrderSelectedTipsChoiceState.b == taxiOrderTipsValueType2 && jl40.l(taxiOrderSelectedTipsChoiceState.c, e);
                    rck0Var.getClass();
                    return new bpk0(i2, z, new cbk0(taxiOrderTipsValueType2, e), i2, e, rck0.a(list, z));
                }
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                if (str == null) {
                    e2 = null;
                } else {
                    xdfVar.getClass();
                    e2 = xdf.e(str);
                }
                if (e2 != null) {
                    String c = xdfVar.c(fefVar, e2, false);
                    TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType3 = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT;
                    TaxiOrderSelectedTipsChoiceState taxiOrderSelectedTipsChoiceState2 = taxiOrderTipsState.d;
                    boolean z2 = taxiOrderSelectedTipsChoiceState2 != null && taxiOrderSelectedTipsChoiceState2.a == TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsChoiceType.VALUE_CHOICE && taxiOrderSelectedTipsChoiceState2.b == taxiOrderTipsValueType3 && jl40.l(taxiOrderSelectedTipsChoiceState2.c, e2);
                    rck0Var.getClass();
                    return new bpk0(c, z2, new cbk0(taxiOrderTipsValueType3, e2), c, e2, rck0.a(list, z2));
                }
            }
        }
        return null;
    }
}
