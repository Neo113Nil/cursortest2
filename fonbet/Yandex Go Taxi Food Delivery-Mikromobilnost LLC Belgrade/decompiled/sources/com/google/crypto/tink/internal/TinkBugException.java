package com.google.crypto.tink.internal;

import java.security.GeneralSecurityException;

/* loaded from: classes4.dex */
public final class TinkBugException extends RuntimeException {
    public TinkBugException(String str) {
        super(str);
    }

    public TinkBugException(String str, GeneralSecurityException generalSecurityException) {
        super(str, generalSecurityException);
    }
}
