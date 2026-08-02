package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.n3i0;
import xsna.rnr;

/* compiled from: StreamReader.java */
/* loaded from: classes12.dex */
public abstract class bpm0 {
    public rgp0 b;
    public rgq c;
    public gw70 d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final ew70 a = new ew70();
    public a j = new a();

    /* compiled from: StreamReader.java */
    public static class a {
        public androidx.media3.common.a a;
        public rnr.a b;
    }

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(xi90 xi90Var);

    public abstract boolean c(xi90 xi90Var, long j, a aVar) throws IOException;

    public void d(boolean z) {
        if (z) {
            this.j = new a();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    /* compiled from: StreamReader.java */
    public static final class b implements gw70 {
        @Override // xsna.gw70
        public final long a(qgq qgqVar) {
            return -1L;
        }

        @Override // xsna.gw70
        public final n3i0 createSeekMap() {
            return new n3i0.b(C.TIME_UNSET);
        }

        @Override // xsna.gw70
        public final void startSeek(long j) {
        }
    }
}
