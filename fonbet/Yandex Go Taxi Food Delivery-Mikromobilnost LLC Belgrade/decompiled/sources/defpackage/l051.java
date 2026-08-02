package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class l051 implements z051 {
    public final g00 a;

    public l051(g00 g00Var) {
        this.a = g00Var;
    }

    public final g00 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l051) && jl40.l(this.a, ((l051) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ArrowButtons(button=" + this.a + Extension.C_BRAKE;
    }
}
