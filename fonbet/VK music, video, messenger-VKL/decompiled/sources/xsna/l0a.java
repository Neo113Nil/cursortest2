package xsna;

/* compiled from: CastViewState.kt */
/* loaded from: classes8.dex */
public final class l0a {
    public final String a;
    public final boolean b;

    public l0a(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0a)) {
            return false;
        }
        l0a l0aVar = (l0a) obj;
        return epx.f(this.a, l0aVar.a) && this.b == l0aVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "CastTextViewState(title=" + this.a + ", isVisible=" + this.b + ")";
    }
}
