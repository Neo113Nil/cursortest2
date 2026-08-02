package defpackage;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import java.util.Map;

/* loaded from: classes2.dex */
public final class d27 implements h27 {
    public final CompositeSubscriptionInfo a;
    public final String b;
    public final String c;
    public final Map d;
    public final boolean e;

    public d27(CompositeSubscriptionInfo compositeSubscriptionInfo, String str, String str2, Map map, boolean z) {
        this.a = compositeSubscriptionInfo;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = z;
    }

    @Override // defpackage.h27
    public final CompositeSubscriptionInfo b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d27)) {
            return false;
        }
        d27 d27Var = (d27) obj;
        return jl40.l(this.a, d27Var.a) && jl40.l(this.b, d27Var.b) && this.c.equals(d27Var.c) && jl40.l(this.d, d27Var.d) && this.e == d27Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + unr0.d(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlusAcquisitionSdk(subscriptionInfo=");
        sb.append(this.a);
        sb.append(", page=");
        sb.append(this.b);
        sb.append(", place=");
        sb.append(this.c);
        sb.append(", restrictions=");
        sb.append(this.d);
        sb.append(", isOneClickSupported=");
        return unr0.u(sb, this.e, ')');
    }
}
