package xsna;

import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;

/* compiled from: PlaylistMenuNavigationEvent.kt */
/* loaded from: classes3.dex */
public interface dbb0 {

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class a implements dbb0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 81352881;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class b implements dbb0 {
        public final Playlist a;

        public b(Playlist playlist) {
            this.a = playlist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DownloadWithDialogIfNeed(playlist=" + this.a + ')';
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class c implements dbb0 {
        public final Playlist a;
        public final MusicPlaybackLaunchContext b;

        public c(Playlist playlist, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
            this.a = playlist;
            this.b = musicPlaybackLaunchContext;
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
            return this.b.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenArtist(playlist=" + this.a + ", refer=" + this.b + ')';
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class d implements dbb0 {
        public final Playlist a;

        public d(Playlist playlist) {
            this.a = playlist;
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
            return "OpenEditPlaylistScreen(playlist=" + this.a + ')';
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class e implements dbb0 {
        public final Playlist a;

        public e(Playlist playlist) {
            this.a = playlist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenRemoveFromStorageConfirmationDialog(playlist=" + this.a + ')';
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class f implements dbb0 {
        public final Playlist a;
        public final xq1 b;

        public f(Playlist playlist, xq1 xq1Var) {
            this.a = playlist;
            this.b = xq1Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b.equals(fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "OpenRemovingPlaylistConfirmationDialog(playlist=" + this.a + ", onConfirm=" + this.b + ')';
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class g implements dbb0 {
        public final Playlist a;

        public g(Playlist playlist) {
            this.a = playlist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.a, ((g) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Share(playlist=" + this.a + ')';
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class h implements dbb0 {
        public final Playlist a;

        public h(Playlist playlist) {
            this.a = playlist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShareCoverToStory(playlist=" + this.a + ')';
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class i implements dbb0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 100206928;
        }

        public final String toString() {
            return "ShowDownloadBuyMusicSubscriptionDialog";
        }
    }

    /* compiled from: PlaylistMenuNavigationEvent.kt */
    public static final class j implements dbb0 {
        public static final j a = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1322674099;
        }

        public final String toString() {
            return "ShowKidsRestrictionSnack";
        }
    }
}
