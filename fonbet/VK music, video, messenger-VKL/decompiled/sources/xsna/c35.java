package xsna;

import com.vk.api.external.exceptions.VKWebAuthException;
import com.vk.auth.api.models.AuthResult;
import com.vk.dto.common.id.UserId;
import ru.ok.android.sdk.SharedKt;

/* compiled from: AuthExtendProvidedTokenCommand.kt */
/* loaded from: classes6.dex */
public final class c35 extends r56 {
    public c35(String str, String str2, String str3, String str4, int i, String str5, String str6) {
        super(zr.a("https://", str, "/extend_provided_token"), i, false);
        i(SharedKt.PARAM_ACCESS_TOKEN, str2);
        i("client_id", String.valueOf(i));
        i("provided_hash", str3);
        i("provided_uuid", str4);
        i("client_device_id", str5);
        if (str6 != null) {
            i("client_external_device_id", str6);
        }
    }

    @Override // xsna.r56
    public final AuthResult n(com.vk.superapp.core.api.models.a aVar) {
        if (aVar.A.length() != 0) {
            throw new VKWebAuthException(200, 56, aVar.A, aVar.B, null);
        }
        return new AuthResult(aVar.a, "", UserId.d, false, aVar.d, null, null, null, null, 0, null, 0, null, null, null, 0L, null, null, null, null, null, null, null, 8388584, null);
    }
}
