package com.yandex.go.superapp.discovery.map.impl.ui.main.v2.flex.actions.open_organizations;

import com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions.OpenOrganizationsFlexAction;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.uh60;
import defpackage.v4c;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes14.dex */
public final class a implements nu {
    public final v4c a;
    public final mu b = new mu("OpenOrganizationsAction", qoi0.a(OpenOrganizationsFlexAction.class), new OpenOrganizationsActionDescriptorFactory$actionDescriptor$1(0, OpenOrganizationsFlexAction.Companion, com.yandex.go.superapp.discovery.map.impl.data.entities.network.actions.a.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new uh60(10, this)), EmptyList.a, false);

    public a(v4c v4cVar) {
        this.a = v4cVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
