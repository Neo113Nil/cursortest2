package xsna;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.Function;
import one.video.calls.sdk_private.aF;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gjq implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gjq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        one.video.calls.sdk_private.w wVar;
        long longValue;
        long longValue2;
        boolean z;
        switch (this.a) {
            case 0:
                return (sv90) ((qcl) this.b).invoke(obj);
            default:
                rky0 rky0Var = (rky0) this.b;
                int intValue = ((Integer) obj).intValue();
                if (!rky0Var.k) {
                    synchronized (rky0Var.d) {
                        rky0Var.j = false;
                    }
                    if (((ConcurrentLinkedQueue) rky0Var.g.b).isEmpty()) {
                        if (!rky0Var.e.a.isEmpty()) {
                            vjy0 vjy0Var = rky0Var.n;
                            zjy0 zjy0Var = rky0Var.c;
                            synchronized (vjy0Var) {
                                longValue = ((Long) vjy0Var.i.get(Integer.valueOf(zjy0Var.a))).longValue() + vjy0Var.a(zjy0Var);
                            }
                            int i = rky0Var.e.d.get();
                            long j = rky0Var.h;
                            if (longValue > j || i == 0) {
                                zjy0 zjy0Var2 = rky0Var.c;
                                zjy0Var2.getClass();
                                int min = Integer.min(i, (intValue - new one.video.calls.sdk_private.w(zjy0Var2.a, j, new byte[0], 0, 0, false, 0).h) - 1);
                                vjy0 vjy0Var2 = rky0Var.n;
                                zjy0 zjy0Var3 = rky0Var.c;
                                long j2 = rky0Var.h + min;
                                vjy0Var2.getClass();
                                int i2 = zjy0Var3.a;
                                synchronized (vjy0Var2) {
                                    long a = vjy0Var2.a(zjy0Var3);
                                    long longValue3 = j2 - ((Long) vjy0Var2.i.get(Integer.valueOf(i2))).longValue();
                                    long min2 = Long.min(longValue3, a);
                                    if (longValue3 < 0) {
                                        throw new IllegalArgumentException();
                                    }
                                    vjy0Var2.g += min2;
                                    longValue2 = ((Long) vjy0Var2.i.get(Integer.valueOf(i2))).longValue() + min2;
                                    vjy0Var2.i.put(Integer.valueOf(i2), Long.valueOf(longValue2));
                                }
                                int min3 = Integer.min((int) (longValue2 - rky0Var.h), min);
                                bky0 bky0Var = rky0Var.e;
                                zjy0 zjy0Var4 = rky0Var.c;
                                zjy0Var4.getClass();
                                int i3 = zjy0Var4.a;
                                long j3 = rky0Var.h;
                                ReentrantLock reentrantLock = bky0Var.e;
                                ConcurrentLinkedDeque concurrentLinkedDeque = bky0Var.a;
                                byte[] bArr = new byte[min3];
                                int i4 = 0;
                                while (i4 < min3 && !concurrentLinkedDeque.isEmpty()) {
                                    ByteBuffer byteBuffer = (ByteBuffer) concurrentLinkedDeque.peek();
                                    int i5 = min3 - i4;
                                    if (byteBuffer.remaining() <= i5) {
                                        int remaining = byteBuffer.remaining() + i4;
                                        byteBuffer.get(bArr, i4, byteBuffer.remaining());
                                        concurrentLinkedDeque.poll();
                                        i4 = remaining;
                                    } else {
                                        byteBuffer.get(bArr, i4, i5);
                                        i4 = min3;
                                    }
                                }
                                if (concurrentLinkedDeque.isEmpty() || concurrentLinkedDeque.peek() != bky0Var.b) {
                                    z = false;
                                } else {
                                    concurrentLinkedDeque.poll();
                                    z = true;
                                }
                                if (i4 != 0 || z) {
                                    bky0Var.d.getAndAdd(i4 * (-1));
                                    reentrantLock.lock();
                                    try {
                                        bky0Var.f.signal();
                                        if (i4 < min3) {
                                            bArr = Arrays.copyOfRange(bArr, 0, i4);
                                        }
                                        wVar = new one.video.calls.sdk_private.w(i3, j3, bArr, 0, bArr.length, z, 0);
                                    } finally {
                                        reentrantLock.unlock();
                                    }
                                } else {
                                    wVar = null;
                                }
                                if (wVar != null) {
                                    rky0Var.h += wVar.e;
                                }
                                if (wVar != null && wVar.g) {
                                    rky0Var.t();
                                }
                            } else if (j != rky0Var.m) {
                                rky0Var.m = j;
                                Objects.toString(rky0Var.c);
                                rky0Var.c.c.g(new pky0(rky0Var), alk.e(r0.a) + 9, aF.d, new qky0(rky0Var), true);
                            }
                        }
                        wVar = null;
                    } else {
                        g6b g6bVar = rky0Var.g;
                        if (((ConcurrentLinkedQueue) g6bVar.b).isEmpty()) {
                            wVar = null;
                        } else {
                            wVar = (one.video.calls.sdk_private.w) ((ConcurrentLinkedQueue) g6bVar.b).poll();
                            int i6 = wVar.h;
                            if (i6 > intValue) {
                                one.video.calls.sdk_private.w wVar2 = new one.video.calls.sdk_private.w(wVar.c, wVar.d, wVar.f, 0, wVar.e - (i6 - intValue), false, 0);
                                int i7 = wVar.c;
                                long j4 = wVar.d;
                                int i8 = wVar2.e;
                                ((ConcurrentLinkedQueue) g6bVar.b).add(new one.video.calls.sdk_private.w(i7, j4 + i8, wVar.f, i8, wVar.e - i8, wVar.g, 0));
                                wVar = wVar2;
                            }
                        }
                        sp spVar = rky0Var.c.e;
                        Objects.toString(wVar);
                    }
                    if (wVar == null) {
                        return wVar;
                    }
                    if (rky0Var.e.a.isEmpty() && ((ConcurrentLinkedQueue) rky0Var.g.b).isEmpty()) {
                        return wVar;
                    }
                    synchronized (rky0Var.d) {
                        rky0Var.j = true;
                    }
                    rky0Var.c.c.g(new gjq(rky0Var, 1), 20, rky0Var.s(), new oky0(rky0Var), true);
                    return wVar;
                }
                return null;
        }
    }
}
