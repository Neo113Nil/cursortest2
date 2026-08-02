package xsna;

/* compiled from: SnackbarHost.kt */
/* loaded from: classes11.dex */
public final class qiq<T> {
    public final T a;
    public final jai b;

    /* JADX WARN: Multi-variable type inference failed */
    public qiq(k7k0 k7k0Var, jai jaiVar) {
        this.a = k7k0Var;
        this.b = jaiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qiq)) {
            return false;
        }
        qiq qiqVar = (qiq) obj;
        return epx.f(this.a, qiqVar.a) && this.b.equals(qiqVar.b);
    }

    public final int hashCode() {
        T t = this.a;
        return this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
