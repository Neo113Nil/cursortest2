package androidx.credentials.exceptions;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0005\b&\u0018\u00002\u00060\u0001j\u0002`\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "", ErrorResponseData.JSON_ERROR_MESSAGE, "Ljava/lang/CharSequence;", "getErrorMessage", "()Ljava/lang/CharSequence;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class CreateCredentialException extends Exception {
    private final CharSequence errorMessage;
    private final String type;

    public CreateCredentialException(CharSequence charSequence, String str) {
        super(charSequence != null ? charSequence.toString() : null);
        this.type = str;
        this.errorMessage = charSequence;
    }

    /* renamed from: a, reason: from getter */
    public String getType() {
        return this.type;
    }
}
