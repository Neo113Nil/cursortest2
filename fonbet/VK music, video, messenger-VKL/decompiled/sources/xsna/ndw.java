package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.stories.ImStoryState;
import java.util.Map;

/* compiled from: ImStoriesInfo.kt */
/* loaded from: classes.dex */
public abstract class ndw {

    /* compiled from: ImStoriesInfo.kt */
    /* loaded from: classes2.dex */
    public static final class b extends ndw {
        public static final b a = new b();
    }

    /* compiled from: ImStoriesInfo.kt */
    public static final class a extends ndw {
        public final Map<Peer, ImStoryState> a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Map<Peer, ? extends ImStoryState> map) {
            this.a = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return cjl0.a(new StringBuilder("Data(states="), this.a, ')');
        }

        public a() {
            this(jgp.b);
        }
    }
}
