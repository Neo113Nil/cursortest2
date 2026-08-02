package defpackage;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Triple;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.preorder.summary.altchoice.ui.selector.e;
import ru.yandex.taxi.summary.ui.SummaryStateTracker;

/* loaded from: classes6.dex */
public final class laj0 implements vpr {
    public final /* synthetic */ e a;
    public final /* synthetic */ iaj0 b;

    public laj0(e eVar, iaj0 iaj0Var) {
        this.a = eVar;
        this.b = iaj0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Triple triple = (Triple) obj;
        saj0 saj0Var = (saj0) triple.getFirst();
        List list = (List) triple.getSecond();
        if (((SummaryStateTracker.SolidSummaryState) triple.getThird()) == SummaryStateTracker.SolidSummaryState.EXPANDED) {
            e eVar = this.a;
            if (eVar.O.getAndSet(false)) {
                h4j h4jVar = eVar.C;
                String str = saj0Var.d;
                List<waj0> list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((waj0) it.next()).a);
                }
                h4jVar.getClass();
                pho phoVar = h4jVar.a;
                HashMap hashMap = new HashMap();
                hashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str);
                hashMap.put("options", arrayList);
                phoVar.a("DetailedTariffSettings.Shown", hashMap, 1, new HashMap());
                for (waj0 waj0Var : list2) {
                    String str2 = saj0Var.d;
                    String str3 = waj0Var.a;
                    String str4 = waj0Var.c;
                    String str5 = "";
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str6 = waj0Var.e;
                    if (str6 != null) {
                        str5 = str6;
                    }
                    HashMap u = g8e.u(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, str2, PlusAcquisitionSmartOffer.Texts.OPTION_PREFIX, str3);
                    phoVar.a("DetailedTariffSettings.Option.Shown", u, 1, x4e.q(u, "title", str4, "body", str5));
                }
            }
        }
        this.b.render(list);
        return zy11.a;
    }
}
