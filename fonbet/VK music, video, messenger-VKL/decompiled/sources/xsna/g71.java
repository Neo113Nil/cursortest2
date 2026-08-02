package xsna;

import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.ValidateAccountRoutingData;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;

/* compiled from: AfterValidateAccountFlowsRouterImpl.kt */
/* loaded from: classes.dex */
public final class g71 implements f71 {
    public final gzs<com.vk.auth.main.b> a;

    /* JADX WARN: Multi-variable type inference failed */
    public g71(gzs<? extends com.vk.auth.main.b> gzsVar) {
        this.a = gzsVar;
    }

    @Override // xsna.f71
    public final void a(PasskeyCheckInfo passkeyCheckInfo) {
        this.a.invoke().I0(passkeyCheckInfo);
    }

    @Override // xsna.f71
    public final void b(FullscreenPasswordData fullscreenPasswordData, ValidateAccountRoutingData.Credentials credentials) {
        this.a.invoke().b1(fullscreenPasswordData);
    }

    @Override // xsna.f71
    public final void c(FullscreenPasswordData fullscreenPasswordData, ValidateAccountRoutingData.Credentials credentials) {
        this.a.invoke().T0(fullscreenPasswordData, true);
    }

    @Override // xsna.f71
    public final void d(VerificationScreenData verificationScreenData, VerificationMethodState verificationMethodState, ValidateAccountRoutingData.Credentials credentials) {
        this.a.invoke().J0(verificationScreenData, verificationMethodState);
    }

    @Override // xsna.f71
    public final void e(LibverifyScreenData.MethodSelectorAuth methodSelectorAuth, ValidateAccountRoutingData.Credentials credentials) {
        this.a.invoke().f1(methodSelectorAuth);
    }
}
