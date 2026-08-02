package xsna;

import androidx.annotation.Nullable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* compiled from: ContainerMediaChunk.java */
/* loaded from: classes12.dex */
public final class zej extends rg6 {
    public final int o;
    public final long p;
    public final dcc q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public zej(androidx.media3.datasource.a aVar, evk evkVar, androidx.media3.common.a aVar2, int i, @Nullable Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, dcc dccVar) {
        super(aVar, evkVar, aVar2, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = dccVar;
    }

    @Override // xsna.aq10
    public final long b() {
        return this.j + this.o;
    }

    @Override // xsna.aq10
    public final boolean c() {
        return this.t;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void cancelLoad() {
        this.s = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.d
    public final void load() throws IOException {
        tg6 tg6Var = this.m;
        tg6Var.getClass();
        if (this.r == 0) {
            long j = this.p;
            for (androidx.media3.exoplayer.source.p pVar : tg6Var.b) {
                if (pVar.F != j) {
                    pVar.F = j;
                    pVar.z = true;
                }
            }
            dcc dccVar = this.q;
            long j2 = this.k;
            long j3 = C.TIME_UNSET;
            long j4 = j2 == C.TIME_UNSET ? -9223372036854775807L : j2 - this.p;
            long j5 = this.l;
            if (j5 != C.TIME_UNSET) {
                j3 = j5 - this.p;
            }
            dccVar.c(tg6Var, j4, j3);
        }
        try {
            evk d = this.b.d(this.r);
            vyk0 vyk0Var = this.i;
            tel telVar = new tel(vyk0Var, d.g, vyk0Var.open(d));
            do {
                try {
                    if (this.s) {
                        break;
                    }
                } finally {
                    this.r = telVar.d - this.b.g;
                }
            } while (this.q.b(telVar));
            androidx.media3.common.a aVar = this.d;
            String str = aVar.m;
            int i = aVar.M;
            int i2 = aVar.N;
            if (io20.n(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                rgp0 a = tg6Var.a(4);
                int i3 = i * i2;
                long j6 = (this.h - this.g) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    a.d(0, new xi90());
                    a.a(i4 * j6, 0, 0, 0, null);
                }
            }
            cvk.k(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            cvk.k(this.i);
            throw th;
        }
    }
}
