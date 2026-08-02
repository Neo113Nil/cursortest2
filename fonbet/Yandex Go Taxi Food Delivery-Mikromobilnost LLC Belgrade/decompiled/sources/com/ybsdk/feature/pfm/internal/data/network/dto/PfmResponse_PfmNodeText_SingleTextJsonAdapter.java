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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_PfmNodeText_SingleTextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeText$SingleText;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "pfmNodeTextContentTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "pfmTextAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_PfmNodeText_SingleTextJsonAdapter extends JsonAdapter<PfmResponse$PfmNodeText$SingleText> {
    private final JsonReader.Options options = JsonReader.Options.of("content_type", "text");
    private final JsonAdapter<PfmResponse.PfmNodeTextContentType> pfmNodeTextContentTypeAdapter;
    private final JsonAdapter<PfmResponse.PfmText> pfmTextAdapter;

    public PfmResponse_PfmNodeText_SingleTextJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pfmNodeTextContentTypeAdapter = moshi.adapter(PfmResponse.PfmNodeTextContentType.class, emptySet, "contentType");
        this.pfmTextAdapter = moshi.adapter(PfmResponse.PfmText.class, emptySet, "text");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$PfmNodeText$SingleText fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.PfmNodeTextContentType pfmNodeTextContentType = null;
        PfmResponse.PfmText pfmText = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                pfmNodeTextContentType = this.pfmNodeTextContentTypeAdapter.fromJson(jsonReader);
                if (pfmNodeTextContentType == null) {
                    throw Util.unexpectedNull("contentType", "content_type", jsonReader);
                }
            } else if (selectName == 1 && (pfmText = this.pfmTextAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("text", "text", jsonReader);
            }
        }
        jsonReader.endObject();
        if (pfmNodeTextContentType == null) {
            throw Util.missingProperty("contentType", "content_type", jsonReader);
        }
        if (pfmText != null) {
            return new PfmResponse$PfmNodeText$SingleText(pfmNodeTextContentType, pfmText);
        }
        throw Util.missingProperty("text", "text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$PfmNodeText$SingleText pfmResponse$PfmNodeText$SingleText) {
        PfmResponse$PfmNodeText$SingleText pfmResponse$PfmNodeText$SingleText2 = pfmResponse$PfmNodeText$SingleText;
        if (pfmResponse$PfmNodeText$SingleText2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content_type");
        this.pfmNodeTextContentTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmNodeText$SingleText2.getContentType());
        jsonWriter.name("text");
        this.pfmTextAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmNodeText$SingleText2.getText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(PfmResponse.PfmNodeText.SingleText)");
    }
}
