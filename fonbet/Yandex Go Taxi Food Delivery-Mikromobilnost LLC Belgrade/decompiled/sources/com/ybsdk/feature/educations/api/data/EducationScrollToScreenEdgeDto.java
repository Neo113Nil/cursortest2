package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenEdgeDto;", "", "screenEdge", "Lcom/ybsdk/feature/educations/api/data/EducationScrollScreenEdge;", "<init>", "(Lcom/ybsdk/feature/educations/api/data/EducationScrollScreenEdge;)V", "getScreenEdge", "()Lcom/ybsdk/feature/educations/api/data/EducationScrollScreenEdge;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationScrollToScreenEdgeDto {
    private final EducationScrollScreenEdge screenEdge;

    public EducationScrollToScreenEdgeDto(@Json(name = "screen_edge") EducationScrollScreenEdge educationScrollScreenEdge) {
        this.screenEdge = educationScrollScreenEdge;
    }

    public static /* synthetic */ EducationScrollToScreenEdgeDto copy$default(EducationScrollToScreenEdgeDto educationScrollToScreenEdgeDto, EducationScrollScreenEdge educationScrollScreenEdge, int i, Object obj) {
        if ((i & 1) != 0) {
            educationScrollScreenEdge = educationScrollToScreenEdgeDto.screenEdge;
        }
        return educationScrollToScreenEdgeDto.copy(educationScrollScreenEdge);
    }

    /* renamed from: component1, reason: from getter */
    public final EducationScrollScreenEdge getScreenEdge() {
        return this.screenEdge;
    }

    public final EducationScrollToScreenEdgeDto copy(@Json(name = "screen_edge") EducationScrollScreenEdge screenEdge) {
        return new EducationScrollToScreenEdgeDto(screenEdge);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EducationScrollToScreenEdgeDto) && this.screenEdge == ((EducationScrollToScreenEdgeDto) other).screenEdge;
    }

    public final EducationScrollScreenEdge getScreenEdge() {
        return this.screenEdge;
    }

    public int hashCode() {
        return this.screenEdge.hashCode();
    }

    public String toString() {
        return "EducationScrollToScreenEdgeDto(screenEdge=" + this.screenEdge + Extension.C_BRAKE;
    }
}
