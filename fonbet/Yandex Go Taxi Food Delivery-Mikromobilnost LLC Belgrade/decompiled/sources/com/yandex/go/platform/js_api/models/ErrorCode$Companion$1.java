package com.yandex.go.platform.js_api.models;

import defpackage.sls;
import defpackage.vez0;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ErrorCode$Companion$1 extends Lambda implements sls {
    public static final ErrorCode$Companion$1 w = new ErrorCode$Companion$1(0);

    @Override // defpackage.sls
    public final Object invoke() {
        return vez0.g("com.yandex.go.platform.js_api.models.ErrorCode", ErrorCode.values(), new String[]{"PortalAuthErrorCode::ERROR_UNKNOWN", "PortalAuthErrorCode::ERROR_FAILED", "PortalAuthErrorCode::ERROR_CANCELED", "PortalAuthErrorCode::ERROR_INACTIVE", "PortalAuthErrorCode::ERROR_INCOGNITO", "PortalAuthErrorCode::ERROR_NO_DEFAULT_ACCOUNT", "PortalAuthErrorCode::ERROR_ACCOUNT_NOT_FOUND", "PortalAuthErrorCode::ERROR_ACCOUNT_NOT_AUTHORIZED", "PortalAuthErrorCode::ERROR_CREDENTIALS_NOT_FOUND", "PortalAuthErrorCode::ERROR_IO_ERROR", "PortalAuthErrorCode::ERROR_NUMBER_FORMAT", "PortalAuthErrorCode::ERROR_INVALID_OPTIONS"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null});
    }
}
