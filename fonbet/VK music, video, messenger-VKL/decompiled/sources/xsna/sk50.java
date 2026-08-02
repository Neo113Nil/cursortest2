package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;
import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class sk50 implements ThreadFactory {
    public final /* synthetic */ int b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.b) {
            case 0:
                return new un50(runnable, un50.c.incrementAndGet(), ThreadType.UTIL);
            default:
                Thread thread = new Thread(runnable, "AudioMsgPlayer:Prefetch");
                thread.setPriority(1);
                return thread;
        }
    }
}
