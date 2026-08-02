package xsna;

import com.vk.auth.api.models.AuthResult;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;

/* compiled from: JsVkOverridenAuthBridge.kt */
/* loaded from: classes6.dex */
public final class i7y extends r6y {
    public final izs<w25, w25> d0;
    public final izs<VkAuthCredentials, VkAuthCredentials> e0;
    public final izs<Boolean, Boolean> f0;

    public /* synthetic */ i7y(wwv0 wwv0Var, izs izsVar) {
        this(wwv0Var, izsVar, new dam(13), new kdw(1));
    }

    @Override // xsna.v1y
    public final w25 D() {
        return this.d0.invoke(super.D());
    }

    @Override // xsna.v1y
    public final VkAuthCredentials E() {
        return this.e0.invoke(null);
    }

    @Override // xsna.x6y
    public final void N(AuthResult authResult, boolean z) {
        super.N(authResult, this.f0.invoke(Boolean.valueOf(z)).booleanValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i7y(fvv0 fvv0Var, izs<? super w25, w25> izsVar, izs<? super VkAuthCredentials, VkAuthCredentials> izsVar2, izs<? super Boolean, Boolean> izsVar3) {
        super(fvv0Var);
        this.d0 = izsVar;
        this.e0 = izsVar2;
        this.f0 = izsVar3;
    }
}
