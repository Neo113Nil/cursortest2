package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AdaptationSet.java */
/* loaded from: classes12.dex */
public final class cj0 {
    public final long a;
    public final int b;
    public final List<e7g0> c;
    public final List<y2m> d;
    public final List<y2m> e;
    public final List<y2m> f;

    public cj0(long j, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.a = j;
        this.b = i;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}
