package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class m6y0 {
    public final boolean a;
    public final int b;

    public m6y0(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public final int a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6y0)) {
            return false;
        }
        m6y0 m6y0Var = (m6y0) obj;
        return this.a == m6y0Var.a && this.b == m6y0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Feedback(isRatingVisible=" + this.a + ", rating=" + this.b + Extension.C_BRAKE;
    }
}
