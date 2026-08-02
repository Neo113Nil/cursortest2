package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class k8x0 {
    public final String a;
    public final List b;

    public k8x0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k8x0)) {
            return false;
        }
        k8x0 k8x0Var = (k8x0) obj;
        return jl40.l(this.a, k8x0Var.a) && jl40.l(this.b, k8x0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return nnm.h("AiChatMessage(template=", this.a, ", formStateKeys=", Extension.C_BRAKE, this.b);
    }
}
