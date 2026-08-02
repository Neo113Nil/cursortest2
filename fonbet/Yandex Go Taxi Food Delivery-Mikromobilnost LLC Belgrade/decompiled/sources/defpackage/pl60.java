package defpackage;

import com.yandex.xplat.common.NetworkMethod;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes2.dex */
public final class pl60 implements vv50 {
    public final /* synthetic */ int a;
    public final String b;

    public /* synthetic */ pl60(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.vv50
    public final md51 d(hz50 hz50Var) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                NetworkMethod method = hz50Var.method();
                String c = hz50Var.c();
                wj00 a = hz50Var.a();
                wj00 b = hz50Var.b();
                wj00 d = hz50Var.d();
                d.k("X-Service-Token", str);
                return zmx.d(new tsp0(method, c, a, b, d, hz50Var.encoding()));
            case 1:
                if (hz50Var.d().h("X-Oauth-Token") == null && hz50Var.d().h("X-Uid") == null) {
                    return zmx.d(hz50Var);
                }
                NetworkMethod method2 = hz50Var.method();
                String c2 = hz50Var.c();
                wj00 a2 = hz50Var.a();
                wj00 b2 = hz50Var.b();
                wj00 d2 = hz50Var.d();
                if (str != null) {
                    d2.k("X-PASSPORT-PARTITION", str);
                }
                return zmx.d(new tsp0(method2, c2, a2, b2, d2, hz50Var.encoding()));
            case 2:
                NetworkMethod method3 = hz50Var.method();
                String c3 = hz50Var.c();
                wj00 a3 = hz50Var.a();
                wj00 b3 = hz50Var.b();
                wj00 d3 = hz50Var.d();
                if (str != null) {
                    d3.k("Webauth-Authorization", "OAuth ".concat(str));
                }
                return zmx.d(new tsp0(method3, c3, a3, b3, d3, hz50Var.encoding()));
            default:
                NetworkMethod method4 = hz50Var.method();
                String c4 = hz50Var.c();
                wj00 a4 = hz50Var.a();
                wj00 b4 = hz50Var.b();
                wj00 d4 = hz50Var.d();
                d4.k(ExtFunctionsKt.HEADER_USER_AGENT, str);
                return zmx.d(new tsp0(method4, c4, a4, b4, d4, hz50Var.encoding()));
        }
    }
}
