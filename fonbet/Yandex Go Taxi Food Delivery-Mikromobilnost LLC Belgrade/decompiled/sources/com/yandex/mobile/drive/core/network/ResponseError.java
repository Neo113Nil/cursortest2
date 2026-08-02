package com.yandex.mobile.drive.core.network;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/yandex/mobile/drive/core/network/ResponseError;", "", "<init>", "()V", "details", "Lcom/yandex/mobile/drive/core/network/ResponseError$Details;", "getDetails$annotations", "getDetails", "()Lcom/yandex/mobile/drive/core/network/ResponseError$Details;", "setDetails", "(Lcom/yandex/mobile/drive/core/network/ResponseError$Details;)V", "Details", "Info", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ResponseError {
    private Details details;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR&\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/yandex/mobile/drive/core/network/ResponseError$Details;", "", "<init>", "()V", "uiTitle", "", "getUiTitle$annotations", "getUiTitle", "()Ljava/lang/String;", "setUiTitle", "(Ljava/lang/String;)V", "uiMessage", "getUiMessage$annotations", "getUiMessage", "setUiMessage", "specialInfo", "Lcom/yandex/mobile/drive/core/network/ResponseError$Info;", "getSpecialInfo$annotations", "getSpecialInfo", "()Lcom/yandex/mobile/drive/core/network/ResponseError$Info;", "setSpecialInfo", "(Lcom/yandex/mobile/drive/core/network/ResponseError$Info;)V", "debugMessage", "getDebugMessage$annotations", "getDebugMessage", "setDebugMessage", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Details {
        private String debugMessage;
        private Info specialInfo;
        private String uiMessage;
        private String uiTitle;

        @Json(name = "debug_message")
        public static /* synthetic */ void getDebugMessage$annotations() {
        }

        @Json(name = "special_info")
        public static /* synthetic */ void getSpecialInfo$annotations() {
        }

        @Json(name = "ui_message")
        public static /* synthetic */ void getUiMessage$annotations() {
        }

        @Json(name = "ui_title")
        public static /* synthetic */ void getUiTitle$annotations() {
        }

        public final String getDebugMessage() {
            return this.debugMessage;
        }

        public final Info getSpecialInfo() {
            return this.specialInfo;
        }

        public final String getUiMessage() {
            return this.uiMessage;
        }

        public final String getUiTitle() {
            return this.uiTitle;
        }

        public final void setDebugMessage(String str) {
            this.debugMessage = str;
        }

        public final void setSpecialInfo(Info info) {
            this.specialInfo = info;
        }

        public final void setUiMessage(String str) {
            this.uiMessage = str;
        }

        public final void setUiTitle(String str) {
            this.uiTitle = str;
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0012\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/yandex/mobile/drive/core/network/ResponseError$Info;", "", "<init>", "()V", ErrorResponseData.JSON_ERROR_CODE, "", "getErrorCode$annotations", "getErrorCode", "()Ljava/lang/String;", "setErrorCode", "(Ljava/lang/String;)V", "mayRetryWithForce", "", "getMayRetryWithForce$annotations", "getMayRetryWithForce", "()Ljava/lang/Boolean;", "setMayRetryWithForce", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "car", "Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Car;", "getCar$annotations", "getCar", "()Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Car;", "setCar", "(Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Car;)V", "model", "Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Model;", "getModel$annotations", "getModel", "()Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Model;", "setModel", "(Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Model;)V", "Car", "Model", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Info {
        private Car car;
        private String errorCode;
        private Boolean mayRetryWithForce;
        private Model model;

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Car;", "", "<init>", "()V", "number", "", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Car {
            public String number;
        }

        @JsonClass(generateAdapter = true)
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/mobile/drive/core/network/ResponseError$Info$Model;", "", "<init>", "()V", "name", "", "getName$annotations", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "drive_native_features_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Model {
            private String name;

            @Json
            public static /* synthetic */ void getName$annotations() {
            }

            public final String getName() {
                return this.name;
            }

            public final void setName(String str) {
                this.name = str;
            }
        }

        @Json
        public static /* synthetic */ void getCar$annotations() {
        }

        @Json(name = "error_code")
        public static /* synthetic */ void getErrorCode$annotations() {
        }

        @Json(name = "may_retry_with_force")
        public static /* synthetic */ void getMayRetryWithForce$annotations() {
        }

        @Json
        public static /* synthetic */ void getModel$annotations() {
        }

        public final Car getCar() {
            return this.car;
        }

        public final String getErrorCode() {
            return this.errorCode;
        }

        public final Boolean getMayRetryWithForce() {
            return this.mayRetryWithForce;
        }

        public final Model getModel() {
            return this.model;
        }

        public final void setCar(Car car) {
            this.car = car;
        }

        public final void setErrorCode(String str) {
            this.errorCode = str;
        }

        public final void setMayRetryWithForce(Boolean bool) {
            this.mayRetryWithForce = bool;
        }

        public final void setModel(Model model) {
            this.model = model;
        }
    }

    @Json(name = "error_details")
    public static /* synthetic */ void getDetails$annotations() {
    }

    public final Details getDetails() {
        return this.details;
    }

    public final void setDetails(Details details) {
        this.details = details;
    }
}
