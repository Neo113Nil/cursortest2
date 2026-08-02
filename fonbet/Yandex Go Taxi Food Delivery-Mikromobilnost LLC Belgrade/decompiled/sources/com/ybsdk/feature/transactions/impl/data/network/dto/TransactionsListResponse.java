package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.transactions.api.dto.Transaction;
import defpackage.jl40;
import defpackage.nnm;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListResponse;", "", "cursor", "", "transactions", "", "Lcom/ybsdk/feature/transactions/api/dto/Transaction;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCursor", "()Ljava/lang/String;", "getTransactions", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsListResponse {
    private final String cursor;
    private final List<Transaction> transactions;

    public /* synthetic */ TransactionsListResponse(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? EmptyList.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionsListResponse copy$default(TransactionsListResponse transactionsListResponse, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionsListResponse.cursor;
        }
        if ((i & 2) != 0) {
            list = transactionsListResponse.transactions;
        }
        return transactionsListResponse.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final List<Transaction> component2() {
        return this.transactions;
    }

    public final TransactionsListResponse copy(@Json(name = "cursor") String cursor, @Json(name = "transactions") List<Transaction> transactions) {
        return new TransactionsListResponse(cursor, transactions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsListResponse)) {
            return false;
        }
        TransactionsListResponse transactionsListResponse = (TransactionsListResponse) other;
        return jl40.l(this.cursor, transactionsListResponse.cursor) && jl40.l(this.transactions, transactionsListResponse.transactions);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<Transaction> getTransactions() {
        return this.transactions;
    }

    public int hashCode() {
        String str = this.cursor;
        return this.transactions.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return nnm.h("TransactionsListResponse(cursor=", this.cursor, ", transactions=", Extension.C_BRAKE, this.transactions);
    }

    public TransactionsListResponse(@Json(name = "cursor") String str, @Json(name = "transactions") List<Transaction> list) {
        this.cursor = str;
        this.transactions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TransactionsListResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
