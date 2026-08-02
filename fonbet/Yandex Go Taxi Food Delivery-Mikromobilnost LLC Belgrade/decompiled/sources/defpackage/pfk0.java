package defpackage;

import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderSelectedTipsChoiceState;
import com.yandex.go.taxi.order.models.api.feedback.TaxiOrderTipsState;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$CustomTipsChoiceDto;
import java.util.List;

/* loaded from: classes14.dex */
public final class pfk0 {
    public final xdf a;
    public final rck0 b;

    public pfk0(xdf xdfVar, rck0 rck0Var) {
        this.a = xdfVar;
        this.b = rck0Var;
    }

    public final abk0 a(RideCardTipsChoiceDto$CustomTipsChoiceDto rideCardTipsChoiceDto$CustomTipsChoiceDto, String str) {
        String e;
        Float j;
        String e2;
        Float j2;
        String str2 = rideCardTipsChoiceDto$CustomTipsChoiceDto.d;
        xdf xdfVar = this.a;
        if (str2 == null) {
            e = null;
        } else {
            xdfVar.getClass();
            e = xdf.e(str2);
        }
        if (e != null && (j = avu0.j(e)) != null) {
            float floatValue = j.floatValue();
            String str3 = rideCardTipsChoiceDto$CustomTipsChoiceDto.e;
            if (str3 == null) {
                e2 = null;
            } else {
                xdfVar.getClass();
                e2 = xdf.e(str3);
            }
            if (e2 != null && (j2 = avu0.j(e2)) != null) {
                float floatValue2 = j2.floatValue();
                int i = rideCardTipsChoiceDto$CustomTipsChoiceDto.c;
                TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType taxiOrderTipsValueType = rideCardTipsChoiceDto$CustomTipsChoiceDto.a;
                if (taxiOrderTipsValueType == null) {
                    taxiOrderTipsValueType = TaxiOrderSelectedTipsChoiceState.TaxiOrderTipsValueType.FLAT;
                }
                return new abk0(i, floatValue, floatValue2, taxiOrderTipsValueType, str);
            }
        }
        return null;
    }

    public final bpk0 b(RideCardTipsChoiceDto$CustomTipsChoiceDto rideCardTipsChoiceDto$CustomTipsChoiceDto, TaxiOrderTipsState taxiOrderTipsState, fef fefVar, List list) {
        bpk0 bpk0Var;
        String d = diz0.d(taxiOrderTipsState);
        rck0 rck0Var = this.b;
        if (d != null) {
            String c = this.a.c(fefVar, d, false);
            boolean f = diz0.f(taxiOrderTipsState);
            rck0Var.getClass();
            mkz0 a = rck0.a(list, f);
            bpk0Var = null;
            abk0 a2 = a(rideCardTipsChoiceDto$CustomTipsChoiceDto, d);
            if (a2 != null) {
                return new bpk0(c, f, a2, c, d, a);
            }
        } else {
            bpk0Var = null;
            String str = rideCardTipsChoiceDto$CustomTipsChoiceDto.b;
            if (str != null) {
                boolean f2 = diz0.f(taxiOrderTipsState);
                rck0Var.getClass();
                mkz0 a3 = rck0.a(list, f2);
                abk0 a4 = a(rideCardTipsChoiceDto$CustomTipsChoiceDto, null);
                if (a4 != null) {
                    return new bpk0(str, f2, a4, str, null, a3);
                }
            }
        }
        return bpk0Var;
    }
}
