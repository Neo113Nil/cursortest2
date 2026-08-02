package xsna;

import java.util.LinkedList;

/* compiled from: Bucket.java */
/* loaded from: classes.dex */
public class pl8<V> {
    public final int a;
    public final int b;
    public final LinkedList c;
    public int d;

    public pl8(int i, int i2, int i3) {
        sex0.f(i > 0);
        sex0.f(i2 >= 0);
        sex0.f(i3 >= 0);
        this.a = i;
        this.b = i2;
        this.c = new LinkedList();
        this.d = i3;
    }

    public V a() {
        return (V) this.c.poll();
    }
}
