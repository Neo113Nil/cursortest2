package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.entities.StoryUserProfile;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: StoryStatisticsViewerCache.kt */
/* loaded from: classes6.dex */
public final class ohm0 {
    public final phm0 a;
    public final zhm0 b;
    public final ConcurrentHashMap<a, List<StoryUserProfile>> c = new ConcurrentHashMap<>();
    public final znk0 d = new znk0();

    /* compiled from: StoryStatisticsViewerCache.kt */
    public static final class a {
        public final UserId a;
        public final int b;

        public a(UserId userId, int i) {
            this.a = userId;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Long.hashCode(this.a.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StoryViewerKey(ownerId=");
            sb.append(this.a);
            sb.append(", storyId=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public ohm0(phm0 phm0Var, zhm0 zhm0Var) {
        this.a = phm0Var;
        this.b = zhm0Var;
    }
}
