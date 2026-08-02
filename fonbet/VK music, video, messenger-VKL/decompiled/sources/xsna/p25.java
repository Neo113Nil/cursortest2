package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.states.VkAuthState;
import kotlin.collections.EmptyList;
import ru.ok.android.sdk.SharedKt;

/* compiled from: AuthByAccessToken.kt */
/* loaded from: classes6.dex */
public final class p25 extends r56 {
    public p25(String str, int i, String str2, String str3) {
        super(zr.a("https://", str, "/auth_by_access_token"), i, false);
        i(SharedKt.PARAM_ACCESS_TOKEN, str2);
        i("validate_session", str3);
    }

    @Override // xsna.r56
    public final AuthResult n(com.vk.superapp.core.api.models.a aVar) {
        Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
        EmptyList emptyList = EmptyList.b;
        VkAuthState vkAuthState = new VkAuthState(null);
        vkAuthState.e.addAll(emptyList);
        return v25.a(aVar, vkAuthState, 12);
    }
}
