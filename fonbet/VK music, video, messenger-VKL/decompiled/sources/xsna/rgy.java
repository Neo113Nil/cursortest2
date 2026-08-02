package xsna;

/* compiled from: KeyboardOptions.kt */
/* loaded from: classes11.dex */
public final class rgy {
    public static final rgy e;
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;

    static {
        int i = 0;
        e = new rgy(i, i, 127);
    }

    public rgy(int i, Boolean bool, int i2, int i3) {
        this.a = i;
        this.b = bool;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rgy)) {
            return false;
        }
        rgy rgyVar = (rgy) obj;
        return this.a == rgyVar.a && epx.f(this.b, rgyVar.b) && this.c == rgyVar.c && this.d == rgyVar.d;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        Boolean bool = this.b;
        return shy.a(this.d, shy.a(this.c, (hashCode + (bool != null ? bool.hashCode() : 0)) * 31, 31), 29791);
    }

    public final String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) afy.a(this.a)) + ", autoCorrectEnabled=" + this.b + ", keyboardType=" + ((Object) ihy.a(this.c)) + ", imeAction=" + ((Object) qnw.a(this.d)) + ", platformImeOptions=nullshowKeyboardOnFocus=null, hintLocales=null)";
    }

    public /* synthetic */ rgy(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? -1 : 3, (i3 & 2) != 0 ? null : Boolean.FALSE, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? -1 : i2);
    }

    public rgy(int i) {
        this(-1, Boolean.FALSE, 5, i);
    }
}
