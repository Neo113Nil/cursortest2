package xsna;

/* compiled from: MentionSpan.kt */
/* loaded from: classes2.dex */
public final class j420 extends ohl {
    public final k320 e;

    public j420(k320 k320Var) {
        super(3, null);
        this.e = k320Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j420) && epx.f(this.e, ((j420) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // android.text.style.ClickableSpan
    public final String toString() {
        return "MentionSpan(mention=" + this.e + ')';
    }
}
