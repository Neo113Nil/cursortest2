package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.libvideo.api.subtitles.SubtitlesConfigurationMode;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesBlockEventDispatcher;
import com.vk.newsfeed.common.recycler.holders.story.discover.InterestingStoriesHolderViewImpl;
import com.vk.stories.design.view.StoryProgressView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import one.video.cast.manager.status.MediaRouteConnectStatus;
import one.video.exo.offline.DownloadInfo;
import one.video.player.error.OneVideoPlaybackException;
import one.video.player.model.text.SubtitleRenderItem;
import xsna.aex;
import xsna.gex;
import xsna.nam0;
import xsna.o1b0;
import xsna.toz;
import xsna.ye0;

/* compiled from: InterestingStoriesBlockVideoItemHolder.kt */
/* loaded from: classes4.dex */
public final class wex extends BaseVideoAutoPlayHolder<z1c0, VideoAttachment> implements w8i, ydx, gex.b {
    public static final /* synthetic */ int D0 = 0;
    public final nam0 A0;
    public final eiq B0;
    public final Object C0;
    public final pdx s0;
    public final InterestingStoriesBlockEventDispatcher t0;
    public final Object u0;
    public final Object v0;
    public final Object w0;
    public final Object x0;
    public final Object y0;
    public aex.a z0;

    /* compiled from: InterestingStoriesBlockVideoItemHolder.kt */
    public static final class b implements nam0.a {
        public b() {
        }

        @Override // xsna.nam0.a
        public final boolean a() {
            yg5 yg5Var = wex.this.h0;
            return yg5Var != null && yg5Var.V();
        }

        @Override // xsna.nam0.a
        public final void b() {
            yg5 yg5Var = wex.this.h0;
            if (yg5Var != null) {
                yg5Var.pause();
            }
        }

        @Override // xsna.nam0.a
        public final void c() {
            yg5 yg5Var;
            wex wexVar = wex.this;
            yg5 yg5Var2 = wexVar.h0;
            if (yg5Var2 == null || !yg5Var2.j0(wexVar.L.v) || (yg5Var = wexVar.h0) == null) {
                return;
            }
            yg5Var.S(false);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.nam0.a
        public final void d(float f, long j) {
            yg5 yg5Var;
            wex wexVar = wex.this;
            yg5 yg5Var2 = wexVar.h0;
            if (yg5Var2 != null && yg5Var2.isPaused() && (yg5Var = wexVar.h0) != null) {
                yg5Var.D();
            }
            ((StoryProgressView) wexVar.v0.getValue()).setProgress(f);
            aex.a aVar = wexVar.z0;
            if (aVar != null) {
                aVar.a = Long.valueOf(j);
            }
        }

        @Override // xsna.nam0.a
        public final void onStart() {
            yg5 yg5Var = wex.this.h0;
            if (yg5Var != null) {
                yg5Var.play();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wex(ViewGroup viewGroup, InterestingStoriesHolderViewImpl interestingStoriesHolderViewImpl, gex.a aVar, zex zexVar, InterestingStoriesBlockEventDispatcher interestingStoriesBlockEventDispatcher) {
        super(r1, viewGroup, aVar.a, r4, interestingStoriesHolderViewImpl);
        sps0 sps0Var = new sps0(null, null, false, 255);
        xex xexVar = new xex(viewGroup.getContext());
        if (aVar.a == null) {
            throw new NoWhenBranchMatchedException();
        }
        this.s0 = zexVar;
        this.t0 = interestingStoriesBlockEventDispatcher;
        getContext();
        xis xisVar = new xis(this, 11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, xisVar);
        this.u0 = a2;
        Lazy a3 = msy.a(lazyThreadSafetyMode, new vex(this, 0));
        this.v0 = a3;
        this.w0 = msy.a(lazyThreadSafetyMode, new b1j(this, 29));
        this.x0 = msy.a(lazyThreadSafetyMode, new bzj(this, 20));
        this.y0 = msy.a(lazyThreadSafetyMode, new nuj(this, 15));
        this.A0 = new nam0();
        this.B0 = new eiq((StoryProgressView) a3.getValue());
        this.C0 = msy.a(lazyThreadSafetyMode, new v3n(this, 13));
        jjc.g(this.itemView, new sop(this, 17));
        jjc.g((ImageView) a2.getValue(), new owv(this, 2));
    }

    @Override // xsna.ydx
    public final void F4() {
        boolean f = epx.f(this.z0, this.t0.g());
        nam0 nam0Var = this.A0;
        eiq eiqVar = this.B0;
        if (!f) {
            J7();
            eiqVar.a(new k5h(this, 23));
            nam0Var.cancel();
            return;
        }
        J7();
        eiqVar.a(new k5h(this, 23));
        nam0Var.cancel();
        eiqVar.b(new i13(15));
        nam0Var.setStartDelay(nam0Var.b);
        nam0Var.start();
        this.s0.f();
    }

    @Override // xsna.ydx
    public final void H1() {
        sht0 sht0Var;
        this.A0.cancel();
        this.B0.a(new yqf(this, 27));
        yg5 yg5Var = this.h0;
        VideoAutoPlay videoAutoPlay = yg5Var instanceof VideoAutoPlay ? (VideoAutoPlay) yg5Var : null;
        if (videoAutoPlay == null || (sht0Var = videoAutoPlay.l0) == null) {
            return;
        }
        o1b0 c = qu5.c();
        o1b0.a aVar = o1b0.a;
        c.f(sht0Var, true);
    }

    public final void J7() {
        yg5 yg5Var = this.h0;
        if (yg5Var != null) {
            yg5Var.pause();
        }
        yg5 yg5Var2 = this.h0;
        if (yg5Var2 != null) {
            yg5Var2.seek(0L);
        }
    }

    @Override // xsna.ydx
    public final void V2() {
        F4();
    }

    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder
    public final com.vk.libvideo.autoplay.a k7() {
        return com.vk.libvideo.autoplay.a.a(super.k7(), null, null, SubtitlesConfigurationMode.ALWAYS_DISABLED, new toz.a(), null, null, 508863);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gex.b
    public final void n5(aex aexVar) {
        if (aexVar instanceof aex.a.b) {
            this.z0 = (aex.a) aexVar;
            aex.a.b bVar = (aex.a.b) aexVar;
            dex.a((ImageView) this.u0.getValue(), this.s0.c(bVar.d));
            b7(bVar.e);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        super.onViewAttachedToWindow(view);
        ?? r4 = this.C0;
        a aVar = (a) r4.getValue();
        aVar.getClass();
        aVar.c = new WeakReference<>(this);
        yg5 yg5Var = this.h0;
        if (yg5Var != null) {
            yg5Var.f0((a) r4.getValue());
        }
        this.t0.add(this);
        yg5 yg5Var2 = this.h0;
        this.A0.a(yg5Var2 != null ? yg5Var2.getDuration() : 0L, new b());
        F4();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.fi, android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        super.onViewDetachedFromWindow(view);
        yg5 yg5Var = this.h0;
        ?? r0 = this.C0;
        if (yg5Var != null) {
            yg5Var.T((a) r0.getValue());
        }
        ((a) r0.getValue()).c = null;
        this.t0.remove(this);
        nam0 nam0Var = this.A0;
        nam0Var.cancel();
        nam0Var.c = null;
        nam0Var.removeListener(nam0Var.f);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.eq6
    /* renamed from: z7, reason: merged with bridge method [inline-methods] */
    public final void c7(VideoAttachment videoAttachment) {
        aex.a aVar;
        StoryEntry b2;
        StoryOwner storyOwner;
        String Db;
        StoryEntry b3;
        StoryOwner storyOwner2;
        super.c7(videoAttachment);
        TextView textView = (TextView) this.w0.getValue();
        aex.a aVar2 = this.z0;
        String str = null;
        textView.setText((aVar2 == null || (b3 = aVar2.b()) == null || (storyOwner2 = b3.l0) == null) ? null : storyOwner2.Db());
        View view = (View) this.x0.getValue();
        aex.a aVar3 = this.z0;
        if (aVar3 != null && (b2 = aVar3.b()) != null && (storyOwner = b2.l0) != null && (Db = storyOwner.Db()) != null) {
            str = x6(R.string.accessibility_discover_author, Db);
        }
        view.setContentDescription(str);
        yg5 yg5Var = this.h0;
        if (yg5Var == null || (aVar = this.z0) == null) {
            return;
        }
        aVar.b = Long.valueOf(yg5Var.getDuration());
    }

    /* compiled from: InterestingStoriesBlockVideoItemHolder.kt */
    public static final class a implements hnt0 {
        public final nam0 b;
        public WeakReference<wex> c;

        public a(nam0 nam0Var) {
            this.b = nam0Var;
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            wex wexVar;
            WeakReference<wex> weakReference = this.c;
            if (weakReference == null || (wexVar = weakReference.get()) == null) {
                return;
            }
            int i = wex.D0;
            if (!epx.f(wexVar.z0, wexVar.t0.g()) || this.b.isRunning()) {
                return;
            }
            wexVar.J7();
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            wex wexVar;
            WeakReference<wex> weakReference = this.c;
            if (weakReference == null || (wexVar = weakReference.get()) == null) {
                return;
            }
            int i = wex.D0;
            if (epx.f(wexVar.z0, wexVar.t0.g())) {
                return;
            }
            wexVar.J7();
        }

        @Override // xsna.hnt0
        public final void E() {
        }

        @Override // xsna.hnt0
        public final void c2() {
        }

        @Override // xsna.hnt0
        public final void h() {
        }

        @Override // xsna.hnt0
        public final void j() {
        }

        @Override // xsna.hnt0
        public final void t2() {
        }

        @Override // xsna.hnt0
        public final void u() {
        }

        @Override // xsna.hnt0
        public final void K2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void O(one.video.player.tracks.c cVar) {
        }

        @Override // xsna.hnt0
        public final void R3(MediaRouteConnectStatus mediaRouteConnectStatus) {
        }

        @Override // xsna.hnt0
        public final void S2(long j) {
        }

        @Override // xsna.hnt0
        public final void T0(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void U0(one.video.player.tracks.b bVar) {
        }

        @Override // xsna.hnt0
        public final void U3(DownloadInfo downloadInfo) {
        }

        @Override // xsna.hnt0
        public final void a(boolean z) {
        }

        @Override // xsna.hnt0
        public final void d4(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void j4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void l(x2s0 x2s0Var) {
        }

        @Override // xsna.hnt0
        public final void m4(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void n2(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p0(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void p2(VideoAutoPlay videoAutoPlay) {
        }

        @Override // xsna.hnt0
        public final void q(List<? extends SubtitleRenderItem> list) {
        }

        @Override // xsna.hnt0
        public final void r1(yg5 yg5Var) {
        }

        @Override // xsna.hnt0
        public final void x0(boolean z) {
        }

        @Override // xsna.hnt0
        public final void H(long j, long j2) {
        }

        @Override // xsna.hnt0
        public final void K0(com.vk.libvideo.autoplay.a aVar, com.vk.libvideo.autoplay.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void N3(VideoAutoPlay videoAutoPlay, long j) {
        }

        @Override // xsna.hnt0
        public final void P1(VideoAutoPlay videoAutoPlay, boolean z) {
        }

        @Override // xsna.hnt0
        public final void g(com.vk.libvideo.api.ad.a aVar, ye0.a aVar2) {
        }

        @Override // xsna.hnt0
        public final void m(je0 je0Var, com.vk.libvideo.api.ad.a aVar) {
        }

        @Override // xsna.hnt0
        public final void z0(VideoAutoPlay videoAutoPlay, int i) {
        }

        @Override // xsna.hnt0
        public final void E3(VideoAutoPlay videoAutoPlay, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void h3(yg5 yg5Var, int i, int i2) {
        }

        @Override // xsna.hnt0
        public final void J3(yg5 yg5Var, int i, int i2, OneVideoPlaybackException.ErrorCode errorCode, Throwable th) {
        }
    }
}
