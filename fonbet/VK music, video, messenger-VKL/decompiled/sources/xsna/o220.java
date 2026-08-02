package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: MemoryCacheParams.kt */
/* loaded from: classes.dex */
public final class o220 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;

    public o220(int i, long j, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = j;
    }

    public o220(int i, int i2) {
        this(i, TimeUnit.MINUTES.toMillis(5L), 256, Integer.MAX_VALUE, i2, Integer.MAX_VALUE);
    }
}
