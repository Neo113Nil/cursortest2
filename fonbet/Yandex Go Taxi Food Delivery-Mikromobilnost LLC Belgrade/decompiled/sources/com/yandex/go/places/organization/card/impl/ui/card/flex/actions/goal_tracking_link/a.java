package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.goal_tracking_link;

import com.yandex.go.places.models.data.entities.network.actions.GoalTrackingLinkFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.e;
import defpackage.dnr;
import defpackage.gst;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final gst a;
    public final mu b = new mu("GoalTrackingLinkAction", qoi0.a(GoalTrackingLinkFlexAction.class), new GoalTrackingLinkActionDescriptorFactory$actionDescriptor$1(0, GoalTrackingLinkFlexAction.Companion, e.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new dnr(27, this)), EmptyList.a, false);

    public a(gst gstVar) {
        this.a = gstVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
