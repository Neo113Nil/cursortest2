package ru.ok.media.utils;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public class RetryController {
    private static final String TAG = "ru.ok.media.utils.RetryController";
    private boolean aborted;
    private int attempts;
    private int currentRetryDelay;
    private ScheduledFuture<?> future;
    private long lastRetryTime;
    private String logMessage;
    private final int maxRetries;
    private final int maxRetryDelay;
    private final int maxRetryTime;
    private final int minRetryDelay;
    private final float multiplier;
    private long startedTryingTime;

    public RetryController(int i, int i2, int i3) {
        this(i, i, 1.0f, i2, i3);
    }

    public void abort() {
        this.aborted = true;
        ScheduledFuture<?> scheduledFuture = this.future;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        if (r11.attempts <= r11.maxRetries) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean doTry(ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
        if (this.aborted) {
            return true;
        }
        ScheduledFuture<?> scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.startedTryingTime;
        if (j > 0) {
            if (currentTimeMillis - j <= this.maxRetryTime) {
            }
            return false;
        }
        this.startedTryingTime = currentTimeMillis;
        this.lastRetryTime = currentTimeMillis - this.minRetryDelay;
        this.attempts = 0;
        this.currentRetryDelay = this.maxRetryDelay;
        long j2 = currentTimeMillis - this.lastRetryTime;
        int i = this.currentRetryDelay;
        long j3 = i - j2;
        this.lastRetryTime = currentTimeMillis;
        this.currentRetryDelay = (int) ((i * ((long) (this.multiplier * 10000.0f))) / 10000);
        this.attempts++;
        if (j3 <= 0) {
            runnable.run();
        } else {
            try {
                this.future = scheduledExecutorService.schedule(runnable, j3, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException unused) {
            }
        }
        return true;
    }

    public void enableLogging(String str) {
        this.logMessage = str;
    }

    public void resetRetries() {
        this.startedTryingTime = 0L;
        this.attempts = 0;
        this.aborted = false;
    }

    public RetryController(int i, int i2, float f, int i3, int i4) {
        this.maxRetryDelay = i;
        this.minRetryDelay = i2;
        this.multiplier = f;
        this.maxRetries = i3;
        this.maxRetryTime = i4;
    }
}
