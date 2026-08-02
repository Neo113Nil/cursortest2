package xsna;

/* compiled from: RectRulers.kt */
/* loaded from: classes11.dex */
public final class jif0 implements iif0 {
    public final String a;
    public final xor0 b = new xor0(null);
    public final ofv c = new ofv(null);
    public final xor0 d = new xor0(null);
    public final ofv e = new ofv(null);

    public jif0(String str) {
        this.a = str;
    }

    @Override // xsna.iif0
    public final ofv getBottom() {
        return this.e;
    }

    @Override // xsna.iif0
    public final xor0 getLeft() {
        return this.b;
    }

    @Override // xsna.iif0
    public final xor0 getRight() {
        return this.d;
    }

    @Override // xsna.iif0
    public final ofv getTop() {
        return this.c;
    }

    public final String toString() {
        String str = this.a;
        return str != null ? air.b(')', "RectRulers(", str) : super.toString();
    }
}
