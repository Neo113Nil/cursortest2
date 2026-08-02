package xsna;

import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsPlaylistsSmallFoldersNavigationEvent.kt */
/* loaded from: classes16.dex */
public interface bve {

    /* compiled from: ClipsPlaylistsSmallFoldersNavigationEvent.kt */
    public static final class a implements bve {
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

    /* compiled from: ClipsPlaylistsSmallFoldersNavigationEvent.kt */
    public static final class b implements bve {
        public final ClipsPlaylist a;

        public b(ClipsPlaylist clipsPlaylist) {
            this.a = clipsPlaylist;
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
            return "PlaylistClicked(playlist=" + this.a + ')';
        }
    }
}
