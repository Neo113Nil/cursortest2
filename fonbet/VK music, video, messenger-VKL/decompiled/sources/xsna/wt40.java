package xsna;

import com.vk.dto.music.Playlist;
import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class wt40 implements fu40 {
    public final MusicPickerList b;
    public final Playlist c;

    public wt40(MusicPickerList musicPickerList, Playlist playlist) {
        this.b = musicPickerList;
        this.c = playlist;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt40)) {
            return false;
        }
        wt40 wt40Var = (wt40) obj;
        return epx.f(this.b, wt40Var.b) && epx.f(this.c, wt40Var.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Playlist playlist = this.c;
        return hashCode + (playlist == null ? 0 : playlist.hashCode());
    }

    public final String toString() {
        return "LoadingTracks(pickerList=" + this.b + ", playlist=" + this.c + ')';
    }
}
