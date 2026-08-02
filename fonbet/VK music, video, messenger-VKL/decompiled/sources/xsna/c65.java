package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.auth.api.models.AuthResult;
import com.vk.superapp.api.states.VkAuthState;
import java.util.Map;

/* compiled from: AuthRequest.kt */
/* loaded from: classes11.dex */
public final class c65 extends r56 {
    public final VkAuthState f;

    public c65(VkAuthState vkAuthState, String str, String str2, int i, boolean z, String str3, boolean z2, String str4, boolean z3, boolean z4, String str5) {
        super(zr.a("https://", str, "/token"), i, true);
        this.f = vkAuthState;
        if (z) {
            i("libverify_support", "1");
        }
        if (str2 != null && !drm0.N(str2)) {
            i("trusted_hash", str2);
        }
        if (str3 != null && str3.length() != 0) {
            i(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, str3);
        }
        if (z2) {
            i("vk_connect_auth", "1");
        }
        if (str4 != null && str4.length() != 0) {
            i("super_app_token", str4);
        }
        if (z3) {
            i("from_backup", "1");
        }
        if (z4) {
            i("device_trusted_hash_supported", "1");
        }
        if (str5 != null && str5.length() > 0) {
            i("max_messenger_hash", str5);
        }
        for (Map.Entry entry : vkAuthState.d.entrySet()) {
            i((String) entry.getKey(), (String) entry.getValue());
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.r56
    public final int l() {
        return 0;
    }

    @Override // xsna.r56
    public final AuthResult n(com.vk.superapp.core.api.models.a aVar) {
        return v25.a(aVar, this.f, 8);
    }
}
