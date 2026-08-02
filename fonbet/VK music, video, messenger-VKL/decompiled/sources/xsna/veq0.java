package xsna;

import com.vk.auth.main.AuthStatSender;
import com.vk.superapp.api.states.VkAuthState;

/* compiled from: UrlCheckPresenter.kt */
/* loaded from: classes15.dex */
public final class veq0 extends p66<x65> {
    public final VkAuthState x;

    public veq0(VkAuthState vkAuthState) {
        this.x = vkAuthState;
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.URL_CHECK;
    }
}
