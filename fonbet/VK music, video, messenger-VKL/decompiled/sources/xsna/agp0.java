package xsna;

import com.vk.dto.music.AlbumLink;
import com.vk.dto.music.MusicTrack;
import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: TrackMenuNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface agp0 {

    /* compiled from: TrackMenuNavigationEvent.kt */
    public static final class a implements agp0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -265704177;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TrackMenuNavigationEvent.kt */
    public static final class b implements agp0 {
        public final AlbumLink a;
        public final MusicPlaybackLaunchContext b;

        public b(AlbumLink albumLink, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = albumLink;
            this.b = musicPlaybackLaunchContext;
        }
    }

    /* compiled from: TrackMenuNavigationEvent.kt */
    public static final class c implements agp0 {
        public final MusicTrack a;
        public final MusicPlaybackLaunchContext b;

        public c(MusicTrack musicTrack, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = musicTrack;
            this.b = musicPlaybackLaunchContext;
        }
    }

    /* compiled from: TrackMenuNavigationEvent.kt */
    public static final class d implements agp0 {
        public final MusicTrack a;

        public d(MusicTrack musicTrack) {
            this.a = musicTrack;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return rq.c(new StringBuilder("Share(track="), this.a, ')');
        }
    }

    /* compiled from: TrackMenuNavigationEvent.kt */
    public static final class e implements agp0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1454749035;
        }

        public final String toString() {
            return "ShowKidsRestrictionSnack";
        }
    }

    /* compiled from: TrackMenuNavigationEvent.kt */
    @vby
    public static final class f implements agp0 {
        public final String a;

        public /* synthetic */ f(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof f) {
                return epx.f(this.a, ((f) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return air.b(')', "ShowSubscriptionOffer(url=", this.a);
        }
    }

    /* compiled from: TrackMenuNavigationEvent.kt */
    public static final class g implements agp0 {
        public static final g a = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1122040110;
        }

        public final String toString() {
            return "VkMixPlay";
        }
    }
}
