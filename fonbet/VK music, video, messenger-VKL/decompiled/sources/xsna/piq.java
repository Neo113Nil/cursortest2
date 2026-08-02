package xsna;

/* compiled from: VkSnackbarHost.kt */
/* loaded from: classes17.dex */
public final class piq<T> {
    public final T a;
    public final jai b;

    /* JADX WARN: Multi-variable type inference failed */
    public piq(l7k0 l7k0Var, jai jaiVar) {
        this.a = l7k0Var;
        this.b = jaiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof piq)) {
            return false;
        }
        piq piqVar = (piq) obj;
        return epx.f(this.a, piqVar.a) && this.b.equals(piqVar.b);
    }

    public final int hashCode() {
        T t = this.a;
        return this.b.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
