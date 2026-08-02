package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o7a0 {
    public final String a;
    public final String b;
    public final lvi0 c;

    public o7a0(lvi0 lvi0Var, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = lvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o7a0)) {
            return false;
        }
        o7a0 o7a0Var = (o7a0) obj;
        return this.a.equals(o7a0Var.a) && jl40.l(this.b, o7a0Var.b) && this.c.equals(o7a0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("OnboardingListItemUiState(title=", this.a, ", subtitle=", this.b, ", icon=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
