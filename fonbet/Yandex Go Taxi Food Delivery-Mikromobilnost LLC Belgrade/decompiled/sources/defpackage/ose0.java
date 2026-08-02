package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ose0 extends qse0 {
    public final k9s0 a;

    public ose0(k9s0 k9s0Var) {
        this.a = k9s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ose0) && this.a.equals(((ose0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TransportHub(showSummaryParams=" + this.a + Extension.C_BRAKE;
    }
}
