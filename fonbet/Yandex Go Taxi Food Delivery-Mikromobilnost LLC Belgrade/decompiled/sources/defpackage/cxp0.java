package defpackage;

import com.yandex.go.taxi.order.models.api.response.SearchInfoResponse$TaxiSearch;
import com.yandex.go.taxi.order.state.search.ui.e;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class cxp0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ e b;

    public /* synthetic */ cxp0(e eVar, int i) {
        this.a = i;
        this.b = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        e eVar = this.b;
        switch (i) {
            case 0:
                ((axp0) eVar.Dg()).setOrderInstructionModels((List) obj);
                break;
            case 1:
                SearchInfoResponse$TaxiSearch.CandidateSearchState candidateSearchState = (SearchInfoResponse$TaxiSearch.CandidateSearchState) obj;
                eVar.getClass();
                if (candidateSearchState == SearchInfoResponse$TaxiSearch.CandidateSearchState.REJECTED) {
                    ((axp0) eVar.Dg()).animateDriverCancellation();
                    break;
                }
                break;
            default:
                ((axp0) eVar.Dg()).render((aup0) obj);
                break;
        }
        return zy11Var;
    }
}
