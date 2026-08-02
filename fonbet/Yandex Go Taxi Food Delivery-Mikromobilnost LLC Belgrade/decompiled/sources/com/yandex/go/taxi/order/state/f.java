package com.yandex.go.taxi.order.state;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.dto.objects.Notification;
import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import defpackage.as21;
import defpackage.evu0;
import defpackage.j780;
import defpackage.ny61;
import defpackage.uh6;
import defpackage.vpr;
import defpackage.w880;
import defpackage.wd00;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ j780 b;

    public f(vpr vprVar, j780 j780Var) {
        this.a = vprVar;
        this.b = j780Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1 makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1;
        int i;
        wd00 wd00Var;
        ZoneTariffInfo r;
        CharSequence charSequence;
        if (continuation instanceof MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1) {
            makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1 = (MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    j780 j780Var = this.b;
                    TaxiOrder b = j780Var.a.b();
                    if (booleanValue && (b.h.getB() == DriveState.SCHEDULED || b.h.getB() == DriveState.SCHEDULING)) {
                        TaxiOrder b2 = j780Var.c.a.b();
                        Zone M = b2.M();
                        Notification notification = (M == null || (r = uh6.r(M, b2.x())) == null) ? null : (Notification) r.y.get("multiorder_suggest");
                        w880 w880Var = j780Var.c;
                        w880Var.getClass();
                        if (notification == null || (charSequence = (CharSequence) notification.d.get("text")) == null || evu0.J(charSequence) || as21.b(w880Var.b, "FIELD_TARIFF_NOTIFICATION_SHOWN_multiorder_suggest") >= notification.b || w880Var.a.b().l.i) {
                            wd00Var = new wd00(true, null, false, false);
                        } else {
                            TaxiOrder b3 = j780Var.a.b();
                            synchronized (b3) {
                                b3.l = b3.l.N();
                            }
                            as21 as21Var = j780Var.b;
                            as21Var.f(as21.b(as21Var, "FIELD_TARIFF_NOTIFICATION_SHOWN_multiorder_suggest") + 1, "FIELD_TARIFF_NOTIFICATION_SHOWN_multiorder_suggest");
                            wd00Var = new wd00(true, (String) notification.d.get("text"), false, true);
                        }
                    } else {
                        wd00Var = new wd00(booleanValue, null, false, false);
                    }
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.L$0 = null;
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.L$1 = null;
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.L$2 = null;
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.L$3 = null;
                    makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(wd00Var, makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1 = new MakeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = makeAnotherOrderButtonStateInteractor$multiorderButtonStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
