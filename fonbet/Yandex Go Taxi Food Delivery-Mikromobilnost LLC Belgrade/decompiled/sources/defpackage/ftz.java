package defpackage;

/* loaded from: classes.dex */
public final class ftz extends gtz {
    public final String a;

    public ftz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftz) && jl40.l(this.a, ((ftz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("External(url="), this.a, ')');
    }
}
