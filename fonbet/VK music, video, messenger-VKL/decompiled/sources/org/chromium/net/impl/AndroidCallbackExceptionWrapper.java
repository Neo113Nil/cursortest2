package org.chromium.net.impl;

import org.chromium.net.CallbackException;

/* loaded from: classes8.dex */
class AndroidCallbackExceptionWrapper extends CallbackException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidCallbackExceptionWrapper(android.net.http.CallbackException callbackException) {
        super(r0, r2);
        String message;
        Throwable cause;
        message = callbackException.getMessage();
        cause = callbackException.getCause();
    }
}
