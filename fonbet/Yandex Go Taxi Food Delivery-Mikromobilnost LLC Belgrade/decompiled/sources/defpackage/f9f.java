package defpackage;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public interface f9f {
    boolean isAvailableOnDevice();

    void onCreateCredential(Context context, f4f f4fVar, CancellationSignal cancellationSignal, Executor executor, c9f c9fVar);

    void onGetCredential(Context context, q5t q5tVar, CancellationSignal cancellationSignal, Executor executor, c9f c9fVar);
}
