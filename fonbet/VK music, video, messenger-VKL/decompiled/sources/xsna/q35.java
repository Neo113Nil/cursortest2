package xsna;

import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.api.sdk.exceptions.VKApiException;

/* compiled from: AuthGetHashes.kt */
/* loaded from: classes6.dex */
public final class q35 extends nx2<gcu0> {
    public final int b;
    public final String c;
    public final String d;
    public final String e;

    public q35(String str, int i, String str2, String str3) {
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = zr.a("https://", str, "/get_hashes");
    }

    @Override // xsna.nx2
    public final gcu0 f(l7r0 l7r0Var) {
        p35 p35Var = new p35(l7r0Var, this);
        zqa zqaVar = new zqa();
        zu2 zu2Var = new zu2(l7r0Var);
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                zu2Var.b();
                return (gcu0) p35Var.a(zqaVar);
            } catch (VKWebAuthException e) {
                if (epx.f(e.d(), "anonymous_token_has_expired")) {
                    zu2Var.d(true, null);
                } else {
                    if (!epx.f(e.d(), "invalid_anonymous_token")) {
                        throw e;
                    }
                    zu2Var.d(z, null);
                }
                if (i == 1) {
                    throw new VKApiException("Can't complete request - anonymous token refresh limit exceeded");
                }
                i++;
            }
        }
    }
}
