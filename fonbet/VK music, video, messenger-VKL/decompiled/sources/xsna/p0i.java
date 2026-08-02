package xsna;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: CommunityScheduledClipsGridContent.kt */
/* loaded from: classes5.dex */
public final class p0i {
    public final List<o0i> a;
    public final boolean b;

    public p0i() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public p0i(ArrayList arrayList, int i) {
        List list = (i & 1) != 0 ? EmptyList.b : arrayList;
        boolean z = (i & 2) == 0;
        this.a = list;
        this.b = z;
    }
}
