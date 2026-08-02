package com.yandex.messaging.internal.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\"\u0010\u000f\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/internal/entities/SuggestJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/entities/Suggest;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/yandex/messaging/core/net/entities/directives/Directive;", "listOfNullableDirectiveAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "nullableListOfErrorAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuggestJsonAdapter extends JsonAdapter<Suggest> {
    private volatile Constructor<Suggest> constructorRef;
    private final JsonAdapter<List<Directive>> listOfNullableDirectiveAdapter;
    private final JsonAdapter<List<BotRequest.Error>> nullableListOfErrorAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", "directives", "errors_on_parsing", "button_id");
    private final JsonAdapter<String> stringAdapter;

    public SuggestJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.listOfNullableDirectiveAdapter = moshi.adapter(Types.newParameterizedType(List.class, Directive.class), emptySet, "directives");
        this.nullableListOfErrorAdapter = moshi.adapter(Types.newParameterizedType(List.class, BotRequest.Error.class), emptySet, "errorsOnParsing");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "buttonId");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Suggest fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        List<Directive> list = null;
        List<BotRequest.Error> list2 = null;
        String str2 = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1) {
                list = this.listOfNullableDirectiveAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("directives", "directives", jsonReader);
                }
            } else if (selectName == 2) {
                list2 = this.nullableListOfErrorAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            }
        }
        jsonReader.endObject();
        if (i == -13) {
            if (str == null) {
                throw Util.missingProperty("text", "text", jsonReader);
            }
            if (list != null) {
                return new Suggest(str, list, list2, str2);
            }
            throw Util.missingProperty("directives", "directives", jsonReader);
        }
        Constructor<Suggest> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Suggest.class.getDeclaredConstructor(String.class, List.class, List.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (list != null) {
            return constructor.newInstance(str, list, list2, str2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("directives", "directives", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Suggest suggest) {
        Suggest suggest2 = suggest;
        if (suggest2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) suggest2.getText());
        jsonWriter.name("directives");
        this.listOfNullableDirectiveAdapter.toJson(jsonWriter, (JsonWriter) suggest2.getDirectives());
        jsonWriter.name("errors_on_parsing");
        this.nullableListOfErrorAdapter.toJson(jsonWriter, (JsonWriter) suggest2.getErrorsOnParsing());
        jsonWriter.name("button_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) suggest2.getButtonId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(29, "GeneratedJsonAdapter(Suggest)");
    }
}
