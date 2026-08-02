package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.video.VideoAlbum;
import java.util.List;

/* compiled from: PlaylistScreenEvent.kt */
/* loaded from: classes6.dex */
public interface ncb0 extends pk50 {

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class a implements ncb0 {
        public final bea a;

        public a(bea beaVar) {
            this.a = beaVar;
        }
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class b implements ncb0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1492877134;
        }

        public final String toString() {
            return "CloseScreen";
        }
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class c implements ncb0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -990995021;
        }

        public final String toString() {
            return "Login";
        }
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class d implements ncb0 {
        public final VideoAlbum a;

        public d(VideoAlbum videoAlbum) {
            this.a = videoAlbum;
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
            return "OpenAddVideosToPlaylist(album=" + this.a + ')';
        }
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class e implements ncb0 {
        public final VideoAlbum a;

        public e(VideoAlbum videoAlbum) {
            this.a = videoAlbum;
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
            return "OpenPlaylistEditScreen(album=" + this.a + ')';
        }
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class f implements ncb0 {
        public final Owner a;

        public f(Owner owner) {
            this.a = owner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenUpload(owner=" + this.a + ')';
        }
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class g implements ncb0 {
        public final List<VideoFile> a;
        public final String b;
        public final int c;

        /* JADX WARN: Multi-variable type inference failed */
        public g(List<? extends VideoFile> list, String str, int i) {
            this.a = list;
            this.b = str;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && this.c == gVar.c;
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return Integer.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayShuffledVideos(videoFiles=");
            sb.append(this.a);
            sb.append(", playlistTitle=");
            sb.append(this.b);
            sb.append(", shuffleId=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class h implements ncb0 {
        public final List<VideoFile> a;
        public final String b;

        /* JADX WARN: Multi-variable type inference failed */
        public h(List<? extends VideoFile> list, String str) {
            this.a = list;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return epx.f(this.a, hVar.a) && epx.f(this.b, hVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlayVideos(videoFiles=");
            sb.append(this.a);
            sb.append(", playlistTitle=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class i implements ncb0 {
    }

    /* compiled from: PlaylistScreenEvent.kt */
    public static final class j implements ncb0 {
        public final VideoAlbum a;

        public j(VideoAlbum videoAlbum) {
            this.a = videoAlbum;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && epx.f(this.a, ((j) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowMoreBottomSheet(album=" + this.a + ')';
        }
    }
}
