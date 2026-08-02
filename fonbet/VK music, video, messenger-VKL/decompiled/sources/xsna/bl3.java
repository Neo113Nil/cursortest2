package xsna;

import java.util.ArrayList;

/* compiled from: ArrayPool.kt */
/* loaded from: classes3.dex */
public final class bl3<T> {
    public final int a;
    public final izs<Integer, T> b;
    public final wzs<T, Integer, T> c;
    public final ArrayList d = new ArrayList();

    public bl3(int i, izs izsVar, wzs wzsVar) {
        this.a = i;
        this.b = izsVar;
        this.c = wzsVar;
    }

    public final synchronized T a() {
        if (this.d.isEmpty()) {
            return this.b.invoke(16);
        }
        return (T) this.d.remove(r0.size() - 1);
    }

    public final synchronized void b(T t) {
        if (this.d.size() == this.a) {
            return;
        }
        this.d.add(this.c.invoke(t, 16));
    }
}
