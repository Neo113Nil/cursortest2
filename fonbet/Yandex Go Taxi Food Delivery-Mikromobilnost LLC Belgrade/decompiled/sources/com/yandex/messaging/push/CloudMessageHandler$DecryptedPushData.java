package com.yandex.messaging.push;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.yandex.messaging.internal.entities.JsonString;
import kotlin.Metadata;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/yandex/messaging/push/CloudMessageHandler$DecryptedPushData", "", "", "messenger", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMessenger", "()Ljava/lang/String;", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CloudMessageHandler$DecryptedPushData {
    public static final int $stable = 0;

    @JsonString
    @Json(name = "messenger")
    private final String messenger;

    public CloudMessageHandler$DecryptedPushData(String str) {
        this.messenger = str;
    }

    public final String getMessenger() {
        return this.messenger;
    }
}
