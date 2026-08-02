package xsna;

/* compiled from: ThreadLocalDelegate.kt */
/* loaded from: classes.dex */
public interface vqo0<T> {

    /* compiled from: ThreadLocalDelegate.kt */
    /* loaded from: classes17.dex */
    public static final class a {
        public static Object a(vqo0 vqo0Var) {
            return vqo0Var.get();
        }
    }

    T get();
}
