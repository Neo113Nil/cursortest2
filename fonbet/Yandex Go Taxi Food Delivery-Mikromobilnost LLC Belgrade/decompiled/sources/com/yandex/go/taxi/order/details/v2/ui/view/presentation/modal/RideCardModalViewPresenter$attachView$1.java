package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal;

import defpackage.a741;
import defpackage.dgk0;
import defpackage.ems;
import defpackage.mpk0;
import defpackage.qkk0;
import defpackage.qnk0;
import defpackage.ukk0;
import defpackage.ykk0;
import defpackage.ym11;
import defpackage.zjk0;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RideCardModalViewPresenter$attachView$1 extends AdaptedFunctionReference implements ems {
    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object obj7;
        qnk0 qnk0Var = (qnk0) obj;
        ykk0 ykk0Var = (ykk0) obj2;
        mpk0 mpk0Var = (mpk0) obj3;
        a741 a741Var = (a741) obj4;
        String str = (String) obj5;
        ((ukk0) this.receiver).getClass();
        ArrayList arrayList = new ArrayList(qnk0Var.a);
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj7 = null;
                break;
            }
            obj7 = listIterator.previous();
            if (((zjk0) obj7) instanceof dgk0) {
                break;
            }
        }
        zjk0 zjk0Var = (zjk0) obj7;
        return new qkk0(qnk0.a(qnk0Var, arrayList, null, 30), a741Var, mpk0Var, ym11.a(arrayList).remove(zjk0Var), zjk0Var instanceof dgk0 ? (dgk0) zjk0Var : null, ykk0Var, str);
    }
}
