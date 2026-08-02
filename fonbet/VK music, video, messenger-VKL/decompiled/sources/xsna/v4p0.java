package xsna;

import com.vk.core.tips.TipAnchorView;

/* compiled from: Tooltip.kt */
/* loaded from: classes17.dex */
public final class v4p0 implements bzo0 {
    public final /* synthetic */ g4p0 b;
    public final /* synthetic */ TipAnchorView c;

    public v4p0(g4p0 g4p0Var, TipAnchorView tipAnchorView) {
        this.b = g4p0Var;
        this.c = tipAnchorView;
    }

    @Override // xsna.dcn
    public final void dismiss() {
        this.b.invoke(4);
    }

    @Override // xsna.bzo0
    public final void t0() {
        this.c.requestLayout();
    }
}
