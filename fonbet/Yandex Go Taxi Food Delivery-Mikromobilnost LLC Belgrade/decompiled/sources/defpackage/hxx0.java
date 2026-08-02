package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes14.dex */
public final class hxx0 {
    public final j6z0 a;
    public final List b;
    public final List c;
    public final qim d;
    public final iqb0 e;
    public final List f;

    public hxx0(gxx0 gxx0Var) {
        this.a = gxx0Var.a;
        List list = gxx0Var.c;
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        this.b = Collections.unmodifiableList(arrayList);
        List list2 = gxx0Var.d;
        ArrayList arrayList2 = new ArrayList(list2.size());
        for (Object obj2 : list2) {
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = gxx0Var.b;
        this.e = gxx0Var.e;
        this.f = gxx0Var.f;
    }
}
