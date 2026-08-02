package defpackage;

import com.yandex.go.taxi.order.models.api.objects.ReorderInfo;
import java.util.Collection;
import java.util.List;

/* loaded from: classes14.dex */
public final class pzi0 implements uej {
    public final ReorderInfo a;
    public final ief b;

    public pzi0(ReorderInfo reorderInfo, ief iefVar) {
        this.a = reorderInfo;
        this.b = iefVar;
    }

    @Override // java.util.function.Predicate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean test(pzi0 pzi0Var) {
        ief iefVar = pzi0Var.b;
        ief iefVar2 = this.b;
        if (iefVar2 != iefVar && (iefVar2 == null || iefVar == null || !jl40.l(iefVar2.b, iefVar.b) || !jl40.l(iefVar2.d, iefVar.d) || !jl40.l(iefVar2.a, iefVar.a) || !jl40.l(iefVar2.c, iefVar.c))) {
            return false;
        }
        ReorderInfo reorderInfo = pzi0Var.a;
        ReorderInfo reorderInfo2 = this.a;
        if (!jl40.l(reorderInfo2.c, reorderInfo.c) || !jl40.l(reorderInfo2.d, reorderInfo.d) || !jl40.l(reorderInfo2.a, reorderInfo.a) || !jl40.l(reorderInfo2.b, reorderInfo.b)) {
            return false;
        }
        List list = reorderInfo2.e;
        List list2 = reorderInfo.e;
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        Iterable e = scc.e(list);
        if ((e instanceof Collection) && ((Collection) e).isEmpty()) {
            return true;
        }
        c6w it = e.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            ReorderInfo.ReorderOption reorderOption = (ReorderInfo.ReorderOption) list.get(nextInt);
            ReorderInfo.ReorderOption reorderOption2 = (ReorderInfo.ReorderOption) list2.get(nextInt);
            if (!jl40.l(reorderOption.b, reorderOption2.b) || !jl40.l(reorderOption.a, reorderOption2.a)) {
                return false;
            }
        }
        return true;
    }
}
