package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;
import com.vk.dto.music.moosic.EncryptedFileInfo;
import com.vk.dto.music.moosic.MoosicAudio;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;

/* compiled from: MusicOfflineDataInteractorImpl.kt */
/* loaded from: classes.dex */
public final class eq40 implements dq40 {
    public final fq40 a;
    public final up40 b;
    public final sg40 c;

    public eq40(fq40 fq40Var, vp40 vp40Var, sg40 sg40Var) {
        this.a = fq40Var;
        this.b = vp40Var;
        this.c = sg40Var;
    }

    public static final long Z(MoosicAudio moosicAudio, dam damVar) {
        EncryptedFileInfo zb;
        String zb2;
        if (moosicAudio == null || (zb = moosicAudio.zb()) == null || (zb2 = zb.zb()) == null) {
            return 0L;
        }
        return ((Number) damVar.invoke(new File(zb2))).longValue();
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.x<List<MusicTrack>> A() {
        return this.a.t(o25.a().c());
    }

    @Override // xsna.dq40
    public final String B(MusicTrack musicTrack) {
        String B = this.b.B(musicTrack);
        return B == null ? "" : B;
    }

    @Override // xsna.dq40
    public final void C(int i, ArrayList arrayList) {
        this.c.f.C(i, arrayList);
    }

    @Override // xsna.dq40
    public final void D(UserId userId, Playlist playlist) {
        sg40 sg40Var = this.c;
        sg40Var.a.L(playlist);
        sg40Var.n.submit(new lg40(sg40Var, userId, playlist, false));
    }

    @Override // xsna.dq40
    public final void E(int i, UserId userId, String str, String str2) {
        this.c.e.E(i, userId, str, str2);
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.x<List<UserId>> F() {
        return this.a.F();
    }

    @Override // xsna.dq40
    public final void G(UserId userId, int i, a6v0 a6v0Var) {
        this.c.i.G(userId, i, a6v0Var);
    }

    @Override // xsna.dq40
    public final List H(ArrayList arrayList) {
        return this.a.H(arrayList);
    }

    @Override // xsna.dq40
    public final void I(UserId userId, ArrayList arrayList) {
        this.c.e.I(userId, arrayList);
    }

    @Override // xsna.dq40
    public final List<String> J() {
        return this.c.a.J();
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.k<Playlist> K(int i, UserId userId) {
        return this.a.z(i, o25.a().c(), userId);
    }

    @Override // xsna.dq40
    public final void L(int i, UserId userId, String str, String str2) {
        this.c.f.L(i, userId, str, str2);
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.q<List<MusicTrack>> M(UserId userId, OfflineEntitySortType offlineEntitySortType) {
        return this.a.q(o25.a().c(), userId, offlineEntitySortType);
    }

    @Override // xsna.dq40
    public final List<MusicTrack> N(List<String> list) {
        return this.a.N(list);
    }

    @Override // xsna.dq40
    public final void O(boolean z, UserId userId, MusicTrack musicTrack, oya0 oya0Var) {
        this.c.O(z, userId, musicTrack, oya0Var);
    }

    @Override // xsna.dq40
    public final void P(String str, ArrayList arrayList) {
        UserId c = o25.a().c();
        sg40 sg40Var = this.c;
        sg40Var.n.execute(new z3l(sg40Var, c, arrayList, str, 1));
    }

    @Override // xsna.dq40
    public final void Q(UserId userId, int i, int i2, ArrayList arrayList) {
        this.c.g.e(userId, i, i2, arrayList);
    }

    @Override // xsna.dq40
    public final void R(UserId userId, List<Playlist> list) {
        sg40 sg40Var = this.c;
        sg40Var.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            sg40Var.f.c(userId, (Playlist) it.next());
        }
    }

    @Override // xsna.dq40
    public final void S(UserId userId, List<Pair<String, Playlist>> list) {
        sg40 sg40Var = this.c;
        sg40Var.getClass();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            sg40Var.f.k(userId, (String) pair.d(), (Playlist) pair.g());
        }
    }

    @Override // xsna.dq40
    public final void T(String str, ArrayList arrayList) {
        UserId c = o25.a().c();
        sg40 sg40Var = this.c;
        sg40Var.n.execute(new kg40(arrayList, sg40Var, c, str, 0));
    }

    @Override // xsna.dq40
    public final List<Playlist> U() {
        return this.a.D(o25.a().c());
    }

    @Override // xsna.dq40
    public final List<MusicTrack> V() {
        return this.a.A(o25.a().c());
    }

    @Override // xsna.dq40
    public final void W(Playlist playlist) {
        UserId c = o25.a().c();
        sg40 sg40Var = this.c;
        sg40Var.n.execute(new l0g(sg40Var, c, playlist, 1));
    }

    @Override // xsna.dq40
    public final void X(ArrayList arrayList, LinkedHashMap linkedHashMap, String str) {
        sg40 sg40Var = this.c;
        sg40Var.getClass();
        sg40Var.n.execute(new qg40(0, arrayList, sg40Var, o25.a().c(), str, linkedHashMap));
    }

    @Override // xsna.dq40
    public final void Y(String str, ArrayList arrayList) {
        sg40 sg40Var = this.c;
        sg40Var.getClass();
        DownloadingState.Downloaded downloaded = DownloadingState.Downloaded.b;
        ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(MusicTrack.zb((MusicTrack) it.next(), 0, null, 0, 0, null, false, null, downloaded, false, false, null, null, null, -1, 1048571));
        }
        sg40Var.n.execute(new kg40(arrayList2, sg40Var, o25.a().c(), str, 0));
    }

    @Override // xsna.dq40
    public final List<MusicTrack> a() {
        return this.a.a();
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.x<List<Playlist>> b() {
        return this.a.b();
    }

    @Override // xsna.dq40
    public final void c(String str, MusicOfflineCacheStorage musicOfflineCacheStorage) {
        this.a.c(str, musicOfflineCacheStorage);
    }

    @Override // xsna.dq40
    public final int d(UserId userId) {
        return this.a.d(userId);
    }

    @Override // xsna.dq40
    public final int e(UserId userId) {
        return this.a.e(userId);
    }

    @Override // xsna.dq40
    public final long f(kz0 kz0Var) {
        return this.b.f(kz0Var);
    }

    @Override // xsna.dq40
    public final int g(UserId userId) {
        return this.a.g(userId);
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.x<List<OfflinePodcast>> h() {
        return this.a.h();
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.x<List<AudioBook>> i() {
        return this.a.i();
    }

    @Override // xsna.dq40
    public final List<Playlist> j() {
        return this.a.j();
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.x<List<Playlist>> k() {
        return this.a.k();
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.x<List<Playlist>> l() {
        return this.a.l();
    }

    @Override // xsna.dq40
    public final long m(dam damVar) {
        long j;
        long m = this.b.m(damVar);
        Iterator<T> it = V().iterator();
        long j2 = 0;
        long j3 = 0;
        while (it.hasNext()) {
            j3 += Z(((MusicTrack) it.next()).W, damVar);
        }
        fq40 fq40Var = this.a;
        Iterator it2 = ((Iterable) fq40Var.i().c()).iterator();
        long j4 = 0;
        while (it2.hasNext()) {
            List<AudioBookChapter> Bb = ((AudioBook) it2.next()).Bb();
            if (Bb != null) {
                Iterator<T> it3 = Bb.iterator();
                j = 0;
                while (it3.hasNext()) {
                    j += Z(((AudioBookChapter) it3.next()).Cb(), damVar);
                }
            } else {
                j = 0;
            }
            j4 += j;
        }
        Iterator<T> it4 = fq40Var.r().iterator();
        while (it4.hasNext()) {
            j2 += Z(((MusicTrack) it4.next()).W, damVar);
        }
        return j3 + j4 + j2 + m;
    }

    @Override // xsna.dq40
    public final long n(vd1 vd1Var) {
        return this.b.n(vd1Var);
    }

    @Override // xsna.dq40
    public final List o(ArrayList arrayList) {
        return this.a.o(arrayList);
    }

    @Override // xsna.dq40
    public final List<String> p() {
        return this.c.a.p();
    }

    @Override // xsna.dq40
    public final List<String> q() {
        return this.c.a.q();
    }

    @Override // xsna.dq40
    public final io.reactivex.rxjava3.core.q<Result<AudioBook>> r(int i) {
        return this.a.m(i, o25.a().c());
    }

    @Override // xsna.dq40
    public final List<MusicTrack> s(List<String> list) {
        return this.a.s(list);
    }

    @Override // xsna.dq40
    public final void t(int i, UserId userId, String str, ArrayList arrayList) {
        this.c.j.t(i, userId, str, arrayList);
    }

    @Override // xsna.dq40
    public final List<MusicTrack> u(String str) {
        o25.a().c();
        return this.a.u(str);
    }

    @Override // xsna.dq40
    public final void v(int i, LinkedHashMap linkedHashMap, Map map) {
        this.c.e.v(i, linkedHashMap, map);
    }

    @Override // xsna.dq40
    public final int w(UserId userId, String str, List list) {
        return this.c.e.w(userId, str, list);
    }

    @Override // xsna.dq40
    public final void x(UserId userId, int i, VkMusicOldAudioBookEntity vkMusicOldAudioBookEntity) {
        this.c.h.x(userId, i, vkMusicOldAudioBookEntity);
    }

    @Override // xsna.dq40
    public final void y(String str, boolean z) {
        this.c.y(str, z);
    }

    @Override // xsna.dq40
    public final void z(int i, Map map, Map map2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, Set set, Set set2) {
        this.c.e.z(i, map, map2, linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, set, set2);
    }
}
