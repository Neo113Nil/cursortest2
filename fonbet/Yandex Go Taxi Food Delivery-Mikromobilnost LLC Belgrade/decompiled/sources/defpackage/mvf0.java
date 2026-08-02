package defpackage;

/* loaded from: classes.dex */
public final class mvf0 implements i131 {
    public boolean a = false;
    public boolean b = false;
    public lxq c;
    public final kvf0 d;

    public mvf0(kvf0 kvf0Var) {
        this.d = kvf0Var;
    }

    @Override // defpackage.i131
    public final i131 a(String str) {
        if (this.a) {
            ny61.x("Cannot encode a second value in the ValueEncoderContext");
            return null;
        }
        this.a = true;
        this.d.i(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.i131
    public final i131 add(boolean z) {
        if (this.a) {
            ny61.x("Cannot encode a second value in the ValueEncoderContext");
            return null;
        }
        this.a = true;
        this.d.g(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
