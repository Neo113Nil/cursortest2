package com.ybsdk.feature.status.screen.internal.data;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.adapters.RawJsonString;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/ybsdk/feature/status/screen/internal/data/DivCommonRequest;", "", "divCommonRequestPayload", "", "communicationShownInfo", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "initialDeeplink", "sessionsCountWithoutFullscreen", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;Ljava/lang/String;I)V", "getDivCommonRequestPayload", "()Ljava/lang/String;", "getCommunicationShownInfo", "()Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "getInitialDeeplink", "getSessionsCountWithoutFullscreen", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-divkit-common-screen_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DivCommonRequest {
    private final CommunicationsShownInfoDto communicationShownInfo;
    private final String divCommonRequestPayload;
    private final String initialDeeplink;
    private final int sessionsCountWithoutFullscreen;

    public DivCommonRequest(@Json(name = "div_common_request_payload") @RawJsonString String str, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationsShownInfoDto, @Json(name = "initial_deeplink") String str2, @Json(name = "sessions_count_without_fullscreen") int i) {
        this.divCommonRequestPayload = str;
        this.communicationShownInfo = communicationsShownInfoDto;
        this.initialDeeplink = str2;
        this.sessionsCountWithoutFullscreen = i;
    }

    public static /* synthetic */ DivCommonRequest copy$default(DivCommonRequest divCommonRequest, String str, CommunicationsShownInfoDto communicationsShownInfoDto, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = divCommonRequest.divCommonRequestPayload;
        }
        if ((i2 & 2) != 0) {
            communicationsShownInfoDto = divCommonRequest.communicationShownInfo;
        }
        if ((i2 & 4) != 0) {
            str2 = divCommonRequest.initialDeeplink;
        }
        if ((i2 & 8) != 0) {
            i = divCommonRequest.sessionsCountWithoutFullscreen;
        }
        return divCommonRequest.copy(str, communicationsShownInfoDto, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDivCommonRequestPayload() {
        return this.divCommonRequestPayload;
    }

    /* renamed from: component2, reason: from getter */
    public final CommunicationsShownInfoDto getCommunicationShownInfo() {
        return this.communicationShownInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInitialDeeplink() {
        return this.initialDeeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    public final DivCommonRequest copy(@Json(name = "div_common_request_payload") @RawJsonString String divCommonRequestPayload, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationShownInfo, @Json(name = "initial_deeplink") String initialDeeplink, @Json(name = "sessions_count_without_fullscreen") int sessionsCountWithoutFullscreen) {
        return new DivCommonRequest(divCommonRequestPayload, communicationShownInfo, initialDeeplink, sessionsCountWithoutFullscreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DivCommonRequest)) {
            return false;
        }
        DivCommonRequest divCommonRequest = (DivCommonRequest) other;
        return jl40.l(this.divCommonRequestPayload, divCommonRequest.divCommonRequestPayload) && jl40.l(this.communicationShownInfo, divCommonRequest.communicationShownInfo) && jl40.l(this.initialDeeplink, divCommonRequest.initialDeeplink) && this.sessionsCountWithoutFullscreen == divCommonRequest.sessionsCountWithoutFullscreen;
    }

    public final CommunicationsShownInfoDto getCommunicationShownInfo() {
        return this.communicationShownInfo;
    }

    public final String getDivCommonRequestPayload() {
        return this.divCommonRequestPayload;
    }

    public final String getInitialDeeplink() {
        return this.initialDeeplink;
    }

    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    public int hashCode() {
        String str = this.divCommonRequestPayload;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationShownInfo;
        int hashCode2 = (hashCode + (communicationsShownInfoDto == null ? 0 : communicationsShownInfoDto.hashCode())) * 31;
        String str2 = this.initialDeeplink;
        return Integer.hashCode(this.sessionsCountWithoutFullscreen) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "DivCommonRequest(divCommonRequestPayload=" + this.divCommonRequestPayload + ", communicationShownInfo=" + this.communicationShownInfo + ", initialDeeplink=" + this.initialDeeplink + ", sessionsCountWithoutFullscreen=" + this.sessionsCountWithoutFullscreen + Extension.C_BRAKE;
    }
}
