package com.ybsdk.feature.partnerselection.internal.network.dto.partner;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/GetPartnersResponseDto;", "", "partners", "", "Lcom/ybsdk/feature/partnerselection/internal/network/dto/partner/PartnerWithActionDto;", "cursor", "", "transferId", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getPartners", "()Ljava/util/List;", "getCursor", "()Ljava/lang/String;", "getTransferId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-partner-selection_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetPartnersResponseDto {
    private final String cursor;
    private final List<PartnerWithActionDto> partners;
    private final String transferId;

    public GetPartnersResponseDto(@Json(name = "JSON_FIELD_MEMBERS") List<PartnerWithActionDto> list, @Json(name = "cursor") String str, @Json(name = "transfer_id") String str2) {
        this.partners = list;
        this.cursor = str;
        this.transferId = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetPartnersResponseDto copy$default(GetPartnersResponseDto getPartnersResponseDto, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getPartnersResponseDto.partners;
        }
        if ((i & 2) != 0) {
            str = getPartnersResponseDto.cursor;
        }
        if ((i & 4) != 0) {
            str2 = getPartnersResponseDto.transferId;
        }
        return getPartnersResponseDto.copy(list, str, str2);
    }

    public final List<PartnerWithActionDto> component1() {
        return this.partners;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCursor() {
        return this.cursor;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTransferId() {
        return this.transferId;
    }

    public final GetPartnersResponseDto copy(@Json(name = "JSON_FIELD_MEMBERS") List<PartnerWithActionDto> partners, @Json(name = "cursor") String cursor, @Json(name = "transfer_id") String transferId) {
        return new GetPartnersResponseDto(partners, cursor, transferId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetPartnersResponseDto)) {
            return false;
        }
        GetPartnersResponseDto getPartnersResponseDto = (GetPartnersResponseDto) other;
        return jl40.l(this.partners, getPartnersResponseDto.partners) && jl40.l(this.cursor, getPartnersResponseDto.cursor) && jl40.l(this.transferId, getPartnersResponseDto.transferId);
    }

    public final String getCursor() {
        return this.cursor;
    }

    public final List<PartnerWithActionDto> getPartners() {
        return this.partners;
    }

    public final String getTransferId() {
        return this.transferId;
    }

    public int hashCode() {
        int hashCode = this.partners.hashCode() * 31;
        String str = this.cursor;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.transferId;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<PartnerWithActionDto> list = this.partners;
        String str = this.cursor;
        return oyr.t(xvz.s("GetPartnersResponseDto(partners=", list, ", cursor=", str, ", transferId="), this.transferId, Extension.C_BRAKE);
    }
}
