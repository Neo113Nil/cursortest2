package io.jsonwebtoken;

import io.jsonwebtoken.security.SecurityException;

@Deprecated
/* loaded from: classes8.dex */
public class SignatureException extends SecurityException {
    public SignatureException(String str) {
        super(str);
    }

    public SignatureException(String str, Throwable th) {
        super(str, th);
    }
}
