package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B3\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J:\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto;", "", "viewId", "", "drawType", "Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto$EducationsShadowDrawRuleType;", "cornersRadius", "", "margins", "Lcom/ybsdk/feature/educations/api/data/MarginsDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto$EducationsShadowDrawRuleType;Ljava/lang/Integer;Lcom/ybsdk/feature/educations/api/data/MarginsDto;)V", "getViewId", "()Ljava/lang/String;", "getDrawType", "()Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto$EducationsShadowDrawRuleType;", "getCornersRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMargins", "()Lcom/ybsdk/feature/educations/api/data/MarginsDto;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto$EducationsShadowDrawRuleType;Ljava/lang/Integer;Lcom/ybsdk/feature/educations/api/data/MarginsDto;)Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto;", "equals", "", "other", "hashCode", "toString", "EducationsShadowDrawRuleType", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationsShadowDrawRuleDto {
    private final Integer cornersRadius;
    private final EducationsShadowDrawRuleType drawType;
    private final MarginsDto margins;
    private final String viewId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsShadowDrawRuleDto$EducationsShadowDrawRuleType;", "", "<init>", "(Ljava/lang/String;I)V", "HIGHLIGHT", "SHADOW", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EducationsShadowDrawRuleType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EducationsShadowDrawRuleType[] $VALUES;
        public static final EducationsShadowDrawRuleType HIGHLIGHT = new EducationsShadowDrawRuleType("HIGHLIGHT", 0);
        public static final EducationsShadowDrawRuleType SHADOW = new EducationsShadowDrawRuleType("SHADOW", 1);

        private static final /* synthetic */ EducationsShadowDrawRuleType[] $values() {
            return new EducationsShadowDrawRuleType[]{HIGHLIGHT, SHADOW};
        }

        static {
            EducationsShadowDrawRuleType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private EducationsShadowDrawRuleType(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EducationsShadowDrawRuleType valueOf(String str) {
            return (EducationsShadowDrawRuleType) Enum.valueOf(EducationsShadowDrawRuleType.class, str);
        }

        public static EducationsShadowDrawRuleType[] values() {
            return (EducationsShadowDrawRuleType[]) $VALUES.clone();
        }
    }

    public EducationsShadowDrawRuleDto(@Json(name = "view_id") String str, @Json(name = "draw_type") EducationsShadowDrawRuleType educationsShadowDrawRuleType, @Json(name = "corner_radius") Integer num, @Json(name = "margins") MarginsDto marginsDto) {
        this.viewId = str;
        this.drawType = educationsShadowDrawRuleType;
        this.cornersRadius = num;
        this.margins = marginsDto;
    }

    public static /* synthetic */ EducationsShadowDrawRuleDto copy$default(EducationsShadowDrawRuleDto educationsShadowDrawRuleDto, String str, EducationsShadowDrawRuleType educationsShadowDrawRuleType, Integer num, MarginsDto marginsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationsShadowDrawRuleDto.viewId;
        }
        if ((i & 2) != 0) {
            educationsShadowDrawRuleType = educationsShadowDrawRuleDto.drawType;
        }
        if ((i & 4) != 0) {
            num = educationsShadowDrawRuleDto.cornersRadius;
        }
        if ((i & 8) != 0) {
            marginsDto = educationsShadowDrawRuleDto.margins;
        }
        return educationsShadowDrawRuleDto.copy(str, educationsShadowDrawRuleType, num, marginsDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getViewId() {
        return this.viewId;
    }

    /* renamed from: component2, reason: from getter */
    public final EducationsShadowDrawRuleType getDrawType() {
        return this.drawType;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getCornersRadius() {
        return this.cornersRadius;
    }

    /* renamed from: component4, reason: from getter */
    public final MarginsDto getMargins() {
        return this.margins;
    }

    public final EducationsShadowDrawRuleDto copy(@Json(name = "view_id") String viewId, @Json(name = "draw_type") EducationsShadowDrawRuleType drawType, @Json(name = "corner_radius") Integer cornersRadius, @Json(name = "margins") MarginsDto margins) {
        return new EducationsShadowDrawRuleDto(viewId, drawType, cornersRadius, margins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationsShadowDrawRuleDto)) {
            return false;
        }
        EducationsShadowDrawRuleDto educationsShadowDrawRuleDto = (EducationsShadowDrawRuleDto) other;
        return jl40.l(this.viewId, educationsShadowDrawRuleDto.viewId) && this.drawType == educationsShadowDrawRuleDto.drawType && jl40.l(this.cornersRadius, educationsShadowDrawRuleDto.cornersRadius) && jl40.l(this.margins, educationsShadowDrawRuleDto.margins);
    }

    public final Integer getCornersRadius() {
        return this.cornersRadius;
    }

    public final EducationsShadowDrawRuleType getDrawType() {
        return this.drawType;
    }

    public final MarginsDto getMargins() {
        return this.margins;
    }

    public final String getViewId() {
        return this.viewId;
    }

    public int hashCode() {
        int hashCode = (this.drawType.hashCode() + (this.viewId.hashCode() * 31)) * 31;
        Integer num = this.cornersRadius;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        MarginsDto marginsDto = this.margins;
        return hashCode2 + (marginsDto != null ? marginsDto.hashCode() : 0);
    }

    public String toString() {
        return "EducationsShadowDrawRuleDto(viewId=" + this.viewId + ", drawType=" + this.drawType + ", cornersRadius=" + this.cornersRadius + ", margins=" + this.margins + Extension.C_BRAKE;
    }
}
