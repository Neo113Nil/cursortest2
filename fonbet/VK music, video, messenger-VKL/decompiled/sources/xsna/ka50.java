package xsna;

import androidx.media3.datasource.cache.Cache;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;

/* compiled from: MusicTrackCacheCheckerImpl.kt */
/* loaded from: classes3.dex */
public final class ka50 implements ja50 {
    public final mu70 a;

    public ka50(mu70 mu70Var) {
        this.a = mu70Var;
    }

    @Override // xsna.ja50
    public final boolean a(MusicTrack musicTrack) {
        return !this.a.getContentMetadata(musicTrack.Fb().concat("/music_manifest.m3u8")).equals(adl.c);
    }

    @Override // xsna.ja50
    public final boolean b(String str, MusicOfflineCacheStorage musicOfflineCacheStorage) {
        cij cijVar;
        mu70 mu70Var = this.a;
        Cache cache = mu70Var.h().get(mu70Var.a.e(str, musicOfflineCacheStorage));
        if (cache == null || (cijVar = cache.getContentMetadata(str)) == null) {
            cijVar = adl.c;
        }
        return !cijVar.equals(adl.c);
    }
}
