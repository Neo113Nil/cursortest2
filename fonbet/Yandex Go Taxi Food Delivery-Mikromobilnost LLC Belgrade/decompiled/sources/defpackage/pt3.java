package defpackage;

/* loaded from: classes6.dex */
public final class pt3 {
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;

    public pt3(pt3 pt3Var) {
        this.a = 1;
        this.b = pt3Var.b;
        this.c = pt3Var.c;
        this.d = pt3Var.d;
        this.e = pt3Var.e;
    }

    public float a() {
        return this.b + this.d;
    }

    public float b() {
        return this.c + this.e;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                sb.append(this.b);
                sb.append(" ");
                sb.append(this.c);
                sb.append(" ");
                sb.append(this.d);
                sb.append(" ");
                return uw51.i(sb, this.e, "]");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ pt3(float f, float f2, float f3, float f4, int i) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }
}
