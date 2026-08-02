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

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_PfmNodeText_MultipleTextJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeText$MultipleText;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmNodeTextContentType;", "pfmNodeTextContentTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmText;", "pfmTextAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_PfmNodeText_MultipleTextJsonAdapter extends JsonAdapter<PfmResponse$PfmNodeText$MultipleText> {
    private final JsonReader.Options options = JsonReader.Options.of("content_type", "title", "subtitle");
    private final JsonAdapter<PfmResponse.PfmNodeTextContentType> pfmNodeTextContentTypeAdapter;
    private final JsonAdapter<PfmResponse.PfmText> pfmTextAdapter;

    public PfmResponse_PfmNodeText_MultipleTextJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.pfmNodeTextContentTypeAdapter = moshi.adapter(PfmResponse.PfmNodeTextContentType.class, emptySet, "contentType");
        this.pfmTextAdapter = moshi.adapter(PfmResponse.PfmText.class, emptySet, "title");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$PfmNodeText$MultipleText fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.PfmNodeTextContentType pfmNodeTextContentType = null;
        PfmResponse.PfmText pfmText = null;
        PfmResponse.PfmText pfmText2 = null;
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
            } else if (selectName == 1) {
                pfmText = this.pfmTextAdapter.fromJson(jsonReader);
                if (pfmText == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2 && (pfmText2 = this.pfmTextAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("subtitle", "subtitle", jsonReader);
            }
        }
        jsonReader.endObject();
        if (pfmNodeTextContentType == null) {
            throw Util.missingProperty("contentType", "content_type", jsonReader);
        }
        if (pfmText == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (pfmText2 != null) {
            return new PfmResponse$PfmNodeText$MultipleText(pfmNodeTextContentType, pfmText, pfmText2);
        }
        throw Util.missingProperty("subtitle", "subtitle", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$PfmNodeText$MultipleText pfmResponse$PfmNodeText$MultipleText) {
        PfmResponse$PfmNodeText$MultipleText pfmResponse$PfmNodeText$MultipleText2 = pfmResponse$PfmNodeText$MultipleText;
        if (pfmResponse$PfmNodeText$MultipleText2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content_type");
        this.pfmNodeTextContentTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmNodeText$MultipleText2.getContentType());
        jsonWriter.name("title");
        this.pfmTextAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmNodeText$MultipleText2.getTitle());
        jsonWriter.name("subtitle");
        this.pfmTextAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$PfmNodeText$MultipleText2.getSubtitle());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(58, "GeneratedJsonAdapter(PfmResponse.PfmNodeText.MultipleText)");
    }
}
