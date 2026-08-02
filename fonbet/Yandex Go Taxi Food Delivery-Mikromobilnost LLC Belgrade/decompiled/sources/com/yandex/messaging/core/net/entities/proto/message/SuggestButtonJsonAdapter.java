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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtonJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButton;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "nullableArrayOfAiBotDirectiveAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuggestButtonJsonAdapter extends JsonAdapter<SuggestButton> {
    private volatile Constructor<SuggestButton> constructorRef;
    private final JsonAdapter<AiBotDirective[]> nullableArrayOfAiBotDirectiveAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Text", "CallbackData", "Directives", "Id");
    private final JsonAdapter<String> stringAdapter;

    public SuggestButtonJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "callbackData");
        this.nullableArrayOfAiBotDirectiveAdapter = moshi.adapter(Types.arrayOf(AiBotDirective.class), emptySet, "directives");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SuggestButton fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        AiBotDirective[] aiBotDirectiveArr = null;
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
                    throw Util.unexpectedNull("text", "Text", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                aiBotDirectiveArr = this.nullableArrayOfAiBotDirectiveAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -15) {
            if (str != null) {
                return new SuggestButton(str, str2, aiBotDirectiveArr, str3);
            }
            throw Util.missingProperty("text", "Text", jsonReader);
        }
        Constructor<SuggestButton> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SuggestButton.class.getDeclaredConstructor(String.class, String.class, AiBotDirective[].class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str != null) {
            return constructor.newInstance(str, str2, aiBotDirectiveArr, str3, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("text", "Text", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SuggestButton suggestButton) {
        SuggestButton suggestButton2 = suggestButton;
        if (suggestButton2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) suggestButton2.getText());
        jsonWriter.name("CallbackData");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) suggestButton2.getCallbackData());
        jsonWriter.name("Directives");
        this.nullableArrayOfAiBotDirectiveAdapter.toJson(jsonWriter, (JsonWriter) suggestButton2.getDirectives());
        jsonWriter.name("Id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) suggestButton2.getElementId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(SuggestButton)");
    }
}
