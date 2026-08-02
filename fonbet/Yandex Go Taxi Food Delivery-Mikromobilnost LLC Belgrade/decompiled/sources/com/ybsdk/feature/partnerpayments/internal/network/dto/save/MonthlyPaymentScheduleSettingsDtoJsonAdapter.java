package com.ybsdk.feature.partnerpayments.internal.network.dto.save;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/MonthlyPaymentScheduleSettingsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/partnerpayments/internal/network/dto/save/MonthlyPaymentScheduleSettingsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "", "listOfIntAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableBooleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-partner-payments_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MonthlyPaymentScheduleSettingsDtoJsonAdapter extends JsonAdapter<MonthlyPaymentScheduleSettingsDto> {
    private volatile Constructor<MonthlyPaymentScheduleSettingsDto> constructorRef;
    private final JsonAdapter<List<Integer>> listOfIntAdapter;
    private final JsonAdapter<Boolean> nullableBooleanAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("days", "include_last");

    public MonthlyPaymentScheduleSettingsDtoJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, Integer.class);
        EmptySet emptySet = EmptySet.a;
        this.listOfIntAdapter = moshi.adapter(newParameterizedType, emptySet, "days");
        this.nullableBooleanAdapter = moshi.adapter(Boolean.class, emptySet, "includeLast");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MonthlyPaymentScheduleSettingsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<Integer> list = null;
        Boolean bool = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                list = this.listOfIntAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("days", "days", jsonReader);
                }
            } else if (selectName == 1) {
                bool = this.nullableBooleanAdapter.fromJson(jsonReader);
                i = -3;
            }
        }
        jsonReader.endObject();
        if (i == -3) {
            if (list != null) {
                return new MonthlyPaymentScheduleSettingsDto(list, bool);
            }
            throw Util.missingProperty("days", "days", jsonReader);
        }
        Constructor<MonthlyPaymentScheduleSettingsDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MonthlyPaymentScheduleSettingsDto.class.getDeclaredConstructor(List.class, Boolean.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (list != null) {
            return constructor.newInstance(list, bool, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("days", "days", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto) {
        MonthlyPaymentScheduleSettingsDto monthlyPaymentScheduleSettingsDto2 = monthlyPaymentScheduleSettingsDto;
        if (monthlyPaymentScheduleSettingsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("days");
        this.listOfIntAdapter.toJson(jsonWriter, (JsonWriter) monthlyPaymentScheduleSettingsDto2.getDays());
        jsonWriter.name("include_last");
        this.nullableBooleanAdapter.toJson(jsonWriter, (JsonWriter) monthlyPaymentScheduleSettingsDto2.getIncludeLast());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(55, "GeneratedJsonAdapter(MonthlyPaymentScheduleSettingsDto)");
    }
}
