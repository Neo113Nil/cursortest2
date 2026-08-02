package androidx.credentials.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialCancellationException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CreateCredentialCancellationException extends CreateCredentialException {
    public CreateCredentialCancellationException(String str) {
        super(str, "android.credentials.CreateCredentialException.TYPE_USER_CANCELED");
    }

    public CreateCredentialCancellationException() {
        this(null);
    }
}
