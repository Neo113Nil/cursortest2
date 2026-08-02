package xsna;

import java.io.IOException;
import java.util.EnumSet;
import java.util.HashMap;
import one.video.player.OneVideoDecoderReuseEvaluation;
import one.video.player.OneVideoPlayer;
import xsna.by1;
import xsna.jza0;

/* compiled from: OneVideoExoPlayer.kt */
/* loaded from: classes8.dex */
public final class zk80 implements by1 {
    public final /* synthetic */ xk80 b;

    public zk80(xk80 xk80Var) {
        this.b = xk80Var;
    }

    @Override // xsna.by1
    public final void A() {
        this.b.j = null;
    }

    @Override // xsna.by1
    public final void B() {
        this.b.k = null;
    }

    @Override // xsna.by1
    public final void F(bpz bpzVar, pr10 pr10Var) {
        androidx.media3.common.a aVar = pr10Var.c;
        int i = pr10Var.b;
        er10 er10Var = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 && aVar != null) {
                    er10Var = fr10.c(aVar);
                }
            } else if (aVar != null) {
                er10Var = fr10.d(aVar);
            }
        } else if (aVar != null) {
            er10Var = fr10.a(aVar);
        }
        xk80 xk80Var = this.b;
        one.video.player.h hVar = xk80Var.o;
        lk80 F = alk.F(bpzVar.a);
        HashMap hashMap = xvk.a;
        hVar.h(xk80Var, F, xvk.a(pr10Var.a), er10Var);
    }

    @Override // xsna.by1
    public final void H(by1.a aVar, int i, long j, long j2) {
        xk80 xk80Var = this.b;
        xk80Var.o.b(xk80Var, i, j, j2);
    }

    @Override // xsna.by1
    public final void J(g8l g8lVar) {
        zmo zmoVar = (zmo) this.b.e0.getValue();
        if (zmoVar != null) {
            zmoVar.a = new ymo(0L, 0L, 0L, 0L, 0L);
            zmoVar.b = 0L;
            zmoVar.c = 0L;
            zmoVar.d = 0L;
            zmoVar.e = 0L;
            zmoVar.f = null;
            zmoVar.f = g8lVar;
        }
    }

    @Override // xsna.by1
    public final void L(bpz bpzVar, pr10 pr10Var, IOException iOException) {
        xk80 xk80Var = this.b;
        one.video.player.h hVar = xk80Var.o;
        lk80 F = alk.F(bpzVar.a);
        HashMap hashMap = xvk.a;
        hVar.d(xk80Var, F, xvk.a(pr10Var.a), iOException);
    }

    @Override // xsna.by1
    public final void Q(int i, long j) {
        xk80 xk80Var = this.b;
        xk80Var.o.c(xk80Var, j, i);
    }

    @Override // xsna.by1
    public final void T(int i, long j, long j2) {
        xk80 xk80Var = this.b;
        xk80Var.o.g(xk80Var, i, j, j2);
    }

    @Override // xsna.by1
    public final void U(String str) {
        this.b.k = str;
    }

    @Override // xsna.by1
    public final void W(bpz bpzVar, pr10 pr10Var) {
        long j = bpzVar.f;
        xk80 xk80Var = this.b;
        one.video.player.h hVar = xk80Var.o;
        evk evkVar = bpzVar.a;
        lk80 F = alk.F(evkVar);
        long j2 = bpzVar.f;
        long j3 = bpzVar.e;
        HashMap hashMap = xvk.a;
        hVar.f(xk80Var, F, j2, j3, xvk.a(pr10Var.a));
        int i = pr10Var.b;
        if (i == 2) {
            xk80Var.k0 = j;
        } else if (i == 1) {
            xk80Var.l0 = j;
        }
        xk80Var.j0 = pr10Var.g - pr10Var.f;
        xk80Var.i0 = evkVar.a.getHost();
    }

    @Override // xsna.by1
    public final void X(g8l g8lVar) {
        zmo zmoVar = (zmo) this.b.e0.getValue();
        if (zmoVar != null) {
            zmoVar.f = g8lVar;
            zmoVar.a(g8lVar);
        }
    }

    @Override // xsna.by1
    public final void b0(androidx.media3.common.a aVar, n8l n8lVar) {
        int i = io20.i(aVar.n);
        xk80 xk80Var = this.b;
        one.video.player.h hVar = xk80Var.o;
        er10 b = fr10.b(i, aVar);
        OneVideoDecoderReuseEvaluation oneVideoDecoderReuseEvaluation = null;
        OneVideoDecoderReuseEvaluation.DecoderReuseResult decoderReuseResult = null;
        if (n8lVar != null) {
            String str = n8lVar.a;
            er10 b2 = fr10.b(i, n8lVar.b);
            er10 b3 = fr10.b(i, n8lVar.c);
            int i2 = n8lVar.d;
            if (i2 == 0) {
                decoderReuseResult = OneVideoDecoderReuseEvaluation.DecoderReuseResult.NO;
            } else if (i2 == 1) {
                decoderReuseResult = OneVideoDecoderReuseEvaluation.DecoderReuseResult.YES_WITH_FLUSH;
            } else if (i2 == 2) {
                decoderReuseResult = OneVideoDecoderReuseEvaluation.DecoderReuseResult.YES_WITH_RECONFIGURATION;
            } else if (i2 == 3) {
                decoderReuseResult = OneVideoDecoderReuseEvaluation.DecoderReuseResult.YES_WITHOUT_RECONFIGURATION;
            }
            OneVideoDecoderReuseEvaluation.DecoderReuseResult decoderReuseResult2 = decoderReuseResult;
            int i3 = n8lVar.e;
            zrp<OneVideoDecoderReuseEvaluation.DecoderDiscardReasons> h = OneVideoDecoderReuseEvaluation.DecoderDiscardReasons.h();
            EnumSet noneOf = EnumSet.noneOf(OneVideoDecoderReuseEvaluation.DecoderDiscardReasons.class);
            for (OneVideoDecoderReuseEvaluation.DecoderDiscardReasons decoderDiscardReasons : h) {
                if (decoderDiscardReasons.a(i3) != 0) {
                    noneOf.add(decoderDiscardReasons);
                }
            }
            oneVideoDecoderReuseEvaluation = new OneVideoDecoderReuseEvaluation(str, b2, b3, decoderReuseResult2, noneOf);
        }
        hVar.e(xk80Var, b, oneVideoDecoderReuseEvaluation);
    }

    @Override // xsna.by1
    public final void d0(int i, jza0.c cVar, jza0.c cVar2) {
        xk80 xk80Var = this.b;
        one.video.player.h hVar = xk80Var.o;
        deb0 t0 = xk80.t0(xk80Var, cVar);
        deb0 t02 = xk80.t0(xk80Var, cVar2);
        OneVideoPlayer.DiscontinuityReason discontinuityReason = (OneVideoPlayer.DiscontinuityReason) l1n.a.get(Integer.valueOf(i));
        if (discontinuityReason == null) {
            discontinuityReason = OneVideoPlayer.DiscontinuityReason.UNKNOWN;
        }
        hVar.a(discontinuityReason, xk80Var, t0, t02);
    }

    @Override // xsna.by1
    public final void h(String str) {
        this.b.j = str;
    }
}
