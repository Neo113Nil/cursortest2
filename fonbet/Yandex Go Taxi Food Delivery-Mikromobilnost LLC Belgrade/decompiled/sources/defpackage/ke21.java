package defpackage;

/* loaded from: classes2.dex */
public final class ke21 implements oe21 {
    public final String a;

    public ke21(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ke21) && jl40.l(this.a, ((ke21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Confirmation3ds(url="), this.a, ')');
    }
}
