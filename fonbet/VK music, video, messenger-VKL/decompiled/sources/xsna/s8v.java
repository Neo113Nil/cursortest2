package xsna;

/* compiled from: ImItemsUtils.kt */
/* loaded from: classes2.dex */
public final class s8v {
    public final t8v a;
    public final u8v b;

    public s8v(t8v t8vVar, u8v u8vVar) {
        this.a = t8vVar;
        this.b = u8vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s8v)) {
            return false;
        }
        s8v s8vVar = (s8v) obj;
        return epx.f(this.a, s8vVar.a) && epx.f(this.b, s8vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "HistoryStructure(data=" + this.a + ", pagingFlags=" + this.b + ')';
    }
}
