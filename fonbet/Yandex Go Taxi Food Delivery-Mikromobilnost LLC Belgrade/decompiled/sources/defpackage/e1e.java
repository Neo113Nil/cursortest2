package defpackage;

/* loaded from: classes2.dex */
public final class e1e {
    public final String a;

    public e1e(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1e) && jl40.l(this.a, ((e1e) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Background(color="), this.a, ')');
    }
}
