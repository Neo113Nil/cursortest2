package xsna;

import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import xsna.tsp0;

/* compiled from: Id3Reader.java */
/* loaded from: classes12.dex */
public final class csv implements zap {
    public rgp0 b;
    public boolean c;
    public int e;
    public int f;
    public final xi90 a = new xi90(10);
    public long d = C.TIME_UNSET;

    @Override // xsna.zap
    public final void a(xi90 xi90Var) {
        this.b.getClass();
        if (this.c) {
            int a = xi90Var.a();
            int i = this.f;
            if (i < 10) {
                int min = Math.min(a, 10 - i);
                byte[] bArr = xi90Var.a;
                int i2 = xi90Var.b;
                xi90 xi90Var2 = this.a;
                System.arraycopy(bArr, i2, xi90Var2.a, this.f, min);
                if (this.f + min == 10) {
                    xi90Var2.P(0);
                    if (73 != xi90Var2.C() || 68 != xi90Var2.C() || 51 != xi90Var2.C()) {
                        ahn.F("Discarding invalid ID3 tag");
                        this.c = false;
                        return;
                    } else {
                        xi90Var2.Q(3);
                        this.e = xi90Var2.B() + 10;
                    }
                }
            }
            int min2 = Math.min(a, this.e - this.f);
            this.b.d(min2, xi90Var);
            this.f += min2;
        }
    }

    @Override // xsna.zap
    public final void b(rgq rgqVar, tsp0.c cVar) {
        cVar.a();
        cVar.b();
        rgp0 track = rgqVar.track(cVar.d, 5);
        this.b = track;
        a.C0043a c0043a = new a.C0043a();
        cVar.b();
        c0043a.a = cVar.e;
        c0043a.l = io20.q("video/mp2t");
        c0043a.m = io20.q(MimeTypes.APPLICATION_ID3);
        zjh0.d(c0043a, track);
    }

    @Override // xsna.zap
    public final void c(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        this.d = j;
        this.e = 0;
        this.f = 0;
    }

    @Override // xsna.zap
    public final void d(boolean z) {
        int i;
        this.b.getClass();
        if (this.c && (i = this.e) != 0 && this.f == i) {
            fxc0.z(this.d != C.TIME_UNSET);
            this.b.a(this.d, 1, this.e, 0, null);
            this.c = false;
        }
    }

    @Override // xsna.zap
    public final void seek() {
        this.c = false;
        this.d = C.TIME_UNSET;
    }
}
