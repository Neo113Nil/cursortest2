package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import defpackage.oo31;
import defpackage.tse0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014JJ\u0010\u001b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\nHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "", "name", "", "eventId", "defaultsGroup", "steps", "", "Lcom/ybsdk/feature/educations/api/data/EducationStepDto;", "showingDelay", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getName", "()Ljava/lang/String;", "getEventId", "getDefaultsGroup", "getSteps", "()Ljava/util/List;", "getShowingDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/ybsdk/feature/educations/api/data/EducationsV2Dto;", "equals", "", "other", "hashCode", "toString", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationsV2Dto {
    private final String defaultsGroup;
    private final String eventId;
    private final String name;
    private final Integer showingDelay;
    private final List<EducationStepDto> steps;

    public EducationsV2Dto(@Json(name = "name") String str, @Json(name = "event_id") String str2, @Json(name = "defaults_group") String str3, @Json(name = "steps") List<EducationStepDto> list, @Json(name = "showing_delay") Integer num) {
        this.name = str;
        this.eventId = str2;
        this.defaultsGroup = str3;
        this.steps = list;
        this.showingDelay = num;
    }

    public static /* synthetic */ EducationsV2Dto copy$default(EducationsV2Dto educationsV2Dto, String str, String str2, String str3, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationsV2Dto.name;
        }
        if ((i & 2) != 0) {
            str2 = educationsV2Dto.eventId;
        }
        if ((i & 4) != 0) {
            str3 = educationsV2Dto.defaultsGroup;
        }
        if ((i & 8) != 0) {
            list = educationsV2Dto.steps;
        }
        if ((i & 16) != 0) {
            num = educationsV2Dto.showingDelay;
        }
        Integer num2 = num;
        String str4 = str3;
        return educationsV2Dto.copy(str, str2, str4, list, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventId() {
        return this.eventId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDefaultsGroup() {
        return this.defaultsGroup;
    }

    public final List<EducationStepDto> component4() {
        return this.steps;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getShowingDelay() {
        return this.showingDelay;
    }

    public final EducationsV2Dto copy(@Json(name = "name") String name, @Json(name = "event_id") String eventId, @Json(name = "defaults_group") String defaultsGroup, @Json(name = "steps") List<EducationStepDto> steps, @Json(name = "showing_delay") Integer showingDelay) {
        return new EducationsV2Dto(name, eventId, defaultsGroup, steps, showingDelay);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationsV2Dto)) {
            return false;
        }
        EducationsV2Dto educationsV2Dto = (EducationsV2Dto) other;
        return jl40.l(this.name, educationsV2Dto.name) && jl40.l(this.eventId, educationsV2Dto.eventId) && jl40.l(this.defaultsGroup, educationsV2Dto.defaultsGroup) && jl40.l(this.steps, educationsV2Dto.steps) && jl40.l(this.showingDelay, educationsV2Dto.showingDelay);
    }

    public final String getDefaultsGroup() {
        return this.defaultsGroup;
    }

    public final String getEventId() {
        return this.eventId;
    }

    public final String getName() {
        return this.name;
    }

    public final Integer getShowingDelay() {
        return this.showingDelay;
    }

    public final List<EducationStepDto> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int b = unr0.b(this.name.hashCode() * 31, 31, this.eventId);
        String str = this.defaultsGroup;
        int c = unr0.c((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.steps);
        Integer num = this.showingDelay;
        return c + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        String str = this.name;
        String str2 = this.eventId;
        String str3 = this.defaultsGroup;
        List<EducationStepDto> list = this.steps;
        Integer num = this.showingDelay;
        StringBuilder v = b64.v("EducationsV2Dto(name=", str, ", eventId=", str2, ", defaultsGroup=");
        tse0.x(str3, ", steps=", ", showingDelay=", v, list);
        return oo31.j(v, num, Extension.C_BRAKE);
    }
}
