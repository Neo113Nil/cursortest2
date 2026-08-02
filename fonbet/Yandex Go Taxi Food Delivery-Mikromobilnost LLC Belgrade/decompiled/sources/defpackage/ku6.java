package defpackage;

import com.yandex.go.dto.response.BundledOrdersPayload;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ku6 implements mu6 {
    public final BundledOrdersPayload a;

    public ku6(BundledOrdersPayload bundledOrdersPayload) {
        this.a = bundledOrdersPayload;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ku6) && jl40.l(this.a, ((ku6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Local(payload=" + this.a + Extension.C_BRAKE;
    }
}
