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
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Thumb;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.tool.view.newsfeed.music.OnMediaTitleWrapperView;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.player.error.VkPlayerException;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostStartAudio;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.kw40;
import xsna.ry40;

/* compiled from: OnMediaMultiTracksHolder.kt */
/* loaded from: classes4.dex */
public final class l880 extends rp6<ol60, NewsEntry> implements ent0, View.OnClickListener, View.OnAttachStateChangeListener, z780 {
    public static final /* synthetic */ int R = 0;
    public final cr4 E;
    public final mbs F;
    public final h170 G;
    public j880 H;
    public u1c0 I;
    public m880 J;
    public final OnMediaAudioComponentProvider K;
    public final s780 L;
    public final y780 M;
    public final ValueAnimator N;
    public final d02 O;
    public final Handler P;
    public final c Q;

    /* compiled from: OnMediaMultiTracksHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            l880 l880Var = (l880) this.receiver;
            l880Var.L.f(l880Var.t6(), l880Var.H);
            return s3q0.a;
        }
    }

    /* compiled from: OnMediaMultiTracksHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l880 l880Var = (l880) this.receiver;
            l880Var.M.l(l880Var.H, booleanValue);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l880(ViewGroup viewGroup, cr4 cr4Var, mbs mbsVar, h170 h170Var) {
        super(r1, viewGroup);
        uuu0 uuu0Var = new uuu0(viewGroup.getContext());
        uuu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.E = cr4Var;
        this.F = mbsVar;
        this.G = h170Var;
        this.H = new j880(0);
        d dVar = new d();
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = new OnMediaAudioComponentProvider(cr4Var, ((PlayerAnalyticsComponent) ((k7m) m7m.c(viewGroup)).a(fpf0.a(PlayerAnalyticsComponent.class))).Xe(), OnMediaAudioComponentProvider.AudioType.MULTI_TRACK, dVar, new a(0, this, l880.class, "playAttachment", "playAttachment()V", 0), new b(1, this, l880.class, "updateVolumeState", "updateVolumeState(Z)V", 0));
        this.K = onMediaAudioComponentProvider;
        this.L = new s780(cr4Var, onMediaAudioComponentProvider);
        View view = this.itemView;
        y780 y780Var = new y780((uuu0) view, view.getContext(), onMediaAudioComponentProvider);
        this.M = y780Var;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat.setDuration(400L);
        ofFloat.setStartDelay(0L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new qrn(this, 1));
        this.N = ofFloat;
        this.O = new d02();
        this.P = onMediaAudioComponentProvider.o;
        this.Q = new c();
        y780Var.d(this);
        this.itemView.addOnAttachStateChangeListener(this);
        onMediaAudioComponentProvider.e().g = this;
    }

    public static int i7(float f, int i, int i2) {
        float f2 = i;
        return an10.b(cn70.a() * u11.b(i2, f2, f, f2));
    }

    @Override // xsna.z780
    public final boolean Q0() {
        if (this.H.b) {
            return false;
        }
        l780 h7 = h7();
        if (h7 != null && h7.c) {
            return false;
        }
        y780 y780Var = this.M;
        if (!y780Var.f.n.isRunning()) {
            y780Var.f.e(750L);
        }
        l780 h72 = h7();
        if (h72 != null) {
            h72.c = true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.rp6
    public final void R6(ol60 ol60Var) {
        Object obj = null;
        k880 k880Var = ol60Var instanceof k880 ? (k880) ol60Var : null;
        if (k880Var == null) {
            return;
        }
        boolean z = k880Var.p;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.K;
        y780 y780Var = this.M;
        if (!z) {
            OnMediaTitleWrapperView onMediaTitleWrapperView = y780Var.i;
            if (onMediaTitleWrapperView != null) {
                onMediaTitleWrapperView.setSizeFrozen(false);
            }
            onMediaAudioComponentProvider.b().d();
            onMediaAudioComponentProvider.e().b();
            onMediaAudioComponentProvider.g().o(28);
            l780 h7 = h7();
            if (h7 != null) {
                t780 e = onMediaAudioComponentProvider.e();
                long j = h7.b;
                int i = h7.a;
                e.e = j;
                e.d = i;
            } else {
                onMediaAudioComponentProvider.e().b();
                u1c0 u1c0Var = this.I;
                if (u1c0Var != null) {
                    u1c0Var.g = new l780(onMediaAudioComponentProvider.e().d, onMediaAudioComponentProvider.e().e, false);
                }
            }
        }
        j880 j880Var = this.H;
        List<MusicTrack> list = k880Var.h;
        l780 h72 = h7();
        Iterator it = j5g.S(list, Math.max(h72 != null ? h72.a : 0, onMediaAudioComponentProvider.e().d)).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!((MusicTrack) next).B()) {
                obj = next;
                break;
            }
        }
        MusicTrack musicTrack = (MusicTrack) obj;
        if (musicTrack == null) {
            musicTrack = k880Var.i;
        }
        j880 c2 = j880.c(j880Var, false, false, null, null, null, null, null, musicTrack, k880Var.j, k880Var.h, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        this.H = c2;
        String str = k880Var.q;
        this.H = j880.c(c2, false, false, null, null, null, str, k880Var.r, null, 0, null, 3711);
        onMediaAudioComponentProvider.e().h = str;
        k780 b2 = onMediaAudioComponentProvider.b();
        b2.getClass();
        b2.h = MusicPlaybackLaunchContext.Fb(str);
        d7();
        View view = y780Var.e;
        f4m.l(0, 0, view);
        f4m.q(0, view);
        if (onMediaAudioComponentProvider.a()) {
            j880 j880Var2 = this.H;
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            y780Var.l(j880Var2, com.vk.libvideo.autoplay.e.c());
        }
        if (k880Var.n) {
            b7(1);
            this.H = j880.c(this.H, false, true, null, null, null, null, null, null, 0, null, 4093);
            y780Var.f();
        } else {
            this.H = j880.c(this.H, false, false, null, null, null, null, null, null, 0, null, 4093);
            y780Var.a();
        }
        e7(false);
        f7(k880Var.j);
        c7();
        if (((Boolean) this.G.o.getValue()).booleanValue()) {
            b7(1);
            l780 h73 = h7();
            if (h73 != null) {
                h73.c = true;
            }
        } else if (!this.H.b) {
            b7(h7() != null ? r2.c : 0);
        }
        y780Var.g(k880Var.k, k880Var.l);
    }

    @Override // xsna.z780
    public final boolean Z2(long j) {
        if (this.H.b) {
            return false;
        }
        l780 h7 = h7();
        if (h7 != null && h7.c) {
            return false;
        }
        ValueAnimator valueAnimator = this.N;
        valueAnimator.setStartDelay(j);
        valueAnimator.start();
        y780 y780Var = this.M;
        if (!y780Var.f.n.isRunning()) {
            y780Var.f.e(750L);
        }
        l780 h72 = h7();
        if (h72 != null) {
            h72.c = true;
        }
        return true;
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.I = u1c0Var;
        super.a6(u1c0Var);
        mnh0.v(this.itemView, t6());
    }

    public final void b7(float f) {
        y780 y780Var = this.M;
        View view = y780Var.h;
        VkImage vkImage = y780Var.k;
        OnMediaTitleWrapperView onMediaTitleWrapperView = y780Var.i;
        View view2 = y780Var.j;
        if (view == null || onMediaTitleWrapperView == null) {
            return;
        }
        f4m.s(i7(f, 6, 12), view);
        f4m.r(i7(f, 6, 12), view);
        f4m.q(i7(f, -6, 0), view);
        view.setAlpha((0.4f * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        f4m.t(i7(f, 0, 40), view2);
        f4m.r(i7(f, -8, -44), view2);
        bwt0.c0(i7(f, 80, 40), view2);
        bwt0.c0(i7(f, 72, 32), vkImage);
        bwt0.r0(i7(f, 72, 32), vkImage);
        f4m.r(i7(f, 12, 60), onMediaTitleWrapperView);
        y780Var.l.setAlpha((1.0f * f) + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final void c7() {
        MusicTrack musicTrack = this.H.h;
        if (musicTrack == null) {
            return;
        }
        cr4 cr4Var = this.E;
        boolean i = cr4Var.c().i(musicTrack);
        y780 y780Var = this.M;
        if (i || musicTrack.l) {
            y780Var.h();
            return;
        }
        if (cr4Var.c().i0(musicTrack)) {
            y780Var.i();
        } else if (this.H.b) {
            y780Var.h();
        } else {
            bwt0.p0(y780Var.l, false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.vk.feed.core.models.news.NewsEntry] */
    public final void d7() {
        ?? q6;
        MusicTrack musicTrack = this.H.h;
        if (musicTrack == null || (q6 = q6()) == 0) {
            return;
        }
        this.H = j880.c(this.H, false, false, Integer.valueOf(musicTrack.b), Long.valueOf(musicTrack.c.b), q6.Cb().b, null, null, null, 0, null, 4039);
        m780 d2 = this.K.d();
        String valueOf = String.valueOf(di60.n(q6));
        j880 j880Var = this.H;
        Integer num = j880Var.c;
        Long l = j880Var.d;
        String str = j880Var.e;
        d2.k = valueOf;
        d2.l = num;
        d2.m = l;
        d2.n = str;
    }

    public final void e7(boolean z) {
        MusicTrack musicTrack = this.H.h;
        if (musicTrack == null) {
            return;
        }
        y780 y780Var = this.M;
        if (!z) {
            y780Var.k(musicTrack.Jb());
            return;
        }
        Thumb Jb = musicTrack.Jb();
        VkImage vkImage = y780Var.k;
        vkImage.animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).withEndAction(new d7n(5, y780Var, Jb));
        vkImage.setOnLoadCallback(new x780(y780Var));
    }

    public final void f7(int i) {
        MusicTrack musicTrack = this.H.h;
        if (musicTrack == null) {
            return;
        }
        this.O.getClass();
        w780 r = d02.r(i, musicTrack);
        String str = r.a;
        String str2 = r.b;
        y780 y780Var = this.M;
        y780Var.g(str, str2);
        if (str == null) {
            str = "";
        }
        RunningLineTextView runningLineTextView = y780Var.f;
        if (!str.equals(runningLineTextView.getText())) {
            runningLineTextView.setText(str);
        }
        if (str2 == null) {
            str2 = "";
        }
        RunningLineTextView runningLineTextView2 = y780Var.g;
        if (str2.equals(runningLineTextView2 != null ? runningLineTextView2.getText() : null) || runningLineTextView2 == null) {
            return;
        }
        runningLineTextView2.setText(str2);
    }

    public final l780 h7() {
        u1c0 u1c0Var = this.I;
        Object obj = u1c0Var != null ? u1c0Var.g : null;
        if (obj instanceof l780) {
            return (l780) obj;
        }
        return null;
    }

    public final void j7() {
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
        y780 y780Var = this.M;
        boolean equals = view.equals(y780Var.n);
        s780 s780Var = this.L;
        if (!equals) {
            if (view.equals(y780Var.l)) {
                s780Var.b(view.getContext(), this.H);
                return;
            } else {
                if (view.equals(y780Var.i) || view.equals(y780Var.k) || view.equals(y780Var.j)) {
                    s780Var.c(view.getContext(), t6(), this.H);
                    return;
                }
                return;
            }
        }
        boolean z = y780Var.n.i;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.K;
        if (z) {
            y780Var.c(false);
            onMediaAudioComponentProvider.g().o(28);
        } else if (onMediaAudioComponentProvider.a()) {
            s780Var.e(view.getContext(), t6(), this.H);
        } else {
            s780Var.d(view.getContext(), t6(), this.H);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.K;
        onMediaAudioComponentProvider.g().n((zv40) onMediaAudioComponentProvider.j.getValue());
        this.H = j880.c(this.H, true, false, null, null, null, null, null, null, 0, null, 4094);
        mbs mbsVar = this.F;
        if (mbsVar != null) {
            mbsVar.a(this.Q);
        }
        boolean a2 = onMediaAudioComponentProvider.a();
        y780 y780Var = this.M;
        if (a2) {
            j880 j880Var = this.H;
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            y780Var.l(j880Var, com.vk.libvideo.autoplay.e.c());
        }
        if (this.H.b) {
            y780Var.f.f();
        } else {
            l780 h7 = h7();
            if (h7 == null || !h7.c) {
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
            j7();
            return;
        }
        m880 m880Var = this.J;
        if (m880Var != null) {
            recyclerView.removeOnChildAttachStateChangeListener(m880Var);
        }
        m880 m880Var2 = new m880(recyclerView, t6, this);
        this.J = m880Var2;
        recyclerView.addOnChildAttachStateChangeListener(m880Var2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        u1c0 u1c0Var;
        m880 m880Var = this.J;
        if (m880Var != null) {
            ViewParent parent = this.itemView.getParent();
            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView != null) {
                recyclerView.removeOnChildAttachStateChangeListener(m880Var);
            }
        }
        this.J = null;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.K;
        onMediaAudioComponentProvider.g().n(null);
        this.H = j880.c(this.H, false, false, null, null, null, null, null, null, 0, null, 4094);
        if (onMediaAudioComponentProvider.a() && (u1c0Var = this.I) != null) {
            l780 h7 = h7();
            u1c0Var.g = h7 != null ? new l780(onMediaAudioComponentProvider.e().d, onMediaAudioComponentProvider.f().getCurrentPosition(), h7.c) : null;
        }
        onMediaAudioComponentProvider.d().a();
        mbs mbsVar = this.F;
        if (mbsVar != null) {
            mbsVar.d(this.Q);
        }
        this.P.removeCallbacksAndMessages(null);
        y780 y780Var = this.M;
        RunningLineTextView runningLineTextView = y780Var.f;
        runningLineTextView.f();
        d3m.b(runningLineTextView, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
        d3m.b(y780Var.k, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.K.d();
    }

    /* compiled from: OnMediaMultiTracksHolder.kt */
    public static final class c implements obs {
        public c() {
        }

        @Override // xsna.obs
        public final void onPause() {
            l880 l880Var = l880.this;
            l880Var.H = j880.c(l880Var.H, false, false, null, null, null, null, null, null, 0, null, 4094);
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = l880Var.K;
            onMediaAudioComponentProvider.g().o(28);
            onMediaAudioComponentProvider.b().f = true;
            l880Var.M.f.f();
        }

        @Override // xsna.obs
        public final void onResume() {
            l780 h7;
            l880 l880Var = l880.this;
            j880 c = j880.c(l880Var.H, true, false, null, null, null, null, null, null, 0, null, 4094);
            l880Var.H = c;
            if (c.b || (h7 = l880Var.h7()) == null || !h7.c) {
                return;
            }
            l880Var.M.f.e(750L);
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

    /* compiled from: OnMediaMultiTracksHolder.kt */
    public static final class d implements px40 {
        public boolean b;

        public d() {
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.px40
        public final void a(ry40 ry40Var) {
            l880 l880Var = l880.this;
            y780 y780Var = l880Var.M;
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = l880Var.K;
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
                    l880Var.L.f(l880Var.t6(), l880Var.H);
                    MusicTrack musicTrack = p4b0Var.b.a;
                    ?? q6 = l880Var.q6();
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
            if (!l880Var.H.a || !onMediaAudioComponentProvider.d().j) {
                onMediaAudioComponentProvider.g().o(28);
                return;
            }
            k780 b = onMediaAudioComponentProvider.b();
            kw40.b bVar = ((ry40.e.b) ry40Var).e;
            b.h(bVar.a.b, p4b0Var.b.a);
            boolean a = onMediaAudioComponentProvider.a();
            MusicTrack musicTrack2 = p4b0Var.b.a;
            boolean z = bVar.a.b == 0;
            l880Var.H = j880.c(l880Var.H, false, false, Integer.valueOf(musicTrack2.b), Long.valueOf(musicTrack2.c.b), null, null, null, null, 0, null, 4071);
            m780 d = onMediaAudioComponentProvider.d();
            j880 j880Var = l880Var.H;
            m780.c(d, j880Var.c, j880Var.d);
            if (a) {
                if (z) {
                    k780 b2 = onMediaAudioComponentProvider.b();
                    j880 j880Var2 = l880Var.H;
                    Integer num = j880Var2.c;
                    Long l = j880Var2.d;
                    String str = j880Var2.e;
                    b2.getClass();
                    k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.AUTOPLAY, num, l, str);
                    return;
                }
                return;
            }
            if (z) {
                k780 b3 = onMediaAudioComponentProvider.b();
                j880 j880Var3 = l880Var.H;
                Integer num2 = j880Var3.c;
                Long l2 = j880Var3.d;
                String str2 = j880Var3.e;
                b3.getClass();
                k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.MANUAL, num2, l2, str2);
                return;
            }
            k780 b4 = onMediaAudioComponentProvider.b();
            j880 j880Var4 = l880Var.H;
            Integer num3 = j880Var4.c;
            Long l3 = j880Var4.d;
            String str3 = j880Var4.e;
            b4.getClass();
            k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.PAUSE, num3, l3, str3);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.px40
        public final void i(ly40 ly40Var) {
            l880 l880Var = l880.this;
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = l880Var.K;
            ?? q6 = l880Var.q6();
            if (q6 != 0) {
                k780 b = onMediaAudioComponentProvider.b();
                long j = ly40Var.b;
                boolean a = onMediaAudioComponentProvider.a();
                j880 j880Var = l880Var.H;
                b.c(j, a, j880Var.c, j880Var.d, q6.Cb().b);
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
