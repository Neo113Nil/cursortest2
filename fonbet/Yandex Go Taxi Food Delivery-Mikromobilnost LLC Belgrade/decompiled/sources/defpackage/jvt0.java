package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class jvt0 {
    public final tf51 a;

    public jvt0(tf51 tf51Var) {
        this.a = tf51Var;
    }

    public final tf51 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvt0) && this.a.equals(((jvt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SplitInfoOverdue(amount=" + this.a + Extension.C_BRAKE;
    }
}
