package xsna;

import android.net.Uri;
import androidx.media3.exoplayer.hls.playlist.b;
import com.vk.music.offline.api.model.CorruptedReason;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;

/* compiled from: HlsTrackCacheChecker.kt */
/* loaded from: classes3.dex */
public final class s9v {
    public final androidx.media3.datasource.cache.a a;
    public final m9v b;

    public s9v(androidx.media3.datasource.cache.a aVar, m9v m9vVar) {
        this.a = aVar;
        this.b = m9vVar;
    }

    public final Pair<Boolean, CorruptedReason> a(Uri uri, String str, boolean z) {
        Object obj;
        androidx.media3.exoplayer.hls.playlist.b c = c(uri, str);
        if (c == null) {
            return new Pair<>(Boolean.FALSE, CorruptedReason.MANIFEST_PLAYLIST);
        }
        Iterator<E> it = c.r.iterator();
        String str2 = null;
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            b.e eVar = (b.e) obj;
            boolean d = d(neq0.d(c.a, eVar.b).toString(), eVar);
            boolean z2 = true;
            if (z) {
                String str3 = eVar.h;
                if (str3 != null) {
                    str2 = str3;
                }
                if (str2 != null) {
                    z2 = d(neq0.d(str2, eVar.b).toString(), eVar);
                }
            }
            if (d && z2) {
                break;
            }
        }
        return ((b.e) obj) == null ? new Pair<>(Boolean.TRUE, null) : new Pair<>(Boolean.FALSE, CorruptedReason.SEGMENT);
    }

    public final String b(Uri uri, String str) {
        androidx.media3.exoplayer.hls.playlist.b c = c(uri, str);
        if (c == null) {
            return null;
        }
        Iterator<E> it = c.r.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return neq0.d(c.a, ((b.e) it.next()).b).toString();
    }

    public final androidx.media3.exoplayer.hls.playlist.b c(Uri uri, String str) {
        Map map = Collections.EMPTY_MAP;
        fxc0.t(uri, "The uri must be set.");
        evk evkVar = new evk(uri, 0L, 1, null, map, 0L, -1L, null, 0, str);
        Object a = ((tb50) this.b.a()).a(uri, new bvk(this.a, evkVar));
        if (a instanceof androidx.media3.exoplayer.hls.playlist.b) {
            return (androidx.media3.exoplayer.hls.playlist.b) a;
        }
        return null;
    }

    public final boolean d(String str, b.e eVar) {
        androidx.media3.datasource.cache.a aVar = this.a;
        long j = aVar.a.getContentMetadata(str).get("exo_len");
        if (j != -1) {
            return !aVar.a.isCached(str, 0L, j);
        }
        long j2 = eVar.k;
        return j2 <= 0 || aVar.a.getCachedLength(str, 0L, j2) < eVar.k;
    }
}
