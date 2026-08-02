package com.yandex.go.places.impl.ui.organizations.chips.viewholders;

import defpackage.di80;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ChipItemViewHolder$Companion$PAYLOAD_TYPES$1 extends FunctionReferenceImpl implements wls {
    public static final ChipItemViewHolder$Companion$PAYLOAD_TYPES$1 b = new ChipItemViewHolder$Companion$PAYLOAD_TYPES$1(2, 0, a.class, "bindSelection", "bindSelection(Lcom/yandex/go/places/impl/ui/organizations/chips/model/OrganizationFilterChipItem$SelectableChip;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((a) obj).R.setSelected(((di80) obj2).d);
        return zy11.a;
    }
}
