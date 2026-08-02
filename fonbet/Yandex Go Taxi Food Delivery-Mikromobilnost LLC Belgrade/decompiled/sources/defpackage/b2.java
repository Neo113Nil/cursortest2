package defpackage;

/* loaded from: classes9.dex */
public class b2 {
    public static final z1[] d = new z1[0];
    public z1[] a;
    public int b;
    public boolean c;

    public b2(int i) {
        if (i < 0) {
            ny61.g("'initialCapacity' must not be negative");
            throw null;
        }
        this.a = i == 0 ? d : new z1[i];
        this.b = 0;
        this.c = false;
    }

    public static z1[] b(z1[] z1VarArr) {
        return z1VarArr.length < 1 ? d : (z1[]) z1VarArr.clone();
    }

    public final void a(z1 z1Var) {
        if (z1Var == null) {
            ny61.t("'element' cannot be null");
            return;
        }
        z1[] z1VarArr = this.a;
        int length = z1VarArr.length;
        int i = this.b + 1;
        if (this.c | (i > length)) {
            z1[] z1VarArr2 = new z1[Math.max(z1VarArr.length, (i >> 1) + i)];
            System.arraycopy(this.a, 0, z1VarArr2, 0, this.b);
            this.a = z1VarArr2;
            this.c = false;
        }
        this.a[this.b] = z1Var;
        this.b = i;
    }

    public final z1 c(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }

    public final z1[] d() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        z1[] z1VarArr = this.a;
        if (z1VarArr.length == i) {
            this.c = true;
            return z1VarArr;
        }
        z1[] z1VarArr2 = new z1[i];
        System.arraycopy(z1VarArr, 0, z1VarArr2, 0, i);
        return z1VarArr2;
    }

    public b2() {
        this(10);
    }
}
