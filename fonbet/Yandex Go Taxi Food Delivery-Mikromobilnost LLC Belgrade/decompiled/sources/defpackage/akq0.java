package defpackage;

import android.os.Parcelable;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedYBMethod;
import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.YBCardType;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class akq0 implements whq0 {
    @Override // defpackage.whq0
    public final boolean matches(SelectedPaymentMethodPayload selectedPaymentMethodPayload) {
        String methodType = selectedPaymentMethodPayload.getMethodType();
        return jl40.l(methodType != null ? methodType.toLowerCase(Locale.ROOT) : null, "yb_card");
    }

    @Override // defpackage.whq0
    public final Parcelable toParcelable(SelectedPaymentMethodPayload selectedPaymentMethodPayload) {
        YBCardType yBCardType;
        if (!matches(selectedPaymentMethodPayload)) {
            return null;
        }
        zjq0 zjq0Var = (zjq0) selectedPaymentMethodPayload.decoded(zjq0.Companion.serializer());
        Boolean bool = zjq0Var.c;
        String str = zjq0Var.a;
        String str2 = zjq0Var.b;
        if (str2 != null) {
            yBCardType = new YBCardType(str2);
        } else {
            YBCardType.Companion.getClass();
            yBCardType = YBCardType.unknown;
        }
        return new SelectedYBMethod(bool, str, yBCardType);
    }
}
