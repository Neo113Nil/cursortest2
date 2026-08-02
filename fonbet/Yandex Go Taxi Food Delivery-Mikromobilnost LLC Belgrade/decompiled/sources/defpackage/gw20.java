package defpackage;

import java.util.List;

/* loaded from: classes14.dex */
public final class gw20 implements kw20 {
    public final List a;
    public final List b;
    public final List c;

    public gw20(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    @Override // defpackage.kw20
    public final List getRoutes() {
        return this.a;
    }
}
