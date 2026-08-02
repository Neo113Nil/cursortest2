package ru.ok.gl.util;

import androidx.annotation.NonNull;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class ScaledTime {
    public final TimeUnit scale;
    public final long value;

    public ScaledTime(long j, @NonNull TimeUnit timeUnit) {
        this.value = j;
        this.scale = timeUnit;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ScaledTime.class == obj.getClass()) {
            ScaledTime scaledTime = (ScaledTime) obj;
            if ((this.value == scaledTime.value && this.scale == scaledTime.scale) || toNanos() == scaledTime.toNanos()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long nanos = toNanos();
        return (int) (nanos ^ (nanos >>> 32));
    }

    public ScaledTime multiply(float f) {
        return new ScaledTime((long) (f * this.value), this.scale);
    }

    public void safeSleep() {
        long j = this.value;
        if (j > 0) {
            try {
                this.scale.sleep(j);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public long toDays() {
        return this.scale.toDays(this.value);
    }

    public long toHours() {
        return this.scale.toHours(this.value);
    }

    public long toMicros() {
        return this.scale.toMicros(this.value);
    }

    public long toMillis() {
        return this.scale.toMillis(this.value);
    }

    public long toMinutes() {
        return this.scale.toMinutes(this.value);
    }

    public long toNanos() {
        return this.scale.toNanos(this.value);
    }

    public long toSeconds() {
        return this.scale.toSeconds(this.value);
    }

    public long toDays(float f) {
        return (long) (f * toDays());
    }

    public long toHours(float f) {
        return (long) (f * toHours());
    }

    public long toMicros(float f) {
        return (long) (f * toMicros());
    }

    public long toMillis(float f) {
        return (long) (f * toMillis());
    }

    public long toMinutes(float f) {
        return (long) (f * toMinutes());
    }

    public long toNanos(float f) {
        return (long) (f * toNanos());
    }

    public long toSeconds(float f) {
        return (long) (f * toSeconds());
    }
}
