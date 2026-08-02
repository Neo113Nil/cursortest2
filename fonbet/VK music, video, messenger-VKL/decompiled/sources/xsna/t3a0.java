package xsna;

/* compiled from: PhoneSpan.kt */
/* loaded from: classes2.dex */
public final class t3a0 extends ohl {
    public final String e;

    public t3a0(String str) {
        super(3, null);
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t3a0) && epx.f(this.e, ((t3a0) obj).e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    @Override // android.text.style.ClickableSpan
    public final String toString() {
        return ho8.a(new StringBuilder("PhoneSpan(phone="), this.e, ')');
    }
}
