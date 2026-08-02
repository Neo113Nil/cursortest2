package xsna;

import com.vk.libvideo.ui.tooltip.types.TooltipType;

/* compiled from: NewVideoTooltip.kt */
/* loaded from: classes3.dex */
public abstract class i960 implements zkt0 {
    public final TooltipType a;
    public final String b;
    public boolean c;

    public i960(TooltipType tooltipType, String str) {
        this.a = tooltipType;
        this.b = str;
    }

    @Override // xsna.zkt0
    public final boolean a(yg5 yg5Var) {
        return this.c && pla.e().b().a(this.b);
    }

    @Override // xsna.zkt0
    public final TooltipType getType() {
        return this.a;
    }
}
