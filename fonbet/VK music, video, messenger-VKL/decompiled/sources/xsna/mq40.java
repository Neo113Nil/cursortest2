package xsna;

import android.app.Activity;
import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.music.offline.api.exception.DownloadingMusicAtWrongNetworkStateException;
import com.vk.music.offline.api.exception.SubscriptionExpiredException;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import xsna.k840;
import xsna.ky6;
import xsna.tg40;

/* compiled from: MusicOfflineManagerImpl.kt */
/* loaded from: classes.dex */
public final class mq40 implements lq40, ri40 {
    public final vh40 a;
    public final dq40 b;
    public final yq40 c;
    public final ri40 d;

    public mq40(vh40 vh40Var, dq40 dq40Var, yq40 yq40Var, vi40 vi40Var) {
        this.a = vh40Var;
        this.b = dq40Var;
        this.c = yq40Var;
        this.d = vi40Var;
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.x<List<MusicTrack>> A() {
        return this.b.A();
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.a B() {
        io.reactivex.rxjava3.core.x<List<UserId>> F = this.b.F();
        x34 x34Var = new x34(new o440(this, 2), 18);
        F.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.s(F, x34Var);
    }

    @Override // xsna.g9o
    public final void C(Context context, AudioBook audioBook, AudioBookChapter audioBookChapter) {
        this.a.h(context, audioBook, audioBookChapter);
    }

    @Override // xsna.g9o
    public final io.reactivex.rxjava3.core.a D(int i, final String str) {
        final UserId c = o25.a().c();
        final vh40 vh40Var = this.a;
        io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new Callable() { // from class: xsna.fh40
            @Override // java.util.concurrent.Callable
            public final Object call() {
                sg40 sg40Var = vh40.this.c;
                AudioBookChapter d = sg40Var.g.d(c, str);
                if (d != null) {
                    sg40Var.a.e0(d);
                }
                return d;
            }
        }), new v34(new gh40(vh40Var, c, i, 0), 14));
        asu0 asu0Var = asu0.a;
        return sVar.q(asu0Var.c()).o(asu0Var.d());
    }

    @Override // xsna.g9o
    public final void E(Context context, Playlist playlist) {
        this.a.j(context, playlist);
    }

    @Override // xsna.g9o
    public final void F(List<MusicTrack> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.a.f((MusicTrack) it.next());
        }
    }

    @Override // xsna.g9o
    public final void G(Playlist playlist, boolean z) {
        this.a.e(playlist, z);
    }

    @Override // xsna.jco
    public final void H() {
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putBoolean("playlist_prev_mm", true);
        aVar.apply();
    }

    @Override // xsna.li40
    public final boolean I() {
        return this.a.a();
    }

    @Override // xsna.g9o
    public final void J(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        vh40 vh40Var = this.a;
        io.reactivex.rxjava3.internal.operators.observable.p0 p0Var = new io.reactivex.rxjava3.internal.operators.observable.p0(new io.reactivex.rxjava3.internal.operators.observable.s0(new jh40(vh40Var, list)), new pr(new byo(12), 26));
        asu0 asu0Var = asu0.a;
        tg40.a.a(p0Var.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new zk30(new xgv(vh40Var, 15), 2)), vh40Var.i, "common_disposable");
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.k<Playlist> K(int i, UserId userId) {
        return this.b.K(i, userId);
    }

    @Override // xsna.g9o
    public final void L(MusicTrack musicTrack) {
        this.a.f(musicTrack);
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.q<List<MusicTrack>> M(UserId userId, OfflineEntitySortType offlineEntitySortType) {
        return this.b.M(userId, offlineEntitySortType);
    }

    @Override // xsna.g9o
    public final io.reactivex.rxjava3.core.a N(UserId userId) {
        return this.a.d(userId);
    }

    @Override // xsna.vd50
    public final void O(boolean z, UserId userId, MusicTrack musicTrack, oya0 oya0Var) {
        this.b.O(z, userId, musicTrack, oya0Var);
    }

    @Override // xsna.li40
    public final boolean P() {
        return this.a.n();
    }

    @Override // xsna.g9o
    public final void Q(MusicTrack musicTrack) {
        vh40 vh40Var = this.a;
        if (!vh40Var.a()) {
            throw new DownloadingMusicAtWrongNetworkStateException();
        }
        if (!k840.a.i.c()) {
            throw new SubscriptionExpiredException();
        }
        vh40Var.m(musicTrack);
    }

    @Override // xsna.g9o
    public final void R(Context context, MusicTrack musicTrack) {
        this.a.l(context, musicTrack);
    }

    @Override // xsna.li40
    public final void S(boolean z) {
        ky6.a aVar = (ky6.a) Preference.j().edit();
        aVar.putBoolean("music_mobile_network_download", z);
        aVar.a();
        this.a.d.R(z);
    }

    @Override // xsna.g9o
    public final void T(Context context, Playlist playlist) {
        String Ib = playlist.b == -1 ? "download_all_disposable" : playlist.Ib();
        vh40 vh40Var = this.a;
        fq40 fq40Var = vh40Var.b;
        io.reactivex.rxjava3.core.q w = playlist.b == -1 ? fq40Var.t(o25.a().c()).l(new nb(new uh40(playlist, 0), 25)).w() : fq40Var.z(playlist.b, o25.a().c(), playlist.c).j(new pb(new q130(playlist, 4), 24)).r();
        asu0 asu0Var = asu0.a;
        tg40.a.a(w.r0(asu0Var.c()).a0(asu0Var.d()).subscribe(new ubq(new ab6(playlist, vh40Var, context, 8), 16)), vh40Var.i, Ib);
    }

    @Override // xsna.g9o
    public final void U(Activity activity, PodcastInfo podcastInfo, MusicTrack musicTrack) {
        this.a.i(activity, podcastInfo, musicTrack);
    }

    @Override // xsna.g9o
    public final void V(Playlist playlist) {
        Object obj;
        final vh40 vh40Var = this.a;
        tg40 tg40Var = vh40Var.i;
        String Ib = playlist.b == -1 ? "download_all_disposable" : playlist.Ib();
        tg40Var.a(Ib);
        Iterator<T> it = vh40Var.h.z().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Playlist) obj).b == playlist.b) {
                    break;
                }
            }
        }
        final Playlist playlist2 = (Playlist) obj;
        if (playlist2 == null) {
            return;
        }
        tg40.a.a(io.reactivex.rxjava3.core.a.l(new io.reactivex.rxjava3.functions.a() { // from class: xsna.kh40
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                for (MusicTrack musicTrack : Playlist.this.y) {
                    vh40 vh40Var2 = vh40Var;
                    vh40Var2.d.U(musicTrack);
                    vh40Var2.f(musicTrack);
                }
            }
        }).q(asu0.a.c()).g(new fwc(vh40Var, playlist2, 1)).subscribe(), tg40Var, Ib);
    }

    @Override // xsna.g9o
    public final void W(final Playlist playlist, final icz iczVar) {
        final vh40 vh40Var = this.a;
        tg40 tg40Var = vh40Var.i;
        tg40Var.a("download_all_disposable");
        io.reactivex.rxjava3.internal.operators.single.s sVar = new io.reactivex.rxjava3.internal.operators.single.s(new io.reactivex.rxjava3.internal.operators.single.v(new xm9(1, vh40Var, playlist)), new oyr(new h57(18, playlist, vh40Var), 9));
        asu0 asu0Var = asu0.a;
        tg40.a.a(sVar.q(asu0Var.c()).o(asu0Var.d()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.qh40
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                r5v0 r5v0Var = k840.a.h;
                if (r5v0Var == null) {
                    r5v0Var = null;
                }
                DownloadingState.NotLoaded notLoaded = DownloadingState.NotLoaded.b;
                Playlist playlist2 = Playlist.this;
                r5v0Var.b(new n8b0(playlist2, Playlist.zb(playlist2, null, null, null, notLoaded, -1, 254)));
                vh40Var.g.d(playlist2);
                gzs gzsVar = iczVar;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
            }
        }), tg40Var, "cancel_common_disposable");
    }

    @Override // xsna.g9o
    public final void X(Context context, Playlist playlist) {
        this.a.g(context, playlist);
    }

    @Override // xsna.g9o
    public final void Y(Playlist playlist) {
        vh40 vh40Var = this.a;
        tg40 tg40Var = vh40Var.i;
        if (playlist.b == -1) {
            vh40Var.b(playlist);
        } else {
            tg40Var.a(playlist.Ib());
            tg40.a.a(new io.reactivex.rxjava3.internal.operators.observable.p0(io.reactivex.rxjava3.core.q.T(playlist.y), new kr(new z6u(8), 28)).r0(asu0.a.c()).C(new f68(2, vh40Var, playlist)).subscribe(new tl30(new lw20(vh40Var, 5), 3)), tg40Var, playlist.Ib());
        }
    }

    @Override // xsna.jco
    public final boolean Z() {
        return Preference.j().getBoolean("playlist_prev_mm", false);
    }

    @Override // xsna.g9o
    public final void a(Playlist playlist) {
        this.c.a().a(playlist);
    }

    @Override // xsna.g9o
    public final void a0(Playlist playlist) {
        vh40 vh40Var = this.a;
        if (!vh40Var.a()) {
            throw new DownloadingMusicAtWrongNetworkStateException();
        }
        if (!k840.a.i.c()) {
            throw new SubscriptionExpiredException();
        }
        vh40Var.k(playlist);
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.x<List<Playlist>> b() {
        return this.b.b();
    }

    @Override // xsna.g9o
    public final void b0() {
        asu0.a.getClass();
        ScheduledExecutorService o = asu0.o();
        yq40 yq40Var = this.c;
        o.schedule(new wq40(yq40Var, 0), 10000L, TimeUnit.MILLISECONDS);
        yq40Var.a().b();
    }

    @Override // xsna.g9o
    public final void c() {
        this.c.a().c();
    }

    @Override // xsna.g9o
    public final boolean d(String str) {
        return this.c.a().d(str);
    }

    @Override // xsna.g9o
    public final void e(Playlist playlist) {
        this.a.d.e(playlist);
    }

    @Override // xsna.pq40
    public final long f(kz0 kz0Var) {
        return this.b.f(kz0Var);
    }

    @Override // xsna.g9o
    public final void g() {
        this.c.a().g();
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.x<List<OfflinePodcast>> h() {
        return this.b.h();
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.x<List<AudioBook>> i() {
        return this.b.i();
    }

    @Override // xsna.pq40
    public final List<Playlist> j() {
        return this.b.j();
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.x<List<Playlist>> k() {
        return this.b.k();
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.x<List<Playlist>> l() {
        return this.b.l();
    }

    @Override // xsna.pq40
    public final long m(dam damVar) {
        return this.b.m(damVar);
    }

    @Override // xsna.pq40
    public final long n(vd1 vd1Var) {
        return this.b.n(vd1Var);
    }

    @Override // xsna.g9o
    public final boolean o() {
        return this.c.a().o();
    }

    @Override // xsna.g9o
    public final void p() {
        this.c.a().p();
    }

    @Override // xsna.g9o
    public final void q(MusicTrack musicTrack, Playlist playlist) {
        List singletonList = Collections.singletonList(playlist);
        vh40 vh40Var = this.a;
        io.reactivex.rxjava3.core.q o = vh40Var.o(musicTrack, singletonList);
        pb pbVar = new pb(new uv20(vh40Var, 7), 23);
        o.getClass();
        io.reactivex.rxjava3.internal.operators.observable.i0 i0Var = new io.reactivex.rxjava3.internal.operators.observable.i0(o, pbVar);
        asu0 asu0Var = asu0.a;
        i0Var.r0(asu0Var.c()).a0(asu0Var.d()).C(new kz(musicTrack, 3)).subscribe(new ir0(new d1s(vh40Var), 28));
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.q<Result<AudioBook>> r(int i) {
        return this.b.r(i);
    }

    @Override // xsna.g9o
    public final io.reactivex.rxjava3.core.a s(int i) {
        return this.a.c(i);
    }

    @Override // xsna.pq40
    public final io.reactivex.rxjava3.core.a t() {
        io.reactivex.rxjava3.core.x<List<AudioBook>> i = this.b.i();
        y34 y34Var = new y34(new cvh(this, 25), 29);
        i.getClass();
        return new io.reactivex.rxjava3.internal.operators.single.s(i, y34Var);
    }

    @Override // xsna.g9o
    public final void u() {
        this.c.b(true);
    }

    @Override // xsna.g9o
    public final void v(Playlist playlist) {
        this.a.b(playlist);
    }

    @Override // xsna.ri40
    public final io.reactivex.rxjava3.core.q<List<Playlist>> w() {
        return this.d.w();
    }

    @Override // xsna.g9o
    public final void x() {
        this.c.c(true);
    }

    @Override // xsna.vd50
    public final void y(String str, boolean z) {
        this.b.y(str, z);
    }

    @Override // xsna.ri40
    public final List<Playlist> z() {
        return this.d.z();
    }
}
