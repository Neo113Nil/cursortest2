package xsna;

import android.content.Context;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;
import com.vk.music.offline.api.model.storage.StorageEvent;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: MusicStorageTypeInteractor.kt */
/* loaded from: classes.dex */
public interface k850 {

    /* compiled from: MusicStorageTypeInteractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final k850 STUB = new C3170a();

        /* compiled from: MusicStorageTypeInteractor.kt */
        /* renamed from: xsna.k850$a$a, reason: collision with other inner class name */
        public static final class C3170a implements k850 {
            @Override // xsna.k850
            public final MusicOfflineCacheStorage a(MusicOfflineCacheStorage musicOfflineCacheStorage) {
                MusicOfflineCacheStorage.Companion.getClass();
                return MusicOfflineCacheStorage.EXTERNAL_OR_INTERNAL;
            }

            @Override // xsna.k850
            public final Set<MusicOfflineCacheStorage> b() {
                return EmptySet.b;
            }

            @Override // xsna.k850
            public final Set<MusicOfflineCacheStorage> c() {
                return EmptySet.b;
            }

            @Override // xsna.k850
            public final io.reactivex.rxjava3.core.q<vgl0> d(Context context, StorageEvent storageEvent) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.k850
            public final boolean e(Throwable th) {
                return false;
            }
        }

        public final k850 getSTUB() {
            return STUB;
        }
    }

    MusicOfflineCacheStorage a(MusicOfflineCacheStorage musicOfflineCacheStorage);

    Set<MusicOfflineCacheStorage> b();

    Set<MusicOfflineCacheStorage> c();

    io.reactivex.rxjava3.core.q<vgl0> d(Context context, StorageEvent storageEvent);

    boolean e(Throwable th);
}
