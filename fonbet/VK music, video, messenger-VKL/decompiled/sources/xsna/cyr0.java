package xsna;

import com.vk.libvideo.api.quality.QualitySettingsInterval;
import one.video.player.OneVideoPlayer;
import one.video.player.model.VideoContentType;
import one.video.player.tracks.trackselection.AdaptiveTrackSelectionInterval;
import xsna.bat0;
import xsna.exr0;

/* compiled from: VideoActionSettingsHandler.kt */
/* loaded from: classes17.dex */
public final class cyr0 {
    public final exr0.a a;

    public cyr0(exr0.a aVar) {
        this.a = aVar;
    }

    public static void a(fat0 fat0Var) {
        OneVideoPlayer a;
        OneVideoPlayer a2;
        d3b0 d3b0Var = fat0Var.a;
        OneVideoPlayer a3 = d3b0Var.a();
        sht0 j = a3 != null ? a3.j() : null;
        VideoContentType videoContentType = j != null ? j.a : null;
        int i = videoContentType == null ? -1 : bat0.a.$EnumSwitchMapping$0[videoContentType.ordinal()];
        Integer num = i != 1 ? i != 2 ? null : -2 : -4;
        if (num != null && (a2 = d3b0Var.a()) != null) {
            vm80.c(a2, num.intValue());
        }
        QualitySettingsInterval w0 = fxc0.B().w0();
        AdaptiveTrackSelectionInterval h = w0.h();
        OneVideoPlayer a4 = d3b0Var.a();
        hk0 P = a4 != null ? a4.P() : null;
        if (h == null || P == null || (a = d3b0Var.a()) == null) {
            return;
        }
        a.b0(hk0.a(P, h.i(), h.h(), fxc0.B().J().E() && w0 != QualitySettingsInterval.HIGH, 8));
    }
}
