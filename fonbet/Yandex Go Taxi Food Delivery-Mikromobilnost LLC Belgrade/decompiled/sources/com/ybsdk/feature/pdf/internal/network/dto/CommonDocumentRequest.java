package com.ybsdk.feature.pdf.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.jl40;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0016\b\u0001\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JH\u0010\u0017\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/pdf/internal/network/dto/CommonDocumentRequest;", "", "id", "", "target", "lifetimeInSeconds", "", "additionalData", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getTarget", "getLifetimeInSeconds", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAdditionalData", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;)Lcom/ybsdk/feature/pdf/internal/network/dto/CommonDocumentRequest;", "equals", "", "other", "hashCode", "", "toString", "feature-pdf_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CommonDocumentRequest {
    private final Map<String, String> additionalData;
    private final String id;
    private final Long lifetimeInSeconds;
    private final String target;

    public CommonDocumentRequest(@Json(name = "id") String str, @Json(name = "target") String str2, @Json(name = "lifetime_in_seconds") Long l, @Json(name = "additional_data") Map<String, String> map) {
        this.id = str;
        this.target = str2;
        this.lifetimeInSeconds = l;
        this.additionalData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CommonDocumentRequest copy$default(CommonDocumentRequest commonDocumentRequest, String str, String str2, Long l, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = commonDocumentRequest.id;
        }
        if ((i & 2) != 0) {
            str2 = commonDocumentRequest.target;
        }
        if ((i & 4) != 0) {
            l = commonDocumentRequest.lifetimeInSeconds;
        }
        if ((i & 8) != 0) {
            map = commonDocumentRequest.additionalData;
        }
        return commonDocumentRequest.copy(str, str2, l, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTarget() {
        return this.target;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getLifetimeInSeconds() {
        return this.lifetimeInSeconds;
    }

    public final Map<String, String> component4() {
        return this.additionalData;
    }

    public final CommonDocumentRequest copy(@Json(name = "id") String id, @Json(name = "target") String target, @Json(name = "lifetime_in_seconds") Long lifetimeInSeconds, @Json(name = "additional_data") Map<String, String> additionalData) {
        return new CommonDocumentRequest(id, target, lifetimeInSeconds, additionalData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CommonDocumentRequest)) {
            return false;
        }
        CommonDocumentRequest commonDocumentRequest = (CommonDocumentRequest) other;
        return jl40.l(this.id, commonDocumentRequest.id) && jl40.l(this.target, commonDocumentRequest.target) && jl40.l(this.lifetimeInSeconds, commonDocumentRequest.lifetimeInSeconds) && jl40.l(this.additionalData, commonDocumentRequest.additionalData);
    }

    public final Map<String, String> getAdditionalData() {
        return this.additionalData;
    }

    public final String getId() {
        return this.id;
    }

    public final Long getLifetimeInSeconds() {
        return this.lifetimeInSeconds;
    }

    public final String getTarget() {
        return this.target;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.target;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.lifetimeInSeconds;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Map<String, String> map = this.additionalData;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.target;
        Long l = this.lifetimeInSeconds;
        Map<String, String> map = this.additionalData;
        StringBuilder v = b64.v("CommonDocumentRequest(id=", str, ", target=", str2, ", lifetimeInSeconds=");
        v.append(l);
        v.append(", additionalData=");
        v.append(map);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
