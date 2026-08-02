package xsna;

import android.content.Context;
import com.vk.dto.common.account.AudioAdConfig;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.playback.PlaybackLaunchMeta;
import com.vk.music.playerservice.impl.PlayerService;
import xsna.mu90;

/* compiled from: AudioAdStateManager.kt */
/* loaded from: classes3.dex */
public interface nb4 {
    public static final a a = a.a;

    xh50<mu90> a();

    boolean b(MusicTrack musicTrack);

    void c(String str);

    void d(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, Context context);

    void e(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, PlayerService playerService, AudioAdConfig.Type type, boolean z);

    /* compiled from: AudioAdStateManager.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        private static final nb4 STUB = new C3394a();

        public final nb4 getSTUB() {
            return STUB;
        }

        /* compiled from: AudioAdStateManager.kt */
        /* renamed from: xsna.nb4$a$a, reason: collision with other inner class name */
        public static final class C3394a implements nb4 {
            public final utk0 b = vtk0.a(mu90.a.a);

            @Override // xsna.nb4
            public final xh50<mu90> a() {
                return this.b;
            }

            @Override // xsna.nb4
            public final boolean b(MusicTrack musicTrack) {
                return true;
            }

            @Override // xsna.nb4
            public final void c(String str) {
            }

            @Override // xsna.nb4
            public final void d(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, Context context) {
            }

            @Override // xsna.nb4
            public final void e(MusicTrack musicTrack, PlaybackLaunchMeta playbackLaunchMeta, PlayerService playerService, AudioAdConfig.Type type, boolean z) {
            }
        }
    }
}
