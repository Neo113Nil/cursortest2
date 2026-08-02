package com.yandex.go.taxi.order.models.api.response;

import defpackage.gsq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/Feedback;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/k0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class Feedback {
    public static final k0 Companion = new k0();
    public final boolean a;
    public final int b;

    public /* synthetic */ Feedback(int i, boolean z, int i2) {
        if ((i & 1) == 0) {
            this.a = false;
        } else {
            this.a = z;
        }
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Feedback)) {
            return false;
        }
        Feedback feedback = (Feedback) obj;
        return this.a == feedback.a && this.b == feedback.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Feedback(enabled=" + this.a + ", ratingValue=" + this.b + Extension.C_BRAKE;
    }

    public Feedback() {
        this.a = false;
        this.b = 0;
    }
}
