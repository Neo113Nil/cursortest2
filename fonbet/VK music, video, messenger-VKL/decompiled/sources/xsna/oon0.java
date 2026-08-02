package xsna;

import com.vk.catalog2.common.dto.api.CatalogDataType;
import java.util.Set;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class oon0 extends n3a {
    public final String a;
    public final Set<CatalogDataType> b;
    public final boolean c;
    public final boolean d;

    public oon0() {
        throw null;
    }

    public oon0(String str, Set set, boolean z, boolean z2, int i) {
        set = (i & 2) != 0 ? null : set;
        z = (i & 4) != 0 ? false : z;
        z2 = (i & 8) != 0 ? false : z2;
        this.a = str;
        this.b = set;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oon0)) {
            return false;
        }
        oon0 oon0Var = (oon0) obj;
        return epx.f(this.a, oon0Var.a) && epx.f(this.b, oon0Var.b) && this.c == oon0Var.c && this.d == oon0Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Set<CatalogDataType> set = this.b;
        return Boolean.hashCode(this.d) + qoy.b((hashCode + (set == null ? 0 : set.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncWithEventTypeCmd(listenEventKey=");
        sb.append(this.a);
        sb.append(", onlyBlockWithDataType=");
        sb.append(this.b);
        sb.append(", scrollToVerticalTop=");
        sb.append(this.c);
        sb.append(", scrollToHorizontalTop=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
