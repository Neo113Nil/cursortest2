package xsna;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import org.json.JSONObject;
import xsna.nfp0;

/* compiled from: DeprecatedAnalyticsCompoundRequest.kt */
/* loaded from: classes5.dex */
public final class b0m extends awi<JSONObject> {
    public final nfp0.a s;
    public final String t;
    public final String u;
    public boolean v;

    public b0m(nfp0.a aVar, String str, String str2) {
        this.s = aVar;
        this.t = str;
        this.u = str2;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        nfp0.a aVar = this.s;
        List<JSONObject> list = aVar.b;
        List<JSONObject> list2 = aVar.c;
        boolean isEmpty = list.isEmpty();
        String str = this.u;
        String str2 = this.t;
        if (!isEmpty && !this.v) {
            dz2 x = yfb.x(sd9.t(X3.j.d + j5g.g0(aVar.b, StringUtils.COMMA, null, null, 0, null, 62) + ']'));
            if (str2 != null) {
                x.l = str2;
                x.m = str;
            }
            x.f(l7r0Var);
            this.v = true;
        }
        if (!list2.isEmpty()) {
            dz2 x2 = yfb.x(zxc0.a(new zxc0(), ho8.a(new StringBuilder(X3.j.d), j5g.g0(list2, StringUtils.COMMA, null, null, 0, null, 62), ']'), null, 2));
            if (str2 != null) {
                x2.l = str2;
                x2.m = str;
            }
            x2.f(l7r0Var);
        }
        return new JSONObject();
    }
}
