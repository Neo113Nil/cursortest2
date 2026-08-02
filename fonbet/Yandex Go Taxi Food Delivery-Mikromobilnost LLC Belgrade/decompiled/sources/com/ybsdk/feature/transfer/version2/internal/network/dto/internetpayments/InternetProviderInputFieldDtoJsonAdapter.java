package com.ybsdk.feature.transfer.version2.internal.network.dto.internetpayments;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.ybsdk.feature.transfer.version2.internal.data.dto.FormFieldValidationDto;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderInputFieldDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/network/dto/internetpayments/InternetProviderInputFieldDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/transfer/version2/internal/data/dto/FormFieldValidationDto;", "nullableFormFieldValidationDtoAdapter", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InternetProviderInputFieldDtoJsonAdapter extends JsonAdapter<InternetProviderInputFieldDto> {
    private final JsonAdapter<FormFieldValidationDto> nullableFormFieldValidationDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("label", "field_validation", "comment");

    public InternetProviderInputFieldDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "label");
        this.nullableFormFieldValidationDtoAdapter = moshi.adapter(FormFieldValidationDto.class, emptySet, "fieldValidation");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InternetProviderInputFieldDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        FormFieldValidationDto formFieldValidationDto = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.nullableStringAdapter.fromJson(jsonReader);
            } else if (selectName == 1) {
                formFieldValidationDto = this.nullableFormFieldValidationDtoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        return new InternetProviderInputFieldDto(str, formFieldValidationDto, str2);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InternetProviderInputFieldDto internetProviderInputFieldDto) {
        InternetProviderInputFieldDto internetProviderInputFieldDto2 = internetProviderInputFieldDto;
        if (internetProviderInputFieldDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("label");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) internetProviderInputFieldDto2.getLabel());
        jsonWriter.name("field_validation");
        this.nullableFormFieldValidationDtoAdapter.toJson(jsonWriter, (JsonWriter) internetProviderInputFieldDto2.getFieldValidation());
        jsonWriter.name("comment");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) internetProviderInputFieldDto2.getComment());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(51, "GeneratedJsonAdapter(InternetProviderInputFieldDto)");
    }
}
