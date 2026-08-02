package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;

/* loaded from: classes12.dex */
public final class d3t extends v4j0 {
    public final RestMethod b;
    public final String c;
    public final String d;

    public d3t() {
        super(null);
        this.b = RestMethod.GET;
        this.c = "get_applink_payment_config";
        this.d = "/pay/v1/configuration/fintech-sdk";
    }

    @Override // defpackage.v4j0
    public final RestMethod c() {
        return this.b;
    }

    @Override // defpackage.v4j0
    public final String d() {
        return this.c;
    }

    @Override // defpackage.v4j0
    public final String e() {
        return this.d;
    }
}
