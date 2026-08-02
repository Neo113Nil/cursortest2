package defpackage;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusActionDto$PlusHome;
import com.yandex.go.chargers.subscription.data.model.p;
import com.yandex.go.chargers.subscription.data.model.q;
import com.yandex.go.chargers.subscription.data.model.s;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class iva extends xqt {
    public static final iva e = new iva();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, s.INSTANCE.serializer(), qoi0.a(s.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("chargers_subscription", q.INSTANCE.serializer(), qoi0.a(q.class)), new f9("plus_home", ChargersSubscriptionStatusActionDto$PlusHome.Companion.serializer(), qoi0.a(ChargersSubscriptionStatusActionDto$PlusHome.class)), new f9("chargers_discovery", p.INSTANCE.serializer(), qoi0.a(p.class)));
    }
}
