package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.UserInfo;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/UserReactionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/UserReaction;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "longAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/ReducedUserInfo;", "reducedUserInfoAdapter", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserReactionJsonAdapter extends JsonAdapter<UserReaction> {
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Type", "Timestamp", UserInfo.TAG);
    private final JsonAdapter<ReducedUserInfo> reducedUserInfoAdapter;

    public UserReactionJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, "type");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, ClidProvider.TIMESTAMP);
        this.reducedUserInfoAdapter = moshi.adapter(ReducedUserInfo.class, emptySet, "userInfo");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final UserReaction fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = null;
        Long l = null;
        ReducedUserInfo reducedUserInfo = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull("type", "Type", jsonReader);
                }
            } else if (selectName == 1) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
                }
            } else if (selectName == 2 && (reducedUserInfo = this.reducedUserInfoAdapter.fromJson(jsonReader)) == null) {
                throw Util.unexpectedNull("userInfo", UserInfo.TAG, jsonReader);
            }
        }
        jsonReader.endObject();
        if (num == null) {
            throw Util.missingProperty("type", "Type", jsonReader);
        }
        int intValue = num.intValue();
        if (l == null) {
            throw Util.missingProperty(ClidProvider.TIMESTAMP, "Timestamp", jsonReader);
        }
        long longValue = l.longValue();
        if (reducedUserInfo != null) {
            return new UserReaction(intValue, longValue, reducedUserInfo);
        }
        throw Util.missingProperty("userInfo", UserInfo.TAG, jsonReader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, UserReaction userReaction) {
        UserReaction userReaction2 = userReaction;
        if (userReaction2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Type");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(userReaction2.getType()));
        jsonWriter.name("Timestamp");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(userReaction2.getTimestamp()));
        jsonWriter.name(UserInfo.TAG);
        this.reducedUserInfoAdapter.toJson(jsonWriter, (JsonWriter) userReaction2.getUserInfo());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(34, "GeneratedJsonAdapter(UserReaction)");
    }
}
