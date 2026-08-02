package xsna;

import androidx.media3.common.a;
import java.io.IOException;

/* compiled from: SingleSampleExtractor.java */
/* loaded from: classes12.dex */
public final class uvj0 implements pgq {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public rgq f;
    public rgp0 g;

    public uvj0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // xsna.pgq
    public final int b(qgq qgqVar, pzb0 pzb0Var) throws IOException {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        rgp0 rgp0Var = this.g;
        rgp0Var.getClass();
        int g = rgp0Var.g(qgqVar, 1024, true);
        if (g != -1) {
            this.d += g;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // xsna.pgq
    public final boolean d(qgq qgqVar) throws IOException {
        int i = this.b;
        int i2 = this.a;
        fxc0.z((i2 == -1 || i == -1) ? false : true);
        xi90 xi90Var = new xi90(i);
        ((tel) qgqVar).peekFully(xi90Var.a, 0, i, false);
        return xi90Var.J() == i2;
    }

    @Override // xsna.pgq
    public final void e(rgq rgqVar) {
        this.f = rgqVar;
        rgp0 track = rgqVar.track(1024, 4);
        this.g = track;
        a.C0043a c0043a = new a.C0043a();
        String str = this.c;
        c0043a.l = io20.q(str);
        c0043a.m = io20.q(str);
        zjh0.d(c0043a, track);
        this.f.endTracks();
        this.f.f(new wvj0());
        this.e = 1;
    }

    @Override // xsna.pgq
    public final void seek(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // xsna.pgq
    public final void release() {
    }
}
