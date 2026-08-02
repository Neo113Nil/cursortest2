package defpackage;

/* loaded from: classes2.dex */
public final class c8s {
    public final String a;

    public c8s(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c8s) && jl40.l(this.a, ((c8s) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("GroupAttributes(metaColor="), this.a, ')');
    }

    public c8s() {
        this(null);
    }
}
