package xsna;

import android.content.Context;
import android.net.Uri;
import one.video.player.OneVideoPlayer;
import xsna.ees0;

/* compiled from: VideoDebugView.kt */
/* loaded from: classes6.dex */
public final class des0 implements one.video.player.g {
    public final /* synthetic */ ees0 a;
    public final /* synthetic */ Context b;

    public des0(ees0 ees0Var, Context context) {
        this.a = ees0Var;
        this.b = context;
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final void d(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
        ees0 ees0Var = this.a;
        ees0.a aVar = ees0Var.f;
        fz5 fz5Var = fz5.d;
        Context context = this.b;
        ees0Var.setState(ees0.a.a(aVar, null, ((jk80) fz5Var.j(context)).b.getBitrateEstimate(), ((jk80) fz5Var.j(context)).b.a(), 1));
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final void b(OneVideoPlayer oneVideoPlayer, String str, String str2) {
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final void c(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final void e(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z) {
    }

    @Override // one.video.player.g, one.video.player.OneVideoPlayer.f
    public final void a(OneVideoPlayer oneVideoPlayer, Uri uri, long j, boolean z, int i) {
    }
}
