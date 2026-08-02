package defpackage;

import com.yandex.fintechsdk.flows.payment.kit.api.model.selectmethod.SelectedPaymentMethodPayload;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lcq0 extends keo {
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lcq0(String str, String str2, String str3, String str4) {
        super("payment_method_resolver_decoding_failed", r0.j());
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("resolver_name", str4);
        mapBuilder.put(SelectedPaymentMethodPayload.KEY_METHOD_TYPE, str3);
        if (str2 != null) {
        }
        if (str != null) {
            mapBuilder.put("error", str);
        }
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lcq0)) {
            return false;
        }
        lcq0 lcq0Var = (lcq0) obj;
        return jl40.l(this.c, lcq0Var.c) && jl40.l(this.d, lcq0Var.d) && jl40.l(this.e, lcq0Var.e) && jl40.l(this.f, lcq0Var.f);
    }

    public final int hashCode() {
        String str = this.c;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.d;
        return this.f.hashCode() + unr0.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        return g8e.r(b64.v("SelectMethodResolverDecodingFailed(error=", this.c, ", methodId=", this.d, ", methodType="), this.e, ", resolverName=", this.f, Extension.C_BRAKE);
    }
}
