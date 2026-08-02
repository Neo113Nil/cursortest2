package defpackage;

import com.monetization.ads.network.core.Request;
import yads.jk3;

/* loaded from: classes7.dex */
public final class eg81 extends Request {
    public final bp5 a;

    public eg81(String str, bp5 bp5Var, bp5 bp5Var2) {
        super(0, str, bp5Var2);
        this.a = bp5Var;
    }

    @Override // com.monetization.ads.network.core.Request
    public final void deliverResponse(Object obj) {
        this.a.a((byte[]) obj);
    }

    @Override // com.monetization.ads.network.core.Request
    public final km81 parseNetworkResponse(gb81 gb81Var) {
        try {
            return new km81(gb81Var.b, hba1.d(gb81Var));
        } catch (Exception e) {
            return new km81(new jk3(e));
        }
    }
}
