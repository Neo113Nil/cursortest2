package ru.ok.android.webrtc.stat.utils;

import androidx.annotation.NonNull;
import java.util.Arrays;
import xsna.vu5;

/* loaded from: classes9.dex */
public class SpikeFilter {
    public final long[] a = new long[4];
    public int b = 0;
    public boolean c = true;
    public long d = 0;

    public long append(long j) {
        if (this.c) {
            this.c = false;
            Arrays.fill(this.a, j);
            this.d = j;
            return j;
        }
        long[] jArr = this.a;
        int length = (this.b + 1) % jArr.length;
        this.b = length;
        jArr[length] = j;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MIN_VALUE;
        long j4 = 0;
        for (long j5 : jArr) {
            if (j2 > j5) {
                j2 = j5;
            }
            if (j3 < j5) {
                j3 = j5;
            }
            j4 += j5;
        }
        long length2 = ((j4 - j2) - j3) / (this.a.length - 2);
        this.d = length2;
        return length2;
    }

    public long getValue() {
        return this.d;
    }

    public void reset() {
        this.c = true;
        this.b = 0;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("SpikeFilter{v=");
        sb.append(Arrays.toString(this.a));
        sb.append(", p=");
        sb.append(this.b);
        sb.append(", reset=");
        sb.append(this.c);
        sb.append(", value=");
        return vu5.a('}', this.d, sb);
    }
}
