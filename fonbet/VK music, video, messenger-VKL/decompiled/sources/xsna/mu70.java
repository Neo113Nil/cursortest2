package xsna;

import androidx.media3.datasource.cache.Cache;
import com.vk.core.preference.Preference;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.io.File;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.WeakHashMap;
import xsna.ky6;

/* compiled from: OfflineMusicCompositeCache.kt */
/* loaded from: classes.dex */
public final class mu70 implements Cache {
    public final bd3 a;
    public final k850 b;
    public volatile MusicOfflineCacheStorage c;
    public final bpn0 d;
    public final Map<File, String> e;

    public mu70() {
        throw null;
    }

    public mu70(MusicOfflineCacheStorage musicOfflineCacheStorage, bd3 bd3Var, bpn0 bpn0Var, k850 k850Var) {
        if (Preference.j().getLong("music_offline_cache_uid", -1L) == -1) {
            long abs = Math.abs(new SecureRandom().nextLong());
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putLong("music_offline_cache_uid", abs);
            aVar.a();
        }
        this.a = bd3Var;
        this.b = k850Var;
        this.c = musicOfflineCacheStorage;
        this.d = bpn0Var;
        this.e = Collections.synchronizedMap(new WeakHashMap());
    }

    public static Cache j(mu70 mu70Var, String str) {
        Cache cache = mu70Var.h().get(mu70Var.a.e(str, mu70Var.c));
        if (cache != null) {
            return cache;
        }
        throw new IllegalStateException("Can't resolve cache for the key:".concat(str));
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final qx8 a(long j, long j2, String str) {
        return j(this, str).a(j, j2, str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final long b(long j, long j2, String str) {
        return j(this, str).b(j, j2, str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final void c(String str) {
        j(this, str).c(str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final void d(qx8 qx8Var) {
        Cache i = i(qx8Var.b);
        if (i != null) {
            i.d(qx8Var);
        }
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final void e(File file, long j) {
        String remove = this.e.remove(file);
        if (remove == null) {
            throw new IllegalStateException("Cache key not found");
        }
        j(this, remove).e(file, j);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final void f(String str, dij dijVar) {
        j(this, str).f(str, dijVar);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final qx8 g(long j, long j2, String str) {
        Cache i = i(str);
        if (i != null) {
            return i.g(j, j2, str);
        }
        return null;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final long getCacheSpace() {
        Iterator<T> it = h().values().iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((Cache) it.next()).getCacheSpace();
        }
        return j;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final long getCachedLength(String str, long j, long j2) {
        return j(this, str).getCachedLength(str, j, j2);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final NavigableSet<qx8> getCachedSpans(String str) {
        return j(this, str).getCachedSpans(str);
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final cij getContentMetadata(String str) {
        cij contentMetadata;
        Cache i = i(str);
        return (i == null || (contentMetadata = i.getContentMetadata(str)) == null) ? adl.c : contentMetadata;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final Set<String> getKeys() {
        Collection<Cache> values = h().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            g5g.y(((Cache) it.next()).getKeys(), arrayList);
        }
        return j5g.R0(arrayList);
    }

    public final Map<String, Cache> h() {
        return (Map) this.d.getValue();
    }

    public final Cache i(String str) {
        Set<MusicOfflineCacheStorage> b;
        k850 k850Var = this.b;
        if (k850Var != null && (b = k850Var.b()) != null) {
            Iterator<T> it = b.iterator();
            while (it.hasNext()) {
                Cache cache = h().get(this.a.e(str, (MusicOfflineCacheStorage) it.next()));
                if (cache != null && !epx.f(cache.getContentMetadata(str), adl.c)) {
                    return cache;
                }
            }
        }
        return h().get(this.a.e(str, this.c));
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final boolean isCached(String str, long j, long j2) {
        Cache i = i(str);
        if (i != null) {
            return i.isCached(str, j, j2);
        }
        return false;
    }

    @Override // androidx.media3.datasource.cache.Cache
    public final File startFile(String str, long j, long j2) {
        File startFile = j(this, str).startFile(str, j, j2);
        this.e.put(startFile, str);
        return startFile;
    }
}
