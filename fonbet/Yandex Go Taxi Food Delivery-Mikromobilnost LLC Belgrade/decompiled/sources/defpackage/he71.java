package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import kotlin.collections.b;
import yads.d4;
import yads.dv;
import yads.jk3;
import yads.kk;
import yads.n72;
import yads.x3;
import yads.y43;
import yads.y92;

/* loaded from: classes7.dex */
public final class he71 extends aj61 {
    public final /* synthetic */ int w = 1;
    public final Context x;
    public final pv81 y;
    public final Map z;

    public he71(Context context, String str, pv81 pv81Var, Map map, hlx0 hlx0Var, hlx0 hlx0Var2) {
        super(context, 0, str, hlx0Var2, hlx0Var);
        this.x = context;
        this.y = pv81Var;
        this.z = map;
        setShouldRetryConnectionErrors(true);
        setShouldRetryServerErrors(true);
    }

    @Override // com.monetization.ads.network.core.Request
    public final Map getHeaders() {
        switch (this.w) {
            case 0:
                HashMap hashMap = new HashMap();
                kca1.c(this.x, hashMap);
                hashMap.putAll(this.z);
                return hashMap;
            default:
                HashMap hashMap2 = new HashMap();
                kca1.c(this.x, hashMap2);
                hashMap2.putAll(this.z);
                return hashMap2;
        }
    }

    @Override // com.monetization.ads.network.core.Request
    public final jk3 parseNetworkError(jk3 jk3Var) {
        d4 d4Var;
        switch (this.w) {
            case 0:
                jk3Var.getClass();
                int i = x3.a;
                gb81 gb81Var = jk3Var.b;
                Integer valueOf = gb81Var != null ? Integer.valueOf(gb81Var.a) : null;
                if (valueOf == null) {
                    d4Var = jk3Var instanceof n72 ? d4.l : jk3Var instanceof y43 ? d4.m : jk3Var instanceof kk ? d4.n : jk3Var instanceof dv ? d4.o : jk3Var instanceof y92 ? d4.p : d4.q;
                } else {
                    int intValue = valueOf.intValue();
                    d4Var = (500 > intValue || intValue > 599) ? d4.e : d4.f;
                }
                return super.parseNetworkError(new x3(d4Var, gb81Var));
            default:
                jk3Var.getClass();
                return super.parseNetworkError(jk3Var);
        }
    }

    @Override // com.monetization.ads.network.core.Request
    public final km81 parseNetworkResponse(gb81 gb81Var) {
        d4 d4Var;
        int i = this.w;
        pv81 pv81Var = this.y;
        switch (i) {
            case 0:
                if (200 == gb81Var.a) {
                    gg81 gg81Var = (gg81) pv81Var.a(gb81Var);
                    if (gg81Var != null) {
                        Map map = gb81Var.c;
                        if (map == null) {
                            map = b.f();
                        }
                        b(map);
                        return new km81(gg81Var, hba1.d(gb81Var));
                    }
                    d4Var = d4.c;
                } else {
                    d4Var = d4.e;
                }
                return new km81(new x3(d4Var, gb81Var));
            default:
                if (200 != gb81Var.a) {
                    return new km81(new x3(d4.e, gb81Var));
                }
                kc71 kc71Var = (kc71) pv81Var.a(gb81Var);
                return kc71Var != null ? new km81(kc71Var, hba1.d(gb81Var)) : new km81(new x3(d4.c, gb81Var));
        }
    }

    public he71(Context context, String str, pv81 pv81Var, Map map, a441 a441Var) {
        super(context, 0, str, a441Var, null);
        this.x = context;
        this.y = pv81Var;
        this.z = map;
    }
}
