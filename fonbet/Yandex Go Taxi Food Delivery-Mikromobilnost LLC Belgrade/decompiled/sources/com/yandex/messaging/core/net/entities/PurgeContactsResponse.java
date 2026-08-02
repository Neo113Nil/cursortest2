package com.yandex.messaging.core.net.entities;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.cex;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u00020\u00018\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/messaging/core/net/entities/PurgeContactsResponse;", "", "<init>", "()V", Constants.KEY_DATA, "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "messaging-core-net_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PurgeContactsResponse {

    @cex
    @Json(name = Constants.KEY_DATA)
    public Object data;

    public final Object getData() {
        Object obj = this.data;
        return obj != null ? obj : zy11.a;
    }

    public final void setData(Object obj) {
        this.data = obj;
    }
}
