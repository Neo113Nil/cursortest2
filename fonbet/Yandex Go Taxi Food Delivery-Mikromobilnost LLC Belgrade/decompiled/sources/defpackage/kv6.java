package defpackage;

import com.yandex.go.dto.response.BundledOrdersPayload;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkv6;", "Lx251;", "Companion", "iv6", "jv6", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class kv6 extends x251 {
    public static final jv6 Companion = new jv6();
    public final BundledOrdersPayload a;
    public final String b;

    public kv6(int i, BundledOrdersPayload bundledOrdersPayload, String str) {
        this.a = (i & 1) == 0 ? new BundledOrdersPayload(0) : bundledOrdersPayload;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public static kv6 b(kv6 kv6Var, BundledOrdersPayload bundledOrdersPayload) {
        return new kv6(bundledOrdersPayload, kv6Var.b);
    }

    @Override // defpackage.x251
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final BundledOrdersPayload getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv6)) {
            return false;
        }
        kv6 kv6Var = (kv6) obj;
        return jl40.l(this.a, kv6Var.a) && jl40.l(this.b, kv6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BundledOrdersWidgetDto(payload=" + this.a + ", id=" + this.b + Extension.C_BRAKE;
    }

    public kv6(BundledOrdersPayload bundledOrdersPayload, String str) {
        this.a = bundledOrdersPayload;
        this.b = str;
    }

    public kv6() {
        this(new BundledOrdersPayload(0), "");
    }
}
