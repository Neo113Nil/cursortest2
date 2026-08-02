package xsna;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.apps.BuildInfo;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.music.MusicPreviewUrl;
import com.vk.dto.music.MusicTrack;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.overlay.VkOverlayCircleButton;
import com.vk.feed.tool.view.newsfeed.music.RunningLineTextView;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.player.error.VkPlayerException;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedPostStartAudio;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.kw40;
import xsna.ry40;

/* compiled from: OnMediaTrackHolder.kt */
/* loaded from: classes4.dex */
public final class v880 extends rp6<ol60, NewsEntry> implements ent0, View.OnClickListener, View.OnAttachStateChangeListener {
    public static final /* synthetic */ int O = 0;
    public final cr4 E;
    public final mbs F;
    public x880 G;
    public u1c0 H;
    public w880 I;
    public final OnMediaAudioComponentProvider J;
    public final s780 K;
    public final y780 L;
    public final Handler M;
    public final c N;

    /* compiled from: OnMediaTrackHolder.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            v880 v880Var = (v880) this.receiver;
            v880Var.K.f(v880Var.t6(), v880Var.G);
            return s3q0.a;
        }
    }

    /* compiled from: OnMediaTrackHolder.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            v880 v880Var = (v880) this.receiver;
            v880Var.L.l(v880Var.G, booleanValue);
            return s3q0.a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public v880(ViewGroup viewGroup, cr4 cr4Var, mbs mbsVar) {
        super(r1, viewGroup);
        vuu0 vuu0Var = new vuu0(viewGroup.getContext());
        vuu0Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.E = cr4Var;
        this.F = mbsVar;
        this.G = new x880(0);
        d dVar = new d();
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = new OnMediaAudioComponentProvider(cr4Var, ((PlayerAnalyticsComponent) ((k7m) m7m.c(viewGroup)).a(fpf0.a(PlayerAnalyticsComponent.class))).Xe(), OnMediaAudioComponentProvider.AudioType.TRACK, dVar, new a(0, this, v880.class, "playAttachment", "playAttachment()V", 0), new b(1, this, v880.class, "updateVolumeState", "updateVolumeState(Z)V", 0));
        this.J = onMediaAudioComponentProvider;
        this.K = new s780(cr4Var, onMediaAudioComponentProvider);
        View view = this.itemView;
        y780 y780Var = new y780((vuu0) view, view.getContext(), onMediaAudioComponentProvider);
        this.L = y780Var;
        this.M = onMediaAudioComponentProvider.o;
        this.N = new c();
        y780Var.d(this);
        this.itemView.addOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r7v4, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.vk.feed.core.models.news.NewsEntry] */
    @Override // xsna.rp6
    public final void R6(ol60 ol60Var) {
        NewsEntry.TrackData Cb;
        NewsEntry.TrackData Cb2;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.J;
        y780 y780Var = this.L;
        y880 y880Var = ol60Var instanceof y880 ? (y880) ol60Var : null;
        if (y880Var == null) {
            return;
        }
        MusicTrack musicTrack = y880Var.h;
        x880 c2 = x880.c(this.G, false, false, false, null, null, null, null, null, null, musicTrack, ApiInvocationException.ErrorCodes.IDS_BLOCKED);
        this.G = c2;
        if (!epx.f(c2.g, musicTrack.y)) {
            String str = this.G.f;
            ?? q6 = q6();
            if (!epx.f(str, (q6 == 0 || (Cb2 = q6.Cb()) == null) ? null : Cb2.b)) {
                onMediaAudioComponentProvider.b().d();
                onMediaAudioComponentProvider.e().b();
                onMediaAudioComponentProvider.g().o(28);
            }
        }
        u1c0 u1c0Var = this.H;
        Object obj = u1c0Var != null ? u1c0Var.g : null;
        l780 l780Var = obj instanceof l780 ? (l780) obj : null;
        if (l780Var != null) {
            t780 e = onMediaAudioComponentProvider.e();
            long j = l780Var.b;
            int i = l780Var.a;
            e.e = j;
            e.d = i;
        } else {
            onMediaAudioComponentProvider.e().b();
            u1c0 u1c0Var2 = this.H;
            if (u1c0Var2 != null) {
                u1c0Var2.g = new l780(onMediaAudioComponentProvider.e().d, onMediaAudioComponentProvider.e().e, false);
            }
        }
        x880 x880Var = this.G;
        ?? q62 = q6();
        String str2 = (q62 == 0 || (Cb = q62.Cb()) == null) ? null : Cb.b;
        String str3 = y880Var.p;
        x880 c3 = x880.c(x880Var, false, false, false, null, null, str2, null, str3, y880Var.q, null, IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT);
        this.G = c3;
        this.G = x880.c(c3, false, false, false, Integer.valueOf(musicTrack.b), Long.valueOf(musicTrack.c.b), null, musicTrack.y, null, null, null, 935);
        m780 d2 = onMediaAudioComponentProvider.d();
        String valueOf = String.valueOf(di60.n(q6()));
        x880 x880Var2 = this.G;
        Integer num = x880Var2.d;
        Long l = x880Var2.e;
        String str4 = x880Var2.f;
        d2.k = valueOf;
        d2.l = num;
        d2.m = l;
        d2.n = str4;
        onMediaAudioComponentProvider.e().h = str3;
        k780 b2 = onMediaAudioComponentProvider.b();
        b2.getClass();
        b2.h = MusicPlaybackLaunchContext.Fb(str3);
        View view = y780Var.e;
        VkImageSimple vkImageSimple = y780Var.l;
        RunningLineTextView runningLineTextView = y780Var.f;
        VkImageSimple vkImageSimple2 = y780Var.m;
        f4m.l(0, 0, view);
        f4m.q(0, view);
        if (onMediaAudioComponentProvider.a()) {
            x880 x880Var3 = this.G;
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            y780Var.l(x880Var3, com.vk.libvideo.autoplay.e.c());
        }
        this.G = x880.c(this.G, false, false, y880Var.l, null, null, null, null, null, null, null, 1019);
        if (y880Var.l) {
            bwt0.p0(vkImageSimple2, true);
        } else {
            bwt0.p0(vkImageSimple2, false);
        }
        if (y880Var.k) {
            this.G = x880.c(this.G, false, true, false, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
            runningLineTextView.setAlpha(0.5f);
            vkImageSimple.setAlpha(0.5f);
            y780Var.k.setAlpha(0.5f);
            VkOverlayCircleButton.a(y780Var.n, null, null, null, Boolean.TRUE, 15);
            vkImageSimple2.setAlpha(0.5f);
        } else {
            this.G = x880.c(this.G, false, false, false, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT);
            y780Var.a();
        }
        y780Var.k(y880Var.j);
        String str5 = y880Var.i;
        if (!str5.equals(runningLineTextView.getText())) {
            runningLineTextView.setText(str5);
        }
        cr4 cr4Var = this.E;
        if (cr4Var.c().i(musicTrack) || musicTrack.l) {
            y780Var.h();
        } else if (cr4Var.c().i0(musicTrack)) {
            y780Var.i();
        } else if (this.G.b) {
            y780Var.h();
        } else {
            bwt0.p0(vkImageSimple, false);
        }
        y780Var.g(null, null);
        BuildInfo.Client client = BuildInfo.a;
        VKApplication vKApplication = com.vk.core.apps.a.a;
        if (BuildInfo.h()) {
            bwt0.Q(this.itemView, R.id.feed_ui_test_attachment_on_media, new fto0());
        }
    }

    @Override // xsna.rp6, xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        this.H = u1c0Var;
        super.a6(u1c0Var);
        mnh0.v(this.itemView, t6());
    }

    public final void b7() {
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
        vuu0 vuu0Var = view instanceof vuu0 ? (vuu0) view : null;
        if (vuu0Var != null) {
            vuu0Var.setupBlurContent(vkBlurContentView);
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
                if (view.equals(y780Var.k) || view.equals(y780Var.j)) {
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
            onMediaAudioComponentProvider.g().j(28);
        } else if (onMediaAudioComponentProvider.a()) {
            s780Var.e(view.getContext(), t6(), this.G);
        } else {
            s780Var.d(view.getContext(), t6(), this.G);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.J;
        onMediaAudioComponentProvider.g().n((zv40) onMediaAudioComponentProvider.j.getValue());
        this.G = x880.c(this.G, true, false, false, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        mbs mbsVar = this.F;
        if (mbsVar != null) {
            mbsVar.a(this.N);
        }
        boolean a2 = onMediaAudioComponentProvider.a();
        y780 y780Var = this.L;
        if (a2) {
            x880 x880Var = this.G;
            com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
            y780Var.l(x880Var, com.vk.libvideo.autoplay.e.c());
        }
        if (this.G.b) {
            y780Var.f.f();
        } else {
            y780Var.f.e(750L);
        }
        ViewParent parent = this.itemView.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            return;
        }
        NewsEntry t6 = t6();
        if (vjf0.a(recyclerView, t6) != null) {
            b7();
            return;
        }
        w880 w880Var = this.I;
        if (w880Var != null) {
            recyclerView.removeOnChildAttachStateChangeListener(w880Var);
        }
        w880 w880Var2 = new w880(recyclerView, t6, this);
        this.I = w880Var2;
        recyclerView.addOnChildAttachStateChangeListener(w880Var2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        u1c0 u1c0Var;
        w880 w880Var = this.I;
        if (w880Var != null) {
            ViewParent parent = this.itemView.getParent();
            RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
            if (recyclerView != null) {
                recyclerView.removeOnChildAttachStateChangeListener(w880Var);
            }
        }
        this.I = null;
        OnMediaAudioComponentProvider onMediaAudioComponentProvider = this.J;
        onMediaAudioComponentProvider.g().n(null);
        this.G = x880.c(this.G, false, false, false, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
        if (onMediaAudioComponentProvider.a() && (u1c0Var = this.H) != null) {
            Object obj = u1c0Var != null ? u1c0Var.g : null;
            l780 l780Var = obj instanceof l780 ? (l780) obj : null;
            u1c0Var.g = l780Var != null ? new l780(onMediaAudioComponentProvider.e().d, onMediaAudioComponentProvider.f().getCurrentPosition(), l780Var.c) : null;
        }
        onMediaAudioComponentProvider.d().a();
        mbs mbsVar = this.F;
        if (mbsVar != null) {
            mbsVar.d(this.N);
        }
        this.L.f.f();
        this.M.removeCallbacksAndMessages(null);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.J.d();
    }

    /* compiled from: OnMediaTrackHolder.kt */
    public static final class c implements obs {
        public c() {
        }

        @Override // xsna.obs
        public final void onPause() {
            v880 v880Var = v880.this;
            v880Var.G = x880.c(v880Var.G, false, false, false, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = v880Var.J;
            onMediaAudioComponentProvider.g().o(28);
            onMediaAudioComponentProvider.b().f = true;
            v880Var.L.f.f();
        }

        @Override // xsna.obs
        public final void onResume() {
            v880 v880Var = v880.this;
            x880 c = x880.c(v880Var.G, true, false, false, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            v880Var.G = c;
            if (c.b) {
                return;
            }
            v880Var.L.f.e(750L);
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

    /* compiled from: OnMediaTrackHolder.kt */
    public static final class d implements px40 {
        public d() {
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.px40
        public final void a(ry40 ry40Var) {
            v880 v880Var = v880.this;
            y780 y780Var = v880Var.L;
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = v880Var.J;
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
                    if (!onMediaAudioComponentProvider.a()) {
                        y780Var.e(false);
                    }
                    onMediaAudioComponentProvider.b().i();
                    return;
                }
                if (ry40Var instanceof ry40.d) {
                    if (!onMediaAudioComponentProvider.a()) {
                        y780Var.e(false);
                    }
                    onMediaAudioComponentProvider.b().g();
                    return;
                } else if (ry40Var instanceof ry40.b.a) {
                    y780Var.c(false);
                    y780Var.j();
                    return;
                } else {
                    if (ry40Var instanceof ry40.b) {
                        onMediaAudioComponentProvider.b().g = true;
                        onMediaAudioComponentProvider.e().c();
                        v880Var.K.f(v880Var.t6(), v880Var.G);
                        MusicTrack musicTrack = p4b0Var.b.a;
                        ?? q6 = v880Var.q6();
                        if (q6 != 0) {
                            onMediaAudioComponentProvider.b().b(onMediaAudioComponentProvider.a(), Integer.valueOf(musicTrack.b), Long.valueOf(musicTrack.c.b), q6.Cb().b);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            y780Var.b(false);
            if (!onMediaAudioComponentProvider.a()) {
                y780Var.e(true);
            }
            if (!v880Var.G.a || !onMediaAudioComponentProvider.d().j) {
                onMediaAudioComponentProvider.g().o(28);
                return;
            }
            k780 b = onMediaAudioComponentProvider.b();
            kw40.b bVar = ((ry40.e.b) ry40Var).e;
            b.h(bVar.a.b, p4b0Var.b.a);
            boolean a = onMediaAudioComponentProvider.a();
            MusicTrack musicTrack2 = p4b0Var.b.a;
            long j = bVar.a.b;
            MusicPreviewUrl musicPreviewUrl = musicTrack2.Y;
            boolean z = j == (musicPreviewUrl != null ? (long) musicPreviewUrl.c : 0L);
            v880Var.G = x880.c(v880Var.G, false, false, false, Integer.valueOf(musicTrack2.b), Long.valueOf(musicTrack2.c.b), null, null, null, null, null, 999);
            m780 d = onMediaAudioComponentProvider.d();
            x880 x880Var = v880Var.G;
            m780.c(d, x880Var.d, x880Var.e);
            if (a) {
                if (z) {
                    k780 b2 = onMediaAudioComponentProvider.b();
                    x880 x880Var2 = v880Var.G;
                    Integer num = x880Var2.d;
                    Long l = x880Var2.e;
                    String str = x880Var2.f;
                    b2.getClass();
                    k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.AUTOPLAY, num, l, str);
                    return;
                }
                return;
            }
            if (z) {
                k780 b3 = onMediaAudioComponentProvider.b();
                x880 x880Var3 = v880Var.G;
                Integer num2 = x880Var3.d;
                Long l2 = x880Var3.e;
                String str2 = x880Var3.f;
                b3.getClass();
                k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.MANUAL, num2, l2, str2);
                return;
            }
            k780 b4 = onMediaAudioComponentProvider.b();
            x880 x880Var4 = v880Var.G;
            Integer num3 = x880Var4.d;
            Long l3 = x880Var4.e;
            String str3 = x880Var4.f;
            b4.getClass();
            k780.j(MobileOfficialAppsFeedStat$TypeFeedPostStartAudio.Subtype.PAUSE, num3, l3, str3);
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [com.vk.feed.core.models.news.NewsEntry] */
        @Override // xsna.px40
        public final void i(ly40 ly40Var) {
            v880 v880Var = v880.this;
            OnMediaAudioComponentProvider onMediaAudioComponentProvider = v880Var.J;
            ?? q6 = v880Var.q6();
            if (q6 != 0) {
                k780 b = onMediaAudioComponentProvider.b();
                long j = ly40Var.b;
                boolean a = onMediaAudioComponentProvider.a();
                x880 x880Var = v880Var.G;
                b.c(j, a, x880Var.d, x880Var.e, q6.Cb().b);
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
