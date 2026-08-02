package xsna;

import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.Map;

/* compiled from: MusicOfflineCacheProviderImpl.kt */
/* loaded from: classes.dex */
public final class tp40 extends h370 {
    public final /* synthetic */ sp40 b;
    public final /* synthetic */ MusicOfflineCacheStorage c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp40(sp40 sp40Var, MusicOfflineCacheStorage musicOfflineCacheStorage) {
        super(0);
        this.b = sp40Var;
        this.c = musicOfflineCacheStorage;
    }

    @Override // androidx.media3.datasource.cache.b
    public final void onCacheInitialized() {
        try {
            if (((androidx.media3.datasource.cache.c) ((Map) this.b.d.getValue()).get(this.c.k())) != null) {
                androidx.media3.datasource.cache.c cVar = (androidx.media3.datasource.cache.c) ((Map) this.b.d.getValue()).get(this.c.k());
                if (cVar != null) {
                    cVar.j();
                }
                this.b.g = true;
            }
        } catch (Throwable th) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Music public cache initialization failed can_write: " + this.c, th));
        }
    }
}
