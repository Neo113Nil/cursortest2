package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class one0 {
    public final List a;
    public final List[] b;
    public int c;
    public int d;
    public boolean e;
    public final /* synthetic */ pne0 f;

    public one0(pne0 pne0Var, List list) {
        this.f = pne0Var;
        this.a = list;
        this.b = new List[list.size()];
        if (list.isEmpty()) {
            lxv.a("NestedPrefetchController shouldn't be created with no states");
        }
    }
}
