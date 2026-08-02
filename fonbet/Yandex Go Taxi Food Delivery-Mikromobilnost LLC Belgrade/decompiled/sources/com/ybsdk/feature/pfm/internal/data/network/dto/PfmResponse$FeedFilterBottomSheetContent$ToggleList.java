package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.fcb0;
import defpackage.jl40;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000e\u001a\u00020\r2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\f¨\u0006\u001f"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterBottomSheetContent$ToggleList", "Lfcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "contentType", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$ToggleListItem;", "settings", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;Ljava/util/List;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "component2", "()Ljava/util/List;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterBottomSheetContent$ToggleList;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;Ljava/util/List;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterBottomSheetContent$ToggleList;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "getContentType", "Ljava/util/List;", "getSettings", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$FeedFilterBottomSheetContent$ToggleList implements fcb0 {
    private final PfmResponse.PfmBottomSheetContentType contentType;
    private final List<PfmResponse.ToggleListItem> settings;

    public PfmResponse$FeedFilterBottomSheetContent$ToggleList(@Json(name = "content_type") PfmResponse.PfmBottomSheetContentType pfmBottomSheetContentType, @Json(name = "settings") List<PfmResponse.ToggleListItem> list) {
        this.contentType = pfmBottomSheetContentType;
        this.settings = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PfmResponse$FeedFilterBottomSheetContent$ToggleList copy$default(PfmResponse$FeedFilterBottomSheetContent$ToggleList pfmResponse$FeedFilterBottomSheetContent$ToggleList, PfmResponse.PfmBottomSheetContentType pfmBottomSheetContentType, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            pfmBottomSheetContentType = pfmResponse$FeedFilterBottomSheetContent$ToggleList.contentType;
        }
        if ((i & 2) != 0) {
            list = pfmResponse$FeedFilterBottomSheetContent$ToggleList.settings;
        }
        return pfmResponse$FeedFilterBottomSheetContent$ToggleList.copy(pfmBottomSheetContentType, list);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.PfmBottomSheetContentType getContentType() {
        return this.contentType;
    }

    public final List<PfmResponse.ToggleListItem> component2() {
        return this.settings;
    }

    public final PfmResponse$FeedFilterBottomSheetContent$ToggleList copy(@Json(name = "content_type") PfmResponse.PfmBottomSheetContentType contentType, @Json(name = "settings") List<PfmResponse.ToggleListItem> settings) {
        return new PfmResponse$FeedFilterBottomSheetContent$ToggleList(contentType, settings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$FeedFilterBottomSheetContent$ToggleList)) {
            return false;
        }
        PfmResponse$FeedFilterBottomSheetContent$ToggleList pfmResponse$FeedFilterBottomSheetContent$ToggleList = (PfmResponse$FeedFilterBottomSheetContent$ToggleList) other;
        return this.contentType == pfmResponse$FeedFilterBottomSheetContent$ToggleList.contentType && jl40.l(this.settings, pfmResponse$FeedFilterBottomSheetContent$ToggleList.settings);
    }

    public final PfmResponse.PfmBottomSheetContentType getContentType() {
        return this.contentType;
    }

    public final List<PfmResponse.ToggleListItem> getSettings() {
        return this.settings;
    }

    public int hashCode() {
        return this.settings.hashCode() + (this.contentType.hashCode() * 31);
    }

    public String toString() {
        return "ToggleList(contentType=" + this.contentType + ", settings=" + this.settings + Extension.C_BRAKE;
    }
}
