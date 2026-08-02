package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.n;
import defpackage.oyr;
import defpackage.xvz;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0016\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListRequestV2;", "", "agreementId", "", "pendingLimit", "", "regularLimit", "cursor", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)V", "getAgreementId", "()Ljava/lang/String;", "getPendingLimit", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRegularLimit", "()I", "getCursor", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;ILjava/lang/String;)Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListRequestV2;", "equals", "", "other", "hashCode", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsListRequestV2 {
    private final String agreementId;
    private final String cursor;
    private final Integer pendingLimit;
    private final int regularLimit;

    public TransactionsListRequestV2(@Json(name = "agreement_id") String str, @Json(name = "pending_limit") Integer num, @Json(name = "regular_limit") int i, @Json(name = "cursor") String str2) {
        this.agreementId = str;
        this.pendingLimit = num;
        this.regularLimit = i;
        this.cursor = str2;
    }

    public static /* synthetic */ TransactionsListRequestV2 copy$default(TransactionsListRequestV2 transactionsListRequestV2, String str, Integer num, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = transactionsListRequestV2.agreementId;
        }
        if ((i2 & 2) != 0) {
            num = transactionsListRequestV2.pendingLimit;
        }
        if ((i2 & 4) != 0) {
            i = transactionsListRequestV2.regularLimit;
        }
        if ((i2 & 8) != 0) {
            str2 = transactionsListRequestV2.cursor;
        }
        return transactionsListRequestV2.copy(str, num, i, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAgreementId() {
        return this.agreementId;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getPendingLimit() {
        return this.pendingLimit;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRegularLimit() {
        return this.regularLimit;
    }

    /* renamed from: component4, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final TransactionsListRequestV2 copy(@Json(name = "agreement_id") String agreementId, @Json(name = "pending_limit") Integer pendingLimit, @Json(name = "regular_limit") int regularLimit, @Json(name = "cursor") String cursor) {
        return new TransactionsListRequestV2(agreementId, pendingLimit, regularLimit, cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsListRequestV2)) {
            return false;
        }
        TransactionsListRequestV2 transactionsListRequestV2 = (TransactionsListRequestV2) other;
        return jl40.l(this.agreementId, transactionsListRequestV2.agreementId) && jl40.l(this.pendingLimit, transactionsListRequestV2.pendingLimit) && this.regularLimit == transactionsListRequestV2.regularLimit && jl40.l(this.cursor, transactionsListRequestV2.cursor);
    }

    public final String getAgreementId() {
        return this.agreementId;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final Integer getPendingLimit() {
        return this.pendingLimit;
    }

    public final int getRegularLimit() {
        return this.regularLimit;
    }

    public int hashCode() {
        int hashCode = this.agreementId.hashCode() * 31;
        Integer num = this.pendingLimit;
        int b = oyr.b(this.regularLimit, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31);
        String str = this.cursor;
        return b + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.agreementId;
        return xvz.h(this.regularLimit, ", cursor=", this.cursor, Extension.C_BRAKE, n.q("TransactionsListRequestV2(agreementId=", this.pendingLimit, str, ", pendingLimit=", ", regularLimit="));
    }
}
