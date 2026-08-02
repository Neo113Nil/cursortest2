package xsna;

/* compiled from: Composer.kt */
/* loaded from: classes11.dex */
public final class c9e0<T> {
    public final androidx.compose.runtime.e a;
    public final boolean b;
    public final abk0<T> c;
    public final boolean d;
    public final T e;
    public boolean f = true;

    /* JADX WARN: Multi-variable type inference failed */
    public c9e0(androidx.compose.runtime.e eVar, Object obj, boolean z, abk0 abk0Var, boolean z2) {
        this.a = eVar;
        this.b = z;
        this.c = abk0Var;
        this.d = z2;
        this.e = obj;
    }

    public final T a() {
        if (this.b) {
            return null;
        }
        T t = this.e;
        if (t != null) {
            return t;
        }
        throw at.b("Unexpected form of a provided value");
    }
}
