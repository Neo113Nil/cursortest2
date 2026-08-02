package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public final class zr40 implements lr40 {
    public final MusicTrack b;
    public final MusicPickerListItem.MusicTrackItem.PlayingState c;

    public zr40(MusicTrack musicTrack, MusicPickerListItem.MusicTrackItem.PlayingState playingState) {
        this.b = musicTrack;
        this.c = playingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr40)) {
            return false;
        }
        zr40 zr40Var = (zr40) obj;
        return epx.f(this.b, zr40Var.b) && this.c == zr40Var.c;
    }

    public final int hashCode() {
        MusicTrack musicTrack = this.b;
        return this.c.hashCode() + ((musicTrack == null ? 0 : musicTrack.hashCode()) * 31);
    }

    public final String toString() {
        return "Update(track=" + this.b + ", state=" + this.c + ')';
    }
}
