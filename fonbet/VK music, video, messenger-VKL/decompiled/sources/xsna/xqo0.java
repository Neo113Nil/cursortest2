package xsna;

/* compiled from: ThreadLocal.kt */
/* loaded from: classes4.dex */
public final class xqo0<T> {
    public final gzs<T> a;
    public final a b = new a(this);

    /* compiled from: ThreadLocal.kt */
    public static final class a extends ThreadLocal<T> {
        public final /* synthetic */ xqo0<T> a;

        public a(xqo0<T> xqo0Var) {
            this.a = xqo0Var;
        }

        @Override // java.lang.ThreadLocal
        public final T initialValue() {
            return this.a.a.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xqo0(gzs<? extends T> gzsVar) {
        this.a = gzsVar;
    }
}
