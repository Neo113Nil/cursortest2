package xsna;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class wer0 implements ThreadFactory {
    public final /* synthetic */ int b;

    public /* synthetic */ wer0(int i) {
        this.b = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.b) {
            case 0:
                return new Thread(runnable, lhg.a(xer0.a.getAndIncrement(), "vk-api-network-thread-"));
            default:
                return new Thread(runnable, "reef");
        }
    }
}
