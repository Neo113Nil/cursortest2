package ru.ok.tensorflow.tflite;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public final class DelegateManager {
    private static final String TAG = "DelegateManager";
    private final Context context;
    private final ExecutorService executorService = Executors.newFixedThreadPool(1);
    private final AtomicBoolean isReleased = new AtomicBoolean();

    public DelegateManager(@NonNull Context context) {
        this.context = context;
    }

    @NonNull
    public Context getContext() {
        return this.context;
    }

    public void release() {
        if (this.isReleased.compareAndSet(false, true)) {
            this.executorService.shutdown();
            try {
                if (this.executorService.awaitTermination(10L, TimeUnit.SECONDS)) {
                    return;
                }
                Log.e(TAG, "failed to await termination");
            } catch (InterruptedException unused) {
                Log.e(TAG, "waiting for termination was interrupted");
                Thread.currentThread().interrupt();
            }
        }
    }

    public void submit(@NonNull Runnable runnable) {
        if (this.isReleased.get()) {
            return;
        }
        this.executorService.submit(runnable);
    }
}
