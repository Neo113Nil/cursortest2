package com.ybsdk.network.dto.simplifiedid;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationFormJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/network/dto/simplifiedid/SimplifiedIdApplicationForm;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SimplifiedIdApplicationFormJsonAdapter extends JsonAdapter<SimplifiedIdApplicationForm> {
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("first_name", "last_name", "middle_name", "passport_number", "birthday", "inn_or_snils");

    public SimplifiedIdApplicationFormJsonAdapter(Moshi moshi) {
        this.nullableStringAdapter = moshi.adapter(String.class, EmptySet.a, "firstName");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SimplifiedIdApplicationForm fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 1:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 5:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
            }
        }
        jsonReader.endObject();
        return new SimplifiedIdApplicationForm(str, str2, str3, str4, str5, str6);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SimplifiedIdApplicationForm simplifiedIdApplicationForm) {
        SimplifiedIdApplicationForm simplifiedIdApplicationForm2 = simplifiedIdApplicationForm;
        if (simplifiedIdApplicationForm2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("first_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationForm2.getFirstName());
        jsonWriter.name("last_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationForm2.getLastName());
        jsonWriter.name("middle_name");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationForm2.getMiddleName());
        jsonWriter.name("passport_number");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationForm2.getPassportNumber());
        jsonWriter.name("birthday");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationForm2.getBirthday());
        jsonWriter.name("inn_or_snils");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) simplifiedIdApplicationForm2.getInnOrSnils());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(SimplifiedIdApplicationForm)");
    }
}
