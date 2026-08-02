package com.ybsdk.feature.autotopup.internal.network.dto;

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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeSettingJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeSetting;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupTypeDto;", "autoTopupTypeDtoAdapter", "", "stringAdapter", "", "Lcom/ybsdk/feature/autotopup/internal/network/dto/AutoTopupMoneyDto;", "nullableListOfAutoTopupMoneyDtoAdapter", "feature-autotopup_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AutoTopupTypeSettingJsonAdapter extends JsonAdapter<AutoTopupTypeSetting> {
    private final JsonAdapter<AutoTopupTypeDto> autoTopupTypeDtoAdapter;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<List<AutoTopupMoneyDto>> nullableListOfAutoTopupMoneyDtoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("selected", "autotopup_type", "title", "money_fields");
    private final JsonAdapter<String> stringAdapter;

    public AutoTopupTypeSettingJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "selected");
        this.autoTopupTypeDtoAdapter = moshi.adapter(AutoTopupTypeDto.class, emptySet, "autotopupType");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableListOfAutoTopupMoneyDtoAdapter = moshi.adapter(Types.newParameterizedType(List.class, AutoTopupMoneyDto.class), emptySet, "moneyFields");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupTypeSetting fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        AutoTopupTypeDto autoTopupTypeDto = null;
        String str = null;
        List<AutoTopupMoneyDto> list = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("selected", "selected", jsonReader);
                }
            } else if (selectName == 1) {
                autoTopupTypeDto = this.autoTopupTypeDtoAdapter.fromJson(jsonReader);
                if (autoTopupTypeDto == null) {
                    throw Util.unexpectedNull("autotopupType", "autotopup_type", jsonReader);
                }
            } else if (selectName == 2) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 3) {
                list = this.nullableListOfAutoTopupMoneyDtoAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (bool == null) {
            throw Util.missingProperty("selected", "selected", jsonReader);
        }
        boolean booleanValue = bool.booleanValue();
        if (autoTopupTypeDto == null) {
            throw Util.missingProperty("autotopupType", "autotopup_type", jsonReader);
        }
        if (str != null) {
            return new AutoTopupTypeSetting(booleanValue, autoTopupTypeDto, str, list);
        }
        throw Util.missingProperty("title", "title", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupTypeSetting autoTopupTypeSetting) {
        AutoTopupTypeSetting autoTopupTypeSetting2 = autoTopupTypeSetting;
        if (autoTopupTypeSetting2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("selected");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(autoTopupTypeSetting2.getSelected()));
        jsonWriter.name("autotopup_type");
        this.autoTopupTypeDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupTypeSetting2.getAutotopupType());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupTypeSetting2.getTitle());
        jsonWriter.name("money_fields");
        this.nullableListOfAutoTopupMoneyDtoAdapter.toJson(jsonWriter, (JsonWriter) autoTopupTypeSetting2.getMoneyFields());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(42, "GeneratedJsonAdapter(AutoTopupTypeSetting)");
    }
}
