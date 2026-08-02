package xsna;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes13.dex */
public final class t3q extends gx5 {
    public final /* synthetic */ ExecutorService b;

    public t3q(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.b = executorService;
    }

    @Override // xsna.gx5
    public final void a() {
        ExecutorService executorService = this.b;
        try {
            executorService.shutdown();
            if (executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                return;
            }
            executorService.shutdownNow();
        } catch (InterruptedException unused) {
            Locale locale = Locale.US;
            executorService.shutdownNow();
        }
    }
}
