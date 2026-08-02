package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/GetMenuResponse;", "", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "toolbarDivkitData", "toolbarBackgroundColor", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "<init>", "(Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;)V", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getToolbarDivkitData", "getToolbarBackgroundColor", "()Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetMenuResponse {
    private final DivDataDto divkitData;
    private final ThemedParameter<String> toolbarBackgroundColor;
    private final DivDataDto toolbarDivkitData;

    public GetMenuResponse(@Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "toolbar_divkit_data") DivDataDto divDataDto2, @Json(name = "toolbar_background_color") ThemedParameter<String> themedParameter) {
        this.divkitData = divDataDto;
        this.toolbarDivkitData = divDataDto2;
        this.toolbarBackgroundColor = themedParameter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetMenuResponse copy$default(GetMenuResponse getMenuResponse, DivDataDto divDataDto, DivDataDto divDataDto2, ThemedParameter themedParameter, int i, Object obj) {
        if ((i & 1) != 0) {
            divDataDto = getMenuResponse.divkitData;
        }
        if ((i & 2) != 0) {
            divDataDto2 = getMenuResponse.toolbarDivkitData;
        }
        if ((i & 4) != 0) {
            themedParameter = getMenuResponse.toolbarBackgroundColor;
        }
        return getMenuResponse.copy(divDataDto, divDataDto2, themedParameter);
    }

    /* renamed from: component1, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getToolbarDivkitData() {
        return this.toolbarDivkitData;
    }

    public final ThemedParameter<String> component3() {
        return this.toolbarBackgroundColor;
    }

    public final GetMenuResponse copy(@Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "toolbar_divkit_data") DivDataDto toolbarDivkitData, @Json(name = "toolbar_background_color") ThemedParameter<String> toolbarBackgroundColor) {
        return new GetMenuResponse(divkitData, toolbarDivkitData, toolbarBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetMenuResponse)) {
            return false;
        }
        GetMenuResponse getMenuResponse = (GetMenuResponse) other;
        return jl40.l(this.divkitData, getMenuResponse.divkitData) && jl40.l(this.toolbarDivkitData, getMenuResponse.toolbarDivkitData) && jl40.l(this.toolbarBackgroundColor, getMenuResponse.toolbarBackgroundColor);
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final ThemedParameter<String> getToolbarBackgroundColor() {
        return this.toolbarBackgroundColor;
    }

    public final DivDataDto getToolbarDivkitData() {
        return this.toolbarDivkitData;
    }

    public int hashCode() {
        int hashCode = this.divkitData.hashCode() * 31;
        DivDataDto divDataDto = this.toolbarDivkitData;
        int hashCode2 = (hashCode + (divDataDto == null ? 0 : divDataDto.hashCode())) * 31;
        ThemedParameter<String> themedParameter = this.toolbarBackgroundColor;
        return hashCode2 + (themedParameter != null ? themedParameter.hashCode() : 0);
    }

    public String toString() {
        return "GetMenuResponse(divkitData=" + this.divkitData + ", toolbarDivkitData=" + this.toolbarDivkitData + ", toolbarBackgroundColor=" + this.toolbarBackgroundColor + Extension.C_BRAKE;
    }
}
