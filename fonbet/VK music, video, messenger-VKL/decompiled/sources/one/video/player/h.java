package one.video.player;

import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.player.OneVideoPlayer;
import xsna.deb0;
import xsna.er10;
import xsna.lk80;

/* compiled from: ForwardingAnalyticsListener.kt */
/* loaded from: classes8.dex */
public final class h implements OneVideoPlayer.a {
    public final CopyOnWriteArrayList<OneVideoPlayer.a> a = new CopyOnWriteArrayList<>();

    @Override // one.video.player.OneVideoPlayer.a
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
        Iterator<OneVideoPlayer.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().a(discontinuityReason, oneVideoPlayer, deb0Var, deb0Var2);
        }
    }

    @Override // one.video.player.OneVideoPlayer.a
    public final void b(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
        Iterator<OneVideoPlayer.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().b(oneVideoPlayer, i, j, j2);
        }
    }

    @Override // one.video.player.OneVideoPlayer.a
    public final void c(OneVideoPlayer oneVideoPlayer, long j, int i) {
        Iterator<OneVideoPlayer.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().c(oneVideoPlayer, j, i);
        }
    }

    @Override // one.video.player.OneVideoPlayer.a
    public final void d(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, IOException iOException) {
        Iterator<OneVideoPlayer.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().d(oneVideoPlayer, lk80Var, dataType, iOException);
        }
    }

    @Override // one.video.player.OneVideoPlayer.a
    public final void e(OneVideoPlayer oneVideoPlayer, er10 er10Var, OneVideoDecoderReuseEvaluation oneVideoDecoderReuseEvaluation) {
        Iterator<OneVideoPlayer.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().e(oneVideoPlayer, er10Var, oneVideoDecoderReuseEvaluation);
        }
    }

    @Override // one.video.player.OneVideoPlayer.a
    public final void f(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, OneVideoPlayer.DataType dataType) {
        Iterator<OneVideoPlayer.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().f(oneVideoPlayer, lk80Var, j, j2, dataType);
        }
    }

    @Override // one.video.player.OneVideoPlayer.a
    public final void g(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
        Iterator<OneVideoPlayer.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().g(oneVideoPlayer, i, j, j2);
        }
    }

    @Override // one.video.player.OneVideoPlayer.a
    public final void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, er10 er10Var) {
        Iterator<OneVideoPlayer.a> it = this.a.iterator();
        while (it.hasNext()) {
            it.next().h(oneVideoPlayer, lk80Var, dataType, er10Var);
        }
    }
}
