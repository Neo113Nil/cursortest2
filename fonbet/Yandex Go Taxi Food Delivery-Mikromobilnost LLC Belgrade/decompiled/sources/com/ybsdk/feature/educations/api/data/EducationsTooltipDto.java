package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.oyr;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002$%B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto;", "", "anchor", "Lcom/ybsdk/feature/educations/api/data/EducationsTooltipAnchorDto;", "behaviour", "Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipBehaviour;", "alignment", "Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipAlignment;", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "margin", "", "<init>", "(Lcom/ybsdk/feature/educations/api/data/EducationsTooltipAnchorDto;Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipBehaviour;Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipAlignment;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;I)V", "getAnchor", "()Lcom/ybsdk/feature/educations/api/data/EducationsTooltipAnchorDto;", "getBehaviour", "()Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipBehaviour;", "getAlignment", "()Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipAlignment;", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getMargin", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "EducationsTooltipBehaviour", "EducationsTooltipAlignment", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationsTooltipDto {
    private final EducationsTooltipAlignment alignment;
    private final EducationsTooltipAnchorDto anchor;
    private final EducationsTooltipBehaviour behaviour;
    private final DivDataDto divkitData;
    private final int margin;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipAlignment;", "", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EducationsTooltipAlignment {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EducationsTooltipAlignment[] $VALUES;
        public static final EducationsTooltipAlignment TOP = new EducationsTooltipAlignment("TOP", 0);
        public static final EducationsTooltipAlignment BOTTOM = new EducationsTooltipAlignment("BOTTOM", 1);

        private static final /* synthetic */ EducationsTooltipAlignment[] $values() {
            return new EducationsTooltipAlignment[]{TOP, BOTTOM};
        }

        static {
            EducationsTooltipAlignment[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private EducationsTooltipAlignment(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EducationsTooltipAlignment valueOf(String str) {
            return (EducationsTooltipAlignment) Enum.valueOf(EducationsTooltipAlignment.class, str);
        }

        public static EducationsTooltipAlignment[] values() {
            return (EducationsTooltipAlignment[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsTooltipDto$EducationsTooltipBehaviour;", "", "<init>", "(Ljava/lang/String;I)V", "ABOVE_ANCHOR", "UNDER_ANCHOR", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EducationsTooltipBehaviour {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EducationsTooltipBehaviour[] $VALUES;
        public static final EducationsTooltipBehaviour ABOVE_ANCHOR = new EducationsTooltipBehaviour("ABOVE_ANCHOR", 0);
        public static final EducationsTooltipBehaviour UNDER_ANCHOR = new EducationsTooltipBehaviour("UNDER_ANCHOR", 1);

        private static final /* synthetic */ EducationsTooltipBehaviour[] $values() {
            return new EducationsTooltipBehaviour[]{ABOVE_ANCHOR, UNDER_ANCHOR};
        }

        static {
            EducationsTooltipBehaviour[] $values = $values();
            $VALUES = $values;
            $ENTRIES = a.a($values);
        }

        private EducationsTooltipBehaviour(String str, int i) {
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EducationsTooltipBehaviour valueOf(String str) {
            return (EducationsTooltipBehaviour) Enum.valueOf(EducationsTooltipBehaviour.class, str);
        }

        public static EducationsTooltipBehaviour[] values() {
            return (EducationsTooltipBehaviour[]) $VALUES.clone();
        }
    }

    public EducationsTooltipDto(@Json(name = "anchor") EducationsTooltipAnchorDto educationsTooltipAnchorDto, @Json(name = "behaviour") EducationsTooltipBehaviour educationsTooltipBehaviour, @Json(name = "alignment") EducationsTooltipAlignment educationsTooltipAlignment, @Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "margin") int i) {
        this.anchor = educationsTooltipAnchorDto;
        this.behaviour = educationsTooltipBehaviour;
        this.alignment = educationsTooltipAlignment;
        this.divkitData = divDataDto;
        this.margin = i;
    }

    public static /* synthetic */ EducationsTooltipDto copy$default(EducationsTooltipDto educationsTooltipDto, EducationsTooltipAnchorDto educationsTooltipAnchorDto, EducationsTooltipBehaviour educationsTooltipBehaviour, EducationsTooltipAlignment educationsTooltipAlignment, DivDataDto divDataDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            educationsTooltipAnchorDto = educationsTooltipDto.anchor;
        }
        if ((i2 & 2) != 0) {
            educationsTooltipBehaviour = educationsTooltipDto.behaviour;
        }
        if ((i2 & 4) != 0) {
            educationsTooltipAlignment = educationsTooltipDto.alignment;
        }
        if ((i2 & 8) != 0) {
            divDataDto = educationsTooltipDto.divkitData;
        }
        if ((i2 & 16) != 0) {
            i = educationsTooltipDto.margin;
        }
        int i3 = i;
        EducationsTooltipAlignment educationsTooltipAlignment2 = educationsTooltipAlignment;
        return educationsTooltipDto.copy(educationsTooltipAnchorDto, educationsTooltipBehaviour, educationsTooltipAlignment2, divDataDto, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final EducationsTooltipAnchorDto getAnchor() {
        return this.anchor;
    }

    /* renamed from: component2, reason: from getter */
    public final EducationsTooltipBehaviour getBehaviour() {
        return this.behaviour;
    }

    /* renamed from: component3, reason: from getter */
    public final EducationsTooltipAlignment getAlignment() {
        return this.alignment;
    }

    /* renamed from: component4, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMargin() {
        return this.margin;
    }

    public final EducationsTooltipDto copy(@Json(name = "anchor") EducationsTooltipAnchorDto anchor, @Json(name = "behaviour") EducationsTooltipBehaviour behaviour, @Json(name = "alignment") EducationsTooltipAlignment alignment, @Json(name = "divkit_data") DivDataDto divkitData, @Json(name = "margin") int margin) {
        return new EducationsTooltipDto(anchor, behaviour, alignment, divkitData, margin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationsTooltipDto)) {
            return false;
        }
        EducationsTooltipDto educationsTooltipDto = (EducationsTooltipDto) other;
        return jl40.l(this.anchor, educationsTooltipDto.anchor) && this.behaviour == educationsTooltipDto.behaviour && this.alignment == educationsTooltipDto.alignment && jl40.l(this.divkitData, educationsTooltipDto.divkitData) && this.margin == educationsTooltipDto.margin;
    }

    public final EducationsTooltipAlignment getAlignment() {
        return this.alignment;
    }

    public final EducationsTooltipAnchorDto getAnchor() {
        return this.anchor;
    }

    public final EducationsTooltipBehaviour getBehaviour() {
        return this.behaviour;
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final int getMargin() {
        return this.margin;
    }

    public int hashCode() {
        return Integer.hashCode(this.margin) + ((this.divkitData.hashCode() + ((this.alignment.hashCode() + ((this.behaviour.hashCode() + (this.anchor.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        EducationsTooltipAnchorDto educationsTooltipAnchorDto = this.anchor;
        EducationsTooltipBehaviour educationsTooltipBehaviour = this.behaviour;
        EducationsTooltipAlignment educationsTooltipAlignment = this.alignment;
        DivDataDto divDataDto = this.divkitData;
        int i = this.margin;
        StringBuilder sb = new StringBuilder("EducationsTooltipDto(anchor=");
        sb.append(educationsTooltipAnchorDto);
        sb.append(", behaviour=");
        sb.append(educationsTooltipBehaviour);
        sb.append(", alignment=");
        sb.append(educationsTooltipAlignment);
        sb.append(", divkitData=");
        sb.append(divDataDto);
        sb.append(", margin=");
        return oyr.m(i, Extension.C_BRAKE, sb);
    }
}
