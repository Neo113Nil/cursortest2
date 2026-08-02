package defpackage;

import com.ybsdk.feature.pfm.internal.ui.PfmTransactionsDataSkeletonType;
import com.ybsdk.feature.pfm.internal.ui.b;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;

/* loaded from: classes3.dex */
public final /* synthetic */ class pdb0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ pdb0(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.Set] */
    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        EmptySet emptySet = EmptySet.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                xv10 xv10Var = bVar.K;
                ?? e = ((wcb0) bVar.X()).e();
                xv10Var.l(e == 0 ? emptySet : e, ((wcb0) bVar.X()).g, ((wcb0) bVar.X()).c(), ((wcb0) bVar.X()).i.a(), ((wcb0) bVar.X()).e);
                break;
            case 1:
                xv10 xv10Var2 = bVar.K;
                ?? e2 = ((wcb0) bVar.X()).e();
                xv10Var2.l(e2 == 0 ? emptySet : e2, ((wcb0) bVar.X()).g, ((wcb0) bVar.X()).c(), ((wcb0) bVar.X()).i.a(), ((wcb0) bVar.X()).e);
                break;
            case 2:
                Iterator it = ((wcb0) bVar.X()).g.iterator();
                while (it.hasNext()) {
                    bVar.j0(((vcb0) it.next()).a());
                }
                bVar.g0(PfmTransactionsDataSkeletonType.CUSTOM_FILTERS, EmptyList.a, new pdb0(bVar, 1));
                break;
            default:
                xv10 xv10Var3 = bVar.K;
                ?? e3 = ((wcb0) bVar.X()).e();
                xv10Var3.l(e3 == 0 ? emptySet : e3, ((wcb0) bVar.X()).g, ((wcb0) bVar.X()).c(), ((wcb0) bVar.X()).i.a(), ((wcb0) bVar.X()).e);
                break;
        }
        return zy11Var;
    }
}
