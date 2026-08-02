package defpackage;

import com.yandex.go.superapp.order.multi.old.router.a;
import com.yandex.go.taxi.order.ActionButtonsClickListener$SourceScreen;
import java.util.function.BiConsumer;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes14.dex */
public final /* synthetic */ class iy70 implements BiConsumer {
    public final /* synthetic */ ky70 a;
    public final /* synthetic */ m601 b;
    public final /* synthetic */ String c;

    public /* synthetic */ iy70(ky70 ky70Var, m601 m601Var, String str) {
        this.a = ky70Var;
        this.b = m601Var;
        this.c = str;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ActionType actionType = (ActionType) obj;
        q6y0 q6y0Var = (q6y0) obj2;
        a aVar = this.a.l;
        aVar.h.a(q6y0Var, actionType.getAnalyticAlias(), this.b, this.c);
        if (q6y0Var != null) {
            aVar.f.a(q6y0Var.a(), actionType, ActionButtonsClickListener$SourceScreen.ORDER_LIST);
        }
    }
}
