package xsna;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class zt40 implements fu40 {
    public final MusicPickerList b;

    public zt40(MusicPickerList musicPickerList) {
        this.b = musicPickerList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zt40) && epx.f(this.b, ((zt40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "NextPageLoadingPlaylists(pickerList=" + this.b + ')';
    }
}
