package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.tse0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionGetReportResponse;", "", "reports", "", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionGetReportItemResponse;", "<init>", "(Ljava/util/List;)V", "getReports", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionGetReportResponse {
    private final List<TransactionGetReportItemResponse> reports;

    public TransactionGetReportResponse(@Json(name = "reports") List<TransactionGetReportItemResponse> list) {
        this.reports = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionGetReportResponse copy$default(TransactionGetReportResponse transactionGetReportResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = transactionGetReportResponse.reports;
        }
        return transactionGetReportResponse.copy(list);
    }

    public final List<TransactionGetReportItemResponse> component1() {
        return this.reports;
    }

    public final TransactionGetReportResponse copy(@Json(name = "reports") List<TransactionGetReportItemResponse> reports) {
        return new TransactionGetReportResponse(reports);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TransactionGetReportResponse) && jl40.l(this.reports, ((TransactionGetReportResponse) other).reports);
    }

    public final List<TransactionGetReportItemResponse> getReports() {
        return this.reports;
    }

    public int hashCode() {
        return this.reports.hashCode();
    }

    public String toString() {
        return tse0.k("TransactionGetReportResponse(reports=", Extension.C_BRAKE, this.reports);
    }
}
