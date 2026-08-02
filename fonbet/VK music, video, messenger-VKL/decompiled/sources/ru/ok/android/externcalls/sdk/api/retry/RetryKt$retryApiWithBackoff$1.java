package ru.ok.android.externcalls.sdk.api.retry;

import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.izs;

/* compiled from: retry.kt */
/* loaded from: classes9.dex */
public final /* synthetic */ class RetryKt$retryApiWithBackoff$1 extends FunctionReferenceImpl implements izs<Throwable, Boolean> {
    public static final RetryKt$retryApiWithBackoff$1 INSTANCE = new RetryKt$retryApiWithBackoff$1();

    public RetryKt$retryApiWithBackoff$1() {
        super(1, RetryKt.class, "retryApiExceptionFilter", "retryApiExceptionFilter(Ljava/lang/Throwable;)Z", 1);
    }

    @Override // xsna.izs
    public final Boolean invoke(Throwable th) {
        boolean retryApiExceptionFilter;
        retryApiExceptionFilter = RetryKt.retryApiExceptionFilter(th);
        return Boolean.valueOf(retryApiExceptionFilter);
    }
}
