package defpackage;

/* loaded from: classes2.dex */
public final class ice implements jce {
    public final String a;
    public final String b;

    public ice(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ice)) {
            return false;
        }
        ice iceVar = (ice) obj;
        return jl40.l(this.a, iceVar.a) && jl40.l(this.b, iceVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeedsCollection(webPageUrl=");
        sb.append(this.a);
        sb.append(", skipButtonText=");
        return b64.p(sb, this.b, ')');
    }
}
