package com.yandex.messaging.internal.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.directives.Directive;
import com.yandex.messaging.core.net.entities.proto.message.BotRequest;
import com.yandex.messaging.internal.entities.AiBotAction;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/internal/entities/AiBotActionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/entities/AiBotAction;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/internal/entities/AiBotAction$Icon;", "iconAdapter", "", "Lcom/yandex/messaging/core/net/entities/directives/Directive;", "listOfNullableDirectiveAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/BotRequest$Error;", "nullableListOfErrorAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-entities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AiBotActionJsonAdapter extends JsonAdapter<AiBotAction> {
    private volatile Constructor<AiBotAction> constructorRef;
    private final JsonAdapter<AiBotAction.Icon> iconAdapter;
    private final JsonAdapter<List<Directive>> listOfNullableDirectiveAdapter;
    private final JsonAdapter<List<BotRequest.Error>> nullableListOfErrorAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", "icon", "directives", "errors_on_parsing", "buttonId");
    private final JsonAdapter<String> stringAdapter;

    public AiBotActionJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.iconAdapter = moshi.adapter(AiBotAction.Icon.class, emptySet, "icon");
        this.listOfNullableDirectiveAdapter = moshi.adapter(Types.newParameterizedType(List.class, Directive.class), emptySet, "directives");
        this.nullableListOfErrorAdapter = moshi.adapter(Types.newParameterizedType(List.class, BotRequest.Error.class), emptySet, "errorsOnParsing");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AiBotAction fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AiBotAction.Icon icon = null;
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
                    throw Util.unexpectedNull("title", "title", jsonReader);
                }
            } else if (selectName == 1) {
                icon = this.iconAdapter.fromJson(jsonReader);
                if (icon == null) {
                    throw Util.unexpectedNull("icon", "icon", jsonReader);
                }
            } else if (selectName == 2) {
                list = this.listOfNullableDirectiveAdapter.fromJson(jsonReader);
                if (list == null) {
                    throw Util.unexpectedNull("directives", "directives", jsonReader);
                }
            } else if (selectName == 3) {
                list2 = this.nullableListOfErrorAdapter.fromJson(jsonReader);
                i = -9;
            } else if (selectName == 4 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("buttonId", "buttonId", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -9) {
            String str3 = str2;
            List<BotRequest.Error> list3 = list2;
            List<Directive> list4 = list;
            AiBotAction.Icon icon2 = icon;
            String str4 = str;
            if (str4 == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (icon2 == null) {
                throw Util.missingProperty("icon", "icon", jsonReader);
            }
            if (list4 == null) {
                throw Util.missingProperty("directives", "directives", jsonReader);
            }
            if (str3 != null) {
                return new AiBotAction(str4, icon2, list4, list3, str3);
            }
            throw Util.missingProperty("buttonId", "buttonId", jsonReader);
        }
        String str5 = str2;
        List<BotRequest.Error> list5 = list2;
        List<Directive> list6 = list;
        AiBotAction.Icon icon3 = icon;
        String str6 = str;
        Constructor<AiBotAction> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AiBotAction.class.getDeclaredConstructor(String.class, AiBotAction.Icon.class, List.class, List.class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str6 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (icon3 == null) {
            throw Util.missingProperty("icon", "icon", jsonReader);
        }
        if (list6 == null) {
            throw Util.missingProperty("directives", "directives", jsonReader);
        }
        if (str5 != null) {
            return constructor.newInstance(str6, icon3, list6, list5, str5, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("buttonId", "buttonId", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AiBotAction aiBotAction) {
        AiBotAction aiBotAction2 = aiBotAction;
        if (aiBotAction2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getTitle());
        jsonWriter.name("icon");
        this.iconAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getIcon());
        jsonWriter.name("directives");
        this.listOfNullableDirectiveAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getDirectives());
        jsonWriter.name("errors_on_parsing");
        this.nullableListOfErrorAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getErrorsOnParsing());
        jsonWriter.name("buttonId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getButtonId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(AiBotAction)");
    }
}
