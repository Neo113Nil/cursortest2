package xsna;

/* compiled from: PhotoParamsWrapper.kt */
/* loaded from: classes15.dex */
public final class paa0 {
    public final String a;
    public final haa0 b;

    public paa0(String str, haa0 haa0Var) {
        this.a = str;
        this.b = haa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof paa0)) {
            return false;
        }
        paa0 paa0Var = (paa0) obj;
        return epx.f(this.a, paa0Var.a) && epx.f(this.b, paa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PhotoParamsWrapper(createEntryPoint=" + this.a + ", params=" + this.b + ')';
    }
}
