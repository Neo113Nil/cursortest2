package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a9x0 implements r9x0 {
    public final c0k0 a;

    public a9x0(c0k0 c0k0Var) {
        this.a = c0k0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9x0) && this.a.equals(((a9x0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeleteAddressAction(resultPosition=" + this.a + Extension.C_BRAKE;
    }
}
