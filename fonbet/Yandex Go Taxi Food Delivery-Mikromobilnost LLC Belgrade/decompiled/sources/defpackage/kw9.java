package defpackage;

import android.content.Context;
import com.yandex.go.chargers.notification.ChargersNotification;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class kw9 implements sy60 {
    public final /* synthetic */ lw9 a;
    public final /* synthetic */ hw9 b;

    public kw9(lw9 lw9Var, hw9 hw9Var) {
        this.a = lw9Var;
        this.b = hw9Var;
    }

    @Override // defpackage.sy60
    public final void a() {
        Object value;
        lw9 lw9Var = this.a;
        if (lw9Var.G.contains(this.b.a)) {
            opa opaVar = (opa) ((xvf0) lw9Var.P().m).get();
            if (((Boolean) opaVar.a.getValue()).booleanValue()) {
                j6a j6aVar = (j6a) lw9Var.E.get();
                j6aVar.getClass();
                Context context = j6aVar.a;
                j6aVar.a(new ChargersNotification(context, "ChargersNotification", context.getString(kyh0.chargers_next_rent_with_discount), null, new d6a(n1h0.ic_notification_check_round_24), j6aVar.b, 0, 64, null), null);
                r0 r0Var = opaVar.a;
                do {
                    value = r0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!r0Var.k(value, Boolean.FALSE));
            }
        }
        lw9Var.r(new qu(9));
    }
}
