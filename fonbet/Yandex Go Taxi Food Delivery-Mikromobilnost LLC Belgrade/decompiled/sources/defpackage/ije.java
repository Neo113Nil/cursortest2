package defpackage;

/* loaded from: classes9.dex */
public final class ije {
    public final int a;
    public final Object[] b;
    public int c;
    public final /* synthetic */ int d;

    public ije(int i, int i2) {
        this.d = i2;
        this.a = i;
        this.b = new Object[i];
    }

    public final void a(Object obj) {
        if (this.c < this.a) {
            switch (this.d) {
                case 0:
                    yi9 yi9Var = (yi9) obj;
                    yi9Var.d = 0;
                    yi9Var.c = 0;
                    break;
                case 1:
                    ((StringBuilder) obj).setLength(0);
                    break;
                case 2:
                    ye7 ye7Var = (ye7) obj;
                    ye7Var.a.c = 0;
                    ye7Var.b.c = 0;
                    ye7Var.c = true;
                    break;
                default:
                    ((inj) obj).c = 0;
                    break;
            }
            int i = this.c;
            this.c = i + 1;
            this.b[i] = obj;
        }
    }

    public final Object b() {
        int i = this.c;
        if (i > 0) {
            int i2 = i - 1;
            this.c = i2;
            return this.b[i2];
        }
        switch (this.d) {
            case 0:
                return new yi9(0);
            case 1:
                return new StringBuilder();
            case 2:
                return new ye7();
            default:
                return new inj(0);
        }
    }
}
