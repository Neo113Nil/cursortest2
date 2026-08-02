package xsna;

/* compiled from: CommunityCategorySuggestionInfoState.kt */
/* loaded from: classes5.dex */
public final class vtg implements km50 {
    public final String b;
    public final s8u0 c;

    public vtg() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtg)) {
            return false;
        }
        vtg vtgVar = (vtg) obj;
        return epx.f(this.b, vtgVar.b) && epx.f(this.c, vtgVar.c);
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        s8u0 s8u0Var = this.c;
        return hashCode + (s8u0Var != null ? s8u0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CommunityCategorySuggestionInfoState(title=" + this.b + ", parsedText=" + this.c + ')';
    }

    public vtg(String str, s8u0 s8u0Var) {
        this.b = str;
        this.c = s8u0Var;
    }
}
