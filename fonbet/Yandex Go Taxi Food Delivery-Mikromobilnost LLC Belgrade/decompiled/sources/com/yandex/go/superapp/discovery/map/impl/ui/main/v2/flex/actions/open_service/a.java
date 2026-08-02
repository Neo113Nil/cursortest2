package com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.open_service;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions.OpenServiceFlexAction;
import com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions.b;
import defpackage.d870;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.uh60;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class a implements nu {
    public final d870 a;
    public final mu b = new mu("OpenServiceAction", qoi0.a(OpenServiceFlexAction.class), new OpenServiceActionDescriptorFactory$actionDescriptor$1(0, OpenServiceFlexAction.Companion, b.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new uh60(13, this)), EmptyList.a, false);

    public a(d870 d870Var) {
        this.a = d870Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
