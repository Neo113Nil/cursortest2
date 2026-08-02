package com.yandex.go.taxi.order.view;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a3y0;
import defpackage.bi70;
import defpackage.ci70;
import defpackage.n480;
import defpackage.pzt0;
import defpackage.to31;
import defpackage.vpr;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.OrderMvpView;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ e a;

    public c(e eVar) {
        this.a = eVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        DriveState driveState;
        DriveState driveState2;
        e eVar = this.a;
        eVar.getClass();
        DriveState driveState3 = ((TaxiOrder) obj).h.b;
        if (eVar.Eg() && (driveState = eVar.a0) != driveState3) {
            DriveState driveState4 = DriveState.PREORDER;
            if (((driveState != driveState4 && driveState != DriveState.SEARCH) || (driveState3 != driveState4 && driveState3 != DriveState.SEARCH)) && ((driveState != (driveState2 = DriveState.SCHEDULED) && driveState != DriveState.SCHEDULING) || (driveState3 != driveState2 && driveState3 != DriveState.SCHEDULING))) {
                if (driveState3 == DriveState.DRIVING) {
                    eVar.Og();
                }
                switch (n480.a[driveState3.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        eVar.Ng((OrderMvpView) eVar.Dg(), eVar.a0, driveState3);
                        eVar.a0 = driveState3;
                        ci70 ci70Var = eVar.E;
                        String str = eVar.B.b().a;
                        ci70Var.B.put(str, driveState3);
                        int i = bi70.a[driveState3.ordinal()];
                        if (i != 1) {
                            switch (i) {
                                case 4:
                                    ci70Var.h(str, "CompleteStarted");
                                    to31 to31Var = ci70Var.w;
                                    to31Var.getClass();
                                    to31Var.a.a("view.feedback", new HashMap(), 1, new HashMap());
                                    break;
                                case 5:
                                    break;
                                case 6:
                                case 7:
                                    ci70Var.h(str, "ScheduledStarted");
                                    break;
                                case 8:
                                    ci70Var.h(str, "DrivingStarted");
                                    break;
                                case 9:
                                    ci70Var.x.a(null, null, str, null);
                                    break;
                                case 10:
                                    ci70Var.h(str, "TransportingStarted");
                                    break;
                                case 11:
                                    ci70Var.h(str, "CheckInStarted");
                                    break;
                                default:
                                    a3y0.d(ci70Var.F, "onNewStateOpen", new IllegalStateException("Wrong state: " + driveState3), null, 4);
                                    break;
                            }
                        }
                        eVar.I.f(driveState3);
                        DriveState driveState5 = DriveState.COMPLETE;
                        if (driveState3 == driveState5) {
                            com.yandex.go.coroutines.b.g(eVar.Kg(), null, null, new OrderPresenter$processNewState$1(eVar, null), 3);
                        }
                        pzt0 pzt0Var = eVar.W;
                        if (pzt0Var != null) {
                            pzt0Var.a(null);
                        }
                        if (driveState3 != driveState5) {
                            eVar.W = com.yandex.go.coroutines.b.g(eVar.Kg(), null, null, new OrderPresenter$addCardStateChangeSubscription$1(eVar, driveState3, null), 3);
                            break;
                        }
                        break;
                }
            } else {
                eVar.a0 = driveState3;
            }
        }
        return zy11.a;
    }
}
