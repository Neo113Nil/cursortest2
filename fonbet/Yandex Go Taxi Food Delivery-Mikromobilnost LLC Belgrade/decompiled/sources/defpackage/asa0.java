package defpackage;

import com.ybsdk.screens.initial.deeplink.PendingDeeplinkListConfig$DefaultScreenBehavior;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class asa0 {
    public final List a;
    public final PendingDeeplinkListConfig$DefaultScreenBehavior b;

    public asa0(List list, PendingDeeplinkListConfig$DefaultScreenBehavior pendingDeeplinkListConfig$DefaultScreenBehavior) {
        this.a = list;
        this.b = pendingDeeplinkListConfig$DefaultScreenBehavior;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asa0)) {
            return false;
        }
        asa0 asa0Var = (asa0) obj;
        return jl40.l(this.a, asa0Var.a) && this.b == asa0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingDeeplinkListConfig(deeplinks=" + this.a + ", defaultScreenBehavior=" + this.b + Extension.C_BRAKE;
    }
}
