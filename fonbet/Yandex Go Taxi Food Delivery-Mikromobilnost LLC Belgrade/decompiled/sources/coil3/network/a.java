package coil3.network;

import android.content.Context;
import coil3.c;
import com.adjust.sdk.Constants;
import defpackage.cg21;
import defpackage.cjm0;
import defpackage.d240;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lg70;
import defpackage.nwq;
import defpackage.oi60;
import defpackage.pwq;
import defpackage.rk50;
import defpackage.tls;
import defpackage.wbz0;
import kotlin.InitializedLazyImpl;

/* loaded from: classes10.dex */
public final class a implements nwq {
    public final i3y a;
    public final i3y b;
    public final cjm0 c;
    public final i3y d;

    public a(oi60 oi60Var) {
        rk50 rk50Var = new rk50(25);
        NetworkFetcher$Factory$2 networkFetcher$Factory$2 = NetworkFetcher$Factory$2.b;
        rk50 rk50Var2 = new rk50(26);
        this.a = kotlin.a.a(oi60Var);
        this.b = kotlin.a.a(rk50Var);
        cjm0 cjm0Var = new cjm0();
        cjm0Var.b = networkFetcher$Factory$2;
        cjm0Var.c = wbz0.b;
        this.c = cjm0Var;
        this.d = kotlin.a.a(rk50Var2);
    }

    @Override // defpackage.nwq
    public final pwq a(Object obj, lg70 lg70Var, c cVar) {
        cg21 cg21Var = (cg21) obj;
        if (!jl40.l(cg21Var.c, "http") && !jl40.l(cg21Var.c, Constants.SCHEME)) {
            return null;
        }
        String str = cg21Var.a;
        i3y i3yVar = this.a;
        i3y a = kotlin.a.a(new d240(22, cVar));
        i3y i3yVar2 = this.b;
        cjm0 cjm0Var = this.c;
        Context context = lg70Var.a;
        Object obj2 = cjm0Var.c;
        wbz0 wbz0Var = wbz0.b;
        if (obj2 == wbz0Var) {
            synchronized (cjm0Var) {
                obj2 = cjm0Var.c;
                if (obj2 == wbz0Var) {
                    Object invoke = ((tls) cjm0Var.b).invoke(context);
                    cjm0Var.c = invoke;
                    cjm0Var.b = null;
                    obj2 = invoke;
                }
            }
        }
        return new b(str, lg70Var, i3yVar, a, i3yVar2, new InitializedLazyImpl(obj2), this.d);
    }
}
