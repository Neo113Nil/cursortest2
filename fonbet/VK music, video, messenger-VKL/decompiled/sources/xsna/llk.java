package xsna;

import com.vk.dto.music.MusicTrack;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;

/* compiled from: MusicPickerItems.kt */
/* loaded from: classes4.dex */
public final class llk implements vax {
    public final MusicTrack a;
    public final MusicPickerListItem.MusicTrackItem.PlayingState b;

    public llk(MusicTrack musicTrack, MusicPickerListItem.MusicTrackItem.PlayingState playingState) {
        this.a = musicTrack;
        this.b = playingState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llk)) {
            return false;
        }
        llk llkVar = (llk) obj;
        return epx.f(this.a, llkVar.a) && this.b == llkVar.b;
    }

    public final int hashCode() {
        MusicTrack musicTrack = this.a;
        return this.b.hashCode() + ((musicTrack == null ? 0 : musicTrack.hashCode()) * 31);
    }

    public final String toString() {
        return "CurrentPlayingTrackInteraction(currentTrack=" + this.a + ", playingState=" + this.b + ')';
    }
}
