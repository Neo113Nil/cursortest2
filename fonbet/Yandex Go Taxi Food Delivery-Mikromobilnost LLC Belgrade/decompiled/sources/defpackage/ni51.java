package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ni51 {
    public final gu91 a;

    public ni51(gu91 gu91Var) {
        this.a = gu91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ni51) && this.a.equals(((ni51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YBStartSessionResponse(action=" + this.a + Extension.C_BRAKE;
    }
}
