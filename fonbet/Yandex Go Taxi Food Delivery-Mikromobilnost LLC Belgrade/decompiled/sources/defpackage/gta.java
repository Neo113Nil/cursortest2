package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gta {
    public final CharSequence a;
    public final ovi0 b;
    public final List c;
    public final CharSequence d;
    public final List e;

    public gta(CharSequence charSequence, ovi0 ovi0Var, List list, CharSequence charSequence2, List list2) {
        this.a = charSequence;
        this.b = ovi0Var;
        this.c = list;
        this.d = charSequence2;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gta)) {
            return false;
        }
        gta gtaVar = (gta) obj;
        return jl40.l(this.a, gtaVar.a) && jl40.l(this.b, gtaVar.b) && jl40.l(this.c, gtaVar.c) && jl40.l(this.d, gtaVar.d) && jl40.l(this.e, gtaVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ovi0 ovi0Var = this.b;
        int c = unr0.c((hashCode + (ovi0Var == null ? 0 : ovi0Var.hashCode())) * 31, 31, this.c);
        CharSequence charSequence = this.d;
        return this.e.hashCode() + ((c + (charSequence != null ? charSequence.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersSubscriptionData(title=");
        sb.append((Object) this.a);
        sb.append(", serviceTopIconTag=");
        sb.append(this.b);
        sb.append(", terms=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append((Object) this.d);
        sb.append(", buttons=");
        return ly3.s(sb, this.e, Extension.C_BRAKE);
    }
}
