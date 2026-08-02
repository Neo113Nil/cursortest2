package com.yandex.go.taxi.order.popup.navigation;

import android.content.Context;
import defpackage.dt20;
import defpackage.l480;
import defpackage.m480;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.uc50;
import defpackage.usc;
import defpackage.w030;
import defpackage.wsc;
import defpackage.x380;
import defpackage.xvf0;
import defpackage.y380;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.z380;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;
import ru.yandex.taxi.widget.dialog.AlertDialog;

/* loaded from: classes14.dex */
public final class a extends com.yandex.go.navigation.modals.coroutines.a {
    public final w030 F;
    public final yvf0 G;
    public final ru.yandex.taxi.modal.popup.ui.model.a H;
    public final z380 I;
    public final com.yandex.go.taxi.order.cancel.similar.notification.a J;
    public final Context K;
    public AlertDialog L;
    public final boolean M;

    public a(w030 w030Var, yvf0 yvf0Var, ru.yandex.taxi.modal.popup.ui.model.a aVar, z380 z380Var, com.yandex.go.taxi.order.cancel.similar.notification.a aVar2, Context context) {
        super(null);
        this.F = w030Var;
        this.G = yvf0Var;
        this.H = aVar;
        this.I = z380Var;
        this.J = aVar2;
        this.K = context;
        this.M = true;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a, defpackage.h55
    public final void H(Object obj) {
        super.H((m480) obj);
        AlertDialog alertDialog = this.L;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        this.L = null;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final w030 P() {
        return this.F;
    }

    @Override // com.yandex.go.navigation.modals.coroutines.a
    public final boolean Q() {
        return this.M;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.yandex.go.navigation.modals.coroutines.a
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(m480 m480Var, ContinuationImpl continuationImpl) {
        OrderPopupRouter$provideModalView$1 orderPopupRouter$provideModalView$1;
        int i;
        PopupDialogModalView popupDialogModalView;
        PopupDialogModalView popupDialogModalView2;
        y380 y380Var;
        if (continuationImpl instanceof OrderPopupRouter$provideModalView$1) {
            orderPopupRouter$provideModalView$1 = (OrderPopupRouter$provideModalView$1) continuationImpl;
            int i2 = orderPopupRouter$provideModalView$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderPopupRouter$provideModalView$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderPopupRouter$provideModalView$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderPopupRouter$provideModalView$1.label;
                if (i != 0) {
                    b.b(obj);
                    PopupDialogModalView popupDialogModalView3 = (PopupDialogModalView) this.G.get();
                    usc uscVar = m480Var.b;
                    l480 l480Var = new l480(this);
                    dt20 dt20Var = this.I.a;
                    y380 y380Var2 = new y380(uscVar, l480Var, (wsc) ((xvf0) dt20Var.b).get(), (y50) ((xvf0) dt20Var.c).get(), (com.yandex.go.taxi.order.popup.a) ((uc50) dt20Var.w).get(), (tse) ((xvf0) dt20Var.x).get());
                    n8e0 n8e0Var = m480Var.a;
                    orderPopupRouter$provideModalView$1.L$0 = null;
                    orderPopupRouter$provideModalView$1.L$1 = popupDialogModalView3;
                    orderPopupRouter$provideModalView$1.L$2 = y380Var2;
                    orderPopupRouter$provideModalView$1.L$3 = popupDialogModalView3;
                    orderPopupRouter$provideModalView$1.L$4 = null;
                    orderPopupRouter$provideModalView$1.L$5 = popupDialogModalView3;
                    orderPopupRouter$provideModalView$1.label = 1;
                    Object a = this.H.a(n8e0Var, orderPopupRouter$provideModalView$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    popupDialogModalView = popupDialogModalView3;
                    popupDialogModalView2 = popupDialogModalView;
                    y380Var = y380Var2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PopupDialogModalView popupDialogModalView4 = (PopupDialogModalView) orderPopupRouter$provideModalView$1.L$5;
                    popupDialogModalView = (PopupDialogModalView) orderPopupRouter$provideModalView$1.L$3;
                    y380Var = (y380) orderPopupRouter$provideModalView$1.L$2;
                    b.b(obj);
                    popupDialogModalView2 = popupDialogModalView4;
                }
                PopupDialogModalView.prepare$default(popupDialogModalView2, (List) obj, new com.yandex.go.taxi.order.popup.ui.a(y380Var, new x380()), false, false, 12, null);
                return popupDialogModalView;
            }
        }
        orderPopupRouter$provideModalView$1 = new OrderPopupRouter$provideModalView$1(this, continuationImpl);
        Object obj2 = orderPopupRouter$provideModalView$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderPopupRouter$provideModalView$1.label;
        if (i != 0) {
        }
        PopupDialogModalView.prepare$default(popupDialogModalView2, (List) obj2, new com.yandex.go.taxi.order.popup.ui.a(y380Var, new x380()), false, false, 12, null);
        return popupDialogModalView;
    }
}
