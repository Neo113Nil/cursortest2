package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class nze {
    public final List a;
    public final CharSequence b;
    public final List c;
    public final String d;
    public final String e;
    public final boolean f;

    public nze(List list, CharSequence charSequence, List list2, String str, String str2, boolean z) {
        this.a = list;
        this.b = charSequence;
        this.c = list2;
        this.d = str;
        this.e = str2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nze)) {
            return false;
        }
        nze nzeVar = (nze) obj;
        return jl40.l(this.a, nzeVar.a) && jl40.l(this.b, nzeVar.b) && jl40.l(this.c, nzeVar.c) && jl40.l(this.d, nzeVar.d) && jl40.l(this.e, nzeVar.e) && this.f == nzeVar.f;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.c(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.f) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CounterOfferContent(logos=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", benefits=");
        sb.append(this.c);
        sb.append(", buttonText=");
        sb.append(this.d);
        sb.append(", additionalButtonText=");
        sb.append(this.e);
        sb.append(", isPrioritized=");
        return unr0.u(sb, this.f, ')');
    }
}
