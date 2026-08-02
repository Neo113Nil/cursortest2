package xsna;

import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import java.util.Comparator;
import java.util.Set;

/* compiled from: MusicStorageTypeRepository.kt */
/* loaded from: classes.dex */
public interface o850 {

    /* compiled from: MusicStorageTypeRepository.kt */
    public static final class a {
        public static final C3442a a = new C3442a();

        /* compiled from: Comparisons.kt */
        /* renamed from: xsna.o850$a$a, reason: collision with other inner class name */
        public static final class C3442a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return jw5.b(Integer.valueOf(((MusicOfflineCacheStorage) t2).i()), Integer.valueOf(((MusicOfflineCacheStorage) t).i()));
            }
        }
    }

    MusicOfflineCacheStorage a(MusicOfflineCacheStorage musicOfflineCacheStorage);

    Set<MusicOfflineCacheStorage> b();

    Set<MusicOfflineCacheStorage> c();

    void d(MusicOfflineCacheStorage musicOfflineCacheStorage);
}
