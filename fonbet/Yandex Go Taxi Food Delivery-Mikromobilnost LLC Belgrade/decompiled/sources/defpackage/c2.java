package defpackage;

/* loaded from: classes4.dex */
public class c2 {
    public static final a2[] d = new a2[0];
    public a2[] a;
    public int b;
    public boolean c;

    public c2(int i) {
        if (i < 0) {
            ny61.g("'initialCapacity' must not be negative");
            throw null;
        }
        this.a = i == 0 ? d : new a2[i];
        this.b = 0;
        this.c = false;
    }

    public static a2[] b(a2[] a2VarArr) {
        return a2VarArr.length < 1 ? d : (a2[]) a2VarArr.clone();
    }

    public final void a(a2 a2Var) {
        if (a2Var == null) {
            ny61.t("'element' cannot be null");
            return;
        }
        a2[] a2VarArr = this.a;
        int length = a2VarArr.length;
        int i = this.b + 1;
        if (this.c | (i > length)) {
            a2[] a2VarArr2 = new a2[Math.max(a2VarArr.length, (i >> 1) + i)];
            System.arraycopy(this.a, 0, a2VarArr2, 0, this.b);
            this.a = a2VarArr2;
            this.c = false;
        }
        this.a[this.b] = a2Var;
        this.b = i;
    }

    public final a2 c(int i) {
        if (i < this.b) {
            return this.a[i];
        }
        throw new ArrayIndexOutOfBoundsException(i + " >= " + this.b);
    }

    public final a2[] d() {
        int i = this.b;
        if (i == 0) {
            return d;
        }
        a2[] a2VarArr = this.a;
        if (a2VarArr.length == i) {
            this.c = true;
            return a2VarArr;
        }
        a2[] a2VarArr2 = new a2[i];
        System.arraycopy(a2VarArr, 0, a2VarArr2, 0, i);
        return a2VarArr2;
    }

    public c2() {
        this(10);
    }
}
