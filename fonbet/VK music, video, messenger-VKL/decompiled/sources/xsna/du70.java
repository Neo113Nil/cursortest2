package xsna;

import androidx.media3.datasource.a;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistTracker;
import com.vk.dto.music.MusicTrack;
import com.vk.music.offline.api.model.MusicOfflineCacheStorage;

/* compiled from: OfflineHlsComponents.kt */
/* loaded from: classes.dex */
public interface du70 {
    public static final a a = a.a;

    tbn a();

    p9v b(MusicTrack musicTrack);

    HlsPlaylistTracker.a c(MusicTrack musicTrack);

    ja50 d();

    a.InterfaceC0045a e(a.InterfaceC0045a interfaceC0045a);

    /* compiled from: OfflineHlsComponents.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final du70 STUB = new C2752a();

        public final du70 getSTUB() {
            return STUB;
        }

        /* compiled from: OfflineHlsComponents.kt */
        /* renamed from: xsna.du70$a$a, reason: collision with other inner class name */
        public static final class C2752a implements du70 {
            public final C2753a b = new C2753a();

            /* compiled from: OfflineHlsComponents.kt */
            /* renamed from: xsna.du70$a$a$a, reason: collision with other inner class name */
            public static final class C2753a implements ja50 {
                @Override // xsna.ja50
                public final boolean a(MusicTrack musicTrack) {
                    return false;
                }

                @Override // xsna.ja50
                public final boolean b(String str, MusicOfflineCacheStorage musicOfflineCacheStorage) {
                    return false;
                }
            }

            @Override // xsna.du70
            public final tbn a() {
                throw new UnsupportedOperationException("called offlineMusicImagesDiskStorage on STUB");
            }

            @Override // xsna.du70
            public final p9v b(MusicTrack musicTrack) {
                return new tfl();
            }

            @Override // xsna.du70
            public final HlsPlaylistTracker.a c(MusicTrack musicTrack) {
                return androidx.media3.exoplayer.hls.playlist.a.p;
            }

            @Override // xsna.du70
            public final ja50 d() {
                return this.b;
            }

            @Override // xsna.du70
            public final a.InterfaceC0045a e(a.InterfaceC0045a interfaceC0045a) {
                return interfaceC0045a;
            }
        }
    }
}
