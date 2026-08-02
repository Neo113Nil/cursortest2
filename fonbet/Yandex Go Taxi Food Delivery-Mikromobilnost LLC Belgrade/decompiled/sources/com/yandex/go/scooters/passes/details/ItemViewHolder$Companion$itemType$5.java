package com.yandex.go.scooters.passes.details;

import defpackage.kdo0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ItemViewHolder$Companion$itemType$5 extends FunctionReferenceImpl implements wls {
    public static final ItemViewHolder$Companion$itemType$5 b = new ItemViewHolder$Companion$itemType$5(2, 0, a.class, "bindIcon", "bindIcon(Lcom/yandex/go/scooters/passes/details/ScootersPassesDetailsUiState$Item;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        a aVar = (a) obj;
        kdo0 kdo0Var = (kdo0) obj2;
        int i = a.T;
        aVar.getClass();
        if (kdo0Var.b.length() == 0) {
            aVar.W("ICON_LOAD_KEY");
        } else {
            aVar.Z(new ItemViewHolder$bindIcon$1(aVar, kdo0Var, null), "ICON_LOAD_KEY", true);
        }
        return zy11.a;
    }
}
