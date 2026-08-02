package xsna;

import android.content.Intent;
import com.vk.superapp.bridges.dto.tapandpay.VkTokenizationNetworkName;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.utils.InternalMiniApps;
import com.vk.superapp.core.errors.VkAppsErrors;
import java.util.Locale;
import org.json.JSONObject;
import xsna.bex0;

/* compiled from: JsVkPayDelegate.kt */
/* loaded from: classes6.dex */
public final class p7y implements mpf0 {
    public final x6y a;
    public fvv0 b;
    public final Object c = new Object();
    public final k0x d;
    public final b e;

    /* compiled from: JsVkPayDelegate.kt */
    public static final class a {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return epx.f(null, null) && epx.f(null, null);
        }

        public final int hashCode() {
            urd0.a(Boolean.hashCode(false) * 31, 31, null);
            throw null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CanAddCardInfo(tokenIsFree=");
            sb.append(false);
            sb.append(", walletId=");
            sb.append((String) null);
            sb.append(", deviceId=");
            return ho8.a(sb, null, ')');
        }
    }

    /* compiled from: JsVkPayDelegate.kt */
    public static final class b implements tb0 {
        public b() {
        }

        @Override // xsna.tb0
        public final void onActivityResult(int i, int i2, Intent intent) {
            gvv0 view;
            p7y p7yVar = p7y.this;
            x6y x6yVar = p7yVar.a;
            fvv0 fvv0Var = p7yVar.b;
            if (fvv0Var != null && (view = fvv0Var.getView()) != null) {
                view.e3(this);
            }
            if (i == 10051) {
                JSONObject jSONObject = new JSONObject();
                if (i2 != -1) {
                    bex0.a.a(x6yVar, JsApiMethodType.ADD_CARD, VkAppsErrors.Client.USER_DENIED, null, null, null, 60);
                } else {
                    jSONObject.put("token", intent.getStringExtra("extra_issuer_token_id"));
                    bex0.a.b(x6yVar, JsApiMethodType.ADD_CARD, jSONObject, null, 12);
                }
            }
        }
    }

    public p7y(x6y x6yVar, fvv0 fvv0Var) {
        this.a = x6yVar;
        this.b = fvv0Var;
        k0x k0xVar = e370.h;
        this.d = k0xVar == null ? null : k0xVar;
        this.e = new b();
    }

    public static VkTokenizationNetworkName d(JSONObject jSONObject) {
        String optString = jSONObject.optString("network_name");
        Enum r0 = null;
        if (optString != null) {
            try {
                r0 = Enum.valueOf(VkTokenizationNetworkName.class, optString.toUpperCase(Locale.US));
            } catch (IllegalArgumentException unused) {
            }
        }
        VkTokenizationNetworkName vkTokenizationNetworkName = (VkTokenizationNetworkName) r0;
        return vkTokenizationNetworkName == null ? VkTokenizationNetworkName.MASTERCARD : vkTokenizationNetworkName;
    }

    public final boolean a(JsApiMethodType jsApiMethodType) {
        fvv0 fvv0Var = this.b;
        if (fvv0Var != null) {
            long appId = fvv0Var.getAppId();
            InternalMiniApps.Companion.getClass();
            if (InternalMiniApps.a.b(appId)) {
                return true;
            }
            bex0.a.a(this.a, jsApiMethodType, VkAppsErrors.Client.ACCESS_DENIED, null, null, null, 60);
        }
        return false;
    }

    @Override // xsna.mpf0
    public final void b(fvv0 fvv0Var) {
        this.b = fvv0Var;
    }

    public final String c() {
        fvv0 M = this.a.M();
        Long valueOf = M != null ? Long.valueOf(M.getAppId()) : null;
        if (valueOf == null) {
            return null;
        }
        String a2 = defpackage.k0.a(valueOf.longValue(), "vk_secure_token_key_");
        hzg0 hzg0Var = pjp.a;
        String a3 = pjp.a(a2);
        return a3 == null ? pjp.a("vk_pay_auth_token") : a3;
    }

    public final boolean e(String str) {
        fvv0 M = this.a.M();
        Long valueOf = M != null ? Long.valueOf(M.getAppId()) : null;
        if (valueOf == null) {
            return false;
        }
        String a2 = defpackage.k0.a(valueOf.longValue(), "vk_secure_token_key_");
        hzg0 hzg0Var = pjp.a;
        pjp.c(a2, str);
        return true;
    }

    @Override // xsna.mpf0
    public final void release() {
        this.b = null;
    }
}
