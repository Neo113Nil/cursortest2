package com.ybsdk.feature.trackid.push.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.fex;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/trackid/push/internal/network/dto/AnalyticsDto;", "", "", "eventName", "Lfex;", "params", "<init>", "(Ljava/lang/String;Lfex;)V", "component1", "()Ljava/lang/String;", "component2", "()Lfex;", "copy", "(Ljava/lang/String;Lfex;)Lcom/ybsdk/feature/trackid/push/internal/network/dto/AnalyticsDto;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getEventName", "Lfex;", "getParams", "feature-trackid-push_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AnalyticsDto {

    @Json(name = "event_name")
    private final String eventName;

    @Json(name = "params")
    private final fex params;

    public AnalyticsDto(String str, fex fexVar) {
        this.eventName = str;
        this.params = fexVar;
    }

    public static /* synthetic */ AnalyticsDto copy$default(AnalyticsDto analyticsDto, String str, fex fexVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = analyticsDto.eventName;
        }
        if ((i & 2) != 0) {
            fexVar = analyticsDto.params;
        }
        return analyticsDto.copy(str, fexVar);
    }

    /* renamed from: component1, reason: from getter */
    public final String getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final fex getParams() {
        return this.params;
    }

    public final AnalyticsDto copy(String eventName, fex params) {
        return new AnalyticsDto(eventName, params);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsDto)) {
            return false;
        }
        AnalyticsDto analyticsDto = (AnalyticsDto) other;
        return jl40.l(this.eventName, analyticsDto.eventName) && jl40.l(this.params, analyticsDto.params);
    }

    public final String getEventName() {
        return this.eventName;
    }

    public final fex getParams() {
        return this.params;
    }

    public int hashCode() {
        return this.params.a.hashCode() + (this.eventName.hashCode() * 31);
    }

    public String toString() {
        return "AnalyticsDto(eventName=" + this.eventName + ", params=" + this.params + Extension.C_BRAKE;
    }
}
