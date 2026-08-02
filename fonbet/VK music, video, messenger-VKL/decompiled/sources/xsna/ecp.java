package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.screendata.VerificationScreenData;
import com.vk.auth.verification.base.CheckPresenterInfo;
import com.vk.auth.verification.base.states.CodeState;
import xsna.ta6;

/* compiled from: EmailCheckFragment.kt */
/* loaded from: classes15.dex */
public final class ecp extends ta6<ccp> implements dcp {

    /* compiled from: EmailCheckFragment.kt */
    public static final class a {
        public static Bundle a(VerificationScreenData verificationScreenData, String str) {
            return ta6.a.a(verificationScreenData.c, str, new CheckPresenterInfo.SignUp(verificationScreenData, null, false, 6, null), new CodeState.EmailWait(0L, 0L, 0, null, 15, null), null, null, 0, false, null, false, null, 2032);
        }
    }

    @Override // com.vk.auth.verification.base.c
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // xsna.a66
    public final z55 tn(Bundle bundle) {
        requireContext();
        CodeState codeState = this.w;
        String str = this.u;
        if (str == null) {
            str = null;
        }
        CheckPresenterInfo checkPresenterInfo = this.v;
        fcp fcpVar = new fcp(codeState, bundle, checkPresenterInfo != null ? checkPresenterInfo : null);
        fcpVar.H = str;
        return fcpVar;
    }

    @Override // xsna.ta6
    public final void yn() {
        Object obj = this.o;
        if (obj == null) {
            obj = null;
        }
        ((ccp) obj).y0(this);
    }
}
