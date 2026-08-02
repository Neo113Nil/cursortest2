package xsna;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: DefaultAudioMsgPlayer.kt */
/* loaded from: classes15.dex */
public final class zal implements Runnable {
    public final /* synthetic */ pzc0 b;
    public final /* synthetic */ lza0 c;
    public final /* synthetic */ fv10 d;
    public final /* synthetic */ a8r e;
    public final /* synthetic */ xal f;

    public zal(pzc0 pzc0Var, lza0 lza0Var, fv10 fv10Var, a8r a8rVar, xal xalVar) {
        this.b = pzc0Var;
        this.c = lza0Var;
        this.d = fv10Var;
        this.e = a8rVar;
        this.f = xalVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CountDownLatch countDownLatch;
        pzc0 pzc0Var = this.b;
        lza0 lza0Var = this.c;
        synchronized (pzc0Var) {
            if (pzc0Var.f) {
                countDownLatch = new CountDownLatch(0);
            } else {
                pzc0Var.g(lza0Var);
                pzc0Var.f = true;
                countDownLatch = new CountDownLatch(1);
                ((ExecutorService) pzc0Var.d.getValue()).submit(new nzc0(countDownLatch, 0));
                ((ExecutorService) pzc0Var.d.getValue()).shutdown();
            }
        }
        countDownLatch.await();
        this.d.e(this.c);
        this.e.b();
        this.f.c();
    }
}
