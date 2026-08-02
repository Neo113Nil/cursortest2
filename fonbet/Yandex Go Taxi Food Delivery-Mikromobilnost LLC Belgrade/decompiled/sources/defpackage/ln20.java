package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ln20 extends mn20 {
    public final jn20 a;

    public ln20(jn20 jn20Var) {
        this.a = jn20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln20) && this.a.equals(((ln20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(info=" + this.a + Extension.C_BRAKE;
    }
}
