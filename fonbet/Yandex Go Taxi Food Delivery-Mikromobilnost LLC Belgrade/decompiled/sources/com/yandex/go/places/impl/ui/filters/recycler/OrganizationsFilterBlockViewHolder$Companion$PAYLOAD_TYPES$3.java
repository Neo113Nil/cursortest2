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
final /* synthetic */ class OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$3 extends FunctionReferenceImpl implements wls {
    public static final OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$3 b = new OrganizationsFilterBlockViewHolder$Companion$PAYLOAD_TYPES$3(2, 0, a.class, "bindTexts", "bindTexts(Lcom/yandex/go/places/impl/ui/filters/FiltersModalBody$FilterBlock;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        z5r z5rVar = (z5r) obj2;
        zo31 zo31Var = (zo31) ((a) obj).R;
        for (mqb mqbVar : z5rVar.c) {
            ((ChipView) ((gm80) zo31Var).b.findViewWithTag(mqbVar.a)).setTexts(mqbVar.b);
        }
        ((gm80) zo31Var).d.setTitle(z5rVar.b);
        return zy11.a;
    }
}
