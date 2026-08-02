package xsna;

/* compiled from: SelectLanguageScreenState.kt */
/* loaded from: classes6.dex */
public final class c9i0 {
    public final zha0 a;
    public final zha0 b;

    public c9i0(zha0 zha0Var, zha0 zha0Var2) {
        this.a = zha0Var;
        this.b = zha0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9i0)) {
            return false;
        }
        c9i0 c9i0Var = (c9i0) obj;
        return epx.f(this.a, c9i0Var.a) && epx.f(this.b, c9i0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectLanguageScreenState(originalLanguagePickerState=" + this.a + ", translationLanguagePickerState=" + this.b + ')';
    }
}
