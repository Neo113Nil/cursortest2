package com.ybsdk.feature.main.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/ybsdk/feature/main/internal/data/network/dto/SbpAccountDetailsResponse;", "", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "unbindAccountSheet", "Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetDto;", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetDto;)V", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getUnbindAccountSheet", "()Lcom/ybsdk/feature/main/internal/data/network/dto/UnbindAccountSheetDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-main-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SbpAccountDetailsResponse {
    private final DivDataDto divkitData;
    private final UnbindAccountSheetDto unbindAccountSheet;

    public SbpAccountDetailsResponse(@Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "unbind_account_sheet") UnbindAccountSheetDto unbindAccountSheetDto) {
        this.divkitData = divDataDto;
        this.unbindAccountSheet = unbindAccountSheetDto;
    }

    public static /* synthetic */ SbpAccountDetailsResponse copy$default(SbpAccountDetailsResponse sbpAccountDetailsResponse, DivDataDto divDataDto, UnbindAccountSheetDto unbindAccountSheetDto, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = sbpAccountDetailsResponse.divkitData;
        }
        if ((i & 2) != 0) {
            unbindAccountSheetDto = sbpAccountDetailsResponse.unbindAccountSheet;
        }
        return sbpAccountDetailsResponse.copy(divDataDto, unbindAccountSheetDto);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component2, reason: from getter */
    public final UnbindAccountSheetDto getUnbindAccountSheet() {
        return this.unbindAccountSheet;
    }

    public final SbpAccountDetailsResponse copy(@Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "unbind_account_sheet") UnbindAccountSheetDto unbindAccountSheet) {
        return new SbpAccountDetailsResponse(divkitData, unbindAccountSheet);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SbpAccountDetailsResponse)) {
            return false;
        }
        SbpAccountDetailsResponse sbpAccountDetailsResponse = (SbpAccountDetailsResponse) other;
        return jl40.l(this.divkitData, sbpAccountDetailsResponse.divkitData) && jl40.l(this.unbindAccountSheet, sbpAccountDetailsResponse.unbindAccountSheet);
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final UnbindAccountSheetDto getUnbindAccountSheet() {
        return this.unbindAccountSheet;
    }

    public int hashCode() {
        return this.unbindAccountSheet.hashCode() + (this.divkitData.hashCode() * 31);
    }

    public String toString() {
        return "SbpAccountDetailsResponse(divkitData=" + this.divkitData + ", unbindAccountSheet=" + this.unbindAccountSheet + Extension.C_BRAKE;
    }
}
