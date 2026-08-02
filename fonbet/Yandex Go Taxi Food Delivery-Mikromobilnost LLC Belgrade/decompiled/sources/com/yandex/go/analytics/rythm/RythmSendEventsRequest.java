package com.yandex.go.analytics.rythm;

import defpackage.b7l0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/analytics/rythm/RythmSendEventsRequest;", "", "Companion", "$serializer", "com/yandex/go/analytics/rythm/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RythmSendEventsRequest {
    public static final b Companion = new b();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b7l0(12))};
    public final List a;

    public /* synthetic */ RythmSendEventsRequest(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, RythmSendEventsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public RythmSendEventsRequest(List list) {
        this.a = list;
    }
}
