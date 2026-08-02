package com.ybsdk.feature.divkit.api.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0017\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003JC\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/ybsdk/feature/divkit/api/dto/DivScreenDto;", "", "title", "", "subtitle", "divData", "Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "analyticParameters", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getDivData", "()Lcom/ybsdk/feature/divkit/api/dto/DivDataDto;", "getAnalyticParameters", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-divkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivScreenDto {
    private final Map<String, Object> analyticParameters;
    private final DivDataDto divData;
    private final String subtitle;
    private final String title;

    public DivScreenDto(@Json(name = "title") String str, @Json(name = "subtitle") String str2, @Json(name = "divkit_data") DivDataDto divDataDto, @Json(name = "analytic_parameters") Map<String, ? extends Object> map) {
        this.title = str;
        this.subtitle = str2;
        this.divData = divDataDto;
        this.analyticParameters = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DivScreenDto copy$default(DivScreenDto divScreenDto, String str, String str2, DivDataDto divDataDto, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = divScreenDto.title;
        }
        if ((i & 2) != 0) {
            str2 = divScreenDto.subtitle;
        }
        if ((i & 4) != 0) {
            divDataDto = divScreenDto.divData;
        }
        if ((i & 8) != 0) {
            map = divScreenDto.analyticParameters;
        }
        return divScreenDto.copy(str, str2, divDataDto, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final DivDataDto getDivData() {
        return this.divData;
    }

    public final Map<String, Object> component4() {
        return this.analyticParameters;
    }

    public final DivScreenDto copy(@Json(name = "title") String title, @Json(name = "subtitle") String subtitle, @Json(name = "divkit_data") DivDataDto divData, @Json(name = "analytic_parameters") Map<String, ? extends Object> analyticParameters) {
        return new DivScreenDto(title, subtitle, divData, analyticParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivScreenDto)) {
            return false;
        }
        DivScreenDto divScreenDto = (DivScreenDto) other;
        return jl40.l(this.title, divScreenDto.title) && jl40.l(this.subtitle, divScreenDto.subtitle) && jl40.l(this.divData, divScreenDto.divData) && jl40.l(this.analyticParameters, divScreenDto.analyticParameters);
    }

    public final Map<String, Object> getAnalyticParameters() {
        return this.analyticParameters;
    }

    public final DivDataDto getDivData() {
        return this.divData;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int hashCode2 = (this.divData.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Map<String, Object> map = this.analyticParameters;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        DivDataDto divDataDto = this.divData;
        Map<String, Object> map = this.analyticParameters;
        StringBuilder v = b64.v("DivScreenDto(title=", str, ", subtitle=", str2, ", divData=");
        v.append(divDataDto);
        v.append(", analyticParameters=");
        v.append(map);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
