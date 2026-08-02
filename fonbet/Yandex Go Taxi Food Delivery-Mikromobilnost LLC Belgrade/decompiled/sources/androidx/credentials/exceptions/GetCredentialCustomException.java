package androidx.credentials.exceptions;

import defpackage.ny61;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/credentials/exceptions/GetCredentialCustomException;", "Landroidx/credentials/exceptions/GetCredentialException;", "", "type", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class GetCredentialCustomException extends GetCredentialException {
    private final String type;

    public GetCredentialCustomException(CharSequence charSequence, String str) {
        super(charSequence, str);
        this.type = str;
        if (str.length() > 0) {
            return;
        }
        ny61.g("type must not be empty");
        throw null;
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    /* renamed from: a, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
