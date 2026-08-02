package com.yandex.go.flex.common.descriptors.action;

import com.yandex.go.flex.common.api.actions.SendRealtimeAnalyticsAction;
import com.yandex.go.flex.common.api.actions.j0;
import defpackage.kpq0;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class f implements nu {
    public final kpq0 a;
    public final mu b = new mu("SendRealtimeAnalyticsAction", qoi0.a(SendRealtimeAnalyticsAction.class), new SendRealtimeAnalyticsActionDescriptorFactory$actionDescriptor$1(0, SendRealtimeAnalyticsAction.Companion, j0.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new SendRealtimeAnalyticsActionDescriptorFactory$actionDescriptor$2(this, f.class, "handler", "getHandler()Lcom/yandex/go/feedsdk/actions/internal/SendRealtimeAnalyticsActionHandler;", 0)), EmptyList.a, true);

    public f(kpq0 kpq0Var) {
        this.a = kpq0Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
