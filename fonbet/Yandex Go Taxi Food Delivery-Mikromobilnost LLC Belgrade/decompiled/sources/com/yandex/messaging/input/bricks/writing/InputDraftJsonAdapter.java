package com.yandex.messaging.input.bricks.writing;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.entities.ForwardMessageRef;
import com.yandex.messaging.internal.view.attach.AttachInfo;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\"\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\"\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\"\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00100\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/input/bricks/writing/InputDraftJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/input/bricks/writing/InputDraft;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "Lcom/yandex/messaging/internal/view/attach/AttachInfo;", "nullableListOfAttachInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "nullableStringAdapter", "", "Lcom/yandex/messaging/internal/ServerMessageRef;", "nullableArrayOfServerMessageRefAdapter", "Lcom/yandex/messaging/internal/entities/ForwardMessageRef;", "nullableArrayOfForwardMessageRefAdapter", "", "booleanAdapter", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class InputDraftJsonAdapter extends JsonAdapter<InputDraft> {
    public static final int $stable = 8;
    private final JsonAdapter<Boolean> booleanAdapter;
    private final JsonAdapter<ForwardMessageRef[]> nullableArrayOfForwardMessageRefAdapter;
    private final JsonAdapter<ServerMessageRef[]> nullableArrayOfServerMessageRefAdapter;
    private final JsonAdapter<List<AttachInfo>> nullableListOfAttachInfoAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("attachments", "forward_chat_id", "forward_messages_timestamps", "forwards", "is_quote", "is_reply", "is_silent", "is_starred", "quoted_text", "text");

    public InputDraftJsonAdapter(Moshi moshi) {
        ParameterizedType newParameterizedType = Types.newParameterizedType(List.class, AttachInfo.class);
        EmptySet emptySet = EmptySet.a;
        this.nullableListOfAttachInfoAdapter = moshi.adapter(newParameterizedType, emptySet, "attachments");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "forwardChatId");
        this.nullableArrayOfServerMessageRefAdapter = moshi.adapter(Types.arrayOf(ServerMessageRef.class), emptySet, "forwardMessageTimestamps");
        this.nullableArrayOfForwardMessageRefAdapter = moshi.adapter(Types.arrayOf(ForwardMessageRef.class), emptySet, "forwardMessages");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "isQuote");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final InputDraft fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        List<AttachInfo> list = null;
        ServerMessageRef[] serverMessageRefArr = null;
        ForwardMessageRef[] forwardMessageRefArr = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        String str3 = null;
        while (jsonReader.hasNext()) {
            Boolean bool5 = bool;
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    break;
                case 0:
                    list = this.nullableListOfAttachInfoAdapter.fromJson(jsonReader);
                    bool = bool5;
                    z = true;
                    continue;
                case 1:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool5;
                    z2 = true;
                    continue;
                case 2:
                    serverMessageRefArr = this.nullableArrayOfServerMessageRefAdapter.fromJson(jsonReader);
                    bool = bool5;
                    z3 = true;
                    continue;
                case 3:
                    forwardMessageRefArr = this.nullableArrayOfForwardMessageRefAdapter.fromJson(jsonReader);
                    bool = bool5;
                    z4 = true;
                    continue;
                case 4:
                    bool = this.booleanAdapter.fromJson(jsonReader);
                    if (bool == null) {
                        throw Util.unexpectedNull("isQuote", "is_quote", jsonReader);
                    }
                    continue;
                case 5:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("isReply", "is_reply", jsonReader);
                    }
                    break;
                case 6:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("isSilent", "is_silent", jsonReader);
                    }
                    break;
                case 7:
                    bool4 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool4 == null) {
                        throw Util.unexpectedNull("isStarred", "is_starred", jsonReader);
                    }
                    break;
                case 8:
                    str = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool5;
                    z5 = true;
                    continue;
                case 9:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    bool = bool5;
                    z6 = true;
                    continue;
            }
            bool = bool5;
        }
        Boolean bool6 = bool;
        jsonReader.endObject();
        InputDraft inputDraft = new InputDraft();
        if (z) {
            inputDraft.setAttachments(list);
        }
        if (z2) {
            inputDraft.setForwardChatId(str3);
        }
        if (z3) {
            inputDraft.setForwardMessageTimestamps(serverMessageRefArr);
        }
        if (z4) {
            inputDraft.setForwardMessages(forwardMessageRefArr);
        }
        inputDraft.setQuote(bool6 != null ? bool6.booleanValue() : inputDraft.getIsQuote());
        inputDraft.setReply(bool2 != null ? bool2.booleanValue() : inputDraft.getIsReply());
        inputDraft.setSilent(bool3 != null ? bool3.booleanValue() : inputDraft.getIsSilent());
        inputDraft.setStarred(bool4 != null ? bool4.booleanValue() : inputDraft.getIsStarred());
        if (z5) {
            inputDraft.setQuotedText(str);
        }
        if (z6) {
            inputDraft.setText(str2);
        }
        return inputDraft;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, InputDraft inputDraft) {
        InputDraft inputDraft2 = inputDraft;
        if (inputDraft2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("attachments");
        this.nullableListOfAttachInfoAdapter.toJson(jsonWriter, (JsonWriter) inputDraft2.getAttachments());
        jsonWriter.name("forward_chat_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) inputDraft2.getForwardChatId());
        jsonWriter.name("forward_messages_timestamps");
        this.nullableArrayOfServerMessageRefAdapter.toJson(jsonWriter, (JsonWriter) inputDraft2.getForwardMessageTimestamps());
        jsonWriter.name("forwards");
        this.nullableArrayOfForwardMessageRefAdapter.toJson(jsonWriter, (JsonWriter) inputDraft2.getForwardMessages());
        jsonWriter.name("is_quote");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(inputDraft2.getIsQuote()));
        jsonWriter.name("is_reply");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(inputDraft2.getIsReply()));
        jsonWriter.name("is_silent");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(inputDraft2.getIsSilent()));
        jsonWriter.name("is_starred");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(inputDraft2.getIsStarred()));
        jsonWriter.name("quoted_text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) inputDraft2.getQuotedText());
        jsonWriter.name("text");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) inputDraft2.getText());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(32, "GeneratedJsonAdapter(InputDraft)");
    }
}
