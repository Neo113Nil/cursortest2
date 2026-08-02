package com.ybsdk.feature.status.screen.internal.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.xvz;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0001\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/StatusScreenRequest;", "", "target", "", "additionalParams", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getTarget", "()Ljava/lang/String;", "getAdditionalParams", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-status-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class StatusScreenRequest {
    private final Map<String, String> additionalParams;
    private final String target;

    public StatusScreenRequest(@Json(name = "target") String str, @Json(name = "additional_data") Map<String, String> map) {
        this.target = str;
        this.additionalParams = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatusScreenRequest copy$default(StatusScreenRequest statusScreenRequest, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statusScreenRequest.target;
        }
        if ((i & 2) != 0) {
            map = statusScreenRequest.additionalParams;
        }
        return statusScreenRequest.copy(str, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    public final Map<String, String> component2() {
        return this.additionalParams;
    }

    public final StatusScreenRequest copy(@Json(name = "target") String target, @Json(name = "additional_data") Map<String, String> additionalParams) {
        return new StatusScreenRequest(target, additionalParams);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StatusScreenRequest)) {
            return false;
        }
        StatusScreenRequest statusScreenRequest = (StatusScreenRequest) other;
        return jl40.l(this.target, statusScreenRequest.target) && jl40.l(this.additionalParams, statusScreenRequest.additionalParams);
    }

    public final Map<String, String> getAdditionalParams() {
        return this.additionalParams;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        int hashCode = this.target.hashCode() * 31;
        Map<String, String> map = this.additionalParams;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public String toString() {
        return xvz.j("StatusScreenRequest(target=", this.target, ", additionalParams=", Extension.C_BRAKE, this.additionalParams);
    }
}
