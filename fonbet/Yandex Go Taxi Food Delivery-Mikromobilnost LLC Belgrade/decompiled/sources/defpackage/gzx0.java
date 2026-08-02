package defpackage;

import com.yandex.go.taxi.order.chat.ui.chat.a;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import java.util.Arrays;
import kotlin.coroutines.Continuation;

/* loaded from: classes14.dex */
public final class gzx0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ gzx0(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                com.yandex.go.taxi.order.chat.call_feedback.navigation.a aVar2 = (com.yandex.go.taxi.order.chat.call_feedback.navigation.a) aVar.I.get();
                aVar.M = aVar2;
                oep0.b(aVar.J, aVar2);
                break;
            case 1:
                wy10 wy10Var = (wy10) obj;
                TaxiOrder taxiOrder = aVar.x;
                if (aVar.Eg()) {
                    ezx0 ezx0Var = (ezx0) aVar.Dg();
                    aVar.N.getClass();
                    a3y0.h((String[]) Arrays.copyOf(new String[0], 0));
                    hst hstVar = jst.e;
                    wy10Var.getClass();
                    if (!(wy10Var instanceof vy10)) {
                        ezx0Var.hidePlaceholder();
                        ezx0Var.invalidateMessages(wy10Var);
                        ezx0Var.setTranslationInfoVisibility(wy10Var.d);
                        com.yandex.go.taxi.order.chat.domain.a aVar3 = aVar.y;
                        String str = taxiOrder.a;
                        aVar3.getClass();
                        aVar3.b(new hpo0(12, aVar3, str, wy10Var));
                        fzx0 fzx0Var = aVar.A;
                        String str2 = taxiOrder.a;
                        com.yandex.go.taxi.order.chat.domain.a aVar4 = fzx0Var.b;
                        aVar4.getClass();
                        aVar4.b(new y7x0(11, aVar4, str2));
                        fzx0Var.a.c.i.a(17532, str2);
                        break;
                    } else {
                        ezx0Var.showPlaceholder();
                        break;
                    }
                }
                break;
            default:
                aVar.Kg((TaxiOrder) obj);
                break;
        }
        return zy11Var;
    }
}
