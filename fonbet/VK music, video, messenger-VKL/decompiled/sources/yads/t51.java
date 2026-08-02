package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class t51 {
    public Object[] a;
    public int b = 0;

    public t51(int i) {
        this.a = new Object[i * 2];
    }

    public final yn2 a() {
        return yn2.a(this.b, this.a);
    }

    public final void a(int i) {
        int i2 = i * 2;
        Object[] objArr = this.a;
        if (i2 > objArr.length) {
            this.a = Arrays.copyOf(objArr, l51.a(objArr.length, i2));
        }
    }

    public final t51 a(Object obj, Object obj2) {
        a(this.b + 1);
        kx.a(obj, obj2);
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = i * 2;
        objArr[i2] = obj;
        objArr[i2 + 1] = obj2;
        this.b = i + 1;
        return this;
    }
}
