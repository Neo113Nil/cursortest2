package com.ybsdk.feature.qr.api.data.rules;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesRuleDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/qr/api/data/rules/GetResolvingRulesRuleDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringAdapter", "feature-qr-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GetResolvingRulesRuleDtoJsonAdapter extends JsonAdapter<GetResolvingRulesRuleDto> {
    private final JsonAdapter<List<String>> listOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("regexes", "category", "deeplink_template");
    private final JsonAdapter<String> stringAdapter;

    public GetResolvingRulesRuleDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "regexes");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "category");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetResolvingRulesRuleDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<String> list = null;
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfStringAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("regexes", "regexes", jsonReader);
                }
            } else if (selectName == 1) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("category", "category", jsonReader);
                }
            } else if (selectName == 2 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("deeplinkTemplate", "deeplink_template", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("regexes", "regexes", jsonReader);
        }
        if (str == null) {
            throw Util.missingProperty("category", "category", jsonReader);
        }
        if (str2 != null) {
            return new GetResolvingRulesRuleDto(list, str, str2);
        }
        throw Util.missingProperty("deeplinkTemplate", "deeplink_template", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetResolvingRulesRuleDto getResolvingRulesRuleDto) {
        GetResolvingRulesRuleDto getResolvingRulesRuleDto2 = getResolvingRulesRuleDto;
        if (getResolvingRulesRuleDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("regexes");
        this.listOfStringAdapter.toJson(jsonWriter, (JsonWriter) getResolvingRulesRuleDto2.getRegexes());
        jsonWriter.name("category");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getResolvingRulesRuleDto2.getCategory());
        jsonWriter.name("deeplink_template");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) getResolvingRulesRuleDto2.getDeeplinkTemplate());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(46, "GeneratedJsonAdapter(GetResolvingRulesRuleDto)");
    }
}
