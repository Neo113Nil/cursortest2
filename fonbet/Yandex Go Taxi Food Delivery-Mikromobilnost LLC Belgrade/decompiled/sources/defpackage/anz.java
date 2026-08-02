package defpackage;

import com.yandex.go.taxi.order.search.overlay.long_search_v2.domain.LongSearchV2Facade$PollingTerminationEvent;
import com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.c;
import com.yandex.go.taxi.order.search.polling.model.ETA;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.n0;
import ru.yandex.taxi.order.map.controller.a;

/* loaded from: classes14.dex */
public final class anz implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ anz(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.getClass();
                int a = ((ETA) obj).a();
                cVar.C.a(String.valueOf(a >= 1 ? a : 1));
                cVar.E.getClass();
                a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                hst hstVar = jst.e;
                ((nnz) cVar.Dg()).Of();
                break;
            case 1:
                tmz tmzVar = cVar.A;
                cVar.E.getClass();
                a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                hst hstVar2 = jst.e;
                break;
            case 2:
                mmz mmzVar = (mmz) obj;
                wrr wrrVar = cVar.z;
                ((a3y0) wrrVar.w).getClass();
                a3y0.h(new String[]{"handleLongSearchInfo"});
                hst hstVar3 = jst.e;
                Integer num = mmzVar.a;
                if (num != null) {
                    ((n0) wrrVar.x).g(num);
                }
                ETA eta = mmzVar.b;
                if (eta != null) {
                    ((n0) wrrVar.z).g(eta);
                }
                ((gpc) wrrVar.c).g(mmzVar.c, null);
                break;
            case 3:
                a aVar = cVar.D;
                int i2 = ymz.a[((LongSearchV2Facade$PollingTerminationEvent) obj).ordinal()];
                if (i2 == 1) {
                    com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.a aVar2 = (com.yandex.go.taxi.order.search.overlay.long_search_v2.mvp.a) cVar.Dg();
                    aVar2.Ig();
                    aVar2.F.getClass();
                    aVar2.Jg();
                } else if (i2 != 2) {
                    w511.b();
                    break;
                } else {
                    cVar.P.clear();
                    aVar.c();
                    aVar.a();
                }
                break;
            default:
                ((Number) obj).intValue();
                cVar.getClass();
                break;
        }
        return zy11Var;
    }
}
