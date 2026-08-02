package xsna;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class tt40 implements fu40 {
    public final MusicPickerList b;
    public final sa90 c;

    public tt40(MusicPickerList musicPickerList, sa90 sa90Var) {
        this.b = musicPickerList;
        this.c = sa90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt40)) {
            return false;
        }
        tt40 tt40Var = (tt40) obj;
        return epx.f(this.b, tt40Var.b) && epx.f(this.c, tt40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "LoadedPlaylists(pickerList=" + this.b + ", data=" + this.c + ')';
    }
}
