package defpackage;

/* loaded from: classes2.dex */
public final class aie0 implements cie0 {
    public final String a;

    public aie0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aie0) && jl40.l(this.a, ((aie0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("String(value="), this.a, ')');
    }
}
