package ru.ok.android.api.http;

import ru.ok.android.api.core.ApiException;
import xsna.lhg;

/* compiled from: HttpStatusApiException.kt */
/* loaded from: classes9.dex */
public final class HttpStatusApiException extends ApiException {
    private final int statusCode;

    public HttpStatusApiException(int i) {
        super(lhg.a(i, "HTTP "));
        this.statusCode = i;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public HttpStatusApiException(String str, int i, String str2) {
        super(str + " " + i + " " + str2);
        this.statusCode = i;
    }

    public static /* synthetic */ void getStatusCode$annotations() {
    }
}
