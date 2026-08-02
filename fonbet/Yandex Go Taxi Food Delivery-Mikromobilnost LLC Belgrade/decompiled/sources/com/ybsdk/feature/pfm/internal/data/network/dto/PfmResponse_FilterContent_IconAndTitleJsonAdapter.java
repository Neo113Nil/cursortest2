package com.ybsdk.feature.pfm.internal.data.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.Themes;
import com.ybsdk.feature.pfm.internal.data.network.dto.PfmResponse;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse_FilterContent_IconAndTitleJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContent$IconAndTitle;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$FilterContentType;", "filterContentTypeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/pfm/internal/data/network/dto/PfmResponse$PfmTextContent$Plain;", "plainAdapter", "Lcom/ybsdk/core/common/data/network/dto/Themes;", "", "themesOfStringAdapter", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmResponse_FilterContent_IconAndTitleJsonAdapter extends JsonAdapter<PfmResponse$FilterContent$IconAndTitle> {
    private final JsonAdapter<PfmResponse.FilterContentType> filterContentTypeAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("content_type", "title", "icon");
    private final JsonAdapter<PfmResponse$PfmTextContent$Plain> plainAdapter;
    private final JsonAdapter<Themes<String>> themesOfStringAdapter;

    public PfmResponse_FilterContent_IconAndTitleJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.filterContentTypeAdapter = moshi.adapter(PfmResponse.FilterContentType.class, emptySet, "contentType");
        this.plainAdapter = moshi.adapter(PfmResponse$PfmTextContent$Plain.class, emptySet, "title");
        this.themesOfStringAdapter = moshi.adapter(Types.newParameterizedType(Themes.class, String.class), emptySet, "icon");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PfmResponse$FilterContent$IconAndTitle fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        PfmResponse.FilterContentType filterContentType = null;
        PfmResponse$PfmTextContent$Plain pfmResponse$PfmTextContent$Plain = null;
        Themes<String> themes = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                filterContentType = this.filterContentTypeAdapter.fromJson(jsonReader);
                if (filterContentType == null) {
                    throw Util.unexpectedNull("contentType", "content_type", jsonReader);
                }
            } else if (selectName == 1) {
                pfmResponse$PfmTextContent$Plain = this.plainAdapter.fromJson(jsonReader);
                if (pfmResponse$PfmTextContent$Plain == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 2 && (themes = this.themesOfStringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("icon", "icon", jsonReader);
            }
        }
        jsonReader.endObject();
        if (filterContentType == null) {
            throw Util.missingProperty("contentType", "content_type", jsonReader);
        }
        if (pfmResponse$PfmTextContent$Plain == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (themes != null) {
            return new PfmResponse$FilterContent$IconAndTitle(filterContentType, pfmResponse$PfmTextContent$Plain, themes);
        }
        throw Util.missingProperty("icon", "icon", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PfmResponse$FilterContent$IconAndTitle pfmResponse$FilterContent$IconAndTitle) {
        PfmResponse$FilterContent$IconAndTitle pfmResponse$FilterContent$IconAndTitle2 = pfmResponse$FilterContent$IconAndTitle;
        if (pfmResponse$FilterContent$IconAndTitle2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("content_type");
        this.filterContentTypeAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterContent$IconAndTitle2.getContentType());
        jsonWriter.name("title");
        this.plainAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterContent$IconAndTitle2.getTitle());
        jsonWriter.name("icon");
        this.themesOfStringAdapter.toJson(jsonWriter, (JsonWriter) pfmResponse$FilterContent$IconAndTitle2.getIcon());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(60, "GeneratedJsonAdapter(PfmResponse.FilterContent.IconAndTitle)");
    }
}
