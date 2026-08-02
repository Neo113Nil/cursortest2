package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class m190 {
    public final su30 a;

    public /* synthetic */ m190(su30 su30Var) {
        this.a = su30Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m190) {
            return this.a.equals(((m190) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OverlayPayload(route=" + this.a + Extension.C_BRAKE;
    }
}
