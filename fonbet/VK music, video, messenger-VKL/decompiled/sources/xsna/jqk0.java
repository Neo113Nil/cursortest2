package xsna;

import xsna.n3i0;

/* compiled from: StartOffsetExtractorOutput.java */
/* loaded from: classes12.dex */
public final class jqk0 implements rgq {
    public final long b;
    public final rgq c;

    /* compiled from: StartOffsetExtractorOutput.java */
    public class a extends aas {
        public final /* synthetic */ n3i0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n3i0 n3i0Var, n3i0 n3i0Var2) {
            super(n3i0Var);
            this.b = n3i0Var2;
        }

        @Override // xsna.aas, xsna.n3i0
        public final n3i0.a getSeekPoints(long j) {
            n3i0.a seekPoints = this.b.getSeekPoints(j);
            p3i0 p3i0Var = seekPoints.a;
            long j2 = p3i0Var.a;
            long j3 = p3i0Var.b;
            long j4 = jqk0.this.b;
            p3i0 p3i0Var2 = new p3i0(j2, j3 + j4);
            p3i0 p3i0Var3 = seekPoints.b;
            return new n3i0.a(p3i0Var2, new p3i0(p3i0Var3.a, p3i0Var3.b + j4));
        }
    }

    public jqk0(long j, rgq rgqVar) {
        this.b = j;
        this.c = rgqVar;
    }

    @Override // xsna.rgq
    public final void endTracks() {
        this.c.endTracks();
    }

    @Override // xsna.rgq
    public final void f(n3i0 n3i0Var) {
        this.c.f(new a(n3i0Var, n3i0Var));
    }

    @Override // xsna.rgq
    public final rgp0 track(int i, int i2) {
        return this.c.track(i, i2);
    }
}
