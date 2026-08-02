package com.yandex.messaging.core.net.entities.proto.message;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.moshi.internal.Util;
import com.yandex.messaging.core.net.entities.proto.ErrorInfo;
import defpackage.ny61;
import defpackage.uw51;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001c\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\"\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\fR\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\fR\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/message/ListReactionsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/message/ListReactionsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "", "intAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/ErrorInfo;", "nullableErrorInfoAdapter", "", "Lcom/yandex/messaging/core/net/entities/proto/message/UserReaction;", "nullableArrayOfUserReactionAdapter", "Lcom/yandex/messaging/core/net/entities/proto/message/UserRead;", "nullableArrayOfUserReadAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ListReactionsResponseJsonAdapter extends JsonAdapter<ListReactionsResponse> {
    private volatile Constructor<ListReactionsResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<UserReaction[]> nullableArrayOfUserReactionAdapter;
    private final JsonAdapter<UserRead[]> nullableArrayOfUserReadAdapter;
    private final JsonAdapter<ErrorInfo> nullableErrorInfoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of("Status", "ErrorInfo", "UserReactions", "UserReads");

    public ListReactionsResponseJsonAdapter(Moshi moshi) {
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.a;
        this.intAdapter = moshi.adapter(cls, emptySet, ACSPConstants.STATUS);
        this.nullableErrorInfoAdapter = moshi.adapter(ErrorInfo.class, emptySet, "errorInfo");
        this.nullableArrayOfUserReactionAdapter = moshi.adapter(Types.arrayOf(UserReaction.class), emptySet, "userReactions");
        this.nullableArrayOfUserReadAdapter = moshi.adapter(Types.arrayOf(UserRead.class), emptySet, "userReads");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final ListReactionsResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        ErrorInfo errorInfo = null;
        UserReaction[] userReactionArr = null;
        UserRead[] userReadArr = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, "Status", jsonReader);
                }
                i = -2;
            } else if (selectName == 1) {
                errorInfo = this.nullableErrorInfoAdapter.fromJson(jsonReader);
            } else if (selectName == 2) {
                userReactionArr = this.nullableArrayOfUserReactionAdapter.fromJson(jsonReader);
            } else if (selectName == 3) {
                userReadArr = this.nullableArrayOfUserReadAdapter.fromJson(jsonReader);
            }
        }
        jsonReader.endObject();
        if (i == -2) {
            return new ListReactionsResponse(num.intValue(), errorInfo, userReactionArr, userReadArr);
        }
        Constructor<ListReactionsResponse> constructor = this.constructorRef;
        if (constructor == null) {
            Class<?> cls = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls2 = Integer.TYPE;
            constructor = ListReactionsResponse.class.getDeclaredConstructor(cls2, ErrorInfo.class, UserReaction[].class, UserRead[].class, cls2, cls);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(num, errorInfo, userReactionArr, userReadArr, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, ListReactionsResponse listReactionsResponse) {
        ListReactionsResponse listReactionsResponse2 = listReactionsResponse;
        if (listReactionsResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name("Status");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(listReactionsResponse2.getStatus()));
        jsonWriter.name("ErrorInfo");
        this.nullableErrorInfoAdapter.toJson(jsonWriter, (JsonWriter) listReactionsResponse2.getErrorInfo());
        jsonWriter.name("UserReactions");
        this.nullableArrayOfUserReactionAdapter.toJson(jsonWriter, (JsonWriter) listReactionsResponse2.getUserReactions());
        jsonWriter.name("UserReads");
        this.nullableArrayOfUserReadAdapter.toJson(jsonWriter, (JsonWriter) listReactionsResponse2.getUserReads());
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(43, "GeneratedJsonAdapter(ListReactionsResponse)");
    }
}
