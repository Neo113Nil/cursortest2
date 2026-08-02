package com.yandex.go.payments_widgets.split;

import defpackage.cx51;
import defpackage.dx51;
import defpackage.evu0;
import defpackage.ex51;
import defpackage.jl40;
import defpackage.mv51;
import defpackage.mx51;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar, g gVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1 updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1;
        int i;
        mx51 mx51Var;
        String d;
        if (continuation instanceof UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1) {
            updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1 = (UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1) continuation;
            int i2 = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ex51 ex51Var = (ex51) obj;
                    if (ex51Var instanceof cx51) {
                        cx51 cx51Var = (cx51) ex51Var;
                        mv51 mv51Var = cx51Var.a;
                        String obj3 = evu0.k0(mv51Var.d()).toString();
                        String obj4 = evu0.k0(cx51Var.b.d()).toString();
                        String c = mv51Var.c();
                        if (c == null) {
                            c = mv51Var.b();
                        }
                        String obj5 = evu0.k0(c).toString();
                        mv51 mv51Var2 = cx51Var.c;
                        String obj6 = (mv51Var2 == null || (d = mv51Var2.d()) == null) ? null : evu0.k0(d).toString();
                        if (obj6 == null) {
                            obj6 = "";
                        }
                        mx51Var = new mx51(obj3, obj4, obj5, obj6, true, cx51Var.d, cx51Var.h.booleanValue());
                    } else {
                        if (!jl40.l(ex51Var, dx51.a)) {
                            w511.b();
                            return null;
                        }
                        mx51Var = mx51.h;
                    }
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$0 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$1 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$2 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$3 = null;
                    updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(mx51Var, updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1) == coroutineSingletons) {
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
        updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1 = new UpdateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1(this, continuation);
        Object obj22 = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYbSplitVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
