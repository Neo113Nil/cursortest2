package com.google.android.gms.identitycredentials.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;
import com.google.android.gms.identitycredentials.PendingImportCredentialsHandle;
import com.google.android.gms.identitycredentials.RegisterExportResponse;
import com.google.android.gms.identitycredentials.RegistrationResponse;
import com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/google/android/gms/identitycredentials/internal/IdentityCredentialBaseCallbacks;", "Lcom/google/android/gms/identitycredentials/internal/IIdentityCredentialCallbacks$Stub;", "<init>", "()V", "Lcom/google/android/gms/common/api/Status;", ACSPConstants.STATUS, "Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "onClearRegistry", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/ClearRegistryResponse;)V", "Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;", "onGetCredential", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/PendingGetCredentialHandle;)V", "Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;", "onImportCredentials", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/PendingImportCredentialsHandle;)V", "Lcom/google/android/gms/identitycredentials/RegistrationResponse;", "onRegisterCredentials", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/RegistrationResponse;)V", "Lcom/google/android/gms/identitycredentials/RegisterExportResponse;", "onRegisterExport", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/identitycredentials/RegisterExportResponse;)V", "java.com.google.android.gmscore.integ.client.identity_credentials_identity_credentials"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class IdentityCredentialBaseCallbacks extends IIdentityCredentialCallbacks.Stub {
    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks.Stub, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onClearRegistry(Status status, ClearRegistryResponse result) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks.Stub, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onGetCredential(Status status, PendingGetCredentialHandle result) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks.Stub, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onImportCredentials(Status status, PendingImportCredentialsHandle result) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks.Stub, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onRegisterCredentials(Status status, RegistrationResponse result) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks.Stub, com.google.android.gms.identitycredentials.internal.IIdentityCredentialCallbacks
    public void onRegisterExport(Status status, RegisterExportResponse result) {
        throw new UnsupportedOperationException();
    }
}
