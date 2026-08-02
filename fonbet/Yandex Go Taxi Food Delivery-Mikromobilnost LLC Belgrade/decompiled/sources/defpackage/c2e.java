package defpackage;

import com.yandex.plus.core.graphql.type.SubscriptionButtonType;
import com.yandex.plus.core.graphql.type.SubscriptionPaymentMethod;
import com.yandex.plus.core.graphql.type.SubscriptionWidgetType;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c2e {
    public final z1e a;
    public final boolean b;
    public final SubscriptionButtonType c;
    public final ArrayList d;
    public final String e;
    public final SubscriptionPaymentMethod f;
    public final SubscriptionWidgetType g;
    public final w1e h;

    public c2e(z1e z1eVar, boolean z, SubscriptionButtonType subscriptionButtonType, ArrayList arrayList, String str, SubscriptionPaymentMethod subscriptionPaymentMethod, SubscriptionWidgetType subscriptionWidgetType, w1e w1eVar) {
        this.a = z1eVar;
        this.b = z;
        this.c = subscriptionButtonType;
        this.d = arrayList;
        this.e = str;
        this.f = subscriptionPaymentMethod;
        this.g = subscriptionWidgetType;
        this.h = w1eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2e)) {
            return false;
        }
        c2e c2eVar = (c2e) obj;
        return jl40.l(this.a, c2eVar.a) && this.b == c2eVar.b && this.c == c2eVar.c && this.d.equals(c2eVar.d) && jl40.l(this.e, c2eVar.e) && this.f == c2eVar.f && this.g == c2eVar.g && jl40.l(this.h, c2eVar.h);
    }

    public final int hashCode() {
        z1e z1eVar = this.a;
        int e = unr0.e((z1eVar == null ? 0 : z1eVar.hashCode()) * 31, 31, this.b);
        SubscriptionButtonType subscriptionButtonType = this.c;
        int b = ly3.b((e + (subscriptionButtonType == null ? 0 : subscriptionButtonType.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        SubscriptionPaymentMethod subscriptionPaymentMethod = this.f;
        int hashCode2 = (hashCode + (subscriptionPaymentMethod == null ? 0 : subscriptionPaymentMethod.hashCode())) * 31;
        SubscriptionWidgetType subscriptionWidgetType = this.g;
        int hashCode3 = (hashCode2 + (subscriptionWidgetType == null ? 0 : subscriptionWidgetType.hashCode())) * 31;
        w1e w1eVar = this.h;
        return hashCode3 + (w1eVar != null ? w1eVar.hashCode() : 0);
    }

    public final String toString() {
        return "OnAction(backgroundColors=" + this.a + ", silent=" + this.b + ", subscriptionButtonType=" + this.c + ", subscriptionProductFeatures=" + this.d + ", subscriptionProductTarget=" + this.e + ", subscriptionPaymentMethod=" + this.f + ", subscriptionWidgetType=" + this.g + ", acquisitionPlatformSubscriptionProperties=" + this.h + ')';
    }
}
