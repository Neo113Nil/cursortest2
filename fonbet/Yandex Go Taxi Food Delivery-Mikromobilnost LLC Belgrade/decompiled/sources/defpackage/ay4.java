package defpackage;

/* loaded from: classes11.dex */
public abstract class ay4 {
    public final /* synthetic */ int a;
    public final int b;

    public /* synthetic */ ay4(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    public static String a(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public static ay4 b(ay4 ay4Var, by4[] by4VarArr, by4[] by4VarArr2, int i) {
        if ((i & 1) != 0) {
            by4VarArr = new by4[0];
        }
        if ((i & 2) != 0) {
            by4VarArr2 = new by4[0];
        }
        int i2 = ay4Var.b;
        for (by4 by4Var : by4VarArr) {
            i2 |= 1 << by4Var.getOrdinalValue();
        }
        for (by4 by4Var2 : by4VarArr2) {
            i2 &= ~(1 << by4Var2.getOrdinalValue());
        }
        return ay4Var.c(i2);
    }

    public static String d(int i) {
        return "" + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    public abstract ay4 c(int i);

    public int e() {
        switch (this.a) {
            case 1:
                if (!(this instanceof w7e)) {
                    if (!(this instanceof y7e)) {
                        if (!(this instanceof c8e)) {
                            if (!(this instanceof s7e)) {
                                if (!(this instanceof q7e)) {
                                    if (!(this instanceof a8e)) {
                                        if (!(this instanceof u7e)) {
                                            w511.b();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                if (!(this instanceof x7e)) {
                    if (!(this instanceof z7e)) {
                        if (!(this instanceof d8e)) {
                            if (!(this instanceof t7e)) {
                                if (!(this instanceof r7e)) {
                                    if (!(this instanceof b8e)) {
                                        if (!(this instanceof v7e)) {
                                            w511.b();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
        }
        return 0;
    }

    public boolean f(by4 by4Var) {
        return (this.b & (1 << by4Var.getOrdinalValue())) > 0;
    }

    public abstract int g(int i);

    public abstract int h(int i);

    public abstract int i(int i);

    public String toString() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 3:
                return d(i2);
            case 7:
                return a(i2);
            default:
                return super.toString();
        }
    }
}
