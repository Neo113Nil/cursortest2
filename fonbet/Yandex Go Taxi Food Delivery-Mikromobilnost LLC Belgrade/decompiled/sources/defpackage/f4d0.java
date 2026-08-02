package defpackage;

import com.yandex.plus.home.api.lifecycle.ActivityLifecycle;

/* loaded from: classes13.dex */
public final class f4d0 {
    public final ActivityLifecycle a;
    public final kaa0 b;

    public f4d0(ActivityLifecycle activityLifecycle, kaa0 kaa0Var) {
        this.a = activityLifecycle;
        this.b = kaa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4d0)) {
            return false;
        }
        f4d0 f4d0Var = (f4d0) obj;
        return jl40.l(this.a, f4d0Var.a) && jl40.l(this.b, f4d0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RequiredDependencies(activityLifecycle=" + this.a + ", paymentMethodsFacade=" + this.b + ')';
    }
}
