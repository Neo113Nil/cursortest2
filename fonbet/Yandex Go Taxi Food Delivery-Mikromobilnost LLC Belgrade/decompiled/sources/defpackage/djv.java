package defpackage;

/* loaded from: classes5.dex */
public final class djv {
    public final String a;

    public djv(String str, int i) {
        this.a = (i & 1) != 0 ? null : str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djv) && jl40.l(this.a, ((djv) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) * 961;
    }

    public final String toString() {
        return oyr.p("Strings(title=", this.a, ", subtitle=null, sdkStrings=null)");
    }

    public djv() {
        this(null, 7);
    }
}
