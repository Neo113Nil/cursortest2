package xsna;

import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.api.models.AuthResult;
import kotlin.Pair;
import ru.ok.android.sdk.SharedKt;

/* compiled from: AuthExt.kt */
/* loaded from: classes15.dex */
public final class b35 {
    public static v6u0 a(AuthResult authResult, String str) {
        return new v6u0(pn00.k(new Pair(SharedKt.PARAM_ACCESS_TOKEN, authResult.b), new Pair("secret", authResult.c), new Pair("https_required", authResult.e ? "1" : "0"), new Pair(SharedKt.PARAM_EXPIRES_IN, String.valueOf(authResult.f)), new Pair("user_id", String.valueOf(authResult.d.b)), new Pair("webview_access_token", authResult.i), new Pair("webview_refresh_token", authResult.j), new Pair("webview_access_token_expires_in", String.valueOf(authResult.k)), new Pair("profile_type", String.valueOf(AccountProfileType.NORMAL.h())), new Pair("webview_refresh_token_expires_in", String.valueOf(authResult.m)), new Pair("username", str), new Pair("utility_tokens", authResult.s.d().toString())));
    }
}
