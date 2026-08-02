package xsna;

import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.LinkedHashSet;

/* compiled from: ColdStartWhitelistViolationReportingChainCall.kt */
/* loaded from: classes.dex */
public final class d0g<T> extends ara<T> {
    public final String b;
    public final v03 c;
    public final ara<T> d;

    /* JADX WARN: Multi-variable type inference failed */
    public d0g(wy2 wy2Var, String str, v03 v03Var, ara<? extends T> araVar) {
        super(wy2Var);
        this.b = str;
        this.c = v03Var;
        this.d = araVar;
    }

    @Override // xsna.ara
    public final T a(zqa zqaVar) throws Exception {
        v03 v03Var = this.c;
        if (v03Var != null) {
            v03Var.getClass();
            b0g b0gVar = b0g.a;
            if (!b0g.b()) {
                LinkedHashSet linkedHashSet = (LinkedHashSet) v03Var.a;
                if (!linkedHashSet.isEmpty()) {
                    String str = this.b;
                    if (!linkedHashSet.contains(str)) {
                        l5m l5mVar = new l5m(null, new mb3(4), 1);
                        l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.COLD_START_NETWORK_VIOLATION.h(), null, "cold_start_violation", null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -22, 3, null);
                        l5mVar.q();
                    }
                }
            }
        }
        return this.d.a(zqaVar);
    }
}
