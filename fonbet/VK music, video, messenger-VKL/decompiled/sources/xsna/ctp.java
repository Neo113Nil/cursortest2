package xsna;

import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: EpisodeOfflineInteractor.kt */
/* loaded from: classes.dex */
public interface ctp {
    void t(int i, UserId userId, String str, ArrayList arrayList);

    void u(UserId userId, MusicTrack musicTrack, UserId userId2);

    String v(String str);

    void w(UserId userId, String str, String str2);

    void x(String str, DownloadingState downloadingState);

    List y(UserId userId, ArrayList arrayList);

    MusicTrack z(UserId userId, String str);

    /* compiled from: EpisodeOfflineInteractor.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final ctp STUB = new C2683a();

        public final ctp getSTUB() {
            return STUB;
        }

        /* compiled from: EpisodeOfflineInteractor.kt */
        /* renamed from: xsna.ctp$a$a, reason: collision with other inner class name */
        public static final class C2683a implements ctp {
            @Override // xsna.ctp
            public final String v(String str) {
                return null;
            }

            @Override // xsna.ctp
            public final List y(UserId userId, ArrayList arrayList) {
                return EmptyList.b;
            }

            @Override // xsna.ctp
            public final MusicTrack z(UserId userId, String str) {
                return null;
            }

            @Override // xsna.ctp
            public final void x(String str, DownloadingState downloadingState) {
            }

            @Override // xsna.ctp
            public final void u(UserId userId, MusicTrack musicTrack, UserId userId2) {
            }

            @Override // xsna.ctp
            public final void w(UserId userId, String str, String str2) {
            }

            @Override // xsna.ctp
            public final void t(int i, UserId userId, String str, ArrayList arrayList) {
            }
        }
    }
}
