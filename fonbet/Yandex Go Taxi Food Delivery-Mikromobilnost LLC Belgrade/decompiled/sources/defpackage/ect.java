package defpackage;

import com.yandex.fintechsdk.core.network.api.model.Header;
import com.yandex.fintechsdk.core.network.api.request.RestMethod;
import java.util.Map;

/* loaded from: classes12.dex */
public final class ect extends v4j0 {
    public final String b;
    public final RestMethod c;
    public final String d;
    public final String e;

    public ect(String str) {
        super(new iws(2));
        this.b = str;
        this.c = RestMethod.GET;
        this.d = "redirect_host_process";
        this.e = "pay/v1/public/redirect-host/process";
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
    public final Map f() {
        return g8e.z(Header.UniversalLink.getKey(), this.b);
    }
}
