package com.yandex.go.places.impl.ui.filters.recycler;

import com.yandex.go.places.impl.ui.common.chip.ChipView;
import defpackage.gm80;
import defpackage.mqb;
import defpackage.wls;
import defpackage.z5r;
import defpackage.zo31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$1 extends FunctionReferenceImpl implements wls {
    public static final OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$1 b = new OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$1(2, 0, a.class, "bindSelection", "bindSelection(Lcom/yandex/go/places/impl/ui/filters/FiltersModalBody$FilterBlock;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        aVar.getClass();
        for (mqb mqbVar : ((z5r) obj2).c) {
            ((ChipView) ((gm80) ((zo31) aVar.R)).b.findViewWithTag(mqbVar.a)).setSelected(mqbVar.d);
        }
        return zy11.a;
    }
}
