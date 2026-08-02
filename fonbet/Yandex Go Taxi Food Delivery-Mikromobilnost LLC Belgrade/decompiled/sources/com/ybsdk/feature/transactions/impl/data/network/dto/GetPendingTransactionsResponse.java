package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transactions.api.dto.Transaction;
import defpackage.b64;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/GetPendingTransactionsResponse;", "", "cursor", "", "title", "transactions", "", "Lcom/ybsdk/feature/transactions/api/dto/Transaction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCursor", "()Ljava/lang/String;", "getTitle", "getTransactions", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPendingTransactionsResponse {
    private final String cursor;
    private final String title;
    private final List<Transaction> transactions;

    public GetPendingTransactionsResponse(@Json(name = "cursor") String str, @Json(name = "title") String str2, @Json(name = "transactions") List<Transaction> list) {
        this.cursor = str;
        this.title = str2;
        this.transactions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPendingTransactionsResponse copy$default(GetPendingTransactionsResponse getPendingTransactionsResponse, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getPendingTransactionsResponse.cursor;
        }
        if ((i & 2) != 0) {
            str2 = getPendingTransactionsResponse.title;
        }
        if ((i & 4) != 0) {
            list = getPendingTransactionsResponse.transactions;
        }
        return getPendingTransactionsResponse.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<Transaction> component3() {
        return this.transactions;
    }

    public final GetPendingTransactionsResponse copy(@Json(name = "cursor") String cursor, @Json(name = "title") String title, @Json(name = "transactions") List<Transaction> transactions) {
        return new GetPendingTransactionsResponse(cursor, title, transactions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPendingTransactionsResponse)) {
            return false;
        }
        GetPendingTransactionsResponse getPendingTransactionsResponse = (GetPendingTransactionsResponse) other;
        return jl40.l(this.cursor, getPendingTransactionsResponse.cursor) && jl40.l(this.title, getPendingTransactionsResponse.title) && jl40.l(this.transactions, getPendingTransactionsResponse.transactions);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<Transaction> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        String str = this.cursor;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.title;
        return this.transactions.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.cursor;
        String str2 = this.title;
        return ly3.s(b64.v("GetPendingTransactionsResponse(cursor=", str, ", title=", str2, ", transactions="), this.transactions, Extension.C_BRAKE);
    }
}
