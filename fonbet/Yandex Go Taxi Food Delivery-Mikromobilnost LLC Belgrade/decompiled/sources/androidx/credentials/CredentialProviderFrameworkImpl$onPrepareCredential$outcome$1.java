package androidx.credentials;

import android.credentials.GetCredentialException;
import android.credentials.PrepareGetCredentialResponse;
import android.os.OutcomeReceiver;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialCustomException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialDomException;
import androidx.credentials.exceptions.publickeycredential.GetPublicKeyCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import defpackage.c9f;
import defpackage.cvu0;
import defpackage.exa1;
import defpackage.o9f;
import defpackage.q6c0;
import defpackage.qte0;
import defpackage.rte0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/credentials/CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1", "Landroid/os/OutcomeReceiver;", "Landroid/credentials/PrepareGetCredentialResponse;", "Landroid/credentials/GetCredentialException;", "response", "Lzy11;", "onResult", "(Landroid/credentials/PrepareGetCredentialResponse;)V", "error", "onError", "(Landroid/credentials/GetCredentialException;)V", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1 implements OutcomeReceiver {
    final /* synthetic */ c9f $callback;
    final /* synthetic */ b this$0;

    public CredentialProviderFrameworkImpl$onPrepareCredential$outcome$1(c9f c9fVar, b bVar) {
        this.$callback = c9fVar;
        this.this$0 = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onError(GetCredentialException error) {
        String type;
        String message;
        GetCredentialCustomException getCredentialCustomException;
        Object obj;
        c9f c9fVar = this.$callback;
        this.this$0.getClass();
        type = error.getType();
        message = error.getMessage();
        switch (type.hashCode()) {
            case -781118336:
                if (type.equals("android.credentials.GetCredentialException.TYPE_UNKNOWN")) {
                    obj = new GetCredentialUnknownException(message);
                    c9fVar.c(obj);
                    return;
                }
                if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                    int i = GetPublicKeyCredentialException.a;
                    String obj2 = message != null ? message.toString() : null;
                    try {
                    } catch (FrameworkClassParsingException unused) {
                        getCredentialCustomException = new GetCredentialCustomException(obj2, type);
                    }
                    if (!cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                        throw new FrameworkClassParsingException();
                    }
                    int i2 = GetPublicKeyCredentialDomException.b;
                    obj = exa1.c(type, obj2);
                    c9fVar.c(obj);
                    return;
                }
                getCredentialCustomException = new GetCredentialCustomException(message, type);
                obj = getCredentialCustomException;
                c9fVar.c(obj);
                return;
            case -408155724:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_UNSUPPORTED_EXCEPTION")) {
                    obj = new GetCredentialUnsupportedException(message);
                    c9fVar.c(obj);
                    return;
                }
                if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = getCredentialCustomException;
                c9fVar.c(obj);
                return;
            case -45448328:
                if (type.equals("android.credentials.GetCredentialException.TYPE_INTERRUPTED")) {
                    obj = new GetCredentialInterruptedException(message);
                    c9fVar.c(obj);
                    return;
                }
                if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = getCredentialCustomException;
                c9fVar.c(obj);
                return;
            case 580557411:
                if (type.equals("android.credentials.GetCredentialException.TYPE_USER_CANCELED")) {
                    obj = new GetCredentialCancellationException(message);
                    c9fVar.c(obj);
                    return;
                }
                if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = getCredentialCustomException;
                c9fVar.c(obj);
                return;
            case 627896683:
                if (type.equals("android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL")) {
                    obj = new NoCredentialException(message);
                    c9fVar.c(obj);
                    return;
                }
                if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = getCredentialCustomException;
                c9fVar.c(obj);
                return;
            case 1594095913:
                if (type.equals("androidx.credentials.TYPE_GET_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION")) {
                    obj = new GetCredentialProviderConfigurationException(message);
                    c9fVar.c(obj);
                    return;
                }
                if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = getCredentialCustomException;
                c9fVar.c(obj);
                return;
            default:
                if (cvu0.x(type, "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false)) {
                }
                obj = getCredentialCustomException;
                c9fVar.c(obj);
                return;
        }
    }

    public void onResult(PrepareGetCredentialResponse response) {
        c9f c9fVar = this.$callback;
        this.this$0.getClass();
        response.getPendingGetCredentialHandle();
        rte0 rte0Var = new rte0();
        qte0 qte0Var = new qte0();
        qte0Var.d = response;
        qte0Var.c = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$1(1, qte0Var, qte0.class, "hasCredentialType", "hasCredentialType(Ljava/lang/String;)Z", 0);
        qte0Var.b = new PrepareGetCredentialResponse$Builder$setFrameworkResponse$2(0, qte0Var, qte0.class, "hasAuthenticationResults", "hasAuthenticationResults()Z", 0);
        c9fVar.onResult(new q6c0(rte0Var, new PrepareGetCredentialResponse$Builder$setFrameworkResponse$3(0, qte0Var, qte0.class, "hasRemoteResults", "hasRemoteResults()Z", 0), qte0Var.b, qte0Var.c));
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        onResult(o9f.m(obj));
    }

    public /* bridge */ /* synthetic */ void onError(Throwable th) {
        onError(o9f.j(th));
    }
}
