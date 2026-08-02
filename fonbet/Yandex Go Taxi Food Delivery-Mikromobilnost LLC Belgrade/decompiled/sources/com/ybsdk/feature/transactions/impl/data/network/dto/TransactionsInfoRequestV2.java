package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oyr;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsInfoRequestV2;", "", "agreementId", "", "limit", "", "pendingLimit", "cursor", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getLimit", "()I", "getPendingLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCursor", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;)Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsInfoRequestV2;", "equals", "", "other", "hashCode", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsInfoRequestV2 {
    private final String agreementId;
    private final String cursor;
    private final int limit;
    private final Integer pendingLimit;

    public TransactionsInfoRequestV2(@Json(name = "agreement_id") String str, @Json(name = "regular_limit") int i, @Json(name = "pending_limit") Integer num, @Json(name = "cursor") String str2) {
        this.agreementId = str;
        this.limit = i;
        this.pendingLimit = num;
        this.cursor = str2;
    }

    public static /* synthetic */ TransactionsInfoRequestV2 copy$default(TransactionsInfoRequestV2 transactionsInfoRequestV2, String str, int i, Integer num, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transactionsInfoRequestV2.agreementId;
        }
        if ((i2 & 2) != 0) {
            i = transactionsInfoRequestV2.limit;
        }
        if ((i2 & 4) != 0) {
            num = transactionsInfoRequestV2.pendingLimit;
        }
        if ((i2 & 8) != 0) {
            str2 = transactionsInfoRequestV2.cursor;
        }
        return transactionsInfoRequestV2.copy(str, i, num, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLimit() {
        return this.limit;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPendingLimit() {
        return this.pendingLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final TransactionsInfoRequestV2 copy(@Json(name = "agreement_id") String agreementId, @Json(name = "regular_limit") int limit, @Json(name = "pending_limit") Integer pendingLimit, @Json(name = "cursor") String cursor) {
        return new TransactionsInfoRequestV2(agreementId, limit, pendingLimit, cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsInfoRequestV2)) {
            return false;
        }
        TransactionsInfoRequestV2 transactionsInfoRequestV2 = (TransactionsInfoRequestV2) other;
        return jl40.l(this.agreementId, transactionsInfoRequestV2.agreementId) && this.limit == transactionsInfoRequestV2.limit && jl40.l(this.pendingLimit, transactionsInfoRequestV2.pendingLimit) && jl40.l(this.cursor, transactionsInfoRequestV2.cursor);
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

    public final Integer getPendingLimit() {
        return this.pendingLimit;
    }

    public int hashCode() {
        String str = this.agreementId;
        int b = oyr.b(this.limit, (str == null ? 0 : str.hashCode()) * 31, 31);
        Integer num = this.pendingLimit;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.cursor;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        int i = this.limit;
        Integer num = this.pendingLimit;
        String str2 = this.cursor;
        StringBuilder u = b64.u(i, "TransactionsInfoRequestV2(agreementId=", str, ", limit=", ", pendingLimit=");
        u.append(num);
        u.append(", cursor=");
        u.append(str2);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
