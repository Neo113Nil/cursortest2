package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.core.net.entities.GetChatInfoDataWithJoinWall;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.jl40;
import defpackage.tmj;
import java.util.Map;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWallAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall;", "Companion", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetChatInfoDataWithJoinWallAdapter extends JsonAdapter<GetChatInfoDataWithJoinWall> {
    public static final tmj b = new tmj(1);
    public final Moshi a;

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWallAdapter$Companion;", "", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public GetChatInfoDataWithJoinWallAdapter(Moshi moshi) {
        this.a = moshi;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetChatInfoDataWithJoinWall fromJson(JsonReader jsonReader) {
        Object readJsonValue = jsonReader.readJsonValue();
        Map map = readJsonValue instanceof Map ? (Map) readJsonValue : null;
        if (map != null) {
            boolean l = jl40.l(map.get(AuthSdkActivity.RESPONSE_TYPE_CODE), "joinwall_is_enabled");
            Moshi moshi = this.a;
            if (l) {
                return (GetChatInfoDataWithJoinWall) moshi.adapter(GetChatInfoDataWithJoinWall.JoinWallRequired.class).fromJsonValue(map);
            }
            GetChatInfoData getChatInfoData = (GetChatInfoData) moshi.adapter(GetChatInfoData.class).fromJsonValue(map);
            if (getChatInfoData != null) {
                return new GetChatInfoDataWithJoinWall.ChatInfoData(getChatInfoData);
            }
        }
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetChatInfoDataWithJoinWall getChatInfoDataWithJoinWall) {
        jsonWriter.nullValue();
    }
}
