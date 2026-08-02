package xsna;

import com.vk.dto.newsfeed.activities.Activity;
import java.util.Map;
import kotlin.Pair;

/* compiled from: PostsAsyncData.kt */
/* loaded from: classes4.dex */
public final class qtc0 {
    public final Object a;

    public qtc0(Map<Pair<Long, Integer>, ? extends Activity> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qtc0) && this.a.equals(((qtc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return k73.c(new StringBuilder("PostsAsyncData(activities="), this.a, ')');
    }
}
