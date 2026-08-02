package xsna;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class avk implements zhn0 {
    @Override // xsna.zhn0
    public final Object get() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return newSingleThreadExecutor instanceof jhz ? (jhz) newSingleThreadExecutor : newSingleThreadExecutor instanceof ScheduledExecutorService ? new u830((ScheduledExecutorService) newSingleThreadExecutor) : new t830(newSingleThreadExecutor);
    }
}
