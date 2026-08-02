package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.Podcast;
import com.vk.music.offline.api.model.DownloadType;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MusicOfflineDataRepository.kt */
/* loaded from: classes.dex */
public interface fq40 {
    ArrayList A(UserId userId);

    int B(UserId userId, Playlist playlist);

    Playlist C(int i, UserId userId, UserId userId2);

    List<Playlist> D(UserId userId);

    io.reactivex.rxjava3.internal.operators.single.f0 F();

    List H(ArrayList arrayList);

    ArrayList N(List list);

    List<MusicTrack> a();

    io.reactivex.rxjava3.internal.operators.single.f0 b();

    void c(String str, MusicOfflineCacheStorage musicOfflineCacheStorage);

    int d(UserId userId);

    int e(UserId userId);

    int f(int i, UserId userId);

    int g(UserId userId);

    io.reactivex.rxjava3.internal.operators.single.f0 h();

    io.reactivex.rxjava3.internal.operators.single.f0 i();

    ArrayList j();

    io.reactivex.rxjava3.internal.operators.single.b0 k();

    io.reactivex.rxjava3.internal.operators.single.f0 l();

    io.reactivex.rxjava3.internal.operators.observable.l2 m(int i, UserId userId);

    Podcast n(UserId userId, UserId userId2);

    List o(ArrayList arrayList);

    int p(UserId userId, UserId userId2);

    io.reactivex.rxjava3.core.q<List<MusicTrack>> q(UserId userId, UserId userId2, OfflineEntitySortType offlineEntitySortType);

    List<MusicTrack> r();

    ArrayList s(List list);

    io.reactivex.rxjava3.internal.operators.single.f0 t(UserId userId);

    ArrayList u(String str);

    int v(UserId userId);

    List<MusicTrack> w(UserId userId, DownloadType downloadType);

    List<Playlist> x(UserId userId, MusicTrack musicTrack);

    AudioBook y(int i, UserId userId);

    io.reactivex.rxjava3.internal.operators.maybe.x z(int i, UserId userId, UserId userId2);
}
