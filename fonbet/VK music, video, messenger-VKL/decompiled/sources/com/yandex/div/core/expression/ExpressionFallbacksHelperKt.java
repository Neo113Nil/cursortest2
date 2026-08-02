package com.yandex.div.core.expression;

import com.yandex.div.json.ParsingException;
import com.yandex.div.json.ParsingExceptionReason;

/* compiled from: ExpressionFallbacksHelper.kt */
/* loaded from: classes7.dex */
public final class ExpressionFallbacksHelperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isExpressionResolveFail(ParsingException parsingException) {
        return parsingException.getReason() == ParsingExceptionReason.MISSING_VARIABLE || parsingException.getReason() == ParsingExceptionReason.INVALID_VALUE || parsingException.getReason() == ParsingExceptionReason.TYPE_MISMATCH;
    }
}
