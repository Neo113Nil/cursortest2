package com.yandex.go.payments_widgets.yandex_bank;

import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import defpackage.evu0;
import defpackage.iw51;
import defpackage.jw51;
import defpackage.mv51;
import defpackage.nw51;
import defpackage.nx51;
import defpackage.ny61;
import defpackage.uv51;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar, j jVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        UpdateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1 updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1;
        int i;
        nx51 nx51Var;
        Object obj2;
        if (continuation instanceof UpdateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1) {
            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1 = (UpdateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1) continuation;
            int i2 = updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    nw51 nw51Var = (nw51) obj;
                    if (nw51Var instanceof jw51) {
                        Iterator it = ((jw51) nw51Var).c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            if (((uv51) obj2).d() == YbSdkPaymentMethodInfo$ProductType.WALLET) {
                                break;
                            }
                        }
                        uv51 uv51Var = (uv51) obj2;
                        mv51 a = uv51Var != null ? uv51Var.a() : null;
                        if (a != null) {
                            String obj4 = evu0.k0(a.d()).toString();
                            String c = a.c();
                            if (c == null) {
                                c = a.b();
                            }
                            nx51Var = new nx51(true, true, obj4, evu0.k0(c).toString());
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$0 = null;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$1 = null;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$2 = null;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$3 = null;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(nx51Var, updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        nx51Var = nx51.e;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$0 = null;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$1 = null;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$2 = null;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$3 = null;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(nx51Var, updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1) == coroutineSingletons) {
                        }
                    } else {
                        if (nw51Var instanceof iw51) {
                            nx51Var = nx51.f;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$0 = null;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$1 = null;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$2 = null;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$3 = null;
                            updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = 1;
                            if (this.a.emit(nx51Var, updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1) == coroutineSingletons) {
                            }
                        }
                        nx51Var = nx51.e;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$0 = null;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$1 = null;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$2 = null;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.L$3 = null;
                        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(nx51Var, updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1) == coroutineSingletons) {
                        }
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
        updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1 = new UpdateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1(this, continuation);
        Object obj32 = updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = updateYbVariablesInteractor$startUpdate$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
