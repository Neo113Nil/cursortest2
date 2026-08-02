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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotAction;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActionIcon;", "aiBotActionIconAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotDirective;", "nullableArrayOfAiBotDirectiveAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AiBotActionJsonAdapter extends JsonAdapter<AiBotAction> {
    private final JsonAdapter<AiBotActionIcon> aiBotActionIconAdapter;
    private volatile Constructor<AiBotAction> constructorRef;
    private final JsonAdapter<AiBotDirective[]> nullableArrayOfAiBotDirectiveAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Title", "Icon", "Directives", "Id");
    private final JsonAdapter<String> stringAdapter;

    public AiBotActionJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.aiBotActionIconAdapter = moshi.adapter(AiBotActionIcon.class, emptySet, "icon");
        this.nullableArrayOfAiBotDirectiveAdapter = moshi.adapter(Types.arrayOf(AiBotDirective.class), emptySet, "directives");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final AiBotAction fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        AiBotActionIcon aiBotActionIcon = null;
        AiBotDirective[] aiBotDirectiveArr = null;
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
                    throw Util.unexpectedNull("title", "Title", jsonReader);
                }
            } else if (selectName == 1) {
                aiBotActionIcon = this.aiBotActionIconAdapter.fromJson(jsonReader);
                if (aiBotActionIcon == null) {
                    throw Util.unexpectedNull("icon", "Icon", jsonReader);
                }
            } else if (selectName == 2) {
                aiBotDirectiveArr = this.nullableArrayOfAiBotDirectiveAdapter.fromJson(jsonReader);
                i = -5;
            } else if (selectName == 3 && (str2 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("buttonId", "Id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -5) {
            if (str == null) {
                throw Util.missingProperty("title", "Title", jsonReader);
            }
            if (aiBotActionIcon == null) {
                throw Util.missingProperty("icon", "Icon", jsonReader);
            }
            if (str2 != null) {
                return new AiBotAction(str, aiBotActionIcon, aiBotDirectiveArr, str2);
            }
            throw Util.missingProperty("buttonId", "Id", jsonReader);
        }
        Constructor<AiBotAction> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = AiBotAction.class.getDeclaredConstructor(String.class, AiBotActionIcon.class, AiBotDirective[].class, String.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        if (str == null) {
            throw Util.missingProperty("title", "Title", jsonReader);
        }
        if (aiBotActionIcon == null) {
            throw Util.missingProperty("icon", "Icon", jsonReader);
        }
        if (str2 != null) {
            return constructor.newInstance(str, aiBotActionIcon, aiBotDirectiveArr, str2, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("buttonId", "Id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, AiBotAction aiBotAction) {
        AiBotAction aiBotAction2 = aiBotAction;
        if (aiBotAction2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getTitle());
        jsonWriter.name("Icon");
        this.aiBotActionIconAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getIcon());
        jsonWriter.name("Directives");
        this.nullableArrayOfAiBotDirectiveAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getDirectives());
        jsonWriter.name("Id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) aiBotAction2.getButtonId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(33, "GeneratedJsonAdapter(AiBotAction)");
    }
}
