package xsna;

import com.vk.libvideo.ui.tooltip.types.TooltipType;
import one.video.controls20.SimpleControlsView;

/* compiled from: VideoView2TooltipManager.kt */
/* loaded from: classes3.dex */
public final class uqt0 {
    public final SimpleControlsView a;
    public final b860 b;
    public final z760 c;
    public final alt0 d;
    public t6p0 e;
    public boolean f;
    public boolean g;
    public boolean h;

    public uqt0(SimpleControlsView simpleControlsView) {
        this.a = simpleControlsView;
        b860 b860Var = new b860(simpleControlsView.getContext(), new tfm0(this, 21));
        this.b = b860Var;
        z760 z760Var = new z760(simpleControlsView.getContext(), new hvr0(this, 12));
        this.c = z760Var;
        this.d = new alt0(e43.l(b860Var, z760Var));
        this.e = new t6p0(false, false);
    }

    public final void a() {
        boolean z = this.f;
        if (z && this.g && this.h) {
            this.d.a(e43.l(TooltipType.MULTI_AUDIO, TooltipType.KZ_SUB), null);
        } else if (z && this.g) {
            awt0.s(this.a, new akd0(this, 23));
        }
    }
}
