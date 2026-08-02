package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.CommunicationsShownInfoDto;
import com.ybsdk.core.common.data.network.dto.nfc.NfcProductTypeDto;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001BS\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003JU\u0010!\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0003\u0010\u000b\u001a\u00020\f2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015¨\u0006'"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3Request;", "", "tokenizedProductTypes", "", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;", "nfcSystemInfo", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;", "initialDeeplink", "", "communicationShownInfo", "Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "sessionsCountWithoutFullscreen", "", "hash", "<init>", "(Ljava/util/List;Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;ILjava/lang/String;)V", "getTokenizedProductTypes", "()Ljava/util/List;", "getNfcSystemInfo", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;", "getInitialDeeplink", "()Ljava/lang/String;", "getCommunicationShownInfo", "()Lcom/ybsdk/core/common/data/network/dto/CommunicationsShownInfoDto;", "getSessionsCountWithoutFullscreen", "()I", "getHash", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardV3Request {
    private final CommunicationsShownInfoDto communicationShownInfo;
    private final String hash;
    private final String initialDeeplink;
    private final NfcSystemInfo nfcSystemInfo;
    private final int sessionsCountWithoutFullscreen;
    private final List<NfcProductTypeDto> tokenizedProductTypes;

    public /* synthetic */ DashboardV3Request(List list, NfcSystemInfo nfcSystemInfo, String str, CommunicationsShownInfoDto communicationsShownInfoDto, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? null : nfcSystemInfo, str, communicationsShownInfoDto, i, (i2 & 32) != 0 ? null : str2);
    }

    public static /* synthetic */ DashboardV3Request copy$default(DashboardV3Request dashboardV3Request, List list, NfcSystemInfo nfcSystemInfo, String str, CommunicationsShownInfoDto communicationsShownInfoDto, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = dashboardV3Request.tokenizedProductTypes;
        }
        if ((i2 & 2) != 0) {
            nfcSystemInfo = dashboardV3Request.nfcSystemInfo;
        }
        if ((i2 & 4) != 0) {
            str = dashboardV3Request.initialDeeplink;
        }
        if ((i2 & 8) != 0) {
            communicationsShownInfoDto = dashboardV3Request.communicationShownInfo;
        }
        if ((i2 & 16) != 0) {
            i = dashboardV3Request.sessionsCountWithoutFullscreen;
        }
        if ((i2 & 32) != 0) {
            str2 = dashboardV3Request.hash;
        }
        int i3 = i;
        String str3 = str2;
        return dashboardV3Request.copy(list, nfcSystemInfo, str, communicationsShownInfoDto, i3, str3);
    }

    public final List<NfcProductTypeDto> component1() {
        return this.tokenizedProductTypes;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcSystemInfo getNfcSystemInfo() {
        return this.nfcSystemInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getInitialDeeplink() {
        return this.initialDeeplink;
    }

    /* renamed from: component4, reason: from getter */
    public final CommunicationsShownInfoDto getCommunicationShownInfo() {
        return this.communicationShownInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    /* renamed from: component6, reason: from getter */
    public final String getHash() {
        return this.hash;
    }

    public final DashboardV3Request copy(@Json(name = "tokenized_product_types") List<? extends NfcProductTypeDto> tokenizedProductTypes, @Json(name = "nfc_system_info") NfcSystemInfo nfcSystemInfo, @Json(name = "initial_deeplink") String initialDeeplink, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationShownInfo, @Json(name = "sessions_count_without_fullscreen") int sessionsCountWithoutFullscreen, @Json(name = "hash") String hash) {
        return new DashboardV3Request(tokenizedProductTypes, nfcSystemInfo, initialDeeplink, communicationShownInfo, sessionsCountWithoutFullscreen, hash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardV3Request)) {
            return false;
        }
        DashboardV3Request dashboardV3Request = (DashboardV3Request) other;
        return jl40.l(this.tokenizedProductTypes, dashboardV3Request.tokenizedProductTypes) && jl40.l(this.nfcSystemInfo, dashboardV3Request.nfcSystemInfo) && jl40.l(this.initialDeeplink, dashboardV3Request.initialDeeplink) && jl40.l(this.communicationShownInfo, dashboardV3Request.communicationShownInfo) && this.sessionsCountWithoutFullscreen == dashboardV3Request.sessionsCountWithoutFullscreen && jl40.l(this.hash, dashboardV3Request.hash);
    }

    public final CommunicationsShownInfoDto getCommunicationShownInfo() {
        return this.communicationShownInfo;
    }

    public final String getHash() {
        return this.hash;
    }

    public final String getInitialDeeplink() {
        return this.initialDeeplink;
    }

    public final NfcSystemInfo getNfcSystemInfo() {
        return this.nfcSystemInfo;
    }

    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    public final List<NfcProductTypeDto> getTokenizedProductTypes() {
        return this.tokenizedProductTypes;
    }

    public int hashCode() {
        List<NfcProductTypeDto> list = this.tokenizedProductTypes;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        NfcSystemInfo nfcSystemInfo = this.nfcSystemInfo;
        int hashCode2 = (hashCode + (nfcSystemInfo == null ? 0 : nfcSystemInfo.hashCode())) * 31;
        String str = this.initialDeeplink;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationShownInfo;
        int b = oyr.b(this.sessionsCountWithoutFullscreen, (hashCode3 + (communicationsShownInfoDto == null ? 0 : communicationsShownInfoDto.hashCode())) * 31, 31);
        String str2 = this.hash;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        List<NfcProductTypeDto> list = this.tokenizedProductTypes;
        NfcSystemInfo nfcSystemInfo = this.nfcSystemInfo;
        String str = this.initialDeeplink;
        CommunicationsShownInfoDto communicationsShownInfoDto = this.communicationShownInfo;
        int i = this.sessionsCountWithoutFullscreen;
        String str2 = this.hash;
        StringBuilder sb = new StringBuilder("DashboardV3Request(tokenizedProductTypes=");
        sb.append(list);
        sb.append(", nfcSystemInfo=");
        sb.append(nfcSystemInfo);
        sb.append(", initialDeeplink=");
        sb.append(str);
        sb.append(", communicationShownInfo=");
        sb.append(communicationsShownInfoDto);
        sb.append(", sessionsCountWithoutFullscreen=");
        return xvz.h(i, ", hash=", str2, Extension.C_BRAKE, sb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardV3Request(@Json(name = "tokenized_product_types") List<? extends NfcProductTypeDto> list, @Json(name = "nfc_system_info") NfcSystemInfo nfcSystemInfo, @Json(name = "initial_deeplink") String str, @Json(name = "communications_shown_info") CommunicationsShownInfoDto communicationsShownInfoDto, @Json(name = "sessions_count_without_fullscreen") int i, @Json(name = "hash") String str2) {
        this.tokenizedProductTypes = list;
        this.nfcSystemInfo = nfcSystemInfo;
        this.initialDeeplink = str;
        this.communicationShownInfo = communicationsShownInfoDto;
        this.sessionsCountWithoutFullscreen = i;
        this.hash = str2;
    }
}
