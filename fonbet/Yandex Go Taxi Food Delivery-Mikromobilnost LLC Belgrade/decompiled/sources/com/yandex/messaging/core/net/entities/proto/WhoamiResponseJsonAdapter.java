package com.yandex.messaging.core.net.entities.proto;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import defpackage.ny61;
import defpackage.uw51;
import io.appmetrica.analytics.UserInfo;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u001c\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\fR\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/messaging/core/net/entities/proto/WhoamiResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/yandex/messaging/core/net/entities/proto/WhoamiResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lcom/squareup/moshi/JsonReader$Options;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "Lcom/yandex/messaging/core/net/entities/proto/WhoamiUserInfo;", "nullableWhoamiUserInfoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "intAdapter", "Lcom/yandex/messaging/core/net/entities/proto/ErrorInfo;", "nullableErrorInfoAdapter", "", "longAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WhoamiResponseJsonAdapter extends JsonAdapter<WhoamiResponse> {
    private volatile Constructor<WhoamiResponse> constructorRef;
    private final JsonAdapter<Integer> intAdapter;
    private final JsonAdapter<Long> longAdapter;
    private final JsonAdapter<ErrorInfo> nullableErrorInfoAdapter;
    private final JsonAdapter<WhoamiUserInfo> nullableWhoamiUserInfoAdapter;
    private final JsonReader.Options options = JsonReader.Options.of(UserInfo.TAG, "Status", "ErrorInfo", "CurrentTime");

    public WhoamiResponseJsonAdapter(Moshi moshi) {
        EmptySet emptySet = EmptySet.a;
        this.nullableWhoamiUserInfoAdapter = moshi.adapter(WhoamiUserInfo.class, emptySet, "userInfo");
        this.intAdapter = moshi.adapter(Integer.TYPE, emptySet, ACSPConstants.STATUS);
        this.nullableErrorInfoAdapter = moshi.adapter(ErrorInfo.class, emptySet, "errorInfo");
        this.longAdapter = moshi.adapter(Long.TYPE, emptySet, "currentTime");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final WhoamiResponse fromJson(JsonReader jsonReader) {
        jsonReader.beginObject();
        Integer num = 0;
        Long l = 0L;
        WhoamiUserInfo whoamiUserInfo = null;
        ErrorInfo errorInfo = null;
        int i = -1;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(this.options);
            if (selectName == -1) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else if (selectName == 0) {
                whoamiUserInfo = this.nullableWhoamiUserInfoAdapter.fromJson(jsonReader);
                i &= -2;
            } else if (selectName == 1) {
                num = this.intAdapter.fromJson(jsonReader);
                if (num == null) {
                    throw Util.unexpectedNull(ACSPConstants.STATUS, "Status", jsonReader);
                }
                i &= -3;
            } else if (selectName == 2) {
                errorInfo = this.nullableErrorInfoAdapter.fromJson(jsonReader);
                i &= -5;
            } else if (selectName == 3) {
                l = this.longAdapter.fromJson(jsonReader);
                if (l == null) {
                    throw Util.unexpectedNull("currentTime", "CurrentTime", jsonReader);
                }
                i &= -9;
            } else {
                continue;
            }
        }
        jsonReader.endObject();
        if (i == -16) {
            return new WhoamiResponse(whoamiUserInfo, num.intValue(), errorInfo, l.longValue());
        }
        Constructor<WhoamiResponse> constructor = this.constructorRef;
        if (constructor == null) {
            Class cls = Long.TYPE;
            Class<?> cls2 = Util.DEFAULT_CONSTRUCTOR_MARKER;
            Class cls3 = Integer.TYPE;
            constructor = WhoamiResponse.class.getDeclaredConstructor(WhoamiUserInfo.class, cls3, ErrorInfo.class, cls, cls3, cls2);
            this.constructorRef = constructor;
        }
        return constructor.newInstance(whoamiUserInfo, num, errorInfo, l, Integer.valueOf(i), null);
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, WhoamiResponse whoamiResponse) {
        WhoamiResponse whoamiResponse2 = whoamiResponse;
        if (whoamiResponse2 == null) {
            ny61.t("value_ was null! Wrap in .nullSafe() to write nullable values.");
            return;
        }
        jsonWriter.beginObject();
        jsonWriter.name(UserInfo.TAG);
        this.nullableWhoamiUserInfoAdapter.toJson(jsonWriter, (JsonWriter) whoamiResponse2.userInfo);
        jsonWriter.name("Status");
        this.intAdapter.toJson(jsonWriter, (JsonWriter) Integer.valueOf(whoamiResponse2.getStatus()));
        jsonWriter.name("ErrorInfo");
        this.nullableErrorInfoAdapter.toJson(jsonWriter, (JsonWriter) whoamiResponse2.errorInfo);
        jsonWriter.name("CurrentTime");
        this.longAdapter.toJson(jsonWriter, (JsonWriter) Long.valueOf(whoamiResponse2.currentTime));
        jsonWriter.endObject();
    }

    public final String toString() {
        return uw51.h(36, "GeneratedJsonAdapter(WhoamiResponse)");
    }
}
