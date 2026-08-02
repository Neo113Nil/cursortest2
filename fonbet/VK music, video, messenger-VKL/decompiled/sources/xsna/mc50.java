package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: MusicTrackMenuDialogEvent.kt */
/* loaded from: classes3.dex */
public interface mc50 {

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class a implements mc50 {
        public final MusicTrack a;
        public final Playlist b;
        public final MusicPlaybackLaunchContext c;

        public a(MusicTrack musicTrack, Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = musicTrack;
            this.b = playlist;
            this.c = musicPlaybackLaunchContext;
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class b implements mc50 {
        public final MusicTrack a;

        public b(MusicTrack musicTrack) {
            this.a = musicTrack;
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class c implements mc50 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1345055645;
        }

        public final String toString() {
            return "OpenBroadcastPopup";
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class d implements mc50 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1970725608;
        }

        public final String toString() {
            return "OpenBuyMusicSubscriptionPopup";
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class e implements mc50 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -335703653;
        }

        public final String toString() {
            return "OpenPlayerSettingsMenu";
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class f implements mc50 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1603364631;
        }

        public final String toString() {
            return "OpenSleepTimerSettings";
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    @vby
    public static final class g implements mc50 {
        public final int a;

        public final boolean equals(Object obj) {
            if (obj instanceof g) {
                return this.a == ((g) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return uqi.a("RadioUnsubscribe(radioStationId=", this.a, ')');
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class h implements mc50 {
        public final MusicTrack a;

        public h(MusicTrack musicTrack) {
            this.a = musicTrack;
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class i implements mc50 {
        public final MusicTrack a;

        public i(MusicTrack musicTrack) {
            this.a = musicTrack;
        }
    }

    /* compiled from: MusicTrackMenuDialogEvent.kt */
    public static final class j implements mc50 {
        public final MusicTrack a;
        public final Playlist b;

        public j(MusicTrack musicTrack, Playlist playlist) {
            this.a = musicTrack;
            this.b = playlist;
        }
    }
}
