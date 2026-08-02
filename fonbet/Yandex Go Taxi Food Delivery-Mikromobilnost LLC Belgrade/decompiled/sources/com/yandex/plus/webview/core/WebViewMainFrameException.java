package com.yandex.plus.webview.core;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/yandex/plus/webview/core/WebViewMainFrameException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "url", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "", ErrorResponseData.JSON_ERROR_CODE, CA20Status.STATUS_USER_I, "getErrorCode", "()I", "homeless-core-webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewMainFrameException extends Exception {
    private final int errorCode;
    private final String url;

    public WebViewMainFrameException(String str, String str2, int i) {
        super(str);
        this.url = str2;
        this.errorCode = i;
    }
}
