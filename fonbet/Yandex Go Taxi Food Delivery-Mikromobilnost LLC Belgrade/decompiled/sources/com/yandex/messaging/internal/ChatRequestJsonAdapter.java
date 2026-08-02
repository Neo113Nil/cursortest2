package com.yandex.messaging.internal;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.files.ImageFileInfo;
import defpackage.p1b;
import defpackage.u9v;
import java.util.Objects;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes15.dex */
public class ChatRequestJsonAdapter extends JsonAdapter<ChatRequest> {
    private final JsonAdapter<String[]> mArrayAdapter;
    private static final JsonReader.Options NAME_OPTIONS = JsonReader.Options.of("existing", "saved_messages", "chat_with", "create_group_chat", "invite_hash", "create_channel", "invite_chat", "create_family_chat", "thread", "chat_alias", "invite_thread", "staff");
    private static final JsonReader.Options GROUP_CHAT_OPTIONS = JsonReader.Options.of("request_id", "name", "members", "avatar_url", "public", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
    private static final JsonReader.Options FAMILY_CHAT_OPTIONS = JsonReader.Options.of("request_id", "members");
    private static final JsonReader.Options CREATE_CHANNEL_OPTIONS = JsonReader.Options.of("request_id", "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "avatar_url", "public", "members");
    private static final JsonReader.Options INVITE_HASH_OPTIONS = JsonReader.Options.of("invite_hash");
    private static final JsonReader.Options INVITE_THREAD_OPTIONS = JsonReader.Options.of("invite_hash", "parent_message_ts");

    public ChatRequestJsonAdapter(Moshi moshi) {
        this.mArrayAdapter = moshi.adapter(String[].class);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ChatRequest fromJson(JsonReader jsonReader) {
        ChatRequest existingChat;
        ImageFileInfo imageFileInfo;
        ImageFileInfo imageFileInfo2;
        jsonReader.beginObject();
        String str = "";
        switch (jsonReader.selectName(NAME_OPTIONS)) {
            case 0:
                existingChat = new ExistingChat(jsonReader.nextString());
                break;
            case 1:
                jsonReader.beginObject();
                jsonReader.endObject();
                existingChat = SavedMessages.INSTANCE;
                break;
            case 2:
                existingChat = new PrivateChat(jsonReader.nextString());
                break;
            case 3:
                jsonReader.beginObject();
                boolean z = false;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                String[] strArr = null;
                String str5 = null;
                while (jsonReader.hasNext()) {
                    int selectName = jsonReader.selectName(GROUP_CHAT_OPTIONS);
                    if (selectName == 0) {
                        str2 = jsonReader.nextString();
                    } else if (selectName == 1) {
                        str3 = jsonReader.nextString();
                    } else if (selectName == 2) {
                        strArr = this.mArrayAdapter.fromJson(jsonReader);
                    } else if (selectName == 3) {
                        str5 = jsonReader.nextString();
                    } else if (selectName == 4) {
                        z = jsonReader.nextBoolean();
                    } else {
                        if (selectName != 5) {
                            throw new JsonDataException();
                        }
                        str4 = jsonReader.nextString();
                    }
                }
                Objects.requireNonNull(str2);
                Objects.requireNonNull(str3);
                String str6 = str4 == null ? "" : str4;
                if (strArr == null) {
                    strArr = new String[0];
                }
                String[] strArr2 = strArr;
                if (str5 != null) {
                    ImageFileInfo.Companion.getClass();
                    imageFileInfo = u9v.a(str5);
                } else {
                    imageFileInfo = null;
                }
                CreateGroupChat createGroupChat = new CreateGroupChat(str2, str3, str6, strArr2, imageFileInfo, z);
                jsonReader.endObject();
                existingChat = createGroupChat;
                break;
            case 4:
                existingChat = new InviteChat(jsonReader.nextString());
                break;
            case 5:
                jsonReader.beginObject();
                boolean z2 = true;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                String[] strArr3 = null;
                while (jsonReader.hasNext()) {
                    int selectName2 = jsonReader.selectName(CREATE_CHANNEL_OPTIONS);
                    if (selectName2 == 0) {
                        str7 = jsonReader.nextString();
                    } else if (selectName2 == 1) {
                        str8 = jsonReader.nextString();
                    } else if (selectName2 == 2) {
                        str9 = jsonReader.nextString();
                    } else if (selectName2 == 3) {
                        str10 = jsonReader.nextString();
                    } else if (selectName2 == 4) {
                        z2 = jsonReader.nextBoolean();
                    } else {
                        if (selectName2 != 5) {
                            throw new JsonDataException();
                        }
                        strArr3 = this.mArrayAdapter.fromJson(jsonReader);
                    }
                }
                String str11 = str7;
                Objects.requireNonNull(str11);
                Objects.requireNonNull(str8);
                String str12 = str9 == null ? "" : str9;
                if (str10 != null) {
                    ImageFileInfo.Companion.getClass();
                    imageFileInfo2 = u9v.a(str10);
                } else {
                    imageFileInfo2 = null;
                }
                if (strArr3 == null) {
                    strArr3 = new String[0];
                }
                CreateChannel createChannel = new CreateChannel(str11, str8, str12, imageFileInfo2, z2 ? 1 : 0, strArr3);
                jsonReader.endObject();
                existingChat = createChannel;
                break;
            case 6:
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if (jsonReader.selectName(INVITE_HASH_OPTIONS) != 0) {
                        throw new JsonDataException();
                    }
                    str = jsonReader.nextString();
                }
                existingChat = new InviteChat(str);
                jsonReader.endObject();
                break;
            case 7:
                jsonReader.beginObject();
                String[] strArr4 = null;
                String str13 = null;
                while (jsonReader.hasNext()) {
                    int selectName3 = jsonReader.selectName(FAMILY_CHAT_OPTIONS);
                    if (selectName3 == 0) {
                        str13 = jsonReader.nextString();
                    } else {
                        if (selectName3 != 1) {
                            throw new JsonDataException();
                        }
                        strArr4 = this.mArrayAdapter.fromJson(jsonReader);
                    }
                }
                Objects.requireNonNull(str13);
                if (strArr4 == null) {
                    strArr4 = new String[0];
                }
                existingChat = new CreateFamilyChat(str13, strArr4);
                jsonReader.endObject();
                break;
            case 8:
                existingChat = new ThreadChat(jsonReader.nextString());
                break;
            case 9:
                existingChat = new ChatAlias(jsonReader.nextString());
                break;
            case 10:
                jsonReader.beginObject();
                Long l = null;
                while (jsonReader.hasNext()) {
                    int selectName4 = jsonReader.selectName(INVITE_THREAD_OPTIONS);
                    if (selectName4 == 0) {
                        str = jsonReader.nextString();
                    } else {
                        if (selectName4 != 1) {
                            throw new JsonDataException();
                        }
                        l = Long.valueOf(jsonReader.nextLong());
                    }
                }
                existingChat = new InviteThread(str, l.longValue());
                jsonReader.endObject();
                break;
            case 11:
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    str = jsonReader.nextString();
                }
                existingChat = new StaffChat(str);
                jsonReader.endObject();
                break;
            default:
                throw new JsonDataException();
        }
        jsonReader.endObject();
        return existingChat;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ChatRequest chatRequest) {
        ChatRequest chatRequest2 = chatRequest;
        if (chatRequest2 == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginObject();
        chatRequest2.handle(new p1b((Object) this, (Object) jsonWriter, false));
        jsonWriter.endObject();
    }
}
