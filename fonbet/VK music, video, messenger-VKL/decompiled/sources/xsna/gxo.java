package xsna;

import java.util.List;

/* compiled from: EcosystemGetVerificationMethodsResponse.kt */
/* loaded from: classes15.dex */
public final class gxo {
    public final List<cyo> a;

    public gxo(List<cyo> list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gxo) && epx.f(this.a, ((gxo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("EcosystemGetVerificationMethodsResponse(verificationMethods="), this.a);
    }
}
