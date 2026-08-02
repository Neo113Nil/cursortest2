package org.chromium.net.impl;

import android.net.http.HttpException;
import org.chromium.net.CronetException;

/* loaded from: classes8.dex */
class AndroidHttpExceptionWrapper extends CronetException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidHttpExceptionWrapper(HttpException httpException) {
        super(r0, httpException);
        String message;
        message = httpException.getMessage();
    }
}
