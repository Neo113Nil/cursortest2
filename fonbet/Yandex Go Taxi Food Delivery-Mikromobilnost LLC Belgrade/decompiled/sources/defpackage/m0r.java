package defpackage;

import java.util.ArrayList;
import java.util.Map;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class m0r {
    public final boolean a;
    public final boolean b;
    public final oq90 c;
    public final Long d;
    public final Long e;
    public final Long f;
    public final Long g;
    public final Map h;

    public /* synthetic */ m0r(boolean z, boolean z2, oq90 oq90Var, Long l, Long l2, Long l3, Long l4, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : oq90Var, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : l2, (i & 32) != 0 ? null : l3, (i & 64) != 0 ? null : l4, b.f());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.a) {
            arrayList.add("isRegularFile");
        }
        if (this.b) {
            arrayList.add("isDirectory");
        }
        Long l = this.d;
        if (l != null) {
            arrayList.add("byteCount=" + l.longValue());
        }
        Long l2 = this.e;
        if (l2 != null) {
            arrayList.add("createdAt=" + l2.longValue());
        }
        Long l3 = this.f;
        if (l3 != null) {
            arrayList.add("lastModifiedAt=" + l3.longValue());
        }
        Long l4 = this.g;
        if (l4 != null) {
            arrayList.add("lastAccessedAt=" + l4.longValue());
        }
        Map map = this.h;
        if (!map.isEmpty()) {
            arrayList.add("extras=" + map);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "FileMetadata(", Extension.C_BRAKE, null, 56);
    }

    public m0r(boolean z, boolean z2, oq90 oq90Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = z;
        this.b = z2;
        this.c = oq90Var;
        this.d = l;
        this.e = l2;
        this.f = l3;
        this.g = l4;
        this.h = b.t(map);
    }

    public m0r() {
        this(false, false, (oq90) null, (Long) null, (Long) null, (Long) null, (Long) null, 255);
    }
}
