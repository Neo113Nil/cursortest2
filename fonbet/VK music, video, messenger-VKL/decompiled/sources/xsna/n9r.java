package xsna;

import java.util.ArrayList;
import java.util.Map;

/* compiled from: FileMetadata.kt */
/* loaded from: classes11.dex */
public final class n9r {
    public final boolean a;
    public final boolean b;
    public final Long c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Map<dcy<?>, Object> g = pn00.t(jgp.b);

    public n9r(boolean z, boolean z2, Long l, Long l2, Long l3, Long l4) {
        this.a = z;
        this.b = z2;
        this.c = l;
        this.d = l2;
        this.e = l3;
        this.f = l4;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.c;
        if (l != null) {
            arrayList.add("byteCount=" + l);
        }
        Long l2 = this.d;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2);
        }
        Long l3 = this.e;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3);
        }
        Long l4 = this.f;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4);
        }
        Map<dcy<?>, Object> map = this.g;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return j5g.g0(arrayList, ", ", "FileMetadata(", ")", 0, null, 56);
    }
}
