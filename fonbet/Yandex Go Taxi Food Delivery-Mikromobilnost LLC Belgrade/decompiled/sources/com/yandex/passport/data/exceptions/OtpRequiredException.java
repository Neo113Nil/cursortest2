package com.yandex.passport.data.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/passport/data/exceptions/OtpRequiredException;", "Lcom/yandex/passport/data/exceptions/TokenResponseException;", "", "trackId", "Ljava/lang/String;", "getTrackId", "()Ljava/lang/String;", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class OtpRequiredException extends TokenResponseException {
    private final String trackId;

    public OtpRequiredException(String str, String str2) {
        super(str, null);
        this.trackId = str2;
    }
}
