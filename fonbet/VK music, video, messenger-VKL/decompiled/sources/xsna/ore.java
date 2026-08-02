package xsna;

import com.vk.clips.playlists.ClipsPlaylistNamingLaunchParams;
import com.vk.clips.sdk.shared.api.playlist.ClipsPlaylist;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipsPlaylistUiNavEvent.kt */
/* loaded from: classes16.dex */
public interface ore {

    /* compiled from: ClipsPlaylistUiNavEvent.kt */
    public static final class a implements ore {
        public static final a a = new a();
    }

    /* compiled from: ClipsPlaylistUiNavEvent.kt */
    public static final class b implements ore {
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
            return "HidePlaylistAndOpenEmpty(playlist=" + this.a + ')';
        }
    }

    /* compiled from: ClipsPlaylistUiNavEvent.kt */
    public static final class c implements ore {
        public final UserId a;
        public final int b;

        public c(UserId userId, int i) {
            this.a = userId;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPickerAddClips(ownerId=");
            sb.append(this.a);
            sb.append(", playlistId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiNavEvent.kt */
    public static final class d implements ore {
        public final UserId a;
        public final int b;
        public final String c;

        public d(UserId userId, int i, String str) {
            this.a = userId;
            this.b = i;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b && epx.f(this.c, dVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenPickerRemoveClips(ownerId=");
            sb.append(this.a);
            sb.append(", playlistId=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsPlaylistUiNavEvent.kt */
    public static final class e implements ore {
        public final ClipsPlaylistNamingLaunchParams a;

        public e(ClipsPlaylistNamingLaunchParams clipsPlaylistNamingLaunchParams) {
            this.a = clipsPlaylistNamingLaunchParams;
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
            return "RenamePlaylist(launchParams=" + this.a + ')';
        }
    }
}
