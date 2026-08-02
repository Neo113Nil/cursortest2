package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jrj {
    public final CharSequence a;
    public final List b;
    public final List c;
    public final String d;
    public final List e;

    public jrj(CharSequence charSequence, List list, List list2, String str, List list3) {
        this.a = charSequence;
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrj)) {
            return false;
        }
        jrj jrjVar = (jrj) obj;
        return jl40.l(this.a, jrjVar.a) && jl40.l(this.b, jrjVar.b) && jl40.l(this.c, jrjVar.c) && jl40.l(this.d, jrjVar.d) && jl40.l(this.e, jrjVar.e);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscountsPromoCodeDetailsUiState(title=");
        sb.append((Object) this.a);
        sb.append(", descriptions=");
        sb.append(this.b);
        sb.append(", details=");
        oyr.D(", decorationImageUrl=", this.d, ", buttons=", sb, this.c);
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
