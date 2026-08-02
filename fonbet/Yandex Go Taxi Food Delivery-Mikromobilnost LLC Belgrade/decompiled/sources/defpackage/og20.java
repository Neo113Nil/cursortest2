package defpackage;

import java.util.List;
import java.util.function.BiFunction;
import kotlin.collections.EmptyList;

/* loaded from: classes6.dex */
public class og20 extends xij {
    public final /* synthetic */ int a = 1;
    public final List b;
    public final List c;
    public final Object d;

    public og20(List list, List list2, BiFunction biFunction) {
        this.d = biFunction;
        EmptyList emptyList = EmptyList.a;
        this.b = list == null ? emptyList : list;
        this.c = list2 == null ? emptyList : list2;
    }

    @Override // defpackage.xij
    public final boolean a(int i, int i2) {
        int i3 = this.a;
        List list = this.c;
        List list2 = this.b;
        switch (i3) {
            case 0:
                return ((pg20) this.d).y.e(list2.get(i), list.get(i2));
            default:
                return jl40.l(list2.get(i), list.get(i2));
        }
    }

    @Override // defpackage.xij
    public final boolean b(int i, int i2) {
        int i3 = this.a;
        List list = this.c;
        List list2 = this.b;
        Object obj = this.d;
        switch (i3) {
            case 0:
                return ((pg20) obj).y.c(list2.get(i), list.get(i2));
            default:
                return ((Boolean) ((BiFunction) obj).apply(list2.get(i), list.get(i2))).booleanValue();
        }
    }

    @Override // defpackage.xij
    public final int d() {
        int i = this.a;
        List list = this.c;
        switch (i) {
        }
        return list.size();
    }

    @Override // defpackage.xij
    public final int e() {
        switch (this.a) {
        }
        return this.b.size();
    }

    public og20(List list, List list2, pg20 pg20Var) {
        this.b = list;
        this.c = list2;
        this.d = pg20Var;
    }
}
