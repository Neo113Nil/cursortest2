package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class gu40 implements fu40 {
    public final MusicTrack b;
    public final MusicPickerListItem.MusicTrackItem.PlayingState c;

    public gu40(MusicTrack musicTrack, MusicPickerListItem.MusicTrackItem.PlayingState playingState) {
        this.b = musicTrack;
        this.c = playingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu40)) {
            return false;
        }
        gu40 gu40Var = (gu40) obj;
        return epx.f(this.b, gu40Var.b) && this.c == gu40Var.c;
    }

    public final int hashCode() {
        MusicTrack musicTrack = this.b;
        return this.c.hashCode() + ((musicTrack == null ? 0 : musicTrack.hashCode()) * 31);
    }

    public final String toString() {
        return "Set(track=" + this.b + ", state=" + this.c + ')';
    }
}
