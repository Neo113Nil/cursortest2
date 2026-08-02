package xsna;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: DialogWeightUtils.kt */
/* loaded from: classes2.dex */
public final class nmm {
    public final LinkedHashMap a;
    public final Map<Long, com.vk.im.engine.models.dialogs.b> b;
    public final Map<Long, lj30> c;

    public nmm(LinkedHashMap linkedHashMap, Map map, Map map2) {
        this.a = linkedHashMap;
        this.b = map;
        this.c = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nmm)) {
            return false;
        }
        nmm nmmVar = (nmm) obj;
        return this.a.equals(nmmVar.a) && this.b.equals(nmmVar.b) && epx.f(this.c, nmmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + v11.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CalculateResult(weights=");
        sb.append(this.a);
        sb.append(", dialogs=");
        sb.append(this.b);
        sb.append(", latestMsgs=");
        return cjl0.a(sb, this.c, ')');
    }
}
