package com.ybsdk.feature.settings.api.data;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ybsdk/feature/settings/api/data/SettingDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/feature/settings/api/data/SettingDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "nullableThemedParameterOfStringAdapter", "", "booleanAdapter", "Lcom/ybsdk/feature/settings/api/data/SettingPropertyDto;", "nullableSettingPropertyDtoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "feature-settings-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingDtoJsonAdapter extends JsonAdapter<SettingDto> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<SettingDto> constructorRef;
    private final JsonAdapter<SettingPropertyDto> nullableSettingPropertyDtoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("key", "title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "description_color", BackendConfig.Restrictions.ENABLED, "property");
    private final JsonAdapter<String> stringAdapter;

    public SettingDtoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "key");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "descriptionColor");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, BackendConfig.Restrictions.ENABLED);
        this.nullableSettingPropertyDtoAdapter = moshi.adapter(SettingPropertyDto.class, emptySet, "property");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SettingDto fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        String str = null;
        String str2 = null;
        String str3 = null;
        ThemedParameter<String> themedParameter = null;
        Boolean bool = null;
        SettingPropertyDto settingPropertyDto = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("key", "key", jsonReader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(jsonReader);
                    if (str2 == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    break;
                case 2:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    break;
                case 3:
                    themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    break;
                case 4:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
                    }
                    break;
                case 5:
                    settingPropertyDto = this.nullableSettingPropertyDtoAdapter.fromJson(jsonReader);
                    i = -33;
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -33) {
            Boolean bool2 = bool;
            ThemedParameter<String> themedParameter2 = themedParameter;
            String str4 = str3;
            String str5 = str2;
            String str6 = str;
            if (str6 == null) {
                throw Util.missingProperty("key", "key", jsonReader);
            }
            if (str5 == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (bool2 == null) {
                throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
            }
            return new SettingDto(str6, str5, str4, themedParameter2, bool2.booleanValue(), settingPropertyDto);
        }
        Boolean bool3 = bool;
        SettingPropertyDto settingPropertyDto2 = settingPropertyDto;
        ThemedParameter<String> themedParameter3 = themedParameter;
        String str7 = str3;
        String str8 = str2;
        String str9 = str;
        Constructor<SettingDto> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SettingDto.class.getDeclaredConstructor(String.class, String.class, String.class, ThemedParameter.class, Boolean.TYPE, SettingPropertyDto.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<SettingDto> constructor2 = constructor;
        if (str9 == null) {
            throw Util.missingProperty("key", "key", jsonReader);
        }
        if (str8 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (bool3 != null) {
            return constructor2.newInstance(str9, str8, str7, themedParameter3, bool3, settingPropertyDto2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty(BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.ENABLED, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SettingDto settingDto) {
        SettingDto settingDto2 = settingDto;
        if (settingDto2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("key");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) settingDto2.getKey());
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) settingDto2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) settingDto2.getDescription());
        jsonWriter.name("description_color");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) settingDto2.getDescriptionColor());
        jsonWriter.name(BackendConfig.Restrictions.ENABLED);
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(settingDto2.getEnabled()));
        jsonWriter.name("property");
        this.nullableSettingPropertyDtoAdapter.toJson(jsonWriter, (JsonWriter) settingDto2.getProperty());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(SettingDto)");
    }
}
