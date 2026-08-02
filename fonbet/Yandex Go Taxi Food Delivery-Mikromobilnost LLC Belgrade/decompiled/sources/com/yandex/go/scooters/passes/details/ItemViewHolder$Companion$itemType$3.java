package com.yandex.go.scooters.passes.details;

import android.view.View;
import defpackage.kdo0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class ItemViewHolder$Companion$itemType$3 extends FunctionReferenceImpl implements wls {
    public static final ItemViewHolder$Companion$itemType$3 b = new ItemViewHolder$Companion$itemType$3(2, 0, a.class, "bindTitle", "bindTitle(Lcom/yandex/go/scooters/passes/details/ScootersPassesDetailsUiState$Item;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = a.T;
        ((ListItemComponent) ((View) ((a) obj).R)).setTitle(((kdo0) obj2).a);
        return zy11.a;
    }
}
