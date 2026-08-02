package one.video.player;

import java.io.IOException;
import one.video.player.OneVideoPlayer;
import xsna.deb0;
import xsna.er10;
import xsna.lk80;

/* compiled from: EmptyPlayerAnalyticsListener.kt */
/* loaded from: classes8.dex */
public interface e extends OneVideoPlayer.a {
    @Override // one.video.player.OneVideoPlayer.a
    default void c(OneVideoPlayer oneVideoPlayer, long j, int i) {
    }

    @Override // one.video.player.OneVideoPlayer.a
    default void e(OneVideoPlayer oneVideoPlayer, er10 er10Var, OneVideoDecoderReuseEvaluation oneVideoDecoderReuseEvaluation) {
    }

    @Override // one.video.player.OneVideoPlayer.a
    default void a(OneVideoPlayer.DiscontinuityReason discontinuityReason, OneVideoPlayer oneVideoPlayer, deb0 deb0Var, deb0 deb0Var2) {
    }

    @Override // one.video.player.OneVideoPlayer.a
    default void b(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
    }

    @Override // one.video.player.OneVideoPlayer.a
    default void d(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, IOException iOException) {
    }

    @Override // one.video.player.OneVideoPlayer.a
    default void g(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
    }

    @Override // one.video.player.OneVideoPlayer.a
    default void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, er10 er10Var) {
    }

    @Override // one.video.player.OneVideoPlayer.a
    default void f(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, OneVideoPlayer.DataType dataType) {
    }
}
