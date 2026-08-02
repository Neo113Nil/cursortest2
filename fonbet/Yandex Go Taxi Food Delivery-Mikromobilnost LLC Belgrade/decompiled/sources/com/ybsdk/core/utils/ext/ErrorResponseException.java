package com.ybsdk.core.utils.ext;

import defpackage.g8e;
import defpackage.mzz0;
import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/core/utils/ext/ErrorResponseException;", "Lmzz0;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "Lcom/ybsdk/core/utils/ext/ErrorResponse;", "errorResponse", "Lcom/ybsdk/core/utils/ext/ErrorResponse;", "a", "()Lcom/ybsdk/core/utils/ext/ErrorResponse;", "", "traceId", "Ljava/lang/String;", "getTraceId", "()Ljava/lang/String;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ErrorResponseException extends IllegalStateException implements mzz0 {
    private final ErrorResponse errorResponse;
    private final String traceId;

    public ErrorResponseException(ErrorResponse errorResponse, String str) {
        super(oyr.j(errorResponse.getCode(), "code=", errorResponse.getMessage().length() > 0 ? g8e.o(", message=", errorResponse.getMessage()) : ""));
        this.errorResponse = errorResponse;
        this.traceId = str;
    }

    /* renamed from: a, reason: from getter */
    public final ErrorResponse getErrorResponse() {
        return this.errorResponse;
    }

    @Override // defpackage.mzz0
    public final String getTraceId() {
        return this.traceId;
    }
}
