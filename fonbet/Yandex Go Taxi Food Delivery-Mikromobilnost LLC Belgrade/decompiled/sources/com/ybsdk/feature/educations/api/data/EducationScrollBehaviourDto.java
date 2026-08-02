package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;", "", "scrollType", "Lcom/ybsdk/feature/educations/api/data/EducationScrollType;", "scrollToScreenEdge", "Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenEdgeDto;", "scrollToScreenItem", "Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenItemDto;", "<init>", "(Lcom/ybsdk/feature/educations/api/data/EducationScrollType;Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenEdgeDto;Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenItemDto;)V", "getScrollType", "()Lcom/ybsdk/feature/educations/api/data/EducationScrollType;", "getScrollToScreenEdge", "()Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenEdgeDto;", "getScrollToScreenItem", "()Lcom/ybsdk/feature/educations/api/data/EducationScrollToScreenItemDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationScrollBehaviourDto {
    private final EducationScrollToScreenEdgeDto scrollToScreenEdge;
    private final EducationScrollToScreenItemDto scrollToScreenItem;
    private final EducationScrollType scrollType;

    public EducationScrollBehaviourDto(@Json(name = "scroll_type") EducationScrollType educationScrollType, @Json(name = "scroll_to_screen_edge") EducationScrollToScreenEdgeDto educationScrollToScreenEdgeDto, @Json(name = "scroll_to_screen_item") EducationScrollToScreenItemDto educationScrollToScreenItemDto) {
        this.scrollType = educationScrollType;
        this.scrollToScreenEdge = educationScrollToScreenEdgeDto;
        this.scrollToScreenItem = educationScrollToScreenItemDto;
    }

    public static /* synthetic */ EducationScrollBehaviourDto copy$default(EducationScrollBehaviourDto educationScrollBehaviourDto, EducationScrollType educationScrollType, EducationScrollToScreenEdgeDto educationScrollToScreenEdgeDto, EducationScrollToScreenItemDto educationScrollToScreenItemDto, int i, Object obj) {
        if ((i & 1) != 0) {
            educationScrollType = educationScrollBehaviourDto.scrollType;
        }
        if ((i & 2) != 0) {
            educationScrollToScreenEdgeDto = educationScrollBehaviourDto.scrollToScreenEdge;
        }
        if ((i & 4) != 0) {
            educationScrollToScreenItemDto = educationScrollBehaviourDto.scrollToScreenItem;
        }
        return educationScrollBehaviourDto.copy(educationScrollType, educationScrollToScreenEdgeDto, educationScrollToScreenItemDto);
    }

    /* renamed from: component1, reason: from getter */
    public final EducationScrollType getScrollType() {
        return this.scrollType;
    }

    /* renamed from: component2, reason: from getter */
    public final EducationScrollToScreenEdgeDto getScrollToScreenEdge() {
        return this.scrollToScreenEdge;
    }

    /* renamed from: component3, reason: from getter */
    public final EducationScrollToScreenItemDto getScrollToScreenItem() {
        return this.scrollToScreenItem;
    }

    public final EducationScrollBehaviourDto copy(@Json(name = "scroll_type") EducationScrollType scrollType, @Json(name = "scroll_to_screen_edge") EducationScrollToScreenEdgeDto scrollToScreenEdge, @Json(name = "scroll_to_screen_item") EducationScrollToScreenItemDto scrollToScreenItem) {
        return new EducationScrollBehaviourDto(scrollType, scrollToScreenEdge, scrollToScreenItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationScrollBehaviourDto)) {
            return false;
        }
        EducationScrollBehaviourDto educationScrollBehaviourDto = (EducationScrollBehaviourDto) other;
        return this.scrollType == educationScrollBehaviourDto.scrollType && jl40.l(this.scrollToScreenEdge, educationScrollBehaviourDto.scrollToScreenEdge) && jl40.l(this.scrollToScreenItem, educationScrollBehaviourDto.scrollToScreenItem);
    }

    public final EducationScrollToScreenEdgeDto getScrollToScreenEdge() {
        return this.scrollToScreenEdge;
    }

    public final EducationScrollToScreenItemDto getScrollToScreenItem() {
        return this.scrollToScreenItem;
    }

    public final EducationScrollType getScrollType() {
        return this.scrollType;
    }

    public int hashCode() {
        int hashCode = this.scrollType.hashCode() * 31;
        EducationScrollToScreenEdgeDto educationScrollToScreenEdgeDto = this.scrollToScreenEdge;
        int hashCode2 = (hashCode + (educationScrollToScreenEdgeDto == null ? 0 : educationScrollToScreenEdgeDto.hashCode())) * 31;
        EducationScrollToScreenItemDto educationScrollToScreenItemDto = this.scrollToScreenItem;
        return hashCode2 + (educationScrollToScreenItemDto != null ? educationScrollToScreenItemDto.hashCode() : 0);
    }

    public String toString() {
        return "EducationScrollBehaviourDto(scrollType=" + this.scrollType + ", scrollToScreenEdge=" + this.scrollToScreenEdge + ", scrollToScreenItem=" + this.scrollToScreenItem + Extension.C_BRAKE;
    }
}
