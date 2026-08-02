package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;

/* compiled from: ClipsPlaylistsFolderNamingEvent.kt */
/* loaded from: classes16.dex */
public interface xse {

    /* compiled from: ClipsPlaylistsFolderNamingEvent.kt */
    public static final class a implements xse {
        public final ShortVideoPlaylistFullDto a;

        public a(ShortVideoPlaylistFullDto shortVideoPlaylistFullDto) {
            this.a = shortVideoPlaylistFullDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnSave(playlist=" + this.a + ')';
        }
    }
}
