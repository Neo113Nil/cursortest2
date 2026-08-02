package xsna;

import android.content.Context;
import android.media.AudioManager;
import androidx.media3.datasource.RawResourceDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.log.L;

/* compiled from: VoipSimpleAudioPlayer.kt */
/* loaded from: classes7.dex */
public final class i2x0 {
    public final Context a;
    public final String b = i2x0.class.getSimpleName();
    public androidx.media3.exoplayer.l c;

    public i2x0(Context context) {
        this.a = context;
    }

    public static void b(i2x0 i2x0Var, int i, Boolean bool) {
        Context context = i2x0Var.a;
        androidx.media3.exoplayer.l lVar = i2x0Var.c;
        if (lVar != null) {
            try {
                try {
                    lVar.stop();
                } catch (Exception e) {
                    L.f(i2x0Var.b, "Failed to stop sound", e);
                }
                evk evkVar = new evk(RawResourceDataSource.buildRawResourceUri(i));
                RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(context);
                rawResourceDataSource.open(evkVar);
                h2x0 h2x0Var = new h2x0(rawResourceDataSource);
                ((AudioManager) context.getSystemService("audio")).setSpeakerphoneOn(bool.booleanValue());
                b630 b630Var = new b630(pf30.v, 8);
                androidx.media3.exoplayer.upstream.a aVar = new androidx.media3.exoplayer.upstream.a();
                kr10 b = kr10.b(rawResourceDataSource.getUri());
                b.b.getClass();
                b.b.getClass();
                b.b.getClass();
                androidx.media3.exoplayer.source.n nVar = new androidx.media3.exoplayer.source.n(b, h2x0Var, b630Var, androidx.media3.exoplayer.drm.b.a, aVar, ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, null);
                nc4 nc4Var = new nc4(0);
                androidx.media3.exoplayer.l lVar2 = i2x0Var.c;
                if (lVar2 != null) {
                    lVar2.z(nc4Var);
                }
                androidx.media3.exoplayer.l lVar3 = i2x0Var.c;
                if (lVar3 != null) {
                    lVar3.y();
                    androidx.media3.exoplayer.c cVar = lVar3.c;
                    cVar.X();
                    cVar.r(nVar);
                    cVar.prepare();
                }
                androidx.media3.exoplayer.l lVar4 = i2x0Var.c;
                if (lVar4 != null) {
                    lVar4.setPlayWhenReady(true);
                }
            } catch (Exception e2) {
                L.f(i2x0Var.b, "Failed to play sound", e2);
            }
        }
    }

    public final void a() {
        Context context = this.a;
        try {
            ExoPlayer.b bVar = new ExoPlayer.b(context);
            bVar.d(new npl(context));
            fxc0.z(!bVar.y);
            bVar.y = true;
            this.c = new androidx.media3.exoplayer.l(bVar);
        } catch (Exception e) {
            L.f(this.b, "Failed to initialize VoipSimpleAudioPlayer", e);
        }
    }
}
