package xsna;

/* compiled from: SubtitleState.kt */
/* loaded from: classes16.dex */
public final class c1n0 {
    public final CharSequence a;
    public final wup0 b;

    public c1n0(CharSequence charSequence, wup0 wup0Var) {
        this.a = charSequence;
        this.b = wup0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1n0)) {
            return false;
        }
        c1n0 c1n0Var = (c1n0) obj;
        return epx.f(this.a, c1n0Var.a) && epx.f(this.b, c1n0Var.b);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        int hashCode = charSequence == null ? 0 : charSequence.hashCode();
        return Boolean.hashCode(false) + ((this.b.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "SubtitleState(text=" + ((Object) this.a) + ", typingState=" + this.b + ", showOnlineMobile=false)";
    }
}
