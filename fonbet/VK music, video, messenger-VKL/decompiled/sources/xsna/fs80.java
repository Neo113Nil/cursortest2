package xsna;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import one.video.player.OneVideoDecoderReuseEvaluation;
import one.video.player.OneVideoPlayer;

/* compiled from: OpenTelemetryCollector.kt */
/* loaded from: classes17.dex */
public final class fs80 implements one.video.player.e {
    public final ConcurrentHashMap<String, Long> a = new ConcurrentHashMap<>();
    public final long b = TimeUnit.MINUTES.toNanos(5);
    public final long c = TimeUnit.SECONDS.toNanos(2);
    public final ConcurrentHashMap<Integer, Long> d = new ConcurrentHashMap<>();
    public final /* synthetic */ ks80 e;

    public fs80(ks80 ks80Var) {
        this.e = ks80Var;
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void b(final OneVideoPlayer oneVideoPlayer, final int i, final long j, final long j2) {
        Integer valueOf = Integer.valueOf(oneVideoPlayer.hashCode());
        ConcurrentHashMap<Integer, Long> concurrentHashMap = this.d;
        Long l = concurrentHashMap.get(valueOf);
        if (System.nanoTime() - (l != null ? l.longValue() : 0L) > this.c) {
            concurrentHashMap.put(Integer.valueOf(oneVideoPlayer.hashCode()), Long.valueOf(System.nanoTime()));
            final ks80 ks80Var = this.e;
            ks80.e(oneVideoPlayer, new izs() { // from class: xsna.ds80
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    ohk0 f = ks80.this.f().f((String) obj);
                    if (f != null) {
                        lk3 a = new lk3().a(i, "bw.totalLoadTimeMs").a(j, "bw.totalBytesLoaded").a(j2, "bw.bitrateEstimate");
                        OneVideoPlayer oneVideoPlayer2 = oneVideoPlayer;
                        f.j("bandwidthEstimate", a.a(oneVideoPlayer2.a(), "buf.durationMs").a(oneVideoPlayer2.getBufferedPosition(), "player.bufferedPosition").a(oneVideoPlayer2.getBufferedPercentage(), "player.bufferedPercentage").e());
                    }
                    return s3q0.a;
                }
            });
        }
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void d(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, IOException iOException) {
        ks80.e(oneVideoPlayer, new w7u(this, 24));
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void f(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, OneVideoPlayer.DataType dataType) {
        ks80.e(oneVideoPlayer, new e2s(this, 21));
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
    public final void g(OneVideoPlayer oneVideoPlayer, int i, long j, long j2) {
    }

    @Override // one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void h(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, OneVideoPlayer.DataType dataType, er10 er10Var) {
    }
}
