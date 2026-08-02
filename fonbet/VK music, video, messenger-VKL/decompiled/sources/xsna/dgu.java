package xsna;

import com.vk.geo.impl.model.ZoomLevel;
import com.vk.geo.impl.model.id.StringId;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: GridResult.kt */
/* loaded from: classes2.dex */
public final class dgu {
    public final ArrayList a;
    public final ZoomLevel b;
    public final boolean c;
    public final Map<StringId, akt> d;
    public final List<lif0> e;
    public final String f;

    public dgu() {
        throw null;
    }

    public dgu(ArrayList arrayList, ZoomLevel zoomLevel, boolean z, Map map, List list, String str) {
        this.a = arrayList;
        this.b = zoomLevel;
        this.c = z;
        this.d = map;
        this.e = list;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        if (this != obj) {
            if (obj instanceof dgu) {
                dgu dguVar = (dgu) obj;
                if (epx.f(this.a, dguVar.a) && epx.f(this.b, dguVar.b) && this.c == dguVar.c && epx.f(this.d, dguVar.d) && epx.f(this.e, dguVar.e)) {
                    String str = dguVar.f;
                    String str2 = this.f;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ZoomLevel zoomLevel = this.b;
        int a = v11.a(qoy.b((hashCode + (zoomLevel == null ? 0 : Float.hashCode(zoomLevel.b))) * 31, 31, this.c), 31, this.d);
        List<lif0> list = this.e;
        int hashCode2 = (a + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridResult(clusters=");
        sb.append(this.a);
        sb.append(", zoomLevel=");
        sb.append(this.b);
        sb.append(", containsDistricts=");
        sb.append(this.c);
        sb.append(", previousClusters=");
        sb.append(this.d);
        sb.append(", rects=");
        sb.append(this.e);
        sb.append(", selectedId=");
        String str = this.f;
        return tq.f(sb, str == null ? "null" : StringId.a(str), ')');
    }
}
