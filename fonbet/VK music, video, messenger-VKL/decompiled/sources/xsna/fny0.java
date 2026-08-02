package xsna;

import java.util.function.Consumer;

/* compiled from: FixedFrameSendRequest.java */
/* loaded from: classes8.dex */
public final class fny0 implements ejy0 {
    public final ihy0 a;
    public final Consumer<ihy0> b;

    public fny0(ihy0 ihy0Var, Consumer<ihy0> consumer) {
        this.a = ihy0Var;
        this.b = consumer;
    }

    @Override // xsna.ejy0
    public final int a() {
        return this.a.a();
    }

    @Override // xsna.ejy0
    public final Consumer<ihy0> b() {
        return this.b;
    }

    @Override // xsna.ejy0
    public final ihy0 a(int i) {
        return this.a;
    }
}
