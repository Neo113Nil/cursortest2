package com.yandex.go.taxi.intercity.dashboard.impl.dialog.bullets.routing;

import com.yandex.go.zone.dto.objects.BulletsOrderPopup;
import defpackage.au6;
import defpackage.bu6;
import defpackage.cu6;
import defpackage.fu6;
import defpackage.h55;
import defpackage.hu6;
import defpackage.iu6;
import defpackage.jaw;
import defpackage.kaw;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.u380;
import defpackage.w030;
import defpackage.y50;
import defpackage.yvf0;
import defpackage.zy11;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.modal.popup.ui.PopupDialogModalView;
import ru.yandex.taxi.orderpopup.analytics.OrderPopupAnalytics$Screen;

/* loaded from: classes14.dex */
public final class a extends h55 {
    public final tse D;
    public final w030 E;
    public final yvf0 F;
    public final ru.yandex.taxi.modal.popup.ui.model.a G;
    public final au6 H;
    public final iu6 I;
    public final u380 J;
    public final hu6 K;
    public final y50 L;

    public a(tse tseVar, w030 w030Var, yvf0 yvf0Var, ru.yandex.taxi.modal.popup.ui.model.a aVar, au6 au6Var, iu6 iu6Var, u380 u380Var, hu6 hu6Var, y50 y50Var) {
        super(null);
        this.D = tseVar;
        this.E = w030Var;
        this.F = yvf0Var;
        this.G = aVar;
        this.H = au6Var;
        this.I = iu6Var;
        this.J = u380Var;
        this.K = hu6Var;
        this.L = y50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, cu6 cu6Var, ContinuationImpl continuationImpl) {
        IntercityDashboardBulletsDialogModalViewRouter$showPopup$1 intercityDashboardBulletsDialogModalViewRouter$showPopup$1;
        int i;
        PopupDialogModalView popupDialogModalView;
        aVar.getClass();
        if (continuationImpl instanceof IntercityDashboardBulletsDialogModalViewRouter$showPopup$1) {
            intercityDashboardBulletsDialogModalViewRouter$showPopup$1 = (IntercityDashboardBulletsDialogModalViewRouter$showPopup$1) continuationImpl;
            int i2 = intercityDashboardBulletsDialogModalViewRouter$showPopup$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                intercityDashboardBulletsDialogModalViewRouter$showPopup$1.label = i2 - Integer.MIN_VALUE;
                Object obj = intercityDashboardBulletsDialogModalViewRouter$showPopup$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = intercityDashboardBulletsDialogModalViewRouter$showPopup$1.label;
                if (i != 0) {
                    b.b(obj);
                    PopupDialogModalView popupDialogModalView2 = (PopupDialogModalView) aVar.F.get();
                    ru.yandex.taxi.modal.popup.ui.model.a aVar2 = aVar.G;
                    n8e0 n8e0Var = cu6Var.a;
                    intercityDashboardBulletsDialogModalViewRouter$showPopup$1.L$0 = cu6Var;
                    intercityDashboardBulletsDialogModalViewRouter$showPopup$1.L$1 = popupDialogModalView2;
                    intercityDashboardBulletsDialogModalViewRouter$showPopup$1.label = 1;
                    Object a = aVar2.a(n8e0Var, intercityDashboardBulletsDialogModalViewRouter$showPopup$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    popupDialogModalView = popupDialogModalView2;
                    obj = a;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    PopupDialogModalView popupDialogModalView3 = (PopupDialogModalView) intercityDashboardBulletsDialogModalViewRouter$showPopup$1.L$1;
                    cu6 cu6Var2 = (cu6) intercityDashboardBulletsDialogModalViewRouter$showPopup$1.L$0;
                    b.b(obj);
                    popupDialogModalView = popupDialogModalView3;
                    cu6Var = cu6Var2;
                }
                PopupDialogModalView.prepare$default(popupDialogModalView, (List) obj, new bu6(0, aVar.K.a(OrderPopupAnalytics$Screen.INTERCITY_DASHBOARD, cu6Var.a.a), new fu6(popupDialogModalView, new kaw(aVar))), false, false, 12, null);
                aVar.E.k(popupDialogModalView, 2.0f, true);
                return zy11.a;
            }
        }
        intercityDashboardBulletsDialogModalViewRouter$showPopup$1 = new IntercityDashboardBulletsDialogModalViewRouter$showPopup$1(aVar, continuationImpl);
        Object obj2 = intercityDashboardBulletsDialogModalViewRouter$showPopup$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = intercityDashboardBulletsDialogModalViewRouter$showPopup$1.label;
        if (i != 0) {
        }
        PopupDialogModalView.prepare$default(popupDialogModalView, (List) obj2, new bu6(0, aVar.K.a(OrderPopupAnalytics$Screen.INTERCITY_DASHBOARD, cu6Var.a.a), new fu6(popupDialogModalView, new kaw(aVar))), false, false, 12, null);
        aVar.E.k(popupDialogModalView, 2.0f, true);
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        jaw jawVar = (jaw) obj;
        BulletsOrderPopup bulletsOrderPopup = jawVar.a;
        boolean z = jawVar.b;
        cu6 a = this.H.a(bulletsOrderPopup);
        if (a == null) {
            i();
            return;
        }
        n8e0 n8e0Var = a.a;
        String str = n8e0Var.a;
        int i = n8e0Var.g;
        int i2 = n8e0Var.h;
        iu6 iu6Var = this.I;
        if (!iu6Var.a(i, str, z, i2)) {
            i();
            return;
        }
        iu6Var.c = this.J.a(a);
        tje.N(this.D, null, null, new IntercityDashboardBulletsDialogModalViewRouter$showModalView$1(this, a, null), 3);
    }
}
