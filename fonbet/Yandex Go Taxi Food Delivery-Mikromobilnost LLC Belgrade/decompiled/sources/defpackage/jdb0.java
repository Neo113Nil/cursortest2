package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class jdb0 implements kdb0 {
    public static final jdb0 a = new jdb0();
    public static final List b = Collections.singletonList(new hyk(new eal(zks0.b, false, null, 6)));

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jdb0);
    }

    @Override // defpackage.kdb0
    public final List getItems() {
        return b;
    }

    public final int hashCode() {
        return 271955349;
    }

    public final String toString() {
        return "Skeleton";
    }
}
