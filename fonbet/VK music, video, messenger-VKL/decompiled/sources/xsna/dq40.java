package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import com.vk.music.offline.api.model.moosic.VkMusicOldAudioBookEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;

/* compiled from: MusicOfflineDataInteractor.kt */
/* loaded from: classes.dex */
public interface dq40 {
    io.reactivex.rxjava3.core.x<List<MusicTrack>> A();

    String B(MusicTrack musicTrack);

    void C(int i, ArrayList arrayList);

    void D(UserId userId, Playlist playlist);

    void E(int i, UserId userId, String str, String str2);

    io.reactivex.rxjava3.core.x<List<UserId>> F();

    void G(UserId userId, int i, a6v0 a6v0Var);

    List H(ArrayList arrayList);

    void I(UserId userId, ArrayList arrayList);

    List<String> J();

    io.reactivex.rxjava3.core.k<Playlist> K(int i, UserId userId);

    void L(int i, UserId userId, String str, String str2);

    io.reactivex.rxjava3.core.q<List<MusicTrack>> M(UserId userId, OfflineEntitySortType offlineEntitySortType);

    List<MusicTrack> N(List<String> list);

    void O(boolean z, UserId userId, MusicTrack musicTrack, oya0 oya0Var);

    void P(String str, ArrayList arrayList);

    void Q(UserId userId, int i, int i2, ArrayList arrayList);

    void R(UserId userId, List<Playlist> list);

    void S(UserId userId, List<Pair<String, Playlist>> list);

    void T(String str, ArrayList arrayList);

    List<Playlist> U();

    List<MusicTrack> V();

    void W(Playlist playlist);

    void X(ArrayList arrayList, LinkedHashMap linkedHashMap, String str);

    void Y(String str, ArrayList arrayList);

    List<MusicTrack> a();

    io.reactivex.rxjava3.core.x<List<Playlist>> b();

    void c(String str, MusicOfflineCacheStorage musicOfflineCacheStorage);

    int d(UserId userId);

    int e(UserId userId);

    long f(kz0 kz0Var);

    int g(UserId userId);

    io.reactivex.rxjava3.core.x<List<OfflinePodcast>> h();

    io.reactivex.rxjava3.core.x<List<AudioBook>> i();

    List<Playlist> j();

    io.reactivex.rxjava3.core.x<List<Playlist>> k();

    io.reactivex.rxjava3.core.x<List<Playlist>> l();

    long m(dam damVar);

    long n(vd1 vd1Var);

    List o(ArrayList arrayList);

    List<String> p();

    List<String> q();

    io.reactivex.rxjava3.core.q<Result<AudioBook>> r(int i);

    List<MusicTrack> s(List<String> list);

    void t(int i, UserId userId, String str, ArrayList arrayList);

    List<MusicTrack> u(String str);

    void v(int i, LinkedHashMap linkedHashMap, Map map);

    int w(UserId userId, String str, List list);

    void x(UserId userId, int i, VkMusicOldAudioBookEntity vkMusicOldAudioBookEntity);

    void y(String str, boolean z);

    void z(int i, Map map, Map map2, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, Set set, Set set2);
}
