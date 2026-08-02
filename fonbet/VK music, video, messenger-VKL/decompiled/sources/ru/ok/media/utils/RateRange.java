package ru.ok.media.utils;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import xsna.efz;

@Keep
/* loaded from: classes9.dex */
public class RateRange {
    private long maxRate;
    private long minRate;

    public RateRange() {
        this(0L, 0L);
    }

    @NonNull
    public RateRange combineWith(@NonNull RateRange rateRange) {
        this.minRate = Math.min(this.minRate, rateRange.minRate);
        this.maxRate = Math.max(this.maxRate, rateRange.maxRate);
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            RateRange rateRange = (RateRange) obj;
            if (this.minRate == rateRange.minRate && this.maxRate == rateRange.maxRate) {
                return true;
            }
        }
        return false;
    }

    public long getMaxRate() {
        return this.maxRate;
    }

    public long getMinRate() {
        return this.minRate;
    }

    public int hashCode() {
        return (((int) this.minRate) * 31) + ((int) this.maxRate);
    }

    public boolean isRateAccepted(long j) {
        return j >= this.minRate && j <= this.maxRate;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(this.minRate);
        sb.append("..");
        return efz.b(this.maxRate, X3.j.e, sb);
    }

    public int trimValue(int i) {
        return Math.min(Math.max(i, (int) this.minRate), (int) this.maxRate);
    }

    public RateRange(long j, long j2) {
        this.minRate = j;
        this.maxRate = j2;
    }

    public long trimValue(long j) {
        return Math.min(Math.max(j, this.minRate), this.maxRate);
    }

    public RateRange(@NonNull RateRange rateRange) {
        this(rateRange.minRate, rateRange.maxRate);
    }
}
