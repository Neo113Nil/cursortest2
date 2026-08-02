package defpackage;

/* loaded from: classes.dex */
public final class hb3 {
    public final Object a;

    public /* synthetic */ hb3(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hb3) {
            return jl40.l(this.a, ((hb3) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ')';
    }
}
