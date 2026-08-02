package com.yandex.go.taxi.order.interactors;

import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.dms;
import defpackage.ny70;
import defpackage.ra80;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class OrderFloatButtonPositionInteractor$topItemsVisibilityFlow$1 extends AdaptedFunctionReference implements dms {
    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        ny70 ny70Var = (ny70) obj2;
        ny70 ny70Var2 = (ny70) obj3;
        ra80 ra80Var = (ra80) obj4;
        b bVar = (b) this.receiver;
        bVar.getClass();
        if (!booleanValue) {
            if (ra80Var.a != OrderScreen.ORDER_LIST) {
                z = ny70Var.c;
            } else if (ny70Var2.c && ny70Var2.a > bVar.b) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
