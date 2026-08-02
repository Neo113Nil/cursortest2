package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.stories.ImStoryState;
import java.util.Map;

/* compiled from: ImItemsStories.kt */
/* loaded from: classes2.dex */
public final class p8w {
    public static final bpn0 b = new bpn0(new nh0(18));
    public final Map<Peer, ImStoryState> a;

    /* JADX WARN: Multi-variable type inference failed */
    public p8w(Map<Peer, ? extends ImStoryState> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p8w) && epx.f(this.a, ((p8w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("ImItemsStories(info="), this.a, ')');
    }
}
