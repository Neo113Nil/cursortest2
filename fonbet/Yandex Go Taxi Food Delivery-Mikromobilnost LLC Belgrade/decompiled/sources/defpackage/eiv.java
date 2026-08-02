package defpackage;

/* loaded from: classes.dex */
public final class eiv {
    public static final eiv g = new eiv(false, 0, true, 1, 1, k5z.c);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final k5z f;

    public eiv(boolean z, int i, boolean z2, int i2, int i3, k5z k5zVar) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = k5zVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eiv)) {
            return false;
        }
        eiv eivVar = (eiv) obj;
        return this.a == eivVar.a && this.b == eivVar.b && this.c == eivVar.c && this.d == eivVar.d && this.e == eivVar.e && jl40.l(this.f, eivVar.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + oyr.b(this.e, oyr.b(this.d, unr0.e(oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + ((Object) ckx.a(this.b)) + ", autoCorrect=" + this.c + ", keyboardType=" + ((Object) mkx.a(this.d)) + ", imeAction=" + ((Object) div.a(this.e)) + ", platformImeOptions=null, hintLocales=" + this.f + ')';
    }
}
