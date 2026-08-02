package com.yandex.fintechsdk.core.network.api.exception;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.b64;
import defpackage.unr0;
import java.io.IOException;
import kotlin.Metadata;
import kotlinx.serialization.json.c;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException;", "Ljava/io/IOException;", "BadCodeException", "EmptyBodyException", "OkHttpCommonException", "Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException$BadCodeException;", "Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException$EmptyBodyException;", "Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException$OkHttpCommonException;", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class NetworkException extends IOException {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException$BadCodeException;", "Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, CA20Status.STATUS_USER_I, "b", "()I", "Lkotlinx/serialization/json/c;", "body", "Lkotlinx/serialization/json/c;", "a", "()Lkotlinx/serialization/json/c;", "retryAttempt", "getRetryAttempt", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BadCodeException extends NetworkException {
        private final c body;
        private final int code;
        private final int retryAttempt;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BadCodeException(String str, String str2, int i, c cVar, int i2) {
            super(r4.toString());
            StringBuilder v = unr0.v(i, "Server responded with code ", " for requestName: ", str, ", requestId: ");
            v.append(str2);
            v.append(", retryAttempt: ");
            v.append(i2);
            this.code = i;
            this.body = cVar;
            this.retryAttempt = i2;
        }

        /* renamed from: a, reason: from getter */
        public final c getBody() {
            return this.body;
        }

        /* renamed from: b, reason: from getter */
        public final int getCode() {
            return this.code;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException$EmptyBodyException;", "Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException;", "", "retryAttempt", CA20Status.STATUS_USER_I, "getRetryAttempt", "()I", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmptyBodyException extends NetworkException {
        private final int retryAttempt;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public EmptyBodyException(String str, String str2, int i) {
            super(r4.toString());
            StringBuilder v = b64.v("Empty response body for requestName: ", str, ", requestId: ", str2, ", retryAttempt: ");
            v.append(i);
            this.retryAttempt = i;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException$OkHttpCommonException;", "Lcom/yandex/fintechsdk/core/network/api/exception/NetworkException;", "", "retryAttempt", CA20Status.STATUS_USER_I, "getRetryAttempt", "()I", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OkHttpCommonException extends NetworkException {
        private final int retryAttempt;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public OkHttpCommonException(String str, String str2) {
            super(r4.toString());
            StringBuilder v = b64.v("Request ", str, " could not be executed due to the exception in okHttp flow, message: ", str2, ", retryAttempt: ");
            v.append(0);
            this.retryAttempt = 0;
        }
    }
}
