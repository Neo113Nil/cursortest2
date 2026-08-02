package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.hints.HintId;
import com.vk.libvideo.ui.tooltip.types.TooltipType;
import java.util.Iterator;
import java.util.List;
import one.video.controls.views.VideoButtonsView;
import one.video.player.OneVideoPlayer;

/* compiled from: KzSubTooltip.kt */
/* loaded from: classes3.dex */
public final class kky implements zkt0 {
    public final Context a;
    public final View b;
    public final TooltipType c = TooltipType.KZ_SUB;

    public kky(Context context, VideoButtonsView videoButtonsView) {
        this.a = context;
        this.b = videoButtonsView;
    }

    @Override // xsna.zkt0
    public final boolean a(yg5 yg5Var) {
        d3b0 v0;
        OneVideoPlayer a;
        List<one.video.player.tracks.b> Y;
        if (!pla.e().b().a(HintId.INFO_VIDEO_KAZ_LANG.getId())) {
            return false;
        }
        Object obj = null;
        if (yg5Var != null && (v0 = yg5Var.v0()) != null && (a = v0.a()) != null && (Y = a.Y()) != null) {
            Iterator<T> it = Y.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (epx.f(((who0) ((one.video.player.tracks.b) next).c).c, "kk")) {
                    obj = next;
                    break;
                }
            }
            obj = (one.video.player.tracks.b) obj;
        }
        return obj != null;
    }

    @Override // xsna.zkt0
    public final void b(prq0 prq0Var, wmd0 wmd0Var) {
        View findViewWithTag = this.b.findViewWithTag("settings");
        if (findViewWithTag != null) {
            bwt0.n(findViewWithTag, new isg(this, prq0Var, wmd0Var, 2));
        }
    }

    @Override // xsna.zkt0
    public final TooltipType getType() {
        return this.c;
    }
}
