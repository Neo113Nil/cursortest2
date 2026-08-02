package com.ybsdk.feature.transfer.version2.internal.network.dto.me2me;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenStatusSuccessDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenStatusSuccessDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/me2me/Me2MeDebitAutoPullScreenData;", "listOfMe2MeDebitAutoPullScreenDataAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Me2MeDebitAutoPullScreenStatusSuccessDtoJsonAdapter extends JsonAdapter<Me2MeDebitAutoPullScreenStatusSuccessDto> {
    private final JsonAdapter<List<Me2MeDebitAutoPullScreenData>> listOfMe2MeDebitAutoPullScreenDataAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("agreements_sheet_title", "agreements");
    private final JsonAdapter<String> stringAdapter;

    public Me2MeDebitAutoPullScreenStatusSuccessDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "agreementsSheetTitle");
        this.listOfMe2MeDebitAutoPullScreenDataAdapter = moshi.adapter(Types.newParameterizedType(List.class, Me2MeDebitAutoPullScreenData.class), emptySet, "agreements");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Me2MeDebitAutoPullScreenStatusSuccessDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<Me2MeDebitAutoPullScreenData> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("agreementsSheetTitle", "agreements_sheet_title", jsonReader);
                }
            } else if (selectName == 1 && (list = this.listOfMe2MeDebitAutoPullScreenDataAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("agreements", "agreements", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("agreementsSheetTitle", "agreements_sheet_title", jsonReader);
        }
        if (list != null) {
            return new Me2MeDebitAutoPullScreenStatusSuccessDto(str, list);
        }
        throw Util.missingProperty("agreements", "agreements", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Me2MeDebitAutoPullScreenStatusSuccessDto me2MeDebitAutoPullScreenStatusSuccessDto) {
        Me2MeDebitAutoPullScreenStatusSuccessDto me2MeDebitAutoPullScreenStatusSuccessDto2 = me2MeDebitAutoPullScreenStatusSuccessDto;
        if (me2MeDebitAutoPullScreenStatusSuccessDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("agreements_sheet_title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullScreenStatusSuccessDto2.getAgreementsSheetTitle());
        jsonWriter.name("agreements");
        this.listOfMe2MeDebitAutoPullScreenDataAdapter.toJson(jsonWriter, (JsonWriter) me2MeDebitAutoPullScreenStatusSuccessDto2.getAgreements());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(62, "GeneratedJsonAdapter(Me2MeDebitAutoPullScreenStatusSuccessDto)");
    }
}
