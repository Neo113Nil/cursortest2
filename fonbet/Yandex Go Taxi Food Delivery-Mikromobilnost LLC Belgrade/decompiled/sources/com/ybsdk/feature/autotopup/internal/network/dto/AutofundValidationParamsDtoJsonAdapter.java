package com.ybsdk.feature.autotopup.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationParamsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutofundValidationParamsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupSwitchStatusRequestDto;", "autoTopupSwitchStatusRequestDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoFundParamsDto;", "autoFundParamsDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutofundValidationParamsDtoJsonAdapter extends JsonAdapter<AutofundValidationParamsDto> {
    private final JsonAdapter<AutoFundParamsDto> autoFundParamsDtoAdapter;
    private final JsonAdapter<AutoTopupSwitchStatusRequestDto> autoTopupSwitchStatusRequestDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(ACSPConstants.STATUS, "params");

    public AutofundValidationParamsDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.autoTopupSwitchStatusRequestDtoAdapter = moshi.adapter(AutoTopupSwitchStatusRequestDto.class, emptySet, "autofundStatus");
        this.autoFundParamsDtoAdapter = moshi.adapter(AutoFundParamsDto.class, emptySet, "autofundParams");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutofundValidationParamsDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        AutoTopupSwitchStatusRequestDto autoTopupSwitchStatusRequestDto = null;
        AutoFundParamsDto autoFundParamsDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                autoTopupSwitchStatusRequestDto = this.autoTopupSwitchStatusRequestDtoAdapter.fromJson(jsonReader);
                if (autoTopupSwitchStatusRequestDto == null) {
                    throw Util.unexpectedNull("autofundStatus", ACSPConstants.STATUS, jsonReader);
                }
            } else if (selectName == 1 && (autoFundParamsDto = this.autoFundParamsDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("autofundParams", "params", jsonReader);
            }
        }
        jsonReader.endObject();
        if (autoTopupSwitchStatusRequestDto == null) {
            throw Util.missingProperty("autofundStatus", ACSPConstants.STATUS, jsonReader);
        }
        if (autoFundParamsDto != null) {
            return new AutofundValidationParamsDto(autoTopupSwitchStatusRequestDto, autoFundParamsDto);
        }
        throw Util.missingProperty("autofundParams", "params", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutofundValidationParamsDto autofundValidationParamsDto) {
        AutofundValidationParamsDto autofundValidationParamsDto2 = autofundValidationParamsDto;
        if (autofundValidationParamsDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(ACSPConstants.STATUS);
        this.autoTopupSwitchStatusRequestDtoAdapter.toJson(jsonWriter, (JsonWriter) autofundValidationParamsDto2.getAutofundStatus());
        jsonWriter.name("params");
        this.autoFundParamsDtoAdapter.toJson(jsonWriter, (JsonWriter) autofundValidationParamsDto2.getAutofundParams());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(49, "GeneratedJsonAdapter(AutofundValidationParamsDto)");
    }
}
