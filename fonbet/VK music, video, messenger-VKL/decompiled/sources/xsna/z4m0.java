package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.stories.ImStoryState;

/* compiled from: StoryInfoStorageModel.kt */
/* loaded from: classes2.dex */
public final class z4m0 {
    public final Peer a;
    public final ImStoryState b;
    public final long c;

    public z4m0(Peer peer, ImStoryState imStoryState, long j) {
        this.a = peer;
        this.b = imStoryState;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4m0)) {
            return false;
        }
        z4m0 z4m0Var = (z4m0) obj;
        return epx.f(this.a, z4m0Var.a) && this.b == z4m0Var.b && this.c == z4m0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a.b) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryInfoStorageModel(owner=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", lastUpdatedTtl=");
        return vu5.a(')', this.c, sb);
    }
}
