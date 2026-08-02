package xsna;

import one.video.player.OneVideoPlayer;

/* compiled from: DashManifestLoadDurationReporter.kt */
/* loaded from: classes3.dex */
public final class vsk extends n5q {
    public final boolean b;

    public vsk(boolean z) {
        this.b = z;
    }

    @Override // xsna.n5q, one.video.player.e, one.video.player.OneVideoPlayer.a
    public final void f(OneVideoPlayer oneVideoPlayer, lk80 lk80Var, long j, long j2, OneVideoPlayer.DataType dataType) {
        String host;
        if (dataType == OneVideoPlayer.DataType.MANIFEST && this.b && (host = lk80Var.a.getHost()) != null) {
            new ej00(host, (int) j2).q();
        }
    }
}
