package defpackage;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import com.yandex.mob.reporting.MobTrigger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ha4 {
    public final MobAvailabilityCheckStrategyName a;
    public final MobTrigger b;
    public final boolean c;
    public final boolean d;
    public final List e;
    public final Map f;
    public final ArrayList g;
    public final boolean h;

    public ha4(MobAvailabilityCheckStrategyName mobAvailabilityCheckStrategyName, MobTrigger mobTrigger, boolean z, boolean z2, List list, Map map, ArrayList arrayList, boolean z3) {
        this.a = mobAvailabilityCheckStrategyName;
        this.b = mobTrigger;
        this.c = z;
        this.d = z2;
        this.e = list;
        this.f = map;
        this.g = arrayList;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha4)) {
            return false;
        }
        ha4 ha4Var = (ha4) obj;
        return this.a == ha4Var.a && this.b == ha4Var.b && this.c == ha4Var.c && this.d == ha4Var.d && jl40.l(this.e, ha4Var.e) && this.f.equals(ha4Var.f) && this.g.equals(ha4Var.g) && this.h == ha4Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ly3.b(unr0.d(unr0.c(unr0.e(unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailabilityCheckPlan(strategy=");
        sb.append(this.a);
        sb.append(", trigger=");
        sb.append(this.b);
        sb.append(", selectProxies=");
        nnm.v(", optimizePings=", ", currentSelectedProxies=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", proxiesToForceSelect=");
        sb.append(this.f);
        sb.append(", proxiesToCheck=");
        sb.append(this.g);
        sb.append(", isRecovery=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
