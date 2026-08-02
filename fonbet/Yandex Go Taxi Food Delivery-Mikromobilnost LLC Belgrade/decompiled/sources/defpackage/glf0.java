package defpackage;

/* loaded from: classes2.dex */
public final class glf0 extends hlf0 {
    public final Object a;

    public glf0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof glf0) && jl40.l(this.a, ((glf0) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return qv10.p("Value[", "]", this.a);
    }
}
