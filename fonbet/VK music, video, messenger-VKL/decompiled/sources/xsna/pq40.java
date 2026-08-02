package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import java.util.List;
import kotlin.Result;

/* compiled from: MusicOfflineRepository.kt */
/* loaded from: classes.dex */
public interface pq40 {
    io.reactivex.rxjava3.core.x<List<MusicTrack>> A();

    io.reactivex.rxjava3.core.a B();

    io.reactivex.rxjava3.core.k<Playlist> K(int i, UserId userId);

    io.reactivex.rxjava3.core.q<List<MusicTrack>> M(UserId userId, OfflineEntitySortType offlineEntitySortType);

    io.reactivex.rxjava3.core.x<List<Playlist>> b();

    long f(kz0 kz0Var);

    io.reactivex.rxjava3.core.x<List<OfflinePodcast>> h();

    io.reactivex.rxjava3.core.x<List<AudioBook>> i();

    List<Playlist> j();

    io.reactivex.rxjava3.core.x<List<Playlist>> k();

    io.reactivex.rxjava3.core.x<List<Playlist>> l();

    long m(dam damVar);

    long n(vd1 vd1Var);

    io.reactivex.rxjava3.core.q<Result<AudioBook>> r(int i);

    io.reactivex.rxjava3.core.a t();
}
