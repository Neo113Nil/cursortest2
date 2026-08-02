package com.ybsdk.feature.savings.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/savings/internal/network/dto/DivkitWidgetDto;", "", "layoutId", "", "divData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getLayoutId", "()Ljava/lang/String;", "getDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivkitWidgetDto {
    private final DivDataDto divData;
    private final String layoutId;

    public DivkitWidgetDto(@Json(name = "layout_id") String str, @Json(name = "div_json") DivDataDto divDataDto) {
        this.layoutId = str;
        this.divData = divDataDto;
    }

    public static /* synthetic */ DivkitWidgetDto copy$default(DivkitWidgetDto divkitWidgetDto, String str, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = divkitWidgetDto.layoutId;
        }
        if ((i & 2) != 0) {
            divDataDto = divkitWidgetDto.divData;
        }
        return divkitWidgetDto.copy(str, divDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLayoutId() {
        return this.layoutId;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getDivData() {
        return this.divData;
    }

    public final DivkitWidgetDto copy(@Json(name = "layout_id") String layoutId, @Json(name = "div_json") DivDataDto divData) {
        return new DivkitWidgetDto(layoutId, divData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivkitWidgetDto)) {
            return false;
        }
        DivkitWidgetDto divkitWidgetDto = (DivkitWidgetDto) other;
        return jl40.l(this.layoutId, divkitWidgetDto.layoutId) && jl40.l(this.divData, divkitWidgetDto.divData);
    }

    public final DivDataDto getDivData() {
        return this.divData;
    }

    public final String getLayoutId() {
        return this.layoutId;
    }

    public int hashCode() {
        return this.divData.hashCode() + (this.layoutId.hashCode() * 31);
    }

    public String toString() {
        return "DivkitWidgetDto(layoutId=" + this.layoutId + ", divData=" + this.divData + Extension.C_BRAKE;
    }
}
