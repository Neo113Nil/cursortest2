package xsna;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.lq1;
import xsna.rq1;

/* compiled from: AlbumsSettingsReducer.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class iq1 extends FunctionReferenceImpl implements izs<lq1, rq1.b> {
    @Override // xsna.izs
    public final rq1.b invoke(lq1 lq1Var) {
        lq1 lq1Var2 = lq1Var;
        ((jq1) this.receiver).getClass();
        List list = lq1Var2.b;
        lq1.a aVar = lq1Var2.c;
        boolean z = list != null && epx.f(aVar, lq1.a.b.a);
        rq1.b.a aVar2 = null;
        Throwable th = aVar instanceof lq1.a.C3283a ? ((lq1.a.C3283a) aVar).a : null;
        if (list == null) {
            list = EmptyList.b;
        }
        lq1.a aVar3 = lq1Var2.d;
        if (aVar3 != null) {
            if (aVar3.equals(lq1.a.b.a)) {
                aVar2 = rq1.b.a.C3625b.a;
            } else {
                if (!(aVar3 instanceof lq1.a.C3283a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar2 = new rq1.b.a.C3624a();
            }
        }
        return new rq1.b(z, list, aVar2, th);
    }
}
