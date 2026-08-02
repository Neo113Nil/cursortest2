package com.google.android.gms.common.api;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class ApiException extends Exception {

    @Deprecated
    protected final Status mStatus;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApiException(Status status) {
        super(r4.toString());
        int statusCode = status.getStatusCode();
        String statusMessage = status.getStatusMessage() != null ? status.getStatusMessage() : "";
        StringBuilder sb = new StringBuilder(String.valueOf(statusCode).length() + 2 + String.valueOf(statusMessage).length());
        sb.append(statusCode);
        sb.append(Extension.COLON_SPACE);
        sb.append(statusMessage);
        this.mStatus = status;
    }

    public final Status a() {
        return this.mStatus;
    }

    public final int b() {
        return this.mStatus.getStatusCode();
    }
}
