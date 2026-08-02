package xsna;

/* compiled from: ValueHolders.kt */
/* loaded from: classes11.dex */
public final class wqo<T> implements xjr0<T> {
    public final wh50<T> a;

    public wqo(wh50<T> wh50Var) {
        this.a = wh50Var;
    }

    @Override // xsna.xjr0
    public final T a(sy90 sy90Var) {
        return this.a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wqo) && epx.f(this.a, ((wqo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.a + ')';
    }
}
