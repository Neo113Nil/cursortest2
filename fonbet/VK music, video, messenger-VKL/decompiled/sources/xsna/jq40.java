package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import com.vk.music.offline.api.di.OfflineAudioComponent;
import com.vk.music.offline.api.exception.OfflinePlaylistNotFoundException;
import com.vk.music.offline.api.model.DownloadType;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import io.reactivex.rxjava3.internal.operators.maybe.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MusicOfflineDataRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class jq40 implements fq40 {
    public final OfflineAudioComponent a;
    public final df5 b;
    public final bpn0 c = new bpn0(new apf(this, 6));
    public final bpn0 d = new bpn0(new bpf(this, 3));
    public final bpn0 e = new bpn0(new cpf(this, 1));
    public final bpn0 f = new bpn0(new s0f(this, 5));
    public final bpn0 g = new bpn0(new an(this, 6));
    public final bpn0 h = new bpn0(new bn(this, 3));
    public final ConcurrentHashMap<String, DownloadingState> i = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, DownloadingState> j = new ConcurrentHashMap<>();

    public jq40(io.reactivex.rxjava3.core.q<yj40> qVar, OfflineAudioComponent offlineAudioComponent, df5 df5Var) {
        this.a = offlineAudioComponent;
        this.b = df5Var;
        itg0.i(6, qVar.b0(ib50.class), null, new gq40(this, 0), null);
        itg0.i(6, qVar.b0(n8b0.class), null, new a2e(this, 1), null);
        itg0.i(6, qVar.b0(fa50.class).a0(asu0.a.c()), null, new xa40(this, 1), null);
    }

    @Override // xsna.fq40
    public final ArrayList A(UserId userId) {
        return I(userId, DownloadType.ANY);
    }

    @Override // xsna.fq40
    public final int B(UserId userId, Playlist playlist) {
        return E().i(userId, playlist.Ib());
    }

    @Override // xsna.fq40
    public final Playlist C(int i, UserId userId, UserId userId2) {
        rbb0 E = E();
        Set<Integer> set = Playlist.P;
        return E.h(userId, Playlist.a.a(i, userId2));
    }

    @Override // xsna.fq40
    public final List<Playlist> D(UserId userId) {
        return E().f(userId);
    }

    public final rbb0 E() {
        return (rbb0) this.d.getValue();
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.single.f0 F() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new iq40(this, 0)).q(asu0.a.c());
    }

    public final whb0 G() {
        return (whb0) this.g.getValue();
    }

    @Override // xsna.fq40
    public final List H(ArrayList arrayList) {
        ilb ilbVar = (ilb) this.f.getValue();
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return ilbVar.c(((b25) bpn0Var.getValue()).c(), arrayList);
    }

    public final ArrayList I(UserId userId, DownloadType downloadType) {
        List<MusicTrack> w = w(userId, downloadType);
        ArrayList arrayList = new ArrayList(c5g.u(w, 10));
        for (MusicTrack musicTrack : w) {
            DownloadingState downloadingState = this.i.get(musicTrack.Fb());
            if (downloadingState == null) {
                downloadingState = musicTrack.J;
            }
            arrayList.add(MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, downloadingState, false, false, null, null, null, -1, 1048571));
        }
        return arrayList;
    }

    public final kgp0 J() {
        return (kgp0) this.c.getValue();
    }

    public final Playlist K(Playlist playlist) {
        String Ib = playlist.Ib();
        ConcurrentHashMap<String, DownloadingState> concurrentHashMap = this.j;
        DownloadingState downloadingState = concurrentHashMap.get(Ib);
        if (downloadingState == null && (downloadingState = concurrentHashMap.get(playlist.Hb())) == null) {
            downloadingState = playlist.H;
        }
        return Playlist.zb(playlist, null, null, null, downloadingState, -1, 254);
    }

    public final ArrayList L(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(K((Playlist) it.next()));
        }
        return arrayList;
    }

    @Override // xsna.fq40
    public final ArrayList N(List list) {
        List<MusicTrack> r = J().r(o25.a().c(), list);
        ArrayList arrayList = new ArrayList(c5g.u(r, 10));
        for (MusicTrack musicTrack : r) {
            String Fb = musicTrack.Fb();
            ConcurrentHashMap<String, DownloadingState> concurrentHashMap = this.i;
            DownloadingState downloadingState = concurrentHashMap.get(Fb);
            if (downloadingState == null && (downloadingState = concurrentHashMap.get(musicTrack.Z)) == null) {
                downloadingState = musicTrack.S4() ? DownloadingState.Downloaded.b : DownloadingState.NotLoaded.b;
            }
            arrayList.add(MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, downloadingState, false, false, null, null, null, -1, 1048571));
        }
        return arrayList;
    }

    @Override // xsna.fq40
    public final List<MusicTrack> a() {
        return J().a();
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.single.f0 b() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new v640(this, 1)).l(new pj4(new jz30(2), 28)).q(asu0.a.c());
    }

    @Override // xsna.fq40
    public final void c(String str, MusicOfflineCacheStorage musicOfflineCacheStorage) {
        J().c(str, musicOfflineCacheStorage);
    }

    @Override // xsna.fq40
    public final int d(UserId userId) {
        return E().d(userId);
    }

    @Override // xsna.fq40
    public final int e(UserId userId) {
        return E().e(userId);
    }

    @Override // xsna.fq40
    public final int f(int i, UserId userId) {
        return ((qh4) this.e.getValue()).f(i, userId);
    }

    @Override // xsna.fq40
    public final int g(UserId userId) {
        return J().g(userId);
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.single.f0 h() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new uhk(this, 1)).q(asu0.a.c());
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.single.f0 i() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new lc6(this, 2)).q(asu0.a.c());
    }

    @Override // xsna.fq40
    public final ArrayList j() {
        ArrayList L = L(E().g(o25.a().c()));
        ArrayList arrayList = new ArrayList();
        Iterator it = L.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((Playlist) next).y.isEmpty()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.single.b0 k() {
        io.reactivex.rxjava3.internal.operators.single.y l = new io.reactivex.rxjava3.internal.operators.single.v(new qbv(this, 1)).l(new pb(new t3v(5), 25));
        asu0 asu0Var = asu0.a;
        return l.q(asu0Var.c()).m(asu0Var.d());
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.single.f0 l() {
        return new io.reactivex.rxjava3.internal.operators.single.v(new n30(this, 2)).l(new rj4(new y510(4), 23)).q(asu0.a.c());
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.observable.l2 m(int i, UserId userId) {
        return ((qh4) this.e.getValue()).m(i, userId).r0(asu0.a.c());
    }

    @Override // xsna.fq40
    public final Podcast n(UserId userId, UserId userId2) {
        return G().n(userId, userId2);
    }

    @Override // xsna.fq40
    public final List o(ArrayList arrayList) {
        ctp ctpVar = (ctp) this.h.getValue();
        bpn0 bpn0Var = o25.a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return ctpVar.y(((b25) bpn0Var.getValue()).c(), arrayList);
    }

    @Override // xsna.fq40
    public final int p(UserId userId, UserId userId2) {
        return G().p(userId, userId2);
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.core.q<List<MusicTrack>> q(UserId userId, UserId userId2, OfflineEntitySortType offlineEntitySortType) {
        return G().q(userId, userId2, offlineEntitySortType);
    }

    @Override // xsna.fq40
    public final List<MusicTrack> r() {
        return G().e(o25.a().c());
    }

    @Override // xsna.fq40
    public final ArrayList s(List list) {
        List<MusicTrack> p = J().p(o25.a().c(), list);
        ArrayList arrayList = new ArrayList(c5g.u(p, 10));
        for (MusicTrack musicTrack : p) {
            DownloadingState downloadingState = this.i.get(musicTrack.Fb());
            if (downloadingState == null) {
                downloadingState = musicTrack.S4() ? DownloadingState.Downloaded.b : DownloadingState.NotLoaded.b;
            }
            arrayList.add(MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, downloadingState, false, false, null, null, null, -1, 1048571));
        }
        return arrayList;
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.single.f0 t(UserId userId) {
        return new io.reactivex.rxjava3.internal.operators.single.v(new dwk(2, this, userId)).l(new iw3(new wh1(27), 22)).q(asu0.a.c());
    }

    @Override // xsna.fq40
    public final ArrayList u(String str) {
        List<MusicTrack> l = E().l(o25.a().c(), str);
        ArrayList arrayList = new ArrayList(c5g.u(l, 10));
        for (MusicTrack musicTrack : l) {
            DownloadingState downloadingState = this.i.get(musicTrack.Fb());
            if (downloadingState == null) {
                downloadingState = musicTrack.S4() ? DownloadingState.Downloaded.b : DownloadingState.NotLoaded.b;
            }
            arrayList.add(MusicTrack.zb(musicTrack, 0, null, 0, 0, null, false, null, downloadingState, false, false, null, null, null, -1, 1048571));
        }
        return arrayList;
    }

    @Override // xsna.fq40
    public final int v(UserId userId) {
        return J().j(userId);
    }

    @Override // xsna.fq40
    public final List<MusicTrack> w(UserId userId, DownloadType downloadType) {
        return J().k(userId, downloadType == DownloadType.DOWNLOADED);
    }

    @Override // xsna.fq40
    public final List<Playlist> x(UserId userId, MusicTrack musicTrack) {
        return E().m(userId, musicTrack.Fb());
    }

    @Override // xsna.fq40
    public final AudioBook y(int i, UserId userId) {
        return ((qh4) this.e.getValue()).y(i, userId);
    }

    @Override // xsna.fq40
    public final io.reactivex.rxjava3.internal.operators.maybe.x z(final int i, final UserId userId, final UserId userId2) {
        io.reactivex.rxjava3.internal.operators.maybe.c e = io.reactivex.rxjava3.core.k.e(new io.reactivex.rxjava3.core.n() { // from class: xsna.hq40
            @Override // io.reactivex.rxjava3.core.n
            public final void subscribe(io.reactivex.rxjava3.core.l lVar) {
                jq40 jq40Var = jq40.this;
                int i2 = i;
                UserId userId3 = userId;
                UserId userId4 = userId2;
                Playlist C = jq40Var.C(i2, userId3, userId4);
                if (C == null) {
                    ((c.a) lVar).e(new OfflinePlaylistNotFoundException(i2, userId4));
                } else {
                    ((c.a) lVar).f(jq40Var.K(C));
                }
            }
        });
        asu0 asu0Var = asu0.a;
        return e.n(asu0Var.c()).k(asu0Var.d());
    }
}
