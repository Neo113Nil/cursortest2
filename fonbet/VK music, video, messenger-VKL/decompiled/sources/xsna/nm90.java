package xsna;

import com.vk.auth.main.SignUpDataHolder;
import com.vk.auth.main.SilentAuthSource;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.states.VkAuthState;
import xsna.zi6;

/* compiled from: PasswordMethodSelectorPresenter.kt */
/* loaded from: classes15.dex */
public final class nm90 extends dj6 {
    public final FullscreenPasswordData B;

    public nm90(FullscreenPasswordData fullscreenPasswordData) {
        super(fullscreenPasswordData);
        this.B = fullscreenPasswordData;
    }

    @Override // xsna.qys
    public final void a() {
        FullscreenPasswordData fullscreenPasswordData = this.B;
        String str = fullscreenPasswordData != null ? fullscreenPasswordData.b : null;
        if ((str != null && drm0.D(str, "*", false)) || str == null) {
            str = "";
        }
        Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
        VkAuthState b = VkAuthState.a.b(str, this.A, fullscreenPasswordData != null ? fullscreenPasswordData.d : null, true);
        zi6.a aVar = new zi6.a();
        SignUpDataHolder signUpDataHolder = this.p;
        if (signUpDataHolder == null) {
            signUpDataHolder = null;
        }
        p66.j0(this, b, aVar, VkAuthMetaInfo.zb(signUpDataHolder.H, SilentAuthSource.BY_LOGIN, null, null, 55), new cww(this, 26), 8);
    }
}
