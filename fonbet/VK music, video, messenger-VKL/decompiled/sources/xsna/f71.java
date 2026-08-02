package xsna;

import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.ValidateAccountRoutingData;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;

/* compiled from: AfterValidateAccountFlowsRouter.kt */
/* loaded from: classes.dex */
public interface f71 {

    /* compiled from: AfterValidateAccountFlowsRouter.kt */
    /* loaded from: classes15.dex */
    public static final class a {
    }

    void a(PasskeyCheckInfo passkeyCheckInfo);

    void b(FullscreenPasswordData fullscreenPasswordData, ValidateAccountRoutingData.Credentials credentials);

    void c(FullscreenPasswordData fullscreenPasswordData, ValidateAccountRoutingData.Credentials credentials);

    void d(VerificationScreenData verificationScreenData, VerificationMethodState verificationMethodState, ValidateAccountRoutingData.Credentials credentials);

    void e(LibverifyScreenData.MethodSelectorAuth methodSelectorAuth, ValidateAccountRoutingData.Credentials credentials);
}
