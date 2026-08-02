package xsna;

import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.a;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.autoplay.ad_pixels.AutoPlayAdPixelsTrackerType;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import xsna.toz;

/* compiled from: VideoConfigHelper.kt */
/* loaded from: classes17.dex */
public final class eds0 {

    /* compiled from: VideoConfigHelper.kt */
    public static final class a implements a.InterfaceC1207a {
        public final /* synthetic */ y0r a;

        public a(y0r y0rVar) {
            this.a = y0rVar;
        }

        @Override // com.vk.libvideo.autoplay.a.InterfaceC1207a
        public final int a() {
            return this.a.a;
        }

        public final boolean equals(Object obj) {
            return epx.f(this.a, obj);
        }

        @Override // com.vk.libvideo.autoplay.a.InterfaceC1207a
        public final int getSessionId() {
            return this.a.b;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public static com.vk.libvideo.autoplay.a a(y0r y0rVar, SubtitlesConfigurationMode subtitlesConfigurationMode, boolean z) {
        io.reactivex.rxjava3.subjects.e eVar = frd.a;
        z0d0 z0d0Var = frd.b;
        RepeatMode repeatMode = z ? RepeatMode.ALWAYS : RepeatMode.OFF;
        chs0 chs0Var = null;
        a aVar = y0rVar != null ? new a(y0rVar) : null;
        toz.a aVar2 = new toz.a();
        AutoPlayAdPixelsTrackerType autoPlayAdPixelsTrackerType = AutoPlayAdPixelsTrackerType.CLIPS;
        PlayerType playerType = PlayerType.FULLSCREEN;
        ScreenType screenType = ScreenType.PORTRAIT;
        if (z0d0Var != null && frd.a()) {
            chs0Var = new chs0(z0d0Var);
        }
        return new com.vk.libvideo.autoplay.a(true, repeatMode, null, false, false, false, aVar, subtitlesConfigurationMode, aVar2, autoPlayAdPixelsTrackerType, playerType, screenType, false, chs0Var, 133080);
    }
}
