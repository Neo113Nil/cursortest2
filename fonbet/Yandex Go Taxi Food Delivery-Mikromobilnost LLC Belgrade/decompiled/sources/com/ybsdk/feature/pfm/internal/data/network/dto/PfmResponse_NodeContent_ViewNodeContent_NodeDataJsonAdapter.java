package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse$NodeContent$ViewNodeContent;
import defpackage.jcb0;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.impl.C0553n3;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_NodeContent_ViewNodeContent_NodeDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$ViewNodeContent$NodeData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$NodeContent$ViewNodeContent$NodeBackground;", "nodeBackgroundAdapter", "Ljcb0;", "pfmNodeTextAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_NodeContent_ViewNodeContent_NodeDataJsonAdapter extends JsonAdapter<PfmResponse$NodeContent$ViewNodeContent.NodeData> {
    private final JsonAdapter<PfmResponse$NodeContent$ViewNodeContent.NodeBackground> nodeBackgroundAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("image", C0553n3.g, "text");
    private final JsonAdapter<jcb0> pfmNodeTextAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public PfmResponse_NodeContent_ViewNodeContent_NodeDataJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(Themes.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themesOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "image");
        this.nodeBackgroundAdapter = moshi.adapter(PfmResponse$NodeContent$ViewNodeContent.NodeBackground.class, emptySet, C0553n3.g);
        this.pfmNodeTextAdapter = moshi.adapter(jcb0.class, emptySet, "text");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$NodeContent$ViewNodeContent.NodeData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Themes<String> themes = null;
        PfmResponse$NodeContent$ViewNodeContent.NodeBackground nodeBackground = null;
        jcb0 jcb0Var = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themes = this.themesOfStringAdapter.fromJson(jsonReader);
                if (themes == null) {
                    throw Util.unexpectedNull("image", "image", jsonReader);
                }
            } else if (selectName == 1) {
                nodeBackground = this.nodeBackgroundAdapter.fromJson(jsonReader);
                if (nodeBackground == null) {
                    throw Util.unexpectedNull(C0553n3.g, C0553n3.g, jsonReader);
                }
            } else if (selectName == 2 && (jcb0Var = this.pfmNodeTextAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("text", "text", jsonReader);
            }
        }
        jsonReader.endObject();
        if (themes == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (nodeBackground == null) {
            throw Util.missingProperty(C0553n3.g, C0553n3.g, jsonReader);
        }
        if (jcb0Var != null) {
            return new PfmResponse$NodeContent$ViewNodeContent.NodeData(themes, nodeBackground, jcb0Var);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$NodeContent$ViewNodeContent.NodeData nodeData) {
        PfmResponse$NodeContent$ViewNodeContent.NodeData nodeData2 = nodeData;
        if (nodeData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) nodeData2.getImage());
        jsonWriter.name(C0553n3.g);
        this.nodeBackgroundAdapter.toJson(jsonWriter, (JsonWriter) nodeData2.getBackground());
        jsonWriter.name("text");
        this.pfmNodeTextAdapter.toJson(jsonWriter, (JsonWriter) nodeData2.getText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(70, "GeneratedJsonAdapter(PfmResponse.NodeContent.ViewNodeContent.NodeData)");
    }
}
