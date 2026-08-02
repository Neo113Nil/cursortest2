package xsna;

import com.vk.clips.sdk.shared.feed.model.FeedItem;
import java.util.List;

/* compiled from: InteractiveState.kt */
/* loaded from: classes17.dex */
public abstract class ubx {

    /* compiled from: InteractiveState.kt */
    public static final class a extends ubx {
        public final List<FeedItem.f> a;
        public final FeedItem.f b;

        public a(FeedItem.f fVar, List list) {
            this.a = list;
            this.b = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            FeedItem.f fVar = this.b;
            return hashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public final String toString() {
            return "Active(initialItems=" + this.a + ", lastPrefetch=" + this.b + ')';
        }
    }

    /* compiled from: InteractiveState.kt */
    public static final class b extends ubx {
        public static final b a = new b();
    }
}
