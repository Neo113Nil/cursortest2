package xsna;

import com.vk.dto.video.VideoAlbum;

/* compiled from: VideoAlbumPickerItemWrapper.kt */
/* loaded from: classes5.dex */
public final class c1s0 {
    public final VideoAlbum a;

    public c1s0(VideoAlbum videoAlbum) {
        this.a = videoAlbum;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1s0) && epx.f(this.a, ((c1s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VideoAlbumPickerItemWrapper(album=" + this.a + ')';
    }
}
