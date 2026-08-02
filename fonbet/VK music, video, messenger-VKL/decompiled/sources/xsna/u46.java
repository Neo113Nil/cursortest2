package xsna;

import com.vk.auth.oauth.VkOAuthService;
import com.vkontakte.android.R;
import xsna.rv1;

/* compiled from: BaseAlreadyBoundModal.kt */
/* loaded from: classes15.dex */
public final class u46 {
    public static final rv1 a(ld20 ld20Var, VkOAuthService vkOAuthService) {
        return new rv1(ld20Var, "OAuthVkIDAlreadyBound", R.string.vk_auth_id_already_bound_to_another_base_modal_title, new a(), vkOAuthService);
    }

    /* compiled from: BaseAlreadyBoundModal.kt */
    public static final class a implements rv1.a {
        @Override // xsna.rv1.a
        public final void a() {
        }
    }
}
