package com.google.android.gms.identitycredentials.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import defpackage.atx0;
import defpackage.ntx0;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/android/gms/identitycredentials/internal/InternalIdentityCredentialClient$registerCredentials$1$callback$1", "Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialBaseCallbacks;", "Lcom/google/android/gms/common/api/Status;", ACSPConstants.STATUS, "Lcom/google/android/gms/identitycredentials/RegistrationResponse;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "onRegisterCredentials", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/RegistrationResponse;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalIdentityCredentialClient$registerCredentials$1$callback$1 extends IdentityCredentialBaseCallbacks {
    final /* synthetic */ atx0 $completionSource;

    public InternalIdentityCredentialClient$registerCredentials$1$callback$1(atx0 atx0Var) {
        this.$completionSource = atx0Var;
    }

    @Override // com.google.android.gms.identitycredentials.internal.IdentityCredentialBaseCallbacks, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks.Stub, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onRegisterCredentials(Status status, RegistrationResponse result) {
        ntx0.a(status, result, this.$completionSource);
    }
}
