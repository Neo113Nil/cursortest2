package xsna;

import com.vk.reefton.ReefEvent;
import java.io.IOException;
import kotlin.LazyThreadSafetyMode;
import one.video.player.OneVideoDecoderReuseEvaluation;
import one.video.player.OneVideoPlayer;

/* compiled from: StoringAsyncReefPlayerAnalyticsListener.kt */
/* loaded from: classes3.dex */
public final class jwl0 implements one.video.player.e {
    public final owl0 a;
    public final cf00 b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new jaa0(this, 18));

    public jwl0(owl0 owl0Var, cf00 cf00Var) {
        this.a = owl0Var;
        this.b = cf00Var;
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void b(OneVideoPlayer oneVideoPlayer, final int i, final long j, final long j2) {
        final long currentPosition = oneVideoPlayer.getCurrentPosition();
        this.a.execute(new Runnable() { // from class: xsna.iwl0
            /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
            @Override // java.lang.Runnable
            public final void run() {
                knf0 knf0Var = (knf0) jwl0.this.c.getValue();
                if (knf0Var != null) {
                    knf0Var.a.a(new ReefEvent.e(i, currentPosition, j, j2));
                }
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
