package com.ybsdk.feature.educations.api.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.divkit.api.dto.DivDataDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/educations/api/data/EducationVideoContentDto;", "", "url", "", "divkitData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "<init>", "(Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;)V", "getUrl", "()Ljava/lang/String;", "getDivkitData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-educations-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EducationVideoContentDto {
    private final DivDataDto divkitData;
    private final String url;

    public EducationVideoContentDto(@Json(name = "url") String str, @Json(name = "divkit_data") DivDataDto divDataDto) {
        this.url = str;
        this.divkitData = divDataDto;
    }

    public static /* synthetic */ EducationVideoContentDto copy$default(EducationVideoContentDto educationVideoContentDto, String str, DivDataDto divDataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationVideoContentDto.url;
        }
        if ((i & 2) != 0) {
            divDataDto = educationVideoContentDto.divkitData;
        }
        return educationVideoContentDto.copy(str, divDataDto);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final EducationVideoContentDto copy(@Json(name = "url") String url, @Json(name = "divkit_data") DivDataDto divkitData) {
        return new EducationVideoContentDto(url, divkitData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EducationVideoContentDto)) {
            return false;
        }
        EducationVideoContentDto educationVideoContentDto = (EducationVideoContentDto) other;
        return jl40.l(this.url, educationVideoContentDto.url) && jl40.l(this.divkitData, educationVideoContentDto.divkitData);
    }

    public final DivDataDto getDivkitData() {
        return this.divkitData;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.divkitData.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        return "EducationVideoContentDto(url=" + this.url + ", divkitData=" + this.divkitData + Extension.C_BRAKE;
    }
}
