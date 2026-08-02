package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J=\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationDivKitContentDto;", "", "shadow", "Lcom/ybsdk/feature/educations/api/data/EducationsShadowDto;", "position", "Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPositionDto;", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "glow", "Lcom/ybsdk/feature/educations/api/data/EducationGlowDto;", "scrollBehaviour", "Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;", "<init>", "(Lcom/ybsdk/feature/educations/api/data/EducationsShadowDto;Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPositionDto;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Lcom/ybsdk/feature/educations/api/data/EducationGlowDto;Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;)V", "getShadow", "()Lcom/ybsdk/feature/educations/api/data/EducationsShadowDto;", "getPosition", "()Lcom/ybsdk/feature/educations/api/data/EducationDivkitContentPositionDto;", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getGlow", "()Lcom/ybsdk/feature/educations/api/data/EducationGlowDto;", "getScrollBehaviour", "()Lcom/ybsdk/feature/educations/api/data/EducationScrollBehaviourDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationDivKitContentDto {
    private final DivDataDto divkitData;
    private final EducationGlowDto glow;
    private final EducationDivkitContentPositionDto position;
    private final EducationScrollBehaviourDto scrollBehaviour;
    private final EducationsShadowDto shadow;

    public EducationDivKitContentDto(@Json(name = "shadow") EducationsShadowDto educationsShadowDto, @Json(name = "position") EducationDivkitContentPositionDto educationDivkitContentPositionDto, @Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "glow") EducationGlowDto educationGlowDto, @Json(name = "scroll_behaviour") EducationScrollBehaviourDto educationScrollBehaviourDto) {
        this.shadow = educationsShadowDto;
        this.position = educationDivkitContentPositionDto;
        this.divkitData = divDataDto;
        this.glow = educationGlowDto;
        this.scrollBehaviour = educationScrollBehaviourDto;
    }

    public static /* synthetic */ EducationDivKitContentDto copy$default(EducationDivKitContentDto educationDivKitContentDto, EducationsShadowDto educationsShadowDto, EducationDivkitContentPositionDto educationDivkitContentPositionDto, DivDataDto divDataDto, EducationGlowDto educationGlowDto, EducationScrollBehaviourDto educationScrollBehaviourDto, int i, Object obj) {
        if ((i & 1) != 0) {
            educationsShadowDto = educationDivKitContentDto.shadow;
        }
        if ((i & 2) != 0) {
            educationDivkitContentPositionDto = educationDivKitContentDto.position;
        }
        if ((i & 4) != 0) {
            divDataDto = educationDivKitContentDto.divkitData;
        }
        if ((i & 8) != 0) {
            educationGlowDto = educationDivKitContentDto.glow;
        }
        if ((i & 16) != 0) {
            educationScrollBehaviourDto = educationDivKitContentDto.scrollBehaviour;
        }
        EducationScrollBehaviourDto educationScrollBehaviourDto2 = educationScrollBehaviourDto;
        DivDataDto divDataDto2 = divDataDto;
        return educationDivKitContentDto.copy(educationsShadowDto, educationDivkitContentPositionDto, divDataDto2, educationGlowDto, educationScrollBehaviourDto2);
    }

    /* renamed from: component1, reason: from getter */
    public final EducationsShadowDto getShadow() {
        return this.shadow;
    }

    /* renamed from: component2, reason: from getter */
    public final EducationDivkitContentPositionDto getPosition() {
        return this.position;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component4, reason: from getter */
    public final EducationGlowDto getGlow() {
        return this.glow;
    }

    /* renamed from: component5, reason: from getter */
    public final EducationScrollBehaviourDto getScrollBehaviour() {
        return this.scrollBehaviour;
    }

    public final EducationDivKitContentDto copy(@Json(name = "shadow") EducationsShadowDto shadow, @Json(name = "position") EducationDivkitContentPositionDto position, @Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "glow") EducationGlowDto glow, @Json(name = "scroll_behaviour") EducationScrollBehaviourDto scrollBehaviour) {
        return new EducationDivKitContentDto(shadow, position, divkitData, glow, scrollBehaviour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationDivKitContentDto)) {
            return false;
        }
        EducationDivKitContentDto educationDivKitContentDto = (EducationDivKitContentDto) other;
        return jl40.l(this.shadow, educationDivKitContentDto.shadow) && jl40.l(this.position, educationDivKitContentDto.position) && jl40.l(this.divkitData, educationDivKitContentDto.divkitData) && jl40.l(this.glow, educationDivKitContentDto.glow) && jl40.l(this.scrollBehaviour, educationDivKitContentDto.scrollBehaviour);
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final EducationGlowDto getGlow() {
        return this.glow;
    }

    public final EducationDivkitContentPositionDto getPosition() {
        return this.position;
    }

    public final EducationScrollBehaviourDto getScrollBehaviour() {
        return this.scrollBehaviour;
    }

    public final EducationsShadowDto getShadow() {
        return this.shadow;
    }

    public int hashCode() {
        int hashCode = (this.glow.hashCode() + ((this.divkitData.hashCode() + ((this.position.hashCode() + (this.shadow.hashCode() * 31)) * 31)) * 31)) * 31;
        EducationScrollBehaviourDto educationScrollBehaviourDto = this.scrollBehaviour;
        return hashCode + (educationScrollBehaviourDto == null ? 0 : educationScrollBehaviourDto.hashCode());
    }

    public String toString() {
        return "EducationDivKitContentDto(shadow=" + this.shadow + ", position=" + this.position + ", divkitData=" + this.divkitData + ", glow=" + this.glow + ", scrollBehaviour=" + this.scrollBehaviour + Extension.C_BRAKE;
    }
}
