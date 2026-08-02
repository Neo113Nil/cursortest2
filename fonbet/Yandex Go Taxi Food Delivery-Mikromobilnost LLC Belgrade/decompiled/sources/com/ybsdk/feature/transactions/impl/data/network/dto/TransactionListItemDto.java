package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionListItemDto;", "", "divData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "type", "", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/lang/String;)V", "getDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getType", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionListItemDto {
    private final DivDataDto divData;
    private final String type;

    public TransactionListItemDto(@Json(name = "div_json") DivDataDto divDataDto, @Json(name = "type") String str) {
        this.divData = divDataDto;
        this.type = str;
    }

    public static /* synthetic */ TransactionListItemDto copy$default(TransactionListItemDto transactionListItemDto, DivDataDto divDataDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = transactionListItemDto.divData;
        }
        if ((i & 2) != 0) {
            str = transactionListItemDto.type;
        }
        return transactionListItemDto.copy(divDataDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivData() {
        return this.divData;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final TransactionListItemDto copy(@Json(name = "div_json") DivDataDto divData, @Json(name = "type") String type) {
        return new TransactionListItemDto(divData, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionListItemDto)) {
            return false;
        }
        TransactionListItemDto transactionListItemDto = (TransactionListItemDto) other;
        return jl40.l(this.divData, transactionListItemDto.divData) && jl40.l(this.type, transactionListItemDto.type);
    }

    public final DivDataDto getDivData() {
        return this.divData;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type.hashCode() + (this.divData.hashCode() * 31);
    }

    public String toString() {
        return "TransactionListItemDto(divData=" + this.divData + ", type=" + this.type + Extension.C_BRAKE;
    }
}
