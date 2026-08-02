package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.yandex.messaging.core.net.entities.MessengerSupportContext;
import com.yandex.messaging.core.net.entities.directives.Button;
import com.yandex.messaging.core.net.entities.proto.message.CustomPayload;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayloadJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/MessengerSupportContext;", "nullableMessengerSupportContextAdapter", "", "nullableAnyAdapter", "", "Lcom/yandex/messaging/core/net/entities/directives/Button;", "nullableArrayOfNullableButtonAdapter", "nullableArrayOfButtonAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload$Client;", "nullableClientAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CustomPayloadJsonAdapter extends JsonAdapter<CustomPayload> {
    private final JsonAdapter<Object> nullableAnyAdapter;
    private final JsonAdapter<Button[]> nullableArrayOfButtonAdapter;
    private final JsonAdapter<Button[]> nullableArrayOfNullableButtonAdapter;
    private final JsonAdapter<CustomPayload.Client> nullableClientAdapter;
    private final JsonAdapter<MessengerSupportContext> nullableMessengerSupportContextAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("serviceName", "ua", "locale", "target", "context", "callback_data", "actions", "suggest", "supressed_suggests", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "client");

    public CustomPayloadJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "serviceName");
        this.nullableMessengerSupportContextAdapter = moshi.adapter(MessengerSupportContext.class, emptySet, "context");
        this.nullableAnyAdapter = moshi.adapter(Object.class, emptySet, "callbackData");
        this.nullableArrayOfNullableButtonAdapter = moshi.adapter(Types.arrayOf(Button.class), emptySet, "actions");
        this.nullableArrayOfButtonAdapter = moshi.adapter(Types.arrayOf(Button.class), emptySet, "suggests");
        this.nullableClientAdapter = moshi.adapter(CustomPayload.Client.class, emptySet, "client");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final CustomPayload fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        MessengerSupportContext messengerSupportContext = null;
        Object obj = null;
        Button[] buttonArr = null;
        Button[] buttonArr2 = null;
        Button[] buttonArr3 = null;
        String str4 = null;
        CustomPayload.Client client = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        String str5 = null;
        while (jsonReader.hasNext()) {
            boolean z12 = z;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    z = true;
                    continue;
                case 1:
                    str5 = this.nullableStringAdapter.fromJson(jsonReader);
                    z = z12;
                    z2 = true;
                    continue;
                case 2:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    z = z12;
                    z3 = true;
                    continue;
                case 3:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    z = z12;
                    z4 = true;
                    continue;
                case 4:
                    messengerSupportContext = this.nullableMessengerSupportContextAdapter.fromJson(jsonReader);
                    z = z12;
                    z5 = true;
                    continue;
                case 5:
                    obj = this.nullableAnyAdapter.fromJson(jsonReader);
                    z = z12;
                    z6 = true;
                    continue;
                case 6:
                    buttonArr = this.nullableArrayOfNullableButtonAdapter.fromJson(jsonReader);
                    z = z12;
                    z7 = true;
                    continue;
                case 7:
                    buttonArr2 = this.nullableArrayOfButtonAdapter.fromJson(jsonReader);
                    z = z12;
                    z8 = true;
                    continue;
                case 8:
                    buttonArr3 = this.nullableArrayOfButtonAdapter.fromJson(jsonReader);
                    z = z12;
                    z9 = true;
                    continue;
                case 9:
                    str4 = this.nullableStringAdapter.fromJson(jsonReader);
                    z = z12;
                    z10 = true;
                    continue;
                case 10:
                    client = this.nullableClientAdapter.fromJson(jsonReader);
                    z = z12;
                    z11 = true;
                    continue;
            }
            z = z12;
        }
        boolean z13 = z;
        jsonReader.endObject();
        CustomPayload customPayload = new CustomPayload();
        if (z13) {
            customPayload.setServiceName(str);
        }
        if (z2) {
            customPayload.setUserAgent(str5);
        }
        if (z3) {
            customPayload.setLocale(str2);
        }
        if (z4) {
            customPayload.setTarget(str3);
        }
        if (z5) {
            customPayload.setContext(messengerSupportContext);
        }
        if (z6) {
            customPayload.setCallbackData(obj);
        }
        if (z7) {
            customPayload.setActions(buttonArr);
        }
        if (z8) {
            customPayload.suggests = buttonArr2;
        }
        if (z9) {
            customPayload.suppressedSuggests = buttonArr3;
        }
        if (z10) {
            customPayload.event = str4;
        }
        if (z11) {
            customPayload.client = client;
        }
        return customPayload;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, CustomPayload customPayload) {
        CustomPayload customPayload2 = customPayload;
        if (customPayload2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("serviceName");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.getServiceName());
        jsonWriter.name("ua");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.getUserAgent());
        jsonWriter.name("locale");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.getLocale());
        jsonWriter.name("target");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.getTarget());
        jsonWriter.name("context");
        this.nullableMessengerSupportContextAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.getContext());
        jsonWriter.name("callback_data");
        this.nullableAnyAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.getCallbackData());
        jsonWriter.name("actions");
        this.nullableArrayOfNullableButtonAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.getActions());
        jsonWriter.name("suggest");
        this.nullableArrayOfButtonAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.suggests);
        jsonWriter.name("supressed_suggests");
        this.nullableArrayOfButtonAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.suppressedSuggests);
        jsonWriter.name(DatabaseHelper.OttTrackingTable.COLUMN_EVENT);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.event);
        jsonWriter.name("client");
        this.nullableClientAdapter.toJson(jsonWriter, (JsonWriter) customPayload2.client);
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(35, "GeneratedJsonAdapter(CustomPayload)");
    }
}
