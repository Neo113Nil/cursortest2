package xsna;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class st40 implements fu40 {
    public final MusicPickerList b;
    public final Throwable c;

    public st40(MusicPickerList musicPickerList, Throwable th) {
        this.b = musicPickerList;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st40)) {
            return false;
        }
        st40 st40Var = (st40) obj;
        return epx.f(this.b, st40Var.b) && epx.f(this.c, st40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(pickerList=");
        sb.append(this.b);
        sb.append(", throwable=");
        return oq.c(sb, this.c, ')');
    }
}
