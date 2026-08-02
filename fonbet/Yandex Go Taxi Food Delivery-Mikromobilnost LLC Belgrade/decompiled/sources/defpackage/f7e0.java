package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.plus.core.graphql.type.ActionType;
import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class f7e0 implements b70 {
    public static final f7e0 a = new f7e0();
    public static final List b = scc.g("actionType", "silent", "subscriptionButtonType", "subscriptionPaymentMethod", "subscriptionProductFeatures", "subscriptionWidgetType", "acquisitionPlatformSubscriptionProperties");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        y6e0 y6e0Var = (y6e0) obj;
        bfxVar.A1("actionType");
        bfxVar.r0(y6e0Var.a.getRawValue());
        bfxVar.A1("silent");
        l80.f.a(bfxVar, cVar, Boolean.valueOf(y6e0Var.b));
        bfxVar.A1("subscriptionButtonType");
        g97 g97Var = g97.s;
        SubscriptionButtonType subscriptionButtonType = y6e0Var.c;
        if (subscriptionButtonType == null) {
            bfxVar.k2();
        } else {
            g97Var.a(bfxVar, cVar, subscriptionButtonType);
        }
        bfxVar.A1("subscriptionPaymentMethod");
        g97 g97Var2 = g97.t;
        SubscriptionPaymentMethod subscriptionPaymentMethod = y6e0Var.d;
        if (subscriptionPaymentMethod == null) {
            bfxVar.k2();
        } else {
            g97Var2.a(bfxVar, cVar, subscriptionPaymentMethod);
        }
        bfxVar.A1("subscriptionProductFeatures");
        foe foeVar = l80.a;
        ArrayList arrayList = y6e0Var.e;
        bfxVar.l();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            foeVar.a(bfxVar, cVar, it.next());
        }
        bfxVar.j();
        bfxVar.A1("subscriptionWidgetType");
        g97 g97Var3 = g97.u;
        SubscriptionWidgetType subscriptionWidgetType = y6e0Var.f;
        if (subscriptionWidgetType == null) {
            bfxVar.k2();
        } else {
            g97Var3.a(bfxVar, cVar, subscriptionWidgetType);
        }
        bfxVar.A1("acquisitionPlatformSubscriptionProperties");
        ep60 a2 = l80.a(e7e0.a);
        x6e0 x6e0Var = y6e0Var.g;
        if (x6e0Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, x6e0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        return new defpackage.y6e0(r1, r0.booleanValue(), r3, r4, r5, r6, r7);
     */
    @Override // defpackage.b70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(xdx xdxVar, c cVar) {
        Boolean bool;
        ActionType actionType;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Boolean bool2 = null;
        ActionType actionType2 = null;
        SubscriptionButtonType subscriptionButtonType = null;
        SubscriptionPaymentMethod subscriptionPaymentMethod = null;
        ArrayList arrayList = null;
        SubscriptionWidgetType subscriptionWidgetType = null;
        x6e0 x6e0Var = null;
        while (true) {
            switch (xdxVar.h2(b)) {
                case 0:
                    bool = bool2;
                    String nextString = xdxVar.nextString();
                    ActionType.Companion.getClass();
                    ActionType[] values = ActionType.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            actionType = values[i];
                            if (!jl40.l(actionType.getRawValue(), nextString)) {
                                i++;
                            }
                        } else {
                            actionType = null;
                        }
                    }
                    if (actionType != null) {
                        actionType2 = actionType;
                        break;
                    } else {
                        actionType2 = ActionType.UNKNOWN__;
                        break;
                    }
                case 1:
                    bool2 = (Boolean) l80.f.b(xdxVar, cVar);
                    continue;
                case 2:
                    bool = bool2;
                    g97 g97Var = g97.s;
                    foe foeVar = l80.a;
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj = null;
                    } else {
                        obj = g97Var.b(xdxVar, cVar);
                    }
                    subscriptionButtonType = (SubscriptionButtonType) obj;
                    break;
                case 3:
                    bool = bool2;
                    g97 g97Var2 = g97.t;
                    foe foeVar2 = l80.a;
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj2 = null;
                    } else {
                        obj2 = g97Var2.b(xdxVar, cVar);
                    }
                    subscriptionPaymentMethod = (SubscriptionPaymentMethod) obj2;
                    break;
                case 4:
                    bool = bool2;
                    foe foeVar3 = l80.a;
                    arrayList = oyr.z(xdxVar);
                    while (xdxVar.hasNext()) {
                        arrayList.add(xdxVar.nextString());
                    }
                    xdxVar.j();
                    break;
                case 5:
                    bool = bool2;
                    g97 g97Var3 = g97.u;
                    foe foeVar4 = l80.a;
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj3 = null;
                    } else {
                        obj3 = g97Var3.b(xdxVar, cVar);
                    }
                    subscriptionWidgetType = (SubscriptionWidgetType) obj3;
                    break;
                case 6:
                    bool = bool2;
                    ep60 a2 = l80.a(e7e0.a);
                    if (xdxVar.peek() == JsonReader$Token.NULL) {
                        xdxVar.skipValue();
                        obj4 = null;
                    } else {
                        obj4 = a2.b(xdxVar, cVar);
                    }
                    x6e0Var = (x6e0) obj4;
                    break;
            }
            bool2 = bool;
        }
    }
}
