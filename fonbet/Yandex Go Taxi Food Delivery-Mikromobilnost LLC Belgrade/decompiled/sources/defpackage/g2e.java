package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class g2e implements b70 {
    public static final g2e a = new g2e();
    public static final List b = Collections.singletonList("__typename");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        x1e x1eVar = (x1e) obj;
        bfxVar.A1("__typename");
        foe foeVar = l80.a;
        bfxVar.r0(x1eVar.a);
        List list = m2e.a;
        c2e c2eVar = x1eVar.b;
        bfxVar.A1("backgroundColors");
        i2e i2eVar = i2e.a;
        foe foeVar2 = l80.a;
        ep60 ep60Var = new ep60(i2eVar, true);
        z1e z1eVar = c2eVar.a;
        if (z1eVar == null) {
            bfxVar.k2();
        } else {
            ep60Var.a(bfxVar, cVar, z1eVar);
        }
        bfxVar.A1("silent");
        l80.f.a(bfxVar, cVar, Boolean.valueOf(c2eVar.b));
        bfxVar.A1("subscriptionButtonType");
        g97 g97Var = g97.s;
        SubscriptionButtonType subscriptionButtonType = c2eVar.c;
        if (subscriptionButtonType == null) {
            bfxVar.k2();
        } else {
            g97Var.a(bfxVar, cVar, subscriptionButtonType);
        }
        bfxVar.A1("subscriptionProductFeatures");
        foe foeVar3 = l80.a;
        ArrayList arrayList = c2eVar.d;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            foeVar3.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        bfxVar.A1("subscriptionProductTarget");
        l80.i.a(bfxVar, cVar, c2eVar.e);
        bfxVar.A1("subscriptionPaymentMethod");
        g97 g97Var2 = g97.t;
        SubscriptionPaymentMethod subscriptionPaymentMethod = c2eVar.f;
        if (subscriptionPaymentMethod == null) {
            bfxVar.k2();
        } else {
            g97Var2.a(bfxVar, cVar, subscriptionPaymentMethod);
        }
        bfxVar.A1("subscriptionWidgetType");
        g97 g97Var3 = g97.u;
        SubscriptionWidgetType subscriptionWidgetType = c2eVar.g;
        if (subscriptionWidgetType == null) {
            bfxVar.k2();
        } else {
            g97Var3.a(bfxVar, cVar, subscriptionWidgetType);
        }
        bfxVar.A1("acquisitionPlatformSubscriptionProperties");
        ep60 a2 = l80.a(f2e.a);
        w1e w1eVar = c2eVar.h;
        if (w1eVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, w1eVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        while (xdxVar.h2(b) == 0) {
            foe foeVar = l80.a;
            str = xdxVar.nextString();
        }
        xdxVar.rewind();
        return new x1e(str, m2e.c(xdxVar, cVar));
    }
}
