package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/SavingsAccountsInfoResponseV3;", "", "items", "", "Lcom/ybsdk/feature/savings/internal/network/dto/DivSavingsAccountResponse;", "commonDivData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "noAccountsInfo", "Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponseV3;", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponseV3;)V", "getItems", "()Ljava/util/List;", "getCommonDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getNoAccountsInfo", "()Lcom/ybsdk/feature/savings/internal/network/dto/NoAccountsInfoResponseV3;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SavingsAccountsInfoResponseV3 {
    private final DivDataDto commonDivData;
    private final List<DivSavingsAccountResponse> items;
    private final NoAccountsInfoResponseV3 noAccountsInfo;

    public SavingsAccountsInfoResponseV3(@Json(name = "items") List<DivSavingsAccountResponse> list, @Json(name = "common_div_data") DivDataDto divDataDto, @Json(name = "no_accounts_info") NoAccountsInfoResponseV3 noAccountsInfoResponseV3) {
        this.items = list;
        this.commonDivData = divDataDto;
        this.noAccountsInfo = noAccountsInfoResponseV3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SavingsAccountsInfoResponseV3 copy$default(SavingsAccountsInfoResponseV3 savingsAccountsInfoResponseV3, List list, DivDataDto divDataDto, NoAccountsInfoResponseV3 noAccountsInfoResponseV3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = savingsAccountsInfoResponseV3.items;
        }
        if ((i & 2) != 0) {
            divDataDto = savingsAccountsInfoResponseV3.commonDivData;
        }
        if ((i & 4) != 0) {
            noAccountsInfoResponseV3 = savingsAccountsInfoResponseV3.noAccountsInfo;
        }
        return savingsAccountsInfoResponseV3.copy(list, divDataDto, noAccountsInfoResponseV3);
    }

    public final List<DivSavingsAccountResponse> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    /* renamed from: component3, reason: from getter */
    public final NoAccountsInfoResponseV3 getNoAccountsInfo() {
        return this.noAccountsInfo;
    }

    public final SavingsAccountsInfoResponseV3 copy(@Json(name = "items") List<DivSavingsAccountResponse> items, @Json(name = "common_div_data") DivDataDto commonDivData, @Json(name = "no_accounts_info") NoAccountsInfoResponseV3 noAccountsInfo) {
        return new SavingsAccountsInfoResponseV3(items, commonDivData, noAccountsInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SavingsAccountsInfoResponseV3)) {
            return false;
        }
        SavingsAccountsInfoResponseV3 savingsAccountsInfoResponseV3 = (SavingsAccountsInfoResponseV3) other;
        return jl40.l(this.items, savingsAccountsInfoResponseV3.items) && jl40.l(this.commonDivData, savingsAccountsInfoResponseV3.commonDivData) && jl40.l(this.noAccountsInfo, savingsAccountsInfoResponseV3.noAccountsInfo);
    }

    public final DivDataDto getCommonDivData() {
        return this.commonDivData;
    }

    public final List<DivSavingsAccountResponse> getItems() {
        return this.items;
    }

    public final NoAccountsInfoResponseV3 getNoAccountsInfo() {
        return this.noAccountsInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        DivDataDto divDataDto = this.commonDivData;
        int hashCode2 = (hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        NoAccountsInfoResponseV3 noAccountsInfoResponseV3 = this.noAccountsInfo;
        return hashCode2 + (noAccountsInfoResponseV3 != null ? noAccountsInfoResponseV3.hashCode() : 0);
    }

    public String toString() {
        return "SavingsAccountsInfoResponseV3(items=" + this.items + ", commonDivData=" + this.commonDivData + ", noAccountsInfo=" + this.noAccountsInfo + Extension.C_BRAKE;
    }
}
