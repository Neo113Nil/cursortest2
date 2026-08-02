package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public abstract class k51 extends l51 {
    public Object[] a;
    public int b;
    public boolean c;

    public k51() {
        kx.a(4, "initialCapacity");
        this.a = new Object[4];
        this.b = 0;
    }

    public final void a(int i) {
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, l51.a(objArr.length, i));
            this.c = false;
        } else if (this.c) {
            this.a = (Object[]) objArr.clone();
            this.c = false;
        }
    }
}
