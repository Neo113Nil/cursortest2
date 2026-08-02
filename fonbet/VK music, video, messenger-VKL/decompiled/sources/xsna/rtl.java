package xsna;

/* compiled from: DelegateFactory.java */
/* loaded from: classes8.dex */
public final class rtl<T> implements d9e0 {
    public d9e0<T> b;

    @Override // xsna.e9e0
    public final T get() {
        d9e0<T> d9e0Var = this.b;
        if (d9e0Var != null) {
            return d9e0Var.get();
        }
        throw new IllegalStateException();
    }
}
