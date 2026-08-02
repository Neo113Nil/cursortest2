package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final /* synthetic */ class imh implements smh, a911 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ imh(boolean z, Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.a = z;
        this.w = obj3;
    }

    @Override // defpackage.a911
    public void c(Exception exc) {
        h3j0 h3j0Var = (h3j0) this.b;
        atx0 atx0Var = (atx0) this.c;
        h3f h3fVar = (h3f) this.w;
        if (exc != null) {
            atx0Var.b(exc);
            return;
        }
        if (this.a) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new xmf0(14, h3j0Var, countDownLatch)).start();
            ExecutorService executorService = ax21.a;
            boolean z2 = false;
            try {
                long j = 2000000000;
                long nanoTime = System.nanoTime() + 2000000000;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(j, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        j = nanoTime - System.nanoTime();
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        atx0Var.c(h3fVar);
    }

    @Override // defpackage.smh
    public List d(int i, xzz0 xzz0Var, int[] iArr) {
        vmh vmhVar = (vmh) this.b;
        omh omhVar = (omh) this.c;
        int[] iArr2 = (int[]) this.w;
        jmh jmhVar = new jmh(vmhVar, omhVar);
        int i2 = iArr2[i];
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i3 = 0; i3 < xzz0Var.a; i3++) {
            aVar.a(new kmh(i, xzz0Var, i3, omhVar, iArr[i3], this.a, jmhVar, i2));
        }
        return aVar.g();
    }
}
