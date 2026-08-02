package com.ybsdk.rconfig.configs;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import com.ybsdk.core.common.data.network.dto.ThemedParameter;
import com.ybsdk.core.utils.text.Text;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR \u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/ybsdk/rconfig/configs/AutoTopupReplenishNotificationConfigJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/rconfig/configs/AutoTopupReplenishNotificationConfig;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/ybsdk/core/utils/text/Text;", "textAdapter", "nullableTextAdapter", "Lcom/ybsdk/core/common/data/network/dto/ThemedParameter;", "", "nullableThemedParameterOfStringAdapter", "stringAdapter", "themedParameterOfStringAdapter", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AutoTopupReplenishNotificationConfigJsonAdapter extends JsonAdapter<AutoTopupReplenishNotificationConfig> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<Text> nullableTextAdapter;
    private final JsonAdapter<ThemedParameter<String>> nullableThemedParameterOfStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("is_enabled", "title", "subtitle", "icon", "action", "text_color", "background_color");
    private final JsonAdapter<String> stringAdapter;
    private final JsonAdapter<Text> textAdapter;
    private final JsonAdapter<ThemedParameter<String>> themedParameterOfStringAdapter;

    public AutoTopupReplenishNotificationConfigJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "isEnabled");
        this.textAdapter = moshi.adapter(Text.class, emptySet, "title");
        this.nullableTextAdapter = moshi.adapter(Text.class, emptySet, "subtitle");
        this.nullableThemedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "icon");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "action");
        this.themedParameterOfStringAdapter = moshi.adapter(Types.newParameterizedType(ThemedParameter.class, String.class), emptySet, "textColor");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AutoTopupReplenishNotificationConfig fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Boolean bool = null;
        Text text = null;
        Text text2 = null;
        ThemedParameter<String> themedParameter = null;
        String str = null;
        ThemedParameter<String> themedParameter2 = null;
        ThemedParameter<String> themedParameter3 = null;
        while (true) {
            Boolean bool2 = bool;
            if (!jsonReader.hasNext()) {
                Text text3 = text;
                jsonReader.endObject();
                if (bool2 == null) {
                    throw Util.missingProperty("isEnabled", "is_enabled", jsonReader);
                }
                boolean booleanValue = bool2.booleanValue();
                if (text3 == null) {
                    throw Util.missingProperty("title", "title", jsonReader);
                }
                if (str == null) {
                    throw Util.missingProperty("action", "action", jsonReader);
                }
                if (themedParameter2 == null) {
                    throw Util.missingProperty("textColor", "text_color", jsonReader);
                }
                if (themedParameter3 != null) {
                    return new AutoTopupReplenishNotificationConfig(booleanValue, text3, text2, themedParameter, str, themedParameter2, themedParameter3);
                }
                throw Util.missingProperty(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
            }
            Text text4 = text;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    bool = bool2;
                    text = text4;
                case 0:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isEnabled", "is_enabled", jsonReader);
                    }
                    text = text4;
                case 1:
                    text = this.textAdapter.fromJson(jsonReader);
                    if (text == null) {
                        throw Util.unexpectedNull("title", "title", jsonReader);
                    }
                    bool = bool2;
                case 2:
                    text2 = this.nullableTextAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text = text4;
                case 3:
                    themedParameter = this.nullableThemedParameterOfStringAdapter.fromJson(jsonReader);
                    bool = bool2;
                    text = text4;
                case 4:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("action", "action", jsonReader);
                    }
                    bool = bool2;
                    text = text4;
                case 5:
                    themedParameter2 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter2 == null) {
                        throw Util.unexpectedNull("textColor", "text_color", jsonReader);
                    }
                    bool = bool2;
                    text = text4;
                case 6:
                    themedParameter3 = this.themedParameterOfStringAdapter.fromJson(jsonReader);
                    if (themedParameter3 == null) {
                        throw Util.unexpectedNull(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "background_color", jsonReader);
                    }
                    bool = bool2;
                    text = text4;
                default:
                    bool = bool2;
                    text = text4;
            }
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AutoTopupReplenishNotificationConfig autoTopupReplenishNotificationConfig) {
        AutoTopupReplenishNotificationConfig autoTopupReplenishNotificationConfig2 = autoTopupReplenishNotificationConfig;
        if (autoTopupReplenishNotificationConfig2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("is_enabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(autoTopupReplenishNotificationConfig2.isEnabled()));
        jsonWriter.name("title");
        this.textAdapter.toJson(jsonWriter, (JsonWriter) autoTopupReplenishNotificationConfig2.getTitle());
        jsonWriter.name("subtitle");
        this.nullableTextAdapter.toJson(jsonWriter, (JsonWriter) autoTopupReplenishNotificationConfig2.getSubtitle());
        jsonWriter.name("icon");
        this.nullableThemedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupReplenishNotificationConfig2.getIcon());
        jsonWriter.name("action");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupReplenishNotificationConfig2.getAction());
        jsonWriter.name("text_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupReplenishNotificationConfig2.getTextColor());
        jsonWriter.name("background_color");
        this.themedParameterOfStringAdapter.toJson(jsonWriter, (JsonWriter) autoTopupReplenishNotificationConfig2.getBackgroundColor());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(58, "GeneratedJsonAdapter(AutoTopupReplenishNotificationConfig)");
    }
}
