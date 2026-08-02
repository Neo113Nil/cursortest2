package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class g811 implements j811 {
    public final String a;
    public final CharSequence b;
    public final List c;
    public final boolean d;

    public g811(String str, CharSequence charSequence, List list, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = list;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g811)) {
            return false;
        }
        g811 g811Var = (g811) obj;
        return jl40.l(this.a, g811Var.a) && jl40.l(this.b, g811Var.b) && jl40.l(this.c, g811Var.c) && this.d == g811Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        List list = this.c;
        return Boolean.hashCode(this.d) + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Content(mmOfferId=", this.a, ", title=", ", items=");
        t.append(this.c);
        t.append(", enableV2Design=");
        t.append(this.d);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
