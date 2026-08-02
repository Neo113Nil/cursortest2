package com.yandex.go.analytics.rythm.sender;

import com.yandex.div.state.db.StateEntry;
import com.yandex.go.analytics.rythm.RythmSendEventsRequest;
import defpackage.cmt;
import defpackage.pq90;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J9\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u0007j\u0002`\t2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002H'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/analytics/rythm/sender/RythmApi;", "", "", StateEntry.COLUMN_PATH, "Lcom/yandex/go/analytics/rythm/RythmSendEventsRequest;", "body", "deviceId", "Lcmt;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "a", "(Ljava/lang/String;Lcom/yandex/go/analytics/rythm/RythmSendEventsRequest;Ljava/lang/String;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface RythmApi {
    @s490("{path}/")
    cmt<zy11> a(@pq90(encoded = true, value = "path") String path, @q76 RythmSendEventsRequest body, @z8u("x-device-id") String deviceId);
}
