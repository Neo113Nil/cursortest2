package xsna;

/* compiled from: ImeOptions.kt */
/* loaded from: classes11.dex */
public final class rnw {
    public static final rnw g = new rnw(false, 0, true, 1, 1, lwz.d);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final lwz f;

    public rnw(boolean z, int i, boolean z2, int i2, int i3, lwz lwzVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = lwzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rnw)) {
            return false;
        }
        rnw rnwVar = (rnw) obj;
        return this.a == rnwVar.a && this.b == rnwVar.b && this.c == rnwVar.c && this.d == rnwVar.d && this.e == rnwVar.e && epx.f(this.f, rnwVar.f);
    }

    public final int hashCode() {
        return this.f.b.hashCode() + shy.a(this.e, shy.a(this.d, qoy.b(shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) afy.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) ihy.a(this.d)) + ", imeAction=" + ((Object) qnw.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
