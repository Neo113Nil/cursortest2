package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.web_custom_tabs;

import com.yandex.go.places.models.data.entities.network.actions.WebCustomTabsFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.l;
import defpackage.ec31;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import defpackage.v470;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final v470 a;
    public final mu b = new mu("WebCustomTabs", qoi0.a(WebCustomTabsFlexAction.class), new WebCustomTabsActionDescriptorFactory$actionDescriptor$1(0, WebCustomTabsFlexAction.Companion, l.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new ec31(13, this)), EmptyList.a, false);

    public a(v470 v470Var) {
        this.a = v470Var;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
