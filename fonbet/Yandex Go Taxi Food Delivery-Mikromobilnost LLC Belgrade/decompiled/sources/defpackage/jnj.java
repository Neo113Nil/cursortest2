package defpackage;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class jnj {
    public Object[] a;
    public int b;
    public int c;

    public jnj(int i) {
        this.a = new Object[i];
        this.b = i;
    }

    public final Object a() {
        Object[] objArr = this.a;
        int i = this.c - 1;
        this.c = i;
        return objArr[i];
    }

    public final void b(Object obj) {
        int i = this.c;
        int i2 = this.b;
        if (i == i2) {
            int i3 = i2 * 2;
            this.b = i3;
            this.a = Arrays.copyOf(this.a, i3);
        }
        Object[] objArr = this.a;
        int i4 = this.c;
        this.c = i4 + 1;
        objArr[i4] = obj;
    }

    public jnj() {
        this(10);
    }
}
