package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes6.dex */
public final class fmu0 {
    public final List a;
    public final HashSet b;

    public fmu0(ArrayList arrayList, List list) {
        this.a = list;
        this.b = new HashSet(arrayList);
    }

    public final HashSet a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }
}
