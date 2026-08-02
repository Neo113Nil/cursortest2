package xsna;

import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;

/* compiled from: ClipsPlaylistsFolderNamingPatch.kt */
/* loaded from: classes16.dex */
public final class bte implements ate {
    public final ShortVideoPlaylistFullDto b;

    public bte(ShortVideoPlaylistFullDto shortVideoPlaylistFullDto) {
        this.b = shortVideoPlaylistFullDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bte) && epx.f(this.b, ((bte) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Done(playlist=" + this.b + ')';
    }
}
