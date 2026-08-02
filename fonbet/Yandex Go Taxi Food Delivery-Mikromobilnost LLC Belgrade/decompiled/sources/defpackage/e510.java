package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e510 implements h510 {
    public final g510 a;

    public e510(g510 g510Var) {
        this.a = g510Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e510) && this.a.equals(((e510) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SingleColumn(textColumn=" + this.a + Extension.C_BRAKE;
    }
}
