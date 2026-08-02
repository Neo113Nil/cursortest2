package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes6.dex */
public final class j540 {
    public static final /* synthetic */ kgx[] c = {new MutablePropertyReference1Impl("shownPromotionsJson", 0, "getShownPromotionsJson()Ljava/lang/String;", j540.class)};
    public static final k8u d = new k8u(auu0.a, a040.Companion.serializer(), 1);
    public final wnt a;
    public final iid0 b;

    public j540(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = new iid0(dne0Var.a("transportsummarypromo"), "ru.yandex.taxi.masstransit.promo.MtSummaryPromotionsPreferences.shownPromotionsJson");
    }

    public final Map a() {
        String str = (String) this.b.getValue(this, c[0]);
        Map map = str != null ? (Map) ((xnt) this.a).c(str, d) : null;
        return map == null ? b.f() : map;
    }
}
