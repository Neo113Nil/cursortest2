package com.ybsdk.feature.autotopup.internal.network.dto;

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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupSuccessDataJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/ValidateAutoTopupSuccessData;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupValidationError;", "listOfAutoTopupValidationErrorAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationError;", "listOfAutofundValidationErrorAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ValidateAutoTopupSuccessDataJsonAdapter extends JsonAdapter<ValidateAutoTopupSuccessData> {
    private final JsonAdapter<List<AutoTopupValidationError>> listOfAutoTopupValidationErrorAdapter;
    private final JsonAdapter<List<AutofundValidationError>> listOfAutofundValidationErrorAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("autotopup_errors", "autofund_errors");

    public ValidateAutoTopupSuccessDataJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, AutoTopupValidationError.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfAutoTopupValidationErrorAdapter = moshi.adapter(newParameterizedType, emptySet, "autotopupErrors");
        this.listOfAutofundValidationErrorAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutofundValidationError.class), emptySet, "autofundErrors");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ValidateAutoTopupSuccessData fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<AutoTopupValidationError> list = null;
        List<AutofundValidationError> list2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfAutoTopupValidationErrorAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("autotopupErrors", "autotopup_errors", jsonReader);
                }
            } else if (selectName == 1 && (list2 = this.listOfAutofundValidationErrorAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("autofundErrors", "autofund_errors", jsonReader);
            }
        }
        jsonReader.endObject();
        if (list == null) {
            throw Util.missingProperty("autotopupErrors", "autotopup_errors", jsonReader);
        }
        if (list2 != null) {
            return new ValidateAutoTopupSuccessData(list, list2);
        }
        throw Util.missingProperty("autofundErrors", "autofund_errors", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ValidateAutoTopupSuccessData validateAutoTopupSuccessData) {
        ValidateAutoTopupSuccessData validateAutoTopupSuccessData2 = validateAutoTopupSuccessData;
        if (validateAutoTopupSuccessData2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("autotopup_errors");
        this.listOfAutoTopupValidationErrorAdapter.toJson(jsonWriter, (JsonWriter) validateAutoTopupSuccessData2.getAutotopupErrors());
        jsonWriter.name("autofund_errors");
        this.listOfAutofundValidationErrorAdapter.toJson(jsonWriter, (JsonWriter) validateAutoTopupSuccessData2.getAutofundErrors());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(50, "GeneratedJsonAdapter(ValidateAutoTopupSuccessData)");
    }
}
