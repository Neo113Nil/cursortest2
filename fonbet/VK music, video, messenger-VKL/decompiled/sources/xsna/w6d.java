package xsna;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.design.view.component.play.ClipPlayPauseView;
import com.vk.clips.design.view.component.user.ClipUserView;
import com.vk.clips.sdk.shared.item.clip.overlay.api.TooltipType;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.tool.view.viewer.feed.list.nps.LazyNpsOverlay;
import com.vk.clips.viewer.impl.feed.view.ClipFeedLikeFlyView;
import com.vk.clips.viewer.impl.feed.view.subs.ClipsCanvasSubtitleView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.m5p0;

/* compiled from: ClipItemViewOverlayContainerDefault.kt */
/* loaded from: classes17.dex */
public final class w6d implements y1d {
    public final o1d a;
    public final zof b;
    public final mid0 c;
    public final f5z d;
    public final u6d e;
    public final pih0 f;
    public final h3d g;
    public final p8e h;
    public final yy5 i;
    public final anc j;
    public final Object k;
    public final Object l;
    public final ViewGroup m;
    public final e1d n;
    public final VkPlaceholder o;
    public final VkPlaceholder p;
    public final LazyNpsOverlay q;
    public final View r;
    public final ClipFeedLikeFlyView s;
    public final ClipsCanvasSubtitleView t;
    public final c1u0 u;

    public w6d(o1d o1dVar, int i, RecyclerView.u uVar, zof zofVar, int i2, mid0 mid0Var, f5z f5zVar, j1d j1dVar, pih0 pih0Var, h3d h3dVar, p8e p8eVar, yy5 yy5Var, anc ancVar) {
        this.a = o1dVar;
        this.b = zofVar;
        this.c = mid0Var;
        this.d = f5zVar;
        this.e = j1dVar;
        this.f = pih0Var;
        this.g = h3dVar;
        this.h = p8eVar;
        this.i = yy5Var;
        this.j = ancVar;
        t5 t5Var = new t5(this, 21);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.k = msy.a(lazyThreadSafetyMode, t5Var);
        this.l = msy.a(lazyThreadSafetyMode, new defpackage.g(this, 22));
        this.n = new e1d(o1dVar, i, uVar, zofVar);
        this.o = (VkPlaceholder) o1dVar.findViewById(R.id.fullscreen_clip_restriction);
        this.p = (VkPlaceholder) o1dVar.findViewById(R.id.fullscreen_clip_error_overlay);
        this.q = (LazyNpsOverlay) o1dVar.findViewById(R.id.fullscreen_clip_nps_overlay);
        this.r = o1dVar.findViewById(R.id.fullscreen_clip_unfocused_blackout);
        this.s = (ClipFeedLikeFlyView) o1dVar.findViewById(R.id.fullscreen_clip_fly_double_tap_like);
        this.t = (ClipsCanvasSubtitleView) o1dVar.findViewById(R.id.fullscreen_clip_subtitles);
        this.u = new c1u0(R.id.fullscreen_clip_play_pause_button_stub, R.layout.clip_fullscreen_play_pause_button_layout, o1dVar);
        this.m = (ViewGroup) o1dVar.findViewById(i2);
    }

    @Override // xsna.y1d
    public final void a() {
        View a;
        e1d e1dVar = this.n;
        ClipFeedSideControlsView clipFeedSideControlsView = e1dVar.d;
        clipFeedSideControlsView.setAnalyticsCallback(this.f);
        toc delegator = clipFeedSideControlsView.getDelegator();
        delegator.k(this.g);
        delegator.c(new com.vk.movika.sdk.base.observable.p(this, 23));
        int i = 17;
        delegator.m(new sz(this, i));
        delegator.e(new j5(this, i));
        delegator.h(new lz0(this, 15));
        delegator.d(new l5(this, 19));
        delegator.b(new po1(this, 17));
        delegator.i(new ix2(this, 22));
        clipFeedSideControlsView.q(!BuildInfo.q());
        ClipUserView clipUserView = e1dVar.g;
        clipUserView.setOnClickListener(new uzb(this, 1));
        if (this.b.b()) {
            clipUserView.setOnAvatarClickListener(new bc(this, 3));
        }
        e1dVar.h.setOnClickListener(new xz5(this, 1));
        e1dVar.i.setOnClickListener(new s01(this, 2));
        e1dVar.n.setOnClickListener(new v6d(this, 0));
        e1dVar.p.setViewFactory(new cg1(7, e1dVar, this));
        e1dVar.q.setViewFactory(new xm6(3, e1dVar, this));
        gqc gqcVar = (gqc) e1dVar.e.getAdapter();
        yy5 yy5Var = this.i;
        gqcVar.i = yy5Var;
        ((gqc) e1dVar.f.getAdapter()).i = yy5Var;
        e1dVar.r.setOnClickListener(new yb(this, 4));
        e1dVar.s.setReplyButtonListener(new defpackage.h(this, 16));
        FrameLayout frameLayout = e1dVar.l;
        mid0 mid0Var = this.c;
        if (mid0Var != null && (a = mid0Var.a()) != null) {
            a.setId(R.id.clips_fullscreen_main_overlay_products_view);
            gqo.f(a, this.d);
            frameLayout.addView(a);
        }
        VkPlaceholder.Mode mode = VkPlaceholder.Mode.Overlay;
        VkPlaceholder vkPlaceholder = this.o;
        vkPlaceholder.setMode(mode);
        vkPlaceholder.setOnTouchListener(new r01());
        this.p.setMode(mode);
        this.t.setOnClickListener(new yb(this, 4));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void b() {
        d6z d6zVar = (d6z) this.k.getValue();
        PointF likePosition = d6zVar.b.n.d.getLikePosition();
        int a = iah0.a(48);
        d6zVar.a(likePosition.x, likePosition.y - a, a, false);
    }

    @Override // xsna.y1d
    public final void c() {
        ((ClipPlayPauseView) this.u.a()).U(false);
    }

    @Override // xsna.y1d
    public final void d() {
        ((ClipPlayPauseView) this.u.a()).U(true);
    }

    @Override // xsna.y1d
    public final void e() {
        c1u0 c1u0Var = this.u;
        if (c1u0Var.b()) {
            ((ClipPlayPauseView) c1u0Var.a()).V();
        }
    }

    @Override // xsna.y1d
    public final ConstraintLayout f() {
        return this.n.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void g(boolean z) {
        m5p0 m5p0Var = (m5p0) this.l.getValue();
        if (z) {
            d3m.e(m5p0Var.c, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new w29(m5p0Var, 11), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            return;
        }
        m5p0Var.a.b.removeView(m5p0Var.c);
        m5p0Var.c = null;
        m5p0Var.d = null;
    }

    @Override // xsna.y1d
    public final ClipDescription getDescriptionView() {
        return this.n.m;
    }

    @Override // xsna.y1d
    public final List<View> getFadeTransitionViews() {
        return e43.l(this.n.b, this.t, this.p);
    }

    @Override // xsna.y1d
    public final List<View> getFastFadeViews() {
        return Collections.singletonList(this.o);
    }

    @Override // xsna.y1d
    public final ViewGroup getRootContainer() {
        return (ViewGroup) this.a.findViewById(R.id.fullscreen_clip_container);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void h(boolean z) {
        ((d6z) this.k.getValue()).b.n.d.getControlsUseCases().a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void i() {
        ((d6z) this.k.getValue()).c = true;
    }

    @Override // xsna.y1d
    public final FrameLayout j() {
        return this.n.u;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void k() {
        ((d6z) this.k.getValue()).b.s.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void l(MotionEvent motionEvent) {
        d6z d6zVar = (d6z) this.k.getValue();
        d6zVar.getClass();
        int i = d6z.d;
        float f = i / 2;
        d6zVar.a(motionEvent.getRawX() - f, (motionEvent.getRawY() - f) - d6z.e, i, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void m(TooltipType tooltipType) {
        View a;
        m5p0 m5p0Var = (m5p0) this.l.getValue();
        if (m5p0Var.d == tooltipType) {
            return;
        }
        m5p0Var.a.b.removeView(m5p0Var.c);
        m5p0Var.c = null;
        m5p0Var.d = null;
        int i = m5p0.a.$EnumSwitchMapping$0[tooltipType.ordinal()];
        if (i == 1) {
            a = m5p0Var.a(R.string.clips_tooltip_original_track_non_moderated);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a = m5p0Var.a(R.string.clips_tooltip_original_track_moderation_failure);
        }
        View view = a;
        d3m.c(view, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        m5p0Var.c = view;
        m5p0Var.d = tooltipType;
        m5p0Var.b.a(c6d.b);
    }
}
