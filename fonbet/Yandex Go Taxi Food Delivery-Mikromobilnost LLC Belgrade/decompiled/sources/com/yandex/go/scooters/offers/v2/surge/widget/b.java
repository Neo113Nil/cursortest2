package com.yandex.go.scooters.offers.v2.surge.widget;

import com.yandex.passport.sloth.ui.dependencies.m;
import defpackage.k7x0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.q5z;
import defpackage.vpr;
import defpackage.w3p0;
import defpackage.x3p0;
import defpackage.y2p0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ d b;

    public b(vpr vprVar, d dVar) {
        this.a = vprVar;
        this.b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1 scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ScootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1) {
            scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1 = (ScootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    y2p0 y2p0Var = (y2p0) obj;
                    if (y2p0Var != null) {
                        k7x0 k7x0Var = this.b.a;
                        double d = y2p0Var.a;
                        m mVar = y2p0Var.g;
                        String str = (String) mVar.b;
                        String str2 = (String) mVar.f;
                        String str3 = (String) mVar.e;
                        Integer S = q5z.S(str);
                        String str4 = (String) mVar.a;
                        String str5 = "";
                        String a = (str4 == null || str4.length() == 0) ? "" : ((m7x0) k7x0Var).a(str4);
                        String a2 = (str3 == null || str3.length() == 0) ? "" : ((m7x0) k7x0Var).a(str3);
                        if (str2 != null && str2.length() != 0) {
                            str5 = ((m7x0) k7x0Var).a(str2);
                        }
                        obj2 = new x3p0(d, S, a, a2, str5);
                    } else {
                        obj2 = w3p0.a;
                    }
                    scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1 = new ScootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj32 = scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSurgeWidgetUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
