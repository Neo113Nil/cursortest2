package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.f;
import androidx.media3.ui.PlayerView;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerModalView;
import ru.yandex.taxi.banners.presentation.fullscreen.FullScreenBannerPage;

/* loaded from: classes5.dex */
public final class bis implements xxc0 {
    public final /* synthetic */ FullScreenBannerModalView a;
    public final /* synthetic */ adv b;

    public bis(FullScreenBannerModalView fullScreenBannerModalView, adv advVar) {
        this.a = fullScreenBannerModalView;
        this.b = advVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
    
        r2 = r2.pagerAdapter;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i, boolean z) {
        boolean z2;
        whs whsVar;
        whs whsVar2;
        FullScreenBannerModalView fullScreenBannerModalView = this.a;
        z2 = fullScreenBannerModalView.isVideoInBackground;
        if (z2) {
            whsVar = fullScreenBannerModalView.pagerAdapter;
            if (whsVar == null || whsVar2 == null) {
                return;
            }
            boolean z3 = i == 2 || !z;
            FullScreenBannerPage l = whsVar2.l();
            if (l != null) {
                l.setBackgroundVisible(z3);
            } else {
                whsVar2.f = true;
                whsVar2.g = z3;
            }
        }
    }

    @Override // defpackage.xxc0
    public final void onPlayWhenReadyChanged(boolean z, int i) {
        ioo iooVar;
        iooVar = this.a.playerProxy;
        f fVar = iooVar.d;
        a(fVar != null ? fVar.getPlaybackState() : 4, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (r0.getPlayWhenReady() == true) goto L8;
     */
    @Override // defpackage.xxc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPlaybackStateChanged(int i) {
        ioo iooVar;
        iooVar = this.a.playerProxy;
        f fVar = iooVar.d;
        boolean z = fVar != null;
        a(i, z);
    }

    @Override // defpackage.xxc0
    public final void onPlayerError(PlaybackException playbackException) {
        ltc ltcVar;
        PlayerView playerView;
        whs whsVar;
        FullScreenBannerModalView fullScreenBannerModalView = this.a;
        ltcVar = fullScreenBannerModalView.communicationsErrorsInteractor;
        iux0 iux0Var = (iux0) ltcVar;
        iux0Var.getClass();
        iux0Var.c("Video playback error", playbackException, "Video playback error", new String[0]);
        playerView = fullScreenBannerModalView.playerView;
        playerView.setVisibility(8);
        whsVar = fullScreenBannerModalView.pagerAdapter;
        if (whsVar != null) {
            FullScreenBannerPage l = whsVar.l();
            if (l != null) {
                l.setBackgroundVisible(true);
            } else {
                whsVar.f = true;
                whsVar.g = true;
            }
        }
        fullScreenBannerModalView.isVideoInBackground = false;
        if (fullScreenBannerModalView.presenter.y) {
            adv advVar = this.b;
            advVar.d = 3000L;
            advVar.e = 0L;
            advVar.f = false;
            fullScreenBannerModalView.resumePlayback();
        }
    }
}
