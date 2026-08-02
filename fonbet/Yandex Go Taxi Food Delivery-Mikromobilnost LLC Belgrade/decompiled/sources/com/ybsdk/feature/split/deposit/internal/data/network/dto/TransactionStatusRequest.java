package com.ybsdk.feature.split.deposit.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/split/deposit/internal/data/network/dto/TransactionStatusRequest;", "", "transactionParameters", "", "<init>", "(Ljava/lang/String;)V", "getTransactionParameters", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionStatusRequest {
    private final String transactionParameters;

    public TransactionStatusRequest(@Json(name = "transaction_parameters") @RawJsonString String str) {
        this.transactionParameters = str;
    }

    public static /* synthetic */ TransactionStatusRequest copy$default(TransactionStatusRequest transactionStatusRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionStatusRequest.transactionParameters;
        }
        return transactionStatusRequest.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTransactionParameters() {
        return this.transactionParameters;
    }

    public final TransactionStatusRequest copy(@Json(name = "transaction_parameters") @RawJsonString String transactionParameters) {
        return new TransactionStatusRequest(transactionParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransactionStatusRequest) && jl40.l(this.transactionParameters, ((TransactionStatusRequest) other).transactionParameters);
    }

    public final String getTransactionParameters() {
        return this.transactionParameters;
    }

    public int hashCode() {
        return this.transactionParameters.hashCode();
    }

    public String toString() {
        return oyr.p("TransactionStatusRequest(transactionParameters=", this.transactionParameters, Extension.C_BRAKE);
    }
}
