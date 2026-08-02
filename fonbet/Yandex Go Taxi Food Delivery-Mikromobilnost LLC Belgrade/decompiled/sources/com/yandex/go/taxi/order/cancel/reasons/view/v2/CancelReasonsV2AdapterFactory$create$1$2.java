package com.yandex.go.taxi.order.cancel.reasons.view.v2;

import defpackage.k5;
import defpackage.wls;
import defpackage.ww7;
import defpackage.wx7;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemCheckComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class CancelReasonsV2AdapterFactory$create$1$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ListItemCheckComponent listItemCheckComponent = (ListItemCheckComponent) obj;
        ww7 ww7Var = (ww7) obj2;
        wx7 wx7Var = (wx7) this.receiver;
        wx7Var.a(listItemCheckComponent, ww7Var);
        listItemCheckComponent.setChecked(ww7Var.e);
        listItemCheckComponent.setOnClickListener(new k5(14, wx7Var, ww7Var));
        return zy11.a;
    }
}
