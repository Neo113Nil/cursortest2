package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.List;

/* compiled from: MusicPickerPatch.kt */
/* loaded from: classes4.dex */
public final class ju40 implements fu40 {
    public final List<MusicDto> b;

    public ju40(List<MusicDto> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ju40) && epx.f(this.b, ((ju40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("SetTracks(tracks="), this.b);
    }
}
