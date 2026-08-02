package xsna;

import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* compiled from: InteractiveChaptersHolder.kt */
/* loaded from: classes3.dex */
public final class yax {
    public final List<com.vk.movika.sdk.base.model.c> a;
    public final Map<Integer, String> b;

    public yax(List list, MapBuilder mapBuilder) {
        this.a = list;
        this.b = mapBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yax)) {
            return false;
        }
        yax yaxVar = (yax) obj;
        return epx.f(this.a, yaxVar.a) && epx.f(this.b, yaxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InteractiveChaptersHolder(history=");
        sb.append(this.a);
        sb.append(", mapVideoIdToAccessKey=");
        return cjl0.a(sb, this.b, ')');
    }
}
