package com.ybsdk.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/ybsdk/network/dto/ApplicationStatusResponse;", "", ACSPConstants.STATUS, "", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "supportUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getStatus", "()Ljava/lang/String;", "getTitle", "getDescription", "getSupportUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ApplicationStatusResponse {
    private final String description;
    private final String status;
    private final String supportUrl;
    private final String title;

    public ApplicationStatusResponse(@Json(name = "status") String str, @Json(name = "title") String str2, @Json(name = "description") String str3, @Json(name = "support_url") String str4) {
        this.status = str;
        this.title = str2;
        this.description = str3;
        this.supportUrl = str4;
    }

    public static /* synthetic */ ApplicationStatusResponse copy$default(ApplicationStatusResponse applicationStatusResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationStatusResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = applicationStatusResponse.title;
        }
        if ((i & 4) != 0) {
            str3 = applicationStatusResponse.description;
        }
        if ((i & 8) != 0) {
            str4 = applicationStatusResponse.supportUrl;
        }
        return applicationStatusResponse.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final ApplicationStatusResponse copy(@Json(name = "status") String status, @Json(name = "title") String title, @Json(name = "description") String description, @Json(name = "support_url") String supportUrl) {
        return new ApplicationStatusResponse(status, title, description, supportUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplicationStatusResponse)) {
            return false;
        }
        ApplicationStatusResponse applicationStatusResponse = (ApplicationStatusResponse) other;
        return jl40.l(this.status, applicationStatusResponse.status) && jl40.l(this.title, applicationStatusResponse.title) && jl40.l(this.description, applicationStatusResponse.description) && jl40.l(this.supportUrl, applicationStatusResponse.supportUrl);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getSupportUrl() {
        return this.supportUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.status.hashCode() * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.description;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.supportUrl;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.status;
        String str2 = this.title;
        return g8e.r(b64.v("ApplicationStatusResponse(status=", str, ", title=", str2, ", description="), this.description, ", supportUrl=", this.supportUrl, Extension.C_BRAKE);
    }
}
