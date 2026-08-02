package com.ybsdk.feature.stories.internal.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.core.common.data.network.dto.nfc.NfcInfoDto;
import defpackage.b64;
import defpackage.jl40;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0001\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/ybsdk/feature/stories/internal/network/dto/GetVerticalStoriesRequest;", "", "startStoryId", "", "nfcInfo", "Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "additionalData", "", "<init>", "(Ljava/lang/String;Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;Ljava/util/Map;)V", "getStartStoryId", "()Ljava/lang/String;", "getNfcInfo", "()Lcom/ybsdk/core/common/data/network/dto/nfc/NfcInfoDto;", "getAdditionalData", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-stories_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GetVerticalStoriesRequest {
    private final Map<String, Object> additionalData;
    private final NfcInfoDto nfcInfo;
    private final String startStoryId;

    public GetVerticalStoriesRequest(@Json(name = "start_story_id") String str, @Json(name = "nfc_info") NfcInfoDto nfcInfoDto, @Json(name = "additional_data") Map<String, ? extends Object> map) {
        this.startStoryId = str;
        this.nfcInfo = nfcInfoDto;
        this.additionalData = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetVerticalStoriesRequest copy$default(GetVerticalStoriesRequest getVerticalStoriesRequest, String str, NfcInfoDto nfcInfoDto, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getVerticalStoriesRequest.startStoryId;
        }
        if ((i & 2) != 0) {
            nfcInfoDto = getVerticalStoriesRequest.nfcInfo;
        }
        if ((i & 4) != 0) {
            map = getVerticalStoriesRequest.additionalData;
        }
        return getVerticalStoriesRequest.copy(str, nfcInfoDto, map);
    }

    /* renamed from: component1, reason: from getter */
    public final String getStartStoryId() {
        return this.startStoryId;
    }

    /* renamed from: component2, reason: from getter */
    public final NfcInfoDto getNfcInfo() {
        return this.nfcInfo;
    }

    public final Map<String, Object> component3() {
        return this.additionalData;
    }

    public final GetVerticalStoriesRequest copy(@Json(name = "start_story_id") String startStoryId, @Json(name = "nfc_info") NfcInfoDto nfcInfo, @Json(name = "additional_data") Map<String, ? extends Object> additionalData) {
        return new GetVerticalStoriesRequest(startStoryId, nfcInfo, additionalData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetVerticalStoriesRequest)) {
            return false;
        }
        GetVerticalStoriesRequest getVerticalStoriesRequest = (GetVerticalStoriesRequest) other;
        return jl40.l(this.startStoryId, getVerticalStoriesRequest.startStoryId) && jl40.l(this.nfcInfo, getVerticalStoriesRequest.nfcInfo) && jl40.l(this.additionalData, getVerticalStoriesRequest.additionalData);
    }

    public final Map<String, Object> getAdditionalData() {
        return this.additionalData;
    }

    public final NfcInfoDto getNfcInfo() {
        return this.nfcInfo;
    }

    public final String getStartStoryId() {
        return this.startStoryId;
    }

    public int hashCode() {
        return this.additionalData.hashCode() + ((this.nfcInfo.hashCode() + (this.startStoryId.hashCode() * 31)) * 31);
    }

    public String toString() {
        String str = this.startStoryId;
        NfcInfoDto nfcInfoDto = this.nfcInfo;
        Map<String, Object> map = this.additionalData;
        StringBuilder sb = new StringBuilder("GetVerticalStoriesRequest(startStoryId=");
        sb.append(str);
        sb.append(", nfcInfo=");
        sb.append(nfcInfoDto);
        sb.append(", additionalData=");
        return b64.r(sb, map, Extension.C_BRAKE);
    }
}
