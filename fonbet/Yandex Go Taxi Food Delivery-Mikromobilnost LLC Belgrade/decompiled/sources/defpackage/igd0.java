package defpackage;

/* loaded from: classes2.dex */
public final class igd0 implements jgd0 {
    public final String a;

    public igd0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof igd0) && jl40.l(this.a, ((igd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Visible(login="), this.a, ')');
    }
}
