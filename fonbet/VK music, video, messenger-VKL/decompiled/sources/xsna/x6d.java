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
import xsna.n5p0;

/* compiled from: ClipItemViewOverlayContainerRedesign.kt */
/* loaded from: classes17.dex */
public final class x6d implements y1d {
    public final o1d a;
    public final zof b;
    public final mid0 c;
    public final f5z d;
    public final a e;
    public final Object f;
    public final Object g;
    public final ViewGroup h;
    public final g1d i;
    public final VkPlaceholder j;
    public final VkPlaceholder k;
    public final LazyNpsOverlay l;
    public final View m;
    public final ClipFeedLikeFlyView n;
    public final ClipsCanvasSubtitleView o;
    public final c1u0 p;

    /* compiled from: ClipItemViewOverlayContainerRedesign.kt */
    public static final class a {
        public final u6d a;
        public final pih0 b;
        public final h3d c;
        public final p8e d;
        public final yy5 e;
        public final anc f;

        public a(j1d j1dVar, pih0 pih0Var, h3d h3dVar, p8e p8eVar, yy5 yy5Var, anc ancVar) {
            this.a = j1dVar;
            this.b = pih0Var;
            this.c = h3dVar;
            this.d = p8eVar;
            this.e = yy5Var;
            this.f = ancVar;
        }
    }

    public x6d(o1d o1dVar, int i, RecyclerView.u uVar, zof zofVar, int i2, mid0 mid0Var, f5z f5zVar, a aVar) {
        this.a = o1dVar;
        this.b = zofVar;
        this.c = mid0Var;
        this.d = f5zVar;
        this.e = aVar;
        yc ycVar = new yc(this, 17);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, ycVar);
        this.g = msy.a(lazyThreadSafetyMode, new j1(this, 21));
        this.i = new g1d(o1dVar, i, uVar, zofVar);
        this.j = (VkPlaceholder) o1dVar.findViewById(R.id.fullscreen_clip_restriction);
        this.k = (VkPlaceholder) o1dVar.findViewById(R.id.fullscreen_clip_error_overlay);
        this.l = (LazyNpsOverlay) o1dVar.findViewById(R.id.fullscreen_clip_nps_overlay);
        this.m = o1dVar.findViewById(R.id.fullscreen_clip_unfocused_blackout);
        this.n = (ClipFeedLikeFlyView) o1dVar.findViewById(R.id.fullscreen_clip_fly_double_tap_like);
        this.o = (ClipsCanvasSubtitleView) o1dVar.findViewById(R.id.fullscreen_clip_subtitles);
        this.p = new c1u0(R.id.fullscreen_clip_play_pause_button_stub, R.layout.clip_fullscreen_play_pause_button_layout, o1dVar);
        this.h = (ViewGroup) o1dVar.findViewById(i2);
    }

    @Override // xsna.y1d
    public final void a() {
        View a2;
        g1d g1dVar = this.i;
        ClipFeedSideControlsView clipFeedSideControlsView = g1dVar.d;
        a aVar = this.e;
        clipFeedSideControlsView.setAnalyticsCallback(aVar.b);
        toc delegator = clipFeedSideControlsView.getDelegator();
        delegator.k(aVar.c);
        delegator.c(new s9(this, 20));
        delegator.m(new p1(this, 28));
        delegator.e(new t9(this, 23));
        delegator.h(new t40(this, 18));
        delegator.d(new v9(this, 21));
        delegator.b(new k9(this, 28));
        delegator.i(new v5(this, 21));
        clipFeedSideControlsView.q(!BuildInfo.q());
        g1dVar.j.setOnClickListener(new y01(this, 7));
        g1dVar.l.setViewFactory(new pw(4, g1dVar, this));
        g1dVar.m.setViewFactory(new com.vk.movika.sdk.base.flow.binding.l(5, g1dVar, this));
        gqc gqcVar = (gqc) g1dVar.e.getAdapter();
        yy5 yy5Var = aVar.e;
        gqcVar.i = yy5Var;
        ((gqc) g1dVar.f.getAdapter()).i = yy5Var;
        g1dVar.n.setOnClickListener(new ko3(this, 2));
        g1dVar.o.setReplyButtonListener(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 20));
        FrameLayout frameLayout = g1dVar.h;
        mid0 mid0Var = this.c;
        if (mid0Var != null && (a2 = mid0Var.a()) != null) {
            a2.setId(R.id.clips_fullscreen_main_overlay_products_view);
            gqo.f(a2, this.d);
            frameLayout.addView(a2);
        }
        VkPlaceholder.Mode mode = VkPlaceholder.Mode.Overlay;
        VkPlaceholder vkPlaceholder = this.j;
        vkPlaceholder.setMode(mode);
        vkPlaceholder.setOnTouchListener(new r01());
        this.k.setMode(mode);
        this.o.setOnClickListener(new ko3(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void b() {
        e6z e6zVar = (e6z) this.f.getValue();
        PointF likePosition = e6zVar.b.i.d.getLikePosition();
        int a2 = iah0.a(48);
        e6zVar.a(likePosition.x, likePosition.y - a2, a2, false);
    }

    @Override // xsna.y1d
    public final void c() {
        ((ClipPlayPauseView) this.p.a()).U(false);
    }

    @Override // xsna.y1d
    public final void d() {
        ((ClipPlayPauseView) this.p.a()).U(true);
    }

    @Override // xsna.y1d
    public final void e() {
        c1u0 c1u0Var = this.p;
        if (c1u0Var.b()) {
            ((ClipPlayPauseView) c1u0Var.a()).V();
        }
    }

    @Override // xsna.y1d
    public final ConstraintLayout f() {
        return this.i.b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void g(boolean z) {
        n5p0 n5p0Var = (n5p0) this.g.getValue();
        if (z) {
            d3m.e(n5p0Var.c, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new fs2(n5p0Var, 15), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
            return;
        }
        n5p0Var.a.b.removeView(n5p0Var.c);
        n5p0Var.c = null;
        n5p0Var.d = null;
    }

    @Override // xsna.y1d
    public final ClipDescription getDescriptionView() {
        return this.i.i;
    }

    @Override // xsna.y1d
    public final List<View> getFadeTransitionViews() {
        return e43.l(this.i.b, this.o, this.k);
    }

    @Override // xsna.y1d
    public final List<View> getFastFadeViews() {
        return Collections.singletonList(this.j);
    }

    @Override // xsna.y1d
    public final ViewGroup getRootContainer() {
        return (ViewGroup) this.a.findViewById(R.id.fullscreen_clip_container);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void h(boolean z) {
        ((e6z) this.f.getValue()).b.i.d.getControlsUseCases().a.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void i() {
        ((e6z) this.f.getValue()).c = true;
    }

    @Override // xsna.y1d
    public final FrameLayout j() {
        return this.i.q;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void k() {
        ((e6z) this.f.getValue()).b.n.d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void l(MotionEvent motionEvent) {
        e6z e6zVar = (e6z) this.f.getValue();
        e6zVar.getClass();
        int i = e6z.d;
        float f = i / 2;
        e6zVar.a(motionEvent.getRawX() - f, (motionEvent.getRawY() - f) - e6z.e, i, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.y1d
    public final void m(TooltipType tooltipType) {
        View a2;
        n5p0 n5p0Var = (n5p0) this.g.getValue();
        if (n5p0Var.d == tooltipType) {
            return;
        }
        n5p0Var.a.b.removeView(n5p0Var.c);
        n5p0Var.c = null;
        n5p0Var.d = null;
        int i = n5p0.a.$EnumSwitchMapping$0[tooltipType.ordinal()];
        if (i == 1) {
            a2 = n5p0Var.a(R.string.clips_tooltip_original_track_non_moderated);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            a2 = n5p0Var.a(R.string.clips_tooltip_original_track_moderation_failure);
        }
        View view = a2;
        d3m.c(view, (r15 & 1) != 0 ? 300L : 200L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        n5p0Var.c = view;
        n5p0Var.d = tooltipType;
        n5p0Var.b.a(c6d.b);
    }
}
