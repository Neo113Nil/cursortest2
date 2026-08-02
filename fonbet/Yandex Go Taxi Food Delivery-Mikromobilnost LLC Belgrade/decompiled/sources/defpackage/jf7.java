package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class jf7 implements kf7 {
    public final pf7 a;

    public jf7(pf7 pf7Var) {
        this.a = pf7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jf7) && this.a.equals(((jf7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MonthHeader(data=" + this.a + Extension.C_BRAKE;
    }
}
