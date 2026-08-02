package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nre0 implements rre0 {
    public final vnv0 a;

    public nre0(vnv0 vnv0Var) {
        this.a = vnv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nre0) && this.a.equals(((nre0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SummaryWithSuggest(origin=" + this.a + Extension.C_BRAKE;
    }
}
