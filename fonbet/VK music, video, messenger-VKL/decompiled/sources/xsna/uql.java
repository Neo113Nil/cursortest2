package xsna;

import java.util.concurrent.CountDownLatch;
import xsna.crl;
import xsna.jms0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class uql implements jms0.b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uql(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.jms0.b
    public final void run() {
        switch (this.a) {
            case 0:
                ((crl) this.b).j((crl.c) this.c, true);
                return;
            default:
                jms0 jms0Var = (jms0) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                synchronized (jms0Var.e) {
                    jms0Var.g = false;
                }
                countDownLatch.countDown();
                return;
        }
    }
}
