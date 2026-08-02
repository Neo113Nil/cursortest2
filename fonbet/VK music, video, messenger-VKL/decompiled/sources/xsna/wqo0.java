package xsna;

/* compiled from: ThreadLocalDelegate.kt */
/* loaded from: classes.dex */
public final class wqo0<T> implements vqo0<T> {
    public final gzs<T> a;
    public final a b = new a(this);

    /* compiled from: ThreadLocalDelegate.kt */
    public static final class a extends ThreadLocal<T> {
        public final /* synthetic */ wqo0<T> a;

        public a(wqo0<T> wqo0Var) {
            this.a = wqo0Var;
        }

        @Override // java.lang.ThreadLocal
        public final T initialValue() {
            return this.a.a.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wqo0(gzs<? extends T> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.vqo0
    public final T get() {
        return this.b.get();
    }
}
