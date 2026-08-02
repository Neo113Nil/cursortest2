package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import kotlin.Pair;

/* compiled from: MusicOfflineCacheRepository.kt */
/* loaded from: classes.dex */
public interface up40 {
    String B(MusicTrack musicTrack);

    Pair<Boolean, CorruptedReason> C(MusicTrack musicTrack);

    MusicOfflineCacheStorage D(MusicOfflineCacheStorage musicOfflineCacheStorage, ax0 ax0Var);

    long f(kz0 kz0Var);

    long m(dam damVar);

    long n(vd1 vd1Var);
}
