package xsna;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class vt40 implements fu40 {
    public final MusicPickerList b;

    public vt40(MusicPickerList musicPickerList) {
        this.b = musicPickerList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vt40) && epx.f(this.b, ((vt40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LoadingPlaylists(pickerList=" + this.b + ')';
    }
}
