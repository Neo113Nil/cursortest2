package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationTooltipContentDto;", "", "shadow", "Lcom/ybsdk/feature/educations/api/data/EducationsShadowDto;", "tooltip", "Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto;", "scrollBehaviour", "Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;", "<init>", "(Lcom/ybsdk/feature/educations/api/data/EducationsShadowDto;Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto;Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;)V", "getShadow", "()Lcom/ybsdk/feature/educations/api/data/EducationsShadowDto;", "getTooltip", "()Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto;", "getScrollBehaviour", "()Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationTooltipContentDto {
    private final EducationScrollBehaviourDto scrollBehaviour;
    private final EducationsShadowDto shadow;
    private final EducationsTooltipDto tooltip;

    public EducationTooltipContentDto(@Json(name = "shadow") EducationsShadowDto educationsShadowDto, @Json(name = "tooltip") EducationsTooltipDto educationsTooltipDto, @Json(name = "scroll_behaviour") EducationScrollBehaviourDto educationScrollBehaviourDto) {
        this.shadow = educationsShadowDto;
        this.tooltip = educationsTooltipDto;
        this.scrollBehaviour = educationScrollBehaviourDto;
    }

    public static /* synthetic */ EducationTooltipContentDto copy$default(EducationTooltipContentDto educationTooltipContentDto, EducationsShadowDto educationsShadowDto, EducationsTooltipDto educationsTooltipDto, EducationScrollBehaviourDto educationScrollBehaviourDto, int i, Object obj) {
        if ((i & 1) != 0) {
            educationsShadowDto = educationTooltipContentDto.shadow;
        }
        if ((i & 2) != 0) {
            educationsTooltipDto = educationTooltipContentDto.tooltip;
        }
        if ((i & 4) != 0) {
            educationScrollBehaviourDto = educationTooltipContentDto.scrollBehaviour;
        }
        return educationTooltipContentDto.copy(educationsShadowDto, educationsTooltipDto, educationScrollBehaviourDto);
    }

    /* renamed from: component1, reason: from getter */
    public final EducationsShadowDto getShadow() {
        return this.shadow;
    }

    /* renamed from: component2, reason: from getter */
    public final EducationsTooltipDto getTooltip() {
        return this.tooltip;
    }

    /* renamed from: component3, reason: from getter */
    public final EducationScrollBehaviourDto getScrollBehaviour() {
        return this.scrollBehaviour;
    }

    public final EducationTooltipContentDto copy(@Json(name = "shadow") EducationsShadowDto shadow, @Json(name = "tooltip") EducationsTooltipDto tooltip, @Json(name = "scroll_behaviour") EducationScrollBehaviourDto scrollBehaviour) {
        return new EducationTooltipContentDto(shadow, tooltip, scrollBehaviour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationTooltipContentDto)) {
            return false;
        }
        EducationTooltipContentDto educationTooltipContentDto = (EducationTooltipContentDto) other;
        return jl40.l(this.shadow, educationTooltipContentDto.shadow) && jl40.l(this.tooltip, educationTooltipContentDto.tooltip) && jl40.l(this.scrollBehaviour, educationTooltipContentDto.scrollBehaviour);
    }

    public final EducationScrollBehaviourDto getScrollBehaviour() {
        return this.scrollBehaviour;
    }

    public final EducationsShadowDto getShadow() {
        return this.shadow;
    }

    public final EducationsTooltipDto getTooltip() {
        return this.tooltip;
    }

    public int hashCode() {
        int hashCode = (this.tooltip.hashCode() + (this.shadow.hashCode() * 31)) * 31;
        EducationScrollBehaviourDto educationScrollBehaviourDto = this.scrollBehaviour;
        return hashCode + (educationScrollBehaviourDto == null ? 0 : educationScrollBehaviourDto.hashCode());
    }

    public String toString() {
        return "EducationTooltipContentDto(shadow=" + this.shadow + ", tooltip=" + this.tooltip + ", scrollBehaviour=" + this.scrollBehaviour + Extension.C_BRAKE;
    }
}
