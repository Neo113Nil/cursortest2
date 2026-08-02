package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.message.PlainMessage;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\fR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\fR\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\fR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\fR\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\fR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\fR\"\u0010!\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\fR\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\fR\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\fR\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\fR\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\fR\u001c\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010(0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\fR\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010*0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\fR\"\u0010-\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020,\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\fR\u001e\u0010/\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessageJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Text;", "nullableTextAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Image;", "nullableImageAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$File;", "nullableFileAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Sticker;", "nullableStickerAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Card;", "nullableCardAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Gallery;", "nullableGalleryAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Voice;", "nullableVoiceAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/PlainMessage$Poll;", "nullablePollAdapter", "", "stringAdapter", "", "longAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/message/MessageRef;", "nullableArrayOfMessageRefAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/CustomPayload;", "nullableCustomPayloadAdapter", "nullableArrayOfStringAdapter", "nullableStringAdapter", "", "booleanAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/AiBotActions;", "nullableAiBotActionsAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/Suggests;", "nullableSuggestsAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ForwardedMessageStyle;", "nullableArrayOfForwardedMessageStyleAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PlainMessageJsonAdapter extends JsonAdapter<PlainMessage> {
    private final JsonAdapter<Boolean> booleanAdapter;
    private volatile Constructor<PlainMessage> constructorRef;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<AiBotActions> nullableAiBotActionsAdapter;
    private final JsonAdapter<ForwardedMessageStyle[]> nullableArrayOfForwardedMessageStyleAdapter;
    private final JsonAdapter<MessageRef[]> nullableArrayOfMessageRefAdapter;
    private final JsonAdapter<String[]> nullableArrayOfStringAdapter;
    private final JsonAdapter<PlainMessage.Card> nullableCardAdapter;
    private final JsonAdapter<CustomPayload> nullableCustomPayloadAdapter;
    private final JsonAdapter<PlainMessage.File> nullableFileAdapter;
    private final JsonAdapter<PlainMessage.Gallery> nullableGalleryAdapter;
    private final JsonAdapter<PlainMessage.Image> nullableImageAdapter;
    private final JsonAdapter<PlainMessage.Poll> nullablePollAdapter;
    private final JsonAdapter<PlainMessage.Sticker> nullableStickerAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonAdapter<Suggests> nullableSuggestsAdapter;
    private final JsonAdapter<PlainMessage.Text> nullableTextAdapter;
    private final JsonAdapter<PlainMessage.Voice> nullableVoiceAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Text", "Image", "MiscFile", "Sticker", "Card", "Gallery", "Voice", "Poll", "ChatId", "Timestamp", "ForwardedMessageRefs", "CustomPayload", "MentionedUserIds", "PayloadId", "UrlPreviewDisabled", "NotificationText", "IsImportant", "ActionButtonsHolder", "SuggestButtonsHolder", "ForwardedMessageStyles");
    private final JsonAdapter<String> stringAdapter;

    public PlainMessageJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableTextAdapter = moshi.adapter(PlainMessage.Text.class, emptySet, "text");
        this.nullableImageAdapter = moshi.adapter(PlainMessage.Image.class, emptySet, "image");
        this.nullableFileAdapter = moshi.adapter(PlainMessage.File.class, emptySet, "file");
        this.nullableStickerAdapter = moshi.adapter(PlainMessage.Sticker.class, emptySet, "sticker");
        this.nullableCardAdapter = moshi.adapter(PlainMessage.Card.class, emptySet, "card");
        this.nullableGalleryAdapter = moshi.adapter(PlainMessage.Gallery.class, emptySet, "gallery");
        this.nullableVoiceAdapter = moshi.adapter(PlainMessage.Voice.class, emptySet, "voice");
        this.nullablePollAdapter = moshi.adapter(PlainMessage.Poll.class, emptySet, "poll");
        this.stringAdapter = moshi.adapter(String.class, emptySet, "chatId");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
        this.nullableArrayOfMessageRefAdapter = moshi.adapter(Types.arrayOf(MessageRef.class), emptySet, "forwardedMessageRefs");
        this.nullableCustomPayloadAdapter = moshi.adapter(CustomPayload.class, emptySet, "customPayload");
        this.nullableArrayOfStringAdapter = moshi.adapter(Types.arrayOf(String.class), emptySet, "mentionedUserIds");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, "payloadId");
        this.booleanAdapter = moshi.adapter(Boolean.TYPE, emptySet, "urlPreviewDisabled");
        this.nullableAiBotActionsAdapter = moshi.adapter(AiBotActions.class, emptySet, "aiBotActionsHolder");
        this.nullableSuggestsAdapter = moshi.adapter(Suggests.class, emptySet, "suggestsHolder");
        this.nullableArrayOfForwardedMessageStyleAdapter = moshi.adapter(Types.arrayOf(ForwardedMessageStyle.class), emptySet, "forwardedMessageStyles");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final PlainMessage fromJson(JsonReader jsonReader) {
        int i;
        Boolean bool = Boolean.FALSE;
        jsonReader.beginObject();
        int i2 = -1;
        Long l = 0L;
        Boolean bool2 = bool;
        Boolean bool3 = bool2;
        PlainMessage.Text text = null;
        PlainMessage.Image image = null;
        PlainMessage.File file = null;
        PlainMessage.Sticker sticker = null;
        PlainMessage.Card card = null;
        PlainMessage.Gallery gallery = null;
        String str = null;
        MessageRef[] messageRefArr = null;
        CustomPayload customPayload = null;
        String[] strArr = null;
        String str2 = null;
        String str3 = null;
        AiBotActions aiBotActions = null;
        Suggests suggests = null;
        ForwardedMessageStyle[] forwardedMessageStyleArr = null;
        PlainMessage.Voice voice = null;
        PlainMessage.Poll poll = null;
        while (jsonReader.hasNext()) {
            switch (jsonReader.selectName(this.options)) {
                case -1:
                    jsonReader.skipName();
                    jsonReader.skipValue();
                    continue;
                case 0:
                    text = this.nullableTextAdapter.fromJson(jsonReader);
                    i2 &= -2;
                    continue;
                case 1:
                    image = this.nullableImageAdapter.fromJson(jsonReader);
                    i2 &= -3;
                    continue;
                case 2:
                    file = this.nullableFileAdapter.fromJson(jsonReader);
                    i2 &= -5;
                    continue;
                case 3:
                    sticker = this.nullableStickerAdapter.fromJson(jsonReader);
                    i2 &= -9;
                    continue;
                case 4:
                    card = this.nullableCardAdapter.fromJson(jsonReader);
                    i2 &= -17;
                    continue;
                case 5:
                    gallery = this.nullableGalleryAdapter.fromJson(jsonReader);
                    i2 &= -33;
                    continue;
                case 6:
                    voice = this.nullableVoiceAdapter.fromJson(jsonReader);
                    i2 &= -65;
                    continue;
                case 7:
                    poll = this.nullablePollAdapter.fromJson(jsonReader);
                    i2 &= -129;
                    continue;
                case 8:
                    str = this.stringAdapter.fromJson(jsonReader);
                    if (str == null) {
                        throw Util.unexpectedNull("chatId", "ChatId", jsonReader);
                    }
                    continue;
                case 9:
                    l = this.longAdapter.fromJson(jsonReader);
                    if (l == null) {
                        throw Util.unexpectedNull(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
                    }
                    i2 &= -513;
                    continue;
                case 10:
                    messageRefArr = this.nullableArrayOfMessageRefAdapter.fromJson(jsonReader);
                    i2 &= -1025;
                    continue;
                case 11:
                    customPayload = this.nullableCustomPayloadAdapter.fromJson(jsonReader);
                    i2 &= -2049;
                    continue;
                case 12:
                    strArr = this.nullableArrayOfStringAdapter.fromJson(jsonReader);
                    i2 &= -4097;
                    continue;
                case 13:
                    str2 = this.nullableStringAdapter.fromJson(jsonReader);
                    i2 &= -8193;
                    continue;
                case 14:
                    bool2 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool2 == null) {
                        throw Util.unexpectedNull("urlPreviewDisabled", "UrlPreviewDisabled", jsonReader);
                    }
                    i2 &= -16385;
                    continue;
                case 15:
                    str3 = this.nullableStringAdapter.fromJson(jsonReader);
                    i = -32769;
                    break;
                case 16:
                    bool3 = this.booleanAdapter.fromJson(jsonReader);
                    if (bool3 == null) {
                        throw Util.unexpectedNull("isStarred", "IsImportant", jsonReader);
                    }
                    i = -65537;
                    break;
                case 17:
                    aiBotActions = this.nullableAiBotActionsAdapter.fromJson(jsonReader);
                    i = -131073;
                    break;
                case 18:
                    suggests = this.nullableSuggestsAdapter.fromJson(jsonReader);
                    i = -262145;
                    break;
                case 19:
                    forwardedMessageStyleArr = this.nullableArrayOfForwardedMessageStyleAdapter.fromJson(jsonReader);
                    i = -524289;
                    break;
            }
            i2 &= i;
        }
        jsonReader.endObject();
        if (i2 != -1048320) {
            AiBotActions aiBotActions2 = aiBotActions;
            Constructor<PlainMessage> constructor = this.constructorRef;
            if (constructor == null) {
                Class cls = Integer.TYPE;
                Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
                Class cls3 = Long.TYPE;
                Class cls4 = Boolean.TYPE;
                constructor = PlainMessage.class.getDeclaredConstructor(PlainMessage.Text.class, PlainMessage.Image.class, PlainMessage.File.class, PlainMessage.Sticker.class, PlainMessage.Card.class, PlainMessage.Gallery.class, PlainMessage.Voice.class, PlainMessage.Poll.class, String.class, cls3, MessageRef[].class, CustomPayload.class, String[].class, String.class, cls4, String.class, cls4, AiBotActions.class, Suggests.class, ForwardedMessageStyle[].class, cls, cls2);
                this.constructorRef = constructor;
            }
            if (str == null) {
                throw Util.missingProperty("chatId", "ChatId", jsonReader);
            }
            return constructor.newInstance(text, image, file, sticker, card, gallery, voice, poll, str, l, messageRefArr, customPayload, strArr, str2, bool2, str3, bool3, aiBotActions2, suggests, forwardedMessageStyleArr, Integer.valueOf(i2), null);
        }
        AiBotActions aiBotActions3 = aiBotActions;
        if (str == null) {
            throw Util.missingProperty("chatId", "ChatId", jsonReader);
        }
        return new PlainMessage(text, image, file, sticker, card, gallery, voice, poll, str, l.longValue(), messageRefArr, customPayload, strArr, str2, bool2.booleanValue(), str3, bool3.booleanValue(), aiBotActions3, suggests, forwardedMessageStyleArr);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, PlainMessage plainMessage) {
        PlainMessage plainMessage2 = plainMessage;
        if (plainMessage2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Text");
        this.nullableTextAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getText());
        jsonWriter.name("Image");
        this.nullableImageAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getImage());
        jsonWriter.name("MiscFile");
        this.nullableFileAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getFile());
        jsonWriter.name("Sticker");
        this.nullableStickerAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getSticker());
        jsonWriter.name("Card");
        this.nullableCardAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getCard());
        jsonWriter.name("Gallery");
        this.nullableGalleryAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getGallery());
        jsonWriter.name("Voice");
        this.nullableVoiceAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getVoice());
        jsonWriter.name("Poll");
        this.nullablePollAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getPoll());
        jsonWriter.name("ChatId");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getChatId());
        jsonWriter.name("Timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(plainMessage2.getTimestamp()));
        jsonWriter.name("ForwardedMessageRefs");
        this.nullableArrayOfMessageRefAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getForwardedMessageRefs());
        jsonWriter.name("CustomPayload");
        this.nullableCustomPayloadAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getCustomPayload());
        jsonWriter.name("MentionedUserIds");
        this.nullableArrayOfStringAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getMentionedUserIds());
        jsonWriter.name("PayloadId");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getPayloadId());
        jsonWriter.name("UrlPreviewDisabled");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(plainMessage2.getUrlPreviewDisabled()));
        jsonWriter.name("NotificationText");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getNotificationText());
        jsonWriter.name("IsImportant");
        this.booleanAdapter.toJson(jsonWriter, (JsonWriter) Boolean.valueOf(plainMessage2.isStarred()));
        jsonWriter.name("ActionButtonsHolder");
        this.nullableAiBotActionsAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getAiBotActionsHolder());
        jsonWriter.name("SuggestButtonsHolder");
        this.nullableSuggestsAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getSuggestsHolder());
        jsonWriter.name("ForwardedMessageStyles");
        this.nullableArrayOfForwardedMessageStyleAdapter.toJson(jsonWriter, (JsonWriter) plainMessage2.getForwardedMessageStyles());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(PlainMessage)");
    }
}
