package xsna;

import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.api.sdk.exceptions.VKApiException;

/* compiled from: PasskeyBeginCommand.kt */
/* loaded from: classes6.dex */
public final class ql90 extends nx2<rl90> {
    public final String b;
    public final String c;
    public final String d;

    public ql90(String str, String str2, String str3) {
        this.b = str2;
        this.c = str3;
        this.d = zr.a("https://", str, "/passkey_begin");
    }

    @Override // xsna.nx2
    public final rl90 f(l7r0 l7r0Var) {
        pl90 pl90Var = new pl90(l7r0Var, this);
        zqa zqaVar = new zqa();
        zu2 zu2Var = new zu2(l7r0Var);
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                zu2Var.b();
                return (rl90) pl90Var.a(zqaVar);
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
