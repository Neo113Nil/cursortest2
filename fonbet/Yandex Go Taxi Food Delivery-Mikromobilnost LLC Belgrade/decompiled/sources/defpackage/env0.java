package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes10.dex */
public final class env0 {
    public static final /* synthetic */ kgx[] c = {new MutablePropertyReference1Impl("shownPromotionsJson", 0, "getShownPromotionsJson()Ljava/lang/String;", env0.class)};
    public static final k8u d = new k8u(auu0.a, fas0.Companion.serializer(), 1);
    public final wnt a;
    public final iid0 b;

    public env0(wnt wntVar, dne0 dne0Var) {
        this.a = wntVar;
        this.b = new iid0(dne0Var.a("summarypromo"), "ru.yandex.taxi.summarypromo.preferences.SummaryPromotionsPreferences.shownPromotionsJson");
    }

    public final Map a() {
        String str = (String) this.b.getValue(this, c[0]);
        Map map = str != null ? (Map) ((xnt) this.a).c(str, d) : null;
        return map == null ? b.f() : map;
    }
}
