package xsna;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.main.AuthActivity;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.screendata.LibverifyScreenData;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.smartflow.ValidateAccountRoutingData;
import com.vk.auth.smartflow.api.data.VerificationMethodState;
import com.vk.auth.smartflow.api.password.FullscreenPasswordData;

/* compiled from: WhiteLabelAfterValidateAccountFlowsRouter.kt */
/* loaded from: classes15.dex */
public final class rkx0 implements f71 {
    public final Context a;

    public rkx0(FragmentActivity fragmentActivity) {
        this.a = fragmentActivity;
    }

    @Override // xsna.f71
    public final void a(PasskeyCheckInfo passkeyCheckInfo) {
        f(new ValidateAccountRoutingData.Passkey(passkeyCheckInfo));
    }

    @Override // xsna.f71
    public final void b(FullscreenPasswordData fullscreenPasswordData, ValidateAccountRoutingData.Credentials credentials) {
        f(new ValidateAccountRoutingData.SmartflowPassword(fullscreenPasswordData, credentials));
    }

    @Override // xsna.f71
    public final void c(FullscreenPasswordData fullscreenPasswordData, ValidateAccountRoutingData.Credentials credentials) {
        f(new ValidateAccountRoutingData.NoPasswordFlowPassword(fullscreenPasswordData, credentials));
    }

    @Override // xsna.f71
    public final void d(VerificationScreenData verificationScreenData, VerificationMethodState verificationMethodState, ValidateAccountRoutingData.Credentials credentials) {
        f(new ValidateAccountRoutingData.Otp(verificationScreenData, verificationMethodState, credentials));
    }

    @Override // xsna.f71
    public final void e(LibverifyScreenData.MethodSelectorAuth methodSelectorAuth, ValidateAccountRoutingData.Credentials credentials) {
        f(new ValidateAccountRoutingData.Libverify(methodSelectorAuth, credentials));
    }

    public final void f(ValidateAccountRoutingData validateAccountRoutingData) {
        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
        r55 r55Var = r55.a;
        r55.b();
        Context context = this.a;
        Intent putExtra = new Intent(context, (Class<?>) AuthActivity.class).putExtra("disableEnterPhone", true);
        putExtra.putExtra("key_validate_account_data", validateAccountRoutingData);
        putExtra.setFlags(335544320);
        context.startActivity(putExtra);
    }
}
