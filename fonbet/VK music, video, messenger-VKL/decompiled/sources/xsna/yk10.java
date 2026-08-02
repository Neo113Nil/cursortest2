package xsna;

import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: MatchResult.kt */
/* loaded from: classes4.dex */
public final class yk10 {
    public final Map<String, String> a;

    public yk10(MapBuilder mapBuilder) {
        this.a = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk10) && epx.f(this.a, ((yk10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cjl0.a(new StringBuilder("Success(pathParams="), this.a, ')');
    }
}
