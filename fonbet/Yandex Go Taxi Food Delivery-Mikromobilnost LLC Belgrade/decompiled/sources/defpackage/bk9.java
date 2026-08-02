package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto$Deeplink;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto$PlusHome;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto$Promotion;
import com.yandex.go.chargers.order.data.model.b;
import com.yandex.go.chargers.order.data.model.c;
import com.yandex.go.chargers.order.data.model.e;
import com.yandex.go.chargers.order.data.model.f;
import com.yandex.go.chargers.order.data.model.g;
import com.yandex.go.chargers.order.data.model.h;
import com.yandex.go.chargers.order.data.model.k;
import com.yandex.go.chargers.order.data.model.l;
import com.yandex.go.chargers.order.data.model.m;
import com.yandex.go.chargers.order.data.model.n;
import com.yandex.messaging.core.net.entities.FoldersConfig;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public final class bk9 extends xqt {
    public static final bk9 e = new bk9();

    @Override // defpackage.h9
    public final lb7 c() {
        return new lb7(2, n.INSTANCE.serializer(), qoi0.a(n.class));
    }

    @Override // defpackage.h9
    public final List f() {
        return Arrays.asList(new f9("details", e.INSTANCE.serializer(), qoi0.a(e.class)), new f9("take_charger", m.INSTANCE.serializer(), qoi0.a(m.class)), new f9(FoldersConfig.SUPPORT_FILTER_ID, l.INSTANCE.serializer(), qoi0.a(l.class)), new f9("finish_order", g.INSTANCE.serializer(), qoi0.a(g.class)), new f9(Constants.DEEPLINK, ChargersActiveOrderActionDto$Deeplink.Companion.serializer(), qoi0.a(ChargersActiveOrderActionDto$Deeplink.class)), new f9("promotion", ChargersActiveOrderActionDto$Promotion.Companion.serializer(), qoi0.a(ChargersActiveOrderActionDto$Promotion.class)), new f9("chargers_subscription", c.INSTANCE.serializer(), qoi0.a(c.class)), new f9("plus_home", ChargersActiveOrderActionDto$PlusHome.Companion.serializer(), qoi0.a(ChargersActiveOrderActionDto$PlusHome.class)), new f9("chargers_partner_subscription", h.INSTANCE.serializer(), qoi0.a(h.class)), new f9("super_pass", k.INSTANCE.serializer(), qoi0.a(k.class)), new f9("active_super_pass", b.INSTANCE.serializer(), qoi0.a(b.class)), new f9("chargers_dvizh_subscription", f.INSTANCE.serializer(), qoi0.a(f.class)));
    }
}
