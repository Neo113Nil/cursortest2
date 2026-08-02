package com.ybsdk.core.utils.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/ybsdk/core/utils/dto/FailDataResponse;", "", "title", "", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "icon", "Lcom/ybsdk/core/utils/dto/UtilsThemedParameter;", "supportUrl", "techInfo", "traceId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ybsdk/core/utils/dto/UtilsThemedParameter;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "getIcon", "()Lcom/ybsdk/core/utils/dto/UtilsThemedParameter;", "getSupportUrl", "getTechInfo", "getTraceId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FailDataResponse {
    private final String description;
    private final UtilsThemedParameter<String> icon;
    private final String supportUrl;
    private final String techInfo;
    private final String title;
    private final String traceId;

    public FailDataResponse(@Json(name = "title") String str, @Json(name = "description") String str2, @Json(name = "icon") UtilsThemedParameter<String> utilsThemedParameter, @Json(name = "support_url") String str3, @Json(name = "tech_info") String str4, @Json(ignore = true) String str5) {
        this.title = str;
        this.description = str2;
        this.icon = utilsThemedParameter;
        this.supportUrl = str3;
        this.techInfo = str4;
        this.traceId = str5;
    }

    public static /* synthetic */ FailDataResponse copy$default(FailDataResponse failDataResponse, String str, String str2, UtilsThemedParameter utilsThemedParameter, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = failDataResponse.title;
        }
        if ((i & 2) != 0) {
            str2 = failDataResponse.description;
        }
        if ((i & 4) != 0) {
            utilsThemedParameter = failDataResponse.icon;
        }
        if ((i & 8) != 0) {
            str3 = failDataResponse.supportUrl;
        }
        if ((i & 16) != 0) {
            str4 = failDataResponse.techInfo;
        }
        if ((i & 32) != 0) {
            str5 = failDataResponse.traceId;
        }
        String str6 = str4;
        String str7 = str5;
        return failDataResponse.copy(str, str2, utilsThemedParameter, str3, str6, str7);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final UtilsThemedParameter<String> component3() {
        return this.icon;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTechInfo() {
        return this.techInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTraceId() {
        return this.traceId;
    }

    public final FailDataResponse copy(@Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "icon") UtilsThemedParameter<String> icon, @Json(name = "support_url") String supportUrl, @Json(name = "tech_info") String techInfo, @Json(ignore = true) String traceId) {
        return new FailDataResponse(title, description, icon, supportUrl, techInfo, traceId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FailDataResponse)) {
            return false;
        }
        FailDataResponse failDataResponse = (FailDataResponse) other;
        return jl40.l(this.title, failDataResponse.title) && jl40.l(this.description, failDataResponse.description) && jl40.l(this.icon, failDataResponse.icon) && jl40.l(this.supportUrl, failDataResponse.supportUrl) && jl40.l(this.techInfo, failDataResponse.techInfo) && jl40.l(this.traceId, failDataResponse.traceId);
    }

    public final String getDescription() {
        return this.description;
    }

    public final UtilsThemedParameter<String> getIcon() {
        return this.icon;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final String getTechInfo() {
        return this.techInfo;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTraceId() {
        return this.traceId;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        UtilsThemedParameter<String> utilsThemedParameter = this.icon;
        int hashCode3 = (hashCode2 + (utilsThemedParameter == null ? 0 : utilsThemedParameter.hashCode())) * 31;
        String str2 = this.supportUrl;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.techInfo;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.traceId;
        return hashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        UtilsThemedParameter<String> utilsThemedParameter = this.icon;
        String str3 = this.supportUrl;
        String str4 = this.techInfo;
        String str5 = this.traceId;
        StringBuilder v = b64.v("FailDataResponse(title=", str, ", description=", str2, ", icon=");
        v.append(utilsThemedParameter);
        v.append(", supportUrl=");
        v.append(str3);
        v.append(", techInfo=");
        return g8e.r(v, str4, ", traceId=", str5, Extension.C_BRAKE);
    }

    public /* synthetic */ FailDataResponse(String str, String str2, UtilsThemedParameter utilsThemedParameter, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, utilsThemedParameter, str3, str4, (i & 32) != 0 ? null : str5);
    }
}
