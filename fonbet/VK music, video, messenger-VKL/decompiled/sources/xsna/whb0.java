package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.music.offline.api.model.OfflineEntitySortType;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: PodcastOfflineInteractor.kt */
/* loaded from: classes.dex */
public interface whb0 {
    void G(UserId userId, int i, a6v0 a6v0Var);

    void a(UserId userId, Podcast podcast);

    void b(UserId userId, UserId userId2, boolean z);

    List<OfflinePodcast> c(UserId userId);

    List<UserId> d(UserId userId);

    List<MusicTrack> e(UserId userId);

    void f(UserId userId, UserId userId2);

    List<MusicTrack> g(UserId userId, UserId userId2);

    Podcast n(UserId userId, UserId userId2);

    int p(UserId userId, UserId userId2);

    io.reactivex.rxjava3.core.q<List<MusicTrack>> q(UserId userId, UserId userId2, OfflineEntitySortType offlineEntitySortType);

    /* compiled from: PodcastOfflineInteractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final whb0 STUB = new C3932a();

        public final whb0 getSTUB() {
            return STUB;
        }

        /* compiled from: PodcastOfflineInteractor.kt */
        /* renamed from: xsna.whb0$a$a, reason: collision with other inner class name */
        public static final class C3932a implements whb0 {
            @Override // xsna.whb0
            public final List<OfflinePodcast> c(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.whb0
            public final List<UserId> d(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.whb0
            public final List<MusicTrack> e(UserId userId) {
                return EmptyList.b;
            }

            @Override // xsna.whb0
            public final List<MusicTrack> g(UserId userId, UserId userId2) {
                return EmptyList.b;
            }

            @Override // xsna.whb0
            public final Podcast n(UserId userId, UserId userId2) {
                return null;
            }

            @Override // xsna.whb0
            public final int p(UserId userId, UserId userId2) {
                return 0;
            }

            @Override // xsna.whb0
            public final io.reactivex.rxjava3.core.q<List<MusicTrack>> q(UserId userId, UserId userId2, OfflineEntitySortType offlineEntitySortType) {
                return io.reactivex.rxjava3.internal.operators.observable.g0.b;
            }

            @Override // xsna.whb0
            public final void a(UserId userId, Podcast podcast) {
            }

            @Override // xsna.whb0
            public final void f(UserId userId, UserId userId2) {
            }

            @Override // xsna.whb0
            public final void G(UserId userId, int i, a6v0 a6v0Var) {
            }

            @Override // xsna.whb0
            public final void b(UserId userId, UserId userId2, boolean z) {
            }
        }
    }
}
