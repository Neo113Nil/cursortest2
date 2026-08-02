package xsna;

/* compiled from: NumbersSpan.kt */
/* loaded from: classes2.dex */
public final class wn70 extends ohl {
    public final String e;

    public wn70(String str) {
        super(3, null);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn70) && epx.f(this.e, ((wn70) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // android.text.style.ClickableSpan
    public final String toString() {
        return ho8.a(new StringBuilder("NumbersSpan(numbers="), this.e, ')');
    }
}
