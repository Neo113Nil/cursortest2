package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;
import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class rk50 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new un50(runnable, un50.c.incrementAndGet(), ThreadType.STATE);
    }
}
