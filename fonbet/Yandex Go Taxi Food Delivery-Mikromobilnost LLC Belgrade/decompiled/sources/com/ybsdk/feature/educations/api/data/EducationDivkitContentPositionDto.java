package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPositionDto;", "", "type", "Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPosition;", "viewId", "", "<init>", "(Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPosition;Ljava/lang/String;)V", "getType", "()Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPosition;", "getViewId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationDivkitContentPositionDto {
    private final EducationDivkitContentPosition type;
    private final String viewId;

    public EducationDivkitContentPositionDto(@Json(name = "type") EducationDivkitContentPosition educationDivkitContentPosition, @Json(name = "view_id") String str) {
        this.type = educationDivkitContentPosition;
        this.viewId = str;
    }

    public static /* synthetic */ EducationDivkitContentPositionDto copy$default(EducationDivkitContentPositionDto educationDivkitContentPositionDto, EducationDivkitContentPosition educationDivkitContentPosition, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            educationDivkitContentPosition = educationDivkitContentPositionDto.type;
        }
        if ((i & 2) != 0) {
            str = educationDivkitContentPositionDto.viewId;
        }
        return educationDivkitContentPositionDto.copy(educationDivkitContentPosition, str);
    }

    /* renamed from: component1, reason: from getter */
    public final EducationDivkitContentPosition getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    public final EducationDivkitContentPositionDto copy(@Json(name = "type") EducationDivkitContentPosition type, @Json(name = "view_id") String viewId) {
        return new EducationDivkitContentPositionDto(type, viewId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationDivkitContentPositionDto)) {
            return false;
        }
        EducationDivkitContentPositionDto educationDivkitContentPositionDto = (EducationDivkitContentPositionDto) other;
        return this.type == educationDivkitContentPositionDto.type && jl40.l(this.viewId, educationDivkitContentPositionDto.viewId);
    }

    public final EducationDivkitContentPosition getType() {
        return this.type;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.viewId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "EducationDivkitContentPositionDto(type=" + this.type + ", viewId=" + this.viewId + Extension.C_BRAKE;
    }
}
