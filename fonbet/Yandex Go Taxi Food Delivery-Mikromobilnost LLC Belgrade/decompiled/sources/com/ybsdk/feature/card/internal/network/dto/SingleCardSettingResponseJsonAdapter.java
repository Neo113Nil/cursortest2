package com.ybsdk.feature.card.internal.network.dto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.feature.settings.api.data.SettingDto;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/ybsdk/feature/card/internal/network/dto/SingleCardSettingResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/card/internal/network/dto/SingleCardSettingResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "themedParameterOfStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/settings/api/data/SettingDto;", "settingDtoAdapter", "feature-card-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SingleCardSettingResponseJsonAdapter extends JsonAdapter<SingleCardSettingResponse> {
    private final JsonReader.Options options = JsonReader.Options.of("image", "setting");
    private final JsonAdapter<SettingDto> settingDtoAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public SingleCardSettingResponseJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(ThemedParameter.class, String.class);
        EmptySet emptySet = EmptySet.a;
        this.themedParameterOfStringAdapter = moshi.adapter(newParameterizedType, emptySet, "image");
        this.settingDtoAdapter = moshi.adapter(SettingDto.class, emptySet, "setting");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SingleCardSettingResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        ThemedParameter<String> themedParameter = null;
        SettingDto settingDto = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                themedParameter = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                if (themedParameter == null) {
                    throw Util.unexpectedNull("image", "image", jsonReader);
                }
            } else if (selectName == 1 && (settingDto = this.settingDtoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("setting", "setting", jsonReader);
            }
        }
        jsonReader.endObject();
        if (themedParameter == null) {
            throw Util.missingProperty("image", "image", jsonReader);
        }
        if (settingDto != null) {
            return new SingleCardSettingResponse(themedParameter, settingDto);
        }
        throw Util.missingProperty("setting", "setting", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SingleCardSettingResponse singleCardSettingResponse) {
        SingleCardSettingResponse singleCardSettingResponse2 = singleCardSettingResponse;
        if (singleCardSettingResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("image");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) singleCardSettingResponse2.getImage());
        jsonWriter.name("setting");
        this.settingDtoAdapter.toJson(jsonWriter, (JsonWriter) singleCardSettingResponse2.getSetting());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(47, "GeneratedJsonAdapter(SingleCardSettingResponse)");
    }
}
