package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_FeedFilterBottomSheetContent_ToggleListJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterBottomSheetContent$ToggleList;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "pfmBottomSheetContentTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$ToggleListItem;", "listOfToggleListItemAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_FeedFilterBottomSheetContent_ToggleListJsonAdapter extends JsonAdapter<PfmResponse$FeedFilterBottomSheetContent$ToggleList> {
    private final JsonAdapter<List<PfmResponse.ToggleListItem>> listOfToggleListItemAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("content_type", "settings");
    private final JsonAdapter<PfmResponse.PfmBottomSheetContentType> pfmBottomSheetContentTypeAdapter;

    public PfmResponse_FeedFilterBottomSheetContent_ToggleListJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pfmBottomSheetContentTypeAdapter = moshi.adapter(PfmResponse.PfmBottomSheetContentType.class, emptySet, "contentType");
        this.listOfToggleListItemAdapter = moshi.adapter(Types.newParameterizedType(List.class, PfmResponse.ToggleListItem.class), emptySet, "settings");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$FeedFilterBottomSheetContent$ToggleList fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.PfmBottomSheetContentType pfmBottomSheetContentType = null;
        List<PfmResponse.ToggleListItem> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                pfmBottomSheetContentType = this.pfmBottomSheetContentTypeAdapter.fromJson(jsonReader);
                if (pfmBottomSheetContentType == null) {
                    throw Util.unexpectedNull("contentType", "content_type", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfToggleListItemAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("settings", "settings", jsonReader);
            }
        }
        jsonReader.endObject();
        if (pfmBottomSheetContentType == null) {
            throw Util.missingProperty("contentType", "content_type", jsonReader);
        }
        if (list != null) {
            return new PfmResponse$FeedFilterBottomSheetContent$ToggleList(pfmBottomSheetContentType, list);
        }
        throw Util.missingProperty("settings", "settings", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$FeedFilterBottomSheetContent$ToggleList pfmResponse$FeedFilterBottomSheetContent$ToggleList) {
        PfmResponse$FeedFilterBottomSheetContent$ToggleList pfmResponse$FeedFilterBottomSheetContent$ToggleList2 = pfmResponse$FeedFilterBottomSheetContent$ToggleList;
        if (pfmResponse$FeedFilterBottomSheetContent$ToggleList2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content_type");
        this.pfmBottomSheetContentTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FeedFilterBottomSheetContent$ToggleList2.getContentType());
        jsonWriter.name("settings");
        this.listOfToggleListItemAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FeedFilterBottomSheetContent$ToggleList2.getSettings());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(73, "GeneratedJsonAdapter(PfmResponse.FeedFilterBottomSheetContent.ToggleList)");
    }
}
