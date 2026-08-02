package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.coremedia.iso.boxes.AuthorBox;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.oauth.passkey.PasskeyWebAuthActivityData;
import com.vk.auth.oauth.passkey.VkPasskeyWebAuthActivity;
import com.vk.auth.oauth.passkey.VkPasskeyWebOAuthResult;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import java.util.UUID;
import kotlin.Result;
import xsna.w6v0;

/* compiled from: VkPasskeyOAuthProvider.kt */
/* loaded from: classes15.dex */
public final class vav0 implements do70 {
    public final Context a;

    public vav0(Context context) {
        this.a = context;
    }

    @Override // xsna.do70
    public final boolean a(int i, int i2, Intent intent, izs<? super eo70, s3q0> izsVar) {
        Object failure;
        VkPasskeyWebOAuthResult vkPasskeyWebOAuthResult;
        Object parcelableExtra;
        try {
            if (i == 229988 && i2 == -1 && intent != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra = intent.getParcelableExtra("KEY_PASSKEY_OAUTH_RESULT", VkPasskeyWebOAuthResult.class);
                    vkPasskeyWebOAuthResult = (VkPasskeyWebOAuthResult) parcelableExtra;
                } else {
                    vkPasskeyWebOAuthResult = (VkPasskeyWebOAuthResult) intent.getParcelableExtra("KEY_PASSKEY_OAUTH_RESULT");
                }
                if (vkPasskeyWebOAuthResult == null) {
                    vkPasskeyWebOAuthResult = VkPasskeyWebOAuthResult.Invalid.b;
                }
            } else {
                vkPasskeyWebOAuthResult = VkPasskeyWebOAuthResult.Invalid.b;
            }
            failure = Boolean.valueOf(vkPasskeyWebOAuthResult.a((w6v0.b) izsVar, this.a));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Object obj = Boolean.FALSE;
        if (failure instanceof Result.Failure) {
            failure = obj;
        }
        return ((Boolean) failure).booleanValue();
    }

    @Override // xsna.do70
    public final void b(Activity activity, Bundle bundle) {
        PasskeyCheckInfo passkeyCheckInfo;
        Object parcelable;
        if (bundle == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = bundle.getParcelable(VkOAuthService.PASSKEY_WEB_AUTH_DATA, PasskeyCheckInfo.class);
            passkeyCheckInfo = (PasskeyCheckInfo) parcelable;
        } else {
            passkeyCheckInfo = (PasskeyCheckInfo) bundle.getParcelable(VkOAuthService.PASSKEY_WEB_AUTH_DATA);
        }
        if (passkeyCheckInfo == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String str = passkeyCheckInfo.c;
        UUID randomUUID = UUID.randomUUID();
        dm90 dm90Var = new dm90();
        dm90Var.b = str;
        dm90Var.a = passkeyCheckInfo.e;
        dm90Var.c = randomUUID;
        String c = h5s.c(dgn0.b().b, "://vk.ru", new StringBuilder("vk"));
        String str2 = null;
        try {
            q55 q55Var = q55.a;
            Bundle bundle2 = q55.c().a.K;
            if (bundle2 != null) {
                str2 = bundle2.getString("white_label_flow_input_sat");
            }
        } catch (Throwable unused) {
        }
        String str3 = dm90Var.b;
        if (str3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        PasskeyWebAuthScreen passkeyWebAuthScreen = dm90Var.a;
        if (passkeyWebAuthScreen == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String valueOf = String.valueOf(dgn0.b().b);
        UUID uuid = dm90Var.c;
        if (uuid == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String uuid2 = uuid.toString();
        int i = VkPasskeyWebAuthActivity.e;
        String str4 = passkeyCheckInfo.b;
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("id.vk.ru").path(AuthorBox.TYPE).appendQueryParameter(CommonConstant.ReqAccessTokenParam.RESPONSE_TYPE, "silent_token").appendQueryParameter("v", "1.58.4").appendQueryParameter("app_id", valueOf).appendQueryParameter("uuid", uuid2).appendQueryParameter("redirect_uri", c).appendQueryParameter(O6.e1, str3).appendQueryParameter("screen", passkeyWebAuthScreen.h());
        if (str2 != null) {
            appendQueryParameter.appendQueryParameter("super_app_token", str2);
        }
        activity.startActivityForResult(new Intent(activity, (Class<?>) VkPasskeyWebAuthActivity.class).putExtra("KEY_PASSKEY_AUTH_ACTIVITY_DATA", new PasskeyWebAuthActivityData(str4, str, randomUUID.toString())).setData(appendQueryParameter.build()), 229988);
    }
}
