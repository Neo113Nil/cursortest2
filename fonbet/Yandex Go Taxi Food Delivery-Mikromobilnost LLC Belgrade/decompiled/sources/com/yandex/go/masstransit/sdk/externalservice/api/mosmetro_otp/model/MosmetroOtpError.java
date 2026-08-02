package com.yandex.go.masstransit.sdk.externalservice.api.mosmetro_otp.model;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "InvalidOtpProvided", "PhoneIdRequired", "UnknownBackendError", "Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError$InvalidOtpProvided;", "Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError$PhoneIdRequired;", "Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError$UnknownBackendError;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class MosmetroOtpError extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError$InvalidOtpProvided;", "Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class InvalidOtpProvided extends MosmetroOtpError {
        public static final InvalidOtpProvided a = new InvalidOtpProvided("Invalid one-time password provided");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof InvalidOtpProvided);
        }

        public final int hashCode() {
            return -878374670;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "InvalidOtpProvided";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError$PhoneIdRequired;", "Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError;", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class PhoneIdRequired extends MosmetroOtpError {
        public static final PhoneIdRequired a = new PhoneIdRequired("phone_id is missing from authorization context");

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof PhoneIdRequired);
        }

        public final int hashCode() {
            return -104542579;
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "PhoneIdRequired";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError$UnknownBackendError;", "Lcom/yandex/go/masstransit/sdk/externalservice/api/mosmetro_otp/model/MosmetroOtpError;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", ErrorResponseData.JSON_ERROR_MESSAGE, "getErrorMessage", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class UnknownBackendError extends MosmetroOtpError {
        private final String code;
        private final String errorMessage;

        public UnknownBackendError(String str, String str2) {
            super(str2 == null ? str : str2);
            this.code = str;
            this.errorMessage = str2;
        }

        public UnknownBackendError() {
            this(null, null);
        }
    }
}
