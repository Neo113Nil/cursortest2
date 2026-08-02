package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class gt81 {
    public final cu81 a;

    public gt81(cu81 cu81Var) {
        this.a = cu81Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gt81) && jl40.l(this.a, ((gt81) obj).a);
    }

    public final int hashCode() {
        cu81 cu81Var = this.a;
        if (cu81Var == null) {
            return 0;
        }
        return cu81Var.hashCode();
    }

    public final String toString() {
        return "FeedbackValue(imageValue=" + this.a + Extension.C_BRAKE;
    }
}
