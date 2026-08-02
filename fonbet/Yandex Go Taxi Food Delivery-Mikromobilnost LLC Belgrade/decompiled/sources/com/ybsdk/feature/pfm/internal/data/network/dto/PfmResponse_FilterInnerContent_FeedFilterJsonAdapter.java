package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_FilterInnerContent_FeedFilterJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContent$FeedFilter;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterInnerContentType;", "filterInnerContentTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterInnerContent;", "feedFilterInnerContentAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_FilterInnerContent_FeedFilterJsonAdapter extends JsonAdapter<PfmResponse$FilterInnerContent$FeedFilter> {
    private final JsonAdapter<PfmResponse.FeedFilterInnerContent> feedFilterInnerContentAdapter;
    private final JsonAdapter<PfmResponse.FilterInnerContentType> filterInnerContentTypeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("filter_type", "inner_content");

    public PfmResponse_FilterInnerContent_FeedFilterJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.filterInnerContentTypeAdapter = moshi.adapter(PfmResponse.FilterInnerContentType.class, emptySet, "filterType");
        this.feedFilterInnerContentAdapter = moshi.adapter(PfmResponse.FeedFilterInnerContent.class, emptySet, "innerContent");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$FilterInnerContent$FeedFilter fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.FilterInnerContentType filterInnerContentType = null;
        PfmResponse.FeedFilterInnerContent feedFilterInnerContent = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                filterInnerContentType = this.filterInnerContentTypeAdapter.fromJson(jsonReader);
                if (filterInnerContentType == null) {
                    throw Util.unexpectedNull("filterType", "filter_type", jsonReader);
                }
            } else if (selectName == 1 && (feedFilterInnerContent = this.feedFilterInnerContentAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("innerContent", "inner_content", jsonReader);
            }
        }
        jsonReader.endObject();
        if (filterInnerContentType == null) {
            throw Util.missingProperty("filterType", "filter_type", jsonReader);
        }
        if (feedFilterInnerContent != null) {
            return new PfmResponse$FilterInnerContent$FeedFilter(filterInnerContentType, feedFilterInnerContent);
        }
        throw Util.missingProperty("innerContent", "inner_content", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$FilterInnerContent$FeedFilter pfmResponse$FilterInnerContent$FeedFilter) {
        PfmResponse$FilterInnerContent$FeedFilter pfmResponse$FilterInnerContent$FeedFilter2 = pfmResponse$FilterInnerContent$FeedFilter;
        if (pfmResponse$FilterInnerContent$FeedFilter2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("filter_type");
        this.filterInnerContentTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterInnerContent$FeedFilter2.getFilterType());
        jsonWriter.name("inner_content");
        this.feedFilterInnerContentAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterInnerContent$FeedFilter2.getInnerContent());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(63, "GeneratedJsonAdapter(PfmResponse.FilterInnerContent.FeedFilter)");
    }
}
