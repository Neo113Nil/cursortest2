package xsna;

/* compiled from: CalendarModel.kt */
/* loaded from: classes11.dex */
public final class bxk {
    public final String a;
    public final char b;
    public final String c;

    public bxk(String str, char c) {
        this.a = str;
        this.b = c;
        this.c = brm0.y(str, String.valueOf(c), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bxk)) {
            return false;
        }
        bxk bxkVar = (bxk) obj;
        return epx.f(this.a, bxkVar.a) && this.b == bxkVar.b;
    }

    public final int hashCode() {
        return Character.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
