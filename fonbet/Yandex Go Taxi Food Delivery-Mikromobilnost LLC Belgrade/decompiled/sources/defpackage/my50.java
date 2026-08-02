package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkPlusStateModel$PlusSubscriptionStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class my50 {
    public static final ly50 Companion = new ly50();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(9))};
    public final to50 a;
    public final NetworkPlusStateModel$PlusSubscriptionStatus b;

    public /* synthetic */ my50(int i, to50 to50Var, NetworkPlusStateModel$PlusSubscriptionStatus networkPlusStateModel$PlusSubscriptionStatus) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ky50.a.getDescriptor());
            throw null;
        }
        this.a = to50Var;
        this.b = networkPlusStateModel$PlusSubscriptionStatus;
    }

    public final to50 a() {
        return this.a;
    }

    public final NetworkPlusStateModel$PlusSubscriptionStatus b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my50)) {
            return false;
        }
        my50 my50Var = (my50) obj;
        return jl40.l(this.a, my50Var.a) && this.b == my50Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkPlusStateModel(balance=" + this.a + ", plusSubscriptionStatus=" + this.b + ')';
    }
}
