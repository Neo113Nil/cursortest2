package com.ybsdk.feature.transactions.impl.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionsListDivkitDataDto;", "", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "items", "", "Lcom/ybsdk/feature/transactions/impl/data/network/dto/TransactionListItemDto;", "cursor", "", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/List;Ljava/lang/String;)V", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getItems", "()Ljava/util/List;", "getCursor", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transactions-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransactionsListDivkitDataDto {
    private final DivDataDto commonDivData;
    private final String cursor;
    private final List<TransactionListItemDto> items;

    public TransactionsListDivkitDataDto(@Json(name = "common_data") DivDataDto divDataDto, @Json(name = "items") List<TransactionListItemDto> list, @Json(name = "cursor") String str) {
        this.commonDivData = divDataDto;
        this.items = list;
        this.cursor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TransactionsListDivkitDataDto copy$default(TransactionsListDivkitDataDto transactionsListDivkitDataDto, DivDataDto divDataDto, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = transactionsListDivkitDataDto.commonDivData;
        }
        if ((i & 2) != 0) {
            list = transactionsListDivkitDataDto.items;
        }
        if ((i & 4) != 0) {
            str = transactionsListDivkitDataDto.cursor;
        }
        return transactionsListDivkitDataDto.copy(divDataDto, list, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<TransactionListItemDto> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    public final TransactionsListDivkitDataDto copy(@Json(name = "common_data") DivDataDto commonDivData, @Json(name = "items") List<TransactionListItemDto> items, @Json(name = "cursor") String cursor) {
        return new TransactionsListDivkitDataDto(commonDivData, items, cursor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransactionsListDivkitDataDto)) {
            return false;
        }
        TransactionsListDivkitDataDto transactionsListDivkitDataDto = (TransactionsListDivkitDataDto) other;
        return jl40.l(this.commonDivData, transactionsListDivkitDataDto.commonDivData) && jl40.l(this.items, transactionsListDivkitDataDto.items) && jl40.l(this.cursor, transactionsListDivkitDataDto.cursor);
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<TransactionListItemDto> getItems() {
        return this.items;
    }

    public int hashCode() {
        DivDataDto divDataDto = this.commonDivData;
        int c = unr0.c((divDataDto == null ? 0 : divDataDto.hashCode()) * 31, 31, this.items);
        String str = this.cursor;
        return c + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        DivDataDto divDataDto = this.commonDivData;
        List<TransactionListItemDto> list = this.items;
        String str = this.cursor;
        StringBuilder sb = new StringBuilder("TransactionsListDivkitDataDto(commonDivData=");
        sb.append(divDataDto);
        sb.append(", items=");
        sb.append(list);
        sb.append(", cursor=");
        return oyr.t(sb, str, Extension.C_BRAKE);
    }
}
