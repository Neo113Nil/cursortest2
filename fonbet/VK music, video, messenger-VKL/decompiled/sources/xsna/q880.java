package xsna;

import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.core.view.components.picture.VkImage;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.music.OnMediaTitleWrapperView;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.player.error.VkPlayerException;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioItem;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedPostAudioPlayMode;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostStartAudio;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kw40;
import xsna.ry40;

/* compiled from: OnMediaPlaylistHolder.kt */
/* loaded from: classes4.dex */
public final class q880 extends rp6<ol60, NewsEntry> implements ent0, View.OnClickListener, View.OnAttachStateChangeListener, z780 {
    public static final /* synthetic */ int P = 0;
    public final mbs E;
    public final h170 F;
    public s880 G;
    public u1c0 H;
    public r880 I;
    public final OnMediaAudioComponentProvider J;
    public final s780 K;
    public final y780 L;
    public final ValueAnimator M;
    public final Handler N;
    public final c O;

    /* compiled from: OnMediaPlaylistHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            q880 q880Var = (q880) this.receiver;
            q880Var.K.f(q880Var.t6(), q880Var.G);
            return s3q0.a;
        }
    }

    /* compiled from: OnMediaPlaylistHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            q880 q880Var = (q880) this.receiver;
            q880Var.L.l(q880Var.G, booleanValue);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q880(ViewGroup viewGroup, cr4 cr4Var, mbs mbsVar, h170 h170Var) {
        super(r1, viewGroup);
        uuu0 uuu0Var = new uuu0(viewGroup.getContext());
        uuu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.E = mbsVar;
        this.F = h170Var;
        this.G = new s880(0);
        d dVar = new d();
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = new OnMediaAudioComponentProvider(cr4Var, ((PlayerAnalyticsComponent) ((k7m) m7m.c(viewGroup)).a(fpf0.a(PlayerAnalyticsComponent.class))).Xe(), OnMediaAudioComponentProvider.AudioType.PLAYLIST, dVar, new a(0, this, q880.class, "playAttachment", "playAttachment()V", 0), new b(1, this, q880.class, "updateVolumeState", "updateVolumeState(Z)V", 0));
        this.J = onMediaAudioComponentProvider;
        this.K = new s780(cr4Var, onMediaAudioComponentProvider);
        View view = this.itemView;
        y780 y780Var = new y780((uuu0) view, view.getContext(), onMediaAudioComponentProvider);
        this.L = y780Var;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setStartDelay(0L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new hrb(this, 1));
        this.M = ofFloat;
        this.N = onMediaAudioComponentProvider.o;
        this.O = new c();
        y780Var.d(this);
        this.itemView.addOnAttachStateChangeListener(this);
    }

    public static int e7(float f, int i, int i2) {
        float f2 = i;
        return an10.b(cn70.a() * u11.b(i2, f2, f, f2));
    }

    @Override // xsna.z780
    public final boolean Q0() {
        if (this.G.b) {
            return false;
        }
        l780 d7 = d7();
        if (d7 != null && d7.c) {
            return false;
        }
        y780 y780Var = this.L;
        if (!y780Var.f.n.isRunning()) {
            y780Var.f.b();
        }
        l780 d72 = d7();
        if (d72 != null) {
            d72.c = true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // xsna.rp6
    public final void R6(ol60 ol60Var) {
        UserId userId;
        NewsEntry.TrackData Cb;
        t880 t880Var = ol60Var instanceof t880 ? (t880) ol60Var : null;
        if (t880Var == null) {
            return;
        }
        String str = t880Var.j;
        String str2 = t880Var.i;
        Playlist playlist = t880Var.h;
        boolean z = t880Var.o;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.J;
        y780 y780Var = this.L;
        if (!z) {
            OnMediaTitleWrapperView onMediaTitleWrapperView = y780Var.i;
            if (onMediaTitleWrapperView != null) {
                onMediaTitleWrapperView.setSizeFrozen(false);
            }
            onMediaAudioComponentProvider.b().d();
            onMediaAudioComponentProvider.e().b();
            onMediaAudioComponentProvider.g().o(28);
            l780 d7 = d7();
            if (d7 != null) {
                t780 e = onMediaAudioComponentProvider.e();
                long j = d7.b;
                int i = d7.a;
                e.e = j;
                e.d = i;
            } else {
                onMediaAudioComponentProvider.e().b();
                u1c0 u1c0Var = this.H;
                if (u1c0Var != null) {
                    u1c0Var.g = new l780(onMediaAudioComponentProvider.e().d, onMediaAudioComponentProvider.e().e, false);
                }
            }
            c7();
        }
        s880 c2 = s880.c(this.G, false, false, false, null, null, null, null, null, false, t880Var.h, null, 3071);
        this.G = c2;
        ?? q6 = q6();
        String str3 = (q6 == 0 || (Cb = q6.Cb()) == null) ? null : Cb.b;
        String str4 = t880Var.p;
        this.G = s880.c(c2, false, false, false, null, null, str3, str4, t880Var.q, false, null, null, 3679);
        this.G = s880.c(this.G, false, false, false, null, null, null, null, null, false, null, !playlist.Eb() ? MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.PLAYLIST : playlist.v > 1 ? MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.ALBUM : MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType.SINGLE, 2047);
        MusicTrack musicTrack = (MusicTrack) j5g.a0(playlist.y);
        this.G = s880.c(this.G, false, false, false, musicTrack != null ? Integer.valueOf(musicTrack.b) : null, (musicTrack == null || (userId = musicTrack.c) == null) ? null : Long.valueOf(userId.b), null, null, null, false, null, null, 4071);
        m780 d2 = onMediaAudioComponentProvider.d();
        String valueOf = String.valueOf(di60.n(q6()));
        s880 s880Var = this.G;
        Integer num = s880Var.d;
        Long l = s880Var.e;
        String str5 = s880Var.f;
        d2.k = valueOf;
        d2.l = num;
        d2.m = l;
        d2.n = str5;
        onMediaAudioComponentProvider.e().h = str4;
        k780 b2 = onMediaAudioComponentProvider.b();
        b2.getClass();
        b2.h = MusicPlaybackLaunchContext.Fb(str4);
        this.G = s880.c(this.G, false, false, false, null, null, null, null, null, playlist.Gb() && epx.f(xx1.m(playlist).c, hd60.a().a().y()), null, null, 3583);
        View view = y780Var.e;
        VkImageSimple vkImageSimple = y780Var.m;
        f4m.l(0, 0, view);
        f4m.q(0, view);
        if (onMediaAudioComponentProvider.a()) {
            s880 s880Var2 = this.G;
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            y780Var.l(s880Var2, com.vk.libvideo.autoplay.e.c());
        }
        if (t880Var.l) {
            b7(1);
            this.G = s880.c(this.G, false, true, false, null, null, null, null, null, false, null, null, 4093);
            y780Var.f();
        } else {
            this.G = s880.c(this.G, false, false, false, null, null, null, null, null, false, null, null, 4093);
            y780Var.a();
        }
        this.G = s880.c(this.G, false, false, t880Var.m, null, null, null, null, null, false, null, null, 4091);
        if (t880Var.m) {
            bwt0.p0(vkImageSimple, true);
        } else {
            bwt0.p0(vkImageSimple, false);
        }
        y780Var.k(t880Var.k);
        RunningLineTextView runningLineTextView = y780Var.f;
        if (!str2.equals(runningLineTextView.getText())) {
            runningLineTextView.setText(str2);
        }
        RunningLineTextView runningLineTextView2 = y780Var.g;
        if (!str.equals(runningLineTextView2 != null ? runningLineTextView2.getText() : null) && runningLineTextView2 != null) {
            runningLineTextView2.setText(str);
        }
        if (this.G.i) {
            bwt0.p0(y780Var.l, false);
            f4m.r(cn70.b(-8), y780Var.j);
        } else if (xx1.v(playlist)) {
            y780Var.i();
        } else {
            y780Var.h();
        }
        c7();
        y780Var.g(str2, str);
    }

    @Override // xsna.z780
    public final boolean Z2(long j) {
        if (this.G.b) {
            return false;
        }
        l780 d7 = d7();
        if (d7 != null && d7.c) {
            return false;
        }
        ValueAnimator valueAnimator = this.M;
        valueAnimator.setStartDelay(j);
        valueAnimator.start();
        y780 y780Var = this.L;
        if (!y780Var.f.n.isRunning()) {
            y780Var.f.e(750L);
        }
        l780 d72 = d7();
        if (d72 != null) {
            d72.c = true;
        }
        return true;
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.H = u1c0Var;
        super.a6(u1c0Var);
        mnh0.v(this.itemView, t6());
    }

    public final void b7(float f) {
        y780 y780Var = this.L;
        View view = y780Var.h;
        VkImage vkImage = y780Var.k;
        OnMediaTitleWrapperView onMediaTitleWrapperView = y780Var.i;
        View view2 = y780Var.j;
        if (view == null || onMediaTitleWrapperView == null) {
            return;
        }
        f4m.s(e7(f, 6, 12), view);
        f4m.r(e7(f, 6, 12), view);
        f4m.q(e7(f, -6, 0), view);
        view.setAlpha((0.4f * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        s880 s880Var = this.G;
        int max = Math.max(8, (s880Var.i ? 0 : 40) + 4 + (s880Var.c ? 12 : 0));
        f4m.t(e7(f, 0, 40), view2);
        f4m.r(e7(f, -12, -max), view2);
        bwt0.c0(e7(f, 80, 40), view2);
        bwt0.c0(e7(f, 72, 32), vkImage);
        bwt0.r0(e7(f, 72, 32), vkImage);
        f4m.r(e7(f, 12, max + 16), onMediaTitleWrapperView);
        VkImageSimple vkImageSimple = y780Var.l;
        float f2 = (1.0f * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        vkImageSimple.setAlpha(f2);
        y780Var.m.setAlpha(f2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    public final void c7() {
        if (((Boolean) this.F.o.getValue()).booleanValue()) {
            b7(1);
        } else {
            if (this.G.b) {
                return;
            }
            b7(d7() != null ? r0.c : 0);
        }
    }

    public final l780 d7() {
        u1c0 u1c0Var = this.H;
        Object obj = u1c0Var != null ? u1c0Var.g : null;
        if (obj instanceof l780) {
            return (l780) obj;
        }
        return null;
    }

    public final void f7() {
        ViewParent parent = this.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return;
        }
        View a2 = vjf0.a(recyclerView, t6());
        VkBlurContentView vkBlurContentView = a2 instanceof VkBlurContentView ? (VkBlurContentView) a2 : null;
        if (vkBlurContentView == null) {
            return;
        }
        View view = this.itemView;
        uuu0 uuu0Var = view instanceof uuu0 ? (uuu0) view : null;
        if (uuu0Var != null) {
            uuu0Var.setupBlurContent(vkBlurContentView);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        y780 y780Var = this.L;
        boolean equals = view.equals(y780Var.n);
        s780 s780Var = this.K;
        if (!equals) {
            if (view.equals(y780Var.l)) {
                s780Var.b(view.getContext(), this.G);
                return;
            } else {
                if (view.equals(y780Var.i) || view.equals(y780Var.k) || view.equals(y780Var.j)) {
                    s780Var.c(view.getContext(), t6(), this.G);
                    return;
                }
                return;
            }
        }
        boolean z = y780Var.n.i;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.J;
        if (z) {
            y780Var.c(false);
            onMediaAudioComponentProvider.g().o(28);
        } else if (onMediaAudioComponentProvider.a()) {
            s780Var.e(view.getContext(), t6(), this.G);
        } else {
            s780Var.d(view.getContext(), t6(), this.G);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.J;
        onMediaAudioComponentProvider.g().n((zv40) onMediaAudioComponentProvider.j.getValue());
        this.G = s880.c(this.G, true, false, false, null, null, null, null, null, false, null, null, 4094);
        mbs mbsVar = this.E;
        if (mbsVar != null) {
            mbsVar.a(this.O);
        }
        boolean a2 = onMediaAudioComponentProvider.a();
        y780 y780Var = this.L;
        if (a2) {
            s880 s880Var = this.G;
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            y780Var.l(s880Var, com.vk.libvideo.autoplay.e.c());
        }
        if (this.G.b) {
            y780Var.f.f();
        } else {
            l780 d7 = d7();
            if (d7 == null || !d7.c) {
                s1c0 s1c0Var = this.x;
                if (s1c0Var != null && s1c0Var.k) {
                    Z2(0L);
                } else if (s1c0Var != null && s1c0Var.t) {
                    Z2(400L);
                }
            } else {
                y780Var.f.e(750L);
            }
        }
        ViewParent parent = this.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return;
        }
        NewsEntry t6 = t6();
        if (vjf0.a(recyclerView, t6) != null) {
            f7();
            return;
        }
        r880 r880Var = this.I;
        if (r880Var != null) {
            recyclerView.removeOnChildAttachStateChangeListener(r880Var);
        }
        r880 r880Var2 = new r880(recyclerView, t6, this);
        this.I = r880Var2;
        recyclerView.addOnChildAttachStateChangeListener(r880Var2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        u1c0 u1c0Var;
        r880 r880Var = this.I;
        if (r880Var != null) {
            ViewParent parent = this.itemView.getParent();
            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView != null) {
                recyclerView.removeOnChildAttachStateChangeListener(r880Var);
            }
        }
        this.I = null;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.J;
        onMediaAudioComponentProvider.g().n(null);
        this.G = s880.c(this.G, false, false, false, null, null, null, null, null, false, null, null, 4094);
        if (onMediaAudioComponentProvider.a() && (u1c0Var = this.H) != null) {
            l780 d7 = d7();
            u1c0Var.g = d7 != null ? new l780(onMediaAudioComponentProvider.e().d, onMediaAudioComponentProvider.f().getCurrentPosition(), d7.c) : null;
        }
        onMediaAudioComponentProvider.d().a();
        mbs mbsVar = this.E;
        if (mbsVar != null) {
            mbsVar.d(this.O);
        }
        this.L.f.f();
        this.N.removeCallbacksAndMessages(null);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.J.d();
    }

    /* compiled from: OnMediaPlaylistHolder.kt */
    public static final class c implements obs {
        public c() {
        }

        @Override // xsna.obs
        public final void onPause() {
            q880 q880Var = q880.this;
            q880Var.G = s880.c(q880Var.G, false, false, false, null, null, null, null, null, false, null, null, 4094);
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = q880Var.J;
            onMediaAudioComponentProvider.g().o(28);
            onMediaAudioComponentProvider.b().f = true;
            q880Var.L.f.f();
        }

        @Override // xsna.obs
        public final void onResume() {
            l780 d7;
            q880 q880Var = q880.this;
            s880 c = s880.c(q880Var.G, true, false, false, null, null, null, null, null, false, null, null, 4094);
            q880Var.G = c;
            if (c.b || (d7 = q880Var.d7()) == null || !d7.c) {
                return;
            }
            q880Var.L.f.e(750L);
        }

        @Override // xsna.obs
        public final void b() {
        }

        @Override // xsna.obs
        public final void c() {
        }

        @Override // xsna.obs
        public final void onDestroy() {
        }

        @Override // xsna.obs
        public final void onDestroyView() {
        }

        @Override // xsna.obs
        public final void onStop() {
        }

        @Override // xsna.obs
        public final void onConfigurationChanged(Configuration configuration) {
        }

        @Override // xsna.obs
        public final void onCreate(Bundle bundle) {
        }

        @Override // xsna.obs
        public final void onActivityResult(int i, int i2, Intent intent) {
        }
    }

    /* compiled from: OnMediaPlaylistHolder.kt */
    public static final class d implements px40 {
        public boolean b;

        public d() {
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.px40
        public final void a(ry40 ry40Var) {
            List<MusicTrack> list;
            q880 q880Var = q880.this;
            y780 y780Var = q880Var.L;
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = q880Var.J;
            p4b0 p4b0Var = ry40Var.c;
            if (ry40Var instanceof ry40.a.c) {
                y780Var.b(true);
                return;
            }
            if (ry40Var instanceof ry40.a.C3641a) {
                y780Var.b(false);
                return;
            }
            if (!(ry40Var instanceof ry40.e.b)) {
                if (ry40Var instanceof ry40.f) {
                    y780Var.b(false);
                    if (!onMediaAudioComponentProvider.a() && !this.b) {
                        y780Var.e(false);
                    }
                    this.b = false;
                    onMediaAudioComponentProvider.b().i();
                    return;
                }
                if (ry40Var instanceof ry40.d) {
                    if (!onMediaAudioComponentProvider.a()) {
                        y780Var.e(false);
                    }
                    onMediaAudioComponentProvider.b().g();
                    return;
                }
                if (ry40Var instanceof ry40.b.a) {
                    y780Var.c(false);
                    y780Var.j();
                    return;
                }
                if (ry40Var instanceof ry40.b) {
                    this.b = true;
                    onMediaAudioComponentProvider.b().g = true;
                    onMediaAudioComponentProvider.e().c();
                    q880Var.K.f(q880Var.t6(), q880Var.G);
                    MusicTrack musicTrack = p4b0Var.b.a;
                    ?? q6 = q880Var.q6();
                    if (q6 != 0) {
                        onMediaAudioComponentProvider.b().b(onMediaAudioComponentProvider.a(), Integer.valueOf(musicTrack.b), Long.valueOf(musicTrack.c.b), q6.Cb().b);
                        return;
                    }
                    return;
                }
                return;
            }
            this.b = false;
            y780Var.b(false);
            if (!onMediaAudioComponentProvider.a()) {
                y780Var.e(true);
            }
            if (!q880Var.G.a || !onMediaAudioComponentProvider.d().j) {
                onMediaAudioComponentProvider.g().o(28);
                return;
            }
            k780 b = onMediaAudioComponentProvider.b();
            kw40.b bVar = ((ry40.e.b) ry40Var).e;
            b.h(bVar.a.b, p4b0Var.b.a);
            boolean a = onMediaAudioComponentProvider.a();
            MusicTrack musicTrack2 = p4b0Var.b.a;
            boolean z = bVar.a.b == 0;
            q880Var.G = s880.c(q880Var.G, false, false, false, Integer.valueOf(musicTrack2.b), Long.valueOf(musicTrack2.c.b), null, null, null, false, null, null, 4071);
            m780 d = onMediaAudioComponentProvider.d();
            s880 s880Var = q880Var.G;
            m780.c(d, s880Var.d, s880Var.e);
            Playlist playlist = q880Var.G.j;
            if (playlist == null) {
                return;
            }
            if (z && (list = playlist.y) != null && list.indexOf(musicTrack2) == 0) {
                k780 b2 = onMediaAudioComponentProvider.b();
                MobileOfficialAppsFeedStat$FeedPostAudioItem.ItemType itemType = q880Var.G.k;
                boolean a2 = onMediaAudioComponentProvider.a();
                int i = playlist.b;
                long j = playlist.c.b;
                String str = q880Var.G.f;
                b2.getClass();
                MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist = new MobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist(a2 ? MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.AUTOPLAY : MobileOfficialAppsFeedStat$FeedPostAudioPlayMode.MANUAL, new MobileOfficialAppsFeedStat$FeedPostAudioItem(i, j, itemType), str);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                UiTrackingScreen b3 = UiTracker.j.b();
                new iid0(c, SchemeStat$TypeAction.a.b(null, b3 != null ? b3.a : null, mobileOfficialAppsFeedStat$TypeFeedPostStartPlaylist, 1)).q();
            }
            if (a) {
                if (z) {
                    k780 b4 = onMediaAudioComponentProvider.b();
                    s880 s880Var2 = q880Var.G;
                    Integer num = s880Var2.d;
                    Long l = s880Var2.e;
                    String str2 = s880Var2.f;
                    b4.getClass();
                    k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.AUTOPLAY, num, l, str2);
                    return;
                }
                return;
            }
            if (z) {
                k780 b5 = onMediaAudioComponentProvider.b();
                s880 s880Var3 = q880Var.G;
                Integer num2 = s880Var3.d;
                Long l2 = s880Var3.e;
                String str3 = s880Var3.f;
                b5.getClass();
                k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.MANUAL, num2, l2, str3);
                return;
            }
            k780 b6 = onMediaAudioComponentProvider.b();
            s880 s880Var4 = q880Var.G;
            Integer num3 = s880Var4.d;
            Long l3 = s880Var4.e;
            String str4 = s880Var4.f;
            b6.getClass();
            k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.PAUSE, num3, l3, str4);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.px40
        public final void i(ly40 ly40Var) {
            q880 q880Var = q880.this;
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = q880Var.J;
            ?? q6 = q880Var.q6();
            if (q6 != 0) {
                k780 b = onMediaAudioComponentProvider.b();
                long j = ly40Var.b;
                boolean a = onMediaAudioComponentProvider.a();
                s880 s880Var = q880Var.G;
                b.c(j, a, s880Var.d, s880Var.e, q6.Cb().b);
            }
        }

        @Override // xsna.px40
        public final void G() {
        }

        @Override // xsna.px40
        public final void onStop() {
        }

        @Override // xsna.px40
        public final void B(ky40 ky40Var) {
        }

        @Override // xsna.px40
        public final void D(v0q<? extends kw40> v0qVar) {
        }

        @Override // xsna.px40
        public final void F(cz40 cz40Var) {
        }

        @Override // xsna.px40
        public final void d(cz40 cz40Var) {
        }

        @Override // xsna.px40
        public final void l(cz40 cz40Var) {
        }

        @Override // xsna.px40
        public final void q(ky40 ky40Var) {
        }

        @Override // xsna.px40
        public final void v(cz40 cz40Var, VkPlayerException vkPlayerException) {
        }

        @Override // xsna.px40
        public final void n(cz40 cz40Var, int i, long j) {
        }
    }
}
