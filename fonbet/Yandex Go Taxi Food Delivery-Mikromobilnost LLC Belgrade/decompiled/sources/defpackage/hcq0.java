package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hcq0 {
    public final pdq0 a;

    public hcq0(pdq0 pdq0Var) {
        this.a = pdq0Var;
    }

    public final pdq0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcq0) && this.a.equals(((hcq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SelectMe2MeAccountOptionViewState(selectAccountFrom=" + this.a + Extension.C_BRAKE;
    }
}
