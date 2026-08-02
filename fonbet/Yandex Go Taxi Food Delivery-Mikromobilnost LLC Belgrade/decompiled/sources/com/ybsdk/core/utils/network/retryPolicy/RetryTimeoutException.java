package com.ybsdk.core.utils.network.retryPolicy;

import com.ybsdk.core.utils.ext.ErrorResponseException;
import defpackage.mzz0;
import java.io.IOException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0004\u0004\u0005\u0006\u0007\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lmzz0;", "Network", "ServiceUnresponsive", "Unknown", "com/ybsdk/core/utils/network/retryPolicy/d", "Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException$Network;", "Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException$ServiceUnresponsive;", "Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException$Unknown;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class RetryTimeoutException extends Exception implements mzz0 {
    public static final /* synthetic */ int a = 0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException$Network;", "Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException;", "Ljava/io/IOException;", "lastException", "Ljava/io/IOException;", "getLastException", "()Ljava/io/IOException;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Network extends RetryTimeoutException {
        private final IOException lastException;

        public Network(String str, IOException iOException) {
            super(str);
            this.lastException = iOException;
        }

        @Override // com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException
        /* renamed from: a */
        public final Throwable getLastException() {
            return this.lastException;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException$ServiceUnresponsive;", "Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException;", "Lcom/ybsdk/core/utils/ext/ErrorResponseException;", "lastException", "Lcom/ybsdk/core/utils/ext/ErrorResponseException;", "b", "()Lcom/ybsdk/core/utils/ext/ErrorResponseException;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServiceUnresponsive extends RetryTimeoutException {
        private final ErrorResponseException lastException;

        public ServiceUnresponsive(ErrorResponseException errorResponseException) {
            super("retry policy finished with timeout with Service unresponsive exception");
            this.lastException = errorResponseException;
        }

        @Override // com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException
        /* renamed from: a */
        public final Throwable getLastException() {
            return this.lastException;
        }

        /* renamed from: b, reason: from getter */
        public final ErrorResponseException getLastException() {
            return this.lastException;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException$Unknown;", "Lcom/ybsdk/core/utils/network/retryPolicy/RetryTimeoutException;", "", "lastException", "Ljava/lang/Throwable;", "a", "()Ljava/lang/Throwable;", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Unknown extends RetryTimeoutException {
        private final Throwable lastException;

        public Unknown(Throwable th) {
            super("retry policy finished with timeout with Unknown exception");
            this.lastException = th;
        }

        @Override // com.ybsdk.core.utils.network.retryPolicy.RetryTimeoutException
        /* renamed from: a, reason: from getter */
        public final Throwable getLastException() {
            return this.lastException;
        }
    }

    /* renamed from: a */
    public abstract Throwable getLastException();

    @Override // defpackage.mzz0
    public final String getTraceId() {
        Object lastException = getLastException();
        mzz0 mzz0Var = lastException instanceof mzz0 ? (mzz0) lastException : null;
        if (mzz0Var != null) {
            return mzz0Var.getTraceId();
        }
        return null;
    }
}
