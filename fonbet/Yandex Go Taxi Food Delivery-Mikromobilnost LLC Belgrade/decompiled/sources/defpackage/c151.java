package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.shortcuts.dto.request.ProductsScreenType$Type;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.yandex.taxi.order.analytics.model.ListOpenReason;

/* loaded from: classes9.dex */
public final class c151 {
    public static final /* synthetic */ kgx[] i = {new MutablePropertyReference1Impl("currentScreenType", 0, "getCurrentScreenType()Ljava/lang/String;", c151.class)};
    public final c a;
    public final lx4 b;
    public final yxe0 c;
    public final xxe0 d;
    public final uy70 e;
    public final s351 f;
    public ew2 g;
    public final srx0 h;

    public c151(c cVar, lx4 lx4Var, yxe0 yxe0Var, xxe0 xxe0Var, uy70 uy70Var, s351 s351Var) {
        this.a = cVar;
        this.b = lx4Var;
        this.c = yxe0Var;
        this.d = xxe0Var;
        this.e = uy70Var;
        this.f = s351Var;
        EmptyList emptyList = EmptyList.a;
        this.g = new ew2(emptyList, emptyList);
        this.h = new srx0(this);
    }

    public final void a(ew2 ew2Var, yaf0 yaf0Var) {
        yaf0Var.a();
        if (jl40.l(vez0.D(yaf0Var), "superapp_main")) {
            this.g = ew2Var;
        }
        String e0 = vez0.e0(yaf0Var);
        this.h.setValue(this, i[0], e0);
        Screen b = this.a.b();
        Screen screen = Screen.BUNDLED_ORDER_LIST;
        uy70 uy70Var = this.e;
        if (b == screen || (this.g.a && yaf0Var.a() != ProductsScreenType$Type.TRACKING_LIST)) {
            uy70Var.b = b.f();
            return;
        }
        List<d380> list = (List) ew2Var.b;
        int d = gw00.d(tcc.n(list, 10));
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (d380 d380Var : list) {
            Pair pair = new Pair(d380Var.b(), d380Var.d());
            linkedHashMap.put(pair.c(), pair.f());
        }
        ListOpenReason a = uy70Var.a(linkedHashMap);
        if (a != ListOpenReason.NONE) {
            List<q351> list2 = (List) ew2Var.c;
            ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
            for (q351 q351Var : list2) {
                this.f.getClass();
                arrayList.add(s351.a(q351Var));
            }
            if (arrayList.isEmpty()) {
                return;
            }
            yxe0.a(this.c, e0, a.getAlias(), null, arrayList, 9);
        }
    }
}
