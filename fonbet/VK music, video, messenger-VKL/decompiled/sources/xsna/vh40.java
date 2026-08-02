package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.audiobook.AudioBookFile;
import com.vk.dto.music.audiobook.AudioBooksAccessStatus;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.music.offline.api.exception.MalformedMusicTrackException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.k840;
import xsna.tg40;

/* compiled from: MusicDownloadInteractorImpl.kt */
/* loaded from: classes.dex */
public final class vh40 {
    public final gco a;
    public final fq40 b;
    public final sg40 c;
    public final wh40 d;
    public final abo e;
    public final MusicRestrictionPopupDisplayer f;
    public final ug40 g;
    public final ri40 h;
    public final tg40 i = new tg40();
    public final bpn0 j = new bpn0(new cd3(6));
    public final bpn0 k = new bpn0(new a68(8));
    public final bpn0 l;

    /* compiled from: MusicDownloadInteractorImpl.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Playlist, s3q0> {
        public a(vh40 vh40Var) {
            super(1, vh40Var, vh40.class, "deletePlaylist", "deletePlaylist(Lcom/vk/dto/music/Playlist;Z)V", 0);
        }

        @Override // xsna.izs
        public final s3q0 invoke(Playlist playlist) {
            ((vh40) this.receiver).e(playlist, false);
            return s3q0.a;
        }
    }

    /* compiled from: MusicDownloadInteractorImpl.kt */
    /* loaded from: classes3.dex */
    public static final class b implements izs {
        public final /* synthetic */ vh40 b;
        public final /* synthetic */ Playlist c;

        public b(Playlist playlist, vh40 vh40Var) {
            this.b = vh40Var;
            this.c = playlist;
        }

        @Override // xsna.izs
        public final Object invoke(Object obj) {
            vh40 vh40Var = this.b;
            List<MusicTrack> d = vh40Var.e.d((List) obj);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : d) {
                MusicTrack musicTrack = (MusicTrack) obj2;
                if (!musicTrack.B() && !(musicTrack.J instanceof DownloadingState.Downloaded)) {
                    arrayList.add(obj2);
                }
            }
            Playlist playlist = this.c;
            playlist.y = arrayList;
            return vh40Var.d.V(o25.a().c(), playlist);
        }
    }

    public vh40(gco gcoVar, fq40 fq40Var, sg40 sg40Var, wh40 wh40Var, abo aboVar, MusicRestrictionPopupDisplayer musicRestrictionPopupDisplayer, vi40 vi40Var, vi40 vi40Var2) {
        this.a = gcoVar;
        this.b = fq40Var;
        this.c = sg40Var;
        this.d = wh40Var;
        this.e = aboVar;
        this.f = musicRestrictionPopupDisplayer;
        this.g = vi40Var;
        this.h = vi40Var2;
        wh40Var.R(n());
        this.l = new bpn0(new ug9(4));
    }

    public final boolean a() {
        bpn0 bpn0Var = k840.a.a;
        if (k840.a.i.c() && com.vk.core.utils.newtork.b.c().e.b) {
            return n();
        }
        return true;
    }

    public final void b(Playlist playlist) {
        tg40 tg40Var = this.i;
        tg40Var.a("download_all_disposable");
        tg40.a.a(io.reactivex.rxjava3.core.q.T(playlist.y).r0(asu0.a.c()).C(new ph40(0, this, playlist)).subscribe(new gl30(new u6k(this, 25), 1)), tg40Var, "cancel_common_disposable");
    }

    public final io.reactivex.rxjava3.internal.operators.completable.u c(final int i) {
        final UserId c = o25.a().c();
        io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.th40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sg40 sg40Var = vh40.this.c;
                qh4 qh4Var = sg40Var.h;
                int i2 = i;
                UserId userId = c;
                return sg40Var.d(userId, qh4Var.A(i2, userId));
            }
        }), new b630(new wi6(this, c, i, 2), 3));
        asu0 asu0Var = asu0.a;
        return sVar.q(asu0Var.c()).o(asu0Var.d());
    }

    public final io.reactivex.rxjava3.internal.operators.completable.u d(UserId userId) {
        UserId c = o25.a().c();
        io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new h83(1, userId, this, c)), new mm6(new jh3(this, c, userId, 6), 29));
        asu0 asu0Var = asu0.a;
        return sVar.q(asu0Var.c()).o(asu0Var.d());
    }

    @SuppressLint({"CheckResult"})
    public final void e(Playlist playlist, boolean z) {
        this.i.a(playlist.Ib());
        io.reactivex.rxjava3.internal.operators.single.v vVar = new io.reactivex.rxjava3.internal.operators.single.v(new eh40(0, this, playlist));
        asu0 asu0Var = asu0.a;
        new io.reactivex.rxjava3.internal.operators.single.r(vVar.q(asu0Var.c()), new d9(new hdw(this, playlist, z, 1), 24)).m(asu0Var.d()).subscribe(new pd40(new f410(playlist, 10), 1));
    }

    @SuppressLint({"CheckResult"})
    public final void f(MusicTrack musicTrack) {
        String str = musicTrack.Z;
        int i = 4;
        int i2 = 6;
        if (musicTrack.Vb()) {
            UserId userId = musicTrack.c;
            final String Fb = musicTrack.Fb();
            final UserId c = o25.a().c();
            io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.rh40
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    sg40 sg40Var = vh40.this.c;
                    MusicTrack z = sg40Var.j.z(c, Fb);
                    if (z != null) {
                        sg40Var.a.O(z);
                    }
                    return z;
                }
            }), new r2v(new xxh(this, c, userId, i), i2));
            asu0 asu0Var = asu0.a;
            tg40.a.a(sVar.q(asu0Var.c()).o(asu0Var.d()).subscribe(), this.i, musicTrack.Fb());
            return;
        }
        if (musicTrack.W != null && str != null) {
            String str2 = (String) j5g.a0(drm0.b0(str, new char[]{'_'}, 0, 6));
            Long n = str2 != null ? arm0.n(str2) : null;
            String str3 = (String) j5g.k0(drm0.b0(str, new char[]{'_'}, 0, 6));
            Integer m = str3 != null ? arm0.m(10, str3) : null;
            if (n != null && m != null) {
                f(MusicTrack.zb(musicTrack, m.intValue(), new UserId(n.longValue()), 0, 0, null, false, null, null, false, false, null, null, null, -4, 786431));
            }
        }
        int i3 = 6;
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.v(new d700(1, this, musicTrack)), new mh40(new bp7(21, this, musicTrack), 0)).C(new g57(this, i3)), new nh40(new wik(this, 28), 0));
        asu0 asu0Var2 = asu0.a;
        i0Var.r0(asu0Var2.c()).a0(asu0Var2.d()).C(new fa(musicTrack, i3)).subscribe(new o7y(new a(this), 4));
    }

    public final void g(Context context, Playlist playlist) {
        io.reactivex.rxjava3.core.x f0;
        if (!a()) {
            this.f.h(context, new kt(this, context, playlist, 2));
            return;
        }
        if (!k840.a.i.c()) {
            MusicRestrictionPopupDisplayer.e(this.f, context, "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
            return;
        }
        if (playlist.y.isEmpty()) {
            io.reactivex.rxjava3.core.q<R> t = io.reactivex.rxjava3.core.q.e0(0, 10).t(new t7(new x2y(this, 15), 23));
            aa6 aa6Var = new aa6(new leq(18), 27);
            t.getClass();
            f0 = new io.reactivex.rxjava3.internal.operators.observable.r2(t, aa6Var).f0(new ArrayList(), new gs00(new k8d((byte) 0, 3), 3));
        } else {
            f0 = io.reactivex.rxjava3.core.x.k(playlist.y);
        }
        tg40.a.a(new io.reactivex.rxjava3.internal.operators.mixed.q(f0, new ac20(new b(playlist, this), 3)).F(new f5y(new qb6(18, this, playlist), 5)).subscribe(), this.i, "download_all_disposable");
    }

    public final void h(Context context, final AudioBook audioBook, final AudioBookChapter audioBookChapter) {
        if (!a()) {
            this.f.h(context, new lh40(this, context, audioBook, audioBookChapter, 0));
        } else if (audioBook.Ab() != AudioBooksAccessStatus.FREE && !k840.a.i.c()) {
            MusicRestrictionPopupDisplayer.e(this.f, context, "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
        } else {
            final be4 be4Var = new be4(audioBook, audioBookChapter, this.a);
            final UserId c = o25.a().c();
            final sg40 sg40Var = this.c;
            sg40Var.n.execute(new Runnable() { // from class: xsna.rg40
                @Override // java.lang.Runnable
                public final void run() {
                    AudioBookChapter audioBookChapter2 = AudioBookChapter.this;
                    AudioBookFile audioBookFile = audioBookChapter2.d;
                    String str = audioBookFile != null ? audioBookFile.b : null;
                    be4 be4Var2 = be4Var;
                    if (str == null) {
                        be4Var2.e(new MalformedMusicTrackException("AudioBookChapter url is null, can't download"));
                        return;
                    }
                    sg40 sg40Var2 = sg40Var;
                    qh4 qh4Var = sg40Var2.h;
                    wh40 wh40Var = sg40Var2.a;
                    UserId c2 = o25.a().c();
                    AudioBook audioBook2 = audioBook;
                    AudioBook y = qh4Var.y(audioBook2.b, c2);
                    UserId userId = c;
                    if (y == null) {
                        sg40Var2.h.z(userId, audioBook2);
                        wh40Var.X(audioBook2);
                    }
                    wh40Var.K(userId, audioBookChapter2, audioBook2.b, be4Var2);
                }
            });
        }
    }

    public final void i(Activity activity, final PodcastInfo podcastInfo, final MusicTrack musicTrack) {
        if (!a()) {
            this.f.h(activity, new ih40(this, activity, podcastInfo, musicTrack, 0));
        } else {
            final ifp0 ifp0Var = new ifp0(musicTrack, this.a);
            final UserId c = o25.a().c();
            final sg40 sg40Var = this.c;
            sg40Var.n.execute(new Runnable() { // from class: xsna.mg40
                @Override // java.lang.Runnable
                public final void run() {
                    Object obj;
                    MusicTrack musicTrack2 = MusicTrack.this;
                    String str = musicTrack2.i;
                    ifp0 ifp0Var2 = ifp0Var;
                    if (str == null) {
                        ifp0Var2.e(new MalformedMusicTrackException("PodcastEpisode url is null, can't download"));
                        return;
                    }
                    sg40 sg40Var2 = sg40Var;
                    whb0 whb0Var = sg40Var2.i;
                    wh40 wh40Var = sg40Var2.a;
                    Podcast n = whb0Var.n(o25.a().c(), musicTrack2.c);
                    UserId userId = c;
                    if (n == null) {
                        UserId userId2 = musicTrack2.c;
                        blb0 blb0Var = (blb0) sg40Var2.r.getValue();
                        StringBuilder sb = new StringBuilder();
                        sb.append(userId2);
                        sb.append('_');
                        PodcastInfo podcastInfo2 = podcastInfo;
                        sb.append(podcastInfo2.n);
                        try {
                            obj = rsg0.a0(yfb.x(blb0Var.c(sb.toString()))).U(new hl30(new rm0(18, podcastInfo2, userId2), 2)).a();
                        } catch (Throwable unused) {
                            obj = null;
                        }
                        Podcast podcast = (Podcast) obj;
                        if (podcast == null) {
                            ifp0Var2.e(new MalformedMusicTrackException("Can't get podcast, can't download"));
                            return;
                        } else {
                            sg40Var2.i.a(userId, podcast);
                            wh40Var.g0(podcast);
                        }
                    }
                    wh40Var.d0(userId, musicTrack2, musicTrack2.c, ifp0Var2);
                }
            });
        }
    }

    public final void j(Context context, Playlist playlist) {
        if (!a()) {
            this.f.h(context, new sdr(this, context, playlist, 3));
        } else if (k840.a.i.c()) {
            k(playlist);
        } else {
            MusicRestrictionPopupDisplayer.e(this.f, context, "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
        }
    }

    public final void k(Playlist playlist) {
        tg40.a.a(new io.reactivex.rxjava3.internal.operators.mixed.q(new io.reactivex.rxjava3.internal.operators.single.n(new io.reactivex.rxjava3.internal.operators.single.v(new qi0(2, this, playlist)).q(asu0.a.c()), new dh40(new ch40(0, playlist), 0)), new dg1(new qd1(23, playlist, this), 29)).F(new amt(new defpackage.m(24, this, playlist), 12)).subscribe(), this.i, playlist.Ib());
    }

    public final void l(Context context, MusicTrack musicTrack) {
        if (!a()) {
            this.f.h(context, new bfb(this, context, musicTrack, 4));
        } else if (k840.a.i.c()) {
            m(musicTrack);
        } else {
            MusicRestrictionPopupDisplayer.e(this.f, context, "download", MusicPlaybackLaunchContext.d, null, null, null, 56);
        }
    }

    public final void m(MusicTrack musicTrack) {
        if (((Boolean) this.j.getValue()).booleanValue()) {
            io.reactivex.rxjava3.internal.operators.observable.s0 s0Var = new io.reactivex.rxjava3.internal.operators.observable.s0(new p68(2, this, musicTrack));
            asu0 asu0Var = asu0.a;
            tg40.a.a(s0Var.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new b0y(new v74(21, musicTrack, this), 10)), this.i, musicTrack.Fb());
        } else {
            ifp0 ifp0Var = new ifp0(musicTrack, this.a);
            UserId c = o25.a().c();
            sg40 sg40Var = this.c;
            sg40Var.n.execute(new f1t(musicTrack, ifp0Var, sg40Var, c, 1));
        }
    }

    public final boolean n() {
        return Preference.j().getBoolean("music_mobile_network_download", false);
    }

    public final io.reactivex.rxjava3.core.q o(MusicTrack musicTrack, List list) {
        if (!list.isEmpty()) {
            return new io.reactivex.rxjava3.internal.operators.observable.o0(io.reactivex.rxjava3.core.q.O(list), new i630(new np5(16, this, musicTrack), 2));
        }
        UserId c = o25.a().c();
        sg40 sg40Var = this.c;
        return new io.reactivex.rxjava3.internal.operators.observable.t0(sg40Var.n.submit(new ng40(sg40Var, c, musicTrack, null))).L(new dt(new bqt(9), 20), false);
    }
}
