package xsna;

import android.net.Uri;
import androidx.media3.datasource.FileDataSource;
import androidx.media3.datasource.cache.a;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.music.MusicTrack;
import com.vk.log.L;
import com.vk.music.offline.api.model.CorruptedReason;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.impl.di.OfflineAudioComponentImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.ju70;

/* compiled from: MusicOfflineCacheRepositoryImpl.kt */
/* loaded from: classes.dex */
public final class vp40 implements up40 {
    public final jc50 a;
    public final mu70 b;
    public final ft70 c;
    public final com.vk.music.offline.api.domain.download.b d;

    public vp40(jc50 jc50Var, mu70 mu70Var, ft70 ft70Var, fk80 fk80Var) {
        this.a = jc50Var;
        this.b = mu70Var;
        this.c = ft70Var;
        this.d = fk80Var;
    }

    public static long b(PrivateFiles.StorageType storageType, izs izsVar) {
        PrivateFiles.a b;
        PrivateFiles.a b2;
        PrivateFiles.a b3;
        PrivateFiles privateFiles = e8r.a;
        b = privateFiles.b(r1, PrivateSubdir.OFFLINE_MUSIC_PRIVATE.h(), true);
        b2 = privateFiles.b(r3, PrivateSubdir.PREFETCH_MUSIC_PRIVATE.h(), true);
        b3 = privateFiles.b(r4, PrivateSubdir.OFFLINE_MUSIC_PUBLIC.h(), true);
        List l = e43.l(b, b2, b3);
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (((PrivateFiles.a) obj).b == storageType) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((Number) izsVar.invoke(((PrivateFiles.a) it.next()).a)).longValue();
        }
        return j;
    }

    @Override // xsna.up40
    public final String B(MusicTrack musicTrack) {
        s9v c;
        try {
            String a = this.a.a(musicTrack);
            if (a != null && (c = c(null, musicTrack, false)) != null) {
                return c.b(Uri.parse(a), musicTrack.Fb());
            }
            return null;
        } catch (RuntimeException e) {
            L.i(e);
            return null;
        }
    }

    @Override // xsna.up40
    public final Pair<Boolean, CorruptedReason> C(MusicTrack musicTrack) {
        try {
            String a = this.a.a(musicTrack);
            if (a == null) {
                return new Pair<>(Boolean.FALSE, CorruptedReason.MANIFEST_DB);
            }
            return this.d.c(d370.p(musicTrack)) ? ju70.a.c(a) ? a(Uri.parse(a), musicTrack, true) : new Pair<>(Boolean.TRUE, null) : a(Uri.parse(a), musicTrack, false);
        } catch (RuntimeException e) {
            L.i(e);
            return new Pair<>(Boolean.FALSE, CorruptedReason.UNKNOWN);
        }
    }

    @Override // xsna.up40
    public final MusicOfflineCacheStorage D(MusicOfflineCacheStorage musicOfflineCacheStorage, ax0 ax0Var) {
        mu70 mu70Var = this.b;
        Object obj = null;
        MusicOfflineCacheStorage musicOfflineCacheStorage2 = mu70Var.h().containsKey(musicOfflineCacheStorage.k()) ? musicOfflineCacheStorage : null;
        if (musicOfflineCacheStorage2 == null) {
            Iterator it = ((Iterable) ax0Var.invoke()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (mu70Var.h().containsKey(musicOfflineCacheStorage.k())) {
                    obj = next;
                    break;
                }
            }
            musicOfflineCacheStorage2 = (MusicOfflineCacheStorage) obj;
            if (musicOfflineCacheStorage2 == null) {
                MusicOfflineCacheStorage.Companion.getClass();
                musicOfflineCacheStorage2 = MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL;
            }
        }
        mu70Var.c = musicOfflineCacheStorage2;
        return musicOfflineCacheStorage2;
    }

    public final Pair a(Uri uri, MusicTrack musicTrack, boolean z) {
        s9v c = c(uri, musicTrack, z);
        Pair<Boolean, CorruptedReason> a = c != null ? c.a(uri, musicTrack.Fb(), z) : null;
        return a != null ? a.i().booleanValue() ? new Pair(Boolean.TRUE, null) : new Pair(Boolean.FALSE, a.j()) : new Pair(Boolean.FALSE, CorruptedReason.MANIFEST_DB);
    }

    public final s9v c(Uri uri, MusicTrack musicTrack, boolean z) {
        a.b Df;
        FileDataSource.a aVar = new FileDataSource.a();
        OfflineAudioComponentImpl offlineAudioComponentImpl = this.c.a;
        qcy<Object>[] qcyVarArr = OfflineAudioComponentImpl.M;
        if (z) {
            fxc0.B().B();
            Df = bu70.a.c(null);
        } else {
            Df = offlineAudioComponentImpl.Df(aVar, false);
        }
        androidx.media3.datasource.cache.a createDataSource = Df.createDataSource();
        if (createDataSource.c().getContentMetadata(z ? String.valueOf(uri) : ju70.a.g(musicTrack.Fb())).get("exo_len") == -1) {
            return null;
        }
        return new s9v(createDataSource, new m9v(this.a, this.b, musicTrack));
    }

    @Override // xsna.up40
    public final long f(kz0 kz0Var) {
        return b(PrivateFiles.StorageType.EXTERNAL, kz0Var);
    }

    @Override // xsna.up40
    public final long m(dam damVar) {
        zrp<MusicOfflineCacheStorage> j = MusicOfflineCacheStorage.j();
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = j.iterator();
        while (it.hasNext()) {
            File h = ((MusicOfflineCacheStorage) it.next()).h();
            if (h != null) {
                arrayList.add(h);
            }
        }
        Iterator it2 = arrayList.iterator();
        long j2 = 0;
        while (it2.hasNext()) {
            j2 += ((Number) damVar.invoke((File) it2.next())).longValue();
        }
        return j2;
    }

    @Override // xsna.up40
    public final long n(vd1 vd1Var) {
        return b(PrivateFiles.StorageType.INTERNAL, vd1Var);
    }
}
