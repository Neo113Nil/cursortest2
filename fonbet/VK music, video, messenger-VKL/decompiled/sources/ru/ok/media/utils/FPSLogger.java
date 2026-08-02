package ru.ok.media.utils;

/* loaded from: classes9.dex */
public class FPSLogger {
    private long time = System.currentTimeMillis();
    private int count = 0;

    public void tick() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - 1000 >= this.time) {
            this.count = 0;
            this.time = currentTimeMillis;
        }
        this.count++;
    }
}
