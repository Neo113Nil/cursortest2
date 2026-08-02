package com.yandex.messaging.internal.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.telemost.domain.entities.TechPersonalMeetingEndedMessage;
import defpackage.ny61;
import defpackage.w53;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Set;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes15.dex */
public class MessageDataAdapter extends JsonAdapter<MessageData> {
    public static final JsonAdapter.Factory c = new AnonymousClass1();
    public static final w53 d = new w53();
    public final Moshi a;
    public final JsonAdapter b;

    /* renamed from: com.yandex.messaging.internal.entities.MessageDataAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public final JsonAdapter create(Type type, Set set, Moshi moshi) {
            if (MessageData.class.equals(type)) {
                return new MessageDataAdapter(moshi, moshi.adapter(MessageDataRaw.class));
            }
            return null;
        }
    }

    static {
        for (Field field : MessageDataRaw.class.getFields()) {
            Json json2 = (Json) field.getAnnotation(Json.class);
            if (json2 != null) {
                d.put(json2.name(), field);
            }
        }
    }

    public MessageDataAdapter(Moshi moshi, JsonAdapter jsonAdapter) {
        this.a = moshi;
        this.b = jsonAdapter;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final MessageData fromJson(JsonReader jsonReader) {
        MessageData moderatedOutMessageData;
        MessageDataRaw messageDataRaw = (MessageDataRaw) this.b.fromJson(jsonReader);
        if (messageDataRaw == null) {
            return null;
        }
        int i = messageDataRaw.type;
        if (i == -3) {
            moderatedOutMessageData = new ModeratedOutMessageData();
        } else if (i == -2) {
            moderatedOutMessageData = new EmptyMessageData();
        } else if (i == -1) {
            moderatedOutMessageData = new RemovedMessageData();
        } else if (i == 0) {
            moderatedOutMessageData = new TextMessageData();
        } else if (i == 1) {
            moderatedOutMessageData = new ImageMessageData();
        } else if (i == 4) {
            moderatedOutMessageData = new StickerMessageData();
        } else if (i == 1001) {
            moderatedOutMessageData = new VideoMessageData();
        } else if (i == 6) {
            moderatedOutMessageData = new FileMessageData();
        } else if (i == 7) {
            moderatedOutMessageData = new DivMessageData();
        } else if (i != 8) {
            switch (i) {
                case 10:
                    moderatedOutMessageData = new GalleryMessageData();
                    break;
                case 11:
                    moderatedOutMessageData = new VoiceMessageData();
                    break;
                case 12:
                    moderatedOutMessageData = new PollMessageData();
                    break;
                default:
                    switch (i) {
                        case 101:
                            moderatedOutMessageData = new TechChatCreatedMessage();
                            break;
                        case 102:
                            moderatedOutMessageData = new TechChatInfoChangedMessage();
                            break;
                        case 103:
                            moderatedOutMessageData = new TechChatAvatarChangedMessage();
                            break;
                        case 104:
                            moderatedOutMessageData = new TechUsersAddedToChatMessage();
                            break;
                        case 105:
                            moderatedOutMessageData = new TechUsersRemovedFromChatMessage();
                            break;
                        case 106:
                            moderatedOutMessageData = new TechUserLeaveChatMessage();
                            break;
                        case HProv.PP_SET_PIN /* 107 */:
                            moderatedOutMessageData = new TechUserJoinChatMessage();
                            break;
                        case 108:
                            moderatedOutMessageData = new TechUserJoinChatByLinkMessage();
                            break;
                        case 109:
                            moderatedOutMessageData = new TechCallInfoMessage();
                            break;
                        case 110:
                            moderatedOutMessageData = new TechGenericMessage();
                            break;
                        case 111:
                            moderatedOutMessageData = new TechMeetingStartedMessage();
                            break;
                        case 112:
                            moderatedOutMessageData = new TechMeetingEndedMessage();
                            break;
                        case 113:
                            moderatedOutMessageData = new TechPersonalMeetingEndedMessage();
                            break;
                        default:
                            if (i < 101 || i > 1000) {
                                throw new JsonDataException("Unknown type:" + messageDataRaw.type);
                            }
                            moderatedOutMessageData = new TechUnknownMessage();
                            break;
                            break;
                    }
            }
        } else {
            moderatedOutMessageData = new UnsupportedMessageData();
        }
        for (Field field : moderatedOutMessageData.getClass().getFields()) {
            Json json2 = (Json) field.getAnnotation(Json.class);
            if (json2 != null) {
                String name = json2.name();
                try {
                    Field field2 = (Field) d.get(name);
                    if (field2 == null) {
                        throw new RuntimeException("Can't find field with Json name: '" + name + "' in MessageDataRaw");
                    }
                    field.set(moderatedOutMessageData, field2.get(messageDataRaw));
                } catch (IllegalAccessException e) {
                    ny61.j(e);
                    return null;
                }
            }
        }
        return moderatedOutMessageData;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, MessageData messageData) {
        MessageData messageData2 = messageData;
        if (messageData2 == null) {
            jsonWriter.nullValue();
        } else {
            this.a.adapter((Type) messageData2.getClass()).toJson(jsonWriter, (JsonWriter) messageData2);
        }
    }
}
