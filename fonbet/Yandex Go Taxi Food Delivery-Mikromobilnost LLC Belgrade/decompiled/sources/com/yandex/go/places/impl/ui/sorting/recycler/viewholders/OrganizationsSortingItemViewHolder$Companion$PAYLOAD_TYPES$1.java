package com.yandex.go.places.impl.ui.sorting.recycler.viewholders;

import defpackage.rp80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class OrganizationsSortingItemViewHolder$Companion$PAYLOAD_TYPES$1 extends FunctionReferenceImpl implements wls {
    public static final OrganizationsSortingItemViewHolder$Companion$PAYLOAD_TYPES$1 b = new OrganizationsSortingItemViewHolder$Companion$PAYLOAD_TYPES$1(2, 0, a.class, "bindSelection", "bindSelection(Lcom/yandex/go/places/impl/domain/entities/sorting/OrganizationsSortingItem;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((a) obj).R.setChecked(((rp80) obj2).d);
        return zy11.a;
    }
}
