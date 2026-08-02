package xsna;

/* compiled from: EmailSpan.kt */
/* loaded from: classes2.dex */
public final class jcp extends ohl {
    public final String e;

    public jcp(String str) {
        super(3, null);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jcp) && epx.f(this.e, ((jcp) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // android.text.style.ClickableSpan
    public final String toString() {
        return ho8.a(new StringBuilder("EmailSpan(email="), this.e, ')');
    }
}
