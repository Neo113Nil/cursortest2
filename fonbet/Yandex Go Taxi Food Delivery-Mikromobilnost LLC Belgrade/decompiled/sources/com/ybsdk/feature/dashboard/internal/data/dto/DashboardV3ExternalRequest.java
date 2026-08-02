package com.ybsdk.feature.dashboard.internal.data.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.nfc.NfcProductTypeDto;
import defpackage.jl40;
import defpackage.xvz;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/ybsdk/feature/dashboard/internal/data/dto/DashboardV3ExternalRequest;", "", "memberId", "", "tokenizedProductTypes", "", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcProductTypeDto;", "nfcSystemInfo", "Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;", "sessionsCountWithoutFullscreen", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;I)V", "getMemberId", "()Ljava/lang/String;", "getTokenizedProductTypes", "()Ljava/util/List;", "getNfcSystemInfo", "()Lcom/ybsdk/feature/dashboard/internal/data/dto/NfcSystemInfo;", "getSessionsCountWithoutFullscreen", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DashboardV3ExternalRequest {
    private final String memberId;
    private final NfcSystemInfo nfcSystemInfo;
    private final int sessionsCountWithoutFullscreen;
    private final List<NfcProductTypeDto> tokenizedProductTypes;

    public /* synthetic */ DashboardV3ExternalRequest(String str, List list, NfcSystemInfo nfcSystemInfo, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : list, (i2 & 4) != 0 ? null : nfcSystemInfo, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardV3ExternalRequest copy$default(DashboardV3ExternalRequest dashboardV3ExternalRequest, String str, List list, NfcSystemInfo nfcSystemInfo, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dashboardV3ExternalRequest.memberId;
        }
        if ((i2 & 2) != 0) {
            list = dashboardV3ExternalRequest.tokenizedProductTypes;
        }
        if ((i2 & 4) != 0) {
            nfcSystemInfo = dashboardV3ExternalRequest.nfcSystemInfo;
        }
        if ((i2 & 8) != 0) {
            i = dashboardV3ExternalRequest.sessionsCountWithoutFullscreen;
        }
        return dashboardV3ExternalRequest.copy(str, list, nfcSystemInfo, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    public final List<NfcProductTypeDto> component2() {
        return this.tokenizedProductTypes;
    }

    /* renamed from: component3, reason: from getter */
    public final NfcSystemInfo getNfcSystemInfo() {
        return this.nfcSystemInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSessionsCountWithoutFullscreen() {
        return this.sessionsCountWithoutFullscreen;
    }

    public final DashboardV3ExternalRequest copy(@Json(name = "member_id") String memberId, @Json(name = "tokenized_product_types") List<? extends NfcProductTypeDto> tokenizedProductTypes, @Json(name = "nfc_system_info") NfcSystemInfo nfcSystemInfo, @Json(name = "sessions_count_without_fullscreen") int sessionsCountWithoutFullscreen) {
        return new DashboardV3ExternalRequest(memberId, tokenizedProductTypes, nfcSystemInfo, sessionsCountWithoutFullscreen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardV3ExternalRequest)) {
            return false;
        }
        DashboardV3ExternalRequest dashboardV3ExternalRequest = (DashboardV3ExternalRequest) other;
        return jl40.l(this.memberId, dashboardV3ExternalRequest.memberId) && jl40.l(this.tokenizedProductTypes, dashboardV3ExternalRequest.tokenizedProductTypes) && jl40.l(this.nfcSystemInfo, dashboardV3ExternalRequest.nfcSystemInfo) && this.sessionsCountWithoutFullscreen == dashboardV3ExternalRequest.sessionsCountWithoutFullscreen;
    }

    public final String getMemberId() {
        return this.memberId;
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
        int hashCode = this.memberId.hashCode() * 31;
        List<NfcProductTypeDto> list = this.tokenizedProductTypes;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        NfcSystemInfo nfcSystemInfo = this.nfcSystemInfo;
        return Integer.hashCode(this.sessionsCountWithoutFullscreen) + ((hashCode2 + (nfcSystemInfo != null ? nfcSystemInfo.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.memberId;
        List<NfcProductTypeDto> list = this.tokenizedProductTypes;
        NfcSystemInfo nfcSystemInfo = this.nfcSystemInfo;
        int i = this.sessionsCountWithoutFullscreen;
        StringBuilder r = xvz.r("DashboardV3ExternalRequest(memberId=", str, ", tokenizedProductTypes=", list, ", nfcSystemInfo=");
        r.append(nfcSystemInfo);
        r.append(", sessionsCountWithoutFullscreen=");
        r.append(i);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DashboardV3ExternalRequest(@Json(name = "member_id") String str, @Json(name = "tokenized_product_types") List<? extends NfcProductTypeDto> list, @Json(name = "nfc_system_info") NfcSystemInfo nfcSystemInfo, @Json(name = "sessions_count_without_fullscreen") int i) {
        this.memberId = str;
        this.tokenizedProductTypes = list;
        this.nfcSystemInfo = nfcSystemInfo;
        this.sessionsCountWithoutFullscreen = i;
    }
}
