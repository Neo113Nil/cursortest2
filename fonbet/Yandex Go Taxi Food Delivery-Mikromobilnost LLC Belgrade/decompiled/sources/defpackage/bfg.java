package defpackage;

/* loaded from: classes2.dex */
public final class bfg {
    public final String a;

    public bfg(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bfg) && jl40.l(this.a, ((bfg) obj).a);
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
