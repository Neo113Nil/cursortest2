package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/SuggestsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/Suggests;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "booleanAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/SuggestButtons;", "nullableSuggestButtonsAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/LayoutSuggestButtons;", "nullableLayoutSuggestButtonsAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SuggestsJsonAdapter extends JsonAdapter<Suggests> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<Suggests> constructorRef;
    private final JsonAdapter<LayoutSuggestButtons> nullableLayoutSuggestButtonsAdapter;
    private final JsonAdapter<SuggestButtons> nullableSuggestButtonsAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Persist", "SuggestButtons", "LayoutSuggestButtons");

    public SuggestsJsonAdapter(Moshi moshi) {
        Class cls = Boolean.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.booleanAdapter = moshi.adapter(cls, emptySet, "persist");
        this.nullableSuggestButtonsAdapter = moshi.adapter(SuggestButtons.class, emptySet, "suggestButtons");
        this.nullableLayoutSuggestButtonsAdapter = moshi.adapter(LayoutSuggestButtons.class, emptySet, "layoutSuggestButtons");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Suggests fromJson(JsonReader jsonReader) {
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        SuggestButtons suggestButtons = null;
        LayoutSuggestButtons layoutSuggestButtons = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                bool = this.booleanAdapter.fromJson(jsonReader);
                if (bool == null) {
                    throw Util.unexpectedNull("persist", "Persist", jsonReader);
                }
                i &= -2;
            } else if (selectName == 1) {
                suggestButtons = this.nullableSuggestButtonsAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                layoutSuggestButtons = this.nullableLayoutSuggestButtonsAdapter.fromJson(jsonReader);
                i &= -5;
            }
        }
        jsonReader.endObject();
        if (i == -8) {
            return new Suggests(bool.booleanValue(), suggestButtons, layoutSuggestButtons);
        }
        Constructor<Suggests> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = Suggests.class.getDeclaredConstructor(Boolean.TYPE, SuggestButtons.class, LayoutSuggestButtons.class, Integer.TYPE, Util.DEFAULT_CONSTRUCTOR_MARKER);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(bool, suggestButtons, layoutSuggestButtons, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Suggests suggests) {
        Suggests suggests2 = suggests;
        if (suggests2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Persist");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(suggests2.getPersist()));
        jsonWriter.name("SuggestButtons");
        this.nullableSuggestButtonsAdapter.toJson(jsonWriter, (JsonWriter) suggests2.getSuggestButtons());
        jsonWriter.name("LayoutSuggestButtons");
        this.nullableLayoutSuggestButtonsAdapter.toJson(jsonWriter, (JsonWriter) suggests2.getLayoutSuggestButtons());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(30, "GeneratedJsonAdapter(Suggests)");
    }
}
