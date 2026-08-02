package xsna;

/* compiled from: WindowInsetsRulers.kt */
/* loaded from: classes11.dex */
public final class arx0 implements zqx0 {
    public final String b;
    public final jif0 c;
    public final jif0 d;

    public arx0(String str) {
        this.b = str;
        this.c = new jif0(str);
        this.d = new jif0(str.concat(" maximum"));
    }

    @Override // xsna.zqx0
    public final iif0 a() {
        return this.c;
    }

    @Override // xsna.zqx0
    public final iif0 b() {
        return this.d;
    }

    public final String toString() {
        return this.b;
    }
}
