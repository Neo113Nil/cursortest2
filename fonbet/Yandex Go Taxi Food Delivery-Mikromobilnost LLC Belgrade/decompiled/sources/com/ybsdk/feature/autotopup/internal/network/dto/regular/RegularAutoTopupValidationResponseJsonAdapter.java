package com.ybsdk.feature.autotopup.internal.network.dto.regular;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.feature.autotopup.internal.network.dto.regular.RegularAutoTopupValidationResponse;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/regular/RegularAutoTopupValidationResponse$ValidationError;", "listOfValidationErrorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RegularAutoTopupValidationResponseJsonAdapter extends JsonAdapter<RegularAutoTopupValidationResponse> {
    private final JsonAdapter<List<RegularAutoTopupValidationResponse.ValidationError>> listOfValidationErrorAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("errors");

    public RegularAutoTopupValidationResponseJsonAdapter(Moshi moshi) {
        this.listOfValidationErrorAdapter = moshi.adapter(Types.newParameterizedType(List.class, RegularAutoTopupValidationResponse.ValidationError.class), EmptySet.a, "errors");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final RegularAutoTopupValidationResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<RegularAutoTopupValidationResponse.ValidationError> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0 && (list = this.listOfValidationErrorAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("errors", "errors", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list != null) {
            return new RegularAutoTopupValidationResponse(list);
        }
        throw Util.missingProperty("errors", "errors", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, RegularAutoTopupValidationResponse regularAutoTopupValidationResponse) {
        RegularAutoTopupValidationResponse regularAutoTopupValidationResponse2 = regularAutoTopupValidationResponse;
        if (regularAutoTopupValidationResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("errors");
        this.listOfValidationErrorAdapter.toJson(jsonWriter, (JsonWriter) regularAutoTopupValidationResponse2.getErrors());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(56, "GeneratedJsonAdapter(RegularAutoTopupValidationResponse)");
    }
}
