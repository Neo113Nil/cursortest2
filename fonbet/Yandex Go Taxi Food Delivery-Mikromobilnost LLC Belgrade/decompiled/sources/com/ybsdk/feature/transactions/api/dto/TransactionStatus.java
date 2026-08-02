package com.ybsdk.feature.transactions.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transactions/api/dto/TransactionStatus;", "", AuthSdkActivity.RESPONSE_TYPE_CODE, "Lcom/ybsdk/feature/transactions/api/dto/TransactionStatusCode;", Constants.KEY_MESSAGE, "", "<init>", "(Lcom/ybsdk/feature/transactions/api/dto/TransactionStatusCode;Ljava/lang/String;)V", "getCode", "()Lcom/ybsdk/feature/transactions/api/dto/TransactionStatusCode;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionStatus {
    private final TransactionStatusCode code;
    private final String message;

    public TransactionStatus(@Json(name = "code") TransactionStatusCode transactionStatusCode, @Json(name = "message") String str) {
        this.code = transactionStatusCode;
        this.message = str;
    }

    public static /* synthetic */ TransactionStatus copy$default(TransactionStatus transactionStatus, TransactionStatusCode transactionStatusCode, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            transactionStatusCode = transactionStatus.code;
        }
        if ((i & 2) != 0) {
            str = transactionStatus.message;
        }
        return transactionStatus.copy(transactionStatusCode, str);
    }

    /* renamed from: component1, reason: from getter */
    public final TransactionStatusCode getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final TransactionStatus copy(@Json(name = "code") TransactionStatusCode code, @Json(name = "message") String message) {
        return new TransactionStatus(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionStatus)) {
            return false;
        }
        TransactionStatus transactionStatus = (TransactionStatus) other;
        return this.code == transactionStatus.code && jl40.l(this.message, transactionStatus.message);
    }

    public final TransactionStatusCode getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        TransactionStatusCode transactionStatusCode = this.code;
        return this.message.hashCode() + ((transactionStatusCode == null ? 0 : transactionStatusCode.hashCode()) * 31);
    }

    public String toString() {
        return "TransactionStatus(code=" + this.code + ", message=" + this.message + Extension.C_BRAKE;
    }
}
