package defpackage;

import com.yandex.plus.home.feature.webviews.internal.purchase.subscription.composite.CompositeSubscriptionInfo;
import com.yandex.plus.home.repository.api.model.webconfig.SubscriptionConfiguration;

/* loaded from: classes2.dex */
public final class f27 implements g27 {
    public final CompositeSubscriptionInfo a;
    public final SubscriptionConfiguration b;
    public final y250 c;

    public f27(CompositeSubscriptionInfo compositeSubscriptionInfo, SubscriptionConfiguration subscriptionConfiguration, y250 y250Var) {
        this.a = compositeSubscriptionInfo;
        this.b = subscriptionConfiguration;
        this.c = y250Var;
    }

    @Override // defpackage.g27
    public final SubscriptionConfiguration a() {
        return this.b;
    }

    @Override // defpackage.h27
    public final CompositeSubscriptionInfo b() {
        return this.a;
    }

    @Override // defpackage.g27
    public final y250 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f27)) {
            return false;
        }
        f27 f27Var = (f27) obj;
        return jl40.l(this.a, f27Var.a) && this.b.equals(f27Var.b) && jl40.l(this.c, f27Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        y250 y250Var = this.c;
        return hashCode + (y250Var == null ? 0 : y250Var.hashCode());
    }

    public final String toString() {
        return "Sdk(subscriptionInfo=" + this.a + ", subscriptionConfig=" + this.b + ", nativeButtonOffer=" + this.c + ')';
    }
}
