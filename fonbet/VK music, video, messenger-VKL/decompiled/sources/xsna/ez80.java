package xsna;

/* compiled from: MessageTranslateScreenState.kt */
/* loaded from: classes6.dex */
public final class ez80 {
    public final CharSequence a;
    public final boolean b;

    public ez80(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez80)) {
            return false;
        }
        ez80 ez80Var = (ez80) obj;
        return epx.f(this.a, ez80Var.a) && this.b == ez80Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriginalTextState(text=");
        sb.append((Object) this.a);
        sb.append(", expanded=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
