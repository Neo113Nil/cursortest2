package defpackage;

/* loaded from: classes9.dex */
public final class p6x implements q6x {
    public final String a;

    public p6x(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p6x) && jl40.l(this.a, ((p6x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Leaf(content="), this.a, ')');
    }
}
