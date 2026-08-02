package xsna;

import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: MusicTrackMenuNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface ed50 {

    /* compiled from: MusicTrackMenuNavigationEvent.kt */
    public static final class a implements ed50 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2056650974;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: MusicTrackMenuNavigationEvent.kt */
    public static final class b implements ed50 {
        public final AlbumLink a;
        public final MusicPlaybackLaunchContext b;

        public b(AlbumLink albumLink, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = albumLink;
            this.b = musicPlaybackLaunchContext;
        }
    }

    /* compiled from: MusicTrackMenuNavigationEvent.kt */
    public static final class c implements ed50 {
        public final MusicTrack a;
        public final MusicPlaybackLaunchContext b;

        public c(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = musicTrack;
            this.b = musicPlaybackLaunchContext;
        }
    }

    /* compiled from: MusicTrackMenuNavigationEvent.kt */
    public static final class d implements ed50 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -113997682;
        }

        public final String toString() {
            return "OpenEqualizer";
        }
    }

    /* compiled from: MusicTrackMenuNavigationEvent.kt */
    public static final class e implements ed50 {
        public final MusicTrack a;

        public e(MusicTrack musicTrack) {
            this.a = musicTrack;
        }
    }

    /* compiled from: MusicTrackMenuNavigationEvent.kt */
    public static final class f implements ed50 {
        public final MusicTrack a;

        public f(MusicTrack musicTrack) {
            this.a = musicTrack;
        }
    }

    /* compiled from: MusicTrackMenuNavigationEvent.kt */
    public static final class g implements ed50 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 331050598;
        }

        public final String toString() {
            return "ShowKidsRestrictionSnack";
        }
    }

    /* compiled from: MusicTrackMenuNavigationEvent.kt */
    public static final class h implements ed50 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -829498591;
        }

        public final String toString() {
            return "VkMixPlay";
        }
    }
}
