package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.fcb0;
import defpackage.jl40;
import defpackage.ly3;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0013\u001a\u00020\u00122\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u000fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, d2 = {"com/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterBottomSheetContent$SelectableList", "Lfcb0;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "contentType", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/FilterId;", "selectedOption", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$SelectableListItem;", "options", "<init>", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterBottomSheetContent$SelectableList;", "copy", "(Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;Ljava/lang/String;Ljava/util/List;)Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterBottomSheetContent$SelectableList;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "getContentType", "Ljava/lang/String;", "getSelectedOption", "Ljava/util/List;", "getOptions", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PfmResponse$FeedFilterBottomSheetContent$SelectableList implements fcb0 {
    private final PfmResponse.PfmBottomSheetContentType contentType;
    private final List<PfmResponse.SelectableListItem> options;
    private final String selectedOption;

    public PfmResponse$FeedFilterBottomSheetContent$SelectableList(@Json(name = "content_type") PfmResponse.PfmBottomSheetContentType pfmBottomSheetContentType, @Json(name = "selected_option") String str, @Json(name = "options") List<PfmResponse.SelectableListItem> list) {
        this.contentType = pfmBottomSheetContentType;
        this.selectedOption = str;
        this.options = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PfmResponse$FeedFilterBottomSheetContent$SelectableList copy$default(PfmResponse$FeedFilterBottomSheetContent$SelectableList pfmResponse$FeedFilterBottomSheetContent$SelectableList, PfmResponse.PfmBottomSheetContentType pfmBottomSheetContentType, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            pfmBottomSheetContentType = pfmResponse$FeedFilterBottomSheetContent$SelectableList.contentType;
        }
        if ((i & 2) != 0) {
            str = pfmResponse$FeedFilterBottomSheetContent$SelectableList.selectedOption;
        }
        if ((i & 4) != 0) {
            list = pfmResponse$FeedFilterBottomSheetContent$SelectableList.options;
        }
        return pfmResponse$FeedFilterBottomSheetContent$SelectableList.copy(pfmBottomSheetContentType, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final PfmResponse.PfmBottomSheetContentType getContentType() {
        return this.contentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedOption() {
        return this.selectedOption;
    }

    public final List<PfmResponse.SelectableListItem> component3() {
        return this.options;
    }

    public final PfmResponse$FeedFilterBottomSheetContent$SelectableList copy(@Json(name = "content_type") PfmResponse.PfmBottomSheetContentType contentType, @Json(name = "selected_option") String selectedOption, @Json(name = "options") List<PfmResponse.SelectableListItem> options) {
        return new PfmResponse$FeedFilterBottomSheetContent$SelectableList(contentType, selectedOption, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PfmResponse$FeedFilterBottomSheetContent$SelectableList)) {
            return false;
        }
        PfmResponse$FeedFilterBottomSheetContent$SelectableList pfmResponse$FeedFilterBottomSheetContent$SelectableList = (PfmResponse$FeedFilterBottomSheetContent$SelectableList) other;
        return this.contentType == pfmResponse$FeedFilterBottomSheetContent$SelectableList.contentType && jl40.l(this.selectedOption, pfmResponse$FeedFilterBottomSheetContent$SelectableList.selectedOption) && jl40.l(this.options, pfmResponse$FeedFilterBottomSheetContent$SelectableList.options);
    }

    public final PfmResponse.PfmBottomSheetContentType getContentType() {
        return this.contentType;
    }

    public final List<PfmResponse.SelectableListItem> getOptions() {
        return this.options;
    }

    public final String getSelectedOption() {
        return this.selectedOption;
    }

    public int hashCode() {
        int hashCode = this.contentType.hashCode() * 31;
        String str = this.selectedOption;
        return this.options.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public String toString() {
        PfmResponse.PfmBottomSheetContentType pfmBottomSheetContentType = this.contentType;
        String str = this.selectedOption;
        List<PfmResponse.SelectableListItem> list = this.options;
        StringBuilder sb = new StringBuilder("SelectableList(contentType=");
        sb.append(pfmBottomSheetContentType);
        sb.append(", selectedOption=");
        sb.append(str);
        sb.append(", options=");
        return ly3.s(sb, list, Extension.C_BRAKE);
    }
}
