package com.yandex.messaging.core.net.entities.chatcreate;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/core/net/entities/chatcreate/RolesJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/chatcreate/Roles;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RolesJsonAdapter extends JsonAdapter<Roles> {
    private final JsonReader.Options options = JsonReader.Options.of(new String[0]);

    public RolesJsonAdapter(Moshi moshi) {
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Roles fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(this.options) == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new Roles();
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Roles roles) {
        if (roles == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
        } else {
            jsonWriter.beginObject();
            jsonWriter.endObject();
        }
    }

    public final String toString() {
        return uw51.h(27, "GeneratedJsonAdapter(Roles)");
    }
}
