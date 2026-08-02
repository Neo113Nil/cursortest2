package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gwa {
    public final int a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final List e;
    public final CharSequence f;
    public final CharSequence g;

    public gwa(int i, String str, CharSequence charSequence, CharSequence charSequence2, List list, CharSequence charSequence3, CharSequence charSequence4) {
        this.a = i;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = list;
        this.f = charSequence3;
        this.g = charSequence4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gwa)) {
            return false;
        }
        gwa gwaVar = (gwa) obj;
        return this.a == gwaVar.a && jl40.l(this.b, gwaVar.b) && jl40.l(this.c, gwaVar.c) && jl40.l(this.d, gwaVar.d) && jl40.l(this.e, gwaVar.e) && jl40.l(this.f, gwaVar.f) && jl40.l(this.g, gwaVar.g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int b = smw0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return this.g.hashCode() + smw0.b(unr0.c((b + (charSequence != null ? charSequence.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "ChargersSurgeInfoUiState(percent=", ", icon=", this.b, ", title=");
        vfc.A(v, this.c, ", subtitle=", this.d, ", items=");
        v.append(this.e);
        v.append(", info=");
        v.append((Object) this.f);
        v.append(", number=");
        return xvz.n(v, this.g, Extension.C_BRAKE);
    }
}
