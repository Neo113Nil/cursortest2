package com.yandex.go.places.impl.ui.main.actions.video_queue;

import com.yandex.go.places.models.data.entities.network.actions.AddVideoInQueueAction;
import defpackage.d4;
import defpackage.fk0;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final fk0 a;
    public final mu b = new mu("DiscoveryAddVideoInQueueAction", qoi0.a(AddVideoInQueueAction.class), new AddVideoInQueueActionDescriptorFactory$actionDescriptor$1(0, AddVideoInQueueAction.Companion, com.yandex.go.places.models.data.entities.network.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new d4(14, this)), EmptyList.a, false);

    public a(fk0 fk0Var) {
        this.a = fk0Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
