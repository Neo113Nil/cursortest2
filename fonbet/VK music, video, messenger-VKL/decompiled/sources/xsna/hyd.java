package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.editor.TransformOverlayView;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.design.view.stikers.ClipsStickerDeleteAreaView;
import com.vk.clips.design.view.stikers.ClipsStickersView;
import com.vk.clips.editor.base.api.ClipsEditorScreen;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vkontakte.android.R;
import java.util.Collections;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.ixd;
import xsna.wn2;

/* compiled from: ClipsEditorFullscreenPreviewView.kt */
/* loaded from: classes16.dex */
public final class hyd implements fyd, ClipsEditorScreen, View.OnClickListener {
    public static final int t = iah0.a(52);
    public final ViewStub b;
    public final dyd c;
    public final wn2 d;
    public final com.vk.clips.editor.base.api.b e;
    public final tdl0 f;
    public final e2e g;
    public final ClipsEditorScreen.State h;
    public final bpn0 i;
    public final bpn0 j;
    public final bpn0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final Object n;
    public final bpn0 o;
    public final Object p;
    public final Object q;
    public final gyd r;
    public boolean s;

    /* compiled from: ClipsEditorFullscreenPreviewView.kt */
    public final class a implements ClipsStickersView.e {
        public a() {
        }

        @Override // com.vk.clips.design.view.stikers.ClipsStickersView.e
        public final void a() {
            hyd.this.f().a(1.0f);
        }

        @Override // xsna.sc80
        public final void b(nov novVar) {
            hyd.this.c.b(novVar);
        }

        @Override // com.vk.clips.design.view.stikers.ClipsStickersView.e
        public final void c() {
            hyd.this.f().a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }

        public final void d() {
            hyd hydVar = hyd.this;
            nov movingSticker = hydVar.f.getMovingSticker();
            if (movingSticker != null) {
                if (movingSticker.v0()) {
                    d3m.c(hydVar.f(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    d3m.e(hydVar.g(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                }
                hydVar.c.g(movingSticker);
            }
        }

        @Override // xsna.sc80
        public final void f() {
            d();
        }

        @Override // xsna.sc80
        public final void g() {
            d();
        }

        @Override // xsna.sc80
        public final void h(nov novVar) {
            hyd hydVar = hyd.this;
            d3m.e(hydVar.f(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            d3m.c(hydVar.g(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            hydVar.c.e(novVar);
        }
    }

    /* compiled from: ClipsEditorFullscreenPreviewView.kt */
    public final class b implements ClipsStickersView.f {
        public b() {
        }

        @Override // com.vk.clips.design.view.stikers.ClipsStickersView.f
        public final void f(nov novVar) {
            hyd.this.c.f(novVar);
        }
    }

    /* compiled from: ClipsEditorFullscreenPreviewView.kt */
    public static final class c implements ClipsSeekBar.b {
        public c() {
        }

        @Override // com.vk.clips.design.view.seek.ClipsSeekBar.b
        public final void a() {
            hyd hydVar = hyd.this;
            hydVar.s = true;
            hydVar.c.n();
        }

        @Override // com.vk.clips.design.view.seek.ClipsSeekBar.b
        public final void b() {
            hyd hydVar = hyd.this;
            hydVar.s = false;
            hydVar.c.p();
        }
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [xsna.gyd] */
    public hyd(ViewStub viewStub, dyd dydVar, wn2 wn2Var, uy50 uy50Var, udl0 udl0Var, e2e e2eVar) {
        cxd cxdVar = e2eVar.k;
        this.b = viewStub;
        this.c = dydVar;
        this.d = wn2Var;
        this.e = uy50Var;
        this.f = udl0Var;
        this.g = e2eVar;
        this.h = ClipsEditorScreen.State.VIDEO_FULLSCREEN;
        this.i = new bpn0(new px0(this, 18));
        this.j = new bpn0(new com.vk.movika.sdk.base.ui.t(this, 23));
        bpn0 bpn0Var = new bpn0(new sx0(this, 15));
        this.k = bpn0Var;
        this.l = new bpn0(new com.vk.movika.sdk.base.logic.interactor.b(this, 17));
        this.m = new bpn0(new v6(this, 15));
        y6 y6Var = new y6(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, y6Var);
        this.n = a2;
        this.o = new bpn0(new rj1(this, 22));
        this.p = msy.a(lazyThreadSafetyMode, new no(this, 22));
        this.q = msy.a(lazyThreadSafetyMode, new v40(this, 17));
        this.r = new View.OnLayoutChangeListener() { // from class: xsna.gyd
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i2 == i6 && i4 == i8) {
                    return;
                }
                hyd.this.l();
            }
        };
        dydVar.q(this);
        jjc.f(this, (VkToolButton) a2.getValue());
        VkToolButton vkToolButton = (VkToolButton) a2.getValue();
        ixd ixdVar = ad0.g;
        ixd.b bVar = (ixdVar == null ? null : ixdVar).a;
        VkToolButton.c(vkToolButton, Integer.valueOf(R.drawable.vk_icon_fullscreen_exit_outline_20));
        VkToolButton vkToolButton2 = (VkToolButton) a2.getValue();
        ViewGroup.LayoutParams layoutParams = vkToolButton2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        ViewGroup.LayoutParams layoutParams2 = vkToolButton2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = i + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
        int i3 = t;
        vkToolButton2.setMinimumHeight(i3 - i2);
        jjc.f(this, h());
        VkImageSimple h = h();
        ixd ixdVar2 = ad0.g;
        ixd.b bVar2 = (ixdVar2 != null ? ixdVar2 : null).a;
        h.setImageResource(R.drawable.vk_icon_hide_outline_28);
        VkToolButton vkToolButton3 = (VkToolButton) a2.getValue();
        vkToolButton3.setMinimumHeight(i3 - (vkToolButton3.getPaddingBottom() + vkToolButton3.getPaddingTop()));
        f4m.t(0, (View) bpn0Var.getValue());
        ClipsSeekBar g = g();
        g.setSelectedColor(R.color.vk_white);
        g.setThumbColor(R.color.vk_white);
    }

    @Override // xsna.fyd
    public final void a(boolean z) {
        if (z) {
            d3m.c((View) this.o.getValue(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final boolean a0() {
        return false;
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void b(boolean z, ClipsEditorScreen.a aVar) {
        l();
        dyd dydVar = this.c;
        dydVar.a();
        f4m.j(f());
        float f = 74;
        jwf0 jwf0Var = new jwf0(iah0.a(f), iah0.a(f));
        jwf0Var.c = iah0.a(22);
        tdl0 tdl0Var = this.f;
        tdl0Var.e(jwf0Var);
        tdl0Var.c(dydVar.m());
        tdl0Var.h(new a());
        tdl0Var.k(true);
        tdl0Var.g(false);
        cxd cxdVar = this.g.k;
        tdl0Var.m(new b());
        d3m.c(g(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        g().setOnSeekBarChangeListener(new mj1(this, 9));
        g().setStateListener(new c());
        awt0.j(iah0.a(8), g());
        g().setIgnoreMovementThreshold(0);
        tdl0Var.d(new ox0(this, 11));
        i().addOnLayoutChangeListener(this.r);
    }

    @Override // xsna.fyd
    public final void c(boolean z) {
        if ((h().getVisibility() == 0) != z) {
            if (z) {
                d3m.c(h(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                d3m.e(h(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            }
        }
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final void close() {
        i().removeOnLayoutChangeListener(this.r);
        this.d.d(i(), null);
        this.c.onClose();
        tdl0 tdl0Var = this.f;
        tdl0Var.c(null);
        tdl0Var.j();
        tdl0Var.h(null);
        tdl0Var.k(false);
        tdl0Var.g(true);
        tdl0Var.l(false, false);
        tdl0Var.m(null);
        d3m.e(g(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
        g().setOnSeekBarChangeListener(null);
        g().setStateListener(null);
        tdl0Var.d(null);
        d3m.e((View) this.o.getValue(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fyd
    public final void d(boolean z) {
        if (h().getVisibility() == 0) {
            VkImageSimple h = h();
            if (z) {
                ixd ixdVar = ad0.g;
                ixd.b bVar = (ixdVar != null ? ixdVar : null).a;
                h.setImageResource(R.drawable.vk_icon_hide_outline_28);
                h.setContentDescription(getCtx().getString(R.string.clip_editor_fullscreen_hide_controls_accessibility));
            } else {
                ixd ixdVar2 = ad0.g;
                ixd.b bVar2 = (ixdVar2 != null ? ixdVar2 : null).a;
                h.setImageResource(R.drawable.vk_icon_view_outline_28);
                h.setContentDescription(getCtx().getString(R.string.clip_editor_fullscreen_show_controls_accessibility));
            }
            awt0.u((FrameLayout) this.q.getValue(), z);
            awt0.u((View) this.o.getValue(), z);
            boolean z2 = !z;
            this.f.l(z2, z2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.fyd
    public final void e(View view) {
        ?? r0 = this.q;
        ((FrameLayout) r0.getValue()).removeAllViews();
        ((FrameLayout) r0.getValue()).addView(view);
    }

    public final ClipsStickerDeleteAreaView f() {
        return (ClipsStickerDeleteAreaView) this.l.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ClipsSeekBar g() {
        return (ClipsSeekBar) this.p.getValue();
    }

    @Override // xsna.fyd
    public final Context getCtx() {
        return i().getContext();
    }

    @Override // com.vk.clips.editor.base.api.ClipsEditorScreen
    public final ClipsEditorScreen.State getState() {
        return this.h;
    }

    public final VkImageSimple h() {
        return (VkImageSimple) this.m.getValue();
    }

    public final View i() {
        return (View) this.i.getValue();
    }

    public final void j(boolean z) {
        this.f.g(z);
    }

    public final void k(boolean z) {
        bpn0 bpn0Var = this.j;
        if (z) {
            d3m.c((TransformOverlayView) bpn0Var.getValue(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        } else {
            d3m.e((TransformOverlayView) bpn0Var.getValue(), (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : true);
        }
    }

    public final void l() {
        View i = i();
        View view = (View) this.k.getValue();
        cxd cxdVar = this.g.k;
        wn2.a.a(this.d, i, view, new wn2.b(true, !((((float) iah0.f().widthPixels) / ((float) (iah0.f().heightPixels - t))) - 0.5625f <= 0.2f)), Collections.singletonList((TransformOverlayView) this.j.getValue()), 16);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != R.id.video_fullscreen_collapse_btn) {
            if (id == R.id.show_preview_image) {
                this.c.o();
            }
        } else {
            if (((TransformOverlayView) this.j.getValue()).getVisibility() == 0) {
                return;
            }
            this.e.b(ClipsEditorScreen.State.VIDEO_CROPPER, null);
        }
    }
}
