package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.List;

/* compiled from: MusicPickerAction.kt */
/* loaded from: classes4.dex */
public final class fs40 implements lr40 {
    public final List<MusicDto> b;

    public fs40(List<MusicDto> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fs40) && epx.f(this.b, ((fs40) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("SetTracks(tracks="), this.b);
    }
}
