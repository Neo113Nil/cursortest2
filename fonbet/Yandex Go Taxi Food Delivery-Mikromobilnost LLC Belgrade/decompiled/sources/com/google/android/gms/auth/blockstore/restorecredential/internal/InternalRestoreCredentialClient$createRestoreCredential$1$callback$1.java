package com.google.android.gms.auth.blockstore.restorecredential.internal;

import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialResponse;
import com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/google/android/gms/auth/blockstore/restorecredential/internal/InternalRestoreCredentialClient$createRestoreCredential$1$callback$1", "Lcom/google/android/gms/auth/blockstore/restorecredential/internal/ICreateRestoreCredentialCallback$Stub;", "Lcom/google/android/gms/common/api/Status;", ACSPConstants.STATUS, "Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;", "response", "Lzy11;", "onCreateRestoreCredential", "(Lcom/google/android/gms/common/api/Status;Lcom/google/android/gms/auth/blockstore/restorecredential/CreateRestoreCredentialResponse;)V", "java.com.google.android.gmscore.integ.client.auth_blockstore_client_auth_blockstore"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class InternalRestoreCredentialClient$createRestoreCredential$1$callback$1 extends ICreateRestoreCredentialCallback.Stub {
    final /* synthetic */ atx0 $completionSource;

    public InternalRestoreCredentialClient$createRestoreCredential$1$callback$1(atx0 atx0Var) {
        this.$completionSource = atx0Var;
    }

    @Override // com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback.Stub, com.google.android.gms.auth.blockstore.restorecredential.internal.ICreateRestoreCredentialCallback
    public void onCreateRestoreCredential(Status status, CreateRestoreCredentialResponse response) {
        ntx0.a(status, response, this.$completionSource);
    }
}
