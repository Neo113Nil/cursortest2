package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.unr0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListRequest;", "", "limit", "", "cursor", "", "agreementId", "accessorId", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLimit", "()I", "getCursor", "()Ljava/lang/String;", "getAgreementId", "getAccessorId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsListRequest {
    private final String accessorId;
    private final String agreementId;
    private final String cursor;
    private final int limit;

    public /* synthetic */ TransactionsListRequest(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, str2, (i2 & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ TransactionsListRequest copy$default(TransactionsListRequest transactionsListRequest, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = transactionsListRequest.limit;
        }
        if ((i2 & 2) != 0) {
            str = transactionsListRequest.cursor;
        }
        if ((i2 & 4) != 0) {
            str2 = transactionsListRequest.agreementId;
        }
        if ((i2 & 8) != 0) {
            str3 = transactionsListRequest.accessorId;
        }
        return transactionsListRequest.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAccessorId() {
        return this.accessorId;
    }

    public final TransactionsListRequest copy(@Json(name = "limit") int limit, @Json(name = "cursor") String cursor, @Json(name = "agreement_id") String agreementId, @Json(name = "accessor_id") String accessorId) {
        return new TransactionsListRequest(limit, cursor, agreementId, accessorId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsListRequest)) {
            return false;
        }
        TransactionsListRequest transactionsListRequest = (TransactionsListRequest) other;
        return this.limit == transactionsListRequest.limit && jl40.l(this.cursor, transactionsListRequest.cursor) && jl40.l(this.agreementId, transactionsListRequest.agreementId) && jl40.l(this.accessorId, transactionsListRequest.accessorId);
    }

    public final String getAccessorId() {
        return this.accessorId;
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final int getLimit() {
        return this.limit;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.limit) * 31;
        String str = this.cursor;
        int b = unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.agreementId);
        String str2 = this.accessorId;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        int i = this.limit;
        String str = this.cursor;
        return g8e.r(unr0.v(i, "TransactionsListRequest(limit=", ", cursor=", str, ", agreementId="), this.agreementId, ", accessorId=", this.accessorId, Extension.C_BRAKE);
    }

    public TransactionsListRequest(@Json(name = "limit") int i, @Json(name = "cursor") String str, @Json(name = "agreement_id") String str2, @Json(name = "accessor_id") String str3) {
        this.limit = i;
        this.cursor = str;
        this.agreementId = str2;
        this.accessorId = str3;
    }
}
