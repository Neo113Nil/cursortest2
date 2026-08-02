package xsna;

/* compiled from: Font.kt */
/* loaded from: classes11.dex */
public final class uag0 implements n4s {
    public final int a;
    public final b6s b;
    public final a6s c;

    public uag0(int i, b6s b6sVar, a6s a6sVar) {
        this.a = i;
        this.b = b6sVar;
        this.c = a6sVar;
    }

    @Override // xsna.n4s
    public final int a() {
        return 0;
    }

    @Override // xsna.n4s
    public final b6s b() {
        return this.b;
    }

    @Override // xsna.n4s
    public final int c() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uag0)) {
            return false;
        }
        uag0 uag0Var = (uag0) obj;
        return this.a == uag0Var.a && epx.f(this.b, uag0Var.b) && this.c.equals(uag0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + shy.a(0, shy.a(0, ((this.a * 31) + this.b.b) * 31, 31), 31);
    }

    public final String toString() {
        return "ResourceFont(resId=" + this.a + ", weight=" + this.b + ", style=" + ((Object) "Normal") + ", loadingStrategy=Blocking)";
    }
}
