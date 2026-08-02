package xsna;

import java.util.concurrent.CountDownLatch;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class nzc0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ CountDownLatch c;

    public /* synthetic */ nzc0(CountDownLatch countDownLatch, int i) {
        this.b = i;
        this.c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                this.c.countDown();
                break;
            default:
                this.c.countDown();
                break;
        }
    }
}
