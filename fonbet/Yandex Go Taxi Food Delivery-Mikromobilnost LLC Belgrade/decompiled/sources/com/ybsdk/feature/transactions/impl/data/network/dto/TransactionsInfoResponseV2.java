package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsInfoResponseV2;", "", "title", "", "subtitle", "divData", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListDivkitDataDto;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListDivkitDataDto;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDivData", "()Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListDivkitDataDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsInfoResponseV2 {
    private final TransactionsListDivkitDataDto divData;
    private final String subtitle;
    private final String title;

    public TransactionsInfoResponseV2(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "divkit_data") TransactionsListDivkitDataDto transactionsListDivkitDataDto) {
        this.title = str;
        this.subtitle = str2;
        this.divData = transactionsListDivkitDataDto;
    }

    public static /* synthetic */ TransactionsInfoResponseV2 copy$default(TransactionsInfoResponseV2 transactionsInfoResponseV2, String str, String str2, TransactionsListDivkitDataDto transactionsListDivkitDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = transactionsInfoResponseV2.title;
        }
        if ((i & 2) != 0) {
            str2 = transactionsInfoResponseV2.subtitle;
        }
        if ((i & 4) != 0) {
            transactionsListDivkitDataDto = transactionsInfoResponseV2.divData;
        }
        return transactionsInfoResponseV2.copy(str, str2, transactionsListDivkitDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final TransactionsListDivkitDataDto getDivData() {
        return this.divData;
    }

    public final TransactionsInfoResponseV2 copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "divkit_data") TransactionsListDivkitDataDto divData) {
        return new TransactionsInfoResponseV2(title, subtitle, divData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsInfoResponseV2)) {
            return false;
        }
        TransactionsInfoResponseV2 transactionsInfoResponseV2 = (TransactionsInfoResponseV2) other;
        return jl40.l(this.title, transactionsInfoResponseV2.title) && jl40.l(this.subtitle, transactionsInfoResponseV2.subtitle) && jl40.l(this.divData, transactionsInfoResponseV2.divData);
    }

    public final TransactionsListDivkitDataDto getDivData() {
        return this.divData;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        return this.divData.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        TransactionsListDivkitDataDto transactionsListDivkitDataDto = this.divData;
        StringBuilder v = b64.v("TransactionsInfoResponseV2(title=", str, ", subtitle=", str2, ", divData=");
        v.append(transactionsListDivkitDataDto);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
