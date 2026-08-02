package com.yandex.go.places.impl.ui.sorting.recycler.viewholders;

import defpackage.rp80;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class OrganizationsSortingItemViewHolder$Companion$PAYLOAD_TYPES$2 extends MutablePropertyReference1Impl {
    public static final OrganizationsSortingItemViewHolder$Companion$PAYLOAD_TYPES$2 b = new OrganizationsSortingItemViewHolder$Companion$PAYLOAD_TYPES$2("isSelected", 0, "isSelected()Z", rp80.class);

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.jgx
    public final Object get(Object obj) {
        return Boolean.valueOf(((rp80) obj).d);
    }

    @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, defpackage.egx
    public final void set(Object obj, Object obj2) {
        ((rp80) obj).d = ((Boolean) obj2).booleanValue();
    }
}
