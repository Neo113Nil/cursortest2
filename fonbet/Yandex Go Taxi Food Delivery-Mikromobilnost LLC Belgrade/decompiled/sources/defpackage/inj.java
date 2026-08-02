package defpackage;

import java.util.Arrays;

/* loaded from: classes9.dex */
public final class inj {
    public Object[] a;
    public int b;
    public int c;

    public inj(int i) {
        this.a = new Object[10];
        this.b = 10;
    }

    public final void a(Object obj) {
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

    public inj() {
        this(0);
    }
}
