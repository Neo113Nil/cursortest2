package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public final class ml0 extends xij {
    public final /* synthetic */ int a;
    public final List b;
    public final List c;

    public ml0(List list, List list2) {
        this.a = 0;
        EmptyList emptyList = EmptyList.a;
        this.b = list == null ? emptyList : list;
        this.c = list2 == null ? emptyList : list2;
    }

    public static boolean f(ml0 ml0Var, int i, int i2, gse gseVar, gse gseVar2, int i3) {
        if ((i3 & 32) != 0) {
            gseVar = new gse(28);
        }
        if ((i3 & 64) != 0) {
            gseVar2 = new gse(29);
        }
        fqj fqjVar = (fqj) ml0Var.b.get(i);
        fqj fqjVar2 = (fqj) ml0Var.c.get(i2);
        if (fqjVar.a() != fqjVar2.a()) {
            return false;
        }
        if (fqjVar instanceof gqj) {
            return jl40.l((gqj) fqjVar, (gqj) fqjVar2);
        }
        if (fqjVar instanceof jqj) {
            return ((Boolean) gseVar.invoke(fqjVar, (jqj) fqjVar2)).booleanValue();
        }
        if (fqjVar instanceof hqj) {
            return ((Boolean) gseVar2.invoke(fqjVar, (hqj) fqjVar2)).booleanValue();
        }
        if (fqjVar instanceof iqj) {
            return jl40.l((iqj) fqjVar, (iqj) fqjVar2);
        }
        w511.b();
        return false;
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return f(this, i, i2, null, null, 252);
            default:
                return jl40.l(this.b.get(i), this.c.get(i2));
        }
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        int i3 = this.a;
        List list = this.b;
        List list2 = this.c;
        switch (i3) {
            case 0:
                return jl40.l(((n4v) list.get(i)).b, ((n4v) list2.get(i2)).b);
            case 1:
                return f(this, i, i2, new gse(26), new gse(27), 156);
            default:
                if ((i != 0 || !((gf20) list.get(i)).f || !((gf20) list2.get(i2)).a(qoi0.a(hf20.class))) && (i2 != 0 || !((gf20) list2.get(i2)).f || !((gf20) list.get(i)).a(qoi0.a(hf20.class)))) {
                    if (!jl40.l(((gf20) list.get(i)).a, ((gf20) list2.get(i2)).a)) {
                        return false;
                    }
                    gf20 gf20Var = (gf20) list.get(i);
                    gf20 gf20Var2 = (gf20) list2.get(i2);
                    List list3 = gf20Var.b;
                    if (list3.size() != gf20Var2.b.size()) {
                        return false;
                    }
                    int size = list3.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (!jl40.l(((dg20) list3.get(i4)).b(), ((dg20) gf20Var2.b.get(i4)).b())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // defpackage.xij
    public final int d() {
        switch (this.a) {
        }
        return this.c.size();
    }

    @Override // defpackage.xij
    public final int e() {
        switch (this.a) {
        }
        return this.b.size();
    }

    public /* synthetic */ ml0(List list, List list2, int i) {
        this.a = i;
        this.b = list;
        this.c = list2;
    }
}
