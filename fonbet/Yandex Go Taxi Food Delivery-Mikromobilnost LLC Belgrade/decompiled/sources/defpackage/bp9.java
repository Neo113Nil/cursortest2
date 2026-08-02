package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bp9 {
    public final String a;

    public /* synthetic */ bp9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bp9) {
            return jl40.l(this.a, ((bp9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ChargersCompletionPayload(orderId=", this.a, Extension.C_BRAKE);
    }
}
