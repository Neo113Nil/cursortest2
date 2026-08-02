package xsna;

import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import java.util.List;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class gic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final List<CoauthorDto> b;

    public gic0(List<CoauthorDto> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gic0) && epx.f(this.b, ((gic0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("CoauthorsSelected(coauthors="), this.b);
    }
}
