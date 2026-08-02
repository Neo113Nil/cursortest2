package com.yandex.go.scooters.passes.exception;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "ScootersPassPurchaseFailedException", "ScootersPassActionFailedException", "ScootersPassActionFailedStatusException", "ScootersPassAlreadyInPurchasingStateException", "Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException$ScootersPassActionFailedException;", "Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException$ScootersPassActionFailedStatusException;", "Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException$ScootersPassAlreadyInPurchasingStateException;", "Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException$ScootersPassPurchaseFailedException;", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ScootersPassActionException extends RuntimeException {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException$ScootersPassAlreadyInPurchasingStateException;", "Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException;", "", "operationId", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ScootersPassAlreadyInPurchasingStateException extends ScootersPassActionException {
        private final String operationId;

        public ScootersPassAlreadyInPurchasingStateException(String str) {
            this.operationId = str;
        }

        /* renamed from: a, reason: from getter */
        public final String getOperationId() {
            return this.operationId;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException$ScootersPassActionFailedException;", "Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException;", "", "title", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "subtitle", "b", ErrorResponseData.JSON_ERROR_CODE, "a", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ScootersPassActionFailedException extends ScootersPassActionException {
        private final String errorCode;
        private final String subtitle;
        private final String title;

        public ScootersPassActionFailedException(String str, String str2, String str3) {
            this.title = str;
            this.subtitle = str2;
            this.errorCode = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public ScootersPassActionFailedException() {
            this(null, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException$ScootersPassActionFailedStatusException;", "Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException;", "", "title", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "subtitle", "b", ErrorResponseData.JSON_ERROR_CODE, "a", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ScootersPassActionFailedStatusException extends ScootersPassActionException {
        private final String errorCode;
        private final String subtitle;
        private final String title;

        public ScootersPassActionFailedStatusException(String str, String str2, String str3) {
            this.title = str;
            this.subtitle = str2;
            this.errorCode = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public ScootersPassActionFailedStatusException() {
            this(null, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException$ScootersPassPurchaseFailedException;", "Lcom/yandex/go/scooters/passes/exception/ScootersPassActionException;", "", "title", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "subtitle", "b", ErrorResponseData.JSON_ERROR_CODE, "a", "go-client-android.features.scooters.passes:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ScootersPassPurchaseFailedException extends ScootersPassActionException {
        private final String errorCode;
        private final String subtitle;
        private final String title;

        public ScootersPassPurchaseFailedException(String str, String str2, String str3) {
            this.title = str;
            this.subtitle = str2;
            this.errorCode = str3;
        }

        /* renamed from: a, reason: from getter */
        public final String getErrorCode() {
            return this.errorCode;
        }

        /* renamed from: b, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public ScootersPassPurchaseFailedException() {
            this(null, null, null);
        }
    }
}
