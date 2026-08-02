package defpackage;

import java.util.Arrays;

/* loaded from: classes7.dex */
public abstract class oo71 extends jr71 {
    public Object[] a;
    public int b;
    public boolean c;

    public oo71() {
        ela1.a(4, "initialCapacity");
        this.a = new Object[4];
        this.b = 0;
    }

    public final void b(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, jr71.a(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
