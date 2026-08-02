package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.SearchData;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.lang.reflect.Type;
import java.util.Set;

/* loaded from: classes15.dex */
public class UserOrChatAdapter extends JsonAdapter<SearchData.UserOrChat> {
    public static final JsonReader.Options b = JsonReader.Options.of(Constants.KEY_DATA, "entity", "type");
    public static final JsonAdapter.Factory c = new AnonymousClass1();
    public final Moshi a;

    /* renamed from: com.yandex.messaging.core.net.entities.UserOrChatAdapter$1, reason: invalid class name */
    public class AnonymousClass1 implements JsonAdapter.Factory {
        @Override // com.squareup.moshi.JsonAdapter.Factory
        public final JsonAdapter create(Type type, Set set, Moshi moshi) {
            if (type.equals(SearchData.UserOrChat.class)) {
                return new UserOrChatAdapter(moshi);
            }
            return null;
        }
    }

    public UserOrChatAdapter(Moshi moshi) {
        this.a = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final SearchData.UserOrChat fromJson(JsonReader jsonReader) {
        Moshi moshi;
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Object obj = null;
        while (true) {
            boolean hasNext = jsonReader.hasNext();
            moshi = this.a;
            if (!hasNext) {
                break;
            }
            int selectName = jsonReader.selectName(b);
            if (selectName == 0) {
                obj = moshi.adapter(Object.class).fromJson(jsonReader);
            } else if (selectName == 1) {
                str2 = jsonReader.nextString();
            } else if (selectName != 2) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        SearchData.UserOrChat userOrChat = new SearchData.UserOrChat();
        userOrChat.c = SearchData.ItemType.a(str);
        if ("user".equals(str2)) {
            userOrChat.a = (UserData) moshi.adapter(UserData.class).fromJsonValue(obj);
        }
        if ("chat".equals(str2)) {
            userOrChat.b = (ChatData) moshi.adapter(ChatData.class).fromJsonValue(obj);
        }
        return userOrChat;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, SearchData.UserOrChat userOrChat) {
        throw new IllegalStateException("Serialization is not supported");
    }
}
