package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final /* synthetic */ class mo31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kcz0 b;

    public /* synthetic */ mo31(kcz0 kcz0Var, int i) {
        this.a = i;
        this.b = kcz0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (((AtomicInteger) this.b.b).decrementAndGet() >= 0) {
                    sgb1.g(3, "VideoUsageControl");
                    break;
                } else {
                    sgb1.g(5, "VideoUsageControl");
                    break;
                }
            default:
                ((AtomicInteger) this.b.b).incrementAndGet();
                sgb1.g(3, "VideoUsageControl");
                break;
        }
    }
}
