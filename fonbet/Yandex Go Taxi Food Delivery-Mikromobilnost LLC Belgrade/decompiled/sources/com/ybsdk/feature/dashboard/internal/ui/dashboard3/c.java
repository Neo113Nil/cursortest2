package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import com.ybsdk.core.common.data.cache.CacheMissException;
import defpackage.aso;
import defpackage.ez8;
import defpackage.nmg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qmg;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.sms0;
import defpackage.tw8;
import defpackage.u8j0;
import defpackage.vpr;
import defpackage.ye8;
import defpackage.zy11;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(u8j0 u8j0Var, Continuation continuation) {
        DashboardV3ViewModel$observeCache$2$emit$1 dashboardV3ViewModel$observeCache$2$emit$1;
        int i;
        d dVar;
        int i2;
        ez8 ez8Var;
        ye8 ye8Var;
        tw8 tw8Var;
        u8j0 u8j0Var2 = u8j0Var;
        if (continuation instanceof DashboardV3ViewModel$observeCache$2$emit$1) {
            dashboardV3ViewModel$observeCache$2$emit$1 = (DashboardV3ViewModel$observeCache$2$emit$1) continuation;
            int i3 = dashboardV3ViewModel$observeCache$2$emit$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dashboardV3ViewModel$observeCache$2$emit$1.label = i3 - Integer.MIN_VALUE;
                DashboardV3ViewModel$observeCache$2$emit$1 dashboardV3ViewModel$observeCache$2$emit$12 = dashboardV3ViewModel$observeCache$2$emit$1;
                Object obj = dashboardV3ViewModel$observeCache$2$emit$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dashboardV3ViewModel$observeCache$2$emit$12.label;
                zy11 zy11Var = zy11.a;
                sms0 sms0Var = null;
                d dVar2 = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    u8j0Var2.getClass();
                    s8j0 s8j0Var = u8j0Var2 instanceof s8j0 ? (s8j0) u8j0Var2 : null;
                    if (((s8j0Var != null ? s8j0Var.a : null) instanceof CacheMissException) && (i2 = dVar2.Q) > 0) {
                        dVar2.Q = i2 - 1;
                        dVar2.t0(((nmg) dVar2.X()).a);
                        return zy11Var;
                    }
                    dVar2.Q = 1;
                    d.d0(dVar2, u8j0Var2);
                    pz40 Y = dVar2.Y();
                    while (true) {
                        r0 r0Var = (r0) Y;
                        Object value = r0Var.getValue();
                        nmg nmgVar = (nmg) value;
                        ez8 ez8Var2 = (ez8) u8j0Var2.a();
                        if (r0Var.k(value, nmg.a(nmgVar, u8j0Var2, null, false, false, u8j0Var2 instanceof r8j0, false, false, ez8Var2 != null ? d.b0(dVar2, ez8Var2) : sms0Var, 5821))) {
                            break;
                        }
                        sms0Var = null;
                    }
                    ez8 ez8Var3 = (ez8) u8j0Var2.a();
                    if (ez8Var3 != null) {
                        aso asoVar = ez8Var3.e;
                        List list = asoVar != null ? (List) asoVar.a(((nmg) dVar2.X()).l) : null;
                        if (list == null) {
                            list = EmptyList.a;
                        }
                        aso asoVar2 = ez8Var3.g;
                        List list2 = asoVar2 != null ? (List) asoVar2.a(((nmg) dVar2.X()).l) : null;
                        dashboardV3ViewModel$observeCache$2$emit$12.L$0 = u8j0Var2;
                        dashboardV3ViewModel$observeCache$2$emit$12.L$1 = dVar2;
                        dashboardV3ViewModel$observeCache$2$emit$12.label = 1;
                        if (d.e0(dVar2, list, list2, dashboardV3ViewModel$observeCache$2$emit$12) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        dVar = dVar2;
                    }
                    ez8Var = (ez8) u8j0Var2.a();
                    if (ez8Var != null && (ye8Var = ez8Var.b) != null && (tw8Var = ye8Var.c) != null) {
                        dVar2.i0(tw8Var.g);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dVar = (d) dashboardV3ViewModel$observeCache$2$emit$12.L$1;
                u8j0Var2 = (u8j0) dashboardV3ViewModel$observeCache$2$emit$12.L$0;
                kotlin.b.b(obj);
                dVar.Z(qmg.a);
                ez8Var = (ez8) u8j0Var2.a();
                if (ez8Var != null) {
                    dVar2.i0(tw8Var.g);
                }
                return zy11Var;
            }
        }
        dashboardV3ViewModel$observeCache$2$emit$1 = new DashboardV3ViewModel$observeCache$2$emit$1(this, continuation);
        DashboardV3ViewModel$observeCache$2$emit$1 dashboardV3ViewModel$observeCache$2$emit$122 = dashboardV3ViewModel$observeCache$2$emit$1;
        Object obj2 = dashboardV3ViewModel$observeCache$2$emit$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dashboardV3ViewModel$observeCache$2$emit$122.label;
        zy11 zy11Var2 = zy11.a;
        sms0 sms0Var2 = null;
        d dVar22 = this.a;
        if (i != 0) {
        }
        dVar.Z(qmg.a);
        ez8Var = (ez8) u8j0Var2.a();
        if (ez8Var != null) {
        }
        return zy11Var2;
    }
}
