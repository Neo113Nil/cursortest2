package com.ybsdk.rconfig;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/ybsdk/rconfig/SimpleIdValidationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/SimpleIdValidation;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "", "booleanAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SimpleIdValidationJsonAdapter extends JsonAdapter<SimpleIdValidation> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("first_name_regex", "last_name_regex", "middle_name_regex", "passport_number_regex", "min_age", "max_age", "autocorrect_enabled", "validation_enabled", "pre_capitalized_delimeters");
    private final JsonAdapter<String> stringAdapter;

    public SimpleIdValidationJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "nameRegex");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "minAge");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "autocorrectEnabled");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SimpleIdValidation fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Integer num2 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Boolean bool2 = null;
        String str5 = null;
        while (true) {
            Integer num3 = num;
            Integer num4 = num2;
            String str6 = str;
            String str7 = str2;
            String str8 = str3;
            String str9 = str4;
            Boolean bool3 = bool;
            Boolean bool4 = bool2;
            String str10 = str5;
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (str6 == null) {
                    throw Util.missingProperty("nameRegex", "first_name_regex", jsonReader);
                }
                if (str7 == null) {
                    throw Util.missingProperty("lastnameRegex", "last_name_regex", jsonReader);
                }
                if (str8 == null) {
                    throw Util.missingProperty("middleNameRegex", "middle_name_regex", jsonReader);
                }
                if (str9 == null) {
                    throw Util.missingProperty("passportNumberRegex", "passport_number_regex", jsonReader);
                }
                if (num3 == null) {
                    throw Util.missingProperty("minAge", "min_age", jsonReader);
                }
                int intValue = num3.intValue();
                if (num4 == null) {
                    throw Util.missingProperty("maxAge", "max_age", jsonReader);
                }
                int intValue2 = num4.intValue();
                if (bool3 == null) {
                    throw Util.missingProperty("autocorrectEnabled", "autocorrect_enabled", jsonReader);
                }
                boolean booleanValue = bool3.booleanValue();
                if (bool4 == null) {
                    throw Util.missingProperty("validationEnabled", "validation_enabled", jsonReader);
                }
                boolean booleanValue2 = bool4.booleanValue();
                if (str10 != null) {
                    return new SimpleIdValidation(str6, str7, str8, str9, intValue, intValue2, booleanValue, booleanValue2, str10);
                }
                throw Util.missingProperty("preCapitalizedDelimiters", "pre_capitalized_delimeters", jsonReader);
            }
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    num = num3;
                    num2 = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    bool = bool3;
                    bool2 = bool4;
                    str5 = str10;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("nameRegex", "first_name_regex", jsonReader);
                    }
                    num = num3;
                    num2 = num4;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    bool = bool3;
                    bool2 = bool4;
                    str5 = str10;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("lastnameRegex", "last_name_regex", jsonReader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str6;
                    str3 = str8;
                    str4 = str9;
                    bool = bool3;
                    bool2 = bool4;
                    str5 = str10;
                case 2:
                    str3 = this.stringAdapter.fromJson(jsonReader);
                    if (str3 == null) {
                        throw Util.unexpectedNull("middleNameRegex", "middle_name_regex", jsonReader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str6;
                    str2 = str7;
                    str4 = str9;
                    bool = bool3;
                    bool2 = bool4;
                    str5 = str10;
                case 3:
                    str4 = this.stringAdapter.fromJson(jsonReader);
                    if (str4 == null) {
                        throw Util.unexpectedNull("passportNumberRegex", "passport_number_regex", jsonReader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    bool = bool3;
                    bool2 = bool4;
                    str5 = str10;
                case 4:
                    num = this.intAdapter.fromJson(jsonReader);
                    if (num == null) {
                        throw Util.unexpectedNull("minAge", "min_age", jsonReader);
                    }
                    num2 = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    bool = bool3;
                    bool2 = bool4;
                    str5 = str10;
                case 5:
                    num2 = this.intAdapter.fromJson(jsonReader);
                    if (num2 == null) {
                        throw Util.unexpectedNull("maxAge", "max_age", jsonReader);
                    }
                    num = num3;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    bool = bool3;
                    bool2 = bool4;
                    str5 = str10;
                case 6:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("autocorrectEnabled", "autocorrect_enabled", jsonReader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    bool2 = bool4;
                    str5 = str10;
                case 7:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("validationEnabled", "validation_enabled", jsonReader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    bool = bool3;
                    str5 = str10;
                case 8:
                    str5 = this.stringAdapter.fromJson(jsonReader);
                    if (str5 == null) {
                        throw Util.unexpectedNull("preCapitalizedDelimiters", "pre_capitalized_delimeters", jsonReader);
                    }
                    num = num3;
                    num2 = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    bool = bool3;
                    bool2 = bool4;
                default:
                    num = num3;
                    num2 = num4;
                    str = str6;
                    str2 = str7;
                    str3 = str8;
                    str4 = str9;
                    bool = bool3;
                    bool2 = bool4;
                    str5 = str10;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SimpleIdValidation simpleIdValidation) {
        SimpleIdValidation simpleIdValidation2 = simpleIdValidation;
        if (simpleIdValidation2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("first_name_regex");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) simpleIdValidation2.getNameRegex());
        jsonWriter.name("last_name_regex");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) simpleIdValidation2.getLastnameRegex());
        jsonWriter.name("middle_name_regex");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) simpleIdValidation2.getMiddleNameRegex());
        jsonWriter.name("passport_number_regex");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) simpleIdValidation2.getPassportNumberRegex());
        jsonWriter.name("min_age");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(simpleIdValidation2.getMinAge()));
        jsonWriter.name("max_age");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(simpleIdValidation2.getMaxAge()));
        jsonWriter.name("autocorrect_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(simpleIdValidation2.getAutocorrectEnabled()));
        jsonWriter.name("validation_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(simpleIdValidation2.getValidationEnabled()));
        jsonWriter.name("pre_capitalized_delimeters");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) simpleIdValidation2.getPreCapitalizedDelimiters());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(40, "GeneratedJsonAdapter(SimpleIdValidation)");
    }
}
