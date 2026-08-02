package com.yandex.go.payments.shared.business.accountcreation.corp;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/payments/shared/business/accountcreation/corp/CreateCorpAccountLimitExceededException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", ErrorResponseData.JSON_ERROR_MESSAGE, "Ljava/lang/String;", "getErrorMessage", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CreateCorpAccountLimitExceededException extends RuntimeException {
    private final String errorMessage;

    public CreateCorpAccountLimitExceededException(String str) {
        this.errorMessage = str;
    }
}
