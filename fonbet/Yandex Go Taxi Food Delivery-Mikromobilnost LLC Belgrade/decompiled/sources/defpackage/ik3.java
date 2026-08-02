package defpackage;

import com.yandex.passport.api.exception.PassportException;
import java.io.IOException;
import java.util.Arrays;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.exception.TokenRetrievalException;

/* loaded from: classes9.dex */
public final class ik3 implements p8w {
    public final /* synthetic */ int a;
    public final a b;

    public /* synthetic */ ik3(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.p8w
    public final kvj0 intercept(m8w m8wVar) {
        String str;
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                zci0 zci0Var = (zci0) m8wVar;
                d5j0 d5j0Var = zci0Var.e;
                meu meuVar = d5j0Var.c;
                if (meuVar.a("X-LCP-No-Auth") != null) {
                    t4j0 b = d5j0Var.b();
                    b.c.f("X-LCP-No-Auth");
                    return zci0Var.b(new d5j0(b));
                }
                if (meuVar.a("Authorization") != null && meuVar.a("X-Oauth-Token") != null) {
                    return zci0Var.b(d5j0Var);
                }
                t4j0 b2 = d5j0Var.b();
                String str2 = d5j0Var.a.i;
                try {
                    str = aVar.f();
                } catch (PassportException e) {
                    jst.e.k(e, String.format("Cannot retrieve auth token for request %s", Arrays.copyOf(new Object[]{str2.substring(evu0.K(str2, '/', 0, 6))}, 1)));
                    throw new TokenRetrievalException(e);
                } catch (IOException e2) {
                    jst.e.k(e2, String.format("Cannot retrieve auth token for request %s", Arrays.copyOf(new Object[]{str2.substring(evu0.K(str2, '/', 0, 6))}, 1)));
                    throw new TokenRetrievalException(e2);
                } catch (Exception e3) {
                    jst.e.k(e3, String.format("Unknown error of receiving token", Arrays.copyOf(new Object[]{str2.substring(evu0.K(str2, '/', 0, 6))}, 1)));
                    str = null;
                }
                if (str != null && !evu0.J(str)) {
                    b2.a("Authorization", "Bearer ".concat(str));
                    b2.a("X-Oauth-Token", str);
                }
                return zci0Var.b(new d5j0(b2));
            default:
                zci0 zci0Var2 = (zci0) m8wVar;
                d5j0 d5j0Var2 = zci0Var2.e;
                if (d5j0Var2.c.a("X-LCP-No-Auth") != null) {
                    t4j0 b3 = d5j0Var2.b();
                    b3.c.f("X-LCP-No-Auth");
                    return zci0Var2.b(new d5j0(b3));
                }
                if (d5j0Var2.c.a("x-user-authorization") != null) {
                    return zci0Var2.b(d5j0Var2);
                }
                t4j0 b4 = d5j0Var2.b();
                String str3 = d5j0Var2.a.i;
                try {
                    String f = aVar.f();
                    if (f != null && !evu0.J(f)) {
                        b4.a("x-user-authorization", "OAuth ".concat(f));
                    }
                    return zci0Var2.b(new d5j0(b4));
                } catch (PassportException e4) {
                    jst.e.k(e4, String.format("Cannot retrieve auth token for request %s", Arrays.copyOf(new Object[]{str3.substring(evu0.K(str3, '/', 0, 6))}, 1)));
                    throw new TokenRetrievalException(e4);
                } catch (IOException e5) {
                    jst.e.k(e5, String.format("Cannot retrieve auth token for request %s", Arrays.copyOf(new Object[]{str3.substring(evu0.K(str3, '/', 0, 6))}, 1)));
                    throw new TokenRetrievalException(e5);
                }
        }
    }
}
