package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;

/* loaded from: classes11.dex */
public final class p520 extends g720 {
    public final String d;
    public final String e;

    public p520(String str, String str2) {
        super(g8e.p(str, " ", str2));
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.g720
    public final String c() {
        Map i = b.i(new Pair("host_name", this.d), new Pair("host_string", this.e));
        rbx rbxVar = sbx.d;
        rbxVar.getClass();
        auu0 auu0Var = auu0.a;
        return "host_source|".concat(rbxVar.c(i, new k8u(auu0Var, auu0Var, 1)));
    }
}
