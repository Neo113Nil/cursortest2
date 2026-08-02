package xsna;

import java.util.Arrays;

/* compiled from: Operations.kt */
/* loaded from: classes11.dex */
public final class at80 extends be {
    public int c;
    public int e;
    public int g;
    public ss80[] b = new ss80[16];
    public int[] d = new int[16];
    public Object[] f = new Object[16];

    /* compiled from: Operations.kt */
    public final class a {
        public int a;
        public int b;
        public int c;

        public a() {
        }

        public final int a(int i) {
            return at80.this.d[this.b + i];
        }

        public final <T> T b(int i) {
            return (T) at80.this.f[this.c + i];
        }
    }

    /* compiled from: Operations.kt */
    @vby
    public static final class b {
        public static final <T> void a(at80 at80Var, int i, T t) {
            at80Var.f[(at80Var.g - at80Var.b[at80Var.c - 1].b) + i] = t;
        }

        public static final <T, U> void b(at80 at80Var, int i, T t, int i2, U u) {
            int i3 = at80Var.g - at80Var.b[at80Var.c - 1].b;
            Object[] objArr = at80Var.f;
            objArr[i + i3] = t;
            objArr[i3 + i2] = u;
        }

        public static final void c(at80 at80Var, Object obj, Object obj2, Object obj3) {
            int i = at80Var.g - at80Var.b[at80Var.c - 1].b;
            Object[] objArr = at80Var.f;
            objArr[i] = obj;
            objArr[i + 1] = obj2;
            objArr[i + 2] = obj3;
        }
    }

    public final void a0(fd3<?> fd3Var, y2k0 y2k0Var, ytf0 ytf0Var, vs80 vs80Var) {
        if (this.c != 0) {
            a aVar = new a();
            while (true) {
                at80 at80Var = at80.this;
                ss80 ss80Var = at80Var.b[aVar.a];
                rgt b2 = ss80Var.b(aVar);
                fd3<?> fd3Var2 = fd3Var;
                y2k0 y2k0Var2 = y2k0Var;
                ytf0 ytf0Var2 = ytf0Var;
                vs80 vs80Var2 = vs80Var;
                try {
                    ss80Var.a(aVar, fd3Var2, y2k0Var2, ytf0Var2, vs80Var2);
                    int i = aVar.a;
                    int i2 = at80Var.c;
                    if (i < i2) {
                        ss80 ss80Var2 = at80Var.b[i];
                        aVar.b += ss80Var2.a;
                        aVar.c += ss80Var2.b;
                        int i3 = i + 1;
                        aVar.a = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        fd3Var = fd3Var2;
                        y2k0Var = y2k0Var2;
                        ytf0Var = ytf0Var2;
                        vs80Var = vs80Var2;
                    } else {
                        break;
                    }
                } finally {
                }
            }
        }
        clear();
    }

    public final void b0(ss80 ss80Var) {
        int i = this.c;
        ss80[] ss80VarArr = this.b;
        if (i == ss80VarArr.length) {
            ss80[] ss80VarArr2 = new ss80[(i > 1024 ? 1024 : i) + i];
            System.arraycopy(ss80VarArr, 0, ss80VarArr2, 0, i);
            this.b = ss80VarArr2;
        }
        int i2 = this.e;
        int i3 = ss80Var.a;
        int i4 = ss80Var.b;
        int i5 = i2 + i3;
        int[] iArr = this.d;
        int length = iArr.length;
        if (i5 > length) {
            int i6 = (length > 1024 ? 1024 : length) + length;
            if (i6 >= i5) {
                i5 = i6;
            }
            int[] iArr2 = new int[i5];
            jw5.e(0, 0, length, iArr, iArr2);
            this.d = iArr2;
        }
        int i7 = this.g + i4;
        Object[] objArr = this.f;
        int length2 = objArr.length;
        if (i7 > length2) {
            int i8 = (length2 <= 1024 ? length2 : 1024) + length2;
            if (i8 >= i7) {
                i7 = i8;
            }
            Object[] objArr2 = new Object[i7];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.f = objArr2;
        }
        ss80[] ss80VarArr3 = this.b;
        int i9 = this.c;
        this.c = i9 + 1;
        ss80VarArr3[i9] = ss80Var;
        this.e += ss80Var.a;
        this.g += i4;
    }

    public final void clear() {
        this.c = 0;
        this.e = 0;
        Arrays.fill(this.f, 0, this.g, (Object) null);
        this.g = 0;
    }

    public final boolean isEmpty() {
        return this.c == 0;
    }
}
