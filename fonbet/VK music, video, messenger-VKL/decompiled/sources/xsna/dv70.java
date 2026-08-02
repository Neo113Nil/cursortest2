package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.music.bottomsheets.MusicBottomSheetLaunchPoint;

/* compiled from: OfflinePodcastEpisodesMviEvent.kt */
/* loaded from: classes3.dex */
public interface dv70 extends pk50 {

    /* compiled from: OfflinePodcastEpisodesMviEvent.kt */
    public static final class a implements dv70 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1762961802;
        }

        public final String toString() {
            return "AllEpisodesDeleted";
        }
    }

    /* compiled from: OfflinePodcastEpisodesMviEvent.kt */
    public static final class b implements dv70 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 91927298;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: OfflinePodcastEpisodesMviEvent.kt */
    public static final class c implements dv70 {
        public final MusicTrack a;
        public final MusicBottomSheetLaunchPoint b;

        public c(MusicTrack musicTrack, MusicBottomSheetLaunchPoint musicBottomSheetLaunchPoint) {
            this.a = musicTrack;
            this.b = musicBottomSheetLaunchPoint;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "RemoveDownload(episode=" + this.a + ", launchPoint=" + this.b + ')';
        }
    }
}
