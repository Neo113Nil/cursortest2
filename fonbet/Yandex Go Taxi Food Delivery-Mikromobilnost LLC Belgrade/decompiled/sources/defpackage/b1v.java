package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class b1v extends c1v {
    public final h111 a;

    public b1v(h111 h111Var) {
        this.a = h111Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1v) && jl40.l(this.a, ((b1v) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TransportPaymentInfo(uiState=" + this.a + Extension.C_BRAKE;
    }
}
