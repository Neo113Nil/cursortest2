package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d360 {
    public final f360 a;
    public final CharSequence b;
    public final CharSequence c;
    public final List d;
    public final y260 e;
    public final String f;

    public d360(f360 f360Var, CharSequence charSequence, CharSequence charSequence2, List list, y260 y260Var, String str) {
        this.a = f360Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = list;
        this.e = y260Var;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d360)) {
            return false;
        }
        d360 d360Var = (d360) obj;
        return jl40.l(this.a, d360Var.a) && jl40.l(this.b, d360Var.b) && jl40.l(this.c, d360Var.c) && jl40.l(this.d, d360Var.d) && jl40.l(this.e, d360Var.e) && jl40.l(this.f, d360Var.f);
    }

    public final int hashCode() {
        f360 f360Var = this.a;
        int hashCode = (f360Var == null ? 0 : f360Var.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.c;
        int c = unr0.c((hashCode2 + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31, 31, this.d);
        y260 y260Var = this.e;
        int hashCode3 = (c + (y260Var == null ? 0 : y260Var.hashCode())) * 31;
        String str = this.f;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "NeuroPostcardCommonParamsModel(image=" + this.a + ", title=" + ((Object) this.b) + ", subtitle=" + ((Object) this.c) + ", buttons=" + this.d + ", action=" + this.e + ", metricaLabel=" + this.f + Extension.C_BRAKE;
    }
}
