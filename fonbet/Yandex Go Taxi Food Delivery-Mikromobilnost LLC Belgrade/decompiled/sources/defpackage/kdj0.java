package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class kdj0 {
    public static final kdj0 c = new kdj0(EmptyList.a, new bdj0(null, null, null, 1023));
    public final List a;
    public final bdj0 b;

    public kdj0(List list, bdj0 bdj0Var) {
        this.a = list;
        this.b = bdj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kdj0)) {
            return false;
        }
        kdj0 kdj0Var = (kdj0) obj;
        return this.a.equals(kdj0Var.a) && this.b.equals(kdj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
