package xsna;

import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: FrameSupplierSendRequest.java */
/* loaded from: classes8.dex */
public final class gny0 implements ejy0 {
    public int a;
    public Function<Integer, ihy0> b;
    public Consumer<ihy0> c;

    @Override // xsna.ejy0
    public final int a() {
        return this.a;
    }

    @Override // xsna.ejy0
    public final Consumer<ihy0> b() {
        return this.c;
    }

    @Override // xsna.ejy0
    public final ihy0 a(int i) {
        return this.b.apply(Integer.valueOf(i));
    }
}
