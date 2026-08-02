package xsna;

import android.content.Context;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.oauth.di.OAuthImplementationNotFound;

/* compiled from: BaseOAuthManager.kt */
/* loaded from: classes.dex */
public interface si6 {
    do70 a(Context context, VkOAuthService vkOAuthService) throws OAuthImplementationNotFound;

    boolean c(VkOAuthService vkOAuthService);
}
