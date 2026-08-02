package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cqk0 {
    public final boolean a;
    public final String b;
    public final bpl0 c;

    public cqk0(boolean z, String str, bpl0 bpl0Var) {
        this.a = z;
        this.b = str;
        this.c = bpl0Var;
    }

    public static cqk0 a(cqk0 cqk0Var, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            z = cqk0Var.a;
        }
        if ((i & 2) != 0) {
            str = cqk0Var.b;
        }
        return new cqk0(z, str, cqk0Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqk0)) {
            return false;
        }
        cqk0 cqk0Var = (cqk0) obj;
        return this.a == cqk0Var.a && jl40.l(this.b, cqk0Var.b) && this.c.equals(cqk0Var.c);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.a.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("RideNameRecommendationsUiState(isEnabled=", ", selectedRecommendation=", this.b, ", recommendations=", this.a);
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
