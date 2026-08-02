package com.yandex.go.taxi.order.details.v2.ui.view.presentation.compact;

import defpackage.bgk0;
import defpackage.eek0;
import defpackage.fek0;
import defpackage.mpk0;
import defpackage.onk0;
import defpackage.qnk0;
import defpackage.zjk0;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class RideCardCompactPresenter$attachView$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        qnk0 qnk0Var = (qnk0) obj;
        mpk0 mpk0Var = (mpk0) obj2;
        ((eek0) this.receiver).getClass();
        boolean z = false;
        zjk0 zjk0Var = (zjk0) kotlin.collections.a.S(0, qnk0Var.a);
        if (!(zjk0Var instanceof onk0) && !(zjk0Var instanceof bgk0)) {
            z = true;
        }
        return new fek0(z, qnk0Var, mpk0Var);
    }
}
