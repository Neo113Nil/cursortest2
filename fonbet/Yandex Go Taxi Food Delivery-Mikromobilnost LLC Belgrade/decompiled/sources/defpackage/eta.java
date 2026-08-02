package defpackage;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionActionDto$OpenPlusPay;
import com.yandex.go.chargers.subscription.data.model.g;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class eta extends xqt {
    public static final eta e = new eta();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, g.INSTANCE.serializer(), qoi0.a(g.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("open_plus_pay", ChargersSubscriptionActionDto$OpenPlusPay.Companion.serializer(), qoi0.a(ChargersSubscriptionActionDto$OpenPlusPay.class)));
    }
}
