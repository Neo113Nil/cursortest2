package xsna;

import android.content.Context;
import com.ironsource.O6;
import com.vk.auth.api.models.AuthResult;
import com.vk.auth.main.SignUpData;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.validation.VkPhoneValidationCompleteResult;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkCheckSilentTokenStep;
import com.vk.superapp.api.states.VkAuthState;
import com.vk.superapp.core.api.models.a;

/* compiled from: PhoneValidationRequiredHandler.kt */
/* loaded from: classes15.dex */
public final class d4a0 implements s25 {
    public final /* synthetic */ Context b;
    public final /* synthetic */ VkAuthMetaInfo c;
    public final /* synthetic */ a.b d;
    public final /* synthetic */ VkAuthState e;
    public final /* synthetic */ izs<io.reactivex.rxjava3.core.q<AuthResult>, s3q0> f;
    public final /* synthetic */ gzs<s3q0> g;

    /* JADX WARN: Multi-variable type inference failed */
    public d4a0(Context context, VkAuthMetaInfo vkAuthMetaInfo, a.b bVar, VkAuthState vkAuthState, izs<? super io.reactivex.rxjava3.core.q<AuthResult>, s3q0> izsVar, gzs<s3q0> gzsVar) {
        this.b = context;
        this.c = vkAuthMetaInfo;
        this.d = bVar;
        this.e = vkAuthState;
        this.f = izsVar;
        this.g = gzsVar;
    }

    @Override // xsna.s25
    public final void h(VkPhoneValidationCompleteResult vkPhoneValidationCompleteResult) {
        a.b bVar;
        io.reactivex.rxjava3.core.q<AuthResult> d;
        q55 q55Var = q55.a;
        q55.e(this);
        boolean z = vkPhoneValidationCompleteResult instanceof VkPhoneValidationCompleteResult.Internal;
        Context context = this.b;
        VkAuthState vkAuthState = this.e;
        VkAuthMetaInfo vkAuthMetaInfo = this.c;
        if (z) {
            Serializer.c<VkAuthState> cVar = VkAuthState.CREATOR;
            VkPhoneValidationCompleteResult.Internal internal2 = (VkPhoneValidationCompleteResult.Internal) vkPhoneValidationCompleteResult;
            String str = internal2.c;
            String str2 = internal2.d;
            VkAuthState vkAuthState2 = new VkAuthState(null);
            vkAuthState2.d.put("grant_type", "phone_activation_sid");
            vkAuthState2.d.put(O6.e1, str);
            vkAuthState2.d.put("hash", str2);
            vkAuthState2.e.addAll(vkAuthState.e);
            d = l55.c(l55.a, context, vkAuthState2, vkAuthMetaInfo, 4);
        } else if (!(vkPhoneValidationCompleteResult instanceof VkPhoneValidationCompleteResult.Public) || (bVar = this.d) == null) {
            return;
        } else {
            d = l55.d(l55.a, context, vkAuthState, bnj0.c(bnj0.a, bVar.a, bVar.c, bVar.b, vkAuthMetaInfo.c), vkAuthMetaInfo);
        }
        this.f.invoke(d);
    }

    @Override // xsna.s25
    public final void v(VkPhoneValidationErrorReason vkPhoneValidationErrorReason) {
        q55 q55Var = q55.a;
        q55.e(this);
        a.b bVar = this.d;
        if (bVar == null || !(vkPhoneValidationErrorReason == VkPhoneValidationErrorReason.LATER || vkPhoneValidationErrorReason == VkPhoneValidationErrorReason.UNLINK)) {
            this.g.invoke();
            return;
        }
        VkCheckSilentTokenStep vkCheckSilentTokenStep = VkCheckSilentTokenStep.PHONE_VALIDATION;
        VkAuthState vkAuthState = this.e;
        vkAuthState.e.add(vkCheckSilentTokenStep);
        bnj0 bnj0Var = bnj0.a;
        String str = bVar.a;
        String str2 = bVar.c;
        int i = bVar.b;
        VkAuthMetaInfo vkAuthMetaInfo = this.c;
        this.f.invoke(l55.d(l55.a, this.b, vkAuthState, bnj0.c(bnj0Var, str, str2, i, vkAuthMetaInfo.c), vkAuthMetaInfo));
    }

    @Override // xsna.s25
    public final void A() {
    }

    @Override // xsna.s25
    public final void m() {
    }

    @Override // xsna.s25
    public final void o() {
    }

    @Override // xsna.s25
    public final void p() {
    }

    @Override // xsna.s25
    public final void t() {
    }

    @Override // xsna.s25
    public final void u() {
    }

    @Override // xsna.s25
    public final void b(String str) {
    }

    @Override // xsna.s25
    @ozl
    public final void l(jq0 jq0Var) {
    }

    @Override // xsna.s25
    public final void n(AuthResult authResult) {
    }

    @Override // xsna.s25
    public final void r(t6v0 t6v0Var) {
    }

    @Override // xsna.s25
    public final void j(long j, SignUpData signUpData) {
    }
}
