package xsna;

import java.util.concurrent.ThreadFactory;
import xsna.a1w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lek implements ThreadFactory {
    public final /* synthetic */ int b;

    public /* synthetic */ lek(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        ThreadFactory a;
        switch (this.b) {
            case 0:
                return new Thread(runnable, "vk-cronet-executors-pool");
            default:
                a = asu0.a.a((r3 & 4) != 0 ? 5 : 10, "im-engine-max-priority-thread", (r3 & 2) == 0);
                return ((tru0) a).newThread(new a1w.g(runnable));
        }
    }
}
