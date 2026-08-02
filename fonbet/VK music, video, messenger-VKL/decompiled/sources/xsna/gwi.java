package xsna;

/* compiled from: ValueHolders.kt */
/* loaded from: classes11.dex */
public final class gwi<T> implements xjr0<T> {
    public final izs<mvi, T> a;

    /* JADX WARN: Multi-variable type inference failed */
    public gwi(izs<? super mvi, ? extends T> izsVar) {
        this.a = izsVar;
    }

    @Override // xsna.xjr0
    public final T a(sy90 sy90Var) {
        return this.a.invoke(sy90Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gwi) && epx.f(this.a, ((gwi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return up.c(new StringBuilder("ComputedValueHolder(compute="), this.a, ')');
    }
}
