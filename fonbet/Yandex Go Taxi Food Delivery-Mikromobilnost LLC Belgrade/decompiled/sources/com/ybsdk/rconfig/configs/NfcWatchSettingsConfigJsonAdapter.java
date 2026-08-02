package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/rconfig/configs/NfcWatchSettingsConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/NfcWatchSettingsConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "Lcom/ybsdk/rconfig/configs/WatchBanner;", "listOfWatchBannerAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcWatchSettingsConfigJsonAdapter extends JsonAdapter<NfcWatchSettingsConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<NfcWatchSettingsConfig> constructorRef;
    private final JsonAdapter<List<WatchBanner>> listOfWatchBannerAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "settings_title", "settings_subtitle", "settings_category_title", "settings_category_subtitle", "title", "subtitle", "items");

    public NfcWatchSettingsConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "settingsTitle");
        this.listOfWatchBannerAdapter = moshi.adapter(Types.newParameterizedType(List.class, WatchBanner.class), emptySet, "items");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final NfcWatchSettingsConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i = -1;
        Boolean bool = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List<WatchBanner> list = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -3;
                    break;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -5;
                    break;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -9;
                    break;
                case 4:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -17;
                    break;
                case 5:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -33;
                    break;
                case 6:
                    str6 = this.nullableStringAdapter.fromJson(jsonReader);
                    i &= -65;
                    break;
                case 7:
                    list = this.listOfWatchBannerAdapter.fromJson(jsonReader);
                    if (list == null) {
                        throw Util.unexpectedNull("items", "items", jsonReader);
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (i == -127) {
            List<WatchBanner> list2 = list;
            String str7 = str5;
            String str8 = str3;
            String str9 = str;
            if (bool == null) {
                throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
            }
            String str10 = str6;
            String str11 = str4;
            String str12 = str2;
            boolean booleanValue = bool.booleanValue();
            if (list2 != null) {
                return new NfcWatchSettingsConfig(booleanValue, str9, str12, str8, str11, str7, str10, list2);
            }
            throw Util.missingProperty("items", "items", jsonReader);
        }
        String str13 = str4;
        String str14 = str2;
        String str15 = str6;
        List<WatchBanner> list3 = list;
        String str16 = str5;
        String str17 = str3;
        String str18 = str;
        Constructor<NfcWatchSettingsConfig> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = NfcWatchSettingsConfig.class.getDeclaredConstructor(Boolean.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, List.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        Constructor<NfcWatchSettingsConfig> constructor2 = constructor;
        if (bool == null) {
            throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
        }
        if (list3 != null) {
            return constructor2.newInstance(bool, str18, str14, str17, str13, str16, str15, list3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("items", "items", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, NfcWatchSettingsConfig nfcWatchSettingsConfig) {
        NfcWatchSettingsConfig nfcWatchSettingsConfig2 = nfcWatchSettingsConfig;
        if (nfcWatchSettingsConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(nfcWatchSettingsConfig2.isEnabled()));
        jsonWriter.name("settings_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcWatchSettingsConfig2.getSettingsTitle());
        jsonWriter.name("settings_subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcWatchSettingsConfig2.getSettingsSubtitle());
        jsonWriter.name("settings_category_title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcWatchSettingsConfig2.getSettingsCategoryTitle());
        jsonWriter.name("settings_category_subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcWatchSettingsConfig2.getSettingsCategorySubtitle());
        jsonWriter.name("title");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcWatchSettingsConfig2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) nfcWatchSettingsConfig2.getSubtitle());
        jsonWriter.name("items");
        this.listOfWatchBannerAdapter.toJson(jsonWriter, (JsonWriter) nfcWatchSettingsConfig2.getItems());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(44, "GeneratedJsonAdapter(NfcWatchSettingsConfig)");
    }
}
