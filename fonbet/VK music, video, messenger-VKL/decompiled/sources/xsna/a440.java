package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.ui.tooltip.types.TooltipType;
import one.video.controls.views.VideoButtonsView;
import one.video.player.OneVideoPlayer;

/* compiled from: MultiAudioTooltip.kt */
/* loaded from: classes3.dex */
public final class a440 implements zkt0 {
    public final Context a;
    public final View b;
    public final TooltipType c = TooltipType.MULTI_AUDIO;

    public a440(Context context, VideoButtonsView videoButtonsView) {
        this.a = context;
        this.b = videoButtonsView;
    }

    @Override // xsna.zkt0
    public final boolean a(yg5 yg5Var) {
        d3b0 v0;
        OneVideoPlayer a;
        if (yg5Var == null || (v0 = yg5Var.v0()) == null) {
            return false;
        }
        if (!pla.e().b().a(HintId.INFO_VIDEO_MULTIPLE_VOLUME.getId())) {
            v0 = null;
        }
        return (v0 == null || (a = v0.a()) == null || s3t0.a(this.a, a.F()).size() <= 1) ? false : true;
    }

    @Override // xsna.zkt0
    public final void b(prq0 prq0Var, wmd0 wmd0Var) {
        View findViewWithTag = this.b.findViewWithTag("settings");
        if (findViewWithTag != null) {
            bwt0.n(findViewWithTag, new iea(this, prq0Var, wmd0Var, 4));
        }
    }

    @Override // xsna.zkt0
    public final TooltipType getType() {
        return this.c;
    }
}
