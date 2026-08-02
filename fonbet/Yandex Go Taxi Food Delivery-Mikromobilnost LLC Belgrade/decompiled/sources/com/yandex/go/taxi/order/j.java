package com.yandex.go.taxi.order;

import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ac6;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1 bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1;
        int i;
        int i2;
        if (continuation instanceof BottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1) {
            bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1 = (BottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1) continuation;
            int i3 = bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    OrderStatusInfo orderStatusInfo = (OrderStatusInfo) obj;
                    DriveState driveState = orderStatusInfo.i;
                    String str = "";
                    if (driveState != null && ((i2 = ac6.a[driveState.ordinal()]) == 1 || i2 == 2 || i2 == 3)) {
                        str = orderStatusInfo.B;
                    }
                    bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.L$0 = null;
                    bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.L$1 = null;
                    bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.L$2 = null;
                    bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.L$3 = null;
                    bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(str, bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1 = new BottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1(this, continuation);
        Object obj22 = bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bottomCircleButtonsViewPresenter$observeShareButtonData$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
