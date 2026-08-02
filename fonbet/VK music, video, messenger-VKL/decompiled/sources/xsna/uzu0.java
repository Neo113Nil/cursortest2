package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vk.superapp.browser.internal.ui.identity.fragments.VkIdentityActivity;
import com.vk.superapp.core.ui.VkDelegatingActivity;

/* compiled from: VkIdentityControllerImpl.kt */
/* loaded from: classes6.dex */
public final class uzu0 extends tzu0 {
    public final Fragment c;

    public uzu0(Fragment fragment) {
        super(fragment);
        this.c = fragment;
    }

    @Override // xsna.tzu0
    public final void b(WebIdentityContext webIdentityContext, String str) {
        WebIdentityCardData webIdentityCardData = webIdentityContext.c;
        Bundle bundle = new Bundle();
        bundle.putString("arg_type", str);
        bundle.putParcelable("arg_identity_card", webIdentityCardData);
        bundle.putParcelable("arg_identity_context", webIdentityContext);
        int i = VkDelegatingActivity.f;
        VkDelegatingActivity.a.a(this.c, VkIdentityActivity.class, a0v0.class, bundle, 109);
    }

    @Override // xsna.tzu0
    public final void c(WebIdentityContext webIdentityContext) {
        Bundle bundle = new Bundle();
        bundle.putString("arg_source", "vk_apps");
        bundle.putParcelable("arg_identity_context", webIdentityContext);
        int i = VkDelegatingActivity.f;
        VkDelegatingActivity.a.a(this.c, VkIdentityActivity.class, f0v0.class, bundle, 109);
    }
}
