package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsPlaylistsFoldersNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface ute {

    /* compiled from: ClipsPlaylistsFoldersNavigationEvent.kt */
    public static final class a implements ute {
        public final UserId a;

        public a(UserId userId) {
            this.a = userId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Long.hashCode(this.a.b);
        }

        public final String toString() {
            return gp.b(new StringBuilder("CreateFolderDialog(ownerId="), this.a, ')');
        }
    }

    /* compiled from: ClipsPlaylistsFoldersNavigationEvent.kt */
    public static final class b implements ute {
        public static final b a = new b();
    }

    /* compiled from: ClipsPlaylistsFoldersNavigationEvent.kt */
    public static final class c implements ute {
        public final ClipsPlaylist a;

        public c(ClipsPlaylist clipsPlaylist) {
            this.a = clipsPlaylist;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PlaylistDeselected(playlist=" + this.a + ')';
        }
    }

    /* compiled from: ClipsPlaylistsFoldersNavigationEvent.kt */
    public static final class d implements ute {
        public final ClipsPlaylist a;

        public d(ClipsPlaylist clipsPlaylist) {
            this.a = clipsPlaylist;
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
            return "PlaylistSelected(playlist=" + this.a + ')';
        }
    }
}
