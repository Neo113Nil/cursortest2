package xsna;

import java.util.concurrent.CountDownLatch;

/* compiled from: CancellationSignal.kt */
/* loaded from: classes5.dex */
public interface sq9 {
    CountDownLatch cancel();

    boolean isCancelled();
}
