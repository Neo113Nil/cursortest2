package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PlaylistOfflineInteractor.kt */
/* loaded from: classes.dex */
public interface rbb0 {
    void C(int i, ArrayList arrayList);

    void D(UserId userId, Playlist playlist);

    void L(int i, UserId userId, String str, String str2);

    void a(String str);

    List<Playlist> b(UserId userId);

    void c(UserId userId, Playlist playlist);

    int d(UserId userId);

    int e(UserId userId);

    List<Playlist> f(UserId userId);

    List<Playlist> g(UserId userId);

    Playlist h(UserId userId, String str);

    int i(UserId userId, String str);

    List<Playlist> j(UserId userId);

    void k(UserId userId, String str, Playlist playlist);

    List<MusicTrack> l(UserId userId, String str);

    List<Playlist> m(UserId userId, String str);

    /* compiled from: PlaylistOfflineInteractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final rbb0 STUB = new C3603a();

        public final rbb0 getSTUB() {
            return STUB;
        }

        /* compiled from: PlaylistOfflineInteractor.kt */
        /* renamed from: xsna.rbb0$a$a, reason: collision with other inner class name */
        public static final class C3603a implements rbb0 {
            @Override // xsna.rbb0
            public final List<Playlist> b(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.rbb0
            public final int d(UserId userId) {
                return 0;
            }

            @Override // xsna.rbb0
            public final int e(UserId userId) {
                return 0;
            }

            @Override // xsna.rbb0
            public final List<Playlist> f(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.rbb0
            public final List<Playlist> g(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.rbb0
            public final Playlist h(UserId userId, String str) {
                return null;
            }

            @Override // xsna.rbb0
            public final int i(UserId userId, String str) {
                return 0;
            }

            @Override // xsna.rbb0
            public final List<Playlist> j(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.rbb0
            public final List<MusicTrack> l(UserId userId, String str) {
                return EmptyList.b;
            }

            @Override // xsna.rbb0
            public final List<Playlist> m(UserId userId, String str) {
                return EmptyList.b;
            }

            @Override // xsna.rbb0
            public final void a(String str) {
            }

            @Override // xsna.rbb0
            public final void C(int i, ArrayList arrayList) {
            }

            @Override // xsna.rbb0
            public final void D(UserId userId, Playlist playlist) {
            }

            @Override // xsna.rbb0
            public final void c(UserId userId, Playlist playlist) {
            }

            @Override // xsna.rbb0
            public final void k(UserId userId, String str, Playlist playlist) {
            }

            @Override // xsna.rbb0
            public final void L(int i, UserId userId, String str, String str2) {
            }
        }
    }
}
