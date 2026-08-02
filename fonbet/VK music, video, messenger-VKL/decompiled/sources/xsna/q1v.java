package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import xsna.a1n0;
import xsna.n3i0;

/* compiled from: HeicMotionPhotoExtractor.java */
/* loaded from: classes12.dex */
public final class q1v implements pgq {
    public rgq b;
    public qgq c;
    public iqk0 d;

    @Nullable
    public uf30 e;
    public int g;
    public long h;
    public int i;
    public final xi90 a = new xi90(16);
    public long j = -1;
    public int f = 0;

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        while (true) {
            int i = this.f;
            if (i == 0) {
                int i2 = this.i;
                xi90 xi90Var = this.a;
                if (i2 == 0) {
                    if (!qgqVar.readFully(xi90Var.a, 0, 8, true)) {
                        rgq rgqVar = this.b;
                        rgqVar.getClass();
                        rgqVar.endTracks();
                        this.b.f(new n3i0.b(C.TIME_UNSET));
                        this.f = 4;
                        return -1;
                    }
                    this.i = 8;
                    xi90Var.P(0);
                    this.h = xi90Var.E();
                    this.g = xi90Var.p();
                }
                if (this.h == 1) {
                    qgqVar.readFully(xi90Var.a, 8, 8);
                    this.i += 8;
                    this.h = xi90Var.I();
                }
                if (this.g == 1836086884) {
                    long position = qgqVar.getPosition();
                    this.j = position;
                    long j = this.i;
                    ib30 ib30Var = new ib30(0L, position - j, C.TIME_UNSET, position, this.h - j);
                    rgq rgqVar2 = this.b;
                    rgqVar2.getClass();
                    rgp0 track = rgqVar2.track(1024, 4);
                    a.C0043a c0043a = new a.C0043a();
                    c0043a.l = io20.q("image/heic");
                    c0043a.k = new fi20(ib30Var);
                    zjh0.d(c0043a, track);
                    this.f = 2;
                } else {
                    this.f = 1;
                }
            } else if (i == 1) {
                qgqVar.skipFully((int) (this.h - this.i));
                this.i = 0;
                this.f = 0;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            return -1;
                        }
                        throw new IllegalStateException();
                    }
                    if (this.d == null || qgqVar != this.c) {
                        this.c = qgqVar;
                        this.d = new iqk0(qgqVar, this.j);
                    }
                    uf30 uf30Var = this.e;
                    uf30Var.getClass();
                    int b = uf30Var.b(this.d, pzb0Var);
                    if (b == 1) {
                        pzb0Var.a += this.j;
                    }
                    return b;
                }
                if (this.e == null) {
                    this.e = new uf30(a1n0.a.a, 8);
                }
                iqk0 iqk0Var = new iqk0(qgqVar, this.j);
                this.d = iqk0Var;
                if (this.e.d(iqk0Var)) {
                    uf30 uf30Var2 = this.e;
                    long j2 = this.j;
                    rgq rgqVar3 = this.b;
                    rgqVar3.getClass();
                    uf30Var2.e(new jqk0(j2, rgqVar3));
                    this.f = 3;
                } else {
                    rgq rgqVar4 = this.b;
                    rgqVar4.getClass();
                    rgqVar4.endTracks();
                    this.b.f(new n3i0.b(C.TIME_UNSET));
                    this.f = 4;
                }
            }
        }
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        return s1v.t((tel) qgqVar, true);
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.b = rgqVar;
    }

    @Override // xsna.pgq
    public final void release() {
        uf30 uf30Var = this.e;
        if (uf30Var != null) {
            uf30Var.getClass();
            this.e = null;
        }
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        if (j != 0) {
            if (this.f == 3) {
                uf30 uf30Var = this.e;
                uf30Var.getClass();
                uf30Var.seek(j, j2);
                return;
            }
            return;
        }
        this.f = 0;
        this.i = 0;
        this.j = -1L;
        if (this.e != null) {
            this.e = null;
        }
    }
}
