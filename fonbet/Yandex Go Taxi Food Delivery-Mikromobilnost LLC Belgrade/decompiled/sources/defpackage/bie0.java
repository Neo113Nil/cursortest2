package defpackage;

/* loaded from: classes2.dex */
public final class bie0 implements cie0 {
    public final Object a;

    public bie0(Object obj) {
        this.a = obj;
    }

    public final Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bie0) && this.a.equals(((bie0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return qv10.r(new StringBuilder("Unknown(value="), this.a, ')');
    }
}
