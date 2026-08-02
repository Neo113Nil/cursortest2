package defpackage;

import android.view.View;
import com.yandex.go.superapp.order.multi.old.router.a;
import com.yandex.go.taxi.order.ActionButtonsClickListener$SourceScreen;
import com.yandex.go.taxi.order.superapp.orders.ui.b;
import java.util.WeakHashMap;
import ru.yandex.taxi.carplates.ui.CarIndexContainerView;
import ru.yandex.taxi.checkin.CheckInStateActionType;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.models.CopySource;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes14.dex */
public final /* synthetic */ class p7y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q6y0 b;
    public final /* synthetic */ b c;

    public /* synthetic */ p7y0(q6y0 q6y0Var, b bVar) {
        this.a = 1;
        this.b = q6y0Var;
        this.c = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        q6y0 q6y0Var = this.b;
        b bVar = this.c;
        switch (i) {
            case 0:
                bVar.Z.a(q6y0Var, CheckInStateActionType.BUTTON);
                break;
            case 1:
                q48 q48Var = q6y0Var.k;
                if (q48Var != null && web1.i(q48Var)) {
                    k48 k48Var = bVar.b0;
                    View view = bVar.a;
                    CarIndexContainerView carIndexContainerView = (CarIndexContainerView) bVar.C0.b;
                    int i2 = fdh0.car_index;
                    WeakHashMap weakHashMap = androidx.core.view.b.a;
                    ((m48) k48Var).b(q48Var, (View) rp31.d(carIndexContainerView, i2), -c.h(24, view), tje.u(20, view.getContext()), CopySource.LIST_ITEM, 0);
                    break;
                }
                break;
            case 2:
                jy70 jy70Var = bVar.Z;
                a aVar = jy70Var.a.l;
                aVar.h.a(q6y0Var, ActionType.CHECK_IN_INFO.getAnalyticAlias(), jy70Var.b, jy70Var.c);
                aVar.f.a(q6y0Var.a(), ActionType.ORDER_DETAILS, ActionButtonsClickListener$SourceScreen.ORDER_LIST);
                break;
            default:
                jy70 jy70Var2 = bVar.Z;
                a aVar2 = jy70Var2.a.l;
                m601 m601Var = jy70Var2.b;
                String str = jy70Var2.c;
                aVar2.getClass();
                String a = q6y0Var.a();
                ActionType actionType = ActionType.CHECK_IN_INFO;
                aVar2.h.a(q6y0Var, actionType.getAnalyticAlias(), m601Var, str);
                aVar2.f.a(a, actionType, ActionButtonsClickListener$SourceScreen.ORDER_LIST);
                break;
        }
    }

    public /* synthetic */ p7y0(b bVar, q6y0 q6y0Var, int i) {
        this.a = i;
        this.c = bVar;
        this.b = q6y0Var;
    }
}
