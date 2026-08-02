package defpackage;

import com.yandex.go.payments.data.model.response.PaymentMethods;

/* loaded from: classes8.dex */
public final class l9z {
    public final fga0 a;

    public l9z(fga0 fga0Var) {
        this.a = fga0Var;
    }

    public final String a() {
        PaymentMethods.LocationInfo locationInfo = this.a.b.g().o;
        if (locationInfo != null) {
            return locationInfo.a;
        }
        return null;
    }
}
