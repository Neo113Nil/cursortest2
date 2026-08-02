package xsna;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class ut40 implements fu40 {
    public final MusicPickerList b;
    public final ta90 c;

    public ut40(MusicPickerList musicPickerList, ta90 ta90Var) {
        this.b = musicPickerList;
        this.c = ta90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ut40)) {
            return false;
        }
        ut40 ut40Var = (ut40) obj;
        return epx.f(this.b, ut40Var.b) && epx.f(this.c, ut40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "LoadedTracks(pickerList=" + this.b + ", data=" + this.c + ')';
    }
}
