package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/CustomStatusMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/CustomStatusMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/yandex/messaging/core/net/entities/proto/message/LocalizationEntry;", "nullableArrayOfLocalizationEntryAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomStatusMessageJsonAdapter extends JsonAdapter<CustomStatusMessage> {
    private volatile Constructor<CustomStatusMessage> constructorRef;
    private final JsonAdapter<LocalizationEntry[]> nullableArrayOfLocalizationEntryAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Emoji", "Text", "Localizations", "IconName");
    private final JsonAdapter<String> stringAdapter;

    public CustomStatusMessageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "emoji");
        this.nullableArrayOfLocalizationEntryAdapter = moshi.adapter(Types.arrayOf(LocalizationEntry.class), emptySet, "localizations");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "iconName");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CustomStatusMessage fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        LocalizationEntry[] localizationEntryArr = null;
        String str3 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("emoji", "Emoji", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull("text", "Text", jsonReader);
                }
            } else if (selectName == 2) {
                localizationEntryArr = this.nullableArrayOfLocalizationEntryAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            if (str == null) {
                throw Util.missingProperty("emoji", "Emoji", jsonReader);
            }
            if (str2 != null) {
                return new CustomStatusMessage(str, str2, localizationEntryArr, str3);
            }
            throw Util.missingProperty("text", "Text", jsonReader);
        }
        Constructor<CustomStatusMessage> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = CustomStatusMessage.class.getDeclaredConstructor(String.class, String.class, LocalizationEntry[].class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("emoji", "Emoji", jsonReader);
        }
        if (str2 != null) {
            return constructor.newInstance(str, str2, localizationEntryArr, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("text", "Text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CustomStatusMessage customStatusMessage) {
        CustomStatusMessage customStatusMessage2 = customStatusMessage;
        if (customStatusMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Emoji");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) customStatusMessage2.getEmoji());
        jsonWriter.name("Text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) customStatusMessage2.getText());
        jsonWriter.name("Localizations");
        this.nullableArrayOfLocalizationEntryAdapter.toJson(jsonWriter, (JsonWriter) customStatusMessage2.getLocalizations());
        jsonWriter.name("IconName");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) customStatusMessage2.getIconName());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(41, "GeneratedJsonAdapter(CustomStatusMessage)");
    }
}
