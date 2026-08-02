package defpackage;

/* loaded from: classes9.dex */
public final class pse extends d7 {
    public static final x4c b = new x4c(21);
    public final String a;

    public pse(String str) {
        super(b);
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pse) && jl40.l(this.a, ((pse) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("CoroutineName("), this.a, ')');
    }
}
