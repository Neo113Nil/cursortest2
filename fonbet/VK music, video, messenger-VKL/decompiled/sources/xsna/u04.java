package xsna;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: AtomicLongDoubleAdder.java */
/* loaded from: classes8.dex */
public final class u04 implements w5o, ik6 {
    public final /* synthetic */ int b;
    public final Object c;

    public u04(hdc0 hdc0Var) {
        this.b = 3;
        this.c = hdc0Var;
    }

    @Override // xsna.w5o
    public void add(double d) {
        long j;
        AtomicLong atomicLong = (AtomicLong) this.c;
        do {
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, Double.doubleToLongBits(Double.longBitsToDouble(j) + d)));
    }

    @Override // xsna.w5o
    public double b() {
        long j;
        AtomicLong atomicLong = (AtomicLong) this.c;
        do {
            j = atomicLong.get();
        } while (!atomicLong.compareAndSet(j, 0L));
        return Double.longBitsToDouble(j);
    }

    @Override // xsna.cc6
    public void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public void onPause() {
        throw null;
    }

    @Override // xsna.cc6
    public void onResume() {
        throw null;
    }

    @Override // xsna.w5o
    public double sum() {
        return Double.longBitsToDouble(((AtomicLong) this.c).get());
    }

    public String toString() {
        switch (this.b) {
            case 0:
                return Double.toString(sum());
            default:
                return super.toString();
        }
    }

    public u04(int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = hqu0.b();
                break;
            case 2:
                this.c = new bpn0(new ee4(20));
                break;
            default:
                this.c = new AtomicLong();
                break;
        }
    }
}
