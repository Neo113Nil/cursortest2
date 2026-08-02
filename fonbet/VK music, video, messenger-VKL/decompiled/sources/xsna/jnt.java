package xsna;

import com.vk.geo.impl.model.VisibleStyle;
import com.vk.geo.impl.presentation.i;
import java.util.List;
import java.util.Map;

/* compiled from: GeoState.kt */
/* loaded from: classes2.dex */
public final class jnt implements km50 {
    public static final jnt f = new jnt(null, null, null, null);
    public final jo00 b;
    public final com.vk.geo.impl.presentation.i c;
    public final List<lif0> d;
    public final Map<do00, VisibleStyle> e;

    public jnt() {
        this(null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.vk.geo.impl.presentation.i] */
    public static jnt a(jnt jntVar, jo00 jo00Var, i.a aVar, List list, int i) {
        if ((i & 1) != 0) {
            jo00Var = jntVar.b;
        }
        i.a aVar2 = aVar;
        if ((i & 2) != 0) {
            aVar2 = jntVar.c;
        }
        jntVar.getClass();
        if ((i & 8) != 0) {
            list = jntVar.d;
        }
        Map<do00, VisibleStyle> map = (i & 16) != 0 ? jntVar.e : null;
        jntVar.getClass();
        return new jnt(jo00Var, aVar2, list, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jnt)) {
            return false;
        }
        jnt jntVar = (jnt) obj;
        return epx.f(this.b, jntVar.b) && epx.f(this.c, jntVar.c) && epx.f(this.d, jntVar.d) && epx.f(this.e, jntVar.e);
    }

    public final int hashCode() {
        jo00 jo00Var = this.b;
        int hashCode = (jo00Var == null ? 0 : jo00Var.hashCode()) * 31;
        com.vk.geo.impl.presentation.i iVar = this.c;
        int hashCode2 = (hashCode + (iVar == null ? 0 : iVar.hashCode())) * 961;
        List<lif0> list = this.d;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<do00, VisibleStyle> map = this.e;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoState(markerOperations=");
        sb.append(this.b);
        sb.append(", error=");
        sb.append(this.c);
        sb.append(", bbox=null, debugRects=");
        sb.append(this.d);
        sb.append(", newIcons=");
        return cjl0.a(sb, this.e, ')');
    }

    public jnt(jo00 jo00Var, com.vk.geo.impl.presentation.i iVar, List list, Map map) {
        this.b = jo00Var;
        this.c = iVar;
        this.d = list;
        this.e = map;
    }
}
