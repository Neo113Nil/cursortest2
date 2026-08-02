package androidx.credentials;

import android.credentials.Credential;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialResponse;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import defpackage.ltb1;
import defpackage.s5t;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/GetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "Lzy11;", "onResult", "(Landroid/credentials/GetCredentialResponse;)V", "error", "onError", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1 implements OutcomeReceiver {
    final /* synthetic */ tls $callback;

    public Api35Impl$setPendingGetCredentialRequest$frameworkCallback$1(tls tlsVar) {
        this.$callback = tlsVar;
    }

    public void onResult(GetCredentialResponse response) {
        Credential credential;
        String type;
        Bundle data;
        tls tlsVar = this.$callback;
        credential = response.getCredential();
        type = credential.getType();
        data = credential.getData();
        tlsVar.invoke(new s5t(ltb1.a(data, type)));
    }

    public void onError(GetCredentialException error) {
        error.getType();
    }
}
