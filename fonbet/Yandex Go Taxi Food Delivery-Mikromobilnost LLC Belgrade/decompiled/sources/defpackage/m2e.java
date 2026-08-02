package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class m2e implements b70 {
    public static final List a = scc.g("backgroundColors", "silent", "subscriptionButtonType", "subscriptionProductFeatures", "subscriptionProductTarget", "subscriptionPaymentMethod", "subscriptionWidgetType", "acquisitionPlatformSubscriptionProperties");

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        return new defpackage.c2e(r2, r1.booleanValue(), r4, r5, r6, r7, r8, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static c2e c(xdx xdxVar, c cVar) {
        Boolean bool;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Boolean bool2 = null;
        z1e z1eVar = null;
        SubscriptionButtonType subscriptionButtonType = null;
        ArrayList arrayList = null;
        String str = null;
        SubscriptionPaymentMethod subscriptionPaymentMethod = null;
        SubscriptionWidgetType subscriptionWidgetType = null;
        w1e w1eVar = null;
        while (true) {
            switch (xdxVar.h2(a)) {
                case 0:
                    bool = bool2;
                    i2e i2eVar = i2e.a;
                    foe foeVar = l80.a;
                    ep60 ep60Var = new ep60(i2eVar, true);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = ep60Var.b(xdxVar, cVar);
                    }
                    z1eVar = (z1e) obj;
                    break;
                case 1:
                    bool2 = (Boolean) l80.f.b(xdxVar, cVar);
                    continue;
                case 2:
                    bool = bool2;
                    g97 g97Var = g97.s;
                    foe foeVar2 = l80.a;
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = g97Var.b(xdxVar, cVar);
                    }
                    subscriptionButtonType = (SubscriptionButtonType) obj2;
                    break;
                case 3:
                    bool = bool2;
                    foe foeVar3 = l80.a;
                    arrayList = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        arrayList.add(xdxVar.nextString());
                    }
                    xdxVar.j();
                    break;
                case 4:
                    bool = bool2;
                    str = (String) l80.i.b(xdxVar, cVar);
                    break;
                case 5:
                    bool = bool2;
                    g97 g97Var2 = g97.t;
                    foe foeVar4 = l80.a;
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj3 = null;
                    } else {
                        obj3 = g97Var2.b(xdxVar, cVar);
                    }
                    subscriptionPaymentMethod = (SubscriptionPaymentMethod) obj3;
                    break;
                case 6:
                    bool = bool2;
                    g97 g97Var3 = g97.u;
                    foe foeVar5 = l80.a;
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj4 = null;
                    } else {
                        obj4 = g97Var3.b(xdxVar, cVar);
                    }
                    subscriptionWidgetType = (SubscriptionWidgetType) obj4;
                    break;
                case 7:
                    bool = bool2;
                    ep60 a2 = l80.a(f2e.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj5 = null;
                    } else {
                        obj5 = a2.b(xdxVar, cVar);
                    }
                    w1eVar = (w1e) obj5;
                    break;
            }
            bool2 = bool;
        }
    }
}
