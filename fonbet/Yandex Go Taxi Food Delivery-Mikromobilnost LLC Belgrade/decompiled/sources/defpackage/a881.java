package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class a881 {
    public final kf71 a;
    public final a581 b;

    public a881(kf71 kf71Var, a581 a581Var) {
        this.a = kf71Var;
        this.b = a581Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a881) {
            a881 a881Var = (a881) obj;
            if (this.a == a881Var.a && this.b.equals(a881Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NoticeValidationHolder(notice=" + this.a + ", validationResult=" + this.b + Extension.C_BRAKE;
    }
}
