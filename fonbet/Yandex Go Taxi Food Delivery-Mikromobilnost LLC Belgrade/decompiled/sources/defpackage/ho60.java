package defpackage;

import java.util.List;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public abstract class ho60 {
    public static final List a = scc.g("expired_token", "account has been globally logged out", "account is disabled", "account not found");
    public static final List b = scc.g("team_auth_is_forbidden", "sso_auth_is_forbidden");

    public static final boolean a(ngz ngzVar) {
        return ngzVar.b == 403 && b.contains(ngzVar.c);
    }

    public static final boolean b(ngz ngzVar) {
        String str = ngzVar.c;
        int i = ngzVar.b;
        if (i != 401) {
            if (i == 403) {
                return "invalid_auth_scope".equals(str);
            }
            return false;
        }
        if ("unauthorized".equals(str) && a.G(a, ngzVar.d)) {
            return true;
        }
        return "need_reset".equals(str);
    }
}
