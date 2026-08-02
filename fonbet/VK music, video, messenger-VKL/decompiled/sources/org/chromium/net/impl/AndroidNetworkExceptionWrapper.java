package org.chromium.net.impl;

import org.chromium.net.NetworkException;
import xsna.g91;

/* loaded from: classes8.dex */
class AndroidNetworkExceptionWrapper extends NetworkException {
    private final android.net.http.NetworkException mBackend;

    public AndroidNetworkExceptionWrapper(android.net.http.NetworkException networkException) {
        this(networkException, false);
    }

    @Override // org.chromium.net.NetworkException
    public int getCronetInternalErrorCode() {
        return -1;
    }

    @Override // org.chromium.net.NetworkException
    public int getErrorCode() {
        int errorCode;
        errorCode = this.mBackend.getErrorCode();
        return errorCode;
    }

    @Override // org.chromium.net.NetworkException
    public boolean immediatelyRetryable() {
        boolean isImmediatelyRetryable;
        isImmediatelyRetryable = this.mBackend.isImmediatelyRetryable();
        return isImmediatelyRetryable;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidNetworkExceptionWrapper(android.net.http.NetworkException networkException, boolean z) {
        super(r0, networkException);
        String message;
        message = networkException.getMessage();
        this.mBackend = networkException;
        if (!z && g91.l(networkException)) {
            throw new IllegalArgumentException("Translating QuicException as NetworkException results in loss of information. Make sure you handle QuicException first. See the stacktrace for where the translation is being performed, and the cause for the exception being translated.", networkException);
        }
    }
}
