package com.yandex.go.chargers.orchestrator_user_events.data.model;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.z1a;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/chargers/orchestrator_user_events/data/model/ChargersOrchestratorCreateEventRequest;", "", "Companion", "$serializer", "com/yandex/go/chargers/orchestrator_user_events/data/model/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChargersOrchestratorCreateEventRequest {
    public static final a Companion = new a();
    public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new z1a(29))};
    public final List a;

    public /* synthetic */ ChargersOrchestratorCreateEventRequest(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            qje.Z(i, 1, ChargersOrchestratorCreateEventRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public ChargersOrchestratorCreateEventRequest(List list) {
        this.a = list;
    }
}
