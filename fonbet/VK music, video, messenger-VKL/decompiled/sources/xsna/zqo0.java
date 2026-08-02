package xsna;

/* compiled from: ThreadLocalDelegate.kt */
/* loaded from: classes.dex */
public final class zqo0<T> {
    public final gzs<T> a;
    public final a b = new a(this);

    /* compiled from: ThreadLocalDelegate.kt */
    public static final class a extends ThreadLocal<T> {
        public final /* synthetic */ zqo0<T> a;

        public a(zqo0<T> zqo0Var) {
            this.a = zqo0Var;
        }

        @Override // java.lang.ThreadLocal
        public final T initialValue() {
            return this.a.a.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zqo0(gzs<? extends T> gzsVar) {
        this.a = gzsVar;
    }
}
