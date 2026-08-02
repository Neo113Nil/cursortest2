package xsna;

import android.text.InputFilter;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.ui.VkCheckEditText;

/* compiled from: EditTextsController.kt */
/* loaded from: classes15.dex */
public final class w1p {
    public final fzf a;
    public CodeState b;

    public w1p(fzf fzfVar) {
        this.a = fzfVar;
    }

    public final void a(CodeState codeState, int i) {
        fzf fzfVar = this.a;
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = fzfVar.a;
        VkCheckEditText vkCheckEditText = fzfVar.c;
        CodeState e = codeState.e();
        if ((e instanceof CodeState.LibverifyMobileId) || (e instanceof CodeState.CallResetPreview) || (e instanceof CodeState.CallInWait) || (e instanceof CodeState.MaxMessengerWait) || (e instanceof CodeState.MessengerRegistration)) {
            fzfVar.e(false, false);
            if (fzfVar.e) {
                bpn0 bpn0Var = t65.a;
                mhy.b(vkCheckEditText.getContext());
            } else {
                bpn0 bpn0Var2 = t65.a;
                mhy.b(vkAuthErrorStatedEditText.getContext());
            }
        } else if (e instanceof CodeState.MessengerLoading) {
            fzfVar.e(false, true);
            if (fzfVar.e) {
                bpn0 bpn0Var3 = t65.a;
                mhy.b(vkCheckEditText.getContext());
            } else {
                bpn0 bpn0Var4 = t65.a;
                mhy.b(vkAuthErrorStatedEditText.getContext());
            }
            fzfVar.b(false);
        } else if (e instanceof CodeState.LibverifyMessengersPushWait) {
            fzfVar.b(true);
            fzfVar.e(false, true);
        } else {
            fzfVar.b(true);
            fzfVar.e(false, true);
        }
        CodeState codeState2 = this.b;
        if (codeState2 != null && !codeState2.equals(codeState) && !(codeState instanceof CodeState.NotReceive) && !(codeState instanceof CodeState.CallInWait) && !(codeState instanceof CodeState.CallResetPreview) && !(codeState instanceof CodeState.MessengerLoading) && !(codeState instanceof CodeState.MessengerRegistration)) {
            if (fzfVar.e) {
                vkCheckEditText.postDelayed(new ep0(fzfVar, 4), 150L);
            } else {
                fzfVar.a("");
            }
            fzfVar.d();
        }
        this.b = codeState;
        vkAuthErrorStatedEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
    }
}
