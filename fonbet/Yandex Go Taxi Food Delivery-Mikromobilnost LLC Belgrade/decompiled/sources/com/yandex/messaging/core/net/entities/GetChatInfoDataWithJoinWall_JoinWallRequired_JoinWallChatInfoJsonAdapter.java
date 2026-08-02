package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.GetChatInfoDataWithJoinWall;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.collections.EmptySet;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall_JoinWallRequired_JoinWallChatInfoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired$JoinWallChatInfo;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "", "intAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetChatInfoDataWithJoinWall_JoinWallRequired_JoinWallChatInfoJsonAdapter extends JsonAdapter<GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo> {
    private volatile Constructor<GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<String> nullableStringAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("title", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "members_count", "avatar_id", "chat_id");
    private final JsonAdapter<String> stringAdapter;

    public GetChatInfoDataWithJoinWall_JoinWallRequired_JoinWallChatInfoJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "title");
        this.nullableStringAdapter = moshi.adapter(String.class, emptySet, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, "membersCount");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        Integer num = null;
        String str3 = null;
        String str4 = null;
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
                str2 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -3;
            } else if (selectName == 2) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("membersCount", "members_count", jsonReader);
                }
            } else if (selectName == 3) {
                str3 = this.nullableStringAdapter.fromJson(jsonReader);
                i &= -9;
            } else if (selectName == 4 && (str4 = this.stringAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("chatId", "chat_id", jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -11) {
            Integer num2 = num;
            String str5 = str2;
            String str6 = str;
            if (str6 == null) {
                throw Util.missingProperty("title", "title", jsonReader);
            }
            if (num2 == null) {
                throw Util.missingProperty("membersCount", "members_count", jsonReader);
            }
            String str7 = str4;
            String str8 = str3;
            int intValue = num2.intValue();
            if (str7 != null) {
                return new GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo(str6, str5, intValue, str8, str7);
            }
            throw Util.missingProperty("chatId", "chat_id", jsonReader);
        }
        Integer num3 = num;
        String str9 = str4;
        String str10 = str2;
        String str11 = str3;
        String str12 = str;
        Constructor<GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo.class.getDeclaredConstructor(String.class, String.class, cls2, String.class, String.class, cls2, cls);
            this.constructorRef = constructor;
        }
        Constructor<GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo> constructor2 = constructor;
        if (str12 == null) {
            throw Util.missingProperty("title", "title", jsonReader);
        }
        if (num3 == null) {
            throw Util.missingProperty("membersCount", "members_count", jsonReader);
        }
        if (str9 != null) {
            return constructor2.newInstance(str12, str10, num3, str11, str9, Integer.valueOf(i), null);
        }
        throw Util.missingProperty("chatId", "chat_id", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo joinWallChatInfo) {
        GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo joinWallChatInfo2 = joinWallChatInfo;
        if (joinWallChatInfo2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("title");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) joinWallChatInfo2.getTitle());
        jsonWriter.name(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION);
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) joinWallChatInfo2.getDescription());
        jsonWriter.name("members_count");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(joinWallChatInfo2.getMembersCount()));
        jsonWriter.name("avatar_id");
        this.nullableStringAdapter.toJson(jsonWriter, (JsonWriter) joinWallChatInfo2.getAvatarId());
        jsonWriter.name("chat_id");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) joinWallChatInfo2.getChatId());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(83, "GeneratedJsonAdapter(GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo)");
    }
}
