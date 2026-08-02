package defpackage;

import android.content.Intent;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.logistics.delivery_state.DeliveryPushParams;

/* loaded from: classes.dex */
public final class dui implements x7w {
    public final yvf0 a;
    public final oep0 b;

    public dui(yvf0 yvf0Var, oep0 oep0Var) {
        this.a = yvf0Var;
        this.b = oep0Var;
    }

    @Override // defpackage.x7w
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        if (!intent.hasExtra("ru.yandex.taxi.activity.MainActivity.DELIVERY_TO_DISPLAY_EXTRA")) {
            return n5u.a;
        }
        DeliveryPushParams.Companion.getClass();
        DeliveryPushParams a = hli.a(intent, "ru.yandex.taxi.activity.MainActivity.DELIVERY_TO_DISPLAY_EXTRA");
        if (a == null) {
            return new m5u(false, false);
        }
        ((pep0) this.b).f((m950) this.a.get(), new rui(a.getDeliveryId(), a.getMeta(), a.getExpansion(), (UUID) null, 24), hxx.a);
        return new m5u(true, false);
    }
}
