package yads;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes10.dex */
public class yx2 implements zx2 {
    public final long a;
    public final xx2 b;

    public yx2() {
        this(C.TIME_UNSET, 0L);
    }

    @Override // yads.zx2
    public final boolean b() {
        return false;
    }

    @Override // yads.zx2
    public final long c() {
        return this.a;
    }

    public yx2(long j, long j2) {
        this.a = j;
        this.b = new xx2(j2 == 0 ? by2.c : new by2(0L, j2));
    }

    @Override // yads.zx2
    public final xx2 b(long j) {
        return this.b;
    }
}
