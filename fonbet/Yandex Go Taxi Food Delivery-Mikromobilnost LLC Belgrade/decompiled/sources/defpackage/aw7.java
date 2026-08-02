package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class aw7 extends cw7 {
    public final String a;
    public final psc b;

    public aw7(String str, psc pscVar) {
        this.a = str;
        this.b = pscVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aw7)) {
            return false;
        }
        aw7 aw7Var = (aw7) obj;
        return jl40.l(this.a, aw7Var.a) && this.b.equals(aw7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CancelMessageButtonActionPerformerCall(title=" + this.a + ", communicationMethod=" + this.b + Extension.C_BRAKE;
    }
}
