package defpackage;

/* loaded from: classes7.dex */
public final class hi81 {
    public final xi71 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public int i;
    public boolean j;

    public hi81(xi71 xi71Var, int i, int i2, int i3, int i4, int i5, boolean z) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = xi71Var;
        this.b = rf71.g(i);
        this.c = rf71.g(i2);
        this.d = rf71.g(i3);
        this.e = rf71.g(i4);
        this.f = i5;
        this.i = i5 == -1 ? 13107200 : i5;
        this.g = z;
        this.h = rf71.g(0L);
    }

    public static void a(int i, int i2, String str, String str2) {
        cha1.c(str + " cannot be less than " + str2, i >= i2);
    }

    public final void b(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.i = i;
        this.j = false;
        if (z) {
            xi71 xi71Var = this.a;
            synchronized (xi71Var) {
                xi71Var.b(0);
            }
        }
    }

    public hi81() {
        this(new xi71(), 50000, 50000, 2500, 5000, -1, false);
    }
}
