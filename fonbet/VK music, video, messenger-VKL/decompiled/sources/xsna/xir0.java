package xsna;

/* compiled from: ValidatingOffsetMapping.kt */
/* loaded from: classes11.dex */
public final class xir0 implements uv70 {
    public final uv70 a;
    public final int b;
    public final int c;

    public xir0(uv70 uv70Var, int i, int i2) {
        this.a = uv70Var;
        this.b = i;
        this.c = i2;
    }

    @Override // xsna.uv70
    public final int a(int i) {
        int a = this.a.a(i);
        if (i >= 0 && i <= this.c) {
            yir0.c(a, this.b, i);
        }
        return a;
    }

    @Override // xsna.uv70
    public final int b(int i) {
        int b = this.a.b(i);
        if (i >= 0 && i <= this.b) {
            yir0.b(b, this.c, i);
        }
        return b;
    }
}
