package xsna;

import io.opentelemetry.sdk.common.export.MemoryMode;
import java.util.Collections;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: DoubleBase2ExponentialHistogramBuckets.java */
/* loaded from: classes8.dex */
public final class a6o implements naq {
    public final MemoryMode a;
    public bk0 b;
    public int c;
    public i46 d;
    public long e;
    public bk0 f;

    public a6o(int i, int i2, MemoryMode memoryMode) {
        this.a = memoryMode;
        this.b = new bk0(i2);
        this.c = i;
        this.d = i46.b(i);
        this.e = 0L;
    }

    public final void a(int i) {
        bk0 bk0Var;
        if (i == 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException(tgw.b(i, "Cannot downscale by negative amount. Was given ", "."));
        }
        bk0 bk0Var2 = this.b;
        if (bk0Var2.c != Integer.MIN_VALUE) {
            MemoryMode memoryMode = MemoryMode.IMMUTABLE_DATA;
            MemoryMode memoryMode2 = this.a;
            if (memoryMode2 == memoryMode) {
                bk0Var = new bk0(bk0Var2);
            } else {
                if (this.f == null) {
                    this.f = new bk0(bk0Var2);
                }
                bk0Var = this.f;
            }
            bk0Var.a();
            int i2 = this.b.b;
            while (true) {
                bk0 bk0Var3 = this.b;
                if (i2 <= bk0Var3.a) {
                    long b = bk0Var3.b(i2);
                    if (b > 0 && !bk0Var.c(i2 >> i, b)) {
                        throw new IllegalStateException("Failed to create new downscaled buckets.");
                    }
                    i2++;
                } else if (memoryMode2 == MemoryMode.REUSABLE_DATA) {
                    this.b = bk0Var;
                    this.f = bk0Var3;
                } else {
                    this.b = bk0Var;
                }
            }
        }
        int i3 = this.c - i;
        this.c = i3;
        this.d = i46.b(i3);
    }

    public final boolean b(double d) {
        if (d == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            throw new IllegalStateException("Illegal attempted recording of zero at bucket level.");
        }
        boolean c = this.b.c(this.d.a(d), 1L);
        if (c) {
            this.e++;
        }
        return c;
    }

    @Override // xsna.naq
    public final int c() {
        return this.c;
    }

    @Override // xsna.naq
    public final List<Long> d() {
        bk0 bk0Var = this.b;
        if (bk0Var.c == Integer.MIN_VALUE) {
            return Collections.EMPTY_LIST;
        }
        int i = (bk0Var.a - bk0Var.b) + 1;
        long[] jArr = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            bk0 bk0Var2 = this.b;
            jArr[i2] = bk0Var2.b(bk0Var2.b + i2);
        }
        return new hbd0(jArr);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a6o)) {
            return false;
        }
        a6o a6oVar = (a6o) obj;
        if (this.c == a6oVar.c && this.e == a6oVar.e) {
            int min = Math.min(this.b.b, a6oVar.b.b);
            if (min == Integer.MIN_VALUE) {
                min = Math.max(this.b.b, a6oVar.b.b);
            }
            int max = Math.max(this.b.a, a6oVar.b.a);
            while (min <= max) {
                if (this.b.b(min) == a6oVar.b.b(min)) {
                    min++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // xsna.naq
    public final int getOffset() {
        bk0 bk0Var = this.b;
        if (bk0Var.c == Integer.MIN_VALUE) {
            return 0;
        }
        return bk0Var.b;
    }

    @Override // xsna.naq
    public final long getTotalCount() {
        return this.e;
    }

    public final int hashCode() {
        int i = this.b.b;
        int i2 = 1000003;
        while (true) {
            bk0 bk0Var = this.b;
            if (i > bk0Var.a) {
                return this.c ^ i2;
            }
            long b = bk0Var.b(i);
            if (b != 0) {
                i2 = ((int) (((i2 ^ i) * 1000003) ^ b)) * 1000003;
            }
            i++;
        }
    }

    public final String toString() {
        return "DoubleExponentialHistogramBuckets{scale: " + this.c + ", offset: " + getOffset() + ", counts: " + this.b + " }";
    }

    public a6o(a6o a6oVar) {
        this.b = new bk0(a6oVar.b);
        this.c = a6oVar.c;
        this.d = a6oVar.d;
        this.e = a6oVar.e;
        this.a = a6oVar.a;
        this.f = a6oVar.f;
    }
}
