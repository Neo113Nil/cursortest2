package defpackage;

/* loaded from: classes2.dex */
public final class nce {
    public final String a;
    public final String b;

    public nce(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nce)) {
            return false;
        }
        nce nceVar = (nce) obj;
        return jl40.l(this.a, nceVar.a) && jl40.l(this.b, nceVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactsContent(webPageUrl=");
        sb.append(this.a);
        sb.append(", skipButtonText=");
        return b64.p(sb, this.b, ')');
    }
}
