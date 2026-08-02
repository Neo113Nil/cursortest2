package xsna;

import com.vk.feed.settings.api.domain.model.FilteredSourceType;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: NewsfeedFilteredSourcesState.kt */
/* loaded from: classes18.dex */
public final class cj60 implements km50 {
    public final Map<FilteredSourceType, Integer> b;
    public final boolean c;
    public final boolean d;

    public cj60() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj60)) {
            return false;
        }
        cj60 cj60Var = (cj60) obj;
        return epx.f(this.b, cj60Var.b) && this.c == cj60Var.c && this.d == cj60Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedFilteredSourcesState(counters=");
        sb.append(this.b);
        sb.append(", isLoading=");
        sb.append(this.c);
        sb.append(", hasError=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public cj60(Map map, int i) {
        map = (i & 1) != 0 ? new EnumMap(FilteredSourceType.class) : map;
        boolean z = (i & 2) == 0;
        boolean z2 = (i & 4) == 0;
        this.b = map;
        this.c = z;
        this.d = z2;
    }
}
