package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public final class zd0 implements tg1 {
    public final ib0 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public int j;
    public boolean k;

    public zd0() {
        this(new ib0(), 50000, 50000, 2500, 5000, -1, false);
    }

    public static void a(int i, int i2, String str, String str2) {
        ni.a(str + " cannot be less than " + str2, i >= i2);
    }

    public final boolean b() {
        return this.i;
    }

    public zd0(ib0 ib0Var, int i, int i2, int i3, int i4, int i5, boolean z) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.a = ib0Var;
        this.b = mc3.a(i);
        this.c = mc3.a(i2);
        this.d = mc3.a(i3);
        this.e = mc3.a(i4);
        this.f = i5;
        this.j = i5 == -1 ? C.DEFAULT_VIDEO_BUFFER_SIZE : i5;
        this.g = z;
        this.h = mc3.a(0);
        this.i = false;
    }

    public final long a() {
        return this.h;
    }

    public final void a(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.j = i;
        this.k = false;
        if (z) {
            ib0 ib0Var = this.a;
            synchronized (ib0Var) {
                if (ib0Var.a) {
                    ib0Var.a(0);
                }
            }
        }
    }
}
