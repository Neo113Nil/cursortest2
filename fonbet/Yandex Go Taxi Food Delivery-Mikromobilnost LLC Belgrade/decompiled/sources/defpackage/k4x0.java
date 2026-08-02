package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class k4x0 {
    public final List a;
    public final List b;

    public k4x0(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4x0)) {
            return false;
        }
        k4x0 k4x0Var = (k4x0) obj;
        return jl40.l(this.a, k4x0Var.a) && jl40.l(this.b, k4x0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("TLSProviderConfig(rootCertificates=", this.a, ", clientCertificates=", this.b, Extension.C_BRAKE);
    }

    public k4x0() {
        this(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ k4x0(int i) {
        this(r1, r1);
        EmptyList emptyList = EmptyList.a;
    }
}
