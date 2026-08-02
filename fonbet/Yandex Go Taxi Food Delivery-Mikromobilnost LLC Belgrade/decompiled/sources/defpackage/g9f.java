package defpackage;

import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.NoCredentialException;

/* loaded from: classes10.dex */
public final class g9f {
    public static CreateCredentialException a(String str, String str2) {
        return jl40.l(str, "CREATE_CANCELED") ? new CreateCredentialCancellationException(str2) : jl40.l(str, "CREATE_INTERRUPTED") ? new CreateCredentialInterruptedException(str2) : new CreateCredentialUnknownException(str2);
    }

    public static GetCredentialException b(String str, String str2) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1567968963) {
                if (hashCode != -154594663) {
                    if (hashCode == 1996705159 && str.equals("GET_NO_CREDENTIALS")) {
                        return new NoCredentialException(str2);
                    }
                } else if (str.equals("GET_INTERRUPTED")) {
                    return new GetCredentialInterruptedException(str2);
                }
            } else if (str.equals("GET_CANCELED_TAG")) {
                return new GetCredentialCancellationException(str2);
            }
        }
        return new GetCredentialUnknownException(str2);
    }
}
