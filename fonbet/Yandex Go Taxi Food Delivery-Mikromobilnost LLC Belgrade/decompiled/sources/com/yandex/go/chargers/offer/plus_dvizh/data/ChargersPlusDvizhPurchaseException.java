package com.yandex.go.chargers.offer.plus_dvizh.data;

import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/offer/plus_dvizh/data/ChargersPlusDvizhPurchaseException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "ChargersPlusDvizhPurchaseStartFailedException", "ChargersPlusDvizhPurchaseStatusFailedException", "Lcom/yandex/go/chargers/offer/plus_dvizh/data/ChargersPlusDvizhPurchaseException$ChargersPlusDvizhPurchaseStartFailedException;", "Lcom/yandex/go/chargers/offer/plus_dvizh/data/ChargersPlusDvizhPurchaseException$ChargersPlusDvizhPurchaseStatusFailedException;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class ChargersPlusDvizhPurchaseException extends RuntimeException {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/offer/plus_dvizh/data/ChargersPlusDvizhPurchaseException$ChargersPlusDvizhPurchaseStartFailedException;", "Lcom/yandex/go/chargers/offer/plus_dvizh/data/ChargersPlusDvizhPurchaseException;", "", ErrorResponseData.JSON_ERROR_CODE, "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ChargersPlusDvizhPurchaseStartFailedException extends ChargersPlusDvizhPurchaseException {
        private final String errorCode;

        public ChargersPlusDvizhPurchaseStartFailedException(String str) {
            this.errorCode = str;
        }

        public ChargersPlusDvizhPurchaseStartFailedException() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/chargers/offer/plus_dvizh/data/ChargersPlusDvizhPurchaseException$ChargersPlusDvizhPurchaseStatusFailedException;", "Lcom/yandex/go/chargers/offer/plus_dvizh/data/ChargersPlusDvizhPurchaseException;", "", ErrorResponseData.JSON_ERROR_CODE, "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class ChargersPlusDvizhPurchaseStatusFailedException extends ChargersPlusDvizhPurchaseException {
        private final String errorCode;

        public ChargersPlusDvizhPurchaseStatusFailedException(String str) {
            this.errorCode = str;
        }

        public ChargersPlusDvizhPurchaseStatusFailedException() {
            this(null);
        }
    }
}
