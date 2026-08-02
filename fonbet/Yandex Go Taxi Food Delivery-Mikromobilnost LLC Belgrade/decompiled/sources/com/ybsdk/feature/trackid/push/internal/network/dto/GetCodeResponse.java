package com.ybsdk.feature.trackid.push.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/trackid/push/internal/network/dto/GetCodeResponse;", "", "analytics", "", "Lcom/ybsdk/feature/trackid/push/internal/network/dto/AnalyticsDto;", "overrideData", "Lcom/ybsdk/feature/trackid/push/internal/network/dto/OverrideDto;", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/trackid/push/internal/network/dto/OverrideDto;)V", "getAnalytics", "()Ljava/util/List;", "getOverrideData", "()Lcom/ybsdk/feature/trackid/push/internal/network/dto/OverrideDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-trackid-push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetCodeResponse {

    @Json(name = "analytics")
    private final List<AnalyticsDto> analytics;

    @Json(name = "override_data")
    private final OverrideDto overrideData;

    public GetCodeResponse(List<AnalyticsDto> list, OverrideDto overrideDto) {
        this.analytics = list;
        this.overrideData = overrideDto;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCodeResponse copy$default(GetCodeResponse getCodeResponse, List list, OverrideDto overrideDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getCodeResponse.analytics;
        }
        if ((i & 2) != 0) {
            overrideDto = getCodeResponse.overrideData;
        }
        return getCodeResponse.copy(list, overrideDto);
    }

    public final List<AnalyticsDto> component1() {
        return this.analytics;
    }

    /* renamed from: component2, reason: from getter */
    public final OverrideDto getOverrideData() {
        return this.overrideData;
    }

    public final GetCodeResponse copy(List<AnalyticsDto> analytics, OverrideDto overrideData) {
        return new GetCodeResponse(analytics, overrideData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetCodeResponse)) {
            return false;
        }
        GetCodeResponse getCodeResponse = (GetCodeResponse) other;
        return jl40.l(this.analytics, getCodeResponse.analytics) && jl40.l(this.overrideData, getCodeResponse.overrideData);
    }

    public final List<AnalyticsDto> getAnalytics() {
        return this.analytics;
    }

    public final OverrideDto getOverrideData() {
        return this.overrideData;
    }

    public int hashCode() {
        return this.overrideData.hashCode() + (this.analytics.hashCode() * 31);
    }

    public String toString() {
        return "GetCodeResponse(analytics=" + this.analytics + ", overrideData=" + this.overrideData + Extension.C_BRAKE;
    }
}
