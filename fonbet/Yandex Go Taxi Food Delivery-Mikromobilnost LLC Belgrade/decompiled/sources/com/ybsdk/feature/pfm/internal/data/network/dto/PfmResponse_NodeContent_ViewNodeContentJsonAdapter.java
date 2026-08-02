package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$NodeContent$ViewNodeContent;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_NodeContent_ViewNodeContentJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$ViewNodeContent;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeType;", "nodeTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "stringAdapter", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$ViewNodeContent$NodeData;", "nodeDataAdapter", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$ViewNodeContent$SelectedState;", "selectedStateAdapter", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$ViewNodeContent$ExpandedCategoryHeader;", "nullableExpandedCategoryHeaderAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_NodeContent_ViewNodeContentJsonAdapter extends JsonAdapter<PfmResponse$NodeContent$ViewNodeContent> {
    private final JsonAdapter<PfmResponse$NodeContent$ViewNodeContent.NodeData> nodeDataAdapter;
    private final JsonAdapter<PfmResponse.NodeType> nodeTypeAdapter;
    private final JsonAdapter<PfmResponse$NodeContent$ViewNodeContent.ExpandedCategoryHeader> nullableExpandedCategoryHeaderAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("node_type", "category_id", Constants.KEY_DATA, "selected_state", "expanded_category_header");
    private final JsonAdapter<PfmResponse$NodeContent$ViewNodeContent.SelectedState> selectedStateAdapter;
    private final JsonAdapter<String> stringAdapter;

    public PfmResponse_NodeContent_ViewNodeContentJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nodeTypeAdapter = moshi.adapter(PfmResponse.NodeType.class, emptySet, "nodeType");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "categoryId");
        this.nodeDataAdapter = moshi.adapter(PfmResponse$NodeContent$ViewNodeContent.NodeData.class, emptySet, Constants.KEY_DATA);
        this.selectedStateAdapter = moshi.adapter(PfmResponse$NodeContent$ViewNodeContent.SelectedState.class, emptySet, "selectedState");
        this.nullableExpandedCategoryHeaderAdapter = moshi.adapter(PfmResponse$NodeContent$ViewNodeContent.ExpandedCategoryHeader.class, emptySet, "expandedCategoryHeader");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$NodeContent$ViewNodeContent fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.NodeType nodeType = null;
        String str = null;
        PfmResponse$NodeContent$ViewNodeContent.NodeData nodeData = null;
        PfmResponse$NodeContent$ViewNodeContent.SelectedState selectedState = null;
        PfmResponse$NodeContent$ViewNodeContent.ExpandedCategoryHeader expandedCategoryHeader = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            PfmResponse.NodeType nodeType2 = nodeType;
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                nodeType = this.nodeTypeAdapter.fromJson(jsonReader);
                if (nodeType == null) {
                    throw Util.unexpectedNull("nodeType", "node_type", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("categoryId", "category_id", jsonReader);
                }
            } else if (selectName == 2) {
                nodeData = this.nodeDataAdapter.fromJson(jsonReader);
                if (nodeData == null) {
                    throw Util.unexpectedNull("data_", Constants.KEY_DATA, jsonReader);
                }
            } else if (selectName == 3) {
                selectedState = this.selectedStateAdapter.fromJson(jsonReader);
                if (selectedState == null) {
                    throw Util.unexpectedNull("selectedState", "selected_state", jsonReader);
                }
            } else if (selectName == 4) {
                expandedCategoryHeader = this.nullableExpandedCategoryHeaderAdapter.fromJson(jsonReader);
            }
            nodeType = nodeType2;
        }
        PfmResponse.NodeType nodeType3 = nodeType;
        jsonReader.endObject();
        if (nodeType3 == null) {
            throw Util.missingProperty("nodeType", "node_type", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("categoryId", "category_id", jsonReader);
        }
        if (nodeData == null) {
            throw Util.missingProperty("data_", Constants.KEY_DATA, jsonReader);
        }
        if (selectedState != null) {
            return new PfmResponse$NodeContent$ViewNodeContent(nodeType3, str, nodeData, selectedState, expandedCategoryHeader);
        }
        throw Util.missingProperty("selectedState", "selected_state", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$NodeContent$ViewNodeContent pfmResponse$NodeContent$ViewNodeContent) {
        PfmResponse$NodeContent$ViewNodeContent pfmResponse$NodeContent$ViewNodeContent2 = pfmResponse$NodeContent$ViewNodeContent;
        if (pfmResponse$NodeContent$ViewNodeContent2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("node_type");
        this.nodeTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$NodeContent$ViewNodeContent2.getNodeType());
        jsonWriter.name("category_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$NodeContent$ViewNodeContent2.getCategoryId());
        jsonWriter.name(Constants.KEY_DATA);
        this.nodeDataAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$NodeContent$ViewNodeContent2.getData());
        jsonWriter.name("selected_state");
        this.selectedStateAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$NodeContent$ViewNodeContent2.getSelectedState());
        jsonWriter.name("expanded_category_header");
        this.nullableExpandedCategoryHeaderAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$NodeContent$ViewNodeContent2.getExpandedCategoryHeader());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(61, "GeneratedJsonAdapter(PfmResponse.NodeContent.ViewNodeContent)");
    }
}
