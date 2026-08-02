package defpackage;

import java.util.Arrays;

/* loaded from: classes11.dex */
public abstract class be91 extends cvw {
    public Object[] f;
    public int g;
    public boolean h;

    public be91(int i) {
        if (i < 0) {
            ny61.g(oyr.i(i, "initialCapacity cannot be negative but was: "));
            throw null;
        }
        this.f = new Object[i];
        this.g = 0;
    }

    public final void m0(Object obj) {
        obj.getClass();
        n0(1);
        Object[] objArr = this.f;
        int i = this.g;
        this.g = i + 1;
        objArr[i] = obj;
    }

    public final void n0(int i) {
        int length = this.f.length;
        int l0 = cvw.l0(length, this.g + i);
        if (l0 > length || this.h) {
            this.f = Arrays.copyOf(this.f, l0);
            this.h = false;
        }
    }
}
