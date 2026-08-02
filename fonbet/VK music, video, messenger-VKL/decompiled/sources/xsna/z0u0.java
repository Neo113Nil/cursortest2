package xsna;

import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.models.autoplay.RepeatMode;
import com.vk.libvideo.models.videotracker.PlayerType;
import com.vk.libvideo.models.videotracker.ScreenType;
import com.vk.libvideo.ui.video2.ScreenState;

/* compiled from: ViewStateAdapter.kt */
/* loaded from: classes3.dex */
public final class z0u0 {
    public final SubtitlesConfigurationMode a;
    public ScreenState b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final io.reactivex.rxjava3.subjects.d<drt0> h;
    public final io.reactivex.rxjava3.subjects.d i;

    public z0u0(ScreenState screenState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, SubtitlesConfigurationMode subtitlesConfigurationMode) {
        this.a = subtitlesConfigurationMode;
        this.b = screenState;
        this.c = z;
        this.d = z3;
        this.e = z4;
        this.f = z2;
        this.g = z5;
        io.reactivex.rxjava3.subjects.d<drt0> O0 = io.reactivex.rxjava3.subjects.d.O0(new drt0(a(), this.b, this.f, this.c, this.d, this.e, this.g));
        this.h = O0;
        this.i = O0;
    }

    public final com.vk.libvideo.autoplay.a a() {
        return new com.vk.libvideo.autoplay.a(true, this.f ? RepeatMode.OFF : RepeatMode.BY_VIDEO_PARAMS, null, false, false, false, null, this.a, null, null, PlayerType.CAROUSEL, x19.I(this.b) ? ScreenType.LANDSCAPE : x19.M(this.b) ? ScreenType.PORTRAIT : ScreenType.CAROUSEL, false, null, 421884);
    }

    public final void b() {
        this.h.onNext(new drt0(a(), this.b, this.f, this.c, this.d, this.e, this.g));
    }
}
