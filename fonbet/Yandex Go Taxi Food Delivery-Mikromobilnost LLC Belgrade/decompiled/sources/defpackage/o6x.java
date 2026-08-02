package defpackage;

/* loaded from: classes9.dex */
public final class o6x implements j5x {
    public final String a;

    public o6x(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o6x) && jl40.l(this.a, ((o6x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("JasonString(content="), this.a, ')');
    }
}
