package xsna;

import java.util.function.Supplier;
import xsna.gwe0;

/* compiled from: ArrayBasedStack.java */
/* loaded from: classes8.dex */
public final class nk3 implements e4q {
    public int b;
    public Object c;

    public nk3(int i, Supplier supplier) {
        this.b = i;
        this.c = supplier;
    }

    @Override // xsna.e4q
    public k6o g() {
        return new gwe0(this.b, new gwe0.a((Supplier) this.c));
    }

    @Override // xsna.e4q
    public h300 m() {
        return new gwe0(this.b, new gwe0.a((Supplier) this.c));
    }
}
