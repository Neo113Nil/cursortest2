package xsna;

import com.vk.reefton.Reef;
import com.vk.reefton.ReefEvent;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import one.video.player.OneVideoDecoderReuseEvaluation;
import one.video.player.OneVideoPlayer;

/* compiled from: AsyncReefPlayerAnalyticsListener.kt */
/* loaded from: classes3.dex */
public final class yy3 implements one.video.player.e {
    public final ExecutorService a;
    public final knf0 b;

    public yy3(Reef reef, ExecutorService executorService) {
        this.a = executorService;
        this.b = new knf0(reef);
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void b(OneVideoPlayer oneVideoPlayer, final int i, final long j, final long j2) {
        final long currentPosition = oneVideoPlayer.getCurrentPosition();
        this.a.submit(new Runnable() { // from class: xsna.xy3
            @Override // java.lang.Runnable
            public final void run() {
                yy3.this.b.a.a(new ReefEvent.e(i, currentPosition, j, j2));
            }
        });
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void c(OneVideoPlayer oneVideoPlayer, long j, int i) {
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void e(OneVideoPlayer oneVideoPlayer, er10 er10Var, OneVideoDecoderReuseEvaluation oneVideoDecoderReuseEvaluation) {
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void d(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, IOException iOException) {
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void g(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, er10 er10Var) {
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void f(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, OneVideoPlayer.DataType dataType) {
    }
}
