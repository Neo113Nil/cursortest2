package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.GetChatInfoDataWithJoinWall;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import defpackage.ny61;
import defpackage.uw51;
import kotlin.collections.EmptySet;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall_JoinWallRequiredJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/GetChatInfoDataWithJoinWall$JoinWallRequired$JoinWallChatInfo;", "joinWallChatInfoAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetChatInfoDataWithJoinWall_JoinWallRequiredJsonAdapter extends JsonAdapter<GetChatInfoDataWithJoinWall.JoinWallRequired> {
    private final JsonAdapter<GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo> joinWallChatInfoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("text", AuthSdkActivity.RESPONSE_TYPE_CODE, "chat_info");
    private final JsonAdapter<String> stringAdapter;

    public GetChatInfoDataWithJoinWall_JoinWallRequiredJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.stringAdapter = moshi.adapter(String.class, emptySet, "text");
        this.joinWallChatInfoAdapter = moshi.adapter(GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo.class, emptySet, "chatInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final GetChatInfoDataWithJoinWall.JoinWallRequired fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        GetChatInfoDataWithJoinWall.JoinWallRequired.JoinWallChatInfo joinWallChatInfo = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                str = this.stringAdapter.fromJson(jsonReader);
                if (str == null) {
                    throw Util.unexpectedNull("text", "text", jsonReader);
                }
            } else if (selectName == 1) {
                str2 = this.stringAdapter.fromJson(jsonReader);
                if (str2 == null) {
                    throw Util.unexpectedNull(AuthSdkActivity.RESPONSE_TYPE_CODE, AuthSdkActivity.RESPONSE_TYPE_CODE, jsonReader);
                }
            } else if (selectName == 2 && (joinWallChatInfo = this.joinWallChatInfoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("chatInfo", "chat_info", jsonReader);
            }
        }
        jsonReader.endObject();
        if (str == null) {
            throw Util.missingProperty("text", "text", jsonReader);
        }
        if (str2 == null) {
            throw Util.missingProperty(AuthSdkActivity.RESPONSE_TYPE_CODE, AuthSdkActivity.RESPONSE_TYPE_CODE, jsonReader);
        }
        if (joinWallChatInfo != null) {
            return new GetChatInfoDataWithJoinWall.JoinWallRequired(str, str2, joinWallChatInfo);
        }
        throw Util.missingProperty("chatInfo", "chat_info", jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, GetChatInfoDataWithJoinWall.JoinWallRequired joinWallRequired) {
        GetChatInfoDataWithJoinWall.JoinWallRequired joinWallRequired2 = joinWallRequired;
        if (joinWallRequired2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("text");
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) joinWallRequired2.getText());
        jsonWriter.name(AuthSdkActivity.RESPONSE_TYPE_CODE);
        this.stringAdapter.toJson(jsonWriter, (JsonWriter) joinWallRequired2.getCode());
        jsonWriter.name("chat_info");
        this.joinWallChatInfoAdapter.toJson(jsonWriter, (JsonWriter) joinWallRequired2.getChatInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(66, "GeneratedJsonAdapter(GetChatInfoDataWithJoinWall.JoinWallRequired)");
    }
}
