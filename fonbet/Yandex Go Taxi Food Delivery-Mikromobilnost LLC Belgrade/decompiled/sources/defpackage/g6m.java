package defpackage;

import ru.yandex.taxi.utils.CircularFifoQueue;

/* loaded from: classes7.dex */
public final class g6m {
    public final CircularFifoQueue a;

    public g6m(int i) {
        switch (i) {
            case 1:
                this.a = new CircularFifoQueue(6);
                break;
            default:
                this.a = new CircularFifoQueue(8);
                break;
        }
    }

    public double a() {
        CircularFifoQueue circularFifoQueue = this.a;
        circularFifoQueue.getClass();
        bvb bvbVar = new bvb(circularFifoQueue);
        double d = 0.0d;
        while (bvbVar.hasNext()) {
            d += ((Double) bvbVar.next()).doubleValue();
        }
        return d / circularFifoQueue.size();
    }

    public long b() {
        CircularFifoQueue circularFifoQueue = this.a;
        circularFifoQueue.getClass();
        bvb bvbVar = new bvb(circularFifoQueue);
        long j = 0;
        while (bvbVar.hasNext()) {
            j += ((Long) bvbVar.next()).longValue();
        }
        return j / circularFifoQueue.size();
    }

    public void c(double d) {
        this.a.add(Double.valueOf(d));
    }

    public long d() {
        long b = b();
        long b2 = b();
        CircularFifoQueue circularFifoQueue = this.a;
        circularFifoQueue.getClass();
        bvb bvbVar = new bvb(circularFifoQueue);
        long j = 0;
        while (bvbVar.hasNext()) {
            long longValue = ((Long) bvbVar.next()).longValue() - b2;
            j += longValue * longValue;
        }
        return b + ((long) Math.sqrt(j / circularFifoQueue.size()));
    }
}
