package androidx.credentials;

import android.credentials.ClearCredentialStateException;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import defpackage.c9f;
import defpackage.o9f;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$onClearCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Ljava/lang/Void;", "Landroid/credentials/ClearCredentialStateException;", "response", "Lzy11;", "onResult", "(Ljava/lang/Void;)V", "error", "onError", "(Landroid/credentials/ClearCredentialStateException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CredentialProviderFrameworkImpl$onClearCredential$outcome$1 implements OutcomeReceiver {
    final /* synthetic */ c9f $callback;

    public CredentialProviderFrameworkImpl$onClearCredential$outcome$1(c9f c9fVar) {
        this.$callback = c9fVar;
    }

    public void onError(ClearCredentialStateException error) {
        Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
        this.$callback.c(new ClearCredentialUnknownException(null));
    }

    public void onResult(Void response) {
        Log.i("CredManProvService", "Clear result returned from framework: ");
        this.$callback.onResult(response);
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        onError(o9f.b(th));
    }
}
