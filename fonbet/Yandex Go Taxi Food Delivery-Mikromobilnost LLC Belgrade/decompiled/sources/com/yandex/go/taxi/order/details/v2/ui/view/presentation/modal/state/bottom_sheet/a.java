package com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet;

import android.view.accessibility.AccessibilityManager;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.RideCardChangeStateEventRepository;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.order.queue.interactor.c;
import defpackage.avu0;
import defpackage.gci0;
import defpackage.jdk0;
import defpackage.kvp0;
import defpackage.mjg0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.ps70;
import defpackage.qs70;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vng;
import defpackage.ykk0;
import defpackage.zd80;
import defpackage.zkk0;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class a {
    public final o2y0 a;
    public final zkk0 b;
    public final ps70 c;
    public final kvp0 d;
    public final mjg0 e;
    public final AccessibilityManager f;
    public final tt2 g;
    public final zd80 h;
    public final RideCardChangeStateEventRepository i;
    public final gci0 j;

    public a(o2y0 o2y0Var, zkk0 zkk0Var, ps70 ps70Var, kvp0 kvp0Var, mjg0 mjg0Var, AccessibilityManager accessibilityManager, tt2 tt2Var, zd80 zd80Var, RideCardChangeStateEventRepository rideCardChangeStateEventRepository) {
        this.a = o2y0Var;
        this.b = zkk0Var;
        this.c = ps70Var;
        this.d = kvp0Var;
        this.e = mjg0Var;
        this.f = accessibilityManager;
        this.g = tt2Var;
        this.h = zd80Var;
        this.i = rideCardChangeStateEventRepository;
        this.j = zkk0Var.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, TaxiOrder taxiOrder, RideCardChangeStateEventRepository.ChangeStateEvent changeStateEvent, ContinuationImpl continuationImpl) {
        RideCardModalViewStateInteractor$onOrderStateChanged$1 rideCardModalViewStateInteractor$onOrderStateChanged$1;
        Object obj;
        int i;
        Float f;
        RideCardChangeStateEventRepository.ChangeStateEvent changeStateEvent2;
        Float f2;
        Object value;
        String str;
        String str2;
        RideCardInfoResponse.PresentationsDto presentationsDto;
        Object value2;
        TaxiOrder taxiOrder2 = taxiOrder;
        aVar.getClass();
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof RideCardModalViewStateInteractor$onOrderStateChanged$1) {
            rideCardModalViewStateInteractor$onOrderStateChanged$1 = (RideCardModalViewStateInteractor$onOrderStateChanged$1) continuationImpl;
            int i2 = rideCardModalViewStateInteractor$onOrderStateChanged$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardModalViewStateInteractor$onOrderStateChanged$1.label = i2 - Integer.MIN_VALUE;
                obj = rideCardModalViewStateInteractor$onOrderStateChanged$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardModalViewStateInteractor$onOrderStateChanged$1.label;
                if (i != 0) {
                    b.b(obj);
                    RideCardInfoResponse rideCardInfoResponse = taxiOrder2.V().o0;
                    RideCardInfoResponse.PresentationsDto.Details details = (rideCardInfoResponse == null || (presentationsDto = rideCardInfoResponse.c) == null) ? null : presentationsDto.b;
                    Float j = (details == null || (str2 = details.c) == null) ? null : avu0.j(str2);
                    Float j2 = (details == null || (str = details.d) == null) ? null : avu0.j(str);
                    if (taxiOrder2.h.b == DriveState.COMPLETE) {
                        boolean z = taxiOrder2.l.A;
                        int i3 = z ? 6 : 7;
                        r0 r0Var = aVar.b.a;
                        do {
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, ykk0.a((ykk0) value, Integer.valueOf(i3), z, false, j, j2, true, 4)));
                    } else {
                        DriveState driveState = taxiOrder2.h.b;
                        DriveState driveState2 = DriveState.CANCELLED;
                        if (driveState.compareTo(driveState2) >= 0) {
                            boolean z2 = taxiOrder2.h.b != driveState2;
                            r0 r0Var2 = aVar.b.a;
                            while (true) {
                                Object value3 = r0Var2.getValue();
                                Float f3 = j2;
                                if (r0Var2.k(value3, ykk0.a((ykk0) value3, 3, false, false, j, j2, z2, 6))) {
                                    break;
                                }
                                j2 = f3;
                            }
                        } else {
                            Float f4 = j2;
                            mjg0 mjg0Var = aVar.e;
                            rideCardModalViewStateInteractor$onOrderStateChanged$1.L$0 = taxiOrder2;
                            rideCardModalViewStateInteractor$onOrderStateChanged$1.L$1 = changeStateEvent;
                            rideCardModalViewStateInteractor$onOrderStateChanged$1.L$2 = null;
                            rideCardModalViewStateInteractor$onOrderStateChanged$1.L$3 = j;
                            rideCardModalViewStateInteractor$onOrderStateChanged$1.L$4 = f4;
                            rideCardModalViewStateInteractor$onOrderStateChanged$1.label = 1;
                            obj = ((c) mjg0Var).b(taxiOrder2, rideCardModalViewStateInteractor$onOrderStateChanged$1);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            f = f4;
                            changeStateEvent2 = changeStateEvent;
                            f2 = j;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Float f5 = (Float) rideCardModalViewStateInteractor$onOrderStateChanged$1.L$4;
                Float f6 = (Float) rideCardModalViewStateInteractor$onOrderStateChanged$1.L$3;
                changeStateEvent2 = (RideCardChangeStateEventRepository.ChangeStateEvent) rideCardModalViewStateInteractor$onOrderStateChanged$1.L$1;
                TaxiOrder taxiOrder3 = (TaxiOrder) rideCardModalViewStateInteractor$onOrderStateChanged$1.L$0;
                b.b(obj);
                f = f5;
                taxiOrder2 = taxiOrder3;
                f2 = f6;
                if (!((Boolean) obj).booleanValue()) {
                    int i4 = (aVar.f.isTouchExplorationEnabled() || changeStateEvent2 == RideCardChangeStateEventRepository.ChangeStateEvent.EXPAND_CARD) ? 3 : 6;
                    boolean contains = ((ArrayList) kotlin.collections.a.M(((qs70) aVar.c).a().d)).contains(taxiOrder2.h.b);
                    r0 r0Var3 = aVar.b.a;
                    do {
                        value2 = r0Var3.getValue();
                    } while (!r0Var3.k(value2, ykk0.a((ykk0) value2, Integer.valueOf(i4), false, contains, f2, f, true, 2)));
                }
                return zy11Var;
            }
        }
        rideCardModalViewStateInteractor$onOrderStateChanged$1 = new RideCardModalViewStateInteractor$onOrderStateChanged$1(aVar, continuationImpl);
        obj = rideCardModalViewStateInteractor$onOrderStateChanged$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardModalViewStateInteractor$onOrderStateChanged$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return zy11Var;
    }

    public final Object b(Continuation continuation) {
        c cVar = (c) this.e;
        cVar.getClass();
        tpr t = e.t(new com.yandex.go.taxi.order.queue.interactor.b(this.a.a(), cVar));
        this.g.getClass();
        return e.k(e.F(t, uyj.a), new RideCardModalViewStateInteractor$subscribeOrderHasQueue$2(this, null), continuation);
    }

    public final Object c(Continuation continuation) {
        m0 m0Var = new m0(vng.l(this.a.a(), new jdk0(17), vng.c), this.i.a, new RideCardModalViewStateInteractor$subscribeOrderStateChanges$3(3, null));
        this.g.getClass();
        return e.k(e.F(m0Var, uyj.a), new RideCardModalViewStateInteractor$subscribeOrderStateChanges$4(this, null), continuation);
    }
}
