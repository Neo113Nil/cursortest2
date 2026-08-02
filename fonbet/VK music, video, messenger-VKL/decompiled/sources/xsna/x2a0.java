package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
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

/* compiled from: PhoneBookStoriesVideoItemHolder.kt */
/* loaded from: classes4.dex */
public final class x2a0 extends BaseVideoAutoPlayHolder<z1c0, VideoAttachment> implements ydx, gex.b {
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
    public aex.a y0;
    public final r2a0 z0;

    /* compiled from: PhoneBookStoriesVideoItemHolder.kt */
    public static final class b implements nam0.a {
        public b() {
        }

        @Override // xsna.nam0.a
        public final boolean a() {
            yg5 yg5Var = x2a0.this.h0;
            return yg5Var != null && yg5Var.V();
        }

        @Override // xsna.nam0.a
        public final void b() {
            yg5 yg5Var = x2a0.this.h0;
            if (yg5Var != null) {
                yg5Var.pause();
            }
        }

        @Override // xsna.nam0.a
        public final void c() {
            yg5 yg5Var;
            x2a0 x2a0Var = x2a0.this;
            yg5 yg5Var2 = x2a0Var.h0;
            if (yg5Var2 == null || !yg5Var2.j0(x2a0Var.L.v) || (yg5Var = x2a0Var.h0) == null) {
                return;
            }
            yg5Var.S(false);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.nam0.a
        public final void d(float f, long j) {
            yg5 yg5Var;
            x2a0 x2a0Var = x2a0.this;
            yg5 yg5Var2 = x2a0Var.h0;
            if (yg5Var2 != null && yg5Var2.isPaused() && (yg5Var = x2a0Var.h0) != null) {
                yg5Var.D();
            }
            ((StoryProgressView) x2a0Var.u0.getValue()).setProgress(f);
            aex.a aVar = x2a0Var.y0;
            if (aVar != null) {
                aVar.a = Long.valueOf(j);
            }
        }

        @Override // xsna.nam0.a
        public final void onStart() {
            yg5 yg5Var = x2a0.this.h0;
            if (yg5Var != null) {
                yg5Var.play();
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x2a0(ViewGroup viewGroup, InterestingStoriesHolderViewImpl interestingStoriesHolderViewImpl, gex.a aVar, zex zexVar, InterestingStoriesBlockEventDispatcher interestingStoriesBlockEventDispatcher) {
        super(r1, viewGroup, aVar.a, r4, interestingStoriesHolderViewImpl);
        sps0 sps0Var = new sps0(null, null, false, 255);
        y2a0 y2a0Var = new y2a0(viewGroup.getContext());
        if (aVar.a == null) {
            throw new NoWhenBranchMatchedException();
        }
        this.s0 = zexVar;
        this.t0 = interestingStoriesBlockEventDispatcher;
        nm60 nm60Var = new nm60(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        Lazy a2 = msy.a(lazyThreadSafetyMode, nm60Var);
        this.u0 = a2;
        this.v0 = msy.a(lazyThreadSafetyMode, new ufk(this, 25));
        this.w0 = msy.a(lazyThreadSafetyMode, new vt30(this, 11));
        this.x0 = msy.a(lazyThreadSafetyMode, new uq50(this, 9));
        r2a0 r2a0Var = new r2a0(zexVar);
        this.z0 = r2a0Var;
        this.A0 = new nam0();
        this.B0 = new eiq((StoryProgressView) a2.getValue());
        this.C0 = msy.a(lazyThreadSafetyMode, new x850(this, 5));
        jjc.g(this.itemView, new el30(this, 14));
        Context context = this.itemView.getContext();
        View view = this.itemView;
        r2a0Var.b(context, view instanceof y2a0 ? (y2a0) view : null, new wf40(this, 7));
    }

    @Override // xsna.ydx
    public final void F4() {
        boolean f = epx.f(this.y0, this.t0.g());
        nam0 nam0Var = this.A0;
        eiq eiqVar = this.B0;
        if (!f) {
            J7();
            eiqVar.a(new lo10(this, 11));
            nam0Var.cancel();
            return;
        }
        J7();
        eiqVar.a(new lo10(this, 11));
        nam0Var.cancel();
        yg5 yg5Var = this.h0;
        if (yg5Var != null && yg5Var.p0()) {
            eiqVar.b(new w2a0(0));
            nam0Var.setStartDelay(nam0Var.b);
            nam0Var.start();
        }
        this.s0.f();
    }

    @Override // xsna.ydx
    public final void H1() {
        sht0 sht0Var;
        this.A0.cancel();
        this.B0.a(new ko00(this, 16));
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
        return com.vk.libvideo.autoplay.a.a(super.k7(), null, null, SubtitlesConfigurationMode.ALWAYS_DISABLED, new toz.a(), null, null, 510911);
    }

    @Override // xsna.gex.b
    public final void n5(aex aexVar) {
        if (aexVar instanceof aex.a.b) {
            this.y0 = (aex.a) aexVar;
            b7(((aex.a.b) aexVar).e);
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

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.newsfeed.common.recycler.holders.BaseVideoAutoPlayHolder, xsna.eq6
    /* renamed from: z7 */
    public final void c7(VideoAttachment videoAttachment) {
        StoryEntry b2;
        StoryOwner storyOwner;
        aex.a aVar;
        StoryEntry b3;
        StoryOwner storyOwner2;
        String Db;
        StoryEntry b4;
        StoryOwner storyOwner3;
        super.c7(videoAttachment);
        TextView textView = (TextView) this.v0.getValue();
        aex.a aVar2 = this.y0;
        textView.setText((aVar2 == null || (b4 = aVar2.b()) == null || (storyOwner3 = b4.l0) == null) ? null : storyOwner3.Db());
        View view = (View) this.w0.getValue();
        aex.a aVar3 = this.y0;
        view.setContentDescription((aVar3 == null || (b3 = aVar3.b()) == null || (storyOwner2 = b3.l0) == null || (Db = storyOwner2.Db()) == null) ? null : x6(R.string.accessibility_discover_author, Db));
        yg5 yg5Var = this.h0;
        if (yg5Var != null && (aVar = this.y0) != null) {
            aVar.b = Long.valueOf(yg5Var.getDuration());
        }
        View view2 = this.itemView;
        y2a0 y2a0Var = view2 instanceof y2a0 ? (y2a0) view2 : null;
        aex.a aVar4 = this.y0;
        String Db2 = (aVar4 == null || (b2 = aVar4.b()) == null || (storyOwner = b2.l0) == null) ? null : storyOwner.Db();
        this.z0.getClass();
        if (y2a0Var != null) {
            bwt0.p0(y2a0Var.getUserNameView(), true ^ (Db2 == null || Db2.length() == 0));
            y2a0Var.getUserNameView().setText(Db2);
        }
        Context context = this.itemView.getContext();
        View view3 = this.itemView;
        y2a0 y2a0Var2 = view3 instanceof y2a0 ? (y2a0) view3 : null;
        aex.a aVar5 = this.y0;
        r2a0.a(context, y2a0Var2, aVar5 != null ? aVar5.b() : null);
    }

    /* compiled from: PhoneBookStoriesVideoItemHolder.kt */
    public static final class a implements hnt0 {
        public final nam0 b;
        public WeakReference<x2a0> c;

        public a(nam0 nam0Var) {
            this.b = nam0Var;
        }

        @Override // xsna.hnt0
        public final void V3(yg5 yg5Var) {
            x2a0 x2a0Var;
            WeakReference<x2a0> weakReference = this.c;
            if (weakReference == null || (x2a0Var = weakReference.get()) == null) {
                return;
            }
            int i = x2a0.D0;
            if (!epx.f(x2a0Var.y0, x2a0Var.t0.g()) || this.b.isRunning()) {
                return;
            }
            x2a0Var.J7();
        }

        @Override // xsna.hnt0
        public final void X1(VideoAutoPlay videoAutoPlay, long j, long j2) {
            x2a0 x2a0Var;
            WeakReference<x2a0> weakReference = this.c;
            if (weakReference == null || (x2a0Var = weakReference.get()) == null) {
                return;
            }
            int i = x2a0.D0;
            if (epx.f(x2a0Var.y0, x2a0Var.t0.g())) {
                return;
            }
            x2a0Var.J7();
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
