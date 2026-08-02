package com.yandex.go.places.organization.card.impl.ui.card.flex.actions.delete_review;

import com.yandex.go.places.models.data.entities.network.actions.DeleteReviewFlexAction;
import com.yandex.go.places.models.data.entities.network.actions.c;
import defpackage.amh;
import defpackage.mu;
import defpackage.nu;
import defpackage.qoi0;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final class a implements nu {
    public final b a;
    public final mu b = new mu("DeleteReview", qoi0.a(DeleteReviewFlexAction.class), new DeleteReviewActionDescriptorFactory$actionDescriptor$1(0, DeleteReviewFlexAction.Companion, c.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new amh(3, this)), EmptyList.a, false);

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.nu
    public final mu create() {
        return this.b;
    }
}
