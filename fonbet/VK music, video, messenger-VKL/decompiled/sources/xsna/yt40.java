package xsna;

import com.vk.newsfeed.posting.music_picker.domain.model.MusicPickerList;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class yt40 implements fu40 {
    public final MusicPickerList b;
    public final Throwable c;

    public yt40(MusicPickerList musicPickerList, Throwable th) {
        this.b = musicPickerList;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yt40)) {
            return false;
        }
        yt40 yt40Var = (yt40) obj;
        return epx.f(this.b, yt40Var.b) && epx.f(this.c, yt40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NextPageLoadingError(pickerList=");
        sb.append(this.b);
        sb.append(", throwable=");
        return oq.c(sb, this.c, ')');
    }
}
