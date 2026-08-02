package defpackage;

import com.yandex.div.core.expression.variables.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.builders.ListBuilder;

/* loaded from: classes.dex */
public final /* synthetic */ class atl implements hir {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ atl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.hir
    public final void a(tjk tjkVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ujk a = tjkVar.a();
                ListBuilder a2 = rcc.a();
                a2.add(a.e);
                Set set = (Set) obj;
                ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add((plk) ((g601) it.next()).a.get());
                }
                a2.addAll(arrayList);
                tjkVar.e = new xjd(a2.j());
                break;
            default:
                tjkVar.j = (a) obj;
                break;
        }
    }
}
