package xsna;

import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.auth.api.models.AuthResult;
import com.vk.dto.common.id.UserId;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;

/* compiled from: AuthExtendTokenCommand.kt */
/* loaded from: classes6.dex */
public final class e35 extends r56 {
    public final String f;

    public e35(String str, int i, String str2, String str3, String str4) {
        super(zr.a("https://", str, "/extend_token"), i, false);
        this.f = str2;
        i(LoginApiConstants.PARAM_NAME_PASSWORD, str3);
        i("hash", str4);
    }

    @Override // xsna.r56
    public final String k() {
        return this.f;
    }

    @Override // xsna.r56
    public final AuthResult n(com.vk.superapp.core.api.models.a aVar) {
        String str = aVar.A;
        if (str.length() == 0) {
            return new AuthResult(aVar.a, "", UserId.d, false, 0, null, null, null, null, 0, null, 0, null, null, null, 0L, null, aVar.g, null, null, null, null, null, 8257528, null);
        }
        if (!str.equals("is_ok")) {
            throw new VKWebAuthException(200, 56, aVar.A, aVar.B, null);
        }
        return new AuthResult(this.f, "", UserId.d, false, 0, null, null, null, null, 0, null, 0, null, null, null, 0L, null, aVar.g, null, null, null, null, null, 8257528, null);
    }
}
