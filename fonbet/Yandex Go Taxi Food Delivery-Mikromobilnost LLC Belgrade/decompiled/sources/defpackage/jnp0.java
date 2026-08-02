package defpackage;

import com.yandex.plus.home.api.lifecycle.ActivityLifecycle;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.a;

/* loaded from: classes2.dex */
public final class jnp0 {
    public final kaa0 a;
    public final ActivityLifecycle b;
    public final sls c;
    public final a d;

    public jnp0(kaa0 kaa0Var, ActivityLifecycle activityLifecycle, sls slsVar, a aVar) {
        this.a = kaa0Var;
        this.b = activityLifecycle;
        this.c = slsVar;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jnp0) {
            jnp0 jnp0Var = (jnp0) obj;
            return jl40.l(this.a, jnp0Var.a) && jl40.l(this.b, jnp0Var.b) && this.c.equals(jnp0Var.c) && this.d == jnp0Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + nnm.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 29791, 31, this.c);
    }

    public final String toString() {
        return "SdkComponentDependenciesModule(paymentMethodsFacade=" + this.a + ", activityLifecycle=" + this.b + ", homeLoadingAnimationController=null, panelLoadingAnimationController=null, selectedCardIdProvider=" + this.c + ", messagesAdapter=" + this.d + ')';
    }
}
