package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.favourites;

import com.yandex.go.places.models.data.entities.network.actions.ShowFavoritesNotificationFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.k;
import defpackage.b7p0;
import defpackage.gst;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final gst a;
    public final mu b = new mu("ShowFavoritesNotificationAction", qoi0.a(ShowFavoritesNotificationFlexAction.class), new ShowFavoritesNotificationActionDescriptorFactory$actionDescriptor$1(0, ShowFavoritesNotificationFlexAction.Companion, k.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new b7p0(28, this)), EmptyList.a, false);

    public a(gst gstVar) {
        this.a = gstVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
