package defpackage;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes11.dex */
public final class blo extends xh4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ blo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.xh4
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            default:
                ExecutorService executorService = (ExecutorService) obj;
                try {
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        Log.isLoggable("FirebaseCrashlytics", 3);
                        executorService.shutdownNow();
                        break;
                    }
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    Log.isLoggable("FirebaseCrashlytics", 3);
                    executorService.shutdownNow();
                }
                break;
        }
    }
}
