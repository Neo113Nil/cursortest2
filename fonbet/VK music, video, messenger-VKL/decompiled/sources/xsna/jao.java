package xsna;

import com.vk.core.preference.Preference;
import com.vk.libvideo.ui.tooltip.types.TooltipType;

/* compiled from: DownloadTooltip.kt */
/* loaded from: classes3.dex */
public final class jao implements zkt0 {
    public final uys0 a;
    public final TooltipType b = TooltipType.DOWNLOAD;

    public jao(uys0 uys0Var) {
        this.a = uys0Var;
    }

    @Override // xsna.zkt0
    public final boolean a(yg5 yg5Var) {
        uys0 uys0Var = this.a;
        if (uys0Var == null || !uys0Var.isVisible()) {
            return false;
        }
        gpt0 gpt0Var = gpt0.a;
        return !Preference.v("video_tooltip_prefs", "tooltip_video_downloads");
    }

    @Override // xsna.zkt0
    public final void b(prq0 prq0Var, wmd0 wmd0Var) {
        uys0 uys0Var = this.a;
        if (uys0Var != null) {
            uys0Var.b(prq0Var, wmd0Var);
        }
    }

    @Override // xsna.zkt0
    public final TooltipType getType() {
        return this.b;
    }
}
