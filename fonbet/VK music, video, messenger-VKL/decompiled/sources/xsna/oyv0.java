package xsna;

import android.os.Bundle;
import com.vk.superapp.verification.account.VerificationFlow;

/* compiled from: VkVerificationAccountFragmentFactoryImpl.kt */
/* loaded from: classes6.dex */
public final class oyv0 implements nyv0 {
    @Override // xsna.nyv0
    public final lyv0 a(String str, VerificationFlow verificationFlow) {
        com.vk.superapp.verification.account.d dVar = new com.vk.superapp.verification.account.d();
        Bundle bundle = new Bundle(3);
        bundle.putBoolean("isVkIdFlow", true);
        bundle.putString("service", str);
        bundle.putParcelable("verificationFlow", verificationFlow);
        dVar.setArguments(bundle);
        return dVar;
    }
}
