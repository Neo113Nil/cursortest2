package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.clips.design.view.component.audio.ClipsAudioToggle;
import com.vk.clips.design.view.component.play.ClipPlayPauseView;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.core.view.tools.VkViewStub;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: AdsItemViewOverlayContainerRedesign.kt */
/* loaded from: classes17.dex */
public final class b11 implements oy0 {
    public final ViewGroup a;
    public final ux0 b;
    public final ov0 c;
    public final nx0 d;
    public final VkPlaceholder e;
    public final VkPlaceholder f;
    public final View g;
    public final tw0 h;
    public final c1u0 i;

    public b11(ViewGroup viewGroup, int i, bcr0<? extends ImageView> bcr0Var, ux0 ux0Var, ov0 ov0Var) {
        this.a = viewGroup;
        this.b = ux0Var;
        this.c = ov0Var;
        this.d = new nx0(viewGroup, i, true, bcr0Var);
        this.e = (VkPlaceholder) viewGroup.findViewById(R.id.fullscreen_clip_restriction);
        this.f = (VkPlaceholder) viewGroup.findViewById(R.id.fullscreen_ads_error_overlay);
        this.g = viewGroup.findViewById(R.id.fullscreen_ads_unfocused_blackout);
        this.h = new tw0(viewGroup);
        this.i = new c1u0(R.id.fullscreen_ads_play_pause_button_stub, R.layout.clip_fullscreen_play_pause_button_layout, viewGroup);
    }

    @Override // xsna.oy0
    public final void a() {
        nx0 nx0Var = this.d;
        nx0Var.f.setOnClickListener(new x01(this, 0));
        nx0Var.g.setOnClickListener(new k1(this, 2));
        VkViewStub vkViewStub = nx0Var.m;
        vkViewStub.setViewFactory(new com.vk.movika.sdk.base.ui.i(2, vkViewStub, this));
        int i = 0;
        nx0Var.d.setOnClickListener(new y01(this, i));
        nx0Var.e.setOnClickListener(new a11(this, i));
        ClipsAudioToggle clipsAudioToggle = nx0Var.j;
        if (clipsAudioToggle != null) {
            clipsAudioToggle.setOnClickListener(new z01(this, 0));
        }
        VkRichCell vkRichCell = nx0Var.o;
        if (vkRichCell != null) {
            vkRichCell.setOnClickListener(new vw0(this, 1));
        }
        VkPlaceholder.Mode mode = VkPlaceholder.Mode.Overlay;
        VkPlaceholder vkPlaceholder = this.e;
        vkPlaceholder.setMode(mode);
        vkPlaceholder.setOnTouchListener(new r01());
        this.f.setMode(mode);
    }

    @Override // xsna.oy0
    public final ClipUserView b() {
        return this.d.e;
    }

    @Override // xsna.oy0
    public final void c() {
        ((ClipPlayPauseView) this.i.a()).U(false);
    }

    @Override // xsna.oy0
    public final void d() {
        ((ClipPlayPauseView) this.i.a()).U(true);
    }

    @Override // xsna.oy0
    public final void e() {
        c1u0 c1u0Var = this.i;
        if (c1u0Var.b()) {
            ((ClipPlayPauseView) c1u0Var.a()).V();
        }
    }

    @Override // xsna.oy0
    public final ConstraintLayout f() {
        return this.d.b;
    }

    @Override // xsna.oy0
    public final View g() {
        return this.d.m.getView();
    }

    @Override // xsna.oy0
    public final List<View> getFadeTransitionViews() {
        return e43.l(this.d.b, this.f);
    }

    @Override // xsna.oy0
    public final List<View> getFastFadeViews() {
        return e43.l(this.e, (ConstraintLayout) this.h.a);
    }

    @Override // xsna.oy0
    public final ViewGroup getRootContainer() {
        return (ViewGroup) this.a.findViewById(R.id.fullscreen_ads_container);
    }
}
