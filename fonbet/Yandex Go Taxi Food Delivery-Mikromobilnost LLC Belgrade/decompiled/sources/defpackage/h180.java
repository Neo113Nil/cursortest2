package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import java.util.Map;

/* loaded from: classes12.dex */
public final class h180 extends v4j0 {
    public final String b;
    public final RestMethod c;
    public final String d;
    public final String e;

    public h180(String str) {
        super(new ur70(9));
        this.b = str;
        this.c = RestMethod.GET;
        this.d = "order_meta_info";
        this.e = "api/v1/orders/meta/by-payment-url";
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.c;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.d;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.e;
    }

    @Override // defpackage.v4j0
    public final Map g() {
        return g8e.z("payment_url", this.b);
    }
}
