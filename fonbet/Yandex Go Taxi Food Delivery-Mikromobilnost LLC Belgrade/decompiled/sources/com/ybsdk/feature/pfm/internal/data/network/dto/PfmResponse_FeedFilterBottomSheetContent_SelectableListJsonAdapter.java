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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_FeedFilterBottomSheetContent_SelectableListJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FeedFilterBottomSheetContent$SelectableList;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmBottomSheetContentType;", "pfmBottomSheetContentTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$SelectableListItem;", "listOfSelectableListItemAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_FeedFilterBottomSheetContent_SelectableListJsonAdapter extends JsonAdapter<PfmResponse$FeedFilterBottomSheetContent$SelectableList> {
    private final JsonAdapter<List<PfmResponse.SelectableListItem>> listOfSelectableListItemAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("content_type", "selected_option", "options");
    private final JsonAdapter<PfmResponse.PfmBottomSheetContentType> pfmBottomSheetContentTypeAdapter;

    public PfmResponse_FeedFilterBottomSheetContent_SelectableListJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pfmBottomSheetContentTypeAdapter = moshi.adapter(PfmResponse.PfmBottomSheetContentType.class, emptySet, "contentType");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "selectedOption");
        this.listOfSelectableListItemAdapter = moshi.adapter(Types.newParameterizedType(List.class, PfmResponse.SelectableListItem.class), emptySet, "options");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$FeedFilterBottomSheetContent$SelectableList fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.PfmBottomSheetContentType pfmBottomSheetContentType = null;
        String str = null;
        List<PfmResponse.SelectableListItem> list = null;
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
            } else if (selectName == 1) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 2 && (list = this.listOfSelectableListItemAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("options_", "options", jsonReader);
            }
        }
        jsonReader.endObject();
        if (pfmBottomSheetContentType == null) {
            throw Util.missingProperty("contentType", "content_type", jsonReader);
        }
        if (list != null) {
            return new PfmResponse$FeedFilterBottomSheetContent$SelectableList(pfmBottomSheetContentType, str, list);
        }
        throw Util.missingProperty("options_", "options", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$FeedFilterBottomSheetContent$SelectableList pfmResponse$FeedFilterBottomSheetContent$SelectableList) {
        PfmResponse$FeedFilterBottomSheetContent$SelectableList pfmResponse$FeedFilterBottomSheetContent$SelectableList2 = pfmResponse$FeedFilterBottomSheetContent$SelectableList;
        if (pfmResponse$FeedFilterBottomSheetContent$SelectableList2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content_type");
        this.pfmBottomSheetContentTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FeedFilterBottomSheetContent$SelectableList2.getContentType());
        jsonWriter.name("selected_option");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FeedFilterBottomSheetContent$SelectableList2.getSelectedOption());
        jsonWriter.name("options");
        this.listOfSelectableListItemAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FeedFilterBottomSheetContent$SelectableList2.getOptions());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(77, "GeneratedJsonAdapter(PfmResponse.FeedFilterBottomSheetContent.SelectableList)");
    }
}
