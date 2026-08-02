package xsna;

import android.os.StatFs;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Result;
import xsna.o850;

/* compiled from: AutoManagedStorageTypeRepository.kt */
/* loaded from: classes.dex */
public final class vg5 implements o850 {
    public volatile MusicOfflineCacheStorage a;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000b, code lost:
    
        if (r3 == null) goto L9;
     */
    @Override // xsna.o850
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MusicOfflineCacheStorage a(MusicOfflineCacheStorage musicOfflineCacheStorage) {
        MusicOfflineCacheStorage musicOfflineCacheStorage2 = null;
        if (musicOfflineCacheStorage != null) {
            if (!e(musicOfflineCacheStorage)) {
                musicOfflineCacheStorage = null;
            }
        }
        MusicOfflineCacheStorage musicOfflineCacheStorage3 = this.a;
        if (musicOfflineCacheStorage3 != null && e(musicOfflineCacheStorage3)) {
            musicOfflineCacheStorage2 = musicOfflineCacheStorage3;
        }
        if (musicOfflineCacheStorage2 == null) {
            musicOfflineCacheStorage = (MusicOfflineCacheStorage) j5g.Z(c());
            if (musicOfflineCacheStorage == null) {
                MusicOfflineCacheStorage.Companion.getClass();
                musicOfflineCacheStorage = MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL;
            }
        } else {
            musicOfflineCacheStorage = musicOfflineCacheStorage2;
        }
        this.a = musicOfflineCacheStorage;
        return musicOfflineCacheStorage;
    }

    @Override // xsna.o850
    public final Set<MusicOfflineCacheStorage> b() {
        return j5g.S0(j5g.D0(o850.a.a, MusicOfflineCacheStorage.j()));
    }

    @Override // xsna.o850
    public final Set<MusicOfflineCacheStorage> c() {
        zrp<MusicOfflineCacheStorage> j = MusicOfflineCacheStorage.j();
        ArrayList arrayList = new ArrayList();
        for (Object obj : j) {
            if (e((MusicOfflineCacheStorage) obj)) {
                arrayList.add(obj);
            }
        }
        return j5g.S0(j5g.D0(o850.a.a, arrayList));
    }

    @Override // xsna.o850
    public final void d(MusicOfflineCacheStorage musicOfflineCacheStorage) {
        this.a = musicOfflineCacheStorage;
    }

    public final boolean e(MusicOfflineCacheStorage musicOfflineCacheStorage) {
        Object failure;
        Object failure2;
        if (musicOfflineCacheStorage.l()) {
            try {
                failure = musicOfflineCacheStorage.h();
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (!(failure instanceof Result.Failure)) {
                try {
                    try {
                        StatFs statFs = new StatFs(((File) failure).getPath());
                        failure2 = Long.valueOf(statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong());
                    } catch (Throwable th2) {
                        failure2 = new Result.Failure(th2);
                    }
                    kotlin.a.a(failure2);
                    failure = Long.valueOf(((Number) failure2).longValue());
                } catch (Throwable th3) {
                    failure = new Result.Failure(th3);
                }
            }
            if (!(failure instanceof Result.Failure)) {
                failure = Boolean.valueOf(((float) ((Number) failure).longValue()) >= 5.24288E8f);
            }
            Object obj = Boolean.FALSE;
            if (failure instanceof Result.Failure) {
                failure = obj;
            }
            if (((Boolean) failure).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
