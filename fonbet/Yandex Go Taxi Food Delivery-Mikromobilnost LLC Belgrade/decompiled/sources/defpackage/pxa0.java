package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class pxa0 {
    public final String a;
    public final long b;
    public final List c;
    public final List d;

    public pxa0(String str, long j, List list, List list2) {
        this.a = str;
        this.b = j;
        this.c = Collections.unmodifiableList(list);
        this.d = Collections.unmodifiableList(list2);
    }
}
