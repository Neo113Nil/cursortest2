package ru.ok.tensorflow.util.measure;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class Timer {
    private EMA ema = new EMA(0.05f);
    private long lastStartTime = 0;

    public class Result {
        public final float emaTime;
        public final long lastTime;

        public Result(long j, float f) {
            this.lastTime = j;
            this.emaTime = f;
        }
    }

    public Result end() {
        long currentTimeMillis = System.currentTimeMillis() - this.lastStartTime;
        return new Result(currentTimeMillis, this.ema.ema(currentTimeMillis));
    }

    public Result measureTime(@NonNull Runnable runnable) {
        long currentTimeMillis = System.currentTimeMillis();
        runnable.run();
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        return new Result(currentTimeMillis2, this.ema.ema(currentTimeMillis2));
    }

    public void start() {
        this.lastStartTime = System.currentTimeMillis();
    }
}
