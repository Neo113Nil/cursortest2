package defpackage;

import com.google.protobuf.n;
import defpackage.blu;

/* loaded from: classes8.dex */
public final class alu extends n implements clu {
    public final void c() {
        copyOnWrite();
        ((blu.a) this.instance).clearMax();
    }

    public final void d() {
        copyOnWrite();
        ((blu.a) this.instance).clearMin();
    }

    public final long e() {
        return ((blu.a) this.instance).getMax();
    }

    public final long f() {
        return ((blu.a) this.instance).getMin();
    }

    public final void g(long j) {
        copyOnWrite();
        ((blu.a) this.instance).setCount(j);
    }

    public final void h(long j) {
        copyOnWrite();
        ((blu.a) this.instance).setMax(j);
    }

    public final void i(long j) {
        copyOnWrite();
        ((blu.a) this.instance).setMin(j);
    }
}
