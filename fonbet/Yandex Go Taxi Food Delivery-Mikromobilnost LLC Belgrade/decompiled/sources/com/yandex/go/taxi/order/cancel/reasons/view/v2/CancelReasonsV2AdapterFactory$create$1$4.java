package com.yandex.go.taxi.order.cancel.reasons.view.v2;

import defpackage.tf;
import defpackage.wls;
import defpackage.wx7;
import defpackage.xw7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CancelReasonsV2AdapterFactory$create$1$4 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ListItemComponent listItemComponent = (ListItemComponent) obj;
        wx7 wx7Var = (wx7) this.receiver;
        wx7Var.a(listItemComponent, (xw7) obj2);
        listItemComponent.setOnClickListener(new tf(28, wx7Var));
        return zy11.a;
    }
}
