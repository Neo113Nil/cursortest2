package defpackage;

/* loaded from: classes15.dex */
public final class gft {
    public final String a;

    public gft(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gft) && jl40.l(this.a, ((gft) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return oyr.p("Params(guid=", this.a, ", forceUpdate=true)");
    }
}
