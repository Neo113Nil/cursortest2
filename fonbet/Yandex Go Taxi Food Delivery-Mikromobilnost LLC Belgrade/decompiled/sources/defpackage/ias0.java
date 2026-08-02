package defpackage;

import kotlin.Pair;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.summary.promotions.analytics.SummaryPromotionsAnalytics$SummaryState;
import ru.yandex.taxi.summary.promotions.analytics.c;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public final class ias0 implements vpr {
    public final /* synthetic */ c a;

    public ias0(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Pair pair = (Pair) obj;
        SummaryStateTracker.SolidSummaryState solidSummaryState = (SummaryStateTracker.SolidSummaryState) pair.getFirst();
        String str = (String) pair.getSecond();
        c cVar = this.a;
        j63 j63Var = cVar.h;
        j63Var.getClass();
        r53 r53Var = new r53(j63Var);
        while (r53Var.hasNext()) {
            has0 has0Var = (has0) r53Var.next();
            if (jl40.l(has0Var.a.g, str)) {
                if ((has0Var.b == SummaryPromotionsAnalytics$SummaryState.EXPANDED ? SummaryStateTracker.SolidSummaryState.EXPANDED : SummaryStateTracker.SolidSummaryState.COLLAPSED) == solidSummaryState) {
                    cVar.b(has0Var);
                    r53Var.remove();
                }
            }
        }
        return zy11.a;
    }
}
