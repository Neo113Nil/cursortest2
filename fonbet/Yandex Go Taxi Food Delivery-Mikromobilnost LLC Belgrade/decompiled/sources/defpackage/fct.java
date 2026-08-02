package defpackage;

import com.yandex.fintechsdk.core.network.api.request.RestMethod;

/* loaded from: classes12.dex */
public final class fct extends v4j0 {
    public final RestMethod b;
    public final String c;
    public final String d;

    public fct() {
        super(new iws(3));
        this.b = RestMethod.GET;
        this.c = "get_redirection_config";
        this.d = "pay/v1/public/redirections/android";
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
