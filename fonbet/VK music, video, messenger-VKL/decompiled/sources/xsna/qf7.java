package xsna;

import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: BlockingAnalyticsEventLogger.java */
/* loaded from: classes.dex */
public final class qf7 implements yx1, ux1 {
    public final i5k b;
    public final Object c;
    public CountDownLatch d;

    public qf7(@NonNull i5k i5kVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.c = new Object();
        this.b = i5kVar;
    }

    @Override // xsna.ux1
    public final void a(@Nullable Bundle bundle) {
        synchronized (this.c) {
            Objects.toString(bundle);
            this.d = new CountDownLatch(1);
            this.b.a(bundle);
            try {
                this.d.await(500, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", null);
            }
            this.d = null;
        }
    }

    @Override // xsna.yx1
    public final void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.d;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
